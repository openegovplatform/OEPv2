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
<%@page import="org.oep.core.ssomgt.service.ApplicationLocalServiceUtil"%>
<%@page import="org.oep.core.ssomgt.model.Application"%>
<%@page import="org.oep.core.ssomgt.model.AppRole"%>
<%@page import="org.oep.core.ssomgt.service.AppRoleLocalServiceUtil"%>
<%@page import="org.oep.core.ssomgt.action.AppRoleKeys"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>
<%@page import="org.oep.core.ssomgt.action.PortletKeys"%>
<%@page import="com.liferay.portal.service.ServiceContextThreadLocal"%>
<%@page import="com.liferay.portal.service.ServiceContext"%>
<%@ include file="/html/ssomgt/portlet/approle/init.jsp" %>

<%
	ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

	int cur = ParamUtil.getInteger(request, PortletKeys.SearchContainer.CURRENT_PAGE, PortletKeys.PAGE);
	int delta = ParamUtil.getInteger(request, PortletKeys.SearchContainer.DELTA, PortletKeys.DELTA);
	long applicationId = ParamUtil.getLong(request, AppRoleKeys.SearchAttributes.APPLICATION_ID, PortletKeys.LONG_DEFAULT);
	
	PortletURL iteratorUrl = renderResponse.createRenderURL();
	SearchContainer searchContainer = new SearchContainer(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, cur, delta, iteratorUrl, null, null);
	
	int total = 0;
	
	if (applicationId == PortletKeys.LONG_DEFAULT) {
		total = AppRoleLocalServiceUtil.countByCompanyGroup(serviceContext);
	}
	else {
		total = AppRoleLocalServiceUtil.countByCompanyGroupApplication(applicationId, serviceContext);
	}
	searchContainer.setTotal(total);
	List<AppRole> datas = new ArrayList<AppRole>();
	if (total > 0) {
		int startIndex = searchContainer.getStart();
		int endIndex = searchContainer.getEnd();
		if (applicationId == PortletKeys.LONG_DEFAULT) {
			datas = AppRoleLocalServiceUtil.findByCompanyGroup(startIndex, endIndex, serviceContext);			
		}
		else {
			datas = AppRoleLocalServiceUtil.findByCompanyGroupApplication(applicationId, serviceContext);
		}
		searchContainer.setResults(datas);
	}
%>

<portlet:renderURL var="redirectURL">
	<portlet:param name="<%= PortletKeys.SearchContainer.DELTA %>" value="<%= String.valueOf(ParamUtil.getInteger(request, PortletKeys.SearchContainer.DELTA, PortletKeys.DELTA)) %>"/>
	<portlet:param name="<%= PortletKeys.SearchContainer.CURRENT_PAGE %>" value="<%= String.valueOf(ParamUtil.getInteger(request, PortletKeys.SearchContainer.CURRENT_PAGE, PortletKeys.PAGE)) %>"/>
	<portlet:param name="<%= AppRoleKeys.SearchAttributes.APPLICATION_ID %>" value="<%= String.valueOf(applicationId) %>"/>
</portlet:renderURL>
<portlet:renderURL var="searchAppRole">
	<portlet:param name="<%= PortletKeys.SearchContainer.DELTA %>" value="<%= String.valueOf(ParamUtil.getInteger(request, PortletKeys.SearchContainer.DELTA, PortletKeys.DELTA)) %>"/>
	<portlet:param name="<%= PortletKeys.SearchContainer.CURRENT_PAGE %>" value="<%= String.valueOf(ParamUtil.getInteger(request, PortletKeys.SearchContainer.CURRENT_PAGE, PortletKeys.PAGE)) %>"/>	
</portlet:renderURL>
<portlet:renderURL var="addEditAppRole">
	<portlet:param name="<%= PortletKeys.SET_VIEW_PARAMETER %>" value="/html/ssomgt/portlet/approle/approle_detail.jsp"/>
	<portlet:param name="<%= PortletKeys.REDIRECT_PAGE %>" value="<%= redirectURL %>"/>
</portlet:renderURL>

