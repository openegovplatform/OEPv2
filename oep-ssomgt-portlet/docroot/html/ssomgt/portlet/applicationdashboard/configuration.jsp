<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@include file="/html/ssomgt/portlet/init.jsp" %>

<liferay-portlet:actionURL portletConfiguration="true" var="configurationURL" />

<%
	boolean showToUserCfg = GetterUtil.getBoolean(portletPreferences.getValue("showtouser", "false"));
	Integer numberOfUserMessage = GetterUtil.getInteger(portletPreferences.getValue("numberofusermessage", "5"));
%>

<aui:form action="<%= configurationURL %>" method="post" name="fm">
    <aui:input name="<%= Constants.CMD %>" type="hidden" value="<%= Constants.UPDATE %>" />

    <aui:input label="<%= LanguageUtil.get(pageContext, \"org.oep.ssomgt.portlet.applicationdashboard.configuration.showtouser\") %>" name="preferences--showtouser--" type="checkbox" value="<%= String.valueOf(showToUserCfg) %>" />

    <aui:input label="<%= LanguageUtil.get(pageContext, \"org.oep.ssomgt.portlet.applicationdashboard.configuration.numberofusermessage\") %>" name="preferences--numberofusermessage--" type="text" value="<%= String.valueOf(numberOfUserMessage) %>" />

    <aui:button-row>
       <aui:button type="submit" />
    </aui:button-row>
</aui:form>