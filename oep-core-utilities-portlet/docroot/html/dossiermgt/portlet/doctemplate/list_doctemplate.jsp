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

<%@page import="com.liferay.portal.kernel.log.LogFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.log.Log"%>
<%@page import="org.oep.core.dossiermgt.service.DocTemplateLocalServiceUtil"%>
<%@page import="org.oep.core.utilities.dossiermgt.DocTemplateKeys"%>
<%@page import="org.oep.core.dossiermgt.model.DocTemplate"%>
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

<portlet:renderURL var="addDocTemplate">
	<portlet:param name="mvcPath" value="/html/dossiermgt/portlet/doctemplate/edit_doctemplate.jsp"/>
</portlet:renderURL>
<liferay-portlet:renderURL varImpl="docTemplateSearchURL">
	<portlet:param name="mvcPath" value="/html/dossiermgt/portlet/doctemplate/list_doctemplate.jsp" />
</liferay-portlet:renderURL>
<aui:button-row>
    <portlet:renderURL var="addDocTemplateURL">
        <portlet:param name="mvcPath" value="/html/dossiermgt/portlet/doctemplate/edit_doctemplate.jsp" />
        <portlet:param name="redirect" value="<%= redirect %>" />
    </portlet:renderURL>

    <aui:button onClick="<%= addDocTemplateURL.toString() %>" value="org.oep.core.utilities.dossiermgt.portlet.doctemplate.button.add" />
</aui:button-row>
<aui:form action="<%= docTemplateSearchURL %>" method="get" name="docTemplateForm">
	<liferay-portlet:renderURLParams varImpl="docTemplateSearchURL" />
	<liferay-portlet:renderURL varImpl="iteratorURL">
		<portlet:param name="<%= DocTemplateKeys.SearchAttributes.TITLE %>" value="<%= title %>" />
		<portlet:param name="mvcPath" value="/html/dossiermgt/portlet/doctemplate/list_doctemplate.jsp" />
	</liferay-portlet:renderURL>
	<liferay-ui:search-container displayTerms="<%= new DisplayTerms(renderRequest) %>"
		emptyResultsMessage="org.oep.core.utilities.dossiermgt.portlet.doctemplate.table.warning.empty"
		headerNames="<%= LanguageUtil.get(pageContext, \"org.oep.core.utilities.dossiermgt.portlet.doctemplate.table.header.title\") %>"
		iteratorURL="<%= iteratorURL %>"
	>
		<liferay-ui:search-form
			page="/html/dossiermgt/portlet/doctemplate/doctemplate_search.jsp"
			servletContext="<%= application %>" searchContainer="<%= searchContainer %>"
		/>
<liferay-ui:search-container-results>
		<%
			DisplayTerms displayTerms =searchContainer.getDisplayTerms();
			if (displayTerms.isAdvancedSearch()) {
				total = DocTemplateLocalServiceUtil.countByGroupLikeTitle(title, serviceContext);
				searchContainer.setTotal(total);
				searchContainer.setResults(DocTemplateLocalServiceUtil.findByGroupLikeTitle(title, searchContainer.getStart(), searchContainer.getEnd(), serviceContext));								
			}
			else {
				String searchKeywords = displayTerms.getKeywords();
				total = DocTemplateLocalServiceUtil.countByGroupLikeTitle(searchKeywords, serviceContext);
				searchContainer.setTotal(total);
				searchContainer.setResults(DocTemplateLocalServiceUtil.findByGroupLikeTitle(searchKeywords, searchContainer.getStart(), searchContainer.getEnd(), serviceContext));								
			}
		%>
		</liferay-ui:search-container-results>
		<liferay-ui:search-container-row
			className="DocTemplate"
			keyProperty="docTemplateId"
			modelVar="currentDocTemplate">
			<liferay-portlet:renderURL varImpl="rowURL">
				<portlet:param name="backURL" value="<%= currentURL %>" />
				<portlet:param name="mvcPath" value="/html/dossiermgt/portlet/doctemplate/display_doctemplate.jsp" />
				<portlet:param name="redirect" value="<%= currentURL %>" />
				<portlet:param name="docTemplateId" value="<%= String.valueOf(currentDocTemplate.getDocTemplateId()) %>" />
			</liferay-portlet:renderURL>
<liferay-ui:search-container-column-text
	href="<%= rowURL %>"
	name="<%= LanguageUtil.get(pageContext, \"org.oep.core.utilities.dossiermgt.portlet.doctemplate.table.header.templateno\") %>" property="templateNo"/>

<liferay-ui:search-container-column-text
	href="<%= rowURL %>"
	name="<%= LanguageUtil.get(pageContext, \"org.oep.core.utilities.dossiermgt.portlet.doctemplate.table.header.title\") %>"
	property="title"
/>

<liferay-ui:search-container-column-text
	href="<%= rowURL %>"
	name="<%= LanguageUtil.get(pageContext, \"org.oep.core.utilities.dossiermgt.portlet.doctemplate.table.header.entitle\") %>"
	property="enTitle"
/>
<liferay-ui:search-container-column-jsp
    align="right"
    path="/html/dossiermgt/portlet/doctemplate/doctemplate_actions.jsp"
/>
	</liferay-ui:search-container-row>	
<liferay-ui:search-iterator searchContainer="<%=searchContainer %>" />
	</liferay-ui:search-container>
</aui:form>