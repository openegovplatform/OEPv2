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
<%@page import="com.liferay.portal.service.ServiceContext"%>
<%@page import="com.liferay.portal.service.ServiceContextThreadLocal"%>
<%@page import="com.liferay.portal.kernel.util.OrderByComparator"%>
<%@page import="java.util.LinkedHashMap"%>
<%@page import="com.liferay.portal.service.UserLocalServiceUtil"%>
<%@page import="com.liferay.portal.model.User"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>
<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@page import="org.oep.ssomgt.service.ApplicationLocalServiceUtil"%>
<%@page import="org.oep.ssomgt.model.Application"%>
<%@page import="org.oep.ssomgt.action.PortletKeys"%>
<%@page import="org.oep.ssomgt.action.UserSyncKeys"%>
<%@ include file="/html/ssomgt/portlet/usersync/init.jsp" %>
<%
	ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();
	long applicationId = ParamUtil.getLong(request, UserSyncKeys.AddEditAttributes.APPLICATION_ID, PortletKeys.LONG_DEFAULT);
	Application app = ApplicationLocalServiceUtil.getApplication(applicationId);
	String textSearch = ParamUtil.getString(request, UserSyncKeys.SearchAttributes.USER_SEARCH, PortletKeys.TEXT_BOX);
	int cur = ParamUtil.getInteger(request, PortletKeys.SearchContainer.CURRENT_PAGE, PortletKeys.PAGE);
	int delta = ParamUtil.getInteger(request, PortletKeys.SearchContainer.DELTA, PortletKeys.DELTA);
	PortletURL iteratorUrl = renderResponse.createRenderURL();

	iteratorUrl.setParameter(PortletKeys.REDIRECT_PAGE, ParamUtil.getString(request, PortletKeys.REDIRECT_PAGE));
	iteratorUrl.setParameter(PortletKeys.SET_VIEW_PARAMETER, "/html/ssomgt/portlet/usersync/changemapping_detail.jsp");	
	iteratorUrl.setParameter(UserSyncKeys.AddEditAttributes.APPLICATION_ID, String.valueOf(ParamUtil.getLong(request, UserSyncKeys.AddEditAttributes.APPLICATION_ID, PortletKeys.LONG_DEFAULT)));
	iteratorUrl.setParameter(UserSyncKeys.AddEditAttributes.EMPLOYEE_ID, ParamUtil.getString(request, UserSyncKeys.AddEditAttributes.EDIT_ID));
	iteratorUrl.setParameter(UserSyncKeys.AddEditAttributes.SSO_USERNAME, ParamUtil.getString(request, UserSyncKeys.AddEditAttributes.SSO_USERNAME, PortletKeys.TEXT_BOX));
	iteratorUrl.setParameter(UserSyncKeys.AddEditAttributes.APP_USERNAME, ParamUtil.getString(request, UserSyncKeys.AddEditAttributes.APP_USERNAME, PortletKeys.TEXT_BOX));
	iteratorUrl.setParameter(UserSyncKeys.AddEditAttributes.EMAIL, ParamUtil.getString(request, UserSyncKeys.AddEditAttributes.EMAIL, PortletKeys.TEXT_BOX));
	
	SearchContainer<User> searchContainer = new SearchContainer<User>(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, cur, delta, iteratorUrl, null, null);
	LinkedHashMap<String, Object> userParams = new LinkedHashMap<String, Object>();
    
	List<User> datas = UserLocalServiceUtil.search (serviceContext.getCompanyId(), textSearch, 0, userParams,
    searchContainer.getStart(), searchContainer.getEnd(),
    (OrderByComparator) null);

    int total = UserLocalServiceUtil.searchCount(serviceContext.getCompanyId(), textSearch, 0, userParams);
    
	searchContainer.setTotal(total);
	if (total > 0) {
		searchContainer.setResults(datas);
	}
	
%>
<portlet:resourceURL var="getAppUsers">
	<portlet:param name="<%=Constants.CMD%>" value="getAppUsers" />
</portlet:resourceURL>
<portlet:actionURL var="addEditUserSync" name="addEditUserSync">
	<portlet:param name="<%= PortletKeys.SET_VIEW_PARAMETER %>" value="/html/ssomgt/portlet/usersync/changemapping_detail.jsp"/>
	<portlet:param name="<%= PortletKeys.REDIRECT_PAGE %>" value="<%= ParamUtil.getString(request, PortletKeys.REDIRECT_PAGE) %>"/>
	<portlet:param name="<%= UserSyncKeys.AddEditAttributes.EDIT_ID %>" value="<%= ParamUtil.getString(request, UserSyncKeys.AddEditAttributes.EDIT_ID) %>"/>
