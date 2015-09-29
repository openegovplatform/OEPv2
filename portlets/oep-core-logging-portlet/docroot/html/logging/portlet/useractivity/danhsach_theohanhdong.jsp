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
 
<%@page import="org.oep.core.logging.UserLogKeys"%>
<%@page import="org.oep.core.logging.business.UserActivityBusiness"%>
<%@page import="org.oep.core.logging.model.UserActivity"%>
<%@page import="org.oep.core.logging.PortletKeys"%>
<%@page import="com.liferay.portal.service.ServiceContextFactory"%>
<%@page import="com.liferay.portal.service.ServiceContext"%>
<%@page import="org.oep.core.logging.service.UserActivityLocalServiceUtil"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="com.liferay.portal.kernel.workflow.WorkflowConstants"%>
<%@page import="com.liferay.portal.security.permission.PermissionCheckerFactoryUtil"%>
<%@page import="com.liferay.portal.service.UserLocalServiceUtil"%>
<%@page import="com.liferay.portal.model.User"%>
<%@page import="org.oep.core.logging.util.DateUtil"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@ include file="/html/logging/portlet/useractivity/init.jsp" %>

<%
ServiceContext serviceContext= ServiceContextFactory.getInstance(request);
List<String> lstAction =UserActivityLocalServiceUtil.getDistinctAction(serviceContext);
		 
String strFromDate = ParamUtil.getString(request, "fromDate");
String strToDate = ParamUtil.getString(request, "toDate");
String action = ParamUtil.getString(request, "hanhDong","");
PortletURL renderTabHanhDongURL= renderResponse.createRenderURL();
renderTabHanhDongURL.setParameter("jspPage", "/html/logging/portlet/useractivity/view.jsp");
renderTabHanhDongURL.setParameter("tab", UserLogKeys.TAB_HANHDONG);
renderTabHanhDongURL.setParameter("hanhDong", action);
renderTabHanhDongURL.setParameter("fromDate", strFromDate);
renderTabHanhDongURL.setParameter("toDate", strToDate);

int index = 1;
int cur = ParamUtil.getInteger(request, PortletKeys.SearchContainer.CURRENT_PAGE, PortletKeys.PAGE);
int delta = ParamUtil.getInteger(request, PortletKeys.SearchContainer.DELTA, PortletKeys.DELTA);
String msgEmpty = LanguageUtil.get(pageContext, "org.oep.useractivity.message.khongcodulieu");
SearchContainer searchContainer = new SearchContainer(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, cur, delta, renderTabHanhDongURL, null, msgEmpty);

Date fromDate = DateUtil.parseStringToDate(strFromDate+" 00:00:00.0000", DateUtil.DATE_FORMAT_D_M_Y_H_M_S);
Date toDate = DateUtil.parseStringToDate(strToDate+" 23:59:59.0000", DateUtil.DATE_FORMAT_D_M_Y_H_M_S);

int totalResult =UserActivityLocalServiceUtil.countByParam(action, fromDate, toDate, serviceContext);
searchContainer.setTotal(totalResult);

List<UserActivity> lstResult = new ArrayList<UserActivity>();
if(totalResult > 0){
	int begin = searchContainer.getStart();
	int end = searchContainer.getEnd();
	lstResult = UserActivityLocalServiceUtil.getByParam(action, fromDate, toDate, serviceContext, begin, end);
}	
%>

<portlet:renderURL var="redirectURL">
	<portlet:param name="jspPage" value="/html/logging/portlet/useractivity/view.jsp"/>
	<portlet:param name="tab" value="<%= UserLogKeys.TAB_HANHDONG %>"/>
	<portlet:param name="hanhDong" value="<%= action %>"/>
	<portlet:param name="fromDate" value="<%= strFromDate %>"/>
	<portlet:param name="toDate" value="<%= strToDate %>"/>
	<portlet:param name="<%= PortletKeys.SearchContainer.CURRENT_PAGE %>" value="<%= String.valueOf(cur) %>"/>
	<portlet:param name="<%= PortletKeys.SearchContainer.DELTA %>" value="<%= String.valueOf(delta) %>"/>
</portlet:renderURL>
<portlet:renderURL var="searchByActionURL">
	<portlet:param name="jspPage" value="/html/logging/portlet/useractivity/view.jsp"/>
	<portlet:param name="tab" value="<%= UserLogKeys.TAB_HANHDONG %>"/>
	<portlet:param name="<%= PortletKeys.SearchContainer.CURRENT_PAGE %>" value="<%= String.valueOf(cur) %>"/>
	<portlet:param name="<%= PortletKeys.SearchContainer.DELTA %>" value="<%= String.valueOf(delta) %>"/>
</portlet:renderURL>
	
