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
 
<%@page import="org.oep.core.dossiermgt.service.EbPartnerShipLocalServiceUtil"%>
<%@page import="org.oep.core.dossiermgt.model.EbPartnerShip"%>
<%@page import="com.liferay.portlet.PortletURLFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayPortletURL"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="org.oep.core.utilities.dossiermgt.PortletKeys"%>
<%@page import="com.liferay.portal.kernel.util.UnicodeFormatter"%>
<%@page import="com.liferay.taglib.portlet.RenderURLParamsTag"%>
<%@ include file="/html/dossiermgt/portlet/ebpartnership/init.jsp" %>
<%
    EbPartnerShip ebPartnerShip = null;

    long ebPartnerShipId = ParamUtil.getLong(request, "ebPartnerShipId");

    if (ebPartnerShipId > 0) {
        ebPartnerShip = EbPartnerShipLocalServiceUtil.getEbPartnerShip(ebPartnerShipId);
    }

%>

<aui:model-context bean="<%= ebPartnerShip %>" model="<%= EbPartnerShip.class %>" />
<portlet:renderURL var="viewEbPartnerShipURL" />
<portlet:actionURL name='<%= ebPartnerShip == null ? "addEbPartnerShip" : "updateEbPartnerShip" %>' var="editEbPartnerShipURL" windowState="normal" />

<liferay-ui:header
    backURL="<%= viewEbPartnerShipURL %>"
    title='<%= (ebPartnerShip != null) ? ebPartnerShip.getName() : LanguageUtil.get(pageContext, \"org.oep.core.utilities.dossiermgt.portlet.ebpartnership.newebpartnership\") %>'
/>

<aui:form action="<%= editEbPartnerShipURL %>" method="POST">
    <aui:fieldset>
        <aui:input name="redirect" type="hidden" value="<%= redirect %>" />

        <aui:input name="ebPartnerShipId" type="hidden" value='<%= ebPartnerShip == null ? "" : ebPartnerShip.getEbPartnerShipId() %>'/>

		<aui:input name="name" label="<%= LanguageUtil.get(pageContext, \"org.oep.core.utilities.dossiermgt.portlet.ebpartnership.label.name\") %>" />
		<aui:input name="cpaId" label="<%= LanguageUtil.get(pageContext, \"org.oep.core.utilities.dossiermgt.portlet.ebpartnership.label.cpaid\") %>" />
		<aui:input name="service" label="<%= LanguageUtil.get(pageContext, \"org.oep.core.utilities.dossiermgt.portlet.ebpartnership.label.service\") %>"></aui:input>
		<aui:input name="action" label="<%= LanguageUtil.get(pageContext, \"org.oep.core.utilities.dossiermgt.portlet.ebpartnership.label.action\") %>"></aui:input>
		<aui:select name="inbound" label="<%= LanguageUtil.get(pageContext, \"org.oep.core.utilities.dossiermgt.portlet.ebpartnership.label.action\") %>">
			<aui:option value="0">Outbound</aui:option>
			<aui:option value="1">Inbound</aui:option>
		</aui:select>
    </aui:fieldset>
    <aui:button-row>
        <aui:button type="submit" />

        <aui:button onClick="<%= viewEbPartnerShipURL %>"  type="cancel" />
    </aui:button-row>
</aui:form>