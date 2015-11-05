<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="java.util.ArrayList"%>
<%@page import="org.oep.core.dossiermgt.model.DossierProc"%>
<%@page import="org.oep.core.dossiermgt.service.DossierProcLocalServiceUtil"%>
<%@page import="org.oep.datamgt.service.DictDataLocalServiceUtil"%>
<%@page import="org.oep.datamgt.model.DictData"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.service.ServiceContextThreadLocal"%>
<%@page import="com.liferay.portal.service.ServiceContext"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@page import="com.liferay.portlet.PortletURLUtil"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@taglib uri="http://liferay.com/tld/security" prefix="liferay-security" %>
<%@taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@taglib uri="http://liferay.com/tld/util" prefix="liferay-util" %>
<%@ page import="com.liferay.portal.kernel.util.Validator" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.liferay.portal.util.PortalUtil"%>
<%@ page import="com.liferay.portlet.PortletPreferencesFactoryUtil" %>
<%@ page import="javax.portlet.PortletMode"%>
<%@ page import="javax.portlet.WindowState"%>
<%@ page import="javax.portlet.PortletRequest" %>
<%@ page import="javax.portlet.PortletURL"%>
<%@ page import="javax.portlet.PortletPreferences" %>
<%@ page import="com.liferay.portal.kernel.dao.search.DisplayTerms" %>
<%@ page import="com.liferay.portal.kernel.dao.search.SearchContainer" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
	long dossierProcId = ParamUtil.getLong(request, "dossierProcId");
	DossierProc dossierProc = DossierProcLocalServiceUtil.getDossierProc(dossierProcId);
%>
<aui:row>
	<aui:column columnWidth="100">
		<table style="border-collapse: collapse;border-spacing: 0; width: 100%; padding: 10px;">
			<tbody>
				<tr>
					<td style="font-weight: bold; border: 1px solid #cbccce; padding: 10px; text-align: left; width: 30%;"><%= LanguageUtil.get(pageContext, "org.oep.dossiermgt.portlet.dossierproc.table.header.name") %></td>
					<td style="padding: 10px; border: 1px solid #cbccce; overflow: hidden; text-align: left; text-overflow: ellipsis; width: 70%">
						<%= dossierProc.getName() %>
					</td>
				</tr>
				<tr>
					<td style="font-weight: bold; border: 1px solid #cbccce; padding: 10px; text-align: left; width: 30%;"><%= LanguageUtil.get(pageContext, "org.oep.dossiermgt.portlet.dossierproc.table.header.processdescription") %></td>
					<td style="padding: 10px; border: 1px solid #cbccce; overflow: hidden; text-align: left; text-overflow: ellipsis; width: 70%">
						<%= dossierProc.getProcessDescription() %>
					</td>
				</tr>				
				<tr>
					<td style="font-weight: bold; border: 1px solid #cbccce; padding: 10px; text-align: left; width: 30%;"><%= LanguageUtil.get(pageContext, "org.oep.dossiermgt.portlet.dossierproc.table.header.methoddescription") %></td>
					<td style="padding: 10px; border: 1px solid #cbccce; overflow: hidden; text-align: left; text-overflow: ellipsis; width: 70%">
						<%= dossierProc.getMethodDescription() %>
					</td>
				</tr>				
				<tr>
					<td style="font-weight: bold; border: 1px solid #cbccce; padding: 10px; text-align: left; width: 30%;"><%= LanguageUtil.get(pageContext, "org.oep.dossiermgt.portlet.dossierproc.table.header.dossierdescription") %></td>
					<td style="padding: 10px; border: 1px solid #cbccce; overflow: hidden; text-align: left; text-overflow: ellipsis; width: 70%">
						<%= dossierProc.getDossierDescription() %>
					</td>
				</tr>				
				<tr>
					<td style="font-weight: bold; border: 1px solid #cbccce; padding: 10px; text-align: left; width: 30%;"><%= LanguageUtil.get(pageContext, "org.oep.dossiermgt.portlet.dossierproc.table.header.conditiondescription") %></td>
					<td style="padding: 10px; border: 1px solid #cbccce; overflow: hidden; text-align: left; text-overflow: ellipsis; width: 70%">
						<%= dossierProc.getConditionDescription() %>
					</td>
				</tr>				
				<tr>
					<td style="font-weight: bold; border: 1px solid #cbccce; padding: 10px; text-align: left; width: 30%;"><%= LanguageUtil.get(pageContext, "org.oep.dossiermgt.portlet.dossierproc.table.header.durationdescription") %></td>
					<td style="padding: 10px; border: 1px solid #cbccce; overflow: hidden; text-align: left; text-overflow: ellipsis; width: 70%">
						<%= dossierProc.getDurationDescription() %>
					</td>
				</tr>				
				<tr>
					<td style="font-weight: bold; border: 1px solid #cbccce; padding: 10px; text-align: left; width: 30%;"><%= LanguageUtil.get(pageContext, "org.oep.dossiermgt.portlet.dossierproc.table.header.actorsdescription") %></td>
					<td style="padding: 10px; border: 1px solid #cbccce; overflow: hidden; text-align: left; text-overflow: ellipsis; width: 70%">
						<%= dossierProc.getActorsDescription() %>
					</td>
				</tr>				
				<tr>
					<td style="font-weight: bold; border: 1px solid #cbccce; padding: 10px; text-align: left; width: 30%;"><%= LanguageUtil.get(pageContext, "org.oep.dossiermgt.portlet.dossierproc.table.header.resultsdescription") %></td>
					<td style="padding: 10px; border: 1px solid #cbccce; overflow: hidden; text-align: left; text-overflow: ellipsis; width: 70%">
						<%= dossierProc.getResultsDescription() %>
					</td>
				</tr>				
				<tr>
					<td style="font-weight: bold; border: 1px solid #cbccce; padding: 10px; text-align: left; width: 30%;"><%= LanguageUtil.get(pageContext, "org.oep.dossiermgt.portlet.dossierproc.table.header.recordsdescription") %></td>
					<td style="padding: 10px; border: 1px solid #cbccce; overflow: hidden; text-align: left; text-overflow: ellipsis; width: 70%">
						<%= dossierProc.getRecordsDescription() %>
					</td>
				</tr>				
			</tbody>
		</table>	
	</aui:column>
</aui:row>
<aui:row>
	<aui:column>
		<br/>
	</aui:column>
</aui:row>
<aui:row>
	<aui:column columnWidth="100">
		<input type="button" class="btn primary" value="<liferay-ui:message key="org.oep.portlet.button.back" />" onclick="<portlet:namespace/>back()"/>
	</aui:column>
</aui:row>
<script type="text/javascript">
function <portlet:namespace/>back() {
	location.href = "<%= ParamUtil.getString(request, "redirectPage") %>";
};
</script>