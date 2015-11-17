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
<%@page import="org.oep.usermgt.service.EmployeeLocalServiceUtil"%>
<%@page import="org.oep.usermgt.model.Employee"%>
<%@page import="org.oep.usermgt.service.WorkingUnitLocalServiceUtil"%>
<%@page import="org.oep.usermgt.model.WorkingUnit"%>
<%@page import="org.oep.ssomgt.action.AppRole2EmployeeKeys"%>
<%@page import="org.oep.ssomgt.action.AssignRoleKeys"%>
<%@page import="org.oep.ssomgt.action.PortletKeys"%>
<%@page import="org.oep.ssomgt.action.AppRole2JobPosKeys"%>
<%@page import="com.liferay.portal.service.ServiceContextThreadLocal"%>
<%@page import="com.liferay.portal.service.ServiceContext"%>
<%@ include file="/html/ssomgt/portlet/approle/init.jsp" %>
 <%
	ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();
	long appRoleId = ParamUtil.getLong(request, AppRole2JobPosKeys.AddEditAttributes.APPROLE_ID, PortletKeys.LONG_DEFAULT);
	
	long workingUnitId = ParamUtil.getLong(request, AssignRoleKeys.AddEditAttributes.WORKING_UNIT_ID, PortletKeys.LONG_DEFAULT);
%>
<portlet:actionURL var="addEditAppRole2Employee" name="addEditAppRole2Employee">
	<portlet:param name="<%= PortletKeys.SET_VIEW_PARAMETER %>" value="/html/ssomgt/portlet/approle/assignrole2employee.jsp"/>
	<portlet:param name="<%= PortletKeys.REDIRECT_PAGE %>" value="<%= ParamUtil.getString(request, PortletKeys.REDIRECT_PAGE) %>"/>
	<portlet:param name="<%= AppRole2EmployeeKeys.AddEditAttributes.EDIT_ID %>" value="<%= ParamUtil.getString(request, AppRole2EmployeeKeys.AddEditAttributes.EDIT_ID) %>"/>
</portlet:actionURL>

<aui:form method="POST" name="addEditAppRole2EmployeeForm">
	<aui:input value="<%= String.valueOf(ParamUtil.getLong(request, AppRole2JobPosKeys.AddEditAttributes.APPROLE_ID, PortletKeys.LONG_DEFAULT)) %>" name="<%= AppRole2JobPosKeys.AddEditAttributes.APPROLE_ID %>" id="<%= AppRole2JobPosKeys.AddEditAttributes.APPROLE_ID %>" type="hidden"></aui:input>
	<aui:layout>
		<aui:column columnWidth="40">
			<aui:select disabled="<%= true %>" style="width: 100%;" onChange="workingUnitChange()" id="<%= AssignRoleKeys.SearchAttributes.WORKING_UNIT_ID %>" name="<%= AssignRoleKeys.SearchAttributes.WORKING_UNIT_ID %>" label="<%= LanguageUtil.get(pageContext, \"org.oep.ssomgt.portlet.assignrole.assignrole2jobpos.label.selectworkingunit\") %>">
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
	</aui:layout>
	<aui:layout>
		<aui:column columnWidth="40">
			<aui:select style="width: 100%;" id="<%= AppRole2EmployeeKeys.AddEditAttributes.EMPLOYEE_ID %>" name="<%= AppRole2EmployeeKeys.AddEditAttributes.EMPLOYEE_ID %>" label="<%= LanguageUtil.get(pageContext, \"org.oep.ssomgt.portlet.assignrole.assignrole2employee.label.selectemployee\") %>">
				<aui:option value="<%= PortletKeys.LONG_DEFAULT %>"><liferay-ui:message key="org.oep.ssomgt.portlet.assignrole.assignrole2employee.selectbox.employee" /></aui:option>
				<%
					List<Employee> lstEmployee = EmployeeLocalServiceUtil.getByWorkingUnit(workingUnitId);
				%>
				<c:forEach items="<%= lstEmployee %>" var="item">
					<aui:option value="${item.employeeId}">${item.fullName}</aui:option>
				</c:forEach>
			</aui:select>			
		</aui:column>
	</aui:layout>
	<aui:layout>
		<aui:button-row>
			<input class="btn btn-primary" type="button" value="<liferay-ui:message key="org.oep.ssomgt.portlet.assignrole.button.save" />" onclick="<portlet:namespace/>save()"/>
			<input class="btn btn-default" type="button" value="<liferay-ui:message key="org.oep.ssomgt.portlet.assignrole.button.back" />" onclick="<portlet:namespace/>back()"/>
		</aui:button-row>
	</aui:layout>
</aui:form>

<script type="text/javascript">
function <portlet:namespace/>save() {
	var form = document.<portlet:namespace />addEditAppRole2EmployeeForm;
	form.action = "<%= addEditAppRole2Employee %>";
	form.submit();
};

function <portlet:namespace/>back() {
	location.href = "<%= ParamUtil.getString(request, PortletKeys.REDIRECT_PAGE) %>";
};
</script> 