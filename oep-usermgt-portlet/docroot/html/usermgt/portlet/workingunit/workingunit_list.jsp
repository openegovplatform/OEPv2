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
<%@page import="org.oep.usermgt.action.WorkingUnitKeys"%>
<%@page import="org.oep.usermgt.service.WorkingUnitLocalServiceUtil"%>
<%
	ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();
	String textSearch = ParamUtil.getString(request,WorkingUnitKeys.BaseWorkingUnitAttributes.TEXTSEARCH,PortletKeys.TEXT_BOX);
	int cur = ParamUtil.getInteger(request, PortletKeys.SearchContainer.CURRENT_PAGE, PortletKeys.PAGE);
	int delta = ParamUtil.getInteger(request, PortletKeys.SearchContainer.DELTA, PortletKeys.DELTA);
	PortletURL iteratorUrl = renderResponse.createRenderURL();
	SearchContainer<WorkingUnit> searchContainer = new SearchContainer<WorkingUnit>(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, cur, delta, iteratorUrl, null, null);
	int total = WorkingUnitLocalServiceUtil.countWorkingUnitByLikeName(textSearch, 0, serviceContext);
	searchContainer.setTotal(total);
	List<WorkingUnit> datas = new ArrayList<WorkingUnit>();
	if (total > 0) {
		int startIndex = searchContainer.getStart();
		int endIndex = searchContainer.getEnd();
		datas = WorkingUnitLocalServiceUtil.finderByLikeName(textSearch, 0, serviceContext);
		searchContainer.setResults(datas);
	}
%>

<portlet:renderURL var="redirectURL">
	<portlet:param name="<%=PortletKeys.SearchContainer.DELTA%>"
		value="<%=String.valueOf(ParamUtil.getInteger(request, PortletKeys.SearchContainer.DELTA, PortletKeys.DELTA))%>" />
	<portlet:param name="<%=PortletKeys.SearchContainer.CURRENT_PAGE%>"
		value="<%=String.valueOf(ParamUtil.getInteger(request, PortletKeys.SearchContainer.CURRENT_PAGE, PortletKeys.PAGE))%>" />
		<portlet:param name="<%=WorkingUnitKeys.BaseWorkingUnitAttributes.TEXTSEARCH%>" value="<%=textSearch%>"/>
</portlet:renderURL>
<portlet:renderURL var="search">
	<portlet:param name="<%=PortletKeys.SearchContainer.DELTA%>"
		value="<%=String.valueOf(ParamUtil.getInteger(request, PortletKeys.SearchContainer.DELTA, PortletKeys.DELTA))%>" />
	<portlet:param name="<%=PortletKeys.SearchContainer.CURRENT_PAGE%>"
		value="<%=String.valueOf(ParamUtil.getInteger(request, PortletKeys.SearchContainer.CURRENT_PAGE, PortletKeys.PAGE))%>" />
</portlet:renderURL>
<portlet:renderURL var="addEdit">
	<portlet:param name="<%=PortletKeys.SET_VIEW_PARAMETER%>"
		value="/html/usermgt/portlet/workingunit/workingunit_detail.jsp" />
	<portlet:param name="<%=PortletKeys.REDIRECT_PAGE%>"
		value="<%=redirectURL%>" />
