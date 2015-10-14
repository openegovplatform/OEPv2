<%@page import="org.oep.core.datamgt.dictionary.service.DictDataLocalServiceUtil"%>
<%@page import="org.oep.core.datamgt.dictionary.model.DictData"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.service.ServiceContextThreadLocal"%>
<%@page import="com.liferay.portal.service.ServiceContext"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@page import="com.liferay.portlet.PortletURLUtil"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@taglib uri="http://liferay.com/tld/security" prefix="liferay-security" %>
<%@taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@taglib uri="http://liferay.com/tld/util" prefix="liferay-util" %>
<%@ page import="com.liferay.portal.kernel.util.Validator" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.liferay.portal.util.PortalUtil"%>
<%@ page import="com.liferay.portlet.PortletPreferencesFactoryUtil" %>
<%@ page import="javax.portlet.PortletMode"%>
<%@ page import="javax.portlet.WindowState"%>
<%@ page import="javax.portlet.PortletRequest" %>
<%@ page import="javax.portlet.PortletURL"%>
<%@ page import="javax.portlet.PortletPreferences" %>
<%@ page import="com.liferay.portal.kernel.dao.search.DisplayTerms" %>
<%@ page import="com.liferay.portal.kernel.dao.search.SearchContainer" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<portlet:defineObjects />
<liferay-portlet:renderURL varImpl="dossierProcSearchURL">
	<portlet:param name="mvcPath" value="/html/dossiermgt/portlet/dossierproc/view.jsp" />
</liferay-portlet:renderURL>

<h5><%= LanguageUtil.get(pageContext, "org.oep.core.dossiermgt.portlet.dossierproc.search.title") %></h5>
<aui:form action="<%= dossierProcSearchURL %>" method="get" name="dossierProcForm">
	<aui:input type="text" name="name" label="<%= LanguageUtil.get(pageContext, \"org.oep.core.dossiermgt.portlet.dossierproc.label.name\") %>"></aui:input>
	<aui:select name="domainNo" label="<%= LanguageUtil.get(pageContext, \"org.oep.core.dossiermgt.portlet.dossierproc.label.domainno\") %>">
	<%
		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();
		List<DictData> lstDomainData = DictDataLocalServiceUtil.getDictDatasByCollection("OEP_DOSSIER_DOMAIN", 1, serviceContext);
		for (DictData data : lstDomainData) {
	%>
		<aui:option value="<%= data.getDictDataId() %>"><%= data.getTitle() %></aui:option>
	<%
		}
	%>
	</aui:select>
	<%
	ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();
		List<DictData> lstDictData = DictDataLocalServiceUtil.getDictDatasByCollection("OEP_DOSSIER_ADMINISTRATION", 1, serviceContext);
	%>

	<aui:select name="administrationNo" label="<%= LanguageUtil.get(pageContext, \"org.oep.core.dossiermgt.portlet.dossierproc.label.administrationno\") %>">
	<%
		long dictDataId = ParamUtil.getLong(request, "dictDataId");
		System.out.println("Dict data id:" + dictDataId);
		for (DictData data : lstDictData) {
			if (data.getDictDataId() == dictDataId) {
				//System.out.println("Selected");
	%>
	<aui:option value="<%= data.getDictDataId() %>" selected="true"><%= data.getTitle() %></aui:option>
	<%
			} else {
	%>
	<aui:option value="<%= data.getDictDataId() %>" selected="false"><%= data.getTitle() %></aui:option>	
	<%	
			}
		}
		
	%>
	</aui:select>
	<div id="dossierProcedureTable"></div>
</aui:form>
<aui:script>
YUI().use(
		  'aui-datatable',
		  function(Y) {
		    var columns = ['name', 'address', 'city', 'state'];

		    var data = [
		      {address: '1236 Some Street', city: 'San Francisco', name: 'John A. Smith', state: 'CA'},
		      {address: '3271 Another Ave', city: 'New York', name: 'Joan B. Jones', state: 'NY'},
		      {address: '9996 Random Road', city: 'Los Angeles', name: 'Bob C. Uncle', state: 'CA'},
		      {address: '1623 Some Street', city: 'San Francisco', name: 'John D. Smith', state: 'CA'},
		      {address: '9899 Random Road', city: 'Los Angeles', name: 'Bob F. Uncle', state: 'CA'}
		    ];

		    new Y.DataTable.Base(
		      {
		        columnset: columns,
		        recordset: data
		      }
		    ).render('#dossierProcedureTable');
		  }
		);
</aui:script>