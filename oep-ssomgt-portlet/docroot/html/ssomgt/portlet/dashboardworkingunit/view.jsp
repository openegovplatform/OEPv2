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
<%@page import="com.liferay.portal.service.GroupLocalServiceUtil"%>
<%@page import="com.liferay.portal.model.Group"%>
<%@page import="org.oep.usermgt.service.WorkingUnitLocalServiceUtil"%>
<%@page import="org.oep.usermgt.model.WorkingUnit"%>
<%@page import="org.oep.usermgt.service.EmployeeLocalServiceUtil"%>
<%@page import="org.oep.usermgt.model.Employee"%>
<%@page import="com.liferay.portal.model.User"%>
 
<%@ include file="/html/ssomgt/portlet/dashboardworkingunit/init.jsp" %>

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
	<legend>
		<liferay-ui:message key="org.oep.ssomgt.portlet.dashboardworkingunit.label.publicpage"></liferay-ui:message>
	</legend>
	<ul class="nav nav-list">
		<li>
			<%
				if (e != null) {
					WorkingUnit wu = WorkingUnitLocalServiceUtil.getWorkingUnit(e.getWorkingUnitId());
					Group g = GroupLocalServiceUtil.getGroup(wu.getLocalSiteId());
					if (g != null && g.hasPublicLayouts()) {
			%>
			<a href="/web<%= g.getFriendlyURL() %>" title="<%= g.getDescriptiveName() %>">
				<%= g.getDescriptiveName() %>
			</a>
			<%
					}
				}
			%>
		</li>
	</ul>
</fieldset>

<fieldset>
	<legend>
		<liferay-ui:message key="org.oep.ssomgt.portlet.dashboardworkingunit.label.privatepage"></liferay-ui:message>
	</legend>
	<ul class="nav nav-list">
		<li>
			<%
				if (e != null) {
					WorkingUnit wu = WorkingUnitLocalServiceUtil.getWorkingUnit(e.getWorkingUnitId());
					Group g = GroupLocalServiceUtil.getGroup(wu.getLocalSiteId());
					if (g != null && g.hasPrivateLayouts()) {
			%>
			<a href="/group<%= g.getFriendlyURL() %>" title="<%= g.getDescriptiveName() %>">
				<%= g.getDescriptiveName() %>
			</a>
			<%
					}
				}
			%>
		</li>
	</ul>
</fieldset>

<%
	}
%>