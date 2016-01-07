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
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="org.oep.ssomgt.permission.SSOPermission"%>
<%@page import="org.oep.ssomgt.service.ApplicationLocalServiceUtil"%>
<%@page import="org.oep.ssomgt.model.Application"%>
<%@page import="org.oep.ssomgt.service.UserSyncLocalServiceUtil"%>
<%@page import="org.oep.ssomgt.model.UserSync"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>
<%@page import="org.oep.ssomgt.action.UserSyncKeys"%>
<%@page import="org.oep.ssomgt.action.PortletKeys"%>
<%@page import="com.liferay.portal.service.ServiceContextThreadLocal"%>
<%@page import="com.liferay.portal.service.ServiceContext"%>
<%@ include file="/html/ssomgt/portlet/usersync/init.jsp" %>
<%
	ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

	int cur = ParamUtil.getInteger(request, PortletKeys.SearchContainer.CURRENT_PAGE, PortletKeys.PAGE);
	int delta = ParamUtil.getInteger(request, PortletKeys.SearchContainer.DELTA, PortletKeys.DELTA);
	long applicationId = ParamUtil.getLong(request, UserSyncKeys.SearchAttributes.APPLICATION_ID, PortletKeys.LONG_DEFAULT);
	boolean isSync = ParamUtil.getBoolean(request, UserSyncKeys.SearchAttributes.IS_SYNC, false);
	
	System.out.println("Application: " + applicationId + ", user sync: " + isSync);
	PortletURL iteratorUrl = renderResponse.createRenderURL();
	SearchContainer<UserSync> searchContainer = new SearchContainer<UserSync>(
			renderRequest, null, null,
			SearchContainer.DEFAULT_CUR_PARAM, cur, delta, iteratorUrl,
			null, null);

	int total = 0;

	total = UserSyncLocalServiceUtil.countByApplicationSync(
			applicationId, isSync, serviceContext);
	searchContainer.setTotal(total);
	List<UserSync> datas = new ArrayList<UserSync>();
	if (total > 0) {
		int startIndex = searchContainer.getStart();
		int endIndex = searchContainer.getEnd();
		datas = UserSyncLocalServiceUtil.findByApplicationSync(
				applicationId, isSync, startIndex, endIndex,
				serviceContext);
		searchContainer.setResults(datas);
	}
	DateFormat simpleDateFormat = new SimpleDateFormat("d/MM/yyyy H:m:s.S");
%> 

<portlet:renderURL var="redirectURL">
	<portlet:param name="<%= PortletKeys.SearchContainer.DELTA %>" value="<%= String.valueOf(ParamUtil.getInteger(request, PortletKeys.SearchContainer.DELTA, PortletKeys.DELTA)) %>"/>
	<portlet:param name="<%= PortletKeys.SearchContainer.CURRENT_PAGE %>" value="<%= String.valueOf(ParamUtil.getInteger(request, PortletKeys.SearchContainer.CURRENT_PAGE, PortletKeys.PAGE)) %>"/>
	<portlet:param name="<%= UserSyncKeys.SearchAttributes.APPLICATION_ID %>" value="<%= String.valueOf(ParamUtil.getLong(request, UserSyncKeys.SearchAttributes.APPLICATION_ID, PortletKeys.LONG_DEFAULT)) %>"/>
</portlet:renderURL>
<portlet:renderURL var="searchUserSync">
	<portlet:param name="<%= PortletKeys.SearchContainer.DELTA %>" value="<%= String.valueOf(ParamUtil.getInteger(request, PortletKeys.SearchContainer.DELTA, PortletKeys.DELTA)) %>"/>
	<portlet:param name="<%= PortletKeys.SearchContainer.CURRENT_PAGE %>" value="<%= String.valueOf(ParamUtil.getInteger(request, PortletKeys.SearchContainer.CURRENT_PAGE, PortletKeys.PAGE)) %>"/>	
