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

<%@page import="org.oep.ssomgt.service.AppMessageLocalServiceUtil"%>
<%@page import="org.oep.ssomgt.model.AppMessage"%>
<%@page import="org.oep.ssomgt.permission.SSOPermission"%>
<%@page import="com.liferay.portal.model.Group"%>
<%@page import="com.liferay.portal.security.permission.PermissionThreadLocal"%>
<%@page import="com.liferay.portal.security.permission.PermissionCheckerFactoryUtil"%>
<%@page import="com.liferay.portal.security.permission.PermissionChecker"%>
<%@page import="org.oep.ssomgt.service.ApplicationLocalServiceUtil"%>
<%@page import="org.oep.ssomgt.model.Application"%>
<%@page import="com.liferay.portal.service.ServiceContextThreadLocal"%>
<%@page import="com.liferay.portal.service.ServiceContext"%>
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@ include file="/html/ssomgt/portlet/ssodashboard/init.jsp" %>

<%
	String ssoUrlCfg = GetterUtil.getString(portletPreferences.getValue("ssourl", ""));	 
%>

<%
	ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();
	List<Application> lstApps = ApplicationLocalServiceUtil.findByCompany(serviceContext.getCompanyId());
%>

<%
	if (!themeDisplay.isSignedIn()) {
%>
	<%= LanguageUtil.get(pageContext, "org.oep.ssomgt.portlet.ssodashboard.configuration.notsignedin") %>
	<a href="/c/portal/login">
		<%= LanguageUtil.get(pageContext, "org.oep.ssomgt.portlet.ssodashboard.configuration.signin") %>
	</a>
	<%= LanguageUtil.get(pageContext, "org.oep.ssomgt.portlet.ssodashboard.configuration.continue") %>	
<%
	}
	else {
		PermissionThreadLocal.setPermissionChecker(permissionChecker);       
		List<Group> sites =  user.getMySiteGroups(false, 30);
		for (Group g : sites) {
		}
%>
<div style="margin-top: 20px;" class="cms-app-tiles box100">
	<c:if test='<%= SSOPermission.contains(permissionChecker, scopeGroupId, "ADMIN_SSOMGT") %>'>
		<div class="box30">
			<div class="box_cn_small">
				<div class="box_left text-center">
					<a href="<%= ssoUrlCfg %>" title="<%= LanguageUtil.get(pageContext, "org.oep.ssomgt.portlet.ssodashboard.configuration.ssodashboardtitle") %>">
						<i class="fa fa-list"></i>
					</a>
				</div>
				
				<div class="box_right">
					<h4 class="box_title">
						<a href="<%= ssoUrlCfg %>" title="<%= LanguageUtil.get(pageContext, "org.oep.ssomgt.portlet.ssodashboard.configuration.ssodashboardtitle") %>">
							<%= LanguageUtil.get(pageContext, "org.oep.ssomgt.portlet.ssodashboard.configuration.ssodashboardtitle") %></a>
					</h4>
					
					<div class="box_information">
					
					</div>
				</div>
			</div>
		</div>
	</c:if>
		<%
			for (Group site : sites) {
				if (site.isSite() && site.hasPrivateLayouts()) {
		%>
			<div class="box30">
				<div class="box_cn_small">
					<div class="box_left text-center">
						<a href="/group<%= site.getFriendlyURL() %>" title="<%= site.getDescriptiveName() %>">
							<i class="fa fa-file-text-o"></i>
						</a>
					</div>
					
					<div class="box_right">
						<h4 class="box_title">
							<a href="/group<%= site.getFriendlyURL() %>" title="<%= site.getDescriptiveName() %>">
								<%= site.getDescriptiveName() %></a>
						</h4>
						
						<div class="box_information">
						
						</div>
					</div>
				</div>
		</div>		
		<%
				}
				else if (site.getAncestors().size() > 0) {
		%>
			<div class="box30">
				<div class="box_cn_small">
					<div class="box_left text-center">
						<a href="/web<%= site.getFriendlyURL() %>" title="<%= site.getDescriptiveName() %>">
							<i class="fa fa-file-text-o"></i>
						</a>
					</div>
					
					<div class="box_right">
						<h4 class="box_title">
							<a href="/web<%= site.getFriendlyURL() %>" title="<%= site.getDescriptiveName() %>">
								<%= site.getDescriptiveName() %></a>
						</h4>
						
						<div class="box_information">
						
						</div>
					</div>
				</div>
		</div>		
		<%
				}
			}
		%>
		
		<c:forEach items="<%= lstApps %>" var="appitem">
			<portlet:resourceURL var="smallIconResourceURL">
				<portlet:param name="icon" value="smallIcon"/>
				<portlet:param name="applicationId" value="${appitem.applicationId}"/>
			</portlet:resourceURL>				
		
			<div class="box30">
				<div class="box_cn_small">
					<div class="box_left text-center">
						<a href="${appitem.appUrl}" title="${appitem.appName}">
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
								lstDataMessages = AppMessageLocalServiceUtil.findByFromApplicationToUserMessageType(((Application)pageContext.findAttribute("appitem")).getAppCode(), "everyone", "data");
								lstAppMessages = AppMessageLocalServiceUtil.findByFromApplicationToUserNotMessageType(((Application)pageContext.findAttribute("appitem")).getAppCode(), "everyone", "data");					
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
				</div>
		</div>		
		</c:forEach>
</div>
<%
	}
%>