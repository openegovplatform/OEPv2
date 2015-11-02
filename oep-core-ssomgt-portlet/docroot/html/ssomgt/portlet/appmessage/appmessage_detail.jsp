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
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="org.oep.core.ssomgt.service.ApplicationLocalServiceUtil"%>
<%@page import="org.oep.core.ssomgt.model.Application"%>
<%@page import="org.oep.core.ssomgt.service.AppMessageLocalServiceUtil"%>
<%@page import="org.oep.core.ssomgt.model.AppMessage"%>
<%@page import="org.oep.core.ssomgt.action.PortletKeys"%>
<%@page import="org.oep.core.ssomgt.action.AppMessageKeys"%>
<%@ include file="/html/ssomgt/portlet/appmessage/init.jsp" %>
<%
	long appMessageId = ParamUtil.getLong(request, AppMessageKeys.BaseAppMessageAttributes.EDIT_ID, PortletKeys.LONG_DEFAULT);
	AppMessage appMessage = AppMessageLocalServiceUtil.getAppMessage(appMessageId);
	Application app = ApplicationLocalServiceUtil.getByAppCode(appMessage.getFromApplication());
	DateFormat df = new SimpleDateFormat("dd/MM/yyyy H:m:s.S");
%>

<table class="table">
	<tr>
		<td><liferay-ui:message key="org.oep.ssomgt.portlet.appmessage.detail.label.createdate"></liferay-ui:message>: </td>
		<td>
			<%= df.format(appMessage.getCreateDate()) %>
		</td>
	</tr>
	<tr class="success">
		<td>
			<liferay-ui:message key="org.oep.ssomgt.portlet.appmessage.detail.label.fromapplication"></liferay-ui:message>: 
			<%= app.getAppName() %>
		</td>
		<td>
			<liferay-ui:message key="org.oep.ssomgt.portlet.appmessage.detail.label.appcode"></liferay-ui:message>: 
			<%= app.getAppCode() %>		
		</td>
	</tr>
	<tr class="info">
		<td colspan="2">
			<liferay-ui:message key="org.oep.ssomgt.portlet.appmessage.detail.label.touser"></liferay-ui:message>					
		</td>
	</tr>
	<tr>
		<td>
			<liferay-ui:message key="org.oep.ssomgt.portlet.appmessage.detail.label.messagetype"></liferay-ui:message>: 
			<%= appMessage.getMessageType() %>							
		</td>
		<td>
			<liferay-ui:message key="org.oep.ssomgt.portlet.appmessage.detail.label.messagetext"></liferay-ui:message>: 
			<%= appMessage.getMessageText() %>							
		</td>
	</tr>
	<tr class="warning">
		<td colspan="2">
			<liferay-ui:message key="org.oep.ssomgt.portlet.appmessage.detail.label.messagecode"></liferay-ui:message>: 
			<%= appMessage.getMessageCode() %>									
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<liferay-ui:message key="org.oep.ssomgt.portlet.appmessage.detail.label.messagevalue"></liferay-ui:message>: 
			<%= appMessage.getMessageValue() %>											
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<liferay-ui:message key="org.oep.ssomgt.portlet.appmessage.detail.label.messagevalue"></liferay-ui:message>													
		</td>
	</tr>
	<tr class="success">
		<td colspan="2">
			<liferay-ui:message key="org.oep.ssomgt.portlet.appmessage.detail.label.messageurl"></liferay-ui:message>: 
			<%= appMessage.getMessageUrl() %>													
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<input class="btn btn-default" type="button" value="<liferay-ui:message key="org.oep.ssomgt.portlet.appmessage.button.back" />" onclick="<portlet:namespace/>back()"/>
		</td>
	</tr>
</table>
<script type="text/javascript">
function <portlet:namespace/>back() {
	location.href = "<%= ParamUtil.getString(request, PortletKeys.REDIRECT_PAGE) %>";
};
</script>