</portlet:actionURL>
<aui:form name="addEditUserSyncForm" method="post">
	<table class="table">
		<tr>
			<td>
				<liferay-ui:message key="org.oep.ssomgt.portlet.usersync.changemapping.label.ssousername"></liferay-ui:message>:
			</td>
			<td>
				<%= ParamUtil.get(request, UserSyncKeys.AddEditAttributes.SSO_USERNAME, PortletKeys.TEXT_BOX) %>
			</td>
		</tr>
		<tr>
			<td>
				<liferay-ui:message key="org.oep.ssomgt.portlet.usersync.changemapping.label.email"></liferay-ui:message>:
			</td>
			<td>
				<%= ParamUtil.get(request, UserSyncKeys.AddEditAttributes.EMAIL, PortletKeys.TEXT_BOX) %>
			</td>
		</tr>
		<tr>
			<td>
				<liferay-ui:message key="org.oep.ssomgt.portlet.usersync.changemapping.label.application"></liferay-ui:message>:
			</td>
			<td>
				<%= app.getAppName() %>
			</td>
		</tr>
		<tr>
			<td>
				<liferay-ui:message key="org.oep.ssomgt.portlet.usersync.changemapping.label.appusername"></liferay-ui:message>:
			</td>
			<td>
				<aui:input label="org.oep.ssomgt.portlet.usersync.changemapping.label.empty" name="<%= UserSyncKeys.AddEditAttributes.APP_USERNAME %>" id="<%= UserSyncKeys.AddEditAttributes.APP_USERNAME %>" type="text" value="<%= ParamUtil.getString(request, UserSyncKeys.AddEditAttributes.APP_USERNAME, PortletKeys.TEXT_BOX) %>"></aui:input>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<input class="btn btn-primary" type="button" value="<liferay-ui:message key="org.oep.ssomgt.portlet.usersync.button.save" />" onclick="<portlet:namespace/>save()"/>			
				<input class="btn btn-default" type="button" value="<liferay-ui:message key="org.oep.ssomgt.portlet.usersync.button.back" />" onclick="<portlet:namespace/>back()"/>
			</td>
		</tr>	
	</table>
