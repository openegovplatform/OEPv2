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


<liferay-portlet:actionURL portletConfiguration="true" var="configurationURL" />

<%
//boolean showLocationAddress_cfg = GetterUtil.getBoolean(portletPreferences.getValue("showLocationAddress", StringPool.TRUE));
//<%= Constants.CMD
 //Constants.UPDATE
 //showLocationAddress_cfg
%>

<aui:form action="<%= configurationURL %>" method="post" name="fm">
    <aui:input name="" type="hidden" value="<%= %>" />

    <aui:input name="preferences--showLocationAddress--" type="checkbox" value="<%=  %>" />

    <aui:button-row>
       <aui:button type="submit" />
    </aui:button-row>
</aui:form>

