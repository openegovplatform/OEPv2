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

package org.oep.core.logging.action;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import org.oep.core.logging.PortletKeys;

import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class UserActivityAction
 */
public class UserActivityAction extends MVCPortlet {
	public void deactivateUser(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortletException {
		long userId = ParamUtil.getLong(actionRequest, "userId");
		try{
			UserLocalServiceUtil.updateStatus(userId, WorkflowConstants.STATUS_INACTIVE);
			SessionMessages.add(actionRequest, "org.oep.useractivity.success.deactive");
		}catch(Exception e){
			SessionErrors.add(actionRequest,"org.oep.useractivity.error.operation.fail");
		}
		
		actionResponse.sendRedirect(ParamUtil.getString(actionRequest, PortletKeys.REDIRECT_PAGE));
	}

	public void activateUser(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortletException {
		long userId= ParamUtil.getLong(actionRequest, "userId");
		try{
			UserLocalServiceUtil.updateStatus(userId, WorkflowConstants.STATUS_APPROVED);
			SessionMessages.add(actionRequest, "org.oep.useractivity.success.active");
		}catch(Exception e){
			SessionErrors.add(actionRequest,"org.oep.useractivity.error.operation.fail");
		}
		
		actionResponse.sendRedirect(ParamUtil.getString(actionRequest, PortletKeys.REDIRECT_PAGE));
	}

}