</portlet:renderURL>
<aui:form name="searchApplication"  method="POST">
		<table  style="width: 100%;">
			<tr>
				<td style="width: 70%;">
					<div class="form-search">
						<div class="input-append">
							<input type="text"  name="<portlet:namespace/><%=WorkingUnitKeys.BaseWorkingUnitAttributes.TEXTSEARCH%>" 
							 value = "<%=textSearch%>"
							style="width: 98%;" class="span2 search-query">
							<button type="button" class="btn" onclick="<portlet:namespace/>search()">
								<liferay-ui:message
									key="org.oep.usermgt.portlet.button.search.label" />
							</button>
						</div>
					</div>
				</td>

				<td style="width: 30%;" align="right">
				<a
					onclick="<portlet:namespace/>changeToAddStatus();return false;"
					class="btn btn-primary"><i class="icon-plus"><liferay-ui:message
								key="org.oep.usermgt.portlet.workingunit.button.addnew" /></i></a></td>
			</tr>
		</table>
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
				<th width="20%"><liferay-ui:message
						key="org.oep.usermgt.portlet.workingunit.table.header.name" /></th>
				<th width="10%"><liferay-ui:message
						key="org.oep.usermgt.portlet.workingunit.table.header.workingUnitCode" /></th>
				<th width="20%"><liferay-ui:message
						key="org.oep.usermgt.portlet.workingunit.table.header.parentWorkingUnitId" /></th>
				<th width="15%"><liferay-ui:message
						key="org.oep.usermgt.portlet.workingunit.table.header.address" /></th>
				<th style="text-align: center"><liferay-ui:message
						key="org.oep.usermgt.portlet.workingunit.table.header.telNo" /></th>
				<th style="text-align: center"><liferay-ui:message
						key="org.oep.usermgt.portlet.table.header.action" /></th>
			</tr>
			<%
				for (WorkingUnit data : datas) {
			%>
			<portlet:actionURL var="deleteUrl" name="delete">
				<portlet:param name="<%=PortletKeys.REDIRECT_PAGE%>"
					value="<%=redirectURL%>" />
				<portlet:param
					name="<%=WorkingUnitKeys.BaseWorkingUnitAttributes.DELETE_ID%>"
					value="<%=String.valueOf(data.getWorkingUnitId())%>" />
			</portlet:actionURL>
			<portlet:actionURL var="editUrl" name="edit">
				<portlet:param name="<%=PortletKeys.REDIRECT_PAGE%>"
					value="<%=redirectURL%>" />
				<portlet:param name="<%=PortletKeys.SET_VIEW_PARAMETER%>"
					value="/html/usermgt/portlet/workingunit/workingunit_detail.jsp" />
				<portlet:param
					name="<%=WorkingUnitKeys.BaseWorkingUnitAttributes.EDIT_ID%>"
					value="<%=String.valueOf(data.getWorkingUnitId())%>" />
			</portlet:actionURL>
			<%
				if (index % 2 == 0) {
			%>
			<tr class="success">
				<td style="text-align: center"><%=(searchContainer.getStart() +  (index++))%></td>
				<td style="text-align: left"><%=data.getName()%></td>
				<td style="text-align: left"><%=data.getGovAgencyId()%></td>
				<td style="text-align: left"><%=data.getParentWorkingUnitId()%></td>
				<td style="text-align: left"><%=data.getAddress()%></td>
				<td style="text-align: left"><%=data.getTelNo()%></td>
				<td style="text-align: left"><a href="#"
					class="btn btn-success"
					title="<liferay-ui:message key="org.oep.usermgt.portlet.table.action.title.edit" />"
					onclick="location.href = '<%=editUrl%>';return false;"><i
						class="icon-pencil"><liferay-ui:message
								key="org.oep.usermgt.portlet.table.action.title.edit" /></i></a> 
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
				<td style="text-align: left"><%=data.getName()%></td>
				<td style="text-align: left"><%=data.getGovAgencyId()%></td>
				<td style="text-align: left"><%=data.getParentWorkingUnitId()%></td>
				<td style="text-align: left"><%=data.getAddress()%></td>
				<td style="text-align: left"><%=data.getTelNo()%></td>
				<td style="text-align: left"><a href="#"
					class="btn btn-success"
					title="<liferay-ui:message key="org.oep.ssomgt.portlet.applicationmanagement.table.action.title.edit" />"
					onclick="location.href = '<%=editUrl%>';return false;"><i
						class="icon-pencil"><liferay-ui:message
								key="org.oep.usermgt.portlet.table.action.title.edit" /></i></a> <a
					href="#" class="btn btn-primary"
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
</aui:form>

<script type="text/javascript">
	function <portlet:namespace/>search() {
		var form = document.<portlet:namespace />searchApplication;
		form.action = "<%=search%>";
		form.submit();
	};
	
	function <portlet:namespace/>changeToAddStatus() {
		var form = document.<portlet:namespace />searchApplication;
		form.action = "<%= addEdit%>";
		form.submit();
	}
	
</script>