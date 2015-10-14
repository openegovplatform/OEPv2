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
<%@page import="org.oep.core.dossiermgt.service.DossierProcLocalServiceUtil"%>
<%@page import="org.oep.core.dossiermgt.model.DossierProc"%>
<%@page import="org.oep.core.processmgt.service.DossierProcessLocalServiceUtil"%>
<%@page import="org.oep.core.processmgt.model.DossierProcess"%>
<%@page import="com.liferay.portlet.PortletURLFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayPortletURL"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="org.oep.core.utilities.dossiermgt.PortletKeys"%>
<%@page import="com.liferay.portal.kernel.util.UnicodeFormatter"%>
<%@page import="com.liferay.taglib.portlet.RenderURLParamsTag"%>
<%@ include file="/html/processmgt/portlet/dossierprocess/init.jsp" %>
<%
    DossierProcess dossierProcess = null;

    long dossierProcessId = ParamUtil.getLong(request, "dossierProcessId");

    if (dossierProcessId > 0) {
        dossierProcess = DossierProcessLocalServiceUtil.getDossierProcess(dossierProcessId);
    }

    //String redirect = ParamUtil.getString(request, "redirect");
    long dlScopeGroupId = themeDisplay.getScopeGroupId();
	ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();
%>

<aui:model-context bean="<%= dossierProcess %>" model="<%= DossierProcess.class %>" />
<portlet:renderURL var="viewDossierProcessURL" />
<portlet:actionURL name='<%= dossierProcess == null ? "addDossierProcess" : "updateDossierProcess" %>' var="editDossierProcessURL" windowState="normal" />

<liferay-ui:header
    backURL="<%= viewDossierProcessURL %>"
    title='<%= (dossierProcess != null) ? dossierProcess.getGovAgencyName() : LanguageUtil.get(pageContext, \"org.oep.core.utilities.processmgt.portlet.dossierprocess.newdossierprocess\") %>'
/>

<aui:form action="<%= editDossierProcessURL %>" method="POST">
    <aui:fieldset>
        <aui:input name="redirect" type="hidden" value="<%= redirect %>" />

        <aui:input name="dossierProcessId" type="hidden" value='<%= dossierProcess == null ? "" : dossierProcess.getDossierProcessId() %>'/>

		<aui:select name="dossierProcId" label="<%= LanguageUtil.get(pageContext, \"org.oep.core.utilities.processmgt.portlet.dossierprocess.label.dossierprocid\") %>">
			<% 
				List<DossierProc> lstDossierProcs = DossierProcLocalServiceUtil.findByCompany(serviceContext);	
				for (DossierProc proc : lstDossierProcs) {
			%>
			<aui:option value="<%= proc.getDossierProcNo() %>"><%= proc.getName() %></aui:option>
			<% } %>
		</aui:select>
		<aui:input name="govAgencyId" type="text" label="<%= LanguageUtil.get(pageContext, \"org.oep.core.utilities.processmgt.portlet.dossierprocess.label.govagencyid\") %>">
		</aui:input>
		<aui:input name="govAgencyName" type="text" label="<%= LanguageUtil.get(pageContext, \"org.oep.core.utilities.processmgt.portlet.dossierprocess.label.govagencyname\") %>">
		</aui:input>
		<aui:input name="daysDuration" type="text" label="<%= LanguageUtil.get(pageContext, \"org.oep.core.utilities.processmgt.portlet.dossierprocess.label.daysduration\") %>">
		</aui:input>
		<aui:input name="fee" type="text" label="<%= LanguageUtil.get(pageContext, \"org.oep.core.utilities.processmgt.portlet.dossierprocess.label.fee\") %>">
		</aui:input>

    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit" />

        <aui:button onClick="<%= viewDossierProcessURL %>"  type="cancel" />
    </aui:button-row>
</aui:form>