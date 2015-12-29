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
<%@page import="org.oep.usermgt.action.JobPosKeys"%>
<%@page import="org.oep.usermgt.service.JobPosLocalServiceUtil"%>
<%
	//ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();
	int cur = ParamUtil.getInteger(request, PortletKeys.SearchContainer.CURRENT_PAGE, PortletKeys.PAGE);
	int delta = ParamUtil.getInteger(request, PortletKeys.SearchContainer.DELTA, PortletKeys.DELTA);
	long workingUnitId = ParamUtil.getLong(request, JobPosKeys.AddEditAttributes.WORKINGUNITID, PortletKeys.SELECT_BOX);
	WorkingUnit workingUnit = WorkingUnitLocalServiceUtil.getWorkingUnit(workingUnitId);
	PortletURL iteratorUrl = renderResponse.createRenderURL();
	SearchContainer<JobPos> searchContainer = new SearchContainer<JobPos>(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, cur, delta, iteratorUrl, null, null);
	int total = JobPosLocalServiceUtil.countJobPosByWorkingUnit(workingUnitId);
	List<JobPos> datas = new ArrayList<JobPos>();
	if (total > 0) {
		int startIndex = searchContainer.getStart();
		int endIndex = searchContainer.getEnd();
		datas = JobPosLocalServiceUtil.getByWorkingUnit(workingUnitId);
		searchContainer.setResults(datas);
	}
%>
<portlet:renderURL var="redirectURL">
	<portlet:param name="<%=PortletKeys.SearchContainer.DELTA%>"
		value="<%=String.valueOf(ParamUtil.getInteger(request, PortletKeys.SearchContainer.DELTA, PortletKeys.DELTA))%>" />
	<portlet:param name="<%=PortletKeys.SearchContainer.CURRENT_PAGE%>"
		value="<%=String.valueOf(ParamUtil.getInteger(request, PortletKeys.SearchContainer.CURRENT_PAGE, PortletKeys.PAGE))%>" />
</portlet:renderURL>
<portlet:renderURL var="search">
	<portlet:param name="<%=PortletKeys.SearchContainer.DELTA%>"
		value="<%=String.valueOf(ParamUtil.getInteger(request, PortletKeys.SearchContainer.DELTA, PortletKeys.DELTA))%>" />
	<portlet:param name="<%=PortletKeys.SearchContainer.CURRENT_PAGE%>"
		value="<%=String.valueOf(ParamUtil.getInteger(request, PortletKeys.SearchContainer.CURRENT_PAGE, PortletKeys.PAGE))%>" />
</portlet:renderURL>
<portlet:renderURL var="addEdit">
	<portlet:param name="<%=PortletKeys.SET_VIEW_PARAMETER%>"
		value="/html/usermgt/portlet/jobpos/jobpos_detail.jsp" />
	<portlet:param name="<%=PortletKeys.REDIRECT_PAGE%>"
		value="<%=redirectURL%>" />
	<portlet:param	name="<%=JobPosKeys.AddEditAttributes.WORKINGUNITID%>"
					value="<%=String.valueOf(workingUnitId)%>" />
