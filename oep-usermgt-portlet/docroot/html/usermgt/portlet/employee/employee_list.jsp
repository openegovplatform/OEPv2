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
<%@page import = "org.oep.usermgt.model.WorkingUnit" %>
<%@page import = "org.oep.usermgt.service.WorkingUnitLocalServiceUtil" %>
<%@page import="org.oep.usermgt.model.Employee"%>
<%@page import="org.oep.usermgt.action.EmployeeKeys"%>
<%@page import="org.oep.usermgt.service.EmployeeLocalServiceUtil"%>

<%@page import="org.oep.usermgt.dto.SelectionDataDTO"%>
<%@page import="org.oep.usermgt.util.CustomAUIUtil"%>
<%
	ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();
	String textSearch = ParamUtil.getString(request,EmployeeKeys.BaseEmployeeAttributes.TEXTSEARCH,PortletKeys.TEXT_BOX);
	
	int cur = ParamUtil.getInteger(request, PortletKeys.SearchContainer.CURRENT_PAGE, PortletKeys.PAGE);
	int delta = ParamUtil.getInteger(request, PortletKeys.SearchContainer.DELTA, PortletKeys.DELTA);
	PortletURL iteratorUrl = renderResponse.createRenderURL();
	long workingUnitId = ParamUtil.getLong(request,EmployeeKeys.BaseEmployeeAttributes.WORKINGUNITID,PortletKeys.LONG_DEFAULT);
	//List<WorkingUnit> dsWorkingUnit = WorkingUnitLocalServiceUtil.getByCompany(serviceContext);
	ArrayList<SelectionDataDTO>  dsWorkingUnit = CustomAUIUtil.getListWorkingUnit(serviceContext);
	SearchContainer<Object[]> searchContainer = new SearchContainer<Object[]>(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, cur, delta, iteratorUrl, null, null);
	int total = EmployeeLocalServiceUtil.countEmployeeByLikeNameWorkingUnit(textSearch, workingUnitId);
	
	searchContainer.setTotal(total);
	List<Object[]> datas = new ArrayList<Object[]>();
	if (total > 0) {
		int startIndex = searchContainer.getStart();
		int endIndex = searchContainer.getEnd();
		datas = EmployeeLocalServiceUtil.finnderByLikeNameForView(textSearch, workingUnitId);
		searchContainer.setResults(datas);
	}
%>

<portlet:renderURL var="redirectURL">
	<portlet:param name="<%=PortletKeys.SearchContainer.DELTA%>"
		value="<%=String.valueOf(ParamUtil.getInteger(request, PortletKeys.SearchContainer.DELTA, PortletKeys.DELTA))%>" />
	<portlet:param name="<%=PortletKeys.SearchContainer.CURRENT_PAGE%>"
		value="<%=String.valueOf(ParamUtil.getInteger(request, PortletKeys.SearchContainer.CURRENT_PAGE, PortletKeys.PAGE))%>" />
		<portlet:param name="<%=EmployeeKeys.BaseEmployeeAttributes.TEXTSEARCH%>" value="<%=textSearch%>"/>
</portlet:renderURL>
<portlet:renderURL var="search">
	<portlet:param name="<%=PortletKeys.SearchContainer.DELTA%>"
		value="<%=String.valueOf(ParamUtil.getInteger(request, PortletKeys.SearchContainer.DELTA, PortletKeys.DELTA))%>" />
	<portlet:param name="<%=PortletKeys.SearchContainer.CURRENT_PAGE%>"
		value="<%=String.valueOf(ParamUtil.getInteger(request, PortletKeys.SearchContainer.CURRENT_PAGE, PortletKeys.PAGE))%>" />
</portlet:renderURL>
<portlet:renderURL var="addEdit">
	<portlet:param name="<%=PortletKeys.SET_VIEW_PARAMETER%>"
		value="/html/usermgt/portlet/employee/employee_detail.jsp" />
	<portlet:param name="<%=PortletKeys.REDIRECT_PAGE%>"
		value="<%=redirectURL%>" />
