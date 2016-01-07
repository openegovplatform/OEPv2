package org.oep.ssomgt.action;

import java.io.IOException;
import java.io.OutputStream;
import java.sql.Blob;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.oep.ssomgt.model.Application;
import org.oep.ssomgt.service.ApplicationLocalServiceUtil;

import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class MyDashboardPortlet
 */
public class MyDashboardPortlet extends MVCPortlet {
 
	 @Override
     public void serveResource(ResourceRequest resourceRequest,
                             ResourceResponse resourceResponse)
                 throws  IOException, PortletException {
		 try {
			 long editId = ParamUtil.getLong(resourceRequest, "applicationId");
             String iconType = ParamUtil.getString(resourceRequest, "icon", PortletKeys.TEXT_BOX);
             Application application = ApplicationLocalServiceUtil.getApplication(editId);
             if (application != null) {
            	 if ("smallIcon".equals(iconType)) {
            		 Blob image = application.getAppSmallIcon();
                     byte[ ] imgData = image.getBytes(1, (int)image.length());
                     resourceResponse.setContentType("image/jpg");
                     OutputStream o = resourceResponse.getPortletOutputStream();
                     o.write(imgData);
                     o.flush();
                     o.close();
                 }
            	 else {
            		 Blob image = application.getAppBigIcon();
                     byte[ ] imgData = image.getBytes(1, (int)image.length());
                     resourceResponse.setContentType("image/jpg");
                     OutputStream o = resourceResponse.getPortletOutputStream();
                     o.write(imgData);
                     o.flush();
                     o.close();            		 
            	 }
             }
		 }
         catch (Exception e) {
        	 //_log.error(e);
         }
     }	

}
