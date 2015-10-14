<%@page import="org.oep.core.dossiermgt.model.EbPartnerShip"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@ page import="com.liferay.portal.kernel.dao.search.ResultRow" %>
<%@ page import="com.liferay.portal.kernel.util.WebKeys" %>
<%@ page import="com.liferay.portal.util.PortalUtil" %>

<portlet:defineObjects />

<%
    ResultRow row = (ResultRow) request
            .getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
    EbPartnerShip ebPartnerShip = (EbPartnerShip) row.getObject();

    long ebPartnerShipId = ebPartnerShip.getEbPartnerShipId();

    String redirect = PortalUtil.getCurrentURL(renderRequest);
%>

<liferay-ui:icon-menu>
    <portlet:renderURL var="editURL">
        <portlet:param name="mvcPath" value="/html/dossiermgt/portlet/ebpartnership/edit_ebpartnership.jsp" />
        <portlet:param name="ebPartnerShipId" value="<%= String.valueOf(ebPartnerShipId) %>" />
        <portlet:param name="redirect" value="<%= redirect %>" />
    </portlet:renderURL>

    <liferay-ui:icon image="edit" url="<%= editURL.toString() %>" />

    <portlet:actionURL name="deleteEbPartnerShip" var="deleteURL">
        <portlet:param name="ebPartnerShipId" value="<%= String.valueOf(ebPartnerShipId) %>" />
        <portlet:param name="redirect" value="<%= redirect %>" />
    </portlet:actionURL>

    <liferay-ui:icon-delete url="<%= deleteURL.toString() %>" />
</liferay-ui:icon-menu>