</portlet:renderURL>
<aui:form name="searchApplication"  method="POST">
		<table  style="width: 100%;">
			<tr>
				<td style="width: 40%;">
				<aui:select style="width: 98%;" cssClass="form-control"  name="<%=EmployeeKeys.BaseEmployeeAttributes.WORKINGUNITID%>" id="<%= EmployeeKeys.BaseEmployeeAttributes.WORKINGUNITID%>" label="" >
				<aui:option value=""><%=LanguageUtil
							.get(pageContext,
									"org.oep.usermgt.portlet.select.label.workingunit")%></aui:option>
				<%
				for (SelectionDataDTO data : dsWorkingUnit) {
						boolean selected = workingUnitId == data.getId();
				%>
				
					<aui:option value='<%=data.getId()%>' selected="<%=selected%>"><%=data.getNameForLevel()%></aui:option>
				<%
					}
				%>					
				</aui:select>
				</td>
				<td  style="width: 30%;">
					<div class="form-search">
						<div class="input-append">
							<input type="text"  name="<portlet:namespace/><%=EmployeeKeys.BaseEmployeeAttributes.TEXTSEARCH%>" 
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
				<a onclick="<portlet:namespace/>changeToAddStatus();return false;"
					class="btn btn-primary"><i class="icon-plus"><liferay-ui:message
								key="org.oep.usermgt.portlet.employee.button.addnew" /></i></a></td>
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
				<th style="text-align: center" width="5%"><liferay-ui:message
						key="org.oep.usermgt.portlet.table.header.no" /></th>
				<th width="20%"><liferay-ui:message
						key="org.oep.usermgt.portlet.employee.table.header.fullName" /></th>
				<th width="10%"><liferay-ui:message
						key="org.oep.usermgt.portlet.employee.table.header.employeeNo" /></th>
				<th width="25%"><liferay-ui:message
						key="org.oep.usermgt.portlet.employee.table.header.workingUnitId" /></th>
				<th width="15%"><liferay-ui:message
						key="org.oep.usermgt.portlet.employee.table.header.mainJobPosId" /></th>
				<th width="10%" style="text-align: center"><liferay-ui:message
						key="org.oep.usermgt.portlet.employee.table.header.mappingUserId" /></th>
				<th style="text-align: center"><liferay-ui:message
						key="org.oep.usermgt.portlet.table.header.action" /></th>
			</tr>
			<%
				for (Object obj : datas) {
					Object[] objects = (Object[])obj;
					Employee data = (Employee)objects[0];
					String work = (String)objects[1];
					if (work == null) work = "";
					String jobpos = (String)objects[2];
					if (jobpos == null) jobpos = "";
					String screenName = (String)objects[3];
					if (screenName == null) screenName = "";
			%>
			<portlet:actionURL var="deleteUrl" name="delete">
				<portlet:param name="<%=PortletKeys.REDIRECT_PAGE%>"
					value="<%=redirectURL%>" />
				<portlet:param
					name="<%=EmployeeKeys.BaseEmployeeAttributes.DELETE_ID%>"
					value="<%=String.valueOf(data.getEmployeeId())%>" />
			</portlet:actionURL>
			<portlet:actionURL var="editUrl" name="edit">
				<portlet:param name="<%=PortletKeys.REDIRECT_PAGE%>"
					value="<%=redirectURL%>" />
				<portlet:param name="<%=PortletKeys.SET_VIEW_PARAMETER%>"
					value="/html/usermgt/portlet/employee/employee_detail.jsp" />
				<portlet:param
					name="<%=EmployeeKeys.BaseEmployeeAttributes.EDIT_ID%>"
					value="<%=String.valueOf(data.getEmployeeId())%>" />
			</portlet:actionURL>
			

			<liferay-portlet:renderURL
   					 var="testPopupURL"
   					 windowState="<%=LiferayWindowState.POP_UP.toString() %>">
    				<liferay-portlet:param name="<%=PortletKeys.REDIRECT_PAGE%>"
						value="<%=redirectURL%>" />
					<liferay-portlet:param name="<%=PortletKeys.SET_VIEW_PARAMETER%>"
						value="/html/usermgt/portlet/employee/employee_changepassword.jsp" />
					<liferay-portlet:param
						name="<%=EmployeeKeys.BaseEmployeeAttributes.EDIT_ID%>"
						value="<%=String.valueOf(data.getEmployeeId())%>" />
			</liferay-portlet:renderURL>
			<portlet:actionURL var="changePassword" name="edit" windowState="<%=LiferayWindowState.POP_UP.toString() %>">
				<portlet:param name="<%=PortletKeys.REDIRECT_PAGE%>"
					value="<%=redirectURL%>" />
				<portlet:param name="<%=PortletKeys.SET_VIEW_PARAMETER%>"
					value="/html/usermgt/portlet/employee/employee_changepassword.jsp" />
				<portlet:param
					name="<%=EmployeeKeys.BaseEmployeeAttributes.EDIT_ID%>"
					value="<%=String.valueOf(data.getEmployeeId())%>" />
				
			</portlet:actionURL>
			<portlet:renderURL var="changeJopPos" windowState="<%=LiferayWindowState.POP_UP.toString() %>">
				<portlet:param name="<%=PortletKeys.REDIRECT_PAGE%>"
					value="<%=redirectURL%>" />
				<portlet:param name="<%=PortletKeys.SET_VIEW_PARAMETER%>"
					value="/html/usermgt/portlet/employee/employee_2_jobpos.jsp" />
				<portlet:param
					name="<%=EmployeeKeys.BaseEmployeeAttributes.EDIT_ID%>"
					value="<%=String.valueOf(data.getEmployeeId())%>" />
			</portlet:renderURL>
			<%
			
			 %>
			<%
				String popuppass = "javascript:Liferay.ABC.popup('"+changePassword.toString()+"',500,350,'"+
						LanguageUtil.get(pageContext,"org.oep.usermgt.portlet.employee.table.action.title.changepassword")+"')";
				String popupjob = "javascript:Liferay.ABC.popup('"+changeJopPos.toString()+"',600,600,'"+
						LanguageUtil.get(pageContext,"org.oep.usermgt.portlet.employee.table.action.title.changejobpos")+"')";
				if (index % 2 == 0) {
			%>
			<tr class="success">
				<td style="text-align: center"><%=(searchContainer.getStart() +  (index++))%></td>
				<td style="text-align: left"><%=data.getFullName()%></td>
				<td style="text-align: left"><%=data.getEmployeeNo()%></td>
				<td style="text-align: left"><%=work%></td>
				<td style="text-align: left"><%=jobpos%></td>
				<td style="text-align: left"><%=screenName%></td>
				<td style="text-align: left">
				<liferay-ui:icon-menu>
						<liferay-ui:icon image="edit" url="<%=editUrl%>" message="org.oep.usermgt.portlet.table.action.title.edit"/> 
						<liferay-ui:icon image="add_location" url="<%=popupjob%>" message="org.oep.usermgt.portlet.employee.table.action.title.changejobpos"/>  
					 	<liferay-ui:icon image="key" url="<%=popuppass%>" message="org.oep.usermgt.portlet.employee.table.action.title.changepassword"  /> 
					 	<liferay-ui:icon image="delete" url="<%= deleteUrl %>" message="org.oep.usermgt.portlet.table.action.title.delete"/> 
					 	
				</liferay-ui:icon-menu>
						</td>
			</tr>
			<%
				}
						else {
			%>
			<tr class="info">
				<td style="text-align: center"><%=(searchContainer.getStart() +  (index++))%></td>
				<td style="text-align: left"><%=data.getFullName()%></td>
				<td style="text-align: left"><%=data.getEmployeeNo()%></td>
				<td style="text-align: left"><%=work%></td>
				<td style="text-align: left"><%=jobpos%></td>
				<td style="text-align: left"><%=screenName%></td>
				<td style="text-align: left">
				
				<liferay-ui:icon-menu>
		
						<liferay-ui:icon image="edit" url="<%=editUrl%>" message="org.oep.usermgt.portlet.table.action.title.edit"/>  
					 	<liferay-ui:icon image="add_location" url="<%=popupjob%>" message="org.oep.usermgt.portlet.employee.table.action.title.changejobpos"/>  
					 	<liferay-ui:icon image="key" method="get"  url="<%=popuppass%>" message="org.oep.usermgt.portlet.employee.table.action.title.changepassword" />
					 	<liferay-ui:icon image="delete" url="<%= deleteUrl %>" message="org.oep.usermgt.portlet.table.action.title.delete"/> 
						
				</liferay-ui:icon-menu>
				
								
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
<portlet:renderURL var="somePageURL" windowState="<%= LiferayWindowState.POP_UP.toString() %>">
	<portlet:param name="<%=PortletKeys.REDIRECT_PAGE%>"
						value="<%=redirectURL%>" />
					<portlet:param name="<%=PortletKeys.SET_VIEW_PARAMETER%>"
						value="/html/usermgt/portlet/employee/employee_changepassword.jsp" />

</portlet:renderURL>
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

<aui:script use="liferay-util-window">
Liferay.namespace('ABC');
		Liferay.provide(Liferay.ABC,'popup',function(url,width,height,title) {
				var A = AUI();
				Liferay.Util.openWindow({
		            dialog: {
		                centered: true,
		                height: height,
		                modal: true,
		                width: width
		            },
		            id: 'dialogId',
		            title: title,
		            uri: url
		        });

			},
		['aui-base','aui-dialog','aui-io-deprecated','liferay-util-window']
	);
		

</aui:script>

<aui:script>
Liferay.provide(window,'closePopup',
		function() {
			var A = AUI();
			var dialog = Liferay.Util.Window.getById('dialogId');
			dialog.destroy();
		},
		['liferay-util-window']
	);
</aui:script>
