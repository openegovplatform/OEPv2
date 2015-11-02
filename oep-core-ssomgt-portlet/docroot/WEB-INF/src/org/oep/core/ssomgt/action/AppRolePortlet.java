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

package org.oep.core.ssomgt.action;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.oep.core.ssomgt.model.AppRole;
import org.oep.core.ssomgt.service.AppRoleLocalServiceUtil;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextThreadLocal;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class AppRolePortlet
 */
public class AppRolePortlet extends MVCPortlet {
 
	public void addEditAppRole(ActionRequest request, ActionResponse response) throws SystemException, PortalException, IOException {
		
		if (SessionErrors.isEmpty(request)) {
			ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();
			long applicationId = ParamUtil.getLong(request, AppRoleKeys.AddEditAttributes.APPLICATION_ID, PortletKeys.LONG_DEFAULT);
			String roleCode = ParamUtil.getString(request, AppRoleKeys.AddEditAttributes.ROLE_CODE, PortletKeys.TEXT_BOX);
			String roleName = ParamUtil.getString(request, AppRoleKeys.AddEditAttributes.ROLE_NAME, PortletKeys.TEXT_BOX);
			
			Long editId = ParamUtil.getLong(request, AppRoleKeys.AddEditAttributes.EDIT_ID, PortletKeys.LONG_DEFAULT);
			if (editId == PortletKeys.LONG_DEFAULT) {
				AppRoleLocalServiceUtil.addAppRole(applicationId, roleCode, roleName, serviceContext);
			} else {
				AppRoleLocalServiceUtil.updateAppRole(editId, applicationId, roleCode, roleName, serviceContext);
			}
		}
		if (!SessionErrors.isEmpty(request)) {
			PortalUtil.copyRequestParameters(request, response);
		} else {
			response.sendRedirect(ParamUtil.getString(request, PortletKeys.REDIRECT_PAGE));
		}
	}

	public void deleteAppRole(ActionRequest request, ActionResponse response) throws PortalException, SystemException, IOException {
		long deleteId = ParamUtil.getLong(request, AppRoleKeys.AddEditAttributes.DELETE_ID, PortletKeys.LONG_DEFAULT);
		
		AppRoleLocalServiceUtil.removeAppRole(deleteId);
		
		response.sendRedirect(ParamUtil.getString(request, PortletKeys.REDIRECT_PAGE));
	}
	
	public void editAppRole(ActionRequest request, ActionResponse response) throws PortalException, SystemException, IOException {
		long editId = ParamUtil.getLong(request, AppRoleKeys.AddEditAttributes.EDIT_ID, PortletKeys.LONG_DEFAULT);
		
		AppRole appRole = AppRoleLocalServiceUtil.getAppRole(editId);
		setParameterIntoResponse(response, appRole);
		
		if (!SessionErrors.isEmpty(request)) {
			response.sendRedirect(ParamUtil.getString(request, PortletKeys.REDIRECT_PAGE));
		} else {
			PortalUtil.copyRequestParameters(request, response);
		}
	}
	
	private void setParameterIntoResponse(ActionResponse response, AppRole appRole) {
		response.setRenderParameter(AppRoleKeys.AddEditAttributes.EDIT_ID, String.valueOf(appRole.getAppRoleId()));
		response.setRenderParameter(AppRoleKeys.AddEditAttributes.APPLICATION_ID, String.valueOf(appRole.getApplicationId()));
		response.setRenderParameter(AppRoleKeys.AddEditAttributes.ROLE_NAME, String.valueOf(appRole.getRoleName()));
		response.setRenderParameter(AppRoleKeys.AddEditAttributes.ROLE_CODE, String.valueOf(appRole.getRoleCode()));
	}
	
}
