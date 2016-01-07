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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.oep.ssomgt.AppCodeRangeLengthException;
import org.oep.ssomgt.AppNameRangeLengthException;
import org.oep.ssomgt.AppPinRangeLengthException;
import org.oep.ssomgt.AppUrlRangeLengthException;
import org.oep.ssomgt.DuplicateAppCodeException;
import org.oep.ssomgt.PublicKeyRangeLengthException;
import org.oep.ssomgt.model.Application;
import org.oep.ssomgt.service.ApplicationLocalServiceUtil;

import com.liferay.portal.kernel.dao.jdbc.OutputBlob;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.upload.UploadRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextThreadLocal;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class ApplicationManagementPortlet
 */
public class ApplicationManagementPortlet extends MVCPortlet {

	private void validateParamsIntoSessionError(UploadRequest request, ActionRequest outRequest) {		
		String appName = ParamUtil.getString(request, ApplicationKeys.AddEditAttributes.APP_NAME, PortletKeys.TEXT_BOX);
		String appCode = ParamUtil.getString(request, ApplicationKeys.AddEditAttributes.APP_CODE, PortletKeys.TEXT_BOX);
		String appPin = ParamUtil.getString(request, ApplicationKeys.AddEditAttributes.APP_PIN, PortletKeys.TEXT_BOX);
		String appUrl = ParamUtil.getString(request, ApplicationKeys.AddEditAttributes.APP_URL, PortletKeys.TEXT_BOX);
		String publicKey = ParamUtil.getString(request, ApplicationKeys.AddEditAttributes.PUBLICKEY, PortletKeys.TEXT_BOX);
		
		Long editId = ParamUtil.getLong(request, ApplicationKeys.AddEditAttributes.EDIT_ID, PortletKeys.LONG_DEFAULT);
		
		try {
			ApplicationLocalServiceUtil.validate(editId, appCode, appName, appPin, appUrl, publicKey);
		}
		catch (DuplicateAppCodeException dae) {
			SessionErrors.add(outRequest, ApplicationKeys.ErrorMessageKeys.ORG_OEP_SSOMGT_PORTLET_APPLICATIONMANAGEMENT_APPCODE);
		}
		catch (AppCodeRangeLengthException acr) {
			SessionErrors.add(outRequest, ApplicationKeys.ErrorMessageKeys.ORG_OEP_SSOMGT_PORTLET_APPLICATIONMANAGEMENT_APPCODE);			
		}
		catch (AppNameRangeLengthException anr) {
			SessionErrors.add(outRequest, ApplicationKeys.ErrorMessageKeys.ORG_OEP_SSOMGT_PORTLET_APPLICATIONMANAGEMENT_APPNAME);			
		}
		catch (AppPinRangeLengthException apr) {
			SessionErrors.add(outRequest, ApplicationKeys.ErrorMessageKeys.ORG_OEP_SSOMGT_PORTLET_APPLICATIONMANAGEMENT_APPPIN);						
		}
		catch (AppUrlRangeLengthException aur) {
			SessionErrors.add(outRequest, ApplicationKeys.ErrorMessageKeys.ORG_OEP_SSOMGT_PORTLET_APPLICATIONMANAGEMENT_APPURL);									
		}
		catch (PublicKeyRangeLengthException pkr) {
			SessionErrors.add(outRequest, ApplicationKeys.ErrorMessageKeys.ORG_OEP_SSOMGT_PORTLET_APPLICATIONMANAGEMENT_PUBLICKEY);												
		}
	}
	
