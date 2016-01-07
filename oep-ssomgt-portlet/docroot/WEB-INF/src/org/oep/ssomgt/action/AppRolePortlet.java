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
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.oep.ssomgt.DuplicateRoleCodeException;
import org.oep.ssomgt.RoleCodeRangeLengthException;
import org.oep.ssomgt.RoleNameRangeLengthException;
import org.oep.ssomgt.model.AppRole;
import org.oep.ssomgt.model.AppRole2Employee;
import org.oep.ssomgt.model.UserSync;
import org.oep.ssomgt.service.AppRole2EmployeeLocalServiceUtil;
import org.oep.ssomgt.service.AppRole2JobPosLocalServiceUtil;
import org.oep.ssomgt.service.AppRoleLocalServiceUtil;
import org.oep.ssomgt.service.UserSyncLocalServiceUtil;
import org.oep.usermgt.model.Employee;
import org.oep.usermgt.service.EmployeeLocalServiceUtil;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextThreadLocal;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class AppRolePortlet
 */
public class AppRolePortlet extends MVCPortlet {
	public void addEditAppRole2JobPos(ActionRequest request, ActionResponse response) throws SystemException, PortalException, IOException {
		if (SessionErrors.isEmpty(request)) {
			ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();
			long appRoleId = ParamUtil.getLong(request, AppRole2JobPosKeys.AddEditAttributes.APPROLE_ID, PortletKeys.LONG_DEFAULT);
			long jobPosId = ParamUtil.getLong(request, AppRole2JobPosKeys.AddEditAttributes.JOBPOS_ID, PortletKeys.LONG_DEFAULT);
			
			Long editId = ParamUtil.getLong(request, AppRole2JobPosKeys.AddEditAttributes.EDIT_ID, PortletKeys.LONG_DEFAULT);
			if (editId == PortletKeys.LONG_DEFAULT) {
				AppRole2JobPosLocalServiceUtil.addAppRole2JobPos(appRoleId, jobPosId, serviceContext);
				SessionMessages.add(request, AssignRoleKeys.SuccessMessageKeys.ORG_OEP_SSOMGT_PORTLET_APPROLE_ASSIGNROLE2JOBPOS_SUCCESS_ADDNEW);	
			} else {
			}
		}
		SessionMessages.add(request, PortalUtil.getPortletId(request) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE); 		
		if (!SessionErrors.isEmpty(request)) {
			PortalUtil.copyRequestParameters(request, response);
		} else {
			response.sendRedirect(ParamUtil.getString(request, PortletKeys.REDIRECT_PAGE));
		}
	} 
	
	public void addEditAppRole2Employee(ActionRequest request, ActionResponse response) throws SystemException, PortalException, IOException {
		if (SessionErrors.isEmpty(request)) {
			ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();
			long appRoleId = ParamUtil.getLong(request, AppRole2JobPosKeys.AddEditAttributes.APPROLE_ID, PortletKeys.LONG_DEFAULT);
			long employeeId = ParamUtil.getLong(request, AppRole2EmployeeKeys.AddEditAttributes.EMPLOYEE_ID, PortletKeys.LONG_DEFAULT);
			
			Long editId = ParamUtil.getLong(request, AppRole2EmployeeKeys.AddEditAttributes.EDIT_ID, PortletKeys.LONG_DEFAULT);
			if (editId == PortletKeys.LONG_DEFAULT) {
				Employee employee = EmployeeLocalServiceUtil.getEmployee(employeeId);
				AppRole2EmployeeLocalServiceUtil.addAppRole2Employee(appRoleId, employeeId, serviceContext);
				AppRole role = AppRoleLocalServiceUtil.getAppRole(appRoleId);
				try {
					UserSync userSync = UserSyncLocalServiceUtil.findByApplicationEmployee(role.getApplicationId(), employeeId);
					String roles = userSync.getRoles();
					userSync.setCheckpoint(new Date());
					if (!roles.contains(role.getRoleCode())) {
						if (roles.equals(""))
							roles = role.getRoleCode();
						else
							roles += "," + role.getRoleCode();
					}
					else {
						
					}
					UserSyncLocalServiceUtil.updateUserSync(userSync);
				}
				catch (Exception e) {
					e.printStackTrace();
					User user = UserLocalServiceUtil.getUser(employee.getMappingUserId());
					UserSyncLocalServiceUtil.addUserSync(role.getApplicationId(), employeeId, employee.getMappingUserId(), user.getScreenName(), user.getScreenName(), employee.getFullName(), user.getEmailAddress(), user.getPassword(), 1, role.getRoleCode(), new Date(), null);
				}
				SessionMessages.add(request, AssignRoleKeys.SuccessMessageKeys.ORG_OEP_SSOMGT_PORTLET_APPROLE_ASSIGNROLE2EMPLOYEE_SUCCESS_ADDNEW);	
			} else {
			}
		}
		SessionMessages.add(request, PortalUtil.getPortletId(request) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE); 		
		if (!SessionErrors.isEmpty(request)) {
			PortalUtil.copyRequestParameters(request, response);
		} else {
			response.sendRedirect(ParamUtil.getString(request, PortletKeys.REDIRECT_PAGE));
		}
	} 

