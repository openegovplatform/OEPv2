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
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.service.UserLocalServiceUtil"%>
<%@page import="com.liferay.portal.model.User"%>
<%@page import="org.oep.ssomgt.service.AppMessageLocalServiceUtil"%>
<%@page import="org.oep.ssomgt.model.AppMessage"%>
<%@page import="com.liferay.portal.service.ServiceContext"%>
<%@page import="com.liferay.portal.service.ServiceContextThreadLocal"%>
<%@page import="org.oep.ssomgt.service.ApplicationLocalServiceUtil"%>
<%@page import="org.oep.ssomgt.model.Application"%>
<%@page import="org.oep.ssomgt.action.PortletKeys"%>
<%@ include file="/html/ssomgt/portlet/dashboardapplication/init.jsp" %>
<%
	ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();
	List<Application> lstApps = ApplicationLocalServiceUtil.findByCompany(serviceContext.getCompanyId());
    boolean showToUser = GetterUtil.getBoolean(portletPreferences.getValue("showtouser", StringPool.FALSE));
	Integer numberOfUserMessage = GetterUtil.getInteger(portletPreferences.getValue("numberofusermessage", "5"));
	String displayStyle = GetterUtil.getString(portletPreferences.getValue("displaystyle", ""), "");

%>
<%
	if (displayStyle.equals("OEP_SSOMGT_DASHBOARDAPPLICATION_DISPLAYSTYLE_GRID2X")) {
%>
<div style="margin-top: 20px;" class="cms-app-tiles box100">
<c:forEach items="<%= lstApps %>" var="appitem">
			<portlet:resourceURL var="smallIconResourceURL">
				<portlet:param name="icon" value="smallIcon"/>
				<portlet:param name="applicationId" value="${appitem.applicationId}"/>
			</portlet:resourceURL>				
		
			<div class="box50">
				<div class="box_cn_small">
					<div class="box_left text-center">
						<a href="${ appitem.appUrl }" target="_blank">
							<img style="width: 70px; height: 70px;" src="<%= smallIconResourceURL.toString() %>" class="img-circle">
						</a>
					</div>
					<div class="box_right">
						<h4 class="box_title">
							<a href="${appitem.appUrl}" title="${appitem.appName}">
								${appitem.appName}</a>
						</h4>
						
						<div class="box_information">
							<%
								List<AppMessage> lstDataMessages = new ArrayList<AppMessage>(); 
								AppMessageLocalServiceUtil.findByFromApplicationToUserMessageType(((Application)pageContext.findAttribute("appitem")).getAppCode(), "everyone", "data");
								List<AppMessage> lstAppMessages = new ArrayList<AppMessage>(); 
								if (showToUser) {
									lstDataMessages = AppMessageLocalServiceUtil.findByFromApplicationToUserMessageType(((Application)pageContext.findAttribute("appitem")).getAppCode(), user.getScreenName(), "data");
									lstAppMessages = AppMessageLocalServiceUtil.findByFromApplicationToUserNotMessageType(((Application)pageContext.findAttribute("appitem")).getAppCode(), user.getScreenName(), "data");					
								}
								else {
									lstDataMessages = AppMessageLocalServiceUtil.findByFromApplicationToUserMessageType(((Application)pageContext.findAttribute("appitem")).getAppCode(), "everyone", "data");
									lstAppMessages = AppMessageLocalServiceUtil.findByFromApplicationToUserNotMessageType(((Application)pageContext.findAttribute("appitem")).getAppCode(), "everyone", "data");					
								}
								AppMessage appMessage = null;
								if (lstDataMessages.size() > 0)
									appMessage = lstDataMessages.get(0);
							%>
							<p>
								<% if (appMessage != null) { %>
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
								<%
									}
								%>
							</p>
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
</c:forEach>
</div>
<%
	}
	else if (displayStyle.equals("OEP_SSOMGT_DASHBOARDAPPLICATION_DISPLAYSTYLE_GRID3X")) {
%>
<div style="margin-top: 20px;" class="cms-app-tiles box100">
<c:forEach items="<%= lstApps %>" var="appitem">
			<portlet:resourceURL var="smallIconResourceURL">
				<portlet:param name="icon" value="smallIcon"/>
				<portlet:param name="applicationId" value="${appitem.applicationId}"/>
			</portlet:resourceURL>				
		
			<div class="box30">
				<div class="box_cn_small">
					<div class="box_left text-center">
						<a href="${ appitem.appUrl }" target="_blank">
							<img style="width: 70px; height: 70px;" src="<%= smallIconResourceURL.toString() %>" class="img-circle">
						</a>
					</div>
					<div class="box_right">
						<h4 class="box_title">
							<a href="${appitem.appUrl}" title="${appitem.appName}">
								${appitem.appName}</a>
						</h4>
						
						<div class="box_information">
							<%
								List<AppMessage> lstDataMessages = new ArrayList<AppMessage>(); 
								AppMessageLocalServiceUtil.findByFromApplicationToUserMessageType(((Application)pageContext.findAttribute("appitem")).getAppCode(), "everyone", "data");
								List<AppMessage> lstAppMessages = new ArrayList<AppMessage>(); 
								if (showToUser) {
									lstDataMessages = AppMessageLocalServiceUtil.findByFromApplicationToUserMessageType(((Application)pageContext.findAttribute("appitem")).getAppCode(), user.getScreenName(), "data");
									lstAppMessages = AppMessageLocalServiceUtil.findByFromApplicationToUserNotMessageType(((Application)pageContext.findAttribute("appitem")).getAppCode(), user.getScreenName(), "data");					
								}
								else {
									lstDataMessages = AppMessageLocalServiceUtil.findByFromApplicationToUserMessageType(((Application)pageContext.findAttribute("appitem")).getAppCode(), "everyone", "data");
									lstAppMessages = AppMessageLocalServiceUtil.findByFromApplicationToUserNotMessageType(((Application)pageContext.findAttribute("appitem")).getAppCode(), "everyone", "data");					
								}
								AppMessage appMessage = null;
								if (lstDataMessages.size() > 0)
									appMessage = lstDataMessages.get(0);
							%>
							<p>
								<% if (appMessage != null) { %>
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
								<%
									}
								%>
							</p>
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
</c:forEach>
</div>

<%
	}
	else if (displayStyle.equals("OEP_SSOMGT_DASHBOARDAPPLICATION_DISPLAYSTYLE_GRID3X")) {
%>
<div style="margin-top: 20px;" class="cms-app-tiles box100">
<c:forEach items="<%= lstApps %>" var="appitem">
			<portlet:resourceURL var="smallIconResourceURL">
				<portlet:param name="icon" value="smallIcon"/>
				<portlet:param name="applicationId" value="${appitem.applicationId}"/>
			</portlet:resourceURL>				
		
			<div class="box25">
				<div class="box_cn_small">
					<div class="box_left text-center">
						<a href="${ appitem.appUrl }" target="_blank">
							<img style="width: 70px; height: 70px;" src="<%= smallIconResourceURL.toString() %>" class="img-circle">
						</a>
					</div>
					<div class="box_right">
						<h4 class="box_title">
							<a href="${appitem.appUrl}" title="${appitem.appName}">
								${appitem.appName}</a>
						</h4>
						
						<div class="box_information">
							<%
								List<AppMessage> lstDataMessages = new ArrayList<AppMessage>(); 
								AppMessageLocalServiceUtil.findByFromApplicationToUserMessageType(((Application)pageContext.findAttribute("appitem")).getAppCode(), "everyone", "data");
								List<AppMessage> lstAppMessages = new ArrayList<AppMessage>(); 
								if (showToUser) {
									lstDataMessages = AppMessageLocalServiceUtil.findByFromApplicationToUserMessageType(((Application)pageContext.findAttribute("appitem")).getAppCode(), user.getScreenName(), "data");
									lstAppMessages = AppMessageLocalServiceUtil.findByFromApplicationToUserNotMessageType(((Application)pageContext.findAttribute("appitem")).getAppCode(), user.getScreenName(), "data");					
								}
								else {
									lstDataMessages = AppMessageLocalServiceUtil.findByFromApplicationToUserMessageType(((Application)pageContext.findAttribute("appitem")).getAppCode(), "everyone", "data");
									lstAppMessages = AppMessageLocalServiceUtil.findByFromApplicationToUserNotMessageType(((Application)pageContext.findAttribute("appitem")).getAppCode(), "everyone", "data");					
								}
								AppMessage appMessage = null;
								if (lstDataMessages.size() > 0)
									appMessage = lstDataMessages.get(0);
							%>
							<p>
								<% if (appMessage != null) { %>
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
								<%
									}
								%>
							</p>
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
</c:forEach>
</div>

<%		
	}
	else if (displayStyle.equals("OEP_SSOMGT_DASHBOARDAPPLICATION_DISPLAYSTYLE_VERTICAL")) {
%>
<ul class="unstyled">
<c:forEach items="<%= lstApps %>" var="appitem">
	<portlet:resourceURL var="smallIconResourceURL">
		<portlet:param name="icon" value="smallIcon"/>
		<portlet:param name="applicationId" value="${appitem.applicationId}"/>
	</portlet:resourceURL>				
	<li style="padding-bottom: 10px;">
		<a href="${appitem.appUrl}" target="_blank">
			<img style="width: 90%; padding: 5px;" src="<%= smallIconResourceURL.toString() %>" class="img-rounded">
		</a>
	</li>
</c:forEach>
</ul>
<%
	}
%>