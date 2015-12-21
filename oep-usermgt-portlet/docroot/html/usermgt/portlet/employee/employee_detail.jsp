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
 <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<%@page import="org.oep.usermgt.action.PortletKeys"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="org.oep.usermgt.action.EmployeeKeys"%>
<%@page import="org.oep.usermgt.model.Employee"%>
<%@page import="org.oep.usermgt.service.EmployeeLocalServiceUtil"%>
<%@ page import="org.oep.datamgt.service.DictDataLocalServiceUtil"%>
<%@page import = "org.oep.usermgt.model.WorkingUnit" %>
<%@page import = "org.oep.usermgt.service.WorkingUnitLocalServiceUtil" %>
<%@ page import="org.oep.datamgt.model.DictData"%>
<portlet:actionURL var="addEdit" name="addEdit">
	<portlet:param name="<%= PortletKeys.SET_VIEW_PARAMETER %>" value="/html/usermgt/portlet/employee/employee_detail.jsp"/>
	<portlet:param name="<%= PortletKeys.REDIRECT_PAGE %>" value="<%= ParamUtil.getString(request, PortletKeys.REDIRECT_PAGE) %>"/>
	<portlet:param name="<%= EmployeeKeys.BaseEmployeeAttributes.EDIT_ID %>" value="<%= ParamUtil.getString(request, EmployeeKeys.BaseEmployeeAttributes.EDIT_ID) %>"/>
</portlet:actionURL>
<%

	//String cityNo = ParamUtil.getString(request,EmployeeKeys.AddEditAttributes.CITYNAME,PortletKeys.TEXT_BOX);
	//String districtNo = ParamUtil.getString(request,EmployeeKeys.AddEditAttributes.DISTRICTNAME,PortletKeys.TEXT_BOX);
	//String wardNo = ParamUtil.getString(request,EmployeeKeys.AddEditAttributes.WARDNAME,PortletKeys.TEXT_BOX);
	//long  parentEmployeeId = ParamUtil.getLong(request,EmployeeKeys.AddEditAttributes.PARENTWORKINGUNITID,PortletKeys.SELECT_BOX);
	ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

	long workingUnitId = ParamUtil.getLong(request,EmployeeKeys.AddEditAttributes.WORKINGUNITID,PortletKeys.LONG_DEFAULT);
	List<WorkingUnit> dsWorkingUnit = WorkingUnitLocalServiceUtil.getByCompany(serviceContext);
	
	//List<Employee>  parentEmployeeList = EmployeeLocalServiceUtil.getByCompanyTree(serviceContext);

