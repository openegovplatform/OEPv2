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
<%@page import="org.oep.core.ssomgt.action.AssignRoleKeys"%>
<%@page import="org.oep.core.ssomgt.service.ApplicationLocalServiceUtil"%>
<%@page import="org.oep.core.ssomgt.model.Application"%>
<%@page import="org.oep.core.ssomgt.service.AppRoleLocalServiceUtil"%>
<%@page import="org.oep.core.ssomgt.model.AppRole"%>
<%@page import="org.oep.core.ssomgt.action.PortletKeys"%>
<%@page import="org.oep.core.ssomgt.action.AppRoleKeys"%>
<%@ include file="/html/ssomgt/portlet/assignrole/init.jsp" %>
<%
	long appRoleId = ParamUtil.getLong(request, AppRoleKeys.AddEditAttributes.EDIT_ID, PortletKeys.LONG_DEFAULT);
	AppRole appRole = AppRoleLocalServiceUtil.getAppRole(appRoleId);
	Application app = ApplicationLocalServiceUtil.getApplication(appRole.getApplicationId());
%>
<aui:row>
	<aui:column columnWidth="50">
		<p class="muted">
			<b><liferay-ui:message key="org.oep.ssomgt.portlet.assignrole.label.application"></liferay-ui:message>:</b>
			<%= app.getAppName()  %>
		</p>
	</aui:column>
	<aui:column columnWidth="50">
		<p class="muted">
			<b><liferay-ui:message key="org.oep.ssomgt.portlet.assignrole.label.approle"></liferay-ui:message>:</b>
			<%= appRole.getRoleName() %>
		</p>
	</aui:column>
</aui:row>

<aui:row>
	<aui:column columnWidth="40">
		<aui:select style="width: 100%;" id="<%= AssignRoleKeys.SearchAttributes.WORKING_UNIT_ID %>" name="<%= AssignRoleKeys.SearchAttributes.WORKING_UNIT_ID %>" label="<%= LanguageUtil.get(pageContext, \"org.oep.ssomgt.portlet.approle.empty\") %>">
			<aui:option value="<%= PortletKeys.LONG_DEFAULT %>"><liferay-ui:message key="org.oep.ssomgt.portlet.assignrole.selectbox.workingunit" /></aui:option>
		</aui:select>
	</aui:column>
	<aui:column>
		<input class="btn" type="button" value="<liferay-ui:message key="org.oep.ssomgt.portlet.assignrole.button.addjobpost" />"/>
	</aui:column>
	<aui:column>
		<input class="btn" type="button" value="<liferay-ui:message key="org.oep.ssomgt.portlet.assignrole.button.addemployee" />"/>	
	</aui:column>
</aui:row>
<aui:row>
	<aui:column columnWidth="50"></aui:column>
	<aui:column columnWidth="50"></aui:column>
</aui:row>
<aui:row>
	<aui:column>
		<input class="btn btn-default" type="button" value="<liferay-ui:message key="org.oep.ssomgt.portlet.assignrole.button.back" />" onclick="<portlet:namespace/>back()"/>
	</aui:column>
</aui:row>	

<script type="text/javascript">
function <portlet:namespace/>back() {
	location.href = "<%= ParamUtil.getString(request, PortletKeys.REDIRECT_PAGE) %>";
};

</script>