</portlet:renderURL>
<aui:form name="searchApplication"  method="POST">
<liferay-ui:message key="org.oep.usermgt.portlet.jobpos.title"></liferay-ui:message>
<liferay-ui:message key="<%=workingUnit.getName()%>"></liferay-ui:message>
		
		<p></p>
	<div class="table-responsive">
		<table class="table table-bordered table-hover">
			<%
				if (datas != null && datas.size() > 0) {
				int index=1;
			%>

			
			<tr>
				<th style="text-align: center" width="8%"><liferay-ui:message
						key="org.oep.usermgt.portlet.table.header.no" /></th>
				<th width="30%"><liferay-ui:message
						key="org.oep.usermgt.portlet.jobpos.table.header.title" /></th>
				<th width="20%"><liferay-ui:message
						key="org.oep.usermgt.portlet.jobpos.table.header.positionCatNo" /></th>
				<th width="15%"><liferay-ui:message
						key="org.oep.usermgt.portlet.jobpos.table.header.leader" /></th>
				<th style="text-align: center"><liferay-ui:message
						key="org.oep.usermgt.portlet.table.header.action" /></th>
			</tr>
			<%
				for (JobPos data : datas) {
			%>
			<portlet:actionURL var="deleteUrl" name="deleteJobPos">
				<portlet:param name="<%=PortletKeys.REDIRECT_PAGE%>"
					value="<%=redirectURL%>" />
				<portlet:param
					name="<%=JobPosKeys.BaseJobPosAttributes.DELETE_ID%>"
					value="<%=String.valueOf(data.getJobPosId())%>" />
					<portlet:param	name="<%=JobPosKeys.AddEditAttributes.WORKINGUNITID%>"
					value="<%=String.valueOf(workingUnitId)%>" />
			</portlet:actionURL>
			
			<portlet:actionURL var="editUrl" name="editJobPos">
				<portlet:param name="<%=PortletKeys.REDIRECT_PAGE%>"
					value="<%=redirectURL%>" />
				<portlet:param name="<%=PortletKeys.SET_VIEW_PARAMETER%>"
					value="/html/usermgt/portlet/jobpos/jobpos_detail.jsp" />
				<portlet:param
					name="<%=JobPosKeys.BaseJobPosAttributes.EDIT_ID%>"
					value="<%=String.valueOf(data.getJobPosId())%>" />
					<portlet:param	name="<%=JobPosKeys.AddEditAttributes.WORKINGUNITID%>"
					value="<%=String.valueOf(workingUnitId)%>" />
			</portlet:actionURL>
			<portlet:actionURL var="editeRole" name="toNextPage">
				<portlet:param name="<%=PortletKeys.REDIRECT_PAGE%>"
					value="<%=redirectURL%>" />
				<portlet:param name="<%=PortletKeys.SET_VIEW_PARAMETER%>"
					value="/html/usermgt/portlet/jobpos/jobpos_2_role.jsp" />
				<portlet:param
					name="<%=JobPosKeys.AddEditAttributes.JOBPOSID%>"
					value="<%=String.valueOf(data.getJobPosId())%>" />
				<portlet:param	name="<%=JobPosKeys.AddEditAttributes.WORKINGUNITID%>"
					value="<%=String.valueOf(workingUnitId)%>" />
					
			</portlet:actionURL>
			<%
				if (index % 2 == 0) {
			%>
			<tr class="success">
				<td style="text-align: center"><%=(searchContainer.getStart() +  (index++))%></td>
				<td style="text-align: left"><%=data.getTitle()%></td>
				<td style="text-align: left"><%=data.getPositionCatNo()%></td>
				<td style="text-align: left"><%=data.getLeader()%></td>
				<td style="text-align: left"><a href="#"
					class="btn btn-success"
					title="<liferay-ui:message key="org.oep.usermgt.portlet.table.action.title.edit" />"
					onclick="location.href = '<%=editUrl%>';return false;"><i
						class="icon-pencil"><liferay-ui:message
								key="org.oep.usermgt.portlet.table.action.title.edit" /></i></a> 
					<a href="#"
					class="btn btn-success"
					title="<liferay-ui:message key="org.oep.usermgt.portlet.jobpos.button.role" />"
					onclick="location.href = '<%=editeRole%>';return false;"><i
						class="icon-pencil"><liferay-ui:message
								key="org.oep.usermgt.portlet.jobpos.button.role" /></i></a> 
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
				<td style="text-align: center"><%=(searchContainer.getStart() +  (index++))%></td>
				<td style="text-align: left"><%=data.getTitle()%></td>
				<td style="text-align: left"><%=data.getPositionCatNo()%></td>
				<td style="text-align: left"><%=data.getLeader()%></td>
				<td style="text-align: left"><a href="#"
					class="btn btn-success"
					title="<liferay-ui:message key="org.oep.ssomgt.portlet.applicationmanagement.table.action.title.edit" />"
					onclick="location.href = '<%=editUrl%>';return false;"><i
						class="icon-pencil"><liferay-ui:message
								key="org.oep.usermgt.portlet.table.action.title.edit" /></i></a>
								<a href="#"
					class="btn btn-success"
					title="<liferay-ui:message key="org.oep.usermgt.portlet.jobpos.button.role" />"
					onclick="location.href = '<%=editeRole%>';return false;"><i
						class="icon-pencil"><liferay-ui:message
								key="org.oep.usermgt.portlet.jobpos.button.role" /></i></a> 
								 <a	href="#" class="btn btn-primary"
					title="<liferay-ui:message key="org.oep.ssomgt.portlet.applicationmanagement.table.action.title.delete" />"
					onclick="if (confirm('<%=LanguageUtil.get(pageContext, "org.oep.ssomgt.portlet.applicationmanagement.confirm.message.beforedelete")%>')) {location.href = '<%=deleteUrl%>';return false;}"><i
						class="icon-trash"><liferay-ui:message
								key="org.oep.usermgt.portlet.table.action.title.delete" /></i></a></td>
			</tr>
			<%
				}
			%>
			<%
				}
					} else {
			%>

			<tr>
				<td colspan="7">
					<p class="bg-success">
						<liferay-ui:message
							key="org.oep.usermgt.portlet.table.warning.empty" />
					</p>
				</td>
			</tr>
			<%
				}
			%>
		</table>
	</div>
	<c:if test="<%=searchContainer != null%>">
		<br />
		<div id="pagination">
			<liferay-ui:search-paginator searchContainer="<%=searchContainer%>" />
		</div>
	</c:if>
	<table  style="width: 100%;">
			<tr>
				<td style="width: 70%;">
				<a
					onclick="<portlet:namespace/>changeToAddStatus();return false;"
					class="btn btn-primary"><i class="icon-plus"><liferay-ui:message
								key="org.oep.usermgt.portlet.jobpos.button.addnew" /></i></a>
					<input class="btn btn-default" type="button" value="<liferay-ui:message key="org.oep.usermgt.portlet.button.cancel" />" onclick="<portlet:namespace/>back()"/>			
					</td>
			</tr>
		</table>
</aui:form>

<script type="text/javascript">
	function <portlet:namespace/>search() {
		var form = document.<portlet:namespace />searchApplication;
		form.action = "<%=search%>";
		form.submit();
	};
	
	function <portlet:namespace/>changeToAddStatus() {
		var form = document.<portlet:namespace />searchApplication;
		form.action = "<%=addEdit%>";
		form.submit();
	}
	function <portlet:namespace/>back() {
		location.href = "<%= ParamUtil.getString(request, PortletKeys.REDIRECT_PAGE) %>";
	};
	
</script>
