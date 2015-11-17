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

<%@page import="org.oep.ssomgt.action.PortletKeys"%>
<%@page import="org.oep.ssomgt.action.ApplicationKeys"%>
<%@page import="com.liferay.portal.service.ServiceContextThreadLocal"%>
<%@page import="com.liferay.portal.service.ServiceContext"%>
<%@page import="org.oep.ssomgt.service.ApplicationLocalServiceUtil"%>
<%@page import="org.oep.ssomgt.model.Application"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ include file="/html/ssomgt/portlet/applicationverticalmenu/init.jsp" %>
<%
	ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();
	List<Application> lstApps = ApplicationLocalServiceUtil.findByCompany(serviceContext);
%>
<ul class="unstyled">
<c:forEach items="<%= lstApps %>" var="appitem">
	<portlet:resourceURL var="smallIconResourceURL">
		<portlet:param name="icon" value="smallIcon"/>
		<portlet:param name="<%= ApplicationKeys.AddEditAttributes.EDIT_ID %>" value="${appitem.applicationId}"/>
	</portlet:resourceURL>				
	<li style="padding-bottom: 10px;">
		<a href="${appitem.appUrl}" target="_blank">
			<img style="width: 100%; height: 150px;" src="<%= smallIconResourceURL.toString() %>" class="img-rounded">
		</a>
	</li>
</c:forEach>
</ul>