	public void addEditApplication(ActionRequest request, ActionResponse response) throws SystemException, PortalException, IOException {
		UploadRequest uploadRequest = PortalUtil.getUploadPortletRequest(request);
		validateParamsIntoSessionError(uploadRequest, request);
	
		String appName = null;
		String appCode = null;
		String appPin = null;
		String appUrl = null;
		String publicKey = null;
		
		if (SessionErrors.isEmpty(request)) {
			ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();
			appName = ParamUtil.getString(uploadRequest, ApplicationKeys.AddEditAttributes.APP_NAME, PortletKeys.TEXT_BOX);
			appCode = ParamUtil.getString(uploadRequest, ApplicationKeys.AddEditAttributes.APP_CODE, PortletKeys.TEXT_BOX);
			appPin = ParamUtil.getString(uploadRequest, ApplicationKeys.AddEditAttributes.APP_PIN, PortletKeys.TEXT_BOX);
			appUrl = ParamUtil.getString(uploadRequest, ApplicationKeys.AddEditAttributes.APP_URL, PortletKeys.TEXT_BOX);
			publicKey = ParamUtil.getString(uploadRequest, ApplicationKeys.AddEditAttributes.PUBLICKEY, PortletKeys.TEXT_BOX);
			
			Long editId = ParamUtil.getLong(uploadRequest, ApplicationKeys.AddEditAttributes.EDIT_ID, PortletKeys.LONG_DEFAULT);
			OutputBlob bigIconBlob = null;
			OutputBlob smallIconBlob = null;
			try {
				File bigIconFile = uploadRequest.getFile(ApplicationKeys.AddEditAttributes.APP_BIGICON);
				File smallIconFile = uploadRequest.getFile(ApplicationKeys.AddEditAttributes.APP_SMALLICON);
				InputStream bigIconStream = new FileInputStream(bigIconFile);
				InputStream smallIconStream = new FileInputStream(smallIconFile);				
				bigIconBlob = new OutputBlob(bigIconStream, bigIconFile.length());
				smallIconBlob = new OutputBlob(smallIconStream, smallIconFile.length());
			}
			catch (NullPointerException ex) {
				SessionErrors.add(request, ApplicationKeys.ErrorMessageKeys.ORG_OEP_SSOMGT_PORTLET_APPLICATIONMANAGEMENT_APPICONNULL);							
			}
			catch (FileNotFoundException ex) {
				
			}
			
			Date pingTime = new Date();
			if (editId == PortletKeys.LONG_DEFAULT) {
				if (smallIconBlob != null && bigIconBlob != null) {
					ApplicationLocalServiceUtil.addApplication(appCode, appName, appPin, appUrl, bigIconBlob, smallIconBlob, pingTime, publicKey, serviceContext);					
					SessionMessages.add(request, ApplicationKeys.SuccessMessageKeys.ORG_OEP_SSOMGT_PORTLET_APPLICATION_SUCCESS_ADDNEW);	
				}
				else {
					ApplicationLocalServiceUtil.addApplication(appCode, appName, appPin, appUrl, pingTime, publicKey, serviceContext);
					SessionMessages.add(request, ApplicationKeys.SuccessMessageKeys.ORG_OEP_SSOMGT_PORTLET_APPLICATION_SUCCESS_ADDNEW);	
				}
			} else {
				Application application = ApplicationLocalServiceUtil.getApplication(editId);
				if (smallIconBlob != null) {
					application.setAppSmallIcon(smallIconBlob);
				}
				if (bigIconBlob != null) {
					application.setAppBigIcon(bigIconBlob);
				}
				application.setAppCode(appCode);
				application.setAppPin(appPin);
				application.setAppUrl(appUrl);
				application.setPingTime(pingTime);
				
				ApplicationLocalServiceUtil.updateApplication(application, serviceContext);
				SessionMessages.add(request, ApplicationKeys.SuccessMessageKeys.ORG_OEP_SSOMGT_PORTLET_APPLICATION_SUCCESS_UPDATE);	
			}
		}
		SessionMessages.add(request, PortalUtil.getPortletId(request) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE); 		
		if (!SessionErrors.isEmpty(request)) {
			appName = ParamUtil.getString(uploadRequest, ApplicationKeys.AddEditAttributes.APP_NAME, PortletKeys.TEXT_BOX);
			appCode = ParamUtil.getString(uploadRequest, ApplicationKeys.AddEditAttributes.APP_CODE, PortletKeys.TEXT_BOX);
			appPin = ParamUtil.getString(uploadRequest, ApplicationKeys.AddEditAttributes.APP_PIN, PortletKeys.TEXT_BOX);
			appUrl = ParamUtil.getString(uploadRequest, ApplicationKeys.AddEditAttributes.APP_URL, PortletKeys.TEXT_BOX);
			response.setRenderParameter(ApplicationKeys.AddEditAttributes.APP_NAME, appName);
			response.setRenderParameter(ApplicationKeys.AddEditAttributes.APP_CODE, appCode);
			response.setRenderParameter(ApplicationKeys.AddEditAttributes.APP_PIN, appPin);
			response.setRenderParameter(ApplicationKeys.AddEditAttributes.APP_URL, appUrl);
			
			PortalUtil.copyRequestParameters(request, response);
		} else {
			response.sendRedirect(ParamUtil.getString(request, PortletKeys.REDIRECT_PAGE));
		}
	}

