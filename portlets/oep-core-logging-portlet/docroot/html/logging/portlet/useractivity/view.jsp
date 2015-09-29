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
 
<%@page import="org.oep.core.logging.UserLogKeys"%>
<%@ include file="/html/logging/portlet/useractivity/init.jsp" %>

<portlet:renderURL var="tabNguoiDung">
	<portlet:param name="tab" value="<%= UserLogKeys.TAB_NGUOIDUNG %>"/>
</portlet:renderURL>
<portlet:renderURL var="tabHanhDong">
	<portlet:param name="tab" value="<%= UserLogKeys.TAB_HANHDONG %>"/>
</portlet:renderURL>

<%
String tab = ParamUtil.get(request, "tab", UserLogKeys.TAB_NGUOIDUNG);
%>
<div id="oep-tab">
	<ul class="oep-tab">
		<li>
			<a href="<%=tabNguoiDung.toString() %>" class="<%= tab.equals(UserLogKeys.TAB_HANHDONG) ? "" : "active" %>" >
				<liferay-ui:message key="org.oep.useractivity.title.xemtheonguoidung" />
			</a>
		</li>
		<li>
			<a href="<%=tabHanhDong.toString()%>" class="<%= tab.equals(UserLogKeys.TAB_HANHDONG) ? "active" : "" %>" >
				<liferay-ui:message key="org.oep.useractivity.title.xemtheohanhdong" />
			</a>
		</li>
	</ul>
</div>
<c:choose>
	<c:when test='<%= tab.equals(UserLogKeys.TAB_HANHDONG)%>'>
		<jsp:include page="/html/logging/portlet/useractivity/danhsach_theohanhdong.jsp"/>
	</c:when>
	<c:when test='<%= tab.equals(UserLogKeys.TAB_NGUOIDUNG)%>'>
		<jsp:include page="/html/logging/portlet/useractivity/danhsach_theonguoidung.jsp"/>
	</c:when>
	<c:when test='<%= tab.equals(UserLogKeys.TAB_CHITIET)%>'>
		<jsp:include page="/html/logging/portlet/useractivity/chitiet.jsp"/>
	</c:when>
</c:choose>