	public void deleteJP(ActionRequest request, ActionResponse response) throws PortalException, SystemException, IOException {
		long deleteId = ParamUtil.getLong(request, AppRole2JobPosKeys.BaseAppRole2JobPosAttributes.DELETE_ID, PortletKeys.LONG_DEFAULT);
		try {
			AppRole2JobPosLocalServiceUtil.removeAppRole2JobPos(deleteId);
			SessionMessages.add(request, AssignRoleKeys.SuccessMessageKeys.ORG_OEP_SSOMGT_PORTLET_APPROLE_ASSIGNROLE2JOBPOS_SUCCESS_DELETE);	
		}
		catch (Exception ex) {
			SessionMessages.add(request, AssignRoleKeys.ErrorMessageKeys.ORG_OEP_SSOMGT_PORTLET_APPROLE_ASSIGNROLE2JOBPOS_ERROR_DELETE);				
		}
		response.sendRedirect(ParamUtil.getString(request, PortletKeys.REDIRECT_PAGE));
	}
	
	public void deleteEP(ActionRequest request, ActionResponse response) throws PortalException, SystemException, IOException {
		long deleteId = ParamUtil.getLong(request, AppRole2JobPosKeys.BaseAppRole2JobPosAttributes.DELETE_ID, PortletKeys.LONG_DEFAULT);
		try {
			AppRole2Employee a2e = AppRole2EmployeeLocalServiceUtil.getAppRole2Employee(deleteId);
			if (a2e != null) {
				try {
					AppRole role = AppRoleLocalServiceUtil.getAppRole(a2e.getAppRoleId());
					UserSync userSync = UserSyncLocalServiceUtil.findByApplicationEmployee(role.getApplicationId(), a2e.getEmployeeId());
					userSync.setCheckpoint(new Date());
					userSync.setAccessibleStatus(0);
					UserSyncLocalServiceUtil.updateUserSync(userSync);
				}
				catch (Exception e) {
					e.printStackTrace();
				}				
			}
			AppRole2EmployeeLocalServiceUtil.removeAppRole2Employee(deleteId);
			SessionMessages.add(request, AssignRoleKeys.SuccessMessageKeys.ORG_OEP_SSOMGT_PORTLET_APPROLE_ASSIGNROLE2EMPLOYEE_SUCCESS_DELETE);	
		}
		catch (Exception ex) {
			SessionMessages.add(request, AssignRoleKeys.ErrorMessageKeys.ORG_OEP_SSOMGT_PORTLET_APPROLE_ASSIGNROLE2EMPLOYEE_ERROR_DELETE);				
		}
		response.sendRedirect(ParamUtil.getString(request, PortletKeys.REDIRECT_PAGE));
	}

