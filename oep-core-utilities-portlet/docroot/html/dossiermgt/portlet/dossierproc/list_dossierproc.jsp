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

<%@page import="com.liferay.portal.kernel.dao.search.DisplayTerms"%>
<%@page import="org.oep.core.dossiermgt.model.DossierProc"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="org.oep.core.dossiermgt.service.DossierProcLocalServiceUtil"%>
<%@page import="org.oep.core.utilities.dossiermgt.DossierProcKeys"%>
<%@page import="org.oep.core.utilities.dossiermgt.PortletKeys"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.service.ServiceContextThreadLocal"%>
<%@page import="java.util.Collection"%>
<%@page import="com.liferay.portal.service.ServiceContext"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="com.liferay.portal.model.User"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ include file="/html/dossiermgt/portlet/dossierproc/init.jsp" %>
<portlet:defineObjects />
<%
	int cur = ParamUtil.getInteger(request, PortletKeys.SearchContainer.CURRENT_PAGE, PortletKeys.PAGE);
	int delta = ParamUtil.getInteger(request, PortletKeys.SearchContainer.DELTA, PortletKeys.DELTA);
	PortletURL iteratorUrl = renderResponse.createRenderURL();
	iteratorUrl.setParameter(DossierProcKeys.SearchAttributes.NAME, String.valueOf(ParamUtil.getString(request, DossierProcKeys.SearchAttributes.NAME, PortletKeys.TEXT_BOX)));
	
	DateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
	
	String name = ParamUtil.getString(request, DossierProcKeys.SearchAttributes.NAME, PortletKeys.TEXT_BOX);
	Date effectDate = ParamUtil.getDate(request, DossierProcKeys.SearchAttributes.EFFECTDATE, simpleDateFormat, null);
	Date expireDate = ParamUtil.getDate(request, DossierProcKeys.SearchAttributes.EXPIREDATE, simpleDateFormat, null);
	int active = ParamUtil.getInteger(request, DossierProcKeys.SearchAttributes.ACTIVE, -1);
	
	ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();	
	
	DossierProcLocalServiceUtil.countByCustomCondition(name, effectDate, expireDate, active, serviceContext);
	String currentURL = PortalUtil.getCurrentURL(request);
	String redirect = PortalUtil.getCurrentURL(renderRequest);
%>
<portlet:renderURL var="addDossierProc">
	<portlet:param name="mvcPath" value="/html/dossiermgt/portlet/dossierproc/edit_dossierproc.jsp"/>
</portlet:renderURL>
<liferay-portlet:renderURL varImpl="dossierProcSearchURL">
	<portlet:param name="mvcPath" value="/html/dossiermgt/portlet/dossierproc/list_dossierproc.jsp" />
</liferay-portlet:renderURL>
<aui:button-row>
    <portlet:renderURL var="addDossierProcURL">
        <portlet:param name="mvcPath" value="/html/dossiermgt/portlet/dossierproc/edit_dossierproc.jsp" />
        <portlet:param name="redirect" value="<%= redirect %>" />
    </portlet:renderURL>

    <aui:button onClick="<%= addDossierProcURL.toString() %>" value="org.oep.core.utilities.dossiermgt.portlet.dossierproc.button.add" />
</aui:button-row>

<aui:form action="<%= dossierProcSearchURL %>" method="get" name="dossierProcForm">
	<liferay-portlet:renderURLParams varImpl="dossierProcSearchURL" />
	<liferay-portlet:renderURL varImpl="iteratorURL">
		<portlet:param name="name" value="<%= name %>" />
		<portlet:param name="mvcPath" value="/html/dossiermgt/portlet/dossierproc/list_dossierproc.jsp" />
	</liferay-portlet:renderURL>
	<liferay-ui:search-container displayTerms="<%= new DisplayTerms(renderRequest) %>"
		emptyResultsMessage="org.oep.core.utilities.dossiermgt.portlet.doctemplate.table.warning.empty"
		headerNames="<%= LanguageUtil.get(pageContext, \"org.oep.core.utilities.dossiermgt.portlet.doctemplate.table.header.title\") %>"
		iteratorURL="<%= iteratorURL %>"
	>
		<liferay-ui:search-form
			page="/html/dossiermgt/portlet/dossierproc/dossierproc_search.jsp"
			servletContext="<%= application %>"
		/>
<liferay-ui:search-container-results>
		<%
			DisplayTerms displayTerms =searchContainer.getDisplayTerms();
			total = DossierProcLocalServiceUtil.countByCustomCondition(name, effectDate, expireDate, active, serviceContext);
			searchContainer.setTotal(total);
			searchContainer.setResults(DossierProcLocalServiceUtil.findByCustomCondition(name, effectDate, expireDate, active, searchContainer.getStart(), searchContainer.getEnd(), serviceContext));				
		%>
		</liferay-ui:search-container-results>
		<liferay-ui:search-container-row
			className="DossierProc"
			keyProperty="dossierProcId"
			modelVar="currentDossierProc">
			<liferay-portlet:renderURL varImpl="rowURL">
				<portlet:param name="backURL" value="<%= currentURL %>" />
				<portlet:param name="mvcPath" value="/html/dossiermgt/portlet/dossierproc/display_dossierproc.jsp" />
				<portlet:param name="redirect" value="<%= currentURL %>" />
				<portlet:param name="dossierProcId" value="<%= String.valueOf(currentDossierProc.getDossierProcId()) %>" />
			</liferay-portlet:renderURL>
<liferay-ui:search-container-column-text
	href="<%= rowURL %>"
	name="name"
	property="name"
/>

	</liferay-ui:search-container-row>	
<liferay-ui:search-iterator searchContainer="<%=searchContainer %>" />
	</liferay-ui:search-container>
</aui:form>