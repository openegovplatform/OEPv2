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
<%@page import="org.oep.usermgt.service.EmployeeLocalServiceUtil"%>
<%@page import="org.oep.usermgt.model.Employee"%>
<%@page import="com.liferay.portal.model.User"%>
<%@ include file="/html/ssomgt/portlet/dashboardemployee/init.jsp" %>
<%
	long userId = themeDisplay.getUserId();
	User curUser = themeDisplay.getUser();
	if (userId != 0) {
		Employee e = null;
		try {
			e = EmployeeLocalServiceUtil.getByMappingUserId(userId);
		}
		catch (Exception ex) {
			
		}
%> 
<fieldset>
	<legend><liferay-ui:message key="org.oep.ssomgt.portlet.dashboardemployee.label.employeeinfo"></liferay-ui:message></legend>
	<label>
		<liferay-ui:message key="org.oep.ssomgt.portlet.dashboardemployee.label.screennameinfo"></liferay-ui:message>:
		<%= curUser.getScreenName() %>
	</label>
	<label>
		<liferay-ui:message key="org.oep.ssomgt.portlet.dashboardemployee.label.employeename"></liferay-ui:message>:
		<%
			if (e != null) {
		%>
			<%= e.getFullName() %>
		<%
			}
		%>
	</label>
	<liferay-ui:user-display userId="<%= userId %>" />
	<br/>
	<hr/>
	<ul class="nav nav-list">
		<li>

		<a href="/user/<%= curUser.getScreenName() %>">
			<liferay-ui:message key="org.oep.ssomgt.portlet.dashboardemployee.link.homepage"></liferay-ui:message>
		</a>
		</li>
	</ul>
</fieldset>
<%
	}
%>