<div class="oep-container">
	<aui:form method="POST" name="fm" action="<%= searchByActionURL %>">
		<table class="oep-table-form">
			<tr>
				<td>
					<aui:select name="hanhDong" cssClass="oep-select" label="<%=  LanguageUtil.get(pageContext, \"org.oep.useractivity.text.hanhdong\") %>" style="width:95%">
						<aui:option value=""><label><%= LanguageUtil.get(pageContext, "org.oep.useractivity.title.all") %> </label></aui:option>
						<c:if test="<%= lstAction != null && lstAction.size() > 0 %>">
							<c:forEach items="<%= lstAction %>" var="item">
								<aui:option value="${item}"><label>${item}</label></aui:option>
							</c:forEach>
						</c:if>
					</aui:select>
				</td>
				<td>
					<aui:input type="text" name="fromDate" cssClass="oep-calendar" 
					label="<%= LanguageUtil.get(pageContext, \"org.oep.useractivity.text.fromDate\") %>" style="width:95%"/>
				</td>
				<td>
					<aui:input type="text" name="toDate" cssClass="oep-calendar"
					label="<%= LanguageUtil.get(pageContext, \"org.oep.useractivity.text.toDate\") %>" style="width:95%"/>
				</td>
				<td>
					<br>
					<aui:input type="submit" name="" cssClass="oep-button primary search" 
					value="<%= LanguageUtil.get(pageContext, \"org.oep.useractivity.button.search\") %>"/>
				</td>
			</tr>
		</table>
	</aui:form>
	
	<liferay-ui:success key="org.oep.useractivity.success.deactive" message = "org.oep.useractivity.success.deactive"/>
	<liferay-ui:success key="org.oep.useractivity.success.active" message = "org.oep.useractivity.success.active"/>
	<liferay-ui:success key="org.oep.useractivity.success.signout" message = "org.oep.useractivity.success.signout"/>
	<liferay-ui:error key="org.oep.useractivity.error.operation.fail" message = "org.oep.useractivity.error.operation.fail"/>
	
	<table cellpadding="0" cellspacing="0" class="oep-table" width="100%">
		<tr>
			<th width="4%"><liferay-ui:message key="org.oep.useractivity.label.stt" /></th>
			<th width="10%"><liferay-ui:message key="org.oep.useractivity.label.thoigian" /></th>
			<th width="26%"><liferay-ui:message key="org.oep.useractivity.label.username" /></th>
			<th width="15%"><liferay-ui:message key="org.oep.useractivity.label.email" /></th>
			<th width="10%"><liferay-ui:message key="org.oep.useractivity.label.trang" /></th>
			<th width="10%"><liferay-ui:message key="org.oep.useractivity.label.hanhdong" /></th>			
			<th width="10%"><liferay-ui:message key="org.oep.useractivity.label.ip" /></th>
			<th width="5%"><liferay-ui:message key="org.oep.useractivity.label.trangthai"/></th>
			<th width="10%"><liferay-ui:message key="org.oep.useractivity.label.chucnang" /></th>
		</tr>
		<c:if test="<%= lstResult != null && lstResult.size() > 0 %>">
			<%
			Map<String, Boolean> userOnlineStatus = new HashMap<String, Boolean>();
			%>
			<c:forEach items="<%= lstResult %>" var="item">
				<portlet:renderURL var="xemchitietURL">
					<portlet:param name="jspPage" value="/html/logging/portlet/useractivity/view.jsp"/>
					<portlet:param name="tab" value="<%= UserLogKeys.TAB_CHITIET %>"/>
					<portlet:param name="logUserId" value="${item.userId}"/>
					<portlet:param name="<%= PortletKeys.REDIRECT_PAGE %>" value="<%= redirectURL %>"/>
				</portlet:renderURL>
				<portlet:renderURL var="lst_nguoidung_URL">
					<portlet:param name="jspPage" value="/html/logging/portlet/useractivity/view.jsp"/>
					<portlet:param name="tab" value="<%= UserLogKeys.TAB_NGUOIDUNG %>"/>
					<portlet:param name="keyWord" value="${item.userName}"/>
					<portlet:param name="fromDate" value="<%= strFromDate %>"/>
					<portlet:param name="toDate" value="<%= strToDate %>"/>
				</portlet:renderURL>
				<portlet:actionURL var="deactivateUserURL" name="deactivateUser">
					<portlet:param name="jspPage" value="/html/logging/portlet/useractivity/view.jsp"/>
					<portlet:param name="tab" value="<%= UserLogKeys.TAB_HANHDONG %>"/>
					<portlet:param name="userId" value="${item.userId}"/>
					<portlet:param name="<%= PortletKeys.REDIRECT_PAGE %>" value="<%= redirectURL %>"/>
				</portlet:actionURL>
				<portlet:actionURL var="activateUserURL" name="activateUser">
					<portlet:param name="jspPage" value="/html/logging/portlet/useractivity/view.jsp"/>
					<portlet:param name="tab" value="<%= UserLogKeys.TAB_HANHDONG %>"/>
					<portlet:param name="userId" value="${item.userId}"/>
					<portlet:param name="<%= PortletKeys.REDIRECT_PAGE %>" value="<%= redirectURL %>"/>
				</portlet:actionURL>
				<%  
					UserActivity logNguoiDung = (UserActivity) pageContext.getAttribute("item");
					User tmpUser = UserLocalServiceUtil.fetchUser(logNguoiDung.getUserId());
					boolean actionEnable = permissionChecker.isOmniadmin() && tmpUser != null && !PermissionCheckerFactoryUtil.create(tmpUser).isOmniadmin();
					boolean isOnlineUser = false;
					if (!userOnlineStatus.containsKey(String.valueOf(logNguoiDung.getUserId()))) {
						userOnlineStatus.put(String.valueOf(logNguoiDung.getUserId()), UserActivityBusiness.isUserOnline(logNguoiDung.getCreateDate()));
					}
					if (userOnlineStatus.containsKey(String.valueOf(logNguoiDung.getUserId()))) {
						isOnlineUser = userOnlineStatus.get(String.valueOf(logNguoiDung.getUserId()));
					}
				%>
				<tr>
					<td class="text-center"><%= searchContainer.getStart() + (index++) %></td>
					<td>
						<label><fmt:formatDate value="${item.createDate}" pattern="dd/MM/yyyy hh:mm:ss aa" /></label>
					</td>
					<td>
						<a href="<%= lst_nguoidung_URL %>"><label>${item.userName}</label></a>
					</td>
					<td><label>${item.email}</label></td>
					<td><label>${item.page}</label></td>
					<td><label>${item.action}</label></td>
					<td><label>${item.ip}</label></td>	
					<td style="text-align: center;">
						<c:if test="<%=  tmpUser.getStatus() == WorkflowConstants.STATUS_APPROVED %>">
							<c:if test="<%= isOnlineUser %>">
								<a class="oep-icon-activate" title='<%= LanguageUtil.get(pageContext, "org.oep.useractivity.title.trangthai.online") %>'></a>
							</c:if>
							<c:if test="<%= !isOnlineUser %>">
								<a class="oep-icon-deactivate" title='<%= LanguageUtil.get(pageContext, "org.oep.useractivity.title.trangthai.offline") %>'></a>
							</c:if>
						</c:if>
						<c:if test="<%= tmpUser.getStatus() == WorkflowConstants.STATUS_INACTIVE %>">
							<a class="oep-icon-lock"  title='<%= LanguageUtil.get(pageContext, "org.oep.useractivity.title.trangthai.dangkhoa") %>'></a>
						</c:if>
					</td>
					<td>
						<table>
							<tr>
								<td style="border: none; padding: 0px;width: 33%;">
									<a class="oep-icon-history" href="<%= xemchitietURL %>" title="<%= LanguageUtil.get(pageContext, "org.oep.useractivity.title.xemtheonguoidung")%>"></a>
								</td>
								<td style="border: none; padding: 0px;width: 33%;">
									<c:if test="<%= actionEnable %>">
										<c:if test="<%= tmpUser.getStatus() == WorkflowConstants.STATUS_APPROVED %>">
											<a class="oep-icon-lock" href="javascript:void(0);" onclick="<portlet:namespace/>deactivateUser('<%= deactivateUserURL %>');" title='<%= LanguageUtil.get(pageContext, "org.oep.useractivity.title.khoa.nguoidung") %>'></a>
										</c:if>
										<c:if test="<%= tmpUser.getStatus() == WorkflowConstants.STATUS_INACTIVE %>">
											<a class="oep-icon-key" href="javascript:void(0);" onclick="<portlet:namespace/>activateUser('<%= activateUserURL %>');" title='<%= LanguageUtil.get(pageContext, "org.oep.useractivity.title.mokhoa.nguoidung") %>'></a>
										</c:if>
									</c:if>
								</td>
							</tr>
						</table>
					</td>	
				</tr>
			</c:forEach>
		</c:if>
	</table>
	<c:if test="<%= searchContainer != null %>">
		<div id = "pagination">
				<liferay-ui:search-paginator searchContainer="<%= searchContainer %>" />
		</div>
	</c:if>
</div>

<script>
function <portlet:namespace/>deactivateUser(url){
	if(confirm('<%= LanguageUtil.get(pageContext, "org.oep.useractivity.confirm.message.truoc.khi.khoa") %>')){
		location.href = url;
	}
}

function <portlet:namespace/>activateUser(url){
	if(confirm('<%= LanguageUtil.get(pageContext, "org.oep.useractivity.confirm.message.truoc.khi.mokhoa") %>')){
		location.href = url;
	}	
}
</script>