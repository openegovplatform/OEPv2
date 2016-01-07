<%--
/**
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
 */
 --%>
 
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@page import="org.oep.ssomgt.permission.SSOPermission"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="org.oep.ssomgt.action.ApplicationKeys"%>
<%@page import="org.oep.ssomgt.model.Application"%>
<%@page import="org.oep.ssomgt.service.ApplicationLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="org.oep.ssomgt.action.PortletKeys"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.service.ServiceContextThreadLocal"%>
<%@page import="com.liferay.portal.service.ServiceContext"%>
<%@ include file="/html/ssomgt/portlet/applicationmanagement/init.jsp" %>

<%
	ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

	int cur = ParamUtil.getInteger(request, PortletKeys.SearchContainer.CURRENT_PAGE, PortletKeys.PAGE);
	int delta = ParamUtil.getInteger(request, PortletKeys.SearchContainer.DELTA, PortletKeys.DELTA);
	Integer pageSize = GetterUtil.getInteger(portletPreferences.getValue("pageSize", "-1"));
	System.out.println("Page size: " + pageSize);
	if (pageSize != -1)
		delta = pageSize;
	PortletURL iteratorUrl = renderResponse.createRenderURL();
	SearchContainer<Application> searchContainer = new SearchContainer<Application>(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, cur, delta, iteratorUrl, null, null);

	DateFormat simpleDateFormat = new SimpleDateFormat("d/MM/yyyy H:m:s.S");
	
	int total = ApplicationLocalServiceUtil.countByCompany(serviceContext);
	searchContainer.setTotal(total);
	List<Application> datas = new ArrayList<Application>();
	if (total > 0) {
		int startIndex = searchContainer.getStart();
		int endIndex = searchContainer.getEnd();
		datas = ApplicationLocalServiceUtil.findByCompany(startIndex, endIndex, serviceContext);
		searchContainer.setResults(datas);
	}	
%>

<portlet:renderURL var="redirectURL">
	<portlet:param name="<%= PortletKeys.SearchContainer.DELTA %>" value="<%= String.valueOf(ParamUtil.getInteger(request, PortletKeys.SearchContainer.DELTA, PortletKeys.DELTA)) %>"/>
	<portlet:param name="<%= PortletKeys.SearchContainer.CURRENT_PAGE %>" value="<%= String.valueOf(ParamUtil.getInteger(request, PortletKeys.SearchContainer.CURRENT_PAGE, PortletKeys.PAGE)) %>"/>
</portlet:renderURL>
<portlet:renderURL var="searchApplication">
	<portlet:param name="<%= PortletKeys.SearchContainer.DELTA %>" value="<%= String.valueOf(ParamUtil.getInteger(request, PortletKeys.SearchContainer.DELTA, PortletKeys.DELTA)) %>"/>
	<portlet:param name="<%= PortletKeys.SearchContainer.CURRENT_PAGE %>" value="<%= String.valueOf(ParamUtil.getInteger(request, PortletKeys.SearchContainer.CURRENT_PAGE, PortletKeys.PAGE)) %>"/>	
</portlet:renderURL>
<portlet:renderURL var="addEditApplication">
	<portlet:param name="<%= PortletKeys.SET_VIEW_PARAMETER %>" value="/html/ssomgt/portlet/applicationmanagement/application_detail.jsp"/>
	<portlet:param name="<%= PortletKeys.REDIRECT_PAGE %>" value="<%= redirectURL %>"/>
</portlet:renderURL>