	public void deleteApplication(ActionRequest request, ActionResponse response) throws PortalException, SystemException, IOException {
		long deleteId = ParamUtil.getLong(request, ApplicationKeys.BaseApplicationAttributes.DELETE_ID, PortletKeys.LONG_DEFAULT);
		
		try {
			ApplicationLocalServiceUtil.removeApplication(deleteId);
			SessionMessages.add(request, ApplicationKeys.SuccessMessageKeys.ORG_OEP_SSOMGT_PORTLET_APPLICATION_SUCCESS_DELETE);
		}
		catch (Exception ex) {
			SessionMessages.add(request, ApplicationKeys.ErrorMessageKeys.ORG_OEP_SSOMGT_PORTLET_APPLICATIONMANAGEMENT_ERROR_DELETE);			
		}
		response.sendRedirect(ParamUtil.getString(request, PortletKeys.REDIRECT_PAGE));
	}

	public void upApplication(ActionRequest request, ActionResponse response) throws PortalException, SystemException, IOException {
		long editId = ParamUtil.getLong(request, ApplicationKeys.BaseApplicationAttributes.EDIT_ID, PortletKeys.LONG_DEFAULT);
		
		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();
		Application app = ApplicationLocalServiceUtil.getApplication(editId);
		ApplicationLocalServiceUtil.up(app, serviceContext);
		response.sendRedirect(ParamUtil.getString(request, PortletKeys.REDIRECT_PAGE));
	}

	public void downApplication(ActionRequest request, ActionResponse response) throws PortalException, SystemException, IOException {
		long editId = ParamUtil.getLong(request, ApplicationKeys.BaseApplicationAttributes.EDIT_ID, PortletKeys.LONG_DEFAULT);
		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Application app = ApplicationLocalServiceUtil.getApplication(editId);
		ApplicationLocalServiceUtil.down(app, serviceContext);
				
		response.sendRedirect(ParamUtil.getString(request, PortletKeys.REDIRECT_PAGE));
	}
	
	public void editApplication(ActionRequest request, ActionResponse response) throws PortalException, SystemException, IOException {
		long editId = ParamUtil.getLong(request, ApplicationKeys.BaseApplicationAttributes.EDIT_ID, PortletKeys.LONG_DEFAULT);
		
		Application application = ApplicationLocalServiceUtil.getApplication(editId);
		setParameterIntoResponse(response, application);
		
		if (!SessionErrors.isEmpty(request)) {
			response.sendRedirect(ParamUtil.getString(request, PortletKeys.REDIRECT_PAGE));
		} else {
			PortalUtil.copyRequestParameters(request, response);
		}
	}
	
	private void setParameterIntoResponse(ActionResponse response, Application application) {
		response.setRenderParameter(ApplicationKeys.BaseApplicationAttributes.EDIT_ID, String.valueOf(application.getApplicationId()));
		response.setRenderParameter(ApplicationKeys.AddEditAttributes.APP_NAME, String.valueOf(application.getAppName()));
		response.setRenderParameter(ApplicationKeys.AddEditAttributes.APP_CODE, String.valueOf(application.getAppCode()));
		response.setRenderParameter(ApplicationKeys.AddEditAttributes.APP_PIN, String.valueOf(application.getAppPin()));
		response.setRenderParameter(ApplicationKeys.AddEditAttributes.APP_URL, String.valueOf(application.getAppUrl()));
		response.setRenderParameter(ApplicationKeys.AddEditAttributes.PUBLICKEY, String.valueOf(application.getPublicKey()));
	}
	
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
                     byte[] imgData = image.getBytes(1, (int)image.length());
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