</aui:form>
<aui:form name="userSearchForm" method="post">
	<div class="form-search">
		<div class="input-append">
			<input type="text"  name="<portlet:namespace/><%= UserSyncKeys.SearchAttributes.USER_SEARCH %>" 
				value = "<%= textSearch %>"
				style="width: 98%;" class="span2 search-query">
			<button type="button" class="btn" onclick="<portlet:namespace/>search()">
				<liferay-ui:message
					key="org.oep.ssomgt.portlet.usersync.changemapping.usersearch.button" />
			</button>
		</div>
	</div>	
	
	<div class="table-responsive">
		<table class="table table-bordered table-hover">
			<%
				if (datas != null && datas.size() > 0) {
				int index=1;
			%>
			<tr>
				<th style="text-align: center" width="5%"><liferay-ui:message
						key="org.oep.ssomgt.portlet.usersync.changemapping.usersearch.table.header.no" /></th>
				<th width="40%"><liferay-ui:message
						key="org.oep.ssomgt.portlet.usersync.changemapping.usersearch.table.header.fullname" /></th>
				<th width="40%"><liferay-ui:message
						key="org.oep.ssomgt.portlet.usersync.changemapping.usersearch.table.header.screenname" /></th>
				<th style="text-align: center"><liferay-ui:message
						key="org.oep.ssomgt.portlet.usersync.changemapping.usersearch.table.header.action" /></th>
			</tr>
			<%
				for (User data : datas) {
			%>			

			<%
				if (index % 2 == 0) {
			%>
			<tr class="success">
				<td style="text-align: center"><%=(searchContainer.getStart() +  (index++))%></td>
				<td style="text-align: left"><%= data.getFullName() %></td>
				<td style="text-align: left"><%= data.getScreenName() %></td>
				<td style="text-align: center;">
					<a href="#" class="btn btn-success" title="<liferay-ui:message key="org.oep.ssomgt.portlet.usersync.changemapping.usersearch.table.header.select" />" onclick="<portlet:namespace/>chooseUser('<%= data.getScreenName() %>');return false;"><i class="icon-pencil"><liferay-ui:message key="org.oep.ssomgt.portlet.usersync.changemapping.usersearch.table.header.select" /></i></a>
				</td>
			</tr>
			<%
				}
				else {
			%>
			<tr class="info">
				<td style="text-align: center"><%=(searchContainer.getStart() +  (index++))%></td>
				<td style="text-align: left"><%= data.getFullName() %></td>
				<td style="text-align: left"><%= data.getScreenName() %></td>
				<td style="text-align: center;">
					<a href="#" class="btn btn-success" title="<liferay-ui:message key="org.oep.ssomgt.portlet.usersync.changemapping.usersearch.table.header.select" />" onclick="<portlet:namespace/>chooseUser('<%= data.getScreenName() %>');return false;"><i class="icon-pencil"><liferay-ui:message key="org.oep.ssomgt.portlet.usersync.changemapping.usersearch.table.header.select" /></i></a>
				</td>
			</tr>
			<%
				}
			%>
			<%
				}
				} else {
			%>

			<tr>
				<td colspan="4">
					<p class="bg-success">
						<liferay-ui:message
							key="org.oep.ssomgt.portlet.usersync.changemapping.usersearch.table.empty" />
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
		<div id="pagination">
			<liferay-ui:search-paginator searchContainer="<%= searchContainer %>" />
		</div>
	</c:if>
			
</aui:form>
<portlet:renderURL var="searchUser">
	<portlet:param name="<%=PortletKeys.SearchContainer.DELTA%>"
		value="<%=String.valueOf(ParamUtil.getInteger(request, PortletKeys.SearchContainer.DELTA, PortletKeys.DELTA))%>" />
	<portlet:param name="<%=PortletKeys.SearchContainer.CURRENT_PAGE%>"
		value="<%=String.valueOf(ParamUtil.getInteger(request, PortletKeys.SearchContainer.CURRENT_PAGE, PortletKeys.PAGE))%>" />
	<portlet:param name="<%= PortletKeys.SET_VIEW_PARAMETER %>" value="/html/ssomgt/portlet/usersync/changemapping_detail.jsp"/>
	<portlet:param name="<%= PortletKeys.REDIRECT_PAGE %>" value="<%= ParamUtil.getString(request, PortletKeys.REDIRECT_PAGE) %>"/>
	<portlet:param name="<%= UserSyncKeys.AddEditAttributes.EDIT_ID %>" value="<%= ParamUtil.getString(request, UserSyncKeys.AddEditAttributes.EDIT_ID) %>"/>
	<portlet:param name="<%= UserSyncKeys.AddEditAttributes.APPLICATION_ID %>" value="<%= String.valueOf(ParamUtil.getLong(request, UserSyncKeys.AddEditAttributes.APPLICATION_ID, PortletKeys.LONG_DEFAULT)) %>"/>
	<portlet:param name="<%= UserSyncKeys.AddEditAttributes.SSO_USERNAME %>" value="<%= ParamUtil.getString(request, UserSyncKeys.AddEditAttributes.SSO_USERNAME, PortletKeys.TEXT_BOX) %>"/>
	<portlet:param name="<%= UserSyncKeys.AddEditAttributes.EMAIL %>" value="<%= ParamUtil.getString(request, UserSyncKeys.AddEditAttributes.EMAIL, PortletKeys.TEXT_BOX) %>"/>
	<portlet:param name="<%= UserSyncKeys.AddEditAttributes.APP_USERNAME %>" value="<%= ParamUtil.getString(request, UserSyncKeys.AddEditAttributes.APP_USERNAME, PortletKeys.TEXT_BOX) %>"/>

</portlet:renderURL>

<script type="text/javascript">
function <portlet:namespace/>search() {
	var form = document.<portlet:namespace />userSearchForm;
	form.action = "<%= searchUser  %>";
	form.submit();
};

function <portlet:namespace/>back() {
	location.href = "<%= ParamUtil.getString(request, PortletKeys.REDIRECT_PAGE) %>";
};
function <portlet:namespace/>save() {
	var form = document.<portlet:namespace />addEditUserSyncForm;
	form.action = "<%= addEditUserSync %>";
	form.submit();
};

function <portlet:namespace/>chooseUser(username) {
	var form = document.<portlet:namespace />addEditUserSyncForm;
	var element = form.<portlet:namespace/><%= UserSyncKeys.AddEditAttributes.APP_USERNAME %>;
	element.value = username;	
}	

</script>
<aui:script>
	/*
	AUI().use('autocomplete-list','aui-base','aui-io-request','autocomplete-filters','autocomplete-highlighters',function (A) {
	A.io.request('<%=getAppUsers%>',{
		dataType: 'json',
		method: 'GET',
		on: {
			success: function() {
				new A.AutoCompleteList(
				{
					allowBrowserAutocomplete: 'true',
					activateFirstItem: 'true',
					inputNode: '#<portlet:namespace /><%=UserSyncKeys.AddEditAttributes.APP_USERNAME%>',
					resultTextLocator: 'name',
					render: 'true',
					resultHighlighter: 'phraseMatch',
					resultFilters:['phraseMatch'],
					source:this.get('responseData'),
				})
			}}
		});
	});
	*/
</aui:script>