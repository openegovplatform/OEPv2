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
<%@ include file="/html/usermgt/portlet/init.jsp"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="org.oep.usermgt.action.PortletKeys"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.service.ServiceContextThreadLocal"%>
<%@page import="com.liferay.portal.service.ServiceContext"%>
<%@page import="org.oep.usermgt.model.WorkingUnit"%>
<%@page import="org.oep.usermgt.service.WorkingUnitLocalServiceUtil"%>
<%@page import="org.oep.usermgt.model.JobPos"%>
<%@page import="org.oep.usermgt.model.Employee"%>
<%@page import="org.oep.usermgt.action.EmployeeKeys"%>
<%@page import="org.oep.usermgt.service.JobPosLocalServiceUtil"%>
<%@page import="org.oep.usermgt.service.EmployeeLocalServiceUtil"%>
<%@page import="com.liferay.portal.model.Role"%>
<%@page import="com.liferay.portal.service.RoleLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%> 
<%
	//ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();
	
	long employeeId = ParamUtil.getLong(request, EmployeeKeys.BaseEmployeeAttributes.EDIT_ID, PortletKeys.SELECT_BOX);
		 Employee employee = EmployeeLocalServiceUtil.getEmployee(employeeId);
	ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();	
	ArrayList<JobPos> listJobPos = new ArrayList<JobPos>();
	listJobPos.addAll(JobPosLocalServiceUtil.getByWorkingUnit(employee.getWorkingUnitId()));
	//listRole.addAll(RoleLocalServiceUtil.getRoles(serviceContext.getCompanyId()));
	System.out.println("employeeId " + employeeId);
	List<JobPos>  datas = EmployeeLocalServiceUtil.getJobPos(listJobPos, employeeId); // new ArrayList<JobPos>();// JobPos2RoleLocalServiceUtil.getRoleIdByJobPosId(listRole, jobPosId);
%>
<portlet:renderURL var="redirectURL">
	<portlet:param name="<%=PortletKeys.SearchContainer.DELTA%>"
		value="<%=String.valueOf(ParamUtil.getInteger(request, PortletKeys.SearchContainer.DELTA, PortletKeys.DELTA))%>" />
	<portlet:param name="<%=PortletKeys.SearchContainer.CURRENT_PAGE%>"
		value="<%=String.valueOf(ParamUtil.getInteger(request, PortletKeys.SearchContainer.CURRENT_PAGE, PortletKeys.PAGE))%>" />
</portlet:renderURL>
<portlet:actionURL var="addEdit" name="addEditJobPos">
	<portlet:param name="<%= PortletKeys.SET_VIEW_PARAMETER %>" value="/html/usermgt/portlet/employee/employee_2_jobpos.jsp"/>
	<portlet:param name="<%= PortletKeys.REDIRECT_PAGE %>" value="<%= ParamUtil.getString(request, PortletKeys.REDIRECT_PAGE) %>"/>
	<portlet:param name="<%= EmployeeKeys.BaseEmployeeAttributes.EDIT_ID%>" value="<%= ParamUtil.getString(request, EmployeeKeys.BaseEmployeeAttributes.EDIT_ID) %>"/>
