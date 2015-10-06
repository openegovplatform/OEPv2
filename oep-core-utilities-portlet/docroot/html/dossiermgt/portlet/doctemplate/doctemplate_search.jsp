<%@ include file="init.jsp" %>

<%
	SearchContainer searchContainer = (SearchContainer)request.getAttribute("liferay-ui:search:searchContainer");
	DisplayTerms displayTerms = searchContainer.getDisplayTerms();
%>
<liferay-ui:search-toggle
	buttonLabel="org.oep.core.utilities.dossiermgt.portlet.doctemplate.button.search"
		displayTerms="<%= displayTerms %>" id="toggle_id_doctemplate_search">
	<aui:input label="<%= LanguageUtil.get(pageContext, \"org.oep.core.utilities.dossiermgt.portlet.doctemplate.title.search\") %>" name="<%= DocTemplateKeys.SearchAttributes.TITLE %>" value="<%= title %>" />
</liferay-ui:search-toggle>
