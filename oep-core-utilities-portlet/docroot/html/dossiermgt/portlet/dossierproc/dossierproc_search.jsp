<%@page import="org.oep.core.utilities.dossiermgt.PortletKeys"%>
<%@page import="org.oep.core.utilities.dossiermgt.DossierProcKeys"%>
<%@page import="com.liferay.portal.kernel.dao.search.DisplayTerms"%>
<%@ include file="/html/dossiermgt/portlet/dossierproc/init.jsp" %>
<%
	SearchContainer searchContainer = (SearchContainer)request.getAttribute("liferay-ui:search:searchContainer");
	DisplayTerms displayTerms = searchContainer.getDisplayTerms();
	String name = ParamUtil.getString(request, DossierProcKeys.SearchAttributes.NAME, PortletKeys.TEXT_BOX);	
%>
<liferay-ui:search-toggle
	buttonLabel="org.oep.core.utilities.dossiermgt.portlet.dossierproc.button.search"
	displayTerms="<%= displayTerms %>"
	id="toggle_id_dossierproc_search">
	<aui:input label="<%= LanguageUtil.get(pageContext, \"org.oep.core.utilities.dossiermgt.portlet.dossierproc.empty\") %>" name="name" value="<%= name %>" />
</liferay-ui:search-toggle>