<%@page import="org.oep.ssomgt.action.PortletKeys"%>
<%@page import="com.liferay.portal.service.ServiceContextThreadLocal"%>
<%@page import="com.liferay.portal.service.ServiceContext"%>
<%@page import="org.oep.ssomgt.service.ApplicationLocalServiceUtil"%>
<%@page import="org.oep.ssomgt.model.Application"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@include file="/html/ssomgt/portlet/init.jsp" %>

<liferay-portlet:actionURL portletConfiguration="true" var="configurationURL" />

<%
	Integer applicationIdCfg = GetterUtil.getInteger(portletPreferences.getValue("applicationid", "0"));
	ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();
	List<Application> lstApps = ApplicationLocalServiceUtil.findByCompany(serviceContext);
	boolean showToUserCfg = GetterUtil.getBoolean(portletPreferences.getValue("showtouser", "false"));
	Integer numberOfUserMessage = GetterUtil.getInteger(portletPreferences.getValue("numberofusermessage", "5"));
%>

<aui:form action="<%= configurationURL %>" method="post" name="fm">
    <aui:input name="<%= Constants.CMD %>" type="hidden" value="<%= Constants.UPDATE %>" />

	<aui:select label="<%= LanguageUtil.get(pageContext, \"org.oep.ssomgt.portlet.mydashboard.label.selectapplication\") %>" name="preferences--applicationid--">
		<aui:option value="<%= PortletKeys.LONG_DEFAULT %>"><liferay-ui:message key="org.oep.ssomgt.portlet.mydashboard.selectapplication"></liferay-ui:message></aui:option>
		<%
			for (Application app : lstApps) {
				if (app.getApplicationId() == applicationIdCfg) {
		%>
		<aui:option selected="<%= true %>" value="<%= app.getApplicationId() %>"><%= app.getAppName() %></aui:option>		
		<%
				}
				else {
		%>
		<aui:option value="<%= app.getApplicationId() %>"><%= app.getAppName() %></aui:option>		
		<%
				}
		%>
		<%
			}
		%>
	</aui:select>
    <aui:input label="<%= LanguageUtil.get(pageContext, \"org.oep.ssomgt.portlet.mydashboard.configuration.showtouser\") %>" name="preferences--showtouser--" type="checkbox" value="<%= String.valueOf(showToUserCfg) %>" />

    <aui:input label="<%= LanguageUtil.get(pageContext, \"org.oep.ssomgt.portlet.mydashboard.configuration.numberofusermessage\") %>" name="preferences--numberofusermessage--" type="text" value="<%= String.valueOf(numberOfUserMessage) %>" />

    <aui:button-row>
       <aui:button type="submit" />
    </aui:button-row>
</aui:form>