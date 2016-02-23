<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@include file="/html/ssomgt/portlet/init.jsp" %>

<liferay-portlet:actionURL portletConfiguration="true" var="configurationURL" />

<%
	boolean showToUserCfg = GetterUtil.getBoolean(portletPreferences.getValue("showtouser", "false"));
	Integer numberOfUserMessage = GetterUtil.getInteger(portletPreferences.getValue("numberofusermessage", "5"));
	String displayStyle = GetterUtil.getString(portletPreferences.getValue("displaystyle", ""), "");
	
%>

<aui:form action="<%= configurationURL %>" method="post" name="fm">
    <aui:input name="<%= Constants.CMD %>" type="hidden" value="<%= Constants.UPDATE %>" />

    <aui:input label="<%= LanguageUtil.get(pageContext, \"org.oep.ssomgt.portlet.dashboardapplication.configuration.showtouser\") %>" name="preferences--showtouser--" type="checkbox" value="<%= String.valueOf(showToUserCfg) %>" />

    <aui:input label="<%= LanguageUtil.get(pageContext, \"org.oep.ssomgt.portlet.dashboardapplication.configuration.numberofusermessage\") %>" name="preferences--numberofusermessage--" type="text" value="<%= String.valueOf(numberOfUserMessage) %>" />

	<aui:select name="preferences--displaystyle--" label="<%= LanguageUtil.get(pageContext, \"org.oep.ssomgt.portlet.dashboardapplication.configuration.displaystyle\") %>">
		<aui:option value="" selected='<%= displayStyle.equals("") %>'>
			<liferay-ui:message key="org.oep.ssomgt.portlet.dashboardapplication.configuration.displaystyle.selectstyle"></liferay-ui:message>
		</aui:option>
		<aui:option value="OEP_SSOMGT_DASHBOARDAPPLICATION_DISPLAYSTYLE_VERTICAL" selected='<%= displayStyle.equals("OEP_SSOMGT_DASHBOARDAPPLICATION_DISPLAYSTYLE_VERTICAL") %>'>
			<liferay-ui:message key="org.oep.ssomgt.portlet.dashboardapplication.configuration.displaystyle.vertical"></liferay-ui:message>
		</aui:option>
		<aui:option value="OEP_SSOMGT_DASHBOARDAPPLICATION_DISPLAYSTYLE_GRID2X" selected='<%= displayStyle.equals("OEP_SSOMGT_DASHBOARDAPPLICATION_DISPLAYSTYLE_GRID2X") %>'>
			<liferay-ui:message key="org.oep.ssomgt.portlet.dashboardapplication.configuration.displaystyle.grid2x"></liferay-ui:message>
		</aui:option>
		<aui:option value="OEP_SSOMGT_DASHBOARDAPPLICATION_DISPLAYSTYLE_GRID" selected='<%= displayStyle.equals("OEP_SSOMGT_DASHBOARDAPPLICATION_DISPLAYSTYLE_GRID3X") %>'>
			<liferay-ui:message key="org.oep.ssomgt.portlet.dashboardapplication.configuration.displaystyle.grid3x"></liferay-ui:message>
		</aui:option>
		<aui:option value="OEP_SSOMGT_DASHBOARDAPPLICATION_DISPLAYSTYLE_GRID" selected='<%= displayStyle.equals("OEP_SSOMGT_DASHBOARDAPPLICATION_DISPLAYSTYLE_GRID4X") %>'>
			<liferay-ui:message key="org.oep.ssomgt.portlet.dashboardapplication.configuration.displaystyle.grid4x"></liferay-ui:message>
		</aui:option>
	</aui:select>
    <aui:button-row>
       <aui:button type="submit" />
    </aui:button-row>
</aui:form>