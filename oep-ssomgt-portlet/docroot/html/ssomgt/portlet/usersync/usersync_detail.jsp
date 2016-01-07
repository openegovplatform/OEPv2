<%--
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
 --%>
<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@page import="org.oep.ssomgt.service.ApplicationLocalServiceUtil"%>
<%@page import="org.oep.ssomgt.model.Application"%>
<%@page import="org.oep.ssomgt.action.PortletKeys"%>
<%@page import="org.oep.ssomgt.action.UserSyncKeys"%>
<%@ include file="/html/ssomgt/portlet/usersync/init.jsp" %>
<%
	long applicationId = ParamUtil.getLong(request, UserSyncKeys.AddEditAttributes.APPLICATION_ID, PortletKeys.LONG_DEFAULT);
	Application app = ApplicationLocalServiceUtil.getApplication(applicationId);
%>
<portlet:resourceURL var="getAppUsers">
	<portlet:param name="<%=Constants.CMD%>" value="getAppUsers" />
</portlet:resourceURL>
<aui:form>
	<table class="table">
		<tr>
			<td>
				<liferay-ui:message key="org.oep.ssomgt.portlet.usersync.changemapping.label.ssousername"></liferay-ui:message>:
			</td>
			<td>
				<%= ParamUtil.get(request, UserSyncKeys.AddEditAttributes.SSO_USERNAME, PortletKeys.TEXT_BOX) %>
			</td>
		</tr>
		<tr>
			<td>
				<liferay-ui:message key="org.oep.ssomgt.portlet.usersync.changemapping.label.email"></liferay-ui:message>:
			</td>
			<td>
				<%= ParamUtil.get(request, UserSyncKeys.AddEditAttributes.EMAIL, PortletKeys.TEXT_BOX) %>
			</td>
		</tr>
		<tr>
			<td>
				<liferay-ui:message key="org.oep.ssomgt.portlet.usersync.changemapping.label.application"></liferay-ui:message>:
			</td>
			<td>
				<%= app.getAppName() %>
			</td>
		</tr>
		<tr>
			<td>
				<liferay-ui:message key="org.oep.ssomgt.portlet.usersync.changemapping.label.appusername"></liferay-ui:message>:
			</td>
			<td>
				<%= ParamUtil.getString(request, UserSyncKeys.AddEditAttributes.APP_USERNAME, PortletKeys.TEXT_BOX) %>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<input class="btn btn-default" type="button" value="<liferay-ui:message key="org.oep.ssomgt.portlet.usersync.button.back" />" onclick="<portlet:namespace/>back()"/>
			</td>
		</tr>		
	</table>
</aui:form>
<script type="text/javascript">
function <portlet:namespace/>back() {
	location.href = "<%= ParamUtil.getString(request, PortletKeys.REDIRECT_PAGE) %>";
};
</script>