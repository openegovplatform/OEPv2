<%@page import="com.liferay.portal.service.ServiceContextThreadLocal"%>
<%@page import="com.liferay.portal.service.ServiceContext"%>
<%@page import="org.oep.core.datamgt.dictionary.service.DictDataLocalServiceUtil"%>
<%@page import="java.util.List"%>
<%@page import="org.oep.core.datamgt.dictionary.model.DictData"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

<h4><%= LanguageUtil.get(pageContext, "org.oep.core.datamgt.portlet.dossieradministrationmenu.title") %></h4>
<%
	ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();
	List<DictData> lstDictData = DictDataLocalServiceUtil.getDictDatasByCollection("OEP_DOSSIER_ADMINISTRATION", 1, serviceContext);
%>
<ul>
<%
	for (DictData data : lstDictData) {
%>
	<portlet:actionURL var="actionUrl" name="processEvent">
		<portlet:param name="dictDataId" value="<%= String.valueOf(data.getDictDataId()) %>" />
	</portlet:actionURL>
	<li><a href="<%= actionUrl.toString() %>"><%= data.getTitle() %></a></li>
<%
	}
%>
</ul>