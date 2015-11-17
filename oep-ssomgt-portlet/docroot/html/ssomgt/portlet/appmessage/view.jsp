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
<%@page import="org.oep.ssomgt.service.ApplicationLocalServiceUtil"%>
<%@page import="org.oep.ssomgt.model.Application"%>
<%@page import="org.oep.ssomgt.model.AppMessage"%>
<%@page import="org.oep.ssomgt.service.AppMessageLocalServiceUtil"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="org.oep.ssomgt.action.AppMessageKeys"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>
<%@page import="org.oep.ssomgt.action.PortletKeys"%>
<%@page import="com.liferay.portal.service.ServiceContextThreadLocal"%>
<%@page import="com.liferay.portal.service.ServiceContext"%>
<%@ include file="/html/ssomgt/portlet/appmessage/init.jsp" %>

<%
	ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

	int cur = ParamUtil.getInteger(request, PortletKeys.SearchContainer.CURRENT_PAGE, PortletKeys.PAGE);
	int delta = ParamUtil.getInteger(request, PortletKeys.SearchContainer.DELTA, PortletKeys.DELTA);
	PortletURL iteratorUrl = renderResponse.createRenderURL();
	SearchContainer<AppMessage> searchContainer = new SearchContainer<AppMessage>(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, cur, delta, iteratorUrl, null, null);

	DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
	DateFormat simpledf = new SimpleDateFormat("dd/MM/yyyy H:m:s.S");
	
	String fromApplication = ParamUtil.getString(request, AppMessageKeys.SearchAttributes.FROM_APPLICATION, PortletKeys.TEXT_BOX);
	String toUser = ParamUtil.getString(request, AppMessageKeys.SearchAttributes.TO_USER, PortletKeys.TEXT_BOX);
	Date fromDate = ParamUtil.getDate(request, AppMessageKeys.SearchAttributes.FROM_DATE, dateFormat, null);
	Date toDate = ParamUtil.getDate(request, AppMessageKeys.SearchAttributes.TO_DATE, dateFormat, null);
	
	String messageType = ParamUtil.getString(request, AppMessageKeys.SearchAttributes.MESSAGE_TYPE, PortletKeys.TEXT_BOX);
	
	int total = AppMessageLocalServiceUtil.countByCustomCondition(fromApplication, toUser, fromDate, toDate, messageType, serviceContext);
	
	searchContainer.setTotal(total);
	List<AppMessage> datas = new ArrayList<AppMessage>();
	if (total > 0) {
		int startIndex = searchContainer.getStart();
		int endIndex = searchContainer.getEnd();
		datas = AppMessageLocalServiceUtil.findByCustomCondition(fromApplication, toUser, fromDate, toDate, messageType, startIndex, endIndex, serviceContext);
		
		searchContainer.setResults(datas);
	}
%>

<portlet:renderURL var="redirectURL">
	<portlet:param name="<%= PortletKeys.SearchContainer.DELTA %>" value="<%= String.valueOf(ParamUtil.getInteger(request, PortletKeys.SearchContainer.DELTA, PortletKeys.DELTA)) %>"/>
	<portlet:param name="<%= PortletKeys.SearchContainer.CURRENT_PAGE %>" value="<%= String.valueOf(ParamUtil.getInteger(request, PortletKeys.SearchContainer.CURRENT_PAGE, PortletKeys.PAGE)) %>"/>
</portlet:renderURL>
<portlet:renderURL var="searchAppMessage">
	<portlet:param name="<%= PortletKeys.SearchContainer.DELTA %>" value="<%= String.valueOf(ParamUtil.getInteger(request, PortletKeys.SearchContainer.DELTA, PortletKeys.DELTA)) %>"/>
	<portlet:param name="<%= PortletKeys.SearchContainer.CURRENT_PAGE %>" value="<%= String.valueOf(ParamUtil.getInteger(request, PortletKeys.SearchContainer.CURRENT_PAGE, PortletKeys.PAGE)) %>"/>	
