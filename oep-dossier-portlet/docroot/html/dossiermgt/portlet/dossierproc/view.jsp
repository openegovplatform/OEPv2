<%@page import="java.util.ArrayList"%>
<%@page import="org.oep.dossiermgt.model.DossierProc"%>
<%@page import="org.oep.dossiermgt.service.DossierProcLocalServiceUtil"%>
<%@page import="org.oep.datamgt.service.DictDataLocalServiceUtil"%>
<%@page import="org.oep.datamgt.model.DictData"%>
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

<%
	int cur = ParamUtil.getInteger(request, "CURRENT_PAGE", 1);
	int delta = ParamUtil.getInteger(request, "DELTA", 1);
	PortletURL iteratorUrl = renderResponse.createRenderURL();
	iteratorUrl.setParameter("name", String.valueOf(ParamUtil.getString(request, "name", "")));
	iteratorUrl.setParameter("administrationNo", String.valueOf(ParamUtil.getString(request, "administrationNo", "")));
	iteratorUrl.setParameter("domainNo", String.valueOf(ParamUtil.getString(request, "domainNo", "")));	
	SearchContainer<DossierProc> searchContainer = new SearchContainer<DossierProc>(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, cur, delta, iteratorUrl, null, null);
	
	String name = ParamUtil.getString(request, "name", "");
	String administrationNo = ParamUtil.getString(request, "administrationNo", "");
	String domainNo = ParamUtil.getString(request, "domainNo", "");
	
	System.out.println("Name:" + name);
	System.out.println("Administration No:" + administrationNo);
	System.out.println("Domain no:" + domainNo);

	
	ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

	int total = DossierProcLocalServiceUtil.countByGroupCustomCondition(name, administrationNo, domainNo, null, null, 1, serviceContext);
	searchContainer.setTotal(total);
	List<DossierProc> datas = new ArrayList<DossierProc>();
	if (total > 0) {
		int startIndex = searchContainer.getStart();
		int endIndex = searchContainer.getEnd();
		datas = DossierProcLocalServiceUtil.findByGroupCustomCondition(name, administrationNo, domainNo, null, null, 1, startIndex, endIndex, serviceContext);
		searchContainer.setResults(datas);
	}

	System.out.println("Group: " + serviceContext.getScopeGroupId());
%>
<portlet:renderURL var="redirectURL">
	<portlet:param name="DELTA" value="<%= String.valueOf(ParamUtil.getInteger(request, \"DELTA\", 1)) %>"/>
	<portlet:param name="CURRENT_PAGE" value="<%= String.valueOf(ParamUtil.getInteger(request, \"CURRENT_PAGE\", 1)) %>"/>
</portlet:renderURL>
<portlet:renderURL var="searchDossierProc">
	<portlet:param name="DELTA" value="<%= String.valueOf(ParamUtil.getInteger(request, \"DELTA\", 1)) %>"/>
	<portlet:param name="CURRENT_PAGE" value="<%= String.valueOf(ParamUtil.getInteger(request, \"CURRENT_PAGE\", 1)) %>"/>	
</portlet:renderURL>

<liferay-portlet:renderURL varImpl="dossierProcSearchURL">
	<portlet:param name="mvcPath" value="/html/dossiermgt/portlet/dossierproc/view.jsp" />
</liferay-portlet:renderURL>

