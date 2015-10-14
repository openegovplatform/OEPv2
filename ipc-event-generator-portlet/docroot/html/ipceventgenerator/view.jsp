<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<portlet:defineObjects />
 
<portlet:actionURL var="actionUrl" name="processEvent"/>
 
<aui:form method="post" action="<%=actionUrl.toString() %>">
 
<aui:input name="sampleText" label="Sample Text"/>
 
<aui:button-row>
    <aui:button type="submit" value="Send"/>
</aui:button-row>
 
</aui:form>