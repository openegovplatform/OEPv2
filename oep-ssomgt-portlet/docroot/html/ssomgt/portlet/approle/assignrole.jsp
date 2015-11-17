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
<%@page import="org.oep.ssomgt.action.AppRole2EmployeeKeys"%>
<%@page import="org.oep.ssomgt.model.AppRole2Employee"%>
<%@page import="org.oep.ssomgt.service.AppRole2EmployeeLocalServiceUtil"%>
<%@page import="org.oep.ssomgt.permission.SSOPermission"%>
<%@page import="org.oep.ssomgt.service.AppRole2JobPosLocalServiceUtil"%>
<%@page import="org.oep.ssomgt.model.AppRole2JobPos"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>
<%@page import="org.oep.usermgt.service.EmployeeLocalServiceUtil"%>
<%@page import="org.oep.usermgt.model.Employee"%>
<%@page import="org.oep.usermgt.service.JobPosLocalServiceUtil"%>
<%@page import="org.oep.usermgt.model.JobPos"%>
<%@page import="com.liferay.portal.service.ServiceContextThreadLocal"%>
<%@page import="com.liferay.portal.service.ServiceContext"%>
<%@page import="org.oep.usermgt.service.WorkingUnitLocalServiceUtil"%>
<%@page import="org.oep.usermgt.model.WorkingUnit"%>
<%@page import="org.oep.ssomgt.action.AppRole2JobPosKeys"%>
<%@page import="org.oep.ssomgt.action.AssignRoleKeys"%>
<%@page import="org.oep.ssomgt.service.ApplicationLocalServiceUtil"%>
<%@page import="org.oep.ssomgt.model.Application"%>
<%@page import="org.oep.ssomgt.service.AppRoleLocalServiceUtil"%>
<%@page import="org.oep.ssomgt.model.AppRole"%>
<%@page import="org.oep.ssomgt.action.PortletKeys"%>
<%@page import="org.oep.ssomgt.action.AppRoleKeys"%>
<%@ include file="/html/ssomgt/portlet/approle/init.jsp" %>
<%
	long appRoleId = ParamUtil.getLong(request, AppRoleKeys.AddEditAttributes.EDIT_ID, PortletKeys.LONG_DEFAULT);
	long workingUnitId = ParamUtil.getLong(request, AssignRoleKeys.SearchAttributes.WORKING_UNIT_ID, PortletKeys.LONG_DEFAULT);
		 
	AppRole appRole = AppRoleLocalServiceUtil.getAppRole(appRoleId);
	Application app = ApplicationLocalServiceUtil.getApplication(appRole.getApplicationId());
	ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();
	int curJobPos = ParamUtil.getInteger(request, AssignRoleKeys.SearchContainer.CURRENT_JOBPOS_PAGE, PortletKeys.PAGE);
	int deltaJobPos = ParamUtil.getInteger(request, AssignRoleKeys.SearchContainer.DELTA_JOBPOS, PortletKeys.DELTA);

	int curEmployee = ParamUtil.getInteger(request, AssignRoleKeys.SearchContainer.CURRENT_EMPLOYEE_PAGE, PortletKeys.PAGE);
	int deltaEmployee = ParamUtil.getInteger(request, AssignRoleKeys.SearchContainer.DELTA_EMPLOYEE, PortletKeys.DELTA);

	List<JobPos> lstJobPos = JobPosLocalServiceUtil.getByWorkingUnit(workingUnitId);
	List<Employee> lstEmployees = EmployeeLocalServiceUtil.getByWorkingUnit(workingUnitId);
	
	PortletURL jpIteratorUrl = renderResponse.createRenderURL();
	PortletURL epIteratorUrl = renderResponse.createRenderURL();
	SearchContainer<AppRole2JobPos> searchContainer = new SearchContainer<AppRole2JobPos>(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, curJobPos, deltaJobPos, jpIteratorUrl, null, null);
	SearchContainer<AppRole2Employee> searchContainerEP = new SearchContainer<AppRole2Employee>(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, curEmployee, deltaEmployee, jpIteratorUrl, null, null);
	
	int totalJP = 0;

	totalJP = AppRole2JobPosLocalServiceUtil.countByAppRoleWorkingUnit(appRoleId, workingUnitId, serviceContext);
	
	int totalEP = 0;
	totalEP = AppRole2EmployeeLocalServiceUtil.countByAppRoleWorkingUnit(appRoleId, workingUnitId, serviceContext);
	
	searchContainer.setTotal(totalJP);
	searchContainerEP.setTotal(totalEP);
	
	List<AppRole2JobPos> dataJPs = new ArrayList<AppRole2JobPos>();
	if (totalJP > 0) {
		int startIndex = searchContainer.getStart();
		int endIndex = searchContainer.getEnd();
		
		dataJPs = AppRole2JobPosLocalServiceUtil.findByAppRoleWorkingUnit(appRoleId, workingUnitId, startIndex, endIndex, serviceContext);
		
		searchContainer.setResults(dataJPs);
	}	

	List<AppRole2Employee> dataEPs = new ArrayList<AppRole2Employee>();
	if (totalEP > 0) {
		int startIndex = searchContainerEP.getStart();
		int endIndex = searchContainerEP.getEnd();
		
		dataEPs = AppRole2EmployeeLocalServiceUtil.findByAppRoleWorkingUnit(appRoleId, workingUnitId, startIndex, endIndex, serviceContext);
		
		searchContainerEP.setResults(dataEPs);
	}	

