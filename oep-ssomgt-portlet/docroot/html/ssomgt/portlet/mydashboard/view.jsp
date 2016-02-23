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

<%@page import="com.liferay.portal.kernel.servlet.SessionMessages"%>
<%@page import="com.liferay.portal.kernel.servlet.SessionErrors"%>
<%@page import="org.oep.ssomgt.NoSuchApplicationException"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="org.oep.ssomgt.service.AppMessageLocalServiceUtil"%>
<%@page import="org.oep.ssomgt.model.AppMessage"%>
<%@page import="org.oep.ssomgt.service.ApplicationLocalServiceUtil"%>
<%@page import="org.oep.ssomgt.model.Application"%>
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@ include file="/html/ssomgt/portlet/mydashboard/init.jsp" %>

<%
	Integer applicationIdCfg = GetterUtil.getInteger(portletPreferences.getValue("applicationid", "0"));
	
	Application appitem = null;
	SessionMessages.add(renderRequest, PortalUtil.getPortletId(request) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE); 		
	
	try {
		appitem = ApplicationLocalServiceUtil.getApplication(applicationIdCfg);
	}
	catch (NoSuchApplicationException e) {
		SessionErrors.add(renderRequest, "ORG.OEP.SSOMGT.PORTLET.MYDASHBOARD.EXCEPTION.NOSUCHAPPLICATION");	
	}
	
	boolean showToUser = GetterUtil.getBoolean(portletPreferences.getValue("showtouser", StringPool.FALSE));
	Integer numberOfUserMessage = GetterUtil.getInteger(portletPreferences.getValue("numberofusermessage", "5"));
%>

<liferay-ui:error key="ORG.OEP.SSOMGT.PORTLET.MYDASHBOARD.EXCEPTION.NOSUCHAPPLICATION" message="org.oep.ssomgt.portlet.mydashboard.exception.nosuchapplication"/>

<%
	if (appitem != null) {
%>
<div class="cms-app-tiles box100">
	<div class="box100all">
		<div class="box_cn">
			<div class="box_left text-center">
			<portlet:resourceURL var="bigIconResourceURL">
				<portlet:param name="icon" value="bigIcon"/>
				<portlet:param name="applicationId" value="<%= String.valueOf(appitem.getApplicationId()) %>"/>
			</portlet:resourceURL>				
			<a href="<%= appitem.getAppUrl() %>" target="_blank"><img class="img-circle" style="width: 140px; height: 140px;" src="<%= bigIconResourceURL.toString() %>"></a>
			</div>
			<%
				List<AppMessage> lstDataMessages = new ArrayList<AppMessage>(); 
				AppMessageLocalServiceUtil.findByFromApplicationToUserMessageType(appitem.getAppCode(), "everyone", "data");
				List<AppMessage> lstAppMessages = new ArrayList<AppMessage>(); 
				if (showToUser) {
					lstDataMessages = AppMessageLocalServiceUtil.findByFromApplicationToUserMessageType(appitem.getAppCode(), user.getScreenName(), "data");
					lstAppMessages = AppMessageLocalServiceUtil.findByFromApplicationToUserNotMessageType(appitem.getAppCode(), user.getScreenName(), "data");					
				}
				else {
					lstDataMessages = AppMessageLocalServiceUtil.findByFromApplicationToUserMessageType(appitem.getAppCode(), "everyone", "data");
					lstAppMessages = AppMessageLocalServiceUtil.findByFromApplicationToUserNotMessageType(appitem.getAppCode(), "everyone", "data");					
				}
				AppMessage appMessage = null;
				if (lstDataMessages.size() > 0)
					appMessage = lstDataMessages.get(0);
			%>
			<br/>
			<div class="box_right">
			<h4 class="box_title"><%= appitem.getAppName() %></h4>
			<div class="box_information">
				<% if (appMessage != null) { %>
					<p>
					<%
						String[] data = appMessage.getMessageValue().split(",");
						StringBuilder echoDatas = new StringBuilder();
						boolean first = true;
						for (int i = 0; i < data.length; i += 2) {
							if (first) {
								first = false;
								echoDatas.append("<p>");
								echoDatas.append(data[i + 1]);
								echoDatas.append("<span class='textfl xanhduong'>" + data[i] + "</span>");
								echoDatas.append("</p>");
							}
							else {
								echoDatas.append("<p>");
								echoDatas.append(data[i + 1]);
								echoDatas.append("<span class='textfl xanhduong'>" + data[i] + "</span>");
								echoDatas.append("</p>");
							}
						}
					%>
					<%= echoDatas.toString() %>
					</p>
				<%
					}
				%>
			</div>
			</div>			
		<div style="width: 100%;">
			<c:forEach items="<%= lstAppMessages %>" var="appmessage" end="<%= numberOfUserMessage - 1 %>">
				<c:choose>
					<c:when test="${appmessage.messageType eq 'notification'}">
						<p class="text-info">
							<a href="${appmessage.messageUrl}" target="_blank">
								- ${ appmessage.messageText }
							</a>
						</p>					
					</c:when>
					<c:when test="${appmessage.messageType eq 'warning'}">
						<p class="text-warning">
							<a href="${appmessage.messageUrl}" target="_blank">
								- ${ appmessage.messageText }
							</a>						
						</p>
					</c:when>
					<c:when test="${appmessage.messageType eq 'alert'}">
						<p class="muted">
							<a href="${appmessage.messageUrl}" target="_blank">
								- ${ appmessage.messageText }
							</a>						
						</p>
					</c:when>
					<c:when test="${appmessage.messageType eq 'error'}">
						<p class="text-error">
							<a href="${appmessage.messageUrl}" target="_blank">
								- ${ appmessage.messageText }
							</a>						
						</p>
					</c:when>
					<c:when test="${appmessage.messageType eq 'critical'}">
						<p class="text-error">
							<a href="${appmessage.messageUrl}" target="_blank">
								- ${ appmessage.messageText }
							</a>						
						</p>
					</c:when>
					<c:otherwise>
						<p class="text-success">
							<a href="${appmessage.messageUrl}" target="_blank">
								- ${ appmessage.messageText }
							</a>						
						</p>
					</c:otherwise>
				</c:choose>
			</c:forEach>
		</div>
			
		</div>
	</div>
</div>
<%
	}
%>
