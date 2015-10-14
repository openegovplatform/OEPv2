<%@page import="org.oep.core.utilities.dossiermgt.PortletKeys"%>
<%@page import="org.oep.core.utilities.dossiermgt.DossierProcAgentKeys"%>
<%@page import="com.liferay.portal.kernel.dao.search.DisplayTerms"%>
<%@ include file="/html/dossiermgt/portlet/dossierprocagent/init.jsp" %>
<%
	SearchContainer searchContainer = (SearchContainer)request.getAttribute("liferay-ui:search:searchContainer");
	DisplayTerms displayTerms = searchContainer.getDisplayTerms();
%>
<liferay-ui:search-toggle
	buttonLabel="org.oep.core.utilities.dossiermgt.portlet.dossierprocagent.button.search"
	displayTerms="<%= displayTerms %>"
	id="toggle_id_dossierprocagent_search">
	<aui:input label="<%= LanguageUtil.get(pageContext, \"org.oep.core.utilities.dossiermgt.portlet.dossierprocagent.empty\") %>" name="govAgencyId" value="<%= govAgencyId %>" />
</liferay-ui:search-toggle>