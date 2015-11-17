package org.oep.ssomgt.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPublicKeySpec;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.codec.binary.Base64;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.upload.UploadRequest;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.sun.org.apache.xml.internal.security.exceptions.Base64DecodingException;

/**
 * Portlet implementation class RSAToolPortlet
 */
public class RSAToolPortlet extends MVCPortlet {
	private static int KEY_LENGTH = 512;
	private static Log _log = LogFactoryUtil.getLog(RSAToolPortlet.class);	
	private static String phpPublicKey;
	private static String dotNetPublicKey;
	
	private void uploadPHPFile(ResourceRequest resourceRequest,
            ResourceResponse resourceResponse) throws IOException {
        UploadRequest uploadRequest = PortalUtil.getUploadPortletRequest(resourceRequest);
        File objFile = uploadRequest.getFile("PHPFILE");
        String objFileName = uploadRequest.getFileName("PHPFILE");
        _log.info("objFile: [" + objFile + "], objFileName: [" + objFileName + "]");        

        InputStream is = new FileInputStream(objFile);
            
        byte[] buff = new byte[is.available()];
        is.read(buff);
        is.close();
        String publicKeyStr = new String(buff);
		resourceResponse.setContentType("text/html");
        PrintWriter writer = resourceResponse.getWriter();
        JSONObject jsonObject =  JSONFactoryUtil.createJSONObject();
        String[] arrStr = publicKeyStr.split("-----BEGIN PUBLIC KEY-----");
        publicKeyStr = arrStr[1];
        arrStr = publicKeyStr.split("-----END PUBLIC KEY-----");
        jsonObject.put("publicKey", arrStr[0]);
        phpPublicKey = arrStr[0];
        writer.print(jsonObject.toString());
        writer.flush();
        writer.close();
    }  	

	private void uploadDotNetFile(ResourceRequest resourceRequest,
            ResourceResponse resourceResponse) throws IOException {
        UploadRequest uploadRequest = PortalUtil.getUploadPortletRequest(resourceRequest);
        File objFile = uploadRequest.getFile("DOTNETFILE");
        String objFileName = uploadRequest.getFileName("DOTNETFILE");
        _log.info("objFile: [" + objFile + "], objFileName: [" + objFileName + "]");        

        InputStream is = new FileInputStream(objFile);
            
        byte[] buff = new byte[is.available()];
        is.read(buff);
        is.close();
		resourceResponse.setContentType("text/html");
        PrintWriter writer = resourceResponse.getWriter();
        JSONObject jsonObject =  JSONFactoryUtil.createJSONObject();
        
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
	        Document doc = dBuilder.parse(objFile);
	        doc.getDocumentElement().normalize();
	        NodeList nListModulus = doc.getElementsByTagName("Modulus");
	        Node nModulus = nListModulus.item(0);
	        NodeList nListExponent = doc.getElementsByTagName("Exponent");
	        Node nExponent = nListExponent.item(0);
	        byte[] modulusBytes = com.sun.org.apache.xml.internal.security.utils.Base64.decode(nModulus.getTextContent());
	        byte[] exponentBytes = com.sun.org.apache.xml.internal.security.utils.Base64.decode(nExponent.getTextContent());
	        BigInteger modulus = new BigInteger(1, modulusBytes );
	        BigInteger exponent = new BigInteger(1, exponentBytes);

	        RSAPublicKeySpec rsaPubKey = new RSAPublicKeySpec(modulus, exponent);
	        KeyFactory fact = KeyFactory.getInstance("RSA");
	        PublicKey pubKey = fact.generatePublic(rsaPubKey);
	        dotNetPublicKey = Base64.encodeBase64String(pubKey.getEncoded());
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Base64DecodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DOMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidKeySpecException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        writer.print(jsonObject.toString());
        writer.flush();
        writer.close();
    }  	
	
	@Override
    public void serveResource(ResourceRequest resourceRequest,
            ResourceResponse resourceResponse) throws IOException,
            PortletException {
		String resourceId = resourceRequest.getResourceID();
        _log.info(resourceId);
        System.out.println("Resource ID: " + resourceId);
        if(resourceId != null && resourceId.equals("UPLOADPHP_FILE")){
            uploadPHPFile(resourceRequest, resourceResponse);
        }	
        else if (resourceId != null && resourceId.equals("PHPPUBLICKEY")) {
    		resourceResponse.setContentType("text/html");
            PrintWriter writer = resourceResponse.getWriter();
            JSONObject jsonObject =  JSONFactoryUtil.createJSONObject();
            jsonObject.put("publicKey", phpPublicKey);
            writer.print(jsonObject.toString());
            writer.flush();
            writer.close();          	        	
        }
        else if(resourceId != null && resourceId.equals("UPLOADDOTNET_FILE")){
            uploadDotNetFile(resourceRequest, resourceResponse);
        }	
        else if (resourceId != null && resourceId.equals("DOTNETPUBLICKEY")) {
    		resourceResponse.setContentType("text/html");
            PrintWriter writer = resourceResponse.getWriter();
            JSONObject jsonObject =  JSONFactoryUtil.createJSONObject();
            jsonObject.put("publicKey", dotNetPublicKey);
            writer.print(jsonObject.toString());
            writer.flush();
            writer.close();          	        	
        }        
        else {
    		resourceResponse.setContentType("text/html");
            PrintWriter writer = resourceResponse.getWriter();
            JSONObject jsonObject =  JSONFactoryUtil.createJSONObject();
    		
    	    try {
    	    	final KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
    	        keyGen.initialize(KEY_LENGTH);
    	        final KeyPair key = keyGen.generateKeyPair();
    	        jsonObject.put("publicKey", Base64.encodeBase64String(key.getPublic().getEncoded()));
    	        jsonObject.put("privateKey", Base64.encodeBase64String(key.getPrivate().getEncoded()));
    	    } catch (Exception e) {
    	    	e.printStackTrace();
    	    }
            writer.print(jsonObject.toString());
            writer.flush();
            writer.close();          	
        }
        super.serveResource(resourceRequest, resourceResponse);
    }
}