</portlet:renderURL>
<portlet:renderURL var="changeMappingUserSync">
	<portlet:param name="<%= PortletKeys.SET_VIEW_PARAMETER %>" value="/html/ssomgt/portlet/usersync/changemapping_detail.jsp"/>
	<portlet:param name="<%= PortletKeys.REDIRECT_PAGE %>" value="<%= redirectURL %>"/>
</portlet:renderURL>

<aui:form name="searchUserSync" method="POST">
	<div class="table-responsive">		
		<div class="container">	
			<table style="width: 100%;">
				<tr>
					<td style="width: 50%;">
						<aui:select style="width: 100%" label="<%= LanguageUtil.get(pageContext, \"org.oep.ssomgt.portlet.usersync.empty\") %>" name="<%= UserSyncKeys.SearchAttributes.APPLICATION_ID %>" id="<%= UserSyncKeys.SearchAttributes.APPLICATION_ID %>" >
							<aui:option value="<%= PortletKeys.LONG_DEFAULT %>"><liferay-ui:message key="org.oep.ssomgt.portlet.usersync.selectbox.applicationid" /></aui:option>
							<%
								List<Application> lstApplications = ApplicationLocalServiceUtil.findByCompany(serviceContext);
							%>
							<c:if test="<%= lstApplications != null && lstApplications.size() > 0 %>">
								<c:set var="applicationId" scope="page" value="<%= applicationId %>"></c:set>
								<c:forEach items="<%= lstApplications %>" var="appitem">
									<c:choose>
										<c:when test="${appitem.applicationId == applicationId}">
											<aui:option selected="<%= true %>" value="${appitem.applicationId}">${appitem.appName}</aui:option>
										</c:when>
										<c:otherwise>
											<aui:option value="${appitem.applicationId}">${appitem.appName}</aui:option>
										</c:otherwise>
									</c:choose>
								</c:forEach>
							</c:if>
						</aui:select>
					</td>
					<td style="width: 20%" valign="top">
						<aui:input cssClass="pull-right" label="<%= LanguageUtil.get(pageContext, \"org.oep.ssomgt.portlet.usersync.label.issync\") %>" name="<%= UserSyncKeys.SearchAttributes.IS_SYNC %>" id="<%= UserSyncKeys.SearchAttributes.IS_SYNC %>" type="checkbox"></aui:input>
					</td>
					<td style="width: 30%" valign="top">
						<a href="#" class="btn btn-primary" onclick="<portlet:namespace/>search();return false;"><i class="icon-search"><liferay-ui:message key="org.oep.ssomgt.portlet.usersync.button.search" /></i></a>
					</td>
				</tr>
			</table>
		
		</div>
		<p></p>
		<table class="table table-bordered table-hover">
		<%
		if (datas != null && datas.size() > 0) {
			int index=1;
			%>
			<tr style="text-align:center">
				<th width="4%"><liferay-ui:message key="org.oep.ssomgt.portlet.usersync.table.header.no" /></th>
				<th width="15%"><liferay-ui:message key="org.oep.ssomgt.portlet.usersync.table.header.pingtime" /></th>
				<th width="15%"><liferay-ui:message key="org.oep.ssomgt.portlet.usersync.table.header.synctime" /></th>
				<th width="10%"><liferay-ui:message key="org.oep.ssomgt.portlet.usersync.table.header.application" /></th>
				<th width="10%"><liferay-ui:message key="org.oep.ssomgt.portlet.usersync.table.header.ssousername" /></th>
				<th width="15%"><liferay-ui:message key="org.oep.ssomgt.portlet.usersync.table.header.appusername" /></th>
				<th><liferay-ui:message key="org.oep.ssomgt.portlet.usersync.table.header.action" /></th>
			</tr>
			<%
			for (UserSync data : datas) {
				%>
				<portlet:actionURL var="viewUrl" name="viewUserSync">
					<portlet:param name="<%= PortletKeys.REDIRECT_PAGE %>" value="<%= redirectURL %>"/>
					<portlet:param name="<%= PortletKeys.SET_VIEW_PARAMETER %>" value="/html/ssomgt/portlet/usersync/usersync_detail.jsp"/>
					<portlet:param name="<%= UserSyncKeys.BaseUserSyncAttributes.EDIT_ID %>" value="<%= String.valueOf(data.getUserSyncId()) %>"/>
				</portlet:actionURL>
				<portlet:actionURL var="changeMappingUrl" name="changeMapping">
					<portlet:param name="<%= PortletKeys.REDIRECT_PAGE %>" value="<%= redirectURL %>"/>
					<portlet:param name="<%= PortletKeys.SET_VIEW_PARAMETER %>" value="/html/ssomgt/portlet/usersync/changemapping_detail.jsp"/>
					<portlet:param name="<%= UserSyncKeys.BaseUserSyncAttributes.EDIT_ID %>" value="<%= String.valueOf(data.getUserSyncId()) %>"/>
				</portlet:actionURL>			
				<%
					if (index % 2 == 0) {
				%>
				<tr class="success">
					<td style="text-align:center"><%=(searchContainer.getStart() +  (index++))%></td>
					<td style="text-align:left"><%= (data.getApplication().getPingTime() != null ? simpleDateFormat.format(data.getApplication().getPingTime()) : "") %></td>
					<td style="text-align:left"><%= (data.getSyncTime() != null ? simpleDateFormat.format(data.getSyncTime()) : "") %></td>
					<td><%= data.getApplication().getAppName() %></td>
					<td><%= data.getSsoUserName() %></td>
					<td><%= data.getAppUserName() %></td>
					<td style="text-align:center">
						<c:if test='<%= SSOPermission.contains(permissionChecker, scopeGroupId, "ADMIN_SSOMGT") %>'>
							<a class="btn btn-primary" href="#" title="<liferay-ui:message key="org.oep.ssomgt.portlet.usersync.table.action.title.view" />" onclick="location.href = '<%= viewUrl %>';return false;"><i class="icon-eye-open"><liferay-ui:message key="org.oep.ssomgt.portlet.usersync.table.action.title.view" /></i></a>
						</c:if>
						<a class="btn btn-success" href="#" title="<liferay-ui:message key="org.oep.ssomgt.portlet.usersync.table.action.title.changemapping" />" onclick="location.href = '<%= changeMappingUrl %>';return false;"><i class="icon-random"><liferay-ui:message key="org.oep.ssomgt.portlet.usersync.table.action.title.changemapping" /></i></a>
					</td>
				</tr>
				<%
					}
					else {
				%>
				<tr class="info">
					<td style="text-align:center"><%=(searchContainer.getStart() +  (index++))%></td>
					<td style="text-align:left"><%= (data.getApplication().getPingTime() != null ? simpleDateFormat.format(data.getApplication().getPingTime()) : "") %></td>
					<td style="text-align:left"><%= (data.getSyncTime() != null ? simpleDateFormat.format(data.getSyncTime()) : "") %></td>
					<td><%= data.getApplication().getAppName() %></td>
					<td><%= data.getSsoUserName() %></td>
					<td><%= data.getAppUserName() %></td>
					<td style="text-align:center">
						<c:if test='<%= SSOPermission.contains(permissionChecker, scopeGroupId, "ADMIN_SSOMGT") %>'>
							<a class="btn btn-primary" href="#" title="<liferay-ui:message key="org.oep.ssomgt.portlet.usersync.table.action.title.view" />" onclick="location.href = '<%= viewUrl %>';return false;"><i class="icon-eye-open"><liferay-ui:message key="org.oep.ssomgt.portlet.usersync.table.action.title.view" /></i></a>
						</c:if>
						<a class="btn btn-success" href="#" title="<liferay-ui:message key="org.oep.ssomgt.portlet.usersync.table.action.title.changemapping" />" onclick="location.href = '<%= changeMappingUrl %>';return false;"><i class="icon-random"><liferay-ui:message key="org.oep.ssomgt.portlet.usersync.table.action.title.changemapping" /></i></a>
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
						<liferay-ui:message key="org.oep.ssomgt.portlet.usersync.table.warning.empty" />
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
		var form = document.<portlet:namespace />searchUserSync;
		form.action = "<%= searchUserSync %>";
		form.submit();
	};	
</script> 