</portlet:renderURL>
<portlet:renderURL var="viewAppMessage">
	<portlet:param name="<%= PortletKeys.SET_VIEW_PARAMETER %>" value="/html/ssomgt/portlet/appmessage/appmessage_detail.jsp"/>
	<portlet:param name="<%= PortletKeys.REDIRECT_PAGE %>" value="<%= redirectURL %>"/>
</portlet:renderURL>

<aui:form name="searchAppMessage" method="POST">
	<div class="table-responsive">		
		<aui:row>
			<aui:column columnWidth="50">
				<aui:select style="width: 100%" label="<%= LanguageUtil.get(pageContext, \"org.oep.ssomgt.portlet.appmessage.empty\") %>" name="<%= AppMessageKeys.SearchAttributes.FROM_APPLICATION %>" id="<%= AppMessageKeys.SearchAttributes.FROM_APPLICATION %>" >
					<aui:option value="<%= PortletKeys.TEXT_BOX %>"><liferay-ui:message key="org.oep.ssomgt.portlet.appmessage.selectbox.applicationcode" /></aui:option>
						<%
							List<Application> lstApplications = ApplicationLocalServiceUtil.findByCompany(serviceContext);
						%>
						<c:if test="<%= lstApplications != null && lstApplications.size() > 0 %>">
							<c:set var="applicationCode" scope="page" value="<%= fromApplication %>"></c:set>
							<c:forEach items="<%= lstApplications %>" var="appitem">
								<c:choose>
									<c:when test="${appitem.appCode eq applicationCode}">
										<aui:option selected="<%= true %>" value="${appitem.appCode}">${appitem.appName}</aui:option>
									</c:when>
									<c:otherwise>
										<aui:option value="${appitem.appCode}">${appitem.appName}</aui:option>
									</c:otherwise>
								</c:choose>
							</c:forEach>
						</c:if>
					</aui:select>				
			</aui:column>
			<aui:column columnWidth="50">
				<aui:row>
					<aui:column columnWidth="60">
						<aui:select style="width: 100%" label="<%= LanguageUtil.get(pageContext, \"org.oep.ssomgt.portlet.appmessage.empty\") %>" name="<%= AppMessageKeys.SearchAttributes.TO_USER %>" id="<%= AppMessageKeys.SearchAttributes.TO_USER %>" >
							<aui:option value="<%= PortletKeys.TEXT_BOX %>"><liferay-ui:message key="org.oep.ssomgt.portlet.appmessage.selectbox.touser" /></aui:option>
						</aui:select>			
					</aui:column>
					<aui:column columnWidth="40">
						<input type="button" class="btn btn-primary" value="<liferay-ui:message key="org.oep.ssomgt.portlet.appmessage.button.search" />" onclick="<portlet:namespace/>search()" />
					</aui:column>
				</aui:row>
			</aui:column>
		</aui:row>
		<aui:row>
			<aui:column columnWidth="50">
				<aui:row>
					<aui:column columnWidth="50">
						<liferay-ui:message key="org.oep.ssomgt.portlet.appmessage.label.fromdate"></liferay-ui:message>
        				<liferay-ui:input-date formName="<%= AppMessageKeys.SearchAttributes.FROM_DATE %>" yearValue="2010" monthValue="3" dayValue="21" />					
					</aui:column>
					<aui:column columnWidth="50">
						<liferay-ui:message key="org.oep.ssomgt.portlet.appmessage.label.todate"></liferay-ui:message>
        				<liferay-ui:input-date formName="<%= AppMessageKeys.SearchAttributes.TO_DATE %>" yearValue="2010" monthValue="3" dayValue="21" />					
					</aui:column>
				</aui:row>
			</aui:column>
			<aui:column columnWidth="50">
				<aui:select style="width: 100%" label="<%= LanguageUtil.get(pageContext, \"org.oep.ssomgt.portlet.appmessage.empty\") %>" name="<%= AppMessageKeys.SearchAttributes.MESSAGE_TYPE %>" id="<%= AppMessageKeys.SearchAttributes.MESSAGE_TYPE %>" >
					<aui:option value="<%= PortletKeys.TEXT_BOX %>"><liferay-ui:message key="org.oep.ssomgt.portlet.appmessage.selectbox.messagetype" /></aui:option>
				</aui:select>			
			</aui:column>
		</aui:row>
		<p></p>
		<table class="table table-bordered table-hover">
		<%
		if (datas != null && datas.size() > 0) {
			int index=1;
			%>
			<tr style="text-align:center">
				<th width="4%"><liferay-ui:message key="org.oep.ssomgt.portlet.appmessage.table.header.no" /></th>
				<th width="20%"><liferay-ui:message key="org.oep.ssomgt.portlet.appmessage.table.header.createdate" /></th>
				<th width="10%"><liferay-ui:message key="org.oep.ssomgt.portlet.appmessage.table.header.fromapplication" /></th>
				<th width="20%"><liferay-ui:message key="org.oep.ssomgt.portlet.appmessage.table.header.touser" /></th>
				<th width="15%"><liferay-ui:message key="org.oep.ssomgt.portlet.appmessage.table.header.messagetext" /></th>
				<th width="15%"><liferay-ui:message key="org.oep.ssomgt.portlet.appmessage.table.header.messagetype" /></th>
				<th style="text-align: center;"><liferay-ui:message key="org.oep.ssomgt.portlet.appmessage.table.header.action" /></th>
			</tr>
			<%
			for (AppMessage data : datas) {
				%>
				<portlet:renderURL var="viewUrl">
					<portlet:param name="<%= PortletKeys.REDIRECT_PAGE %>" value="<%= redirectURL %>"/>
					<portlet:param name="<%= PortletKeys.SET_VIEW_PARAMETER %>" value="/html/ssomgt/portlet/appmessage/appmessage_detail.jsp"/>
					<portlet:param name="<%= AppMessageKeys.BaseAppMessageAttributes.EDIT_ID %>" value="<%= String.valueOf(data.getAppMessageId()) %>"/>
				</portlet:renderURL>
				<tr>
					<td style="text-align:center"><%=(searchContainer.getStart() +  (index++))%></td>
					<td style="text-align:left"><%= simpledf.format(data.getCreateDate()) %></td>
					<td style="text-align:left"><%= data.getFromApplication() %></td>
					<td style="text-align:left"><%= data.getToUser() %></td>
					<td style="text-align:left"><%= data.getMessageText() %></td>
					<td style="text-align:left"><%= data.getMessageType() %></td>
					<td style="text-align:center">
						<a class="btn btn-success" href="#" title="<liferay-ui:message key="org.oep.ssomgt.portlet.appmessage.table.action.title.view" />" onclick="location.href = '<%= viewUrl %>';return false;"><%= LanguageUtil.get(pageContext, "org.oep.ssomgt.portlet.appmessage.table.action.title.view") %></a>
					</td>
				</tr>
				<%
			}
		} else {
			%>
			<tr>
				<td colspan="7">
					<p class="bg-success">
						<liferay-ui:message key="org.oep.ssomgt.portlet.appmessage.table.warning.empty" />
					</p>
				</td>
			</tr>
			<%
		}
		%>
		</table>
		</div>
		<c:if test="<%= searchContainer != null %>">
			<br />
			<div id = "pagination">
				<liferay-ui:search-paginator searchContainer="<%= searchContainer %>" />
			</div>
		</c:if>
</aui:form>

<script type="text/javascript">
	function <portlet:namespace/>search() {
		var form = document.<portlet:namespace />searchAppMessage;
		form.action = "<%= searchAppMessage %>";
		form.submit();
	};
		
</script>
 