<aui:form name="searchApplication" method="POST">
	<div class="table-responsive">		
		<liferay-ui:success key="<%= ApplicationKeys.SuccessMessageKeys.ORG_OEP_SSOMGT_PORTLET_APPLICATION_SUCCESS_UPDATE %>" message = "<%= ApplicationKeys.SuccessMessageKeys.ORG_OEP_SSOMGT_PORTLET_APPLICATION_SUCCESS_UPDATE %>"/>
		<liferay-ui:success key="<%= ApplicationKeys.SuccessMessageKeys.ORG_OEP_SSOMGT_PORTLET_APPLICATION_SUCCESS_ADDNEW %>" message = "<%= ApplicationKeys.SuccessMessageKeys.ORG_OEP_SSOMGT_PORTLET_APPLICATION_SUCCESS_ADDNEW %>"/>
		<liferay-ui:success key="<%= ApplicationKeys.SuccessMessageKeys.ORG_OEP_SSOMGT_PORTLET_APPLICATION_SUCCESS_DELETE %>" message = "<%= ApplicationKeys.SuccessMessageKeys.ORG_OEP_SSOMGT_PORTLET_APPLICATION_SUCCESS_DELETE %>"/>
		<liferay-ui:error key="<%= ApplicationKeys.ErrorMessageKeys.ORG_OEP_SSOMGT_PORTLET_APPLICATIONMANAGEMENT_ERROR_DELETE %>" message = "<%= ApplicationKeys.ErrorMessageKeys.ORG_OEP_SSOMGT_PORTLET_APPLICATIONMANAGEMENT_ERROR_DELETE %>"/>

		<div class="container">
			<c:if test='<%= SSOPermission.contains(permissionChecker, scopeGroupId, "ADMIN_SSOMGT") %>'>
				<a onclick="<portlet:namespace/>changeToAddStatus();return false;" class="btn btn-primary"><i class="icon-plus"><liferay-ui:message key="org.oep.ssomgt.portlet.applicationmanagement.button.addnew" /></i></a>
			</c:if>		
		</div>
		<p></p>

		<table class="table table-bordered table-hover">
		<%
		if (datas != null && datas.size() > 0) {
			int index=1;
			%>
			<tr>
				<th style="text-align:center" width="8%"><liferay-ui:message key="org.oep.ssomgt.portlet.applicationmanagement.table.header.no" /></th>
				<th width="20%"><liferay-ui:message key="org.oep.ssomgt.portlet.applicationmanagement.table.header.appname" /></th>
				<th width="10%"><liferay-ui:message key="org.oep.ssomgt.portlet.applicationmanagement.table.header.appcode" /></th>
				<th width="20%"><liferay-ui:message key="org.oep.ssomgt.portlet.applicationmanagement.table.header.appurl" /></th>
				<th width="15%"><liferay-ui:message key="org.oep.ssomgt.portlet.applicationmanagement.table.header.pingtime" /></th>
				<th style="text-align:center"><liferay-ui:message key="org.oep.ssomgt.portlet.applicationmanagement.table.header.action" /></th>
			</tr>
			<%
			for (Application data : datas) {
				%>
				<portlet:actionURL var="deleteUrl" name="deleteApplication">
					<portlet:param name="<%= PortletKeys.REDIRECT_PAGE %>" value="<%= redirectURL %>"/>
					<portlet:param name="<%= ApplicationKeys.BaseApplicationAttributes.DELETE_ID %>" value="<%= String.valueOf(data.getApplicationId()) %>"/>
				</portlet:actionURL>
				<portlet:actionURL var="upUrl" name="upApplication">
					<portlet:param name="<%= PortletKeys.REDIRECT_PAGE %>" value="<%= redirectURL %>"/>
					<portlet:param name="<%= ApplicationKeys.BaseApplicationAttributes.EDIT_ID %>" value="<%= String.valueOf(data.getApplicationId()) %>"/>
				</portlet:actionURL>
				<portlet:actionURL var="downUrl" name="downApplication">
					<portlet:param name="<%= PortletKeys.REDIRECT_PAGE %>" value="<%= redirectURL %>"/>
					<portlet:param name="<%= ApplicationKeys.BaseApplicationAttributes.EDIT_ID %>" value="<%= String.valueOf(data.getApplicationId()) %>"/>
				</portlet:actionURL>
				<portlet:actionURL var="editUrl" name="editApplication">
					<portlet:param name="<%= PortletKeys.REDIRECT_PAGE %>" value="<%= redirectURL %>"/>
					<portlet:param name="<%= PortletKeys.SET_VIEW_PARAMETER %>" value="/html/ssomgt/portlet/applicationmanagement/application_detail.jsp"/>
					<portlet:param name="<%= ApplicationKeys.BaseApplicationAttributes.EDIT_ID %>" value="<%= String.valueOf(data.getApplicationId()) %>"/>
				</portlet:actionURL>
				<%
					if (index % 2 == 0) {
				%>
				<tr class="success">
					<td style="text-align:center"><%=(searchContainer.getStart() +  (index++))%></td>
					<td style="text-align:left"><%= data.getAppName() %></td>
					<td style="text-align:left"><%= data.getAppCode() %></td>
					<td style="text-align:left"><%= data.getAppUrl() %></td>
					<td style="text-align:left"><%= simpleDateFormat.format(data.getPingTime()) %></td>
					<td style="text-align:left">
						<c:if test='<%= SSOPermission.contains(permissionChecker, scopeGroupId, "ADMIN_SSOMGT") %>'>
							<a href="#" class="btn btn-success" title="<liferay-ui:message key="org.oep.ssomgt.portlet.applicationmanagement.table.action.title.edit" />" onclick="location.href = '<%= editUrl %>';return false;"><i class="icon-pencil"><liferay-ui:message key="org.oep.ssomgt.portlet.applicationmanagement.table.action.title.edit" /></i></a>
							<a href="#" class="btn btn-primary" title="<liferay-ui:message key="org.oep.ssomgt.portlet.applicationmanagement.table.action.title.delete" />" onclick="if (confirm('<%= LanguageUtil.get(pageContext, "org.oep.ssomgt.portlet.applicationmanagement.confirm.message.beforedelete")%>')) {location.href = '<%= deleteUrl %>';return false;}"><i class="icon-trash"><liferay-ui:message key="org.oep.ssomgt.portlet.applicationmanagement.table.action.title.delete" /></i></a>
							<a href="#" class="btn btn-primary" title="<liferay-ui:message key="org.oep.ssomgt.portlet.applicationmanagement.table.action.title.up" />" onclick="location.href = '<%= upUrl %>';return false;"><i class="icon-arrow-up"></i></a>
							<a href="#" class="btn btn-primary" title="<liferay-ui:message key="org.oep.ssomgt.portlet.applicationmanagement.table.action.title.down" />" onclick="location.href = '<%= downUrl %>';return false;"><i class="icon-arrow-down"></i></a>
						</c:if>
					</td>
				</tr>
				<% 
					}
					else {
				%>
				<tr class="info">
					<td style="text-align:center"><%=(searchContainer.getStart() +  (index++))%></td>
					<td style="text-align:left"><%= data.getAppName() %></td>
					<td style="text-align:left"><%= data.getAppCode() %></td>
					<td style="text-align:left"><%= data.getAppUrl() %></td>
					<td style="text-align:left"><%= simpleDateFormat.format(data.getPingTime()) %></td>
					<td style="text-align:left">
						<c:if test='<%= SSOPermission.contains(permissionChecker, scopeGroupId, "ADMIN_SSOMGT") %>'>
							<a href="#" class="btn btn-success" title="<liferay-ui:message key="org.oep.ssomgt.portlet.applicationmanagement.table.action.title.edit" />" onclick="location.href = '<%= editUrl %>';return false;"><i class="icon-pencil"><liferay-ui:message key="org.oep.ssomgt.portlet.applicationmanagement.table.action.title.edit" /></i></a>
							<a href="#" class="btn btn-primary" title="<liferay-ui:message key="org.oep.ssomgt.portlet.applicationmanagement.table.action.title.delete" />" onclick="if (confirm('<%= LanguageUtil.get(pageContext, "org.oep.ssomgt.portlet.applicationmanagement.confirm.message.beforedelete")%>')) {location.href = '<%= deleteUrl %>';return false;}"><i class="icon-trash"><liferay-ui:message key="org.oep.ssomgt.portlet.applicationmanagement.table.action.title.delete" /></i></a>
							<a href="#" class="btn btn-primary" title="<liferay-ui:message key="org.oep.ssomgt.portlet.applicationmanagement.table.action.title.up" />" onclick="location.href = '<%= upUrl %>';return false;"><i class="icon-arrow-up"></i></a>
							<a href="#" class="btn btn-primary" title="<liferay-ui:message key="org.oep.ssomgt.portlet.applicationmanagement.table.action.title.down" />" onclick="location.href = '<%= downUrl %>';return false;"><i class="icon-arrow-down"></i></a>
						</c:if>
					</td>
				</tr>
				<%
					}
				%>
				<%
			}
		} else {
			%>
			<tr>
				<td colspan="6">
					<p class="bg-success">
						<liferay-ui:message key="org.oep.ssomgt.portlet.applicationmanagement.table.warning.empty" />
					</p>
				</td>
			</tr>
			<%
		}
		%>
		</table>
		</div>
		<c:if test="<%= searchContainer != null %>">
			<br />
			<div id = "pagination">
				<liferay-ui:search-paginator searchContainer="<%= searchContainer %>" />
			</div>
		</c:if>
</aui:form>

<script type="text/javascript">
	function <portlet:namespace/>search() {
		var form = document.<portlet:namespace />searchApplication;
		form.action = "<%= searchApplication %>";
		form.submit();
	};
	
	function <portlet:namespace/>changeToAddStatus() {
		var form = document.<portlet:namespace />searchApplication;
		form.action = "<%= addEditApplication %>";
		form.submit();
	}	
</script>