<h5><%= LanguageUtil.get(pageContext, "org.oep.dossiermgt.portlet.dossierproc.search.title") %></h5>
<aui:form action="<%= dossierProcSearchURL %>" method="POST" name="searchDossierProc">
	<aui:row>
		<aui:column columnWidth="50">
			<aui:input style="width: 80%" type="text" name="name" id="name" label="<%= LanguageUtil.get(pageContext, \"org.oep.dossiermgt.portlet.dossierproc.label.name\") %>"></aui:input>
		</aui:column>
		<aui:column columnWidth="50">
			<aui:select style="width: 80%" name="domainNo" id="domainNo" label="<%= LanguageUtil.get(pageContext, \"org.oep.dossiermgt.portlet.dossierproc.label.domainno\") %>">
				<aui:option value=""><%= LanguageUtil.get(pageContext, "org.oep.dossiermgt.portlet.dossierproc.label.search.alldomainno") %></aui:option>
			<%
				//List<DictData> lstDomainData = DictDataLocalServiceUtil.getDictDatasByCollection("OEP_DOSSIER_DOMAIN", 1, serviceContext);
				List<DictData> lstDomainData = DictDataLocalServiceUtil.getByCollectionNameTree("OEP_DOSSIER_DOMAIN", 0, serviceContext);
				String l1 = "";
				String l2 = "&nbsp;&nbsp;&nbsp;&nbsp;";
				String l3 = "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
				String l4 = "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
				String l5 = "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";	
				long dictDataId = ParamUtil.getLong(request, "dictDataDomainId");
				for (DictData data : lstDomainData) {
					if (data.getDictDataId() == dictDataId) {
						//System.out.println("Selected");
					%>
					<aui:option value="<%= data.getDataCode() %>" selected="true"><%= (data.getDataLevel() == 1 ? l1 : (data.getDataLevel() == 2 ? l2 : (data.getDataLevel() == 3 ? l3 : (data.getDataLevel() == 4 ? l4 : l5)))) %><%= data.getTitle() %></aui:option>
					<%
							} else {
					%>
					<aui:option value="<%= data.getDataCode() %>" selected="false"><%= (data.getDataLevel() == 1 ? l1 : (data.getDataLevel() == 2 ? l2 : (data.getDataLevel() == 3 ? l3 : (data.getDataLevel() == 4 ? l4 : l5)))) %><%= data.getTitle() %></aui:option>	
					<%	
							}
						}
						
					%>
			</aui:select>
		</aui:column>
	</aui:row>
	<aui:row>
		<aui:column columnWidth="50">
			<%			
				List<DictData> lstDictData = DictDataLocalServiceUtil.getByCollectionNameTree("OEP_DOSSIER_ADMINISTRATION", 0, serviceContext);
				String l1 = "";
				String l2 = "&nbsp;&nbsp;&nbsp;&nbsp;";
				String l3 = "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
				String l4 = "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
				String l5 = "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";	
			%>
		
			<aui:select style="width: 80%" name="administrationNo" id="administrationNo" label="<%= LanguageUtil.get(pageContext, \"org.oep.dossiermgt.portlet.dossierproc.label.administrationno\") %>">
			<aui:option value=""><%= LanguageUtil.get(pageContext, "org.oep.dossiermgt.portlet.dossierproc.label.search.alladministrationno") %></aui:option>
			<%
				long dictDataId = ParamUtil.getLong(request, "dictDataAdministrationId");
				System.out.println("Dict data id:" + dictDataId);
				for (DictData data : lstDictData) {
					if (data.getDictDataId() == dictDataId) {
						//System.out.println("Selected");
			%>
			<aui:option value="<%= data.getDataCode() %>" selected="true"><%= (data.getDataLevel() == 1 ? l1 : (data.getDataLevel() == 2 ? l2 : (data.getDataLevel() == 3 ? l3 : (data.getDataLevel() == 4 ? l4 : l5)))) %><%= data.getTitle() %></aui:option>
			<%
					} else {
			%>
			<aui:option value="<%= data.getDataCode() %>" selected="false"><%= (data.getDataLevel() == 1 ? l1 : (data.getDataLevel() == 2 ? l2 : (data.getDataLevel() == 3 ? l3 : (data.getDataLevel() == 4 ? l4 : l5)))) %><%= data.getTitle() %></aui:option>	
			<%	
					}
				}
				
			%>
			</aui:select>
		</aui:column>
		<aui:column columnWidth="50">
			<input type="button" onclick="<portlet:namespace/>search()" class="btn primary" value="<liferay-ui:message key="org.oep.dossiermgt.portlet.dossierproc.button.search"/>"/>
		</aui:column>		
	</aui:row>
	<!-- <div id="dossierProcedureTable"></div> -->
	<aui:row>
		<aui:column columnWidth="100">
			<table class="table">
				<thead>
					<tr>
						<th><%= LanguageUtil.get(pageContext, "org.oep.dossiermgt.portlet.dossierproc.label.table.header.stt") %></th>
						<th><%= LanguageUtil.get(pageContext, "org.oep.dossiermgt.portlet.dossierproc.label.table.header.name") %></th>
						<th><%= LanguageUtil.get(pageContext, "org.oep.dossiermgt.portlet.dossierproc.label.table.header.administrationname") %></th>
					</tr>
				</thead>
				<tbody>
				<%
				if (datas != null && datas.size() > 0) {
					int index=1;
					for (DossierProc data : datas) {
				%>
					<portlet:actionURL var="viewUrl" name="viewDossierProc">
						<portlet:param name="jspPage" value="/html/dossiermgt/portlet/dossierproc/dossierproc_detail.jsp"/>
						<portlet:param name="dossierProcId" value="<%= String.valueOf(data.getDossierProcId()) %>"/>
						<portlet:param name="redirectPage" value="<%= redirectURL %>"/>
					</portlet:actionURL>
					<tr>
						<td style="text-align:center"><%=(searchContainer.getStart() +  (index++))%></td>
						<td style="text-align:left"><a href="<%= viewUrl %>"><%= data.getName() %></a></td>
						<td style="text-align:left"><%= data.getAdministrationName() %></td>
					</tr>	
				<% } %>		
				<% } %>
				</tbody>
			</table>
		
		</aui:column>
	</aui:row>
</aui:form>
<aui:script>
/*
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
*/
</aui:script>
<script type="text/javascript">
	function <portlet:namespace/>search() {
		var form = document.<portlet:namespace />searchDossierProc;
		form.action = "<%= searchDossierProc %>";
		form.submit();
	};
</script>