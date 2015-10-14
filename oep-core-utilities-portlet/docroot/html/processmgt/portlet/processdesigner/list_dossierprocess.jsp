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

<%@page import="org.oep.core.processmgt.model.DossierProcess"%>
<%@page import="org.oep.core.processmgt.service.DossierProcessLocalServiceUtil"%>
<%@page import="com.liferay.portal.service.ServiceContextThreadLocal"%>
<%@page import="com.liferay.portal.service.ServiceContext"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ include file="init.jsp" %>

<portlet:defineObjects />
<%	
	ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();	
	String currentURL = PortalUtil.getCurrentURL(request);
	String redirect = PortalUtil.getCurrentURL(renderRequest);
%>

<liferay-portlet:renderURL varImpl="dossierProcessSearchURL">
	<portlet:param name="mvcPath" value="/html/processmgt/portlet/processdesigner/list_dossierprocess.jsp" />
</liferay-portlet:renderURL>
<aui:form action="<%= dossierProcessSearchURL %>" method="get" name="dossierProcessForm">
	<liferay-portlet:renderURLParams varImpl="dossierProcessSearchURL" />
	<liferay-portlet:renderURL varImpl="iteratorURL">
		<portlet:param name="mvcPath" value="/html/processmgt/portlet/processdesigner/list_dossierprocess.jsp" />
	</liferay-portlet:renderURL>
	<liferay-ui:search-container displayTerms="<%= new DisplayTerms(renderRequest) %>"
		emptyResultsMessage="org.oep.core.utilities.processmgt.portlet.dossierprocess.table.warning.empty"
		headerNames="<%= LanguageUtil.get(pageContext, \"org.oep.core.utilities.processmgt.portlet.dossierprocess.table.header.govagencyname\") %>"
		iteratorURL="<%= iteratorURL %>"
	>
		<liferay-ui:search-form
			page="/html/processmgt/portlet/processdesigner/dossierprocess_search.jsp"
			servletContext="<%= application %>" searchContainer="<%= searchContainer %>"
		/>
<liferay-ui:search-container-results>
		<%
			DisplayTerms displayTerms =searchContainer.getDisplayTerms();
			if (displayTerms.isAdvancedSearch()) {
				total = DossierProcessLocalServiceUtil.countByCompany(serviceContext);
				searchContainer.setTotal(total);
				searchContainer.setResults(DossierProcessLocalServiceUtil.getByCompany(searchContainer.getStart(), searchContainer.getEnd(), serviceContext));								
			}
			else {
				String searchKeywords = displayTerms.getKeywords();
				total = DossierProcessLocalServiceUtil.countByCompany(serviceContext);
				searchContainer.setTotal(total);
				searchContainer.setResults(DossierProcessLocalServiceUtil.getByCompany(searchContainer.getStart(), searchContainer.getEnd(), serviceContext));								
			}
		%>
		</liferay-ui:search-container-results>
	<liferay-ui:search-container-row
			className="DossierProcess"
			keyProperty="dossierProcessId"
			modelVar="currentDossierProcess">
			<liferay-portlet:renderURL varImpl="rowURL">
				<portlet:param name="backURL" value="<%= currentURL %>" />
				<portlet:param name="mvcPath" value="/html/processmgt/portlet/processdesigner/designer.jsp" />
				<portlet:param name="redirect" value="<%= currentURL %>" />
				<portlet:param name="dossierProcessId" value="<%= String.valueOf(currentDossierProcess.getDossierProcessId()) %>" />
			</liferay-portlet:renderURL>
		<liferay-ui:search-container-column-text
			href="<%= rowURL %>"
			name="<%= LanguageUtil.get(pageContext, \"org.oep.core.utilities.processmgt.portlet.dossierprocess.table.header.govagencyname\") %>" property="govAgencyName"/>

		<liferay-ui:search-container-column-jsp
		    align="right"
		    path="/html/processmgt/portlet/dossierprocess/dossierprocess_actions.jsp"
		/>
	</liferay-ui:search-container-row>	
<liferay-ui:search-iterator searchContainer="<%=searchContainer %>" />
	</liferay-ui:search-container>
</aui:form>