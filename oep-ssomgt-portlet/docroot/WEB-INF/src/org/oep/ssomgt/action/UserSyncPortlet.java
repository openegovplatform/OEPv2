package org.oep.ssomgt.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.oep.ssomgt.model.UserSync;
import org.oep.ssomgt.service.UserSyncLocalServiceUtil;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class UserSyncPortlet
 */
public class UserSyncPortlet extends MVCPortlet {
	public void addEditUserSync(ActionRequest request, ActionResponse response) throws SystemException, PortalException, IOException {
		if (SessionErrors.isEmpty(request)) {
			String appUserName = ParamUtil.getString(request, UserSyncKeys.AddEditAttributes.APP_USERNAME, PortletKeys.TEXT_BOX);
						
			Long editId = ParamUtil.getLong(request, UserSyncKeys.AddEditAttributes.EDIT_ID, PortletKeys.LONG_DEFAULT);
			if (editId == PortletKeys.LONG_DEFAULT) {
			} else {
				UserSync userSync = UserSyncLocalServiceUtil.getUserSync(editId);
				userSync.setAppUserName(appUserName);
				userSync.setCheckpoint(new Date());
				UserSyncLocalServiceUtil.updateUserSync(userSync);
			}
		}
		SessionMessages.add(request, PortalUtil.getPortletId(request) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE); 		
		if (!SessionErrors.isEmpty(request)) {
			PortalUtil.copyRequestParameters(request, response);
		} else {
			response.sendRedirect(ParamUtil.getString(request, PortletKeys.REDIRECT_PAGE));
		}
	} 

	public void viewUserSync(ActionRequest request, ActionResponse response) throws PortalException, SystemException, IOException {
		long editId = ParamUtil.getLong(request, UserSyncKeys.BaseUserSyncAttributes.EDIT_ID, PortletKeys.LONG_DEFAULT);
		
		UserSync userSync = UserSyncLocalServiceUtil.getUserSync(editId);
		setParameterIntoResponse(response, userSync);
		
		if (!SessionErrors.isEmpty(request)) {
			response.sendRedirect(ParamUtil.getString(request, PortletKeys.REDIRECT_PAGE));
		} else {
			PortalUtil.copyRequestParameters(request, response);
		}
	}
	
	public void changeMapping(ActionRequest request, ActionResponse response) throws PortalException, SystemException, IOException {
		long editId = ParamUtil.getLong(request, UserSyncKeys.BaseUserSyncAttributes.EDIT_ID, PortletKeys.LONG_DEFAULT);
		
		UserSync userSync = UserSyncLocalServiceUtil.getUserSync(editId);
		setParameterIntoResponse(response, userSync);
		
		if (!SessionErrors.isEmpty(request)) {
			response.sendRedirect(ParamUtil.getString(request, PortletKeys.REDIRECT_PAGE));
		} else {
			PortalUtil.copyRequestParameters(request, response);
		}
	}
	
	private void setParameterIntoResponse(ActionResponse response, UserSync userSync) {
		response.setRenderParameter(UserSyncKeys.AddEditAttributes.EDIT_ID, String.valueOf(userSync.getUserSyncId()));
		response.setRenderParameter(UserSyncKeys.AddEditAttributes.APPLICATION_ID, String.valueOf(userSync.getApplicationId()));
		response.setRenderParameter(UserSyncKeys.AddEditAttributes.EMAIL, String.valueOf(userSync.getEmail()));
		response.setRenderParameter(UserSyncKeys.AddEditAttributes.APP_USERNAME, userSync.getAppUserName());
		response.setRenderParameter(UserSyncKeys.AddEditAttributes.EMPLOYEE_ID, String.valueOf(userSync.getEmployeeId()));
		response.setRenderParameter(UserSyncKeys.AddEditAttributes.SSO_USERNAME, String.valueOf(userSync.getSsoUserName()));	
	}

	@Override
    public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse) throws IOException, PortletException {
		String cmd = ParamUtil.getString(resourceRequest, Constants.CMD);
    
		System.out.println("Constants.CMD: " + cmd);

		if (cmd.equals("getAppUsers")) {
			getAppUsersJson(resourceRequest, resourceResponse);
		}
	}

	private void getAppUsersJson(ResourceRequest resourceRequest, ResourceResponse resourceResponse) throws IOException, PortletException {
		JSONArray jsonResults = JSONFactoryUtil.createJSONArray();
		try {
			String keyword = ParamUtil.getString(resourceRequest, "keywords");
			String searchPattern = keyword.replace("*", "%");

			System.out.println("Keywords: " + searchPattern);

			JSONObject jsonCells = JSONFactoryUtil.createJSONObject();
			jsonCells.put("key", "1");
			jsonCells.put("name", "New York, USA");
			jsonResults.put(jsonCells);
			jsonCells = JSONFactoryUtil.createJSONObject();
			jsonCells.put("key", "2");
			jsonCells.put("name", "Delhi, India");
			jsonResults.put(jsonCells);
			jsonCells = JSONFactoryUtil.createJSONObject();
			jsonCells.put("key", "3");
			jsonCells.put("name", "Hyderabad, India");
			jsonResults.put(jsonCells);
		} catch (Exception e) {
                
		}
		PrintWriter out=resourceResponse.getWriter();
		out.println(jsonResults.toString());
	}	
}
