/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package org.oep.ssomgt.app.service.impl;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Date;
import java.util.List;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.encoders.Base64;
import org.oep.ssomgt.NoSuchApplicationException;
import org.oep.ssomgt.app.service.base.SSOAppServiceBaseImpl;
import org.oep.ssomgt.model.Application;
import org.oep.ssomgt.model.UserSync;
import org.oep.ssomgt.service.AppMessageLocalServiceUtil;
import org.oep.ssomgt.service.ApplicationLocalServiceUtil;
import org.oep.ssomgt.service.UserSyncLocalServiceUtil;
import org.oep.ssomgt.util.SecurityUtil;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.model.User;
import com.liferay.portal.security.ac.AccessControlled;
import com.liferay.portal.service.UserLocalServiceUtil;

/**
 * The implementation of the s s o app remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.ssomgt.app.service.SSOAppService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author trungdk
 * @see org.oep.ssomgt.app.service.base.SSOAppServiceBaseImpl
 * @see org.oep.ssomgt.app.service.SSOAppServiceUtil
 */
@JSONWebService("sso")
public class SSOAppServiceImpl extends SSOAppServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.ssomgt.app.service.SSOAppServiceUtil} to access the s s o app remote service.
	 */
	@JSONWebService("newMessage")
	@AccessControlled(guestAccessEnabled=true)
	public String newMessage(String appCode, String appPin, Date createDate, String toUser, String messageType, String messageCode, String messageText, String messageValue, String messageUrl, String signature) throws SystemException, PortalException {
		Application app = ApplicationLocalServiceUtil.getByAppCode(appCode);
		JSONObject jsonObj = JSONFactoryUtil.createJSONObject();
		if (app == null) {
			jsonObj.put("success", false);
			jsonObj.put("errorCode", 1);
			return jsonObj.toString();
		}
		else if (!app.getAppPin().equals(appPin)) {
			jsonObj.put("success", false);
			jsonObj.put("errorCode", 2);
			return jsonObj.toString();
		}
		
        KeyFactory kFactory;
        boolean verify = false;
		try {
			kFactory = KeyFactory.getInstance("RSA", new BouncyCastleProvider());
	        // decode base64 of your key
	        byte yourKey[] =  Base64.decode(app.getPublicKey());
	        X509EncodedKeySpec spec =  new X509EncodedKeySpec(yourKey);
	        PublicKey publicKey = (PublicKey) kFactory.generatePublic(spec);
	        Signature sig = Signature.getInstance("SHA256withRSA");
	        sig.initVerify(publicKey);
	        System.out.println("Message: " + messageText);
	        sig.update(messageText.getBytes());
	        System.out.println("Signature: " + signature);
	        verify = sig.verify(Base64.decode(signature));
	        if (!verify) {
	        	jsonObj.put("success", false);
	        	jsonObj.put("errorCode", 4);
	        	return jsonObj.toString();
	        }
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			jsonObj.put("success", false);
			jsonObj.put("errorCode", 3);
			return jsonObj.toString();
		} catch (InvalidKeySpecException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			jsonObj.put("success", false);
			jsonObj.put("errorCode", 3);
			return jsonObj.toString();
		} catch (InvalidKeyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			jsonObj.put("success", false);
			jsonObj.put("errorCode", 3);
			return jsonObj.toString();
		} catch (SignatureException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			jsonObj.put("success", false);
			jsonObj.put("errorCode", 3);
			return jsonObj.toString();
		}
		
		try {
			AppMessageLocalServiceUtil.addAppMessage(app.getUserId(), appCode, createDate, toUser, messageType, messageCode, messageText, messageValue, messageUrl);
			jsonObj.put("success", true);
		}
		catch (Exception ex) {
			ex.printStackTrace();
			jsonObj.put("success", false);
			jsonObj.put("errorCode", 3);
			return jsonObj.toString();
		}
				
		return jsonObj.toString();
	}

	@JSONWebService(value="ping")
	@AccessControlled(guestAccessEnabled=true)
	public String ping(String app, String pin) throws SystemException {
		JSONObject jsonObj = JSONFactoryUtil.createJSONObject();
		Application checkApp = null;
		try {
			checkApp = ApplicationLocalServiceUtil.getByAppCode(app);
		} catch (NoSuchApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			jsonObj.put("success", false);
			jsonObj.put("errorCode", 1);
			return jsonObj.toString();
		}
		
		if (checkApp != null) {
			if (!checkApp.getAppPin().equals(pin)) {
				jsonObj.put("success", false);
				jsonObj.put("errorCode", 2);
				return jsonObj.toString();				
			}
		}
		Application application = ApplicationLocalServiceUtil.ping(app, pin);
		if (application == null) {
			jsonObj.put("success", false);
			jsonObj.put("errorCode", 3);
		}
		else {
			jsonObj.put("success", true);
		}
		
		return jsonObj.toString();
	}

	@JSONWebService(value="syncDateAccounts")
	@AccessControlled(guestAccessEnabled=true)
	public String syncDateAccounts(String appCode, String pin, Date checkpoint) {
		CacheRegistryUtil.clear();
		JSONObject resObj = JSONFactoryUtil.createJSONObject();
		
		JSONArray accounts = JSONFactoryUtil.createJSONArray();
		Application app = null;
		String aesKey = SecurityUtil.randomKeyBase64();

		try {
			app = ApplicationLocalServiceUtil.getByAppCode(appCode);
			if (app == null) {
				return resObj.toString();
			}
			else if (!app.getAppPin().equals(pin)) {
				resObj.put("success", false);
				resObj.put("errorCode", 3);
				return resObj.toString();
			}

			List<UserSync> lstSyncs = UserSyncLocalServiceUtil.findByApplicationCheckPoint(app.getApplicationId(), checkpoint);
	        KeyFactory kFactory;
	        Cipher cipher = null;
			try {
				kFactory = KeyFactory.getInstance("RSA", new BouncyCastleProvider());
		        // decode base64 of your key
		        byte yourKey[] =  Base64.decode(app.getPublicKey());
		        X509EncodedKeySpec spec =  new X509EncodedKeySpec(yourKey);
		        PublicKey publicKey = (PublicKey) kFactory.generatePublic(spec);
		        //Cipher cipher = Cipher.getInstance("RSA");
		        cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
		        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
		        //resObj.put("success", true);
		        //return new String(Base64.encode(cipherData));
			} catch (NoSuchAlgorithmException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				resObj.put("success", false);
				resObj.put("errorCode", 2);
				return resObj.toString();
			} catch (InvalidKeySpecException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchPaddingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				resObj.put("success", false);
				resObj.put("errorCode", 2);
				return resObj.toString();
			} catch (InvalidKeyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				resObj.put("success", false);
				resObj.put("errorCode", 2);
				return resObj.toString();
			}

			byte[] cipherData = null;
	        try {
				cipherData = cipher.doFinal(Base64.decode(aesKey));
				resObj.put("key", new String(Base64.encode(cipherData)));
	        } catch (IllegalBlockSizeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				resObj.put("success", false);
				resObj.put("errorCode", 2);
				return resObj.toString();
			} catch (BadPaddingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				resObj.put("success", false);
				resObj.put("errorCode", 2);
				return resObj.toString();
			}
			
			for (UserSync us : lstSyncs) {
				User user = UserLocalServiceUtil.getUser(us.getUserId());
				JSONObject account = JSONFactoryUtil.createJSONObject();

				account.put("ssousername", us.getSsoUserName());
				account.put("appusername", us.getAppUserName());
				account.put("fullname", us.getFullName());
				account.put("accessiblestatus", us.getAccessibleStatus());
				account.put("email", user.getEmailAddress());
				account.put("password", user.getPassword());
				account.put("checkpoint", us.getCheckpoint().getTime() / 1000);
				account.put("roles", us.getRoles());
				accounts.put(account);
			}
		} catch (NoSuchApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resObj.put("success", false);
			resObj.put("errorCode", 1);
			return resObj.toString();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resObj.put("success", false);
			resObj.put("errorCode", 1);
			return resObj.toString();
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resObj.put("success", false);
			resObj.put("errorCode", 1);
			return resObj.toString();
		}

		String text = accounts.toString();
		System.out.println("Accounts: " + text);
		resObj.put("success", true);
		resObj.put("data", SecurityUtil.encrypt(text, new String(Base64.decode(aesKey))));
		return resObj.toString();
	}

	@JSONWebService(value="syncAccounts")
	@AccessControlled(guestAccessEnabled=true)
	public String syncAccounts(String appCode, String pin, long timestamp) {
		CacheRegistryUtil.clear();
		JSONObject resObj = JSONFactoryUtil.createJSONObject();
		
		JSONArray accounts = JSONFactoryUtil.createJSONArray();
		Date checkpoint = new Date(timestamp);
		Application app = null;

		Key aesKey = SecurityUtil.randomKey();
		
		try {
			app = ApplicationLocalServiceUtil.getByAppCode(appCode);
			if (app == null) {
				return resObj.toString();
			}
			else if (!app.getAppPin().equals(pin)) {
				resObj.put("success", false);
				resObj.put("errorCode", 3);
				return resObj.toString();
			}

			List<UserSync> lstSyncs = UserSyncLocalServiceUtil.findByApplicationCheckPoint(app.getApplicationId(), checkpoint);
	        KeyFactory kFactory;
	        Cipher cipher = null;
			try {
				kFactory = KeyFactory.getInstance("RSA", new BouncyCastleProvider());
		        // decode base64 of your key
		        byte yourKey[] =  Base64.decode(app.getPublicKey());
		        X509EncodedKeySpec spec =  new X509EncodedKeySpec(yourKey);
		        PublicKey publicKey = (PublicKey) kFactory.generatePublic(spec);
		        //Cipher cipher = Cipher.getInstance("RSA");
		        cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
		        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
		        //resObj.put("success", true);
		        //return new String(Base64.encode(cipherData));
			} catch (NoSuchAlgorithmException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				resObj.put("success", false);
				resObj.put("errorCode", 2);
				return resObj.toString();
			} catch (InvalidKeySpecException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchPaddingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				resObj.put("success", false);
				resObj.put("errorCode", 2);
				return resObj.toString();
			} catch (InvalidKeyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				resObj.put("success", false);
				resObj.put("errorCode", 2);
				return resObj.toString();
			}

			byte[] cipherData = null;
	        try {
				cipherData = cipher.doFinal(aesKey.getEncoded());
				resObj.put("key", Base64.toBase64String(cipherData));
	        } catch (IllegalBlockSizeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				resObj.put("success", false);
				resObj.put("errorCode", 2);
				return resObj.toString();
			} catch (BadPaddingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				resObj.put("success", false);
				resObj.put("errorCode", 2);
				return resObj.toString();
			}
			
			for (UserSync us : lstSyncs) {
				User user = UserLocalServiceUtil.getUser(us.getUserId());
				JSONObject account = JSONFactoryUtil.createJSONObject();

				account.put("ssousername", us.getSsoUserName());
				account.put("appusername", us.getAppUserName());
				account.put("fullname", us.getFullName());
				account.put("accessiblestatus", us.getAccessibleStatus());
				account.put("email", user.getEmailAddress());
				account.put("password", user.getPassword());
				account.put("checkpoint", us.getCheckpoint().getTime() / 1000);
				account.put("roles", us.getRoles());
				accounts.put(account);
			}
		} catch (NoSuchApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resObj.put("success", false);
			resObj.put("errorCode", 1);
			return resObj.toString();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resObj.put("success", false);
			resObj.put("errorCode", 1);
			return resObj.toString();
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resObj.put("success", false);
			resObj.put("errorCode", 1);
			return resObj.toString();
		}

		String text = accounts.toString();
		System.out.println("Accounts: " + text);
		resObj.put("success", true);
		resObj.put("data", SecurityUtil.encrypt(text, aesKey));
		return resObj.toString();
	}

	
	@JSONWebService(value="unsecuredSyncDateAccounts")
	@AccessControlled(guestAccessEnabled=true)
	public String unsecuredSyncDateAccounts(String appCode, String pin, Date checkpoint) {
		CacheRegistryUtil.clear();
		JSONObject resObj = JSONFactoryUtil.createJSONObject();
		
		JSONArray accounts = JSONFactoryUtil.createJSONArray();
		Application app = null;
		try {
			app = ApplicationLocalServiceUtil.getByAppCode(appCode);
			if (app == null) {
				return resObj.toString();
			}
			else if (!app.getAppPin().equals(pin)) {
				resObj.put("success", false);
				resObj.put("errorCode", 3);
				return resObj.toString();
			}

			List<UserSync> lstSyncs = UserSyncLocalServiceUtil.findByApplicationCheckPoint(app.getApplicationId(), checkpoint);
			for (UserSync us : lstSyncs) {
				User user = UserLocalServiceUtil.getUser(us.getUserId());
				JSONObject account = JSONFactoryUtil.createJSONObject();

				account.put("ssousername", us.getSsoUserName());
				account.put("appusername", us.getAppUserName());
				account.put("fullname", us.getFullName());
				account.put("accessiblestatus", us.getAccessibleStatus());
				account.put("email", user.getEmailAddress());
				account.put("password", user.getPassword());
				account.put("checkpoint", us.getCheckpoint().getTime() / 1000);
				account.put("roles", us.getRoles());
				accounts.put(account);
			}
		} catch (NoSuchApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resObj.put("success", false);
			resObj.put("errorCode", 1);
			return resObj.toString();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resObj.put("success", false);
			resObj.put("errorCode", 1);
			return resObj.toString();
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resObj.put("success", false);
			resObj.put("errorCode", 1);
			return resObj.toString();
		}

		String text = accounts.toString();
		System.out.println("Accounts: " + text);
		resObj.put("success", true);
		resObj.put("data", accounts);
		return resObj.toString();
	}

	@JSONWebService(value="unsecuredSyncAccounts")
	@AccessControlled(guestAccessEnabled=true)
	public String unsecuredSyncAccounts(String appCode, String pin, long timestamp) {
		CacheRegistryUtil.clear();
		JSONObject resObj = JSONFactoryUtil.createJSONObject();
		
		JSONArray accounts = JSONFactoryUtil.createJSONArray();
		Date checkpoint = new Date(timestamp);
		Application app = null;
		try {
			app = ApplicationLocalServiceUtil.getByAppCode(appCode);
			if (app == null) {
				return resObj.toString();
			}
			else if (!app.getAppPin().equals(pin)) {
				resObj.put("success", false);
				resObj.put("errorCode", 3);
				return resObj.toString();
			}

			List<UserSync> lstSyncs = UserSyncLocalServiceUtil.findByApplicationCheckPoint(app.getApplicationId(), checkpoint);
			for (UserSync us : lstSyncs) {
				User user = UserLocalServiceUtil.getUser(us.getUserId());
				JSONObject account = JSONFactoryUtil.createJSONObject();

				account.put("ssousername", us.getSsoUserName());
				account.put("appusername", us.getAppUserName());
				account.put("fullname", us.getFullName());
				account.put("accessiblestatus", us.getAccessibleStatus());
				account.put("email", user.getEmailAddress());
				account.put("password", user.getPassword());
				account.put("checkpoint", us.getCheckpoint().getTime() / 1000);
				account.put("roles", us.getRoles());
				accounts.put(account);
			}
		} catch (NoSuchApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resObj.put("success", false);
			resObj.put("errorCode", 1);
			return resObj.toString();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resObj.put("success", false);
			resObj.put("errorCode", 1);
			return resObj.toString();
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resObj.put("success", false);
			resObj.put("errorCode", 1);
			return resObj.toString();
		}

		String text = accounts.toString();
		System.out.println("Accounts: " + text);
		resObj.put("success", true);
		resObj.put("data", accounts);
		return resObj.toString();
	}
	
}