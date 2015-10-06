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
 
<%@page import="org.oep.core.dossiermgt.service.DossierProcLocalServiceUtil"%>
<%@page import="org.oep.core.dossiermgt.model.DossierProc"%>
<%@page import="org.oep.core.utilities.dossiermgt.DossierProcKeys"%>
<%@page import="org.oep.core.utilities.dossiermgt.PortletKeys"%>
<%@page import="com.liferay.portal.kernel.util.UnicodeFormatter"%>
<%@page import="com.liferay.taglib.portlet.RenderURLParamsTag"%>
<%@ include file="/html/dossiermgt/portlet/dossierproc/init.jsp" %>
<%
    DossierProc dossierProc = null;

    long dossierProcId = ParamUtil.getLong(request, "dossierProcId");

    if (dossierProcId > 0) {
        dossierProc = DossierProcLocalServiceUtil.getDossierProc(dossierProcId);
    }

    String redirect = ParamUtil.getString(request, "redirect");
    String tab1 =  LanguageUtil.get(pageContext, "org.oep.core.utilities.dossiermgt.portlet.dossierproc.tabs.general");
    String tab2 = LanguageUtil.get(pageContext, "org.oep.core.utilities.dossiermgt.portlet.dossierproc.tabs.required");
    String tab3 = LanguageUtil.get(pageContext, "org.oep.core.utilities.dossiermgt.portlet.dossierproc.tabs.fee");
	String tabnames = tab1 + "," + tab2 + "," + tab3;
%>

<aui:model-context bean="<%= dossierProc %>" model="<%= DossierProc.class %>" />
<portlet:renderURL var="viewDossierProcURL" />
<portlet:actionURL name='<%= dossierProc == null ? "addDossierProc" : "updateDossierProc" %>' var="editDossierProcURL" windowState="normal" />

<liferay-ui:header
    backURL="<%= viewDossierProcURL %>"
    title='<%= (dossierProc != null) ? dossierProc.getName() : LanguageUtil.get(pageContext, \"org.oep.core.utilities.dossiermgt.portlet.dossierproc.newdossierproc\") %>'
/>

<aui:form action="<%= editDossierProcURL %>" method="POST">
    <aui:fieldset>
        <aui:input name="redirect" type="hidden" value="<%= redirect %>" />

        <aui:input name="dossierProcId" type="hidden" value='<%= dossierProc == null ? "" : dossierProc.getDossierProcId() %>'/>

		<liferay-ui:tabs names="<%= tabnames %>" refresh="false">
			<liferay-ui:section>
				<aui:layout>
					<aui:row>
						<aui:column columnWidth="50">
					        <aui:input name="dossierProcNo" label="<%= LanguageUtil.get(pageContext, \"org.oep.core.utilities.dossiermgt.portlet.dossierproc.label.dossierprocno\") %>" />
						</aui:column>
						<aui:column columnWidth="50">
					        <aui:input name="name" label="<%= LanguageUtil.get(pageContext, \"org.oep.core.utilities.dossiermgt.portlet.dossierproc.label.name\") %>" />
						</aui:column>
					</aui:row>
					<aui:row>
						<aui:column columnWidth="50">
							<aui:input name="enName" label="<%= LanguageUtil.get(pageContext, \"org.oep.core.utilities.dossiermgt.portlet.dossierproc.label.enname\") %>"></aui:input>
						</aui:column>
						<aui:column columnWidth="50">
							<aui:input name="shortName" label="<%= LanguageUtil.get(pageContext, \"org.oep.core.utilities.dossiermgt.portlet.dossierproc.label.shortname\") %>"></aui:input>
						</aui:column>
					</aui:row>
				</aui:layout>
			</liferay-ui:section>
			<liferay-ui:section>
				<aui:layout>
					<aui:row>
						<aui:column columnWidth="50">
							<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"org.oep.core.utilities.dossiermgt.portlet.dossierproc.label.processdescription\") %>">
								<liferay-ui:input-editor height="40" name="processDescription" width="100%">
								</liferay-ui:input-editor>
							</aui:field-wrapper>
						</aui:column>
						<aui:column columnWidth="50">
							<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"org.oep.core.utilities.dossiermgt.portlet.dossierproc.label.methoddescription\") %>">
								<liferay-ui:input-editor height="40" name="methodDescription" width="100%">
								</liferay-ui:input-editor>
							</aui:field-wrapper>
						</aui:column>
					</aui:row>
					<aui:row>
						<aui:column columnWidth="50">
							<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"org.oep.core.utilities.dossiermgt.portlet.dossierproc.label.dossierdescription\") %>">
								<liferay-ui:input-editor height="40" name="dossierDescription" width="100%">
								</liferay-ui:input-editor>
							</aui:field-wrapper>
						</aui:column>
						<aui:column columnWidth="50">
							<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"org.oep.core.utilities.dossiermgt.portlet.dossierproc.label.conditiondescription\") %>">
								<liferay-ui:input-editor height="40" name="conditionDescription" width="100%">
								</liferay-ui:input-editor>
							</aui:field-wrapper>
						</aui:column>
					</aui:row>
					<aui:row>
						<aui:column columnWidth="50">
							<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"org.oep.core.utilities.dossiermgt.portlet.dossierproc.label.durationdescription\") %>">
								<liferay-ui:input-editor height="40" name="durationDescription" width="100%">
								</liferay-ui:input-editor>
							</aui:field-wrapper>
						</aui:column>
						<aui:column columnWidth="50">
							<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"org.oep.core.utilities.dossiermgt.portlet.dossierproc.label.actorsdescription\") %>">
								<liferay-ui:input-editor height="40" name="actorsDescription" width="100%">
								</liferay-ui:input-editor>
							</aui:field-wrapper>
						</aui:column>
					</aui:row>
				</aui:layout>			
			</liferay-ui:section>
			<liferay-ui:section>
			</liferay-ui:section>
		</liferay-ui:tabs>
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit" />

        <aui:button onClick="<%= viewDossierProcURL %>"  type="cancel" />
    </aui:button-row>
</aui:form>