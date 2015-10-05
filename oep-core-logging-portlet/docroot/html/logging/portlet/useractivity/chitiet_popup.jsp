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
 
<%@page import="org.oep.core.logging.model.UserActivity"%>
<%@page import="org.oep.core.logging.service.UserActivityLocalServiceUtil"%>
<%@page import="org.oep.core.logging.util.DateUtil"%>
<%@ include file="/html/logging/portlet/useractivity/init.jsp"%>

<%
long useractivityId = ParamUtil.getLong(request, "nguoiDungLichSuId", 0);
UserActivity logNguoiDung =UserActivityLocalServiceUtil.getUserActivity(useractivityId);
%>
<c:if test="<%= logNguoiDung != null %>">
	<fieldset>
		<div style="height:auto;">
			<%
			out.println("<strong> "+ DateUtil.parseDateToString(logNguoiDung.getCreateDate(), DateUtil.DATE_FORMAT_D_M_Y_H_M_S) +"</strong> &nbsp;&nbsp;&nbsp;<span style='color:blue'> "+logNguoiDung.getIp() +"</span><br>");
			out.println(logNguoiDung.getUserName()+" &nbsp;&nbsp;&nbsp;"+logNguoiDung.getEmail()+"<br/>");
			
			out.println("<strong> "+ LanguageUtil.get(pageContext, "org.oep.useractivity.label.trang")+"</strong>: "+logNguoiDung.getPage()+"<br/>");
			out.println("<strong> "+ LanguageUtil.get(pageContext, "org.oep.useractivity.label.hanhdong")+"</strong>: "+logNguoiDung.getAction()+"<br/>");
			out.println("<strong> "+ LanguageUtil.get(pageContext, "org.oep.useractivity.label.mota")+"</strong>: <br/> "+logNguoiDung.getDescription()+"<br/>");

			out.println("<strong> "+ LanguageUtil.get(pageContext, "org.oep.useractivity.label.url")+"</strong>: "+logNguoiDung.getUrl()+"<br/>");
			out.println("<strong> "+ LanguageUtil.get(pageContext, "org.oep.useractivity.label.userAgent")+"</strong>:<br/> "+logNguoiDung.getUserAgent());
			%>
		</div>
	</fieldset>
</c:if>