	private void validateParamsIntoSessionError(ActionRequest request) {
		String roleCode = ParamUtil.getString(request, AppRoleKeys.AddEditAttributes.ROLE_CODE, PortletKeys.TEXT_BOX);
		String roleName = ParamUtil.getString(request, AppRoleKeys.AddEditAttributes.ROLE_NAME, PortletKeys.TEXT_BOX);
		
		Long editId = ParamUtil.getLong(request, AppRoleKeys.AddEditAttributes.EDIT_ID, PortletKeys.LONG_DEFAULT);
		
		try {
			AppRoleLocalServiceUtil.validate(editId, roleCode, roleName);
		}
		catch (DuplicateRoleCodeException drce) {
			SessionErrors.add(request, AppRoleKeys.ErrorMessageKeys.ORG_OEP_SSOMGT_PORTLET_APPROLE_ROLECODE);			
		}
		catch (RoleCodeRangeLengthException rcr) {
			SessionErrors.add(request, AppRoleKeys.ErrorMessageKeys.ORG_OEP_SSOMGT_PORTLET_APPROLE_ROLECODE);						
		}
		catch (RoleNameRangeLengthException rnr) {
			SessionErrors.add(request, AppRoleKeys.ErrorMessageKeys.ORG_OEP_SSOMGT_PORTLET_APPROLE_ROLENAME);						
		}
	}
	
	public void addEditAppRole(ActionRequest request, ActionResponse response) throws SystemException, PortalException, IOException {
		validateParamsIntoSessionError(request);
		
		if (SessionErrors.isEmpty(request)) {
			ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();
			long applicationId = ParamUtil.getLong(request, AppRoleKeys.AddEditAttributes.APPLICATION_ID, PortletKeys.LONG_DEFAULT);
			String roleCode = ParamUtil.getString(request, AppRoleKeys.AddEditAttributes.ROLE_CODE, PortletKeys.TEXT_BOX);
			String roleName = ParamUtil.getString(request, AppRoleKeys.AddEditAttributes.ROLE_NAME, PortletKeys.TEXT_BOX);
			
			Long editId = ParamUtil.getLong(request, AppRoleKeys.AddEditAttributes.EDIT_ID, PortletKeys.LONG_DEFAULT);
			if (editId == PortletKeys.LONG_DEFAULT) {
				AppRoleLocalServiceUtil.addAppRole(applicationId, roleCode, roleName, serviceContext);
				SessionMessages.add(request, AppRoleKeys.SuccessMessageKeys.ORG_OEP_SSOMGT_PORTLET_APPROLE_SUCCESS_ADDNEW);	
			} else {
				AppRoleLocalServiceUtil.updateAppRole(editId, applicationId, roleCode, roleName, serviceContext);
				SessionMessages.add(request, AppRoleKeys.SuccessMessageKeys.ORG_OEP_SSOMGT_PORTLET_APPROLE_SUCCESS_UPDATE);	
			}
		}
		SessionMessages.add(request, PortalUtil.getPortletId(request) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE); 		
		if (!SessionErrors.isEmpty(request)) {
			PortalUtil.copyRequestParameters(request, response);
		} else {
			response.sendRedirect(ParamUtil.getString(request, PortletKeys.REDIRECT_PAGE));
		}
	}

	public void deleteAppRole(ActionRequest request, ActionResponse response) throws PortalException, SystemException, IOException {
		long deleteId = ParamUtil.getLong(request, AppRoleKeys.AddEditAttributes.DELETE_ID, PortletKeys.LONG_DEFAULT);
		try {
			AppRoleLocalServiceUtil.removeAppRole(deleteId);
			SessionMessages.add(request, AppRoleKeys.SuccessMessageKeys.ORG_OEP_SSOMGT_PORTLET_APPROLE_SUCCESS_DELETE);	
		}
		catch (Exception ex) {
			SessionMessages.add(request, AppRoleKeys.ErrorMessageKeys.ORG_OEP_SSOMGT_PORTLET_APPROLE_ERROR_DELETE);				
		}
		response.sendRedirect(ParamUtil.getString(request, PortletKeys.REDIRECT_PAGE));
	}
	
	public void editAppRole(ActionRequest request, ActionResponse response) throws PortalException, SystemException, IOException {
		long editId = ParamUtil.getLong(request, AppRoleKeys.AddEditAttributes.EDIT_ID, PortletKeys.LONG_DEFAULT);
		
		AppRole appRole = AppRoleLocalServiceUtil.getAppRole(editId);
		setParameterIntoResponse(response, appRole);
		
		if (!SessionErrors.isEmpty(request)) {
			response.sendRedirect(ParamUtil.getString(request, PortletKeys.REDIRECT_PAGE));
			SessionMessages.add(request, AppRoleKeys.SuccessMessageKeys.ORG_OEP_SSOMGT_PORTLET_APPROLE_SUCCESS_UPDATE);	
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
