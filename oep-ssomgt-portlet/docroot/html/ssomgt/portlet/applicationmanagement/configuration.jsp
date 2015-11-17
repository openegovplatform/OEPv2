<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@include file="/html/ssomgt/portlet/init.jsp" %>

<liferay-portlet:actionURL portletConfiguration="true" var="configurationURL" />

<%
	Integer pageSizeCfg = GetterUtil.getInteger(portletPreferences.getValue("pageSize", "1"));
%>

<aui:form action="<%= configurationURL %>" method="post" name="fm">
    <aui:input name="<%= Constants.CMD %>" type="hidden" value="<%= Constants.UPDATE %>" />

    <aui:input label="<%= LanguageUtil.get(pageContext, \"org.oep.ssomgt.portlet.applicationmanagement.configuration.pagesize\") %>" name="preferences--pageSize--" type="text" value="<%= String.valueOf(pageSizeCfg) %>" />

    <aui:button-row>
       <aui:button type="submit" />
    </aui:button-row>
</aui:form>