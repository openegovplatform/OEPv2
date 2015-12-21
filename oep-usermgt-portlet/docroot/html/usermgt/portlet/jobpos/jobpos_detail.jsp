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
 <%@ include file="/html/usermgt/portlet/init.jsp"%>
 <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<%@page import="org.oep.usermgt.action.PortletKeys"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="org.oep.usermgt.action.JobPosKeys"%>
<%@page import="org.oep.usermgt.model.WorkingUnit"%>
<%@page import="org.oep.usermgt.service.WorkingUnitLocalServiceUtil"%>
<%@ page import="org.oep.datamgt.service.DictDataLocalServiceUtil"%>
<%@ page import="org.oep.datamgt.model.DictData"%>

<portlet:actionURL var="addEdit" name="addEditJobPos">
	<portlet:param name="<%= PortletKeys.SET_VIEW_PARAMETER %>" value="/html/usermgt/portlet/jobpos/jobpos_detail.jsp"/>
	<portlet:param name="<%= PortletKeys.REDIRECT_PAGE %>" value="<%= ParamUtil.getString(request, PortletKeys.REDIRECT_PAGE) %>"/>
	<portlet:param name="<%= JobPosKeys.BaseJobPosAttributes.EDIT_ID %>" value="<%= ParamUtil.getString(request, JobPosKeys.BaseJobPosAttributes.EDIT_ID) %>"/>
	<portlet:param name="<%= JobPosKeys.AddEditAttributes.WORKINGUNITID %>" value="<%= ParamUtil.getString(request, JobPosKeys.AddEditAttributes.WORKINGUNITID) %>"/>
</portlet:actionURL>
<%
ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();	
List<DictData> lstData = DictDataLocalServiceUtil
.getByCollectionNameDataLevel(
		"OEP_GOVERNMENT_DUTY", 1, serviceContext);
long  parentWorkingUnitId = ParamUtil.getLong(request,JobPosKeys.AddEditAttributes.WORKINGUNITID,PortletKeys.SELECT_BOX);
long  subWorkingUnitId = ParamUtil.getLong(request,JobPosKeys.AddEditAttributes.SUBWORKINGUNITID,PortletKeys.SELECT_BOX);
long  positionCatNo = ParamUtil.getLong(request,JobPosKeys.AddEditAttributes.POSITIONCATNO,PortletKeys.SELECT_BOX);
List<WorkingUnit> listWorkingUnit = WorkingUnitLocalServiceUtil.getByCompanyParentWorkingUnit(parentWorkingUnitId, serviceContext);
%>

<aui:form name="addEdit" method="post" enctype="multipart/form-data">
	<div class="form-group">
		<aui:row>	
			<aui:column columnWidth="70">
				<aui:input style="width: 95%;" cssClass="form-control" name="<%=JobPosKeys.AddEditAttributes.TITLE%>" id="<%= JobPosKeys.AddEditAttributes.TITLE%>" label="org.oep.usermgt.portlet.jobpos.table.header.title" type="text">
				</aui:input>
			</aui:column>
		</aui:row>	
		<aui:row>	
			<aui:column columnWidth="70">
			<aui:select style="width: 95%;" cssClass="form-control"  name="<%=JobPosKeys.AddEditAttributes.POSITIONCATNO%>"  id="<%=JobPosKeys.AddEditAttributes.POSITIONCATNO%>" label="org.oep.usermgt.portlet.jobpos.table.header.positionCatNo">
			<aui:option value=""><%=LanguageUtil
								.get(pageContext,
									"org.oep.usermgt.portlet.jobpos.select.label.positionCatNo")%></aui:option>
								<%
									for (DictData data : lstData) {
										boolean selected = data.getDataCode().equals(positionCatNo);
								%>
				
											<aui:option value="<%=data.getDataCode()%>" selected="<%=selected%>"> <%=data.getTitle()%></aui:option>
								<%
										}
								%>					
							</aui:select>
			</aui:column>
		</aui:row>
		<aui:row>	
			<aui:column columnWidth="70">
			<aui:select style="width: 95%;" cssClass="form-control"  name="<%=JobPosKeys.AddEditAttributes.SUBWORKINGUNITID%>"  id="<%=JobPosKeys.AddEditAttributes.SUBWORKINGUNITID%>" label="org.oep.usermgt.portlet.jobpos.table.header.subWorkingUnitId">
			<aui:option value=""><%=LanguageUtil
								.get(pageContext,
									"org.oep.usermgt.portlet.jobpos.select.label.subWorkingUnitId")%></aui:option>
								<%
									for (WorkingUnit wk : listWorkingUnit) {
										boolean selected = wk.getWorkingUnitId() == subWorkingUnitId;
								%>
											<aui:option value="<%=wk.getWorkingUnitId()%>" selected="<%=selected%>"> <%=wk.getName()%></aui:option>
								<%
										}
								%>					
							</aui:select>
			</aui:column>
		</aui:row>
		 <%  
		   int check = ParamUtil.getInteger(request,JobPosKeys.AddEditAttributes.LEADER,PortletKeys.INT);
		   boolean f1 = false;
		   boolean f2 = false;
		   boolean f0 = false;
		   if (check == 1) {
			   f1 = true;
		   }
		    else if(check == 2) {
		    	f2 = true;
		    } 
		    else  f0 = true;
		    %>
		<aui:row>	
		<aui:column columnWidth="70">
		<aui:field-wrapper name=""> 
		
 			<aui:column columnWidth="20">
				<aui:input checked="<%=f1%>" inlineLabel="right" name="<%= JobPosKeys.AddEditAttributes.LEADER %>" type="radio" value="1" label="org.oep.usermgt.portlet.jobpos.table.header.leader1" /> 
 			</aui:column>
			<aui:column columnWidth="20">
					<aui:input checked="<%=f2%>" inlineLabel="right" name="<%= JobPosKeys.AddEditAttributes.LEADER %>" type="radio" value="2" label="org.oep.usermgt.portlet.jobpos.table.header.leader2" /> 
			</aui:column>
			<aui:column columnWidth="20">
					<aui:input checked="<%=f0%>" inlineLabel="right" name="<%= JobPosKeys.AddEditAttributes.LEADER %>" type="radio" value="0" label="org.oep.usermgt.portlet.jobpos.table.header.leader0" /> 
			</aui:column>
		</aui:field-wrapper>
		</aui:column>
		</aui:row>
		<aui:row>
			<aui:column>
				<input class="btn btn-primary" type="button" value="<liferay-ui:message key="org.oep.usermgt.portlet.button.save" />" onclick="<portlet:namespace/>save()">
				<input class="btn btn-default" type="button" value="<liferay-ui:message key="org.oep.usermgt.portlet.button.cancel" />" onclick="<portlet:namespace/>back()"/>
			</aui:column>
		</aui:row>
	</div>
</aui:form>
<script type="text/javascript">
function <portlet:namespace/>save() {
	var form = document.<portlet:namespace />addEdit;
	form.action = "<%=addEdit%>";
	form.submit();
};
function <portlet:namespace/>back() {
	location.href = "<%= ParamUtil.getString(request, PortletKeys.REDIRECT_PAGE) %>";
};
</script>
