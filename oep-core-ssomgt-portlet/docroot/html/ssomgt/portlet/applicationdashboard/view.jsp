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

<%@page import="org.oep.core.ssomgt.action.PortletKeys"%>
<%@ include file="/html/ssomgt/portlet/applicationdashboard/init.jsp" %>
<%
	long applicationId = ParamUtil.getLong(request, "applicationId", PortletKeys.LONG_DEFAULT);
	applicationId = 38801;
%>
	<portlet:resourceURL var="bigIconResourceURL">
		<portlet:param name="icon" value="bigIcon"/>
		<portlet:param name="applicationId" value="<%= String.valueOf(applicationId) %>"/>
	</portlet:resourceURL>				

<img style="width: 100%;" src="<%= bigIconResourceURL.toString() %>" class="img-circle">
