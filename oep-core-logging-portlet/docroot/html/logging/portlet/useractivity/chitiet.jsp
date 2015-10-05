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
<%@page import="org.oep.core.logging.model.UserActivity"%>
<%@page import="org.oep.core.logging.service.UserActivityLocalServiceUtil"%>
<%@page import="org.oep.core.logging.PortletKeys"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ include file="/html/logging/portlet/useractivity/init.jsp" %>

<%
String logUserId = ParamUtil.getString(request, "logUserId","0");
		 
PortletURL renderTabChiTietURL= renderResponse.createRenderURL();
renderTabChiTietURL.setParameter("jspPage", "/html/logging/portlet/useractivity/view.jsp");
renderTabChiTietURL.setParameter("tab", "tab_chitiet");
renderTabChiTietURL.setParameter("logUserId", logUserId);
renderTabChiTietURL.setParameter(PortletKeys.REDIRECT_PAGE, ParamUtil.getString(request, PortletKeys.REDIRECT_PAGE));

int index=1;
int cur = ParamUtil.getInteger(request, PortletKeys.SearchContainer.CURRENT_PAGE, PortletKeys.PAGE);
int delta = ParamUtil.getInteger(request, PortletKeys.SearchContainer.DELTA, PortletKeys.DELTA);
String msgEmpty = LanguageUtil.get(pageContext, "org.oep.useractivity.message.khongcodulieu");
SearchContainer searchContainer = new SearchContainer(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, cur, delta, renderTabChiTietURL, null, msgEmpty);

int totalResult =UserActivityLocalServiceUtil.countByUserId(Long.parseLong(logUserId));
searchContainer.setTotal(totalResult);

List<UserActivity> lstResult = new ArrayList<UserActivity>();
if(totalResult > 0){
	int begin = searchContainer.getStart();
	int end = searchContainer.getEnd();
	lstResult = UserActivityLocalServiceUtil.getByUserId(Long.parseLong(logUserId), begin, end);
}
%>
<br/>
<div>
	<liferay-ui:message key="org.oep.useractivity.label.title_chitiet_danhsach" />
	<input type="button" class="oep-button primary undo" style="float: right;" value='<%= LanguageUtil.get(pageContext, "org.oep.useractivity.button.trolai") %>' onclick="<portlet:namespace/>back()" />
</div>
<br/>
<table cellpadding="0" cellspacing="0" class="oep-table" width="100%">
	<tbody>
		<tr>
			<th width="5%"><liferay-ui:message key="org.oep.useractivity.label.stt" /></th>
			<th width="10%"><liferay-ui:message key="org.oep.useractivity.label.thoigian" /></th>
			<th width="30%">
				<liferay-ui:message key="org.oep.useractivity.label.username"/>
				<br/>
				<liferay-ui:message key="org.oep.useractivity.label.email" />	
				<br/>
				<liferay-ui:message key="org.oep.useractivity.label.userAgent"/>
			</th>
			<th width="10"><liferay-ui:message key="org.oep.useractivity.label.ip" /></th>
			<th width="25%"><liferay-ui:message key="org.oep.useractivity.label.trang" /></th>
			<th width="20%">
				<liferay-ui:message key="org.oep.useractivity.label.hanhdong" />/
				<br/>
				<liferay-ui:message key="org.oep.useractivity.label.mota" />
			</th>			
		</tr>
	</tbody>
	<c:if test="<%= lstResult != null && lstResult.size() > 0 %>">
		<%
		Map<String, String> codeNameMapping = new HashMap<String, String>();
		%>
		<c:forEach items="<%= lstResult %>" var="item">
			<%
			UserActivity logNguoiDung = (UserActivity)pageContext.getAttribute("item");
			%>
			<tr>
				<td class="text-center"><%=(searchContainer.getStart() +  (index++))%></td>
				<td>
					<label>
						<fmt:formatDate value="${item.createDate}" pattern="dd/MM/yyyy hh:mm:ss aa" />
					</label>
				</td>
				<td>
					<label class="oep-label-bold">${item.userName}</label>
					<br/>
					<label class="oep-label-bold">${item.email}</label>
					<br/>
					<label>${item.userAgent}</label>
				</td>
				<td class="text-center">
					<label>${item.ip}</label>
				</td>
				<td>
					<label>${item.page}</label>
				</td>
				<td>
					<label>${item.action}</label>
					<br/>
					<c:if test="${not empty item.description}">
						<div class="oep-area-note">
						<label>${item.description}</label>
					</div>
					</c:if>
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

<script>
function <portlet:namespace/>back() {
	location.href = '<%= ParamUtil.getString(request, PortletKeys.REDIRECT_PAGE) %>';
}
</script>