<aui:form name="searchAppRole" method="POST">
	<div class="table-responsive">		
		<div class="container">
			<table style="width: 100%;">
				<tr>
					<td style="width: 50%;">
						<aui:select style="width: 100%" onChange="applicationChange()" label="<%= LanguageUtil.get(pageContext, \"org.oep.ssomgt.portlet.approle.empty\") %>" name="<%= AppRoleKeys.SearchAttributes.APPLICATION_ID %>" id="<%= AppRoleKeys.SearchAttributes.APPLICATION_ID %>" >
							<aui:option value="<%= PortletKeys.LONG_DEFAULT %>"><liferay-ui:message key="org.oep.ssomgt.portlet.approle.selectbox.applicationid" /></aui:option>
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
					<td valign="top">
						<input type="button" class="btn btn-primary pull-right" value="<liferay-ui:message key="org.oep.ssomgt.portlet.approle.button.addnew" />" onclick="<portlet:namespace/>changeToAddStatus()" />
					</td>
				</tr>
			</table>
		
		</div>
		<p></p>
		<table class="table">
		<%
		if (datas != null && datas.size() > 0) {
			int index=1;
			%>
			<tr style="text-align:center">
				<th width="4%"><liferay-ui:message key="org.oep.ssomgt.portlet.approle.table.header.no" /></th>
				<th width="40%"><liferay-ui:message key="org.oep.ssomgt.portlet.approle.table.header.rolename" /></th>
				<th width="40%"><liferay-ui:message key="org.oep.ssomgt.portlet.approle.table.header.rolecode" /></th>
				<th><liferay-ui:message key="org.oep.ssomgt.portlet.approle.table.header.action" /></th>
			</tr>
			<%
			for (AppRole data : datas) {
				%>
				<portlet:actionURL var="deleteUrl" name="deleteAppRole">
					<portlet:param name="<%= PortletKeys.REDIRECT_PAGE %>" value="<%= redirectURL %>"/>
					<portlet:param name="<%= AppRoleKeys.BaseAppRoleAttributes.DELETE_ID %>" value="<%= String.valueOf(data.getAppRoleId()) %>"/>
				</portlet:actionURL>
				<portlet:actionURL var="editUrl" name="editAppRole">
					<portlet:param name="<%= PortletKeys.REDIRECT_PAGE %>" value="<%= redirectURL %>"/>
					<portlet:param name="<%= PortletKeys.SET_VIEW_PARAMETER %>" value="/html/ssomgt/portlet/approle/approle_detail.jsp"/>
					<portlet:param name="<%= AppRoleKeys.BaseAppRoleAttributes.EDIT_ID %>" value="<%= String.valueOf(data.getAppRoleId()) %>"/>
				</portlet:actionURL>
				<portlet:renderURL var="assignRoleUrl">
					<portlet:param name="<%= PortletKeys.REDIRECT_PAGE %>" value="<%= redirectURL %>"/>
					<portlet:param name="<%= PortletKeys.SET_VIEW_PARAMETER %>" value="/html/ssomgt/portlet/assignrole/view.jsp"/>
					<portlet:param name="<%= AppRoleKeys.BaseAppRoleAttributes.EDIT_ID %>" value="<%= String.valueOf(data.getAppRoleId()) %>"/>
				</portlet:renderURL>				
				<tr>
					<td style="text-align:center"><%=(searchContainer.getStart() +  (index++))%></td>
					<td style="text-align:left"><%= data.getRoleName() %></td>
					<td style="text-align:left"><%= data.getRoleCode() %></td>
					<td style="text-align:center">
						<input class="btn btn-success" type="button" value="<liferay-ui:message key="org.oep.ssomgt.portlet.approle.table.action.title.assignrole"/>" onclick="location.href='<%= assignRoleUrl %>'"/>
						<a href="#" title="<liferay-ui:message key="org.oep.ssomgt.portlet.approle.table.action.title.edit" />" onclick="location.href = '<%= editUrl %>';return false;"><i class="icon-pencil"></i></a>
						<a href="#" title="<liferay-ui:message key="org.oep.ssomgt.portlet.approle.table.action.title.delete" />" onclick="if (confirm('<%= LanguageUtil.get(pageContext, "org.oep.ssomgt.portlet.approle.confirm.message.beforedelete")%>')) {location.href = '<%= deleteUrl %>';return false;}"><i class="icon-trash"></i></a>
					</td>
				</tr>
				<%
			}
		} else {
			%>
			<tr>
				<td colspan="7">
					<p class="bg-success">
						<liferay-ui:message key="org.oep.ssomgt.portlet.approle.table.warning.empty" />
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
	function applicationChange() {
		var form = document.<portlet:namespace />searchAppRole;
		form.action = "<%= searchAppRole %>";
		form.submit();
	};

	function <portlet:namespace/>search() {
		var form = document.<portlet:namespace />searchAppRole;
		form.action = "<%= searchAppRole %>";
		form.submit();
	};
	
	function <portlet:namespace/>changeToAddStatus() {
		var form = document.<portlet:namespace />searchAppRole;
		form.action = "<%= addEditAppRole %>";
		form.submit();
	}
	
</script> 