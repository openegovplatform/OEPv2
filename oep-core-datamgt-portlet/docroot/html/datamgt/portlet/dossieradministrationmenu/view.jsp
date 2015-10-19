<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.service.ServiceContextThreadLocal"%>
<%@page import="com.liferay.portal.service.ServiceContext"%>
<%@page import="org.oep.core.datamgt.dictionary.service.DictDataLocalServiceUtil"%>
<%@page import="java.util.List"%>
<%@page import="org.oep.core.datamgt.dictionary.model.DictData"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

<%
	ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();
	int total = DictDataLocalServiceUtil.countDictDataByTreeLevel("OEP_DOSSIER_ADMINISTRATION", serviceContext);
	//List<DictData> lstDictData = DictDataLocalServiceUtil.getDictDatasByCollection("OEP_DOSSIER_ADMINISTRATION", 2, serviceContext);
	List<DictData> lstDictData = DictDataLocalServiceUtil.getByTreeLevel("OEP_DOSSIER_ADMINISTRATION", 0, total, serviceContext);

	int totalDomain = DictDataLocalServiceUtil.countDictDataByTreeLevel("OEP_DOSSIER_DOMAIN", serviceContext);
	List<DictData> lstDictDataDomain = DictDataLocalServiceUtil.getByTreeLevel("OEP_DOSSIER_DOMAIN", 0, totalDomain, serviceContext);

	long dictDataId = ParamUtil.getLong(request, "dictDataId");
	String changeValue = ParamUtil.getString(request, "changeValue");
	String l1 = "";
	String l2 = "&nbsp;&nbsp;&nbsp;&nbsp;";
	String l3 = "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
	String l4 = "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
	String l5 = "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";	
%>
<portlet:actionURL var="changeAdministration" name="changeAdministrationAndDomain">
	<portlet:param name="changeValue" value="ADMINISTRATION" />
</portlet:actionURL>
<portlet:actionURL var="changeDomain" name="changeAdministrationAndDomain">
	<portlet:param name="changeValue" value="DOMAIN" />
</portlet:actionURL>

<ul class="nav nav-tabs">
	<%
		if ("ADMINISTRATION".equals(changeValue)) {
	%>
	<li role="presentation" class="active"><a href="<%= changeAdministration.toString() %>"><%= LanguageUtil.get(pageContext, "org.oep.core.datamgt.portlet.dossieradministrationmenu.administration.title") %></a></li>
	<li role="presentation"><a href="<%= changeDomain.toString() %>"><%= LanguageUtil.get(pageContext, "org.oep.core.datamgt.portlet.dossieradministrationmenu.domain.title") %></a></li>
	<% } else { %>
	<li role="presentation"><a href="<%= changeAdministration.toString() %>"><%= LanguageUtil.get(pageContext, "org.oep.core.datamgt.portlet.dossieradministrationmenu.administration.title") %></a></li>
	<li role="presentation" class="active"><a href="<%= changeDomain.toString() %>"><%= LanguageUtil.get(pageContext, "org.oep.core.datamgt.portlet.dossieradministrationmenu.domain.title") %></a></li>
	<% } %>
</ul>
<%
	if ("ADMINISTRATION".equals(changeValue)) {
%>
<ul class="nav nav-pills nav-stacked">
<%
	for (DictData data : lstDictData) {
%>
	<portlet:actionURL var="actionUrl" name="processAdministrationEvent">
		<portlet:param name="dictDataId" value="<%= String.valueOf(data.getDictDataId()) %>" />
		<portlet:param name="changeValue" value="ADMINISTRATION" />
	</portlet:actionURL>
	<%
		if (dictDataId == data.getDictDataId()) {
	%>
	<li role="presentation" class="active"><a href="<%= actionUrl.toString() %>"><%= (data.getDataLevel() == 1 ? l1 : (data.getDataLevel() == 2 ? l2 : (data.getDataLevel() == 3 ? l3 : (data.getDataLevel() == 4 ? l4 : l5)))) %><%= data.getTitle() %></a></li>
	<%
		} else {
	%>
	<li role="presentation"><a href="<%= actionUrl.toString() %>"><%= (data.getDataLevel() == 1 ? l1 : (data.getDataLevel() == 2 ? l2 : (data.getDataLevel() == 3 ? l3 : (data.getDataLevel() == 4 ? l4 : l5)))) %><%= data.getTitle() %></a></li>
	<%
		}
	%>
<%
	}
%>
</ul>
<% } else { %>
<ul class="nav nav-pills nav-stacked">
<%
	for (DictData data : lstDictDataDomain) {
%>
	<portlet:actionURL var="actionUrlDomain" name="processDomainEvent">
		<portlet:param name="dictDataId" value="<%= String.valueOf(data.getDictDataId()) %>" />
		<portlet:param name="changeValue" value="DOMAIN" />
	</portlet:actionURL>
	<%
		if (dictDataId == data.getDictDataId()) {
	%>
	<li role="presentation" class="active"><a href="<%= actionUrlDomain.toString() %>"><%= (data.getDataLevel() == 1 ? l1 : (data.getDataLevel() == 2 ? l2 : (data.getDataLevel() == 3 ? l3 : (data.getDataLevel() == 4 ? l4 : l5)))) %><%= data.getTitle() %></a></li>
	<%
		} else {
	%>
	<li role="presentation"><a href="<%= actionUrlDomain.toString() %>"><%= (data.getDataLevel() == 1 ? l1 : (data.getDataLevel() == 2 ? l2 : (data.getDataLevel() == 3 ? l3 : (data.getDataLevel() == 4 ? l4 : l5)))) %><%= data.getTitle() %></a></li>
	<%
		}
	%>
<%
	}
%>
</ul>
<% } %>