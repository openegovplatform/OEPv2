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
<%@page import="org.oep.usermgt.action.EmployeeKeys"%>

<portlet:actionURL var="addEdit" name="changePassword">
	<portlet:param name="<%= PortletKeys.SET_VIEW_PARAMETER %>" value="/html/usermgt/portlet/employee/employee_changepassword.jsp"/>
	<portlet:param name="<%= PortletKeys.REDIRECT_PAGE %>" value="<%= ParamUtil.getString(request, PortletKeys.REDIRECT_PAGE) %>"/>
	<portlet:param name="<%= EmployeeKeys.BaseEmployeeAttributes.EDIT_ID %>" value="<%= ParamUtil.getString(request, EmployeeKeys.BaseEmployeeAttributes.EDIT_ID) %>"/>
</portlet:actionURL>
<%
		int ok = ParamUtil.getInteger(request, EmployeeKeys.BaseEmployeeAttributes.ISOK, PortletKeys.INT);
%>
<aui:form name="addEdit" method="post" enctype="multipart/form-data">
 <c:if test="<%=ok!=1%>">
	<div class="form-group">
		<aui:row>	
			<aui:column columnWidth="60">
				<aui:input cssClass="form-control" name="<%=EmployeeKeys.AddEditAttributes.PASSWORD%>" id="<%= EmployeeKeys.AddEditAttributes.PASSWORD%>" label="org.oep.usermgt.portlet.employee.table.header.password" type="password">
				<aui:validator name="required" />
				</aui:input>
			</aui:column>
		</aui:row>	
		<aui:row>	
			<aui:column columnWidth="60">
				<aui:input cssClass="form-control" name="<%=EmployeeKeys.AddEditAttributes.REPASSWORD%>" id="<%= EmployeeKeys.AddEditAttributes.REPASSWORD%>" label="org.oep.usermgt.portlet.employee.table.header.repassword" type="password">
				<aui:validator name="required" />
				<aui:validator name="equalTo">
					'#<portlet:namespace /><%=EmployeeKeys.AddEditAttributes.PASSWORD%>'
				</aui:validator>
				</aui:input>
			</aui:column>
		</aui:row>
		<aui:row>
			<aui:column>
				<input class="btn btn-primary" type="button" value="<liferay-ui:message key="org.oep.usermgt.portlet.button.save" />" onclick="<portlet:namespace/>save()">
			</aui:column>
			<aui:column>
				<aui:button class="btn btn-default" name="closeDialog" type="button" value="org.oep.usermgt.portlet.button.cancel" />
			</aui:column>
		</aui:row>
	</div>
	</c:if>
	 <c:if test="<%=ok==1%>">
	 <aui:column>
				<aui:button class="btn btn-default" name="closeDialog" type="button" value="org.oep.usermgt.portlet.button.cancel" />
	  </aui:column>
	 </c:if>
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

 <aui:script use="aui-base">
    A.one('#<portlet:namespace/>closeDialog').on('click', function(event) {
    	Liferay.Util.getOpener().closePopup();
    });
 </aui:script>
