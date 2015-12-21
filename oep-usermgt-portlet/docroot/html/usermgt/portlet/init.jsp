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
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util" %>

<%@ page contentType="text/html; charset=UTF-8" %>


<%@ page import="com.liferay.util.portlet.PortletRequestUtil" %>
<%@ page import="com.liferay.util.xml.XMLFormatter" %>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@ page import="javax.portlet.PortletURL" %>

<%@ page import="java.util.List" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.TreeMap" %>
<%@ page import="com.liferay.portal.kernel.util.Validator" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.liferay.portal.util.PortalUtil"%>
<%@ page import="com.liferay.portlet.PortletPreferencesFactoryUtil" %>
<%@ page import="javax.portlet.PortletMode"%>
<%@ page import="javax.portlet.WindowState"%>
<%@ page import="javax.portlet.PortletRequest" %>
<%@ page import="javax.portlet.PortletURL"%>
<%@ page import="javax.portlet.PortletPreferences" %>
<%@ page import="com.liferay.portal.kernel.dao.search.DisplayTerms" %>
<%@ page import="com.liferay.portal.kernel.dao.search.SearchContainer" %>
<%@ page import="javax.portlet.PortletRequest" %>
<%@ page import="com.liferay.portal.kernel.util.FastDateFormatFactoryUtil" %>
<%@ page import="java.text.Format" %>
<%@ page import="com.liferay.portal.service.ServiceContextThreadLocal"%>
<%@ page import="com.liferay.portal.service.ServiceContext"%>
<%@ page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@ page import="com.liferay.portal.theme.ThemeDisplay"%>
<%@ page import="java.util.ArrayList"%>
<portlet:defineObjects />
<liferay-theme:defineObjects />

<%
int dockbarViewDelta = 3;
int fullViewDelta = 10;

Format simpleDateFormat = FastDateFormatFactoryUtil.getSimpleDateFormat("EEEE, MMMMM dd, yyyy 'at' h:mm a", themeDisplay.getLocale(), themeDisplay.getTimeZone());
%>
<%@ include file="/html/usermgt/portlet/init-ext.jsp" %>