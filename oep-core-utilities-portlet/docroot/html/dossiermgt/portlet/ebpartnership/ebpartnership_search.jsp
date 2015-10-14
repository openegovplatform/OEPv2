<%@ include file="init.jsp" %>

<%
	SearchContainer searchContainer = (SearchContainer)request.getAttribute("liferay-ui:search:searchContainer");
	DisplayTerms displayTerms = searchContainer.getDisplayTerms();
%>
<liferay-ui:search-toggle
	buttonLabel="org.oep.core.utilities.dossiermgt.portlet.ebpartnership.button.search"
		displayTerms="<%= displayTerms %>" id="toggle_id_ebpartnership_search">
	<aui:input label="<%= LanguageUtil.get(pageContext, \"org.oep.core.utilities.dossiermgt.portlet.ebpartnership.title.search\") %>" name="<%= EbPartnerShipKeys.SearchAttributes.NAME %>" value="<%= name %>" />
</liferay-ui:search-toggle>
