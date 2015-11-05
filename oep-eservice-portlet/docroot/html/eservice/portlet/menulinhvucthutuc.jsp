<%--
/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
--%>
<%@ include file="/html/eservice/init.jsp"%>

<%@page import="org.oep.datamgt.service.DictDataLocalServiceUtil"%>
<%@page import="org.oep.datamgt.model.DictData"%>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<%
    String redirect = PortalUtil.getCurrentURL(renderRequest);
%>

<%
String tabs1 = ParamUtil.getString(request, "tabs1", "one");

String tabs1Names = LanguageUtil.get(pageContext, "org.oep.eservice.linhvucthutuc.title") + 
                    "," + LanguageUtil.get(pageContext, "org.oep.eservice.capcoquanquanly.title");
PortletURL portletURL = renderResponse.createRenderURL();
portletURL.setParameter("struts_action", "/eservice/menulinhvucthutuc");
portletURL.setParameter("tabs1", tabs1);

//if (!tabs1.equals("cart")) {
//	cartURL.setParameter("redirect", currentURL);
//}

// Back URL

String backURL = ParamUtil.getString(request, "backURL");
//tabsValues="one,two"
%>

<liferay-ui:tabs names="<%= tabs1Names %>" refresh="<%=false %>"
	url="<%= portletURL.toString() %>" value="<%=tabs1%>">
	<liferay-ui:section>
		<jsp:include page="linhvucthutuc.jsp" flush="true" />
		<portlet:param name="tabs1" value="one" />

	</liferay-ui:section>
	<liferay-ui:section>
		<jsp:include page="capcoquanquanly.jsp" flush="true" />
		<portlet:param name="tabs1" value="two" />
	</liferay-ui:section>
</liferay-ui:tabs>