</portlet:actionURL>
<aui:form name="addEdit"  method="POST">
<liferay-ui:message key="org.oep.usermgt.portlet.jobpos.title"></liferay-ui:message>
<liferay-ui:message key="<%=employee.getFullName()%>"></liferay-ui:message>
		<table  style="width: 100%;">
			<tr>
				<td style="width: 40%;">
				<aui:select style="width: 98%;" cssClass="form-control"  name="<%=EmployeeKeys.AddEditAttributes.JOBPOSID%>" id="<%=EmployeeKeys.AddEditAttributes.JOBPOSID%>" label="" >
				<aui:option value=""><%=LanguageUtil
							.get(pageContext,
									"org.oep.usermgt.portlet.select.label.workingunit")%></aui:option>
				<%
				for (JobPos data : listJobPos) {
						boolean selected = false;
				%>
				
					<aui:option value='<%=data.getJobPosId()%>' selected="<%=selected%>"><%=data.getTitle()%></aui:option>
				<%
					}
				%>					
				</aui:select>
				</td>
				<td style="width: 30%;" align="left">
				<a onclick="<portlet:namespace/>changeToAddStatus();return false;"
					class="btn btn-primary"><i class="icon-plus"><liferay-ui:message
								key="org.oep.usermgt.portlet.jobpos2role.button.addnew" /></i></a></td>
			</tr>
		</table>
	<div class="table-responsive">
		<table class="table table-bordered table-hover">
			<%
				int index=1;
			%>
		
			<tr>
				<th style="text-align: center" width="8%"><liferay-ui:message
						key="org.oep.usermgt.portlet.table.header.no" /></th>
				<th width="25%"><liferay-ui:message
						key="org.oep.usermgt.portlet.jobpos2role.table.header.rolename" /></th>
				<th width="40%"><liferay-ui:message
						key="org.oep.usermgt.portlet.jobpos2role.table.header.description" /></th>
				<th style="text-align: center"><liferay-ui:message
						key="org.oep.usermgt.portlet.table.header.action" /></th>
			</tr>
			<%
				for (JobPos data : datas) {
			%>
			<portlet:actionURL var="deleteUrl" name="deleteJobPos">
				<portlet:param name="<%=PortletKeys.REDIRECT_PAGE%>"
					value="<%=redirectURL%>" />
				<portlet:param name="<%= PortletKeys.SET_VIEW_PARAMETER %>" 
					value="/html/usermgt/portlet/employee/employee_2_jobpos.jsp"/>
				<portlet:param
					name="<%=EmployeeKeys.BaseEmployeeAttributes.DELETE_ID%>"
					value="<%=String.valueOf(data.getJobPosId())%>" />
					<portlet:param	name="<%=EmployeeKeys.BaseEmployeeAttributes.EDIT_ID%>"
					value="<%=String.valueOf(employeeId)%>" />
			</portlet:actionURL>
			<portlet:actionURL var="daultJobPosUrl" name="setDefaultJobPos">
				<portlet:param name="<%=PortletKeys.REDIRECT_PAGE%>"
					value="<%=redirectURL%>" />
				<portlet:param name="<%= PortletKeys.SET_VIEW_PARAMETER %>" 
					value="/html/usermgt/portlet/employee/employee_2_jobpos.jsp"/>
				<portlet:param
					name="<%=EmployeeKeys.AddEditAttributes.MAINJOBPOSID%>"
					value="<%=String.valueOf(data.getJobPosId())%>" />
					<portlet:param	name="<%=EmployeeKeys.BaseEmployeeAttributes.EDIT_ID%>"
					value="<%=String.valueOf(employeeId)%>" />
			</portlet:actionURL>

			<%
				if (index % 2 == 0) {
			%>
			<tr class="success">
				<td style="text-align: center"><%=(index++)%></td>
				<td style="text-align: left"><%=data.getTitle()%></td>
				<td style="text-align: left"><%=data.getLeader()%></td>
				<td style="text-align: left">
				<td style="text-align: left"><a href="#"
					class="btn btn-success"
					title="<liferay-ui:message key="org.oep.usermgt.portlet.employee2jobpos.button.mainJobPos" />"
					onclick="location.href = '<%=daultJobPosUrl%>';return false;"><i
						class="icon-pencil"><liferay-ui:message
								key="org.oep.usermgt.portlet.employee2jobpos.button.mainJobPos" /></i></a> 
								<a href="#" class="btn btn-primary"
					title="<liferay-ui:message key="org.oep.usermgt.portlet.table.action.title.delete" />"
					onclick="if (confirm('<%=LanguageUtil.get(pageContext, "org.oep.usermgt.portlet.confirm.message.beforedelete")%>')) {location.href = '<%=deleteUrl%>';return false;}"><i
						class="icon-trash"><liferay-ui:message
								key="org.oep.usermgt.portlet.table.action.title.delete" /></i></a></td>
			</tr>
			<%
				}
						else {
			%>
			<tr class="info">
				<td style="text-align: center"><%=(index++)%></td>
				<td style="text-align: left"><%=data.getTitle()%></td>
				<td style="text-align: left"><%=data.getLeader()%></td>
				<td style="text-align: left">
				<a href="#"
					class="btn btn-success"
					title="<liferay-ui:message key="org.oep.usermgt.portlet.employee2jobpos.button.mainJobPos" />"
					onclick="location.href = '<%=daultJobPosUrl%>';return false;"><i
						class="icon-pencil"><liferay-ui:message
								key="org.oep.usermgt.portlet.employee2jobpos.button.mainJobPos" /></i></a> 
								 <a	href="#" class="btn btn-primary"
					title="<liferay-ui:message key="org.oep.ssomgt.portlet.applicationmanagement.table.action.title.delete" />"
					onclick="if (confirm('<%=LanguageUtil.get(pageContext, "org.oep.ssomgt.portlet.applicationmanagement.confirm.message.beforedelete")%>')) {location.href = '<%=deleteUrl%>';return false;}"><i
						class="icon-trash"><liferay-ui:message
								key="org.oep.usermgt.portlet.table.action.title.delete" /></i></a></td>
			</tr>
			<%
				}
				}
			%>
		</table>
	</div>
	
	<table >
			<tr>
				<td>
					<aui:button class="btn btn-default" name="closeDialog" type="button" value="org.oep.usermgt.portlet.button.cancel" />
				</td>
			</tr>
	</table>
</aui:form>
<script type="text/javascript">

	
	function <portlet:namespace/>changeToAddStatus() {
		var form = document.<portlet:namespace />addEdit;
		form.action = "<%=addEdit%>";
		form.submit();
	}
	function <portlet:namespace/>back() {
		location.href = "<%= ParamUtil.getString(request, PortletKeys.REDIRECT_PAGE) %>";
	};
	
</script>
 <aui:script use="aui-base">
    A.one('#<portlet:namespace/>closeDialog').on('click', function(event) {
    	// Let's suppose that "data" contains the processing results
    	//alert('pop');
    	// Invoke a function with processgin results and dialog id
    	Liferay.Util.getOpener().closePopup();
    	//Liferay.Util.getOpener().<portlet:namespace/>.closePopup('<portlet:namespace/>dialog');
    });
 </aui:script>