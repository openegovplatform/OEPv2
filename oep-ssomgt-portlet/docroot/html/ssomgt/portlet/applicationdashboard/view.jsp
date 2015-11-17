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

<%@page import="com.liferay.portal.service.UserLocalServiceUtil"%>
<%@page import="com.liferay.portal.model.User"%>
<%@page import="org.oep.ssomgt.service.AppMessageLocalServiceUtil"%>
<%@page import="org.oep.ssomgt.model.AppMessage"%>
<%@page import="com.liferay.portal.service.ServiceContext"%>
<%@page import="com.liferay.portal.service.ServiceContextThreadLocal"%>
<%@page import="org.oep.ssomgt.service.ApplicationLocalServiceUtil"%>
<%@page import="org.oep.ssomgt.model.Application"%>
<%@page import="org.oep.ssomgt.action.PortletKeys"%>
<%@ include file="/html/ssomgt/portlet/applicationdashboard/init.jsp" %>
<%
	ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();
	List<Application> lstApps = ApplicationLocalServiceUtil.findByCompany(serviceContext.getCompanyId());
%>
<div class="portlet-layout row-fluid">
<c:forEach items="<%= lstApps %>" var="appitem">
	<div class="portlet-column span6" style="height: 150px;">
			<portlet:resourceURL var="bigIconResourceURL">
				<portlet:param name="icon" value="bigIcon"/>
				<portlet:param name="applicationId" value="${appitem.applicationId}"/>
			</portlet:resourceURL>				
		
			<img style="height: 100px;" src="<%= bigIconResourceURL.toString() %>" class="img-circle">
			<%
				List<AppMessage> lstAppMessages = AppMessageLocalServiceUtil.findByApplicationUser(((Application)pageContext.findAttribute("appitem")).getAppCode(), user.getScreenName(), serviceContext);
			%>
			<br/>
			<ul>
				<c:forEach items="<%= lstAppMessages %>" var="appmessage">
					<li>
						${ appmessage.messageText }
					</li>
				</c:forEach>
			</ul>
	</div>
</c:forEach>
</div>