%>
<portlet:renderURL var="backURL">
	<portlet:param name="<%= PortletKeys.SET_VIEW_PARAMETER %>" value="/html/ssomgt/portlet/approle/approle_list.jsp"/>
	<portlet:param name="<%= PortletKeys.SearchContainer.DELTA %>" value="<%= String.valueOf(ParamUtil.getInteger(request, PortletKeys.SearchContainer.DELTA, PortletKeys.DELTA)) %>"/>
	<portlet:param name="<%= PortletKeys.SearchContainer.CURRENT_PAGE %>" value="<%= String.valueOf(ParamUtil.getInteger(request, PortletKeys.SearchContainer.CURRENT_PAGE, PortletKeys.PAGE)) %>"/>
	<portlet:param name="<%= AppRoleKeys.SearchAttributes.APPLICATION_ID %>" value="<%= String.valueOf(ParamUtil.getLong(request, AppRoleKeys.SearchAttributes.APPLICATION_ID, PortletKeys.LONG_DEFAULT)) %>"/>
</portlet:renderURL>
<portlet:renderURL var="redirectURL">
	<portlet:param name="jspPage" value="/html/ssomgt/portlet/approle/assignrole.jsp"/>
	<portlet:param name="<%= AssignRoleKeys.SearchContainer.DELTA_JOBPOS %>" value="<%= String.valueOf(ParamUtil.getInteger(request, AssignRoleKeys.SearchContainer.DELTA_JOBPOS, PortletKeys.DELTA)) %>"/>
	<portlet:param name="<%= AssignRoleKeys.SearchContainer.CURRENT_JOBPOS_PAGE %>" value="<%= String.valueOf(ParamUtil.getInteger(request, AssignRoleKeys.SearchContainer.CURRENT_JOBPOS_PAGE, PortletKeys.PAGE)) %>"/>
	<portlet:param name="<%= AssignRoleKeys.SearchContainer.DELTA_EMPLOYEE %>" value="<%= String.valueOf(ParamUtil.getInteger(request, AssignRoleKeys.SearchContainer.DELTA_EMPLOYEE, PortletKeys.DELTA)) %>"/>
	<portlet:param name="<%= AssignRoleKeys.SearchContainer.CURRENT_EMPLOYEE_PAGE %>" value="<%= String.valueOf(ParamUtil.getInteger(request, AssignRoleKeys.SearchContainer.CURRENT_EMPLOYEE_PAGE, PortletKeys.PAGE)) %>"/>
	<portlet:param name="<%= AssignRoleKeys.SearchAttributes.WORKING_UNIT_ID %>" value="<%= String.valueOf(ParamUtil.getLong(request, AssignRoleKeys.SearchAttributes.WORKING_UNIT_ID, PortletKeys.LONG_DEFAULT)) %>"/>
	<portlet:param name="<%= AppRoleKeys.AddEditAttributes.EDIT_ID %>" value="<%= String.valueOf(ParamUtil.getLong(request, AppRoleKeys.AddEditAttributes.EDIT_ID, PortletKeys.LONG_DEFAULT)) %>"/>
