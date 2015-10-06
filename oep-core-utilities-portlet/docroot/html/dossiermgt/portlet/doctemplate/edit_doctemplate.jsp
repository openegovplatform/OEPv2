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
 
<%@page import="com.liferay.portlet.PortletURLFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayPortletURL"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="org.oep.core.dossiermgt.service.DocTemplateLocalServiceUtil"%>
<%@page import="org.oep.core.dossiermgt.model.DocTemplate"%>
<%@page import="org.oep.core.utilities.dossiermgt.PortletKeys"%>
<%@page import="com.liferay.portal.kernel.util.UnicodeFormatter"%>
<%@page import="com.liferay.taglib.portlet.RenderURLParamsTag"%>
<%@ include file="/html/dossiermgt/portlet/doctemplate/init.jsp" %>
<%
    DocTemplate docTemplate = null;

    long docTemplateId = ParamUtil.getLong(request, "docTemplateId");

    if (docTemplateId > 0) {
        docTemplate = DocTemplateLocalServiceUtil.getDocTemplate(docTemplateId);
    }

    //String redirect = ParamUtil.getString(request, "redirect");
    long dlScopeGroupId = themeDisplay.getScopeGroupId();
    LiferayPortletURL documentLibURL = PortletURLFactoryUtil.create(request,          
    com.liferay.portal.util.PortletKeys.DYNAMIC_DATA_MAPPING, themeDisplay.getPlid(), PortletRequest.RENDER_PHASE);
    documentLibURL.setWindowState(LiferayWindowState.POP_UP);
    documentLibURL.setPortletMode(PortletMode.VIEW);

    documentLibURL.setParameter("struts_action","/dynamic_data_mapping/select_document_library");
    documentLibURL.setParameter("groupId", String.valueOf(dlScopeGroupId));
%>

<aui:model-context bean="<%= docTemplate %>" model="<%= DocTemplate.class %>" />
<portlet:renderURL var="viewDocTemplateURL" />
<portlet:actionURL name='<%= docTemplate == null ? "addDocTemplate" : "updateDocTemplate" %>' var="editDocTemplateURL" windowState="normal" />

<liferay-ui:header
    backURL="<%= viewDocTemplateURL %>"
    title='<%= (docTemplate != null) ? docTemplate.getTitle() : LanguageUtil.get(pageContext, \"org.oep.core.utilities.dossiermgt.portlet.doctemplate.newdoctemplate\") %>'
/>

<aui:form action="<%= editDocTemplateURL %>" method="POST">
    <aui:fieldset>
        <aui:input name="redirect" type="hidden" value="<%= redirect %>" />

        <aui:input name="docTemplateId" type="hidden" value='<%= docTemplate == null ? "" : docTemplate.getDocTemplateId() %>'/>

		<aui:layout>
			<aui:row>
				<aui:column columnWidth="50">
					<aui:input name="templateNo" label="<%= LanguageUtil.get(pageContext, \"org.oep.core.utilities.dossiermgt.portlet.doctemplate.label.templateno\") %>" />
				</aui:column>
				<aui:column columnWidth="50">
					<aui:input name="title" label="<%= LanguageUtil.get(pageContext, \"org.oep.core.utilities.dossiermgt.portlet.doctemplate.label.title\") %>" />
				</aui:column>
			</aui:row>
			<aui:row>
				<aui:column columnWidth="50">
					<aui:input name="enTitle" label="<%= LanguageUtil.get(pageContext, \"org.oep.core.utilities.dossiermgt.portlet.doctemplate.label.entitle\") %>"></aui:input>
				</aui:column>
				<aui:column columnWidth="50">
					<aui:input type="hidden" name="fileEntryUuid"></aui:input>
					<aui:input type="hidden" name="fileEntryId"></aui:input>					
					<aui:input type="text" name="fileEntryName" label="<%= LanguageUtil.get(pageContext, \"org.oep.core.utilities.dossiermgt.portlet.doctemplate.label.fileentryname\") %>"></aui:input>					
					<aui:button name="openFileSelectorButton" value="<%= LanguageUtil.get(pageContext, \"org.oep.core.utilities.dossiermgt.portlet.doctemplate.button.choosefile\") %>" />				
				</aui:column>
			</aui:row>
		</aui:layout>
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit" />

        <aui:button onClick="<%= viewDocTemplateURL %>"  type="cancel" />
    </aui:button-row>
</aui:form>

<liferay-portlet:renderURL portletName="<%= com.liferay.portal.util.PortletKeys.DYNAMIC_DATA_MAPPING %>" var="selectFileURL" windowState="<%= LiferayWindowState.POP_UP.toString() %>">
	<portlet:param name="struts_action" value='/dynamic_data_mapping/select_document_library' />
	<portlet:param name="groupId" value="<%= String.valueOf(dlScopeGroupId) %>"/>
</liferay-portlet:renderURL>

<aui:script use="aui-base">
        A.one('#<portlet:namespace />openFileSelectorButton').on(
                'click',
                function(event) {
                    Liferay.Util.selectEntity(
                        {
                            dialog: {
                                constrain: true,
                                modal: true
                            },
                            id: '<portlet:namespace />selectFileFromDocumentLibrary',
                            title: '<liferay-ui:message arguments="file" key="select-x" />',
                            uri: '<%= selectFileURL.toString() %>'
                        },
                        _166_selectDocumentLibrary = function(url, uuid, groupId, fileName, version){
                             document.getElementById("<portlet:namespace/>fileEntryName").value = fileName;
                             document.getElementById("<portlet:namespace/>fileEntryUuid").value = uuid;
                        }
                    );
                }
        );
</aui:script>