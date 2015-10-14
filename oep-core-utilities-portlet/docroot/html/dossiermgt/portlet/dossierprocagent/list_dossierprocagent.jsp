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
<%@page import="org.oep.core.dossiermgt.model.DossierProcAgent"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="org.oep.core.dossiermgt.service.DossierProcAgentLocalServiceUtil"%>
<%@page import="org.oep.core.utilities.dossiermgt.DossierProcAgentKeys"%>
<%@page import="org.oep.core.utilities.dossiermgt.PortletKeys"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.service.ServiceContextThreadLocal"%>
<%@page import="java.util.Collection"%>
<%@page import="com.liferay.portal.service.ServiceContext"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="com.liferay.portal.model.User"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ include file="/html/dossiermgt/portlet/dossierprocagent/init.jsp" %>
<portlet:defineObjects />
<%
	int cur = ParamUtil.getInteger(request, PortletKeys.SearchContainer.CURRENT_PAGE, PortletKeys.PAGE);
	int delta = ParamUtil.getInteger(request, PortletKeys.SearchContainer.DELTA, PortletKeys.DELTA);
	PortletURL iteratorUrl = renderResponse.createRenderURL();
	iteratorUrl.setParameter(DossierProcAgentKeys.SearchAttributes.GOV_AGENCY_ID, String.valueOf(ParamUtil.getString(request, DossierProcAgentKeys.SearchAttributes.GOV_AGENCY_ID, PortletKeys.TEXT_BOX)));
		
	ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();		
%>
<portlet:renderURL var="addDossierProcAgent">
	<portlet:param name="mvcPath" value="/html/dossiermgt/portlet/dossierprocagent/edit_dossierprocagent.jsp"/>
</portlet:renderURL>
<liferay-portlet:renderURL varImpl="dossierProcAgentSearchURL">
	<portlet:param name="mvcPath" value="/html/dossiermgt/portlet/dossierprocagent/list_dossierprocagent.jsp" />
</liferay-portlet:renderURL>
<aui:button-row>
    <portlet:renderURL var="addDossierProcAgentURL">
        <portlet:param name="mvcPath" value="/html/dossiermgt/portlet/dossierprocagent/edit_dossierprocagent.jsp" />
        <portlet:param name="redirect" value="<%= redirect %>" />
    </portlet:renderURL>

    <aui:button onClick="<%= addDossierProcAgentURL.toString() %>" value="org.oep.core.utilities.dossiermgt.portlet.dossierprocagent.button.add" />
</aui:button-row>

<aui:form action="<%= dossierProcAgentSearchURL %>" method="get" name="dossierProcAgentForm">
	<liferay-portlet:renderURLParams varImpl="dossierProcAgentSearchURL" />
	<liferay-portlet:renderURL varImpl="iteratorURL">
		<portlet:param name="govAgencyId" value="<%= govAgencyId %>" />
		<portlet:param name="mvcPath" value="/html/dossiermgt/portlet/dossierprocagent/list_dossierprocagent.jsp" />
	</liferay-portlet:renderURL>
	<liferay-ui:search-container displayTerms="<%= new DisplayTerms(renderRequest) %>"
		emptyResultsMessage="org.oep.core.utilities.dossiermgt.portlet.dossierprocagent.table.warning.empty"
		headerNames="<%= LanguageUtil.get(pageContext, \"org.oep.core.utilities.dossiermgt.portlet.dossierprocagent.table.header.govagencyname\") %>"
		iteratorURL="<%= iteratorURL %>"
	>
		<liferay-ui:search-form
			page="/html/dossiermgt/portlet/dossierprocagent/dossierprocagent_search.jsp"
			servletContext="<%= application %>"
		/>
<liferay-ui:search-container-results>
		<%
			DisplayTerms displayTerms =searchContainer.getDisplayTerms();
			//total = DossierProcAgentLocalServiceUtil.countByCustomCondition(name, effectDate, expireDate, active, serviceContext);
			//searchContainer.setTotal(total);
			//searchContainer.setResults(DossierProcAgentLocalServiceUtil.findByCustomCondition(name, effectDate, expireDate, active, searchContainer.getStart(), searchContainer.getEnd(), serviceContext));				
		%>
		</liferay-ui:search-container-results>
		<liferay-ui:search-container-row
			className="DossierProcAgent"
			keyProperty="dossierProcAgentId"
			modelVar="currentDossierProcAgent">
			<liferay-portlet:renderURL varImpl="rowURL">
				<portlet:param name="backURL" value="<%= currentURL %>" />
				<portlet:param name="mvcPath" value="/html/dossiermgt/portlet/dossierprocagent/display_dossierprocagent.jsp" />
				<portlet:param name="redirect" value="<%= currentURL %>" />
				<portlet:param name="dossierProcAgentId" value="<%= String.valueOf(currentDossierProcAgent.getDossierProcAgentId()) %>" />
			</liferay-portlet:renderURL>
<liferay-ui:search-container-column-text
	href="<%= rowURL %>"
	name="<%= LanguageUtil.get(pageContext, \"org.oep.core.utilities.dossiermgt.portlet.dossierprocagent.table.header.name\") %>"
	property="name"
/>

<liferay-ui:search-container-column-text
	href="<%= rowURL %>"
	name="<%= LanguageUtil.get(pageContext, \"org.oep.core.utilities.dossiermgt.portlet.dossierprocagent.table.header.resultsdescription\") %>"
	property="resultsDescription"
/>
<liferay-ui:search-container-column-jsp
    align="right"
    path="/html/dossiermgt/portlet/dossierprocagent/dossierprocagent_actions.jsp"
/>

	</liferay-ui:search-container-row>	
<liferay-ui:search-iterator searchContainer="<%=searchContainer %>" />
	</liferay-ui:search-container>
</aui:form>