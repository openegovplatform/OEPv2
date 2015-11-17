/**
 * Copyright (c) 2015 by Open eGovPlatform (http://http://openegovplatform.org/).
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

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
 * Portlet implementation class ApplicationVerticalMenuPortlet
 */
public class ApplicationVerticalMenuPortlet extends MVCPortlet {
 
	 @Override
     public void serveResource(ResourceRequest resourceRequest,
                             ResourceResponse resourceResponse)
                 throws  IOException, PortletException {
		 try {
			 long editId = ParamUtil.getLong(resourceRequest, ApplicationKeys.AddEditAttributes.EDIT_ID);
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
