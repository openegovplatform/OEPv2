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
<%@page import="org.oep.usermgt.model.JobPos2Role"%>
<%@page import="org.oep.usermgt.action.JobPosKeys"%>
<%@page import="org.oep.usermgt.service.JobPosLocalServiceUtil"%>
<%@page import="org.oep.usermgt.service.JobPos2RoleLocalServiceUtil"%>
<%@page import="com.liferay.portal.model.Role"%>
<%@page import="com.liferay.portal.service.RoleLocalServiceUtil"%>

<%
	//ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();
	int cur = ParamUtil.getInteger(request, PortletKeys.SearchContainer.CURRENT_PAGE, PortletKeys.PAGE);
	int delta = ParamUtil.getInteger(request, PortletKeys.SearchContainer.DELTA, PortletKeys.DELTA);
	long workingUnitId = ParamUtil.getLong(request, JobPosKeys.AddEditAttributes.WORKINGUNITID, PortletKeys.SELECT_BOX);
	long jobPosId = ParamUtil.getLong(request, JobPosKeys.AddEditAttributes.JOBPOSID, PortletKeys.SELECT_BOX);
	WorkingUnit workingUnit = WorkingUnitLocalServiceUtil.getWorkingUnit(workingUnitId);
	ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();	
	ArrayList<Role> listRole = new ArrayList<Role>();
	listRole.addAll(RoleLocalServiceUtil.getRoles(serviceContext.getCompanyId()));
	ArrayList<Role>  datas = JobPos2RoleLocalServiceUtil.getRoleIdByJobPosId(listRole, jobPosId);


	
%>
<portlet:renderURL var="redirectURL">
	<portlet:param name="<%=PortletKeys.SearchContainer.DELTA%>"
		value="<%=String.valueOf(ParamUtil.getInteger(request, PortletKeys.SearchContainer.DELTA, PortletKeys.DELTA))%>" />
	<portlet:param name="<%=PortletKeys.SearchContainer.CURRENT_PAGE%>"
		value="<%=String.valueOf(ParamUtil.getInteger(request, PortletKeys.SearchContainer.CURRENT_PAGE, PortletKeys.PAGE))%>" />
</portlet:renderURL>
<portlet:actionURL var="addEdit" name="addEditJobPos2Role">
	<portlet:param name="<%= PortletKeys.SET_VIEW_PARAMETER %>" value="/html/usermgt/portlet/jobpos/jobpos_2_role.jsp"/>
	<portlet:param name="<%= PortletKeys.REDIRECT_PAGE %>" value="<%= ParamUtil.getString(request, PortletKeys.REDIRECT_PAGE) %>"/>
	<portlet:param name="<%= JobPosKeys.AddEditAttributes.JOBPOSID %>" value="<%= ParamUtil.getString(request, JobPosKeys.AddEditAttributes.JOBPOSID) %>"/>
	<portlet:param name="<%= JobPosKeys.AddEditAttributes.WORKINGUNITID %>" value="<%= ParamUtil.getString(request, JobPosKeys.AddEditAttributes.WORKINGUNITID) %>"/>
</portlet:actionURL>
<aui:form name="searchApplication"  method="POST">
<liferay-ui:message key="org.oep.usermgt.portlet.jobpos.title"></liferay-ui:message>
<liferay-ui:message key="<%=workingUnit.getName()%>"></liferay-ui:message>
		<table  style="width: 100%;">
			<tr>
				<td style="width: 40%;">
				<aui:select style="width: 98%;" cssClass="form-control"  name="<%= JobPosKeys.AddEditAttributes.ROLEID%>" id="<%= JobPosKeys.AddEditAttributes.ROLEID%>" label="" >
				<aui:option value=""><%=LanguageUtil
							.get(pageContext,
									"org.oep.usermgt.portlet.select.label.workingunit")%></aui:option>
				<%
				for (Role data : listRole) {
						boolean selected = false;
				%>
				
					<aui:option value='<%=data.getRoleId()%>' selected="<%=selected%>"><%=data.getName()%></aui:option>
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
				for (Role data : datas) {
			%>
			<portlet:actionURL var="deleteUrl" name="deleteJobPos">
				<portlet:param name="<%=PortletKeys.REDIRECT_PAGE%>"
					value="<%=redirectURL%>" />
				<portlet:param
					name="<%=JobPosKeys.BaseJobPosAttributes.DELETE_ID%>"
					value="<%=String.valueOf(data.getRoleId())%>" />
					<portlet:param	name="<%=JobPosKeys.AddEditAttributes.WORKINGUNITID%>"
					value="<%=String.valueOf(workingUnitId)%>" />
					<portlet:param	name="<%=JobPosKeys.AddEditAttributes.JOBPOSID%>"
					value="<%=String.valueOf(jobPosId)%>" />
			</portlet:actionURL>

			<%
				if (index % 2 == 0) {
			%>
			<tr class="success">
				<td style="text-align: center"><%=(index++)%></td>
				<td style="text-align: left"><%=data.getName()%></td>
				<td style="text-align: left"><%=data.getDescription()%></td>
				<td style="text-align: left">
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
				<td style="text-align: left"><%=data.getName()%></td>
				<td style="text-align: left"><%=data.getDescription()%></td>
				<td style="text-align: left">
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
	
	<table  style="width: 100%;">
			<tr>
				<td style="width: 70%;">
					<input class="btn btn-default" type="button" value="<liferay-ui:message key="org.oep.usermgt.portlet.button.cancel" />" onclick="<portlet:namespace/>back()"/>			
				</td>
			</tr>
		</table>
</aui:form>

<script type="text/javascript">

	
	function <portlet:namespace/>changeToAddStatus() {
		var form = document.<portlet:namespace />searchApplication;
		form.action = "<%=addEdit%>";
		form.submit();
	}
	function <portlet:namespace/>back() {
		location.href = "<%= ParamUtil.getString(request, PortletKeys.REDIRECT_PAGE) %>";
	};
	
</script>
