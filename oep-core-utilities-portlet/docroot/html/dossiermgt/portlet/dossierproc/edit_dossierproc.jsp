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
 
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
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

    String tab1 =  LanguageUtil.get(pageContext, "org.oep.core.utilities.dossiermgt.portlet.dossierproc.tabs.general");
    String tab2 = LanguageUtil.get(pageContext, "org.oep.core.utilities.dossiermgt.portlet.dossierproc.tabs.required");
    String tab3 = LanguageUtil.get(pageContext, "org.oep.core.utilities.dossiermgt.portlet.dossierproc.tabs.fee");
	String tabnames = tab1 + "," + tab2 + "," + tab3;
	DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	String effectDate = null;
	if (dossierProc != null && dossierProc.getEffectDate() != null) {
		effectDate = df.format(dossierProc.getEffectDate());
	}
	else {
		effectDate = df.format(new Date());
	}
	
	String expireDate = null;
	if (dossierProc != null && dossierProc.getExpireDate() != null) {
		expireDate = df.format(dossierProc.getExpireDate());
	}
	else {
		expireDate = df.format(new Date());
	}
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
					        <aui:input type="text" style="width: 100%" name="dossierProcNo" label="<%= LanguageUtil.get(pageContext, \"org.oep.core.utilities.dossiermgt.portlet.dossierproc.label.dossierprocno\") %>" />
						</aui:column>
						<aui:column columnWidth="50">
					        <aui:input type="text" style="width: 100%" name="name" label="<%= LanguageUtil.get(pageContext, \"org.oep.core.utilities.dossiermgt.portlet.dossierproc.label.name\") %>" />
						</aui:column>
					</aui:row>
					<aui:row>
						<aui:column columnWidth="50">
							<aui:input type="text" style="width: 100%" name="enName" label="<%= LanguageUtil.get(pageContext, \"org.oep.core.utilities.dossiermgt.portlet.dossierproc.label.enname\") %>"></aui:input>
						</aui:column>
						<aui:column columnWidth="50">
							<aui:input type="text" style="width: 100%" name="shortName" label="<%= LanguageUtil.get(pageContext, \"org.oep.core.utilities.dossiermgt.portlet.dossierproc.label.shortname\") %>"></aui:input>
						</aui:column>
					</aui:row>
				</aui:layout>
			</liferay-ui:section>
			<liferay-ui:section>
				<aui:layout>
					<aui:row>
						<aui:column columnWidth="50">
							<aui:input type="text" label="<%= LanguageUtil.get(pageContext, \"org.oep.core.utilities.dossiermgt.portlet.dossierproc.label.processdescription\") %>" height="40" name="processDescription" style="width:100%">
							</aui:input>
						</aui:column>
						<aui:column columnWidth="50">
							<aui:input type="text" label="<%= LanguageUtil.get(pageContext, \"org.oep.core.utilities.dossiermgt.portlet.dossierproc.label.methoddescription\") %>" height="40" name="methodDescription" style="width:100%">
							</aui:input>
						</aui:column>
					</aui:row>
					<aui:row>
						<aui:column columnWidth="50">
							<aui:input type="text" label="<%= LanguageUtil.get(pageContext, \"org.oep.core.utilities.dossiermgt.portlet.dossierproc.label.dossierdescription\") %>" height="40" name="dossierDescription" style="width:100%">
							</aui:input>
						</aui:column>
						<aui:column columnWidth="50">
							<aui:input label="<%= LanguageUtil.get(pageContext, \"org.oep.core.utilities.dossiermgt.portlet.dossierproc.label.conditiondescription\") %>" type="textarea" height="40" name="conditionDescription" style="width:100%">
							</aui:input>
						</aui:column>
					</aui:row>
					<aui:row>
						<aui:column columnWidth="50">
							<aui:input label="<%= LanguageUtil.get(pageContext, \"org.oep.core.utilities.dossiermgt.portlet.dossierproc.label.durationdescription\") %>" type="textarea" height="40" name="durationDescription" style="width:100%">
							</aui:input>
						</aui:column>
						<aui:column columnWidth="50">
							<aui:input label="<%= LanguageUtil.get(pageContext, \"org.oep.core.utilities.dossiermgt.portlet.dossierproc.label.actorsdescription\") %>" type="textarea" height="40" name="actorsDescription" style="width:100%">
							</aui:input>
						</aui:column>
					</aui:row>
				</aui:layout>			
			</liferay-ui:section>
			<liferay-ui:section>
				<aui:layout>
					<aui:row>
						<aui:column columnWidth="50">
							<aui:input label="<%= LanguageUtil.get(pageContext, \"org.oep.core.utilities.dossiermgt.portlet.dossierproc.label.resultsdescription\") %>" type="textarea" height="40" name="resultsDescription" style="width:100%">
							</aui:input>								
						</aui:column>
						<aui:column columnWidth="50">
							<aui:input label="<%= LanguageUtil.get(pageContext, \"org.oep.core.utilities.dossiermgt.portlet.dossierproc.label.feedescription\") %>" type="textarea" height="40" name="feeDescription" style="width:100%">
							</aui:input>								
						</aui:column>
					</aui:row>
					<aui:row>
						<aui:column columnWidth="100">
							<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"org.oep.core.utilities.dossiermgt.portlet.dossierproc.label.instructionsdescription\") %>">
								<liferay-ui:input-editor height="40" name="instructionsDescription" width="100%">
								</liferay-ui:input-editor>								
							</aui:field-wrapper>													
						</aui:column>
					</aui:row>
					<aui:row>
						<aui:column columnWidth="50">
							<aui:select name="administrationNo" label="<%= LanguageUtil.get(pageContext, \"org.oep.core.utilities.dossiermgt.portlet.dossierproc.label.administrationno\") %>">
								<aui:option value="SCT">So Cong Thuong</aui:option>	
								<aui:option value="SNNPTNT">So Nong Nghiep va Phat trien nong thon</aui:option>
							</aui:select>
						</aui:column>
						<aui:column columnWidth="50">
							<aui:select name="domainNo" label="<%= LanguageUtil.get(pageContext, \"org.oep.core.utilities.dossiermgt.portlet.dossierproc.label.domainno\") %>">
								<aui:option value="LVQT">Linh vuc quoc tich</aui:option>	
								<aui:option value="LVHQ">Linh vuc hoi quy</aui:option>
							</aui:select>						
						</aui:column>
					</aui:row>
					<aui:row>
						<aui:column columnWidth="50">
							<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"org.oep.core.utilities.dossiermgt.portlet.dossierproc.label.effectdate\") %>">
								<div class="aui-datepicker aui-helper-clearfix" id="<portlet:namespace />effectDatePicker">
									<input value="<%= effectDate %>" type="text" name="<portlet:namespace />effectDate" id="<portlet:namespace />effectDate" size="30" />
								</div>
							</aui:field-wrapper>
						</aui:column>
						<aui:column columnWidth="50">
							<aui:field-wrapper label="<%= LanguageUtil.get(pageContext, \"org.oep.core.utilities.dossiermgt.portlet.dossierproc.label.expiredate\") %>">
								<div class="aui-datepicker aui-helper-clearfix" id="<portlet:namespace />expireDatePicker">
									<input value="<%= expireDate %>" type="text" name="<portlet:namespace />expireDate" id="<portlet:namespace />expireDate" size="30" />
								</div>
							</aui:field-wrapper>
						</aui:column>
					</aui:row>
					<aui:row>
						<aui:column columnWidth="100">
							<aui:select name="active" label="<%= LanguageUtil.get(pageContext, \"org.oep.core.utilities.dossiermgt.portlet.dossierproc.label.active\") %>">
								<aui:option value="1">Active</aui:option>
								<aui:option value="0">Inactive</aui:option>
							</aui:select>
						</aui:column>
					</aui:row>
				</aui:layout>
			</liferay-ui:section>
		</liferay-ui:tabs>
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit" />

        <aui:button onClick="<%= viewDossierProcURL %>"  type="cancel" />
    </aui:button-row>
</aui:form>


<aui:script>
YUI().use('aui-datepicker', function(Y) {
	var effectDatePicker = new Y.DatePicker(
	{
		trigger: '#<portlet:namespace />effectDate',
		calendar: {
			dates: [ '08/10/2015' ]	
		},
		mask: '%d/%m/%Y',
		popover: {
			zIndex: 1
		}
	}
	);
	
});
</aui:script>
<aui:script>
YUI().use('aui-datepicker', function(A) {
	var expireDatePicker = new A.DatePicker(
		{
			trigger: '#<portlet:namespace />expireDate',
			mask: '%d/%m/%Y',
			popover: {
				zIndex: 2
			}
		}
	);
});
</aui:script>