%>
<aui:form name="addEdit" method="post" enctype="multipart/form-data">
	<div class="form-group">
		<aui:row>

					<aui:row>
						<aui:column columnWidth="50">
						<aui:select style="width: 95%;" cssClass="form-control"  name="<%=EmployeeKeys.AddEditAttributes.WORKINGUNITID%>" id="<%= EmployeeKeys.AddEditAttributes.WORKINGUNITID%>" label="org.oep.usermgt.portlet.employee.table.header.workingUnitId" >
				<aui:option value=""><%=LanguageUtil
							.get(pageContext,
									"org.oep.usermgt.portlet.select.label.workingunit")%></aui:option>
				<%
				for (WorkingUnit data : dsWorkingUnit) {
						boolean selected = workingUnitId == data.getWorkingUnitId();
				%>
				
					<aui:option value='<%=data.getWorkingUnitId()%>' selected="<%=selected%>"><%=data.getName()%></aui:option>
				<%
					}
				%>					
				</aui:select>
							</aui:column>
		
						<aui:column columnWidth="50">
							<aui:input style="width: 95%;" cssClass="form-control" name="<%=EmployeeKeys.AddEditAttributes.PERSONELDOCNO%>" id="<%= EmployeeKeys.AddEditAttributes.PERSONELDOCNO%>" label="org.oep.usermgt.portlet.employee.table.header.personelDocNo" type="text"></aui:input>
						</aui:column>
					</aui:row>
					<aui:row>
					    <aui:column columnWidth="50">
					    	
					    	<aui:input style="width: 95%;" cssClass="form-control" name="<%=EmployeeKeys.AddEditAttributes.FULLNAME%>" id="<%= EmployeeKeys.AddEditAttributes.FULLNAME%>" label="org.oep.usermgt.portlet.employee.table.header.fullName" type="text"></aui:input>
						</aui:column>
						  <aui:column columnWidth="50">
								<aui:input style="width: 95%;" cssClass="form-control" name="<%=EmployeeKeys.AddEditAttributes.EMPLOYEENO%>" id="<%= EmployeeKeys.AddEditAttributes.EMPLOYEENO%>" label="org.oep.usermgt.portlet.employee.table.header.employeeNo" type="text"></aui:input>
			
						</aui:column>
					</aui:row>
				<aui:row>
				<aui:column columnWidth="50">
				<liferay-ui:message key="org.oep.usermgt.portlet.employee.table.header.gender"></liferay-ui:message>
					
							<aui:field-wrapper name=""> 
            					<aui:input checked="true" inlineLabel="right" name="<%= EmployeeKeys.AddEditAttributes.GENDER %>" type="radio" value="1" label="org.oep.usermgt.portlet.employee.table.header.nam" /> 
           						<aui:input inlineLabel="right" name="<%= EmployeeKeys.AddEditAttributes.GENDER %>" type="radio" value="0" label="org.oep.usermgt.portlet.employee.table.header.nu" /> 
        				  </aui:field-wrapper>
					

				</aui:column>
				<aui:column columnWidth="50">
						  <liferay-ui:message key="org.oep.usermgt.portlet.employee.table.header.birthdate"></liferay-ui:message>
        				<liferay-ui:input-date formName="<%= EmployeeKeys.AddEditAttributes.BIRTHDATE %>" yearValue="2010" monthValue="3" dayValue="21" />	
							</aui:column>
					</aui:row>
					<aui:row>
					    <aui:column columnWidth="50">
					    	<aui:input style="width: 95%;" cssClass="form-control" name="<%=EmployeeKeys.AddEditAttributes.OFFICETEL%>" id="<%= EmployeeKeys.AddEditAttributes.OFFICETEL%>" label="org.oep.usermgt.portlet.employee.table.header.officeTel" type="text"></aui:input>
						</aui:column>
						  <aui:column columnWidth="50">
							<aui:input style="width: 95%;" cssClass="form-control" name="<%=EmployeeKeys.AddEditAttributes.HOMETEL%>" id="<%= EmployeeKeys.AddEditAttributes.HOMETEL%>" label="org.oep.usermgt.portlet.employee.table.header.homeTel" type="text"></aui:input>
						</aui:column>
					</aui:row>
					<aui:row>
					    <aui:column columnWidth="50">
					    	<aui:input style="width: 95%;" cssClass="form-control" name="<%=EmployeeKeys.AddEditAttributes.MOBILE%>" id="<%= EmployeeKeys.AddEditAttributes.MOBILE%>" label="org.oep.usermgt.portlet.employee.table.header.mobile" type="text"></aui:input>
						</aui:column>
						  <aui:column columnWidth="50">
								<aui:input style="width: 95%;" cssClass="form-control" name="<%=EmployeeKeys.AddEditAttributes.EMAIL%>" id="<%= EmployeeKeys.AddEditAttributes.HOMETEL%>" label="org.oep.usermgt.portlet.employee.table.header.email" type="text"></aui:input>
						</aui:column>
					</aui:row>
		</aui:row>
		<aui:row>
		   <%  
		   int check = ParamUtil.getInteger(request,EmployeeKeys.AddEditAttributes.ISCREATUSER,PortletKeys.INT);
		   
		   boolean f=  check == 1;%>
			<aui:column columnWidth="100">
					<aui:input checked="<%=f%>" label="org.oep.usermgt.portlet.employee.table.header.isCreateUser" name='<%=EmployeeKeys.AddEditAttributes.ISCREATUSER%>' type="checkbox"  value = ''/>
			</aui:column>
		</aui:row>	
		<aui:row>	
			<aui:column columnWidth="33">
				<aui:input style="width: 80%;" cssClass="form-control" name="<%=EmployeeKeys.AddEditAttributes.SCREENNAME%>" id="<%= EmployeeKeys.AddEditAttributes.SCREENNAME%>" label="org.oep.usermgt.portlet.employee.table.header.screenName" type="text"></aui:input>
			</aui:column>
			<aui:column columnWidth="33">
				<aui:input style="width: 80%;" cssClass="form-control" name="<%=EmployeeKeys.AddEditAttributes.PASSWORD%>" id="<%= EmployeeKeys.AddEditAttributes.PASSWORD%>" label="org.oep.usermgt.portlet.employee.table.header.password" type="password">
				<aui:validator name="required" />
				</aui:input>
			</aui:column>
			<aui:column columnWidth="33">
				<aui:input style="width: 80%;" cssClass="form-control" name="<%=EmployeeKeys.AddEditAttributes.REPASSWORD%>" id="<%= EmployeeKeys.AddEditAttributes.REPASSWORD%>" label="org.oep.usermgt.portlet.employee.table.header.repassword" type="password">
				<aui:validator name="equalTo">
					'#<portlet:namespace /><%=EmployeeKeys.AddEditAttributes.PASSWORD%>'
				</aui:validator>
				</aui:input>
			</aui:column>
		</aui:row>
		<aui:row>
			<aui:column>
				<input class="btn btn-primary" type="button" value="<liferay-ui:message key="org.oep.usermgt.portlet.button.save" />" onclick="<portlet:namespace/>save()">
				<input class="btn btn-default" type="button" value="<liferay-ui:message key="org.oep.usermgt.portlet.button.cancel" />" onclick="<portlet:namespace/>back()"/>
			</aui:column>
		</aui:row>
	</div>
</aui:form>
<script type="text/javascript">
function <portlet:namespace/>save() {
	var form = document.<portlet:namespace />addEdit;
	form.action = "<%=addEdit%>";
	form.submit();
};
function <portlet:namespace/>back() {
	location.href = "<%= ParamUtil.getString(request, PortletKeys.REDIRECT_PAGE) %>";
};
</script>
