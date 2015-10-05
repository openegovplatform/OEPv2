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
<%@page import="org.oep.core.logging.service.UserActivityLocalServiceUtil"%>
<%@page import="com.liferay.portal.service.ServiceContextFactory"%>
<%@page import="com.liferay.portal.service.ServiceContext"%>
<%@ include file="/html/logging/portlet/useractivity/init.jsp"%>

<c:if test="<%= themeDisplay.isSignedIn() && user.isSetupComplete() %>">
<%
	ServiceContext serviceContext= ServiceContextFactory.getInstance(request);
	String oldURL= (String)session.getAttribute("Action.VIEW");	 
	if(oldURL == null || !oldURL.equals(serviceContext.getCurrentURL())){
	 	session.setAttribute("Action.VIEW", serviceContext.getCurrentURL());
	 	String mota ="<a href="+serviceContext.getCurrentURL()+" target='_blank'>Xem</a>";
	 	//UserActivityLocalServiceUtil.log("VIEW", mota, serviceContext);
	}
%>
</c:if>
