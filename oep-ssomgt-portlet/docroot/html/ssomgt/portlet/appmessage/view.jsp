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
<%@page import="com.liferay.portal.kernel.exception.PortalException"%>
<%@page import="com.liferay.portal.service.UserLocalServiceUtil"%>
<%@page import="com.liferay.portal.model.User"%>
<%@page import="org.oep.ssomgt.service.AppRole2EmployeeLocalServiceUtil"%>
<%@page import="org.oep.ssomgt.model.AppRole2Employee"%>
<%@page import="com.liferay.portal.kernel.exception.SystemException"%>
<%@page import="org.oep.ssomgt.NoSuchApplicationException"%>
<%@page import="org.oep.ssomgt.service.AppRoleLocalServiceUtil"%>
<%@page import="org.oep.ssomgt.model.AppRole"%>
<%@page import="org.oep.datamgt.service.DictDataLocalServiceUtil"%>
<%@page import="org.oep.datamgt.model.DictData"%>
<%@page import="java.util.Calendar"%>
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
	
	List<AppRole> lstAppRoles = new ArrayList<AppRole>();
	try {
		Application app = ApplicationLocalServiceUtil.getByAppCode(fromApplication);
		lstAppRoles = AppRoleLocalServiceUtil.findByCompanyGroupApplication(app.getApplicationId(), serviceContext);
	} catch (NoSuchApplicationException ex) {
		// TODO Auto-generated catch block
		ex.printStackTrace();
	} catch (SystemException ex) {
		// TODO Auto-generated catch block
		ex.printStackTrace();
	}
			
	long[] appRoleIds = new long[lstAppRoles.size()];
	List<AppRole2Employee> lstA2E = new ArrayList<AppRole2Employee>(); 
	for (int i = 0; i < lstAppRoles.size(); i++) {
		appRoleIds[i] = lstAppRoles.get(i).getAppRoleId();
	}
	
	try {
		lstA2E = AppRole2EmployeeLocalServiceUtil.findByArrayOfAppRole(appRoleIds, serviceContext);
	} catch (SystemException ex) {
		// TODO Auto-generated catch block
		ex.printStackTrace();
	}
	
	List<User> lstUser = new ArrayList<User>();
	for (AppRole2Employee a2e : lstA2E) {
		User u;
		try {
			u = UserLocalServiceUtil.getUser(a2e.getUserId());
			lstUser.add(u);
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
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
	Date now = new Date();
	Calendar calendar = Calendar.getInstance();
	calendar.setTime(now);
	int day = calendar.get(Calendar.DAY_OF_MONTH);
	int month = calendar.get(Calendar.MONTH);
	int year = calendar.get(Calendar.YEAR);
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
							<aui:option value="everyone"><liferay-ui:message key="org.oep.ssomgt.portlet.appmessage.selectbox.touser" /></aui:option>
							<%
								for (User u : lstUser) {
									if (toUser.equals(u.getScreenName())) {
							%>
							<aui:option selected="<%= true %>" value="<%= u.getScreenName() %>"><%= u.getScreenName() %></aui:option>
							<%
									}
									else {
							%>
							<aui:option value="<%= u.getScreenName() %>"><%= u.getScreenName() %></aui:option>
							<%
									}
							%>
							<%
								}
							%>
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
        				<liferay-ui:input-date formName="<%= AppMessageKeys.SearchAttributes.FROM_DATE %>" yearValue="<%= year %>" monthValue="0" dayValue="1" />					
					</aui:column>
					<aui:column columnWidth="50">
						<liferay-ui:message key="org.oep.ssomgt.portlet.appmessage.label.todate"></liferay-ui:message>
        				<liferay-ui:input-date formName="<%= AppMessageKeys.SearchAttributes.TO_DATE %>" yearValue="<%= year %>" monthValue="<%= month %>" dayValue="<%= day %>" />					
					</aui:column>
				</aui:row>
			</aui:column>
			<aui:column columnWidth="50">
				<aui:select style="width: 100%" label="<%= LanguageUtil.get(pageContext, \"org.oep.ssomgt.portlet.appmessage.empty\") %>" name="<%= AppMessageKeys.SearchAttributes.MESSAGE_TYPE %>" id="<%= AppMessageKeys.SearchAttributes.MESSAGE_TYPE %>" >
					<aui:option value="<%= PortletKeys.TEXT_BOX %>"><liferay-ui:message key="org.oep.ssomgt.portlet.appmessage.selectbox.messagetype" /></aui:option>
					<%
						List<DictData> lstMessageType = DictDataLocalServiceUtil.getByCollectionName("OEP_MESSAGE_TYPE", serviceContext);
					%>
					<c:forEach var="mtype" items="<%= lstMessageType %>">
						<aui:option value="${ mtype.dataCode }">${ mtype.title }</aui:option>
					</c:forEach>
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
<portlet:resourceURL var="resourceURL" ></portlet:resourceURL>
<script type="text/javascript">
	function <portlet:namespace/>search() {
		var form = document.<portlet:namespace />searchAppMessage;
		form.action = "<%= searchAppMessage %>";
		form.submit();
	};
		
</script>
<aui:script>
AUI().use('aui-base','aui-io-request','aui-node', function(A){
    A.one("#<portlet:namespace/><%= AppMessageKeys.SearchAttributes.FROM_APPLICATION %>").on('change',function(){
        A.io.request('<%= resourceURL %>', { 
            method :'POST',
            data: {
            	'<portlet:namespace/><%= AppMessageKeys.SearchAttributes.FROM_APPLICATION %>' : A.one("#<portlet:namespace/><%= AppMessageKeys.SearchAttributes.FROM_APPLICATION %>").val() ,
           	},
            dataType: 'json',
            on:{
                success: function(){
	                var users = this.get('responseData');
	                A.one('#<portlet:namespace /><%= AppMessageKeys.SearchAttributes.TO_USER %>').empty();
	                
	                A.one('#<portlet:namespace /><%= AppMessageKeys.SearchAttributes.TO_USER %>').append("<option value='everyone'>" + "<%= LanguageUtil.get(pageContext,"org.oep.ssomgt.portlet.appmessage.selectbox.touser") %>" + "</option>");
	                for( var i = 0; i < users.length; i++ ) {
	               		A.one('#<portlet:namespace /><%= AppMessageKeys.SearchAttributes.TO_USER %>').append("<option value='"+ users[i].screenName  +"' >"+ users[i].screenName + "</option>"); 	                    
	                }
                }                
            }
                    
	    });
    });
});
</aui:script> 