</portlet:renderURL>
<portlet:renderURL var="assignRole2JobPos">
	<portlet:param name="<%= PortletKeys.REDIRECT_PAGE %>" value="<%= redirectURL %>"/>
	<portlet:param name="<%= PortletKeys.SET_VIEW_PARAMETER %>" value="/html/ssomgt/portlet/approle/assignrole2jobpos.jsp"/>
	<portlet:param name="<%= AppRole2JobPosKeys.AddEditAttributes.APPROLE_ID %>" value="<%= String.valueOf(ParamUtil.getLong(request, AppRoleKeys.AddEditAttributes.EDIT_ID, PortletKeys.LONG_DEFAULT))  %>"/>
	<portlet:param name="<%= AssignRoleKeys.AddEditAttributes.WORKING_UNIT_ID %>" value="<%= String.valueOf(ParamUtil.getLong(request, AssignRoleKeys.SearchAttributes.WORKING_UNIT_ID, PortletKeys.LONG_DEFAULT)) %>"/>
	<portlet:param name="<%= AppRoleKeys.SearchAttributes.APPLICATION_ID %>" value="<%= String.valueOf(ParamUtil.getLong(request, AppRoleKeys.SearchAttributes.APPLICATION_ID, PortletKeys.LONG_DEFAULT)) %>"/>
</portlet:renderURL>				
<portlet:renderURL var="assignRole2Employee">
	<portlet:param name="<%= PortletKeys.REDIRECT_PAGE %>" value="<%= redirectURL %>"/>
	<portlet:param name="<%= PortletKeys.SET_VIEW_PARAMETER %>" value="/html/ssomgt/portlet/approle/assignrole2employee.jsp"/>
	<portlet:param name="<%= AppRole2JobPosKeys.AddEditAttributes.APPROLE_ID %>" value="<%= String.valueOf(ParamUtil.getLong(request, AppRoleKeys.AddEditAttributes.EDIT_ID, PortletKeys.LONG_DEFAULT))  %>"/>
	<portlet:param name="<%= AssignRoleKeys.AddEditAttributes.WORKING_UNIT_ID %>" value="<%= String.valueOf(ParamUtil.getLong(request, AssignRoleKeys.SearchAttributes.WORKING_UNIT_ID, PortletKeys.LONG_DEFAULT)) %>"/>
	<portlet:param name="<%= AppRoleKeys.SearchAttributes.APPLICATION_ID %>" value="<%= String.valueOf(ParamUtil.getLong(request, AppRoleKeys.SearchAttributes.APPLICATION_ID, PortletKeys.LONG_DEFAULT)) %>"/>
</portlet:renderURL>
<portlet:renderURL var="searchAssignRole">
	<portlet:param name="<%= PortletKeys.REDIRECT_PAGE %>" value="<%= ParamUtil.getString(request, PortletKeys.REDIRECT_PAGE) %>"/>
	<portlet:param name="<%= AssignRoleKeys.SearchContainer.DELTA_JOBPOS %>" value="<%= String.valueOf(ParamUtil.getInteger(request, AssignRoleKeys.SearchContainer.DELTA_JOBPOS, PortletKeys.DELTA)) %>"/>
	<portlet:param name="<%= AssignRoleKeys.SearchContainer.CURRENT_JOBPOS_PAGE %>" value="<%= String.valueOf(ParamUtil.getInteger(request, AssignRoleKeys.SearchContainer.CURRENT_JOBPOS_PAGE, PortletKeys.PAGE)) %>"/>
	<portlet:param name="<%= AssignRoleKeys.SearchContainer.DELTA_EMPLOYEE %>" value="<%= String.valueOf(ParamUtil.getInteger(request, AssignRoleKeys.SearchContainer.DELTA_EMPLOYEE, PortletKeys.DELTA)) %>"/>
	<portlet:param name="<%= AssignRoleKeys.SearchContainer.CURRENT_EMPLOYEE_PAGE %>" value="<%= String.valueOf(ParamUtil.getInteger(request, AssignRoleKeys.SearchContainer.CURRENT_EMPLOYEE_PAGE, PortletKeys.PAGE)) %>"/>
	<portlet:param name="<%= PortletKeys.SET_VIEW_PARAMETER %>" value="/html/ssomgt/portlet/approle/assignrole.jsp"/>
	<portlet:param name="<%= AppRoleKeys.AddEditAttributes.EDIT_ID %>" value="<%= String.valueOf(ParamUtil.getLong(request, AppRoleKeys.AddEditAttributes.EDIT_ID, PortletKeys.LONG_DEFAULT)) %>"/>
</portlet:renderURL>				
<aui:row>
	<aui:column columnWidth="50">
		<p class="muted">
			<b><liferay-ui:message key="org.oep.ssomgt.portlet.assignrole.label.application"></liferay-ui:message>:</b>
			<%= app.getAppName()  %>
		</p>
	</aui:column>
	<aui:column columnWidth="50">
		<p class="muted">
			<b><liferay-ui:message key="org.oep.ssomgt.portlet.assignrole.label.approle"></liferay-ui:message>:</b>
			<%= appRole.getRoleName() %>
		</p>
	</aui:column>
</aui:row>
<aui:form name="searchAssignRole" method="POST">
	<liferay-ui:error key="<%= AssignRoleKeys.ErrorMessageKeys.ORG_OEP_SSOMGT_PORTLET_APPROLE_ASSIGNROLE2JOBPOS_ERROR_DELETE %>" message = "<%= AssignRoleKeys.ErrorMessageKeys.ORG_OEP_SSOMGT_PORTLET_APPROLE_ASSIGNROLE2JOBPOS_ERROR_DELETE %>"/>
	<liferay-ui:error key="<%= AssignRoleKeys.ErrorMessageKeys.ORG_OEP_SSOMGT_PORTLET_APPROLE_ASSIGNROLE2EMPLOYEE_ERROR_DELETE %>" message = "<%= AssignRoleKeys.ErrorMessageKeys.ORG_OEP_SSOMGT_PORTLET_APPROLE_ASSIGNROLE2EMPLOYEE_ERROR_DELETE %>"/>
	<liferay-ui:success key="<%= AssignRoleKeys.SuccessMessageKeys.ORG_OEP_SSOMGT_PORTLET_APPROLE_ASSIGNROLE2JOBPOS_SUCCESS_DELETE %>" message = "<%= AssignRoleKeys.SuccessMessageKeys.ORG_OEP_SSOMGT_PORTLET_APPROLE_ASSIGNROLE2JOBPOS_SUCCESS_DELETE %>"/>
	<liferay-ui:success key="<%= AssignRoleKeys.SuccessMessageKeys.ORG_OEP_SSOMGT_PORTLET_APPROLE_ASSIGNROLE2EMPLOYEE_SUCCESS_DELETE %>" message = "<%= AssignRoleKeys.SuccessMessageKeys.ORG_OEP_SSOMGT_PORTLET_APPROLE_ASSIGNROLE2EMPLOYEE_SUCCESS_DELETE %>"/>

	<aui:row>
		<aui:column columnWidth="40">
			<aui:select style="width: 100%;" onChange="workingUnitChange()" id="<%= AssignRoleKeys.SearchAttributes.WORKING_UNIT_ID %>" name="<%= AssignRoleKeys.SearchAttributes.WORKING_UNIT_ID %>" label="<%= LanguageUtil.get(pageContext, \"org.oep.ssomgt.portlet.approle.empty\") %>">
				<aui:option value="<%= PortletKeys.LONG_DEFAULT %>"><liferay-ui:message key="org.oep.ssomgt.portlet.assignrole.selectbox.workingunit" /></aui:option>
				<%
					List<WorkingUnit> lstWUs = WorkingUnitLocalServiceUtil.getByCompanyTree(serviceContext);
				%>
				<c:forEach items="<%= lstWUs %>" var="item">
					<c:set var="workingUnitId" value="<%= workingUnitId %>"></c:set>
					<c:choose>
						<c:when test="${item.workingUnitId == workingUnitId}">
							<aui:option selected="<%= true %>" value="${item.workingUnitId}">${item.name}</aui:option>
						</c:when>
						<c:otherwise>
							<aui:option value="${item.workingUnitId}">${item.name}</aui:option>
						</c:otherwise>
					</c:choose>
				</c:forEach>
			</aui:select>
		</aui:column>
		<aui:column>
			<input onclick="location.href='<%= assignRole2JobPos.toString() %>'" class="btn" type="button" value="<liferay-ui:message key="org.oep.ssomgt.portlet.assignrole.button.addjobpost" />"/>
		</aui:column>
		<aui:column>
			<input onclick="location.href='<%= assignRole2Employee.toString() %>'" class="btn" type="button" value="<liferay-ui:message key="org.oep.ssomgt.portlet.assignrole.button.addemployee" />"/>	
		</aui:column>
	</aui:row>
	<aui:row>
		<aui:column columnWidth="50">
			<table class="table table-bordered table-hover">
			<%
			if (dataJPs != null && dataJPs.size() > 0) {
				int index=1;
				%>
				<tr style="text-align:center">
					<th width="4%"><liferay-ui:message key="org.oep.ssomgt.portlet.assignrole.tablejp.header.no" /></th>
					<th width="25%"><liferay-ui:message key="org.oep.ssomgt.portlet.assignrole.tablejp.header.jobpos" /></th>
					<th width="45%"><liferay-ui:message key="org.oep.ssomgt.portlet.assignrole.tablejp.header.workingunit" /></th>
					<th><liferay-ui:message key="org.oep.ssomgt.portlet.assignrole.table.header.action" /></th>
				</tr>
				<%
				for (AppRole2JobPos data : dataJPs) {
					%>
					<portlet:actionURL var="deleteJPUrl" name="deleteJP">
						<portlet:param name="<%= PortletKeys.REDIRECT_PAGE %>" value="<%= redirectURL %>"/>
						<portlet:param name="<%= AppRole2JobPosKeys.BaseAppRole2JobPosAttributes.DELETE_ID %>" value="<%= String.valueOf(data.getAppRole2JobPosId()) %>"/>
					</portlet:actionURL>
					<%
						if (index % 2 == 0) {
					%>
					<tr class="success">
						<td style="text-align:center"><%=(searchContainer.getStart() +  (index++))%></td>
						<td style="text-align:left"><%= data.getJobPos().getTitle() %></td>
						<td style="text-align:left"><%= data.getWorkingUnit().getName() %></td>
						<td style="text-align:center">
							<c:if test='<%= SSOPermission.contains(permissionChecker, scopeGroupId, "ADMIN_SSOMGT") %>'>
								<a class="btn btn-primary" href="#" title="<liferay-ui:message key="org.oep.ssomgt.portlet.assignrole.table.action.title.delete" />" onclick="if (confirm('<%= LanguageUtil.get(pageContext, "org.oep.ssomgt.portlet.assignrole.confirm.message.beforedelete")%>')) {location.href = '<%= deleteJPUrl %>';return false;}"><i class="icon-trash"><liferay-ui:message key="org.oep.ssomgt.portlet.assignrole.table.action.title.delete" /></i></a>
							</c:if>
						</td>
					</tr>
					<%
						}
						else {
					%>
					<tr class="info">
						<td style="text-align:center"><%=(searchContainer.getStart() +  (index++))%></td>
						<td style="text-align:left"><%= data.getJobPos().getTitle() %></td>
						<td style="text-align:left"><%= data.getWorkingUnit().getName() %></td>
						<td style="text-align:center">
							<c:if test='<%= SSOPermission.contains(permissionChecker, scopeGroupId, "ADMIN_SSOMGT") %>'>
								<a class="btn btn-primary" href="#" title="<liferay-ui:message key="org.oep.ssomgt.portlet.assignrole.table.action.title.delete" />" onclick="if (confirm('<%= LanguageUtil.get(pageContext, "org.oep.ssomgt.portlet.assignrole.confirm.message.beforedelete")%>')) {location.href = '<%= deleteJPUrl %>';return false;}"><i class="icon-trash"><liferay-ui:message key="org.oep.ssomgt.portlet.assignrole.table.action.title.delete" /></i></a>
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
					<td colspan="4">
						<p class="bg-success">
							<liferay-ui:message key="org.oep.ssomgt.portlet.assignrole.table.warning.empty" />
						</p>
					</td>
				</tr>
				<%
			}
			%>
			</table>
			<c:if test="<%= searchContainer != null %>">
				<br />
				<div id="pagination">
					<liferay-ui:search-paginator searchContainer="<%= searchContainer %>" />
				</div>
			</c:if>		
		</aui:column>
		<aui:column columnWidth="50">
			<table class="table table-bordered table-hover">
			<%
			if (dataEPs != null && dataEPs.size() > 0) {
				int index=1;
				%>
				<tr style="text-align:center">
					<th width="4%"><liferay-ui:message key="org.oep.ssomgt.portlet.assignrole.tableep.header.no" /></th>
					<th width="35%"><liferay-ui:message key="org.oep.ssomgt.portlet.assignrole.tableep.header.employee" /></th>
					<th width="35%"><liferay-ui:message key="org.oep.ssomgt.portlet.assignrole.tableep.header.workingunit" /></th>
					<th><liferay-ui:message key="org.oep.ssomgt.portlet.assignrole.table.header.action" /></th>
				</tr>
				<%
				for (AppRole2Employee data : dataEPs) {
					%>
					<portlet:actionURL var="deleteEPUrl" name="deleteEP">
						<portlet:param name="<%= PortletKeys.REDIRECT_PAGE %>" value="<%= redirectURL %>"/>
						<portlet:param name="<%= AppRole2EmployeeKeys.BaseAppRole2EmployeeAttributes.DELETE_ID %>" value="<%= String.valueOf(data.getAppRole2EmployeeId()) %>"/>
					</portlet:actionURL>
					<%
						if (index % 2 == 0) {
					%>
					<tr class="success">
						<td style="text-align:center"><%=(searchContainer.getStart() +  (index++))%></td>
						<td style="text-align:left"><%= data.getEmployee().getFullName()  %></td>
						<td style="text-align:left"><%= data.getWorkingUnit().getName()  %></td>
						<td style="text-align:center">
							<c:if test='<%= SSOPermission.contains(permissionChecker, scopeGroupId, "ADMIN_SSOMGT") %>'>
								<a class="btn btn-primary" href="#" title="<liferay-ui:message key="org.oep.ssomgt.portlet.assignrole.table.action.title.delete" />" onclick="if (confirm('<%= LanguageUtil.get(pageContext, "org.oep.ssomgt.portlet.assignrole.confirm.message.beforedelete")%>')) {location.href = '<%= deleteEPUrl %>';return false;}"><i class="icon-trash"><liferay-ui:message key="org.oep.ssomgt.portlet.assignrole.table.action.title.delete" /></i></a>
							</c:if>
						</td>
					</tr>
					<%
						}
						else {
					%>
					<tr class="info">
						<td style="text-align:center"><%=(searchContainer.getStart() +  (index++))%></td>
						<td style="text-align:left"><%= data.getEmployee().getFullName()  %></td>
						<td style="text-align:left"><%= data.getWorkingUnit().getName()  %></td>
						<td style="text-align:center">
							<c:if test='<%= SSOPermission.contains(permissionChecker, scopeGroupId, "ADMIN_SSOMGT") %>'>
								<a class="btn btn-primary" href="#" title="<liferay-ui:message key="org.oep.ssomgt.portlet.assignrole.table.action.title.delete" />" onclick="if (confirm('<%= LanguageUtil.get(pageContext, "org.oep.ssomgt.portlet.assignrole.confirm.message.beforedelete")%>')) {location.href = '<%= deleteEPUrl %>';return false;}"><i class="icon-trash"><liferay-ui:message key="org.oep.ssomgt.portlet.assignrole.table.action.title.delete" /></i></a>
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
					<td colspan="4">
						<p class="bg-success">
							<liferay-ui:message key="org.oep.ssomgt.portlet.assignrole.table.warning.empty" />
						</p>
					</td>
				</tr>
				<%
			}
			%>
			</table>
			<c:if test="<%= searchContainerEP != null %>">
				<br />
				<div id="pagination">
					<liferay-ui:search-paginator searchContainer="<%= searchContainerEP %>" />
				</div>
			</c:if>				
		</aui:column>
	</aui:row>
	<aui:row>
		<aui:column>
			<input class="btn btn-default" type="button" value="<liferay-ui:message key="org.oep.ssomgt.portlet.assignrole.button.back" />" onclick="<portlet:namespace/>back()"/>
		</aui:column>
	</aui:row>	
</aui:form>
<script type="text/javascript">
function <portlet:namespace/>back() {
	location.href = "<%= backURL.toString() %>";
};
function workingUnitChange() {
	var form = document.<portlet:namespace />searchAssignRole;
	form.action = "<%= searchAssignRole %>";
	form.submit();
};
</script>