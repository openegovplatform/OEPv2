<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
 
<portlet:defineObjects />
 
<%
    String sampleText = (String) renderRequest.getParameter("sampleText");
%>
 
<aui:form>
    <aui:input name="receivedText" label="Received Text" readOnly="true" value="<%=sampleText %>"/>
</aui:form>