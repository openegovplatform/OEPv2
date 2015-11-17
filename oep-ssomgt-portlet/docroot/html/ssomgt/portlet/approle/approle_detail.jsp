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
<%@page import="com.liferay.portal.service.ServiceContextThreadLocal"%>
<%@page import="com.liferay.portal.service.ServiceContext"%>
<%@page import="org.oep.ssomgt.service.ApplicationLocalServiceUtil"%>
<%@page import="org.oep.ssomgt.model.Application"%>
<%@page import="org.oep.ssomgt.action.AppRoleKeys"%>
<%@page import="org.oep.ssomgt.action.PortletKeys"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="/html/ssomgt/portlet/approle/init.jsp" %>
<%
	ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();
	long applicationId = ParamUtil.getLong(request, AppRoleKeys.SearchAttributes.APPLICATION_ID, PortletKeys.LONG_DEFAULT);
%>
<portlet:actionURL var="addEditAppRole" name="addEditAppRole">
	<portlet:param name="<%= PortletKeys.SET_VIEW_PARAMETER %>" value="/html/ssomgt/portlet/approle/approle_detail.jsp"/>
	<portlet:param name="<%= PortletKeys.REDIRECT_PAGE %>" value="<%= ParamUtil.getString(request, PortletKeys.REDIRECT_PAGE) %>"/>
	<portlet:param name="<%= AppRoleKeys.AddEditAttributes.EDIT_ID %>" value="<%= ParamUtil.getString(request, AppRoleKeys.AddEditAttributes.EDIT_ID) %>"/>
</portlet:actionURL>

<aui:form name="addEditAppRoleForm" method="post">
	<liferay-ui:error key="<%= AppRoleKeys.ErrorMessageKeys.ORG_OEP_SSOMGT_PORTLET_APPROLE_ROLECODE %>" message = "<%= AppRoleKeys.ErrorMessageKeys.ORG_OEP_SSOMGT_PORTLET_APPROLE_ROLECODE %>"/>
	<liferay-ui:error key="<%= AppRoleKeys.ErrorMessageKeys.ORG_OEP_SSOMGT_PORTLET_APPROLE_ROLENAME %>" message = "<%= AppRoleKeys.ErrorMessageKeys.ORG_OEP_SSOMGT_PORTLET_APPROLE_ROLENAME %>"/>
	
	<div class="form-group">
		<aui:row>
			<aui:column columnWidth="50">
				<aui:select style="width: 100%" onChange="applicationChange()" label="<%= LanguageUtil.get(pageContext, \"org.oep.ssomgt.portlet.approle.empty\") %>" name="<%= AppRoleKeys.AddEditAttributes.APPLICATION_ID %>" id="<%= AppRoleKeys.AddEditAttributes.APPLICATION_ID %>" >
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
				<aui:input id="<%= AppRoleKeys.AddEditAttributes.APPLICATION_ID %>" name="<%= AppRoleKeys.AddEditAttributes.APPLICATION_ID %>" type="hidden" value="<%= applicationId %>"></aui:input>
			</aui:column>
		</aui:row>
		<aui:row>
			<aui:column columnWidth="50">
				<aui:input style="width: 100%;" label="<%= LanguageUtil.get(pageContext, \"org.oep.ssomgt.portlet.approle.label.rolecode\") %>" name="<%= AppRoleKeys.AddEditAttributes.ROLE_CODE %>" id="<%= AppRoleKeys.AddEditAttributes.ROLE_CODE %>" type="text">
					<aui:validator name="required" errorMessage="<%= LanguageUtil.get(pageContext, \"org.oep.ssomgt.portlet.approle.validator.rolecode.required\") %>"/>
					<aui:validator name="rangeLength" errorMessage="<%= LanguageUtil.get(pageContext, \"org.oep.ssomgt.portlet.approle.validator.rolecode.rangelength\") %>">[1,30]</aui:validator>
				</aui:input>
			</aui:column>			
		</aui:row>
		<aui:row>
			<aui:column columnWidth="50">
				<aui:input style="width: 100%;" label="<%= LanguageUtil.get(pageContext, \"org.oep.ssomgt.portlet.approle.label.rolename\") %>" name="<%= AppRoleKeys.AddEditAttributes.ROLE_NAME %>" id="<%= AppRoleKeys.AddEditAttributes.ROLE_NAME %>" type="text">
					<aui:validator name="rangeLength" errorMessage="<%= LanguageUtil.get(pageContext, \"org.oep.ssomgt.portlet.approle.validator.rolename.rangelength\") %>">[1,100]</aui:validator>
				</aui:input>
			</aui:column>	
		</aui:row>
		<aui:row>
			<aui:column>
				<input class="btn btn-primary" type="button" value="<liferay-ui:message key="org.oep.ssomgt.portlet.approle.button.save" />" onclick="<portlet:namespace/>save()">
				<input class="btn btn-default" type="button" value="<liferay-ui:message key="org.oep.ssomgt.portlet.approle.button.back" />" onclick="<portlet:namespace/>back()"/>
			</aui:column>
		</aui:row>	
	</div>
</aui:form>

<script type="text/javascript">
function <portlet:namespace/>save() {
	var form = document.<portlet:namespace />addEditAppRoleForm;
	form.action = "<%= addEditAppRole %>";
	form.submit();
};

function <portlet:namespace/>back() {
	location.href = "<%= ParamUtil.getString(request, PortletKeys.REDIRECT_PAGE) %>";
};

</script>