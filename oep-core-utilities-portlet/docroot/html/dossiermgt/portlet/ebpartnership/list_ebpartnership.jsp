<!-- 
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
-->

<%@page import="org.oep.core.dossiermgt.service.EbPartnerShipLocalServiceUtil"%>
<%@page import="org.oep.core.dossiermgt.model.EbPartnerShip"%>
<%@page import="org.oep.core.utilities.dossiermgt.EbPartnerShipKeys"%>
<%@page import="com.liferay.portal.kernel.log.LogFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.log.Log"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="org.oep.core.utilities.dossiermgt.PortletKeys"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.service.ServiceContextThreadLocal"%>
<%@page import="java.util.Collection"%>
<%@page import="com.liferay.portal.service.ServiceContext"%>
<%@page import="com.liferay.portal.model.User"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ include file="init.jsp" %>
<%	
	ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();	
%>

<portlet:renderURL var="addEbPartnerShip">
	<portlet:param name="mvcPath" value="/html/dossiermgt/portlet/ebpartnership/edit_ebpartnership.jsp"/>
</portlet:renderURL>
<liferay-portlet:renderURL varImpl="ebPartnerShipSearchURL">
	<portlet:param name="mvcPath" value="/html/dossiermgt/portlet/ebpartnership/list_ebpartnership.jsp" />
</liferay-portlet:renderURL>
<aui:button-row>
    <portlet:renderURL var="addEbPartnerShipURL">
        <portlet:param name="mvcPath" value="/html/dossiermgt/portlet/ebpartnership/edit_ebpartnership.jsp" />
        <portlet:param name="redirect" value="<%= redirect %>" />
    </portlet:renderURL>

    <aui:button onClick="<%= addEbPartnerShipURL.toString() %>" value="org.oep.core.utilities.dossiermgt.portlet.ebpartnership.button.add" />
</aui:button-row>
<aui:form action="<%= ebPartnerShipSearchURL %>" method="get" name="ebPartnerShipForm">
	<liferay-portlet:renderURLParams varImpl="ebPartnerShipSearchURL" />
	<liferay-portlet:renderURL varImpl="iteratorURL">
		<portlet:param name="<%= EbPartnerShipKeys.SearchAttributes.NAME %>" value="<%= name %>" />
		<portlet:param name="mvcPath" value="/html/dossiermgt/portlet/ebpartnership/list_ebpartnership.jsp" />
	</liferay-portlet:renderURL>
	<liferay-ui:search-container displayTerms="<%= new DisplayTerms(renderRequest) %>"
		emptyResultsMessage="org.oep.core.utilities.dossiermgt.portlet.ebpartnership.table.warning.empty"
		headerNames="<%= LanguageUtil.get(pageContext, \"org.oep.core.utilities.dossiermgt.portlet.ebpartnership.table.header.name\") %>"
		iteratorURL="<%= iteratorURL %>"
	>
		<liferay-ui:search-form
			page="/html/dossiermgt/portlet/ebpartnership/ebpartnership_search.jsp"
			servletContext="<%= application %>" searchContainer="<%= searchContainer %>"
		/>
<liferay-ui:search-container-results>
		<%
			DisplayTerms displayTerms =searchContainer.getDisplayTerms();
			if (displayTerms.isAdvancedSearch()) {
				total = EbPartnerShipLocalServiceUtil.countByGroupLikeName(name, serviceContext);
				searchContainer.setTotal(total);
				searchContainer.setResults(EbPartnerShipLocalServiceUtil.findByGroupLikeName(name, searchContainer.getStart(), searchContainer.getEnd(), serviceContext));								
			}
			else {
				String searchKeywords = displayTerms.getKeywords();
				total = EbPartnerShipLocalServiceUtil.countByGroupLikeName(searchKeywords, serviceContext);
				searchContainer.setTotal(total);
				searchContainer.setResults(EbPartnerShipLocalServiceUtil.findByGroupLikeName(searchKeywords, searchContainer.getStart(), searchContainer.getEnd(), serviceContext));								
			}
		%>
		</liferay-ui:search-container-results>
		<liferay-ui:search-container-row
			className="EbPartnerShip"
			keyProperty="ebPartnerShipId"
			modelVar="currentEbPartnerShip">
			<liferay-portlet:renderURL varImpl="rowURL">
				<portlet:param name="backURL" value="<%= currentURL %>" />
				<portlet:param name="mvcPath" value="/html/dossiermgt/portlet/ebpartnership/display_ebpartnership.jsp" />
				<portlet:param name="redirect" value="<%= currentURL %>" />
				<portlet:param name="ebPartnerShipId" value="<%= String.valueOf(currentEbPartnerShip.getEbPartnerShipId()) %>" />
			</liferay-portlet:renderURL>
<liferay-ui:search-container-column-text
	href="<%= rowURL %>"
	name="<%= LanguageUtil.get(pageContext, \"org.oep.core.utilities.dossiermgt.portlet.ebpartnership.table.header.name\") %>" property="name"/>

<liferay-ui:search-container-column-text
	href="<%= rowURL %>"
	name="<%= LanguageUtil.get(pageContext, \"org.oep.core.utilities.dossiermgt.portlet.ebpartnership.table.header.cpaid\") %>"
	property="cpaId"
/>

<liferay-ui:search-container-column-text
	href="<%= rowURL %>"
	name="<%= LanguageUtil.get(pageContext, \"org.oep.core.utilities.dossiermgt.portlet.ebpartnership.table.header.service\") %>"
	property="service"
/>

<liferay-ui:search-container-column-text
	href="<%= rowURL %>"
	name="<%= LanguageUtil.get(pageContext, \"org.oep.core.utilities.dossiermgt.portlet.ebpartnership.table.header.action\") %>"
	property="action"
/>

<liferay-ui:search-container-column-jsp
    align="right"
    path="/html/dossiermgt/portlet/ebpartnership/ebpartnership_actions.jsp"
/>
	</liferay-ui:search-container-row>	
<liferay-ui:search-iterator searchContainer="<%=searchContainer %>" />
	</liferay-ui:search-container>
</aui:form>