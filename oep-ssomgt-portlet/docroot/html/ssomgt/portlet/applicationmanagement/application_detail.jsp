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

<%@page import="org.oep.ssomgt.permission.SSOPermission"%>
<%@page import="org.oep.ssomgt.action.PortletKeys"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="org.oep.ssomgt.action.ApplicationKeys"%>
<%@ include file="/html/ssomgt/portlet/applicationmanagement/init.jsp" %>

<portlet:actionURL var="addEditApplication" name="addEditApplication">
	<portlet:param name="<%= PortletKeys.SET_VIEW_PARAMETER %>" value="/html/ssomgt/portlet/applicationmanagement/application_detail.jsp"/>
	<portlet:param name="<%= PortletKeys.REDIRECT_PAGE %>" value="<%= ParamUtil.getString(request, PortletKeys.REDIRECT_PAGE) %>"/>
	<portlet:param name="<%= ApplicationKeys.AddEditAttributes.EDIT_ID %>" value="<%= ParamUtil.getString(request, ApplicationKeys.AddEditAttributes.EDIT_ID) %>"/>
</portlet:actionURL>

<aui:form name="addEditApplicationForm" method="post" enctype="multipart/form-data">
	<div class="form-group">
		<liferay-ui:error key="<%= ApplicationKeys.ErrorMessageKeys.ORG_OEP_SSOMGT_PORTLET_APPLICATIONMANAGEMENT_APPCODE %>" message = "<%= ApplicationKeys.ErrorMessageKeys.ORG_OEP_SSOMGT_PORTLET_APPLICATIONMANAGEMENT_APPCODE %>"/>
		<liferay-ui:error key="<%= ApplicationKeys.ErrorMessageKeys.ORG_OEP_SSOMGT_PORTLET_APPLICATIONMANAGEMENT_APPNAME %>" message = "<%= ApplicationKeys.ErrorMessageKeys.ORG_OEP_SSOMGT_PORTLET_APPLICATIONMANAGEMENT_APPNAME %>"/>
		<liferay-ui:error key="<%= ApplicationKeys.ErrorMessageKeys.ORG_OEP_SSOMGT_PORTLET_APPLICATIONMANAGEMENT_APPPIN %>" message = "<%= ApplicationKeys.ErrorMessageKeys.ORG_OEP_SSOMGT_PORTLET_APPLICATIONMANAGEMENT_APPPIN %>"/>
		<liferay-ui:error key="<%= ApplicationKeys.ErrorMessageKeys.ORG_OEP_SSOMGT_PORTLET_APPLICATIONMANAGEMENT_APPURL %>" message = "<%= ApplicationKeys.ErrorMessageKeys.ORG_OEP_SSOMGT_PORTLET_APPLICATIONMANAGEMENT_APPURL %>"/>
		<liferay-ui:error key="<%= ApplicationKeys.ErrorMessageKeys.ORG_OEP_SSOMGT_PORTLET_APPLICATIONMANAGEMENT_PUBLICKEY %>" message = "<%= ApplicationKeys.ErrorMessageKeys.ORG_OEP_SSOMGT_PORTLET_APPLICATIONMANAGEMENT_PUBLICKEY %>"/>
		<liferay-ui:error key="<%= ApplicationKeys.ErrorMessageKeys.ORG_OEP_SSOMGT_PORTLET_APPLICATIONMANAGEMENT_APPICONNULL %>" message = "<%= ApplicationKeys.ErrorMessageKeys.ORG_OEP_SSOMGT_PORTLET_APPLICATIONMANAGEMENT_APPICONNULL %>"/>

		<aui:row>
			<aui:column columnWidth="50">
				<aui:row>
					<aui:column columnWidth="100">
						<aui:input value="<%= ParamUtil.getString(request, ApplicationKeys.AddEditAttributes.APP_NAME) %>" title="<%= LanguageUtil.get(pageContext, \"org.oep.ssomgt.portlet.applicationmanagement.tooltip.appname\") %>" style="width: 100%;" cssClass="form-control" name="<%= ApplicationKeys.AddEditAttributes.APP_NAME %>" id="<%= ApplicationKeys.AddEditAttributes.APP_NAME %>" label="<%= LanguageUtil.get(pageContext, \"org.oep.ssomgt.portlet.applicationmanagement.label.appname\") %>" type="text">
							<aui:validator name="required" errorMessage="<%= LanguageUtil.get(pageContext, \"org.oep.ssomgt.portlet.applicationmanagement.validator.appname.required\") %>"/>
							<aui:validator name="rangeLength" errorMessage="<%= LanguageUtil.get(pageContext, \"org.oep.ssomgt.portlet.applicationmanagement.validator.appname.rangelength\") %>">[1,100]</aui:validator>
						</aui:input>
					</aui:column>
				</aui:row>
				<aui:row>
					<aui:column columnWidth="100">
						<aui:input style="width: 100%;" cssClass="form-control" name="<%= ApplicationKeys.AddEditAttributes.APP_CODE %>" id="<%= ApplicationKeys.AddEditAttributes.APP_CODE %>" label="<%= LanguageUtil.get(pageContext, \"org.oep.ssomgt.portlet.applicationmanagement.label.appcode\") %>" type="text">
							<aui:validator name="alphanum" errorMessage="<%= LanguageUtil.get(pageContext, \"org.oep.ssomgt.portlet.applicationmanagement.validator.appcode.alphanum\") %>"/>
							<aui:validator name="rangeLength" errorMessage="<%= LanguageUtil.get(pageContext, \"org.oep.ssomgt.portlet.applicationmanagement.validator.appcode.rangelength\") %>">[1,30]</aui:validator>
						</aui:input>
					</aui:column>
				</aui:row>
				<aui:row>
					<aui:column columnWidth="100">
						<aui:input style="width: 100%;" cssClass="form-control" name="<%= ApplicationKeys.AddEditAttributes.APP_PIN %>" id="<%= ApplicationKeys.AddEditAttributes.APP_PIN %>" label="<%= LanguageUtil.get(pageContext, \"org.oep.ssomgt.portlet.applicationmanagement.label.apppin\") %>" type="text">
							<aui:validator name="alphanum" errorMessage="<%= LanguageUtil.get(pageContext, \"org.oep.ssomgt.portlet.applicationmanagement.validator.apppin.alphanum\") %>"/>
							<aui:validator name="rangeLength" errorMessage="<%= LanguageUtil.get(pageContext, \"org.oep.ssomgt.portlet.applicationmanagement.validator.apppin.rangelength\") %>">[1,30]</aui:validator>
						</aui:input>
					</aui:column>
				</aui:row>
				<aui:row>
					<aui:column columnWidth="100">
						<aui:input style="width: 100%;" cssClass="form-control" name="<%= ApplicationKeys.AddEditAttributes.APP_URL %>" id="<%= ApplicationKeys.AddEditAttributes.APP_URL %>" label="<%= LanguageUtil.get(pageContext, \"org.oep.ssomgt.portlet.applicationmanagement.label.appurl\") %>" type="text">
							<aui:validator name="rangeLength" errorMessage="<%= LanguageUtil.get(pageContext, \"org.oep.ssomgt.portlet.applicationmanagement.validator.appurl.rangelength\") %>">[1,100]</aui:validator>
							<aui:validator name="url" errorMessage="<%= LanguageUtil.get(pageContext, \"org.oep.ssomgt.portlet.applicationmanagement.validator.appurl.url\") %>"/>
						</aui:input>
					</aui:column>
				</aui:row>
				<aui:row>
					<aui:column columnWidth="100">
						<aui:input style="width: 100%;" cssClass="form-control" name="<%= ApplicationKeys.AddEditAttributes.PUBLICKEY %>" id="<%= ApplicationKeys.AddEditAttributes.PUBLICKEY %>" label="<%= LanguageUtil.get(pageContext, \"org.oep.ssomgt.portlet.applicationmanagement.label.publickey\") %>" type="text">
							<aui:validator name="rangeLength" errorMessage="<%= LanguageUtil.get(pageContext, \"org.oep.ssomgt.portlet.applicationmanagement.validator.publickey.rangelength\") %>">[1,256]</aui:validator>
						</aui:input>
					</aui:column>
				</aui:row>
			</aui:column>
			<aui:column columnWidth="50">
				<aui:row>
					<aui:column>
						<portlet:resourceURL var="smallIconResourceURL">
							<portlet:param name="icon" value="smallIcon"/>
							<portlet:param name="<%= ApplicationKeys.AddEditAttributes.EDIT_ID %>" value="<%= ParamUtil.get(request, ApplicationKeys.AddEditAttributes.EDIT_ID, PortletKeys.TEXT_BOX) %>"/>
						</portlet:resourceURL>				
						<img style="width: 20%; height: 20%;" src="<%= smallIconResourceURL.toString() %>" class="img-rounded" />
						<p></p>
						<aui:input cssClass="form-control" name="<%= ApplicationKeys.AddEditAttributes.APP_SMALLICON %>" id="<%= ApplicationKeys.AddEditAttributes.APP_SMALLICON %>" label="<%= LanguageUtil.get(pageContext, \"org.oep.ssomgt.portlet.applicationmanagement.label.appsmallicon\") %>" type="file"></aui:input>
					</aui:column>
				</aui:row>
				<aui:row>
					<aui:column>
						<portlet:resourceURL  var="bigIconResourceURL">
							<portlet:param name="icon" value="bigIcon"/>
							<portlet:param name="<%= ApplicationKeys.AddEditAttributes.EDIT_ID %>" value="<%= ParamUtil.get(request, ApplicationKeys.AddEditAttributes.EDIT_ID, PortletKeys.TEXT_BOX) %>"/>
						</portlet:resourceURL>				
						<img style="width: 80%; height:80%;" src="<%= bigIconResourceURL.toString() %>" class="img-rounded" />
						<p></p>		
						<aui:input cssClass="form-control" name="<%= ApplicationKeys.AddEditAttributes.APP_BIGICON %>" id="<%= ApplicationKeys.AddEditAttributes.APP_BIGICON %>" label="<%= LanguageUtil.get(pageContext, \"org.oep.ssomgt.portlet.applicationmanagement.label.appbigicon\") %>" type="file"></aui:input>
					</aui:column>
				</aui:row>
			</aui:column>
		</aui:row>
		<aui:row>
			<aui:column>
				<c:if test='<%= SSOPermission.contains(permissionChecker, scopeGroupId, "ADMIN_SSOMGT") %>'>
					<input class="btn btn-primary" type="button" value="<liferay-ui:message key="org.oep.ssomgt.portlet.applicationmanagement.button.save" />" onclick="<portlet:namespace/>save()">
					<input class="btn btn-default" type="button" value="<liferay-ui:message key="org.oep.ssomgt.portlet.applicationmanagement.button.back" />" onclick="<portlet:namespace/>back()"/>
				</c:if>
			</aui:column>
		</aui:row>
	</div>
</aui:form>

<script type="text/javascript">
function <portlet:namespace/>save() {
	var form = document.<portlet:namespace />addEditApplicationForm;
	form.action = "<%= addEditApplication %>";
	form.submit();
};

function <portlet:namespace/>back() {
	location.href = "<%= ParamUtil.getString(request, PortletKeys.REDIRECT_PAGE) %>";
};
	YUI().ready(
		'aui-tooltip',
			function(Y) {
				new Y.Tooltip(
				{
					trigger: '#<%= ApplicationKeys.AddEditAttributes.APP_NAME %>',
				    position: 'right'
				}
			).render();
			}
	);	

</script>