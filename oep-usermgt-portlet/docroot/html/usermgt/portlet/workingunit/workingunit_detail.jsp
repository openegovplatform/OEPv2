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
<%@page import="org.oep.usermgt.action.WorkingUnitKeys"%>
<%@page import="org.oep.usermgt.model.WorkingUnit"%>
<%@page import="org.oep.usermgt.service.WorkingUnitLocalServiceUtil"%>
<%@ page import="org.oep.datamgt.service.DictDataLocalServiceUtil"%>
<%@ page import="org.oep.datamgt.model.DictData"%>
<%@page import="com.liferay.portal.model.Organization"%>
<%@page import="com.liferay.portal.model.Group"%>
<%@page import="com.liferay.portal.service.OrganizationLocalServiceUtil"%>
<%@page import="com.liferay.portal.service.GroupLocalServiceUtil"%>
<%@page import="com.liferay.portal.model.GroupConstants"%>

<%@page import="org.oep.usermgt.dto.SelectionDataDTO"%>
<%@page import="org.oep.usermgt.util.CustomAUIUtil"%>

<portlet:actionURL var="addEdit" name="addEdit">
	<portlet:param name="<%= PortletKeys.SET_VIEW_PARAMETER %>" value="/html/usermgt/portlet/workingunit/workingunit_detail.jsp"/>
	<portlet:param name="<%= PortletKeys.REDIRECT_PAGE %>" value="<%= ParamUtil.getString(request, PortletKeys.REDIRECT_PAGE) %>"/>
	<portlet:param name="<%= WorkingUnitKeys.BaseWorkingUnitAttributes.EDIT_ID %>" value="<%= ParamUtil.getString(request, WorkingUnitKeys.BaseWorkingUnitAttributes.EDIT_ID) %>"/>
</portlet:actionURL>
<%
	String cityNo = ParamUtil.getString(request,WorkingUnitKeys.AddEditAttributes.CITYNAME,PortletKeys.TEXT_BOX);
	String districtNo = ParamUtil.getString(request,WorkingUnitKeys.AddEditAttributes.DISTRICTNAME,PortletKeys.TEXT_BOX);
	String wardNo = ParamUtil.getString(request,WorkingUnitKeys.AddEditAttributes.WARDNAME,PortletKeys.TEXT_BOX);
	long  parentWorkingUnitId = ParamUtil.getLong(request,WorkingUnitKeys.AddEditAttributes.PARENTWORKINGUNITID,PortletKeys.SELECT_BOX);
	long  localSiteId = ParamUtil.getLong(request,WorkingUnitKeys.AddEditAttributes.LOCALSITEID,PortletKeys.SELECT_BOX);
	long  organizationId = ParamUtil.getLong(request,WorkingUnitKeys.AddEditAttributes.ORGANIZATIONID,PortletKeys.SELECT_BOX);
	ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

	List<DictData> lstDomainData = DictDataLocalServiceUtil
			.getByCollectionNameDataLevel(
					"OEP_ADMINISTRATIVE_REGION", 1, serviceContext);
	List<DictData> districtList = new ArrayList<DictData>();
	if (cityNo != null && !cityNo.equals("")){
		districtList = DictDataLocalServiceUtil.findByDataLevelDataCode("","OEP_ADMINISTRATIVE_REGION", cityNo.split(":")[0], 2,serviceContext);
	}
	List<DictData> wardList = new ArrayList<DictData>();
	if (districtNo != null && !districtNo.equals("")){
		wardList = DictDataLocalServiceUtil.findByDataLevelDataCode("","OEP_ADMINISTRATIVE_REGION", districtNo.split(":")[0], 3,serviceContext);
	}
	List<WorkingUnit>  parentWorkingUnitList = WorkingUnitLocalServiceUtil.getByCompanyTree(serviceContext);
	
	ArrayList<SelectionDataDTO>  siteList = CustomAUIUtil.getListGroup(0,serviceContext.getCompanyId());
	
	List<Organization>  organizationList = OrganizationLocalServiceUtil.getNoAssetOrganizations();
%>
<aui:form name="addEdit" method="post" enctype="multipart/form-data">
	<div class="form-group">
		<aui:row>
			<aui:column columnWidth="60">
					<aui:row>
						<aui:column columnWidth="100">
							<aui:input style="width: 100%;" cssClass="form-control" name="<%=WorkingUnitKeys.AddEditAttributes.NAME%>" id="<%= WorkingUnitKeys.AddEditAttributes.NAME%>" label="org.oep.usermgt.portlet.workingunit.table.header.name" type="text"></aui:input>
						</aui:column>
					</aui:row>
					
					<aui:row>
						<aui:column columnWidth="100">
							<aui:input style="width: 100%;" cssClass="form-control" name="<%=WorkingUnitKeys.AddEditAttributes.ENNAME%>" id="<%= WorkingUnitKeys.AddEditAttributes.ENNAME%>" label="org.oep.usermgt.portlet.workingunit.table.header.enName" type="text"></aui:input>
						</aui:column>
					</aui:row>
					<aui:row>
					    <aui:column columnWidth="50">
					    	<aui:select style="width: 98%;" cssClass="form-control"  name="<%=WorkingUnitKeys.AddEditAttributes.PARENTWORKINGUNITID%>" id="<%= WorkingUnitKeys.AddEditAttributes.PARENTWORKINGUNITID%>" label="org.oep.usermgt.portlet.workingunit.table.header.parentWorkingUnitId" >
							<aui:option value=""><%=LanguageUtil
								.get(pageContext,
									"org.oep.usermgt.portlet.select.label.parentWorkingUnitId")%></aui:option>
								<%
									for (WorkingUnit data : parentWorkingUnitList) {
										boolean selected = data.getWorkingUnitId() == parentWorkingUnitId;
								%>
				
											<aui:option value="<%=data.getWorkingUnitId()%>" selected="<%=selected%>"> <%=data.getName()%></aui:option>
								<%
										}
								%>					
							</aui:select>
							</aui:column>
					    	  <%  
		   Boolean check = ParamUtil.getBoolean(request,WorkingUnitKeys.AddEditAttributes.ISEMPLOYER);
		   
		  // boolean f=  check == 1;%>
			<aui:column columnWidth="50">
					<aui:input checked="<%=check%>" label="org.oep.usermgt.portlet.workingunit.table.header.isEmployer" name='<%=WorkingUnitKeys.AddEditAttributes.ISEMPLOYER%>' type="checkbox"  value = ''/>
			</aui:column>
						
					</aui:row>
					<aui:row>
							<aui:column columnWidth="50">
								<aui:select style="width: 98%;" cssClass="form-control"  name="<%=WorkingUnitKeys.AddEditAttributes.LOCALSITEID%>" id="<%= WorkingUnitKeys.AddEditAttributes.LOCALSITEID%>" label="org.oep.usermgt.portlet.workingunit.table.header.localSiteId" >
							<aui:option value=""><%=LanguageUtil
								.get(pageContext,
									"org.oep.usermgt.portlet.select.label.localSiteId")%></aui:option>
								<%
									for (SelectionDataDTO data : siteList) {
										boolean selected = data.getId() == localSiteId;
								%>
											<aui:option value="<%=data.getId()%>" selected="<%=selected%>"> <%=data.getNameForLevel()%></aui:option>
								<%
										}
								%>					
							</aui:select>
							</aui:column>
							<aui:column columnWidth ="50">
										<aui:select style="width: 98%;" cssClass="form-control"  name="<%=WorkingUnitKeys.AddEditAttributes.ORGANIZATIONID %>" id="<%= WorkingUnitKeys.AddEditAttributes.ORGANIZATIONID%>" label="org.oep.usermgt.portlet.workingunit.table.header.organizationId" >
							<aui:option value=""><%=LanguageUtil
								.get(pageContext,
									"org.oep.usermgt.portlet.select.label.organizationId")%></aui:option>
								<%
									for (Organization data : organizationList) {
										boolean selected = data.getOrganizationId() == organizationId;
								%>
											<aui:option value="<%=data.getOrganizationId()%>" selected="<%=selected%>"> <%=data.getName()%></aui:option>
								<%
										}
								%>					
							</aui:select>
							</aui:column>
					</aui:row>
					<aui:row>
							<aui:column columnWidth="40">
								<aui:input style="width: 98%;" cssClass="form-control" name="<%=WorkingUnitKeys.AddEditAttributes.GOVAGENCYID%>" id="<%= WorkingUnitKeys.AddEditAttributes.GOVAGENCYID%>" label="org.oep.usermgt.portlet.workingunit.table.header.govAgencyId" type="text"></aui:input>
							</aui:column>
							<aui:column columnWidth ="60">
								<aui:input style="width: 98%;" cssClass="form-control" name="<%=WorkingUnitKeys.AddEditAttributes.ADDRESS%>" id="<%= WorkingUnitKeys.AddEditAttributes.ADDRESS%>" label="org.oep.usermgt.portlet.workingunit.table.header.address" type="text"></aui:input>
							</aui:column>
					</aui:row>
					
			</aui:column>
			<aui:column columnWidth="40">
				&nbsp; 
			</aui:column>
		</aui:row>
		<aui:row>
			<aui:column columnWidth="30">
			<aui:select style="width: 98%;" cssClass="form-control"  name="<%=WorkingUnitKeys.AddEditAttributes.CITYNO%>"  id="<%=WorkingUnitKeys.AddEditAttributes.CITYNO%>" label="org.oep.usermgt.portlet.workingunit.table.header.cityName">
				<aui:option value=""><%=LanguageUtil
							.get(pageContext,
									"org.oep.usermgt.portlet.select.label.cityName")%></aui:option>
				<%
					
											//DictDataLocalServiceUtil.getByCollectionName("OEP_DOSSIER_DOMAIN", serviceContext);
											for (DictData data : lstDomainData) {
												boolean selected = (data.getDataCode() + ":" + data.getTitle()).equals(cityNo);
				%>
				
				<aui:option value='<%=data.getDataCode() + ":" + data.getTitle()%>' selected="<%=selected%>"><%=data.getTitle()%></aui:option>
				<%
					}
				%>
			</aui:select>
			</aui:column>
			<aui:column columnWidth="30">
				<aui:select style="width: 98%;" cssClass="form-control"  name="<%=WorkingUnitKeys.AddEditAttributes.DISTRICTNO%>" id="<%= WorkingUnitKeys.AddEditAttributes.DISTRICTNO%>" label="org.oep.usermgt.portlet.workingunit.table.header.districtName" >
				<aui:option value=""><%=LanguageUtil
							.get(pageContext,
									"org.oep.usermgt.portlet.select.label.districtName")%></aui:option>
				<%
				for (DictData data : districtList) {
						boolean selected = (data.getDataCode() + ":" + data.getTitle()).equals(districtNo);
				%>
				
					<aui:option value='<%=data.getDataCode() + ":" + data.getTitle()%>' selected="<%=selected%>"><%=data.getTitle()%></aui:option>
				<%
					}
				%>					
				</aui:select>
				
			</aui:column>
			<aui:column columnWidth="30">
					<aui:select style="width: 98%;" cssClass="form-control"  name="<%=WorkingUnitKeys.AddEditAttributes.WARDNO%>" id="<%= WorkingUnitKeys.AddEditAttributes.WARDNO%>" label="org.oep.usermgt.portlet.workingunit.table.header.wardName" >
					<aui:option value=""><%=LanguageUtil
							.get(pageContext,
									"org.oep.usermgt.portlet.select.label.wardName")%></aui:option>
						<%
				for (DictData data : wardList) {
						boolean selected = (data.getDataCode() + ":" + data.getTitle()).equals(wardNo);
				%>
				
					<aui:option value='<%=data.getDataCode() + ":" + data.getTitle()%>' selected="<%=selected%>"><%=data.getTitle()%></aui:option>
				<%
					}
				%>		
					</aui:select>
			</aui:column>
		</aui:row>
		<aui:row>
			<aui:column columnWidth="30">
				<aui:input style="width: 98%;" cssClass="form-control" name="<%=WorkingUnitKeys.AddEditAttributes.TELNO%>" id="<%= WorkingUnitKeys.AddEditAttributes.TELNO%>" label="org.oep.usermgt.portlet.workingunit.table.header.telNo" type="text"></aui:input>
			</aui:column>
			<aui:column columnWidth="30">
				<aui:input style="width: 98%;" cssClass="form-control" name="<%=WorkingUnitKeys.AddEditAttributes.FAX%>" id="<%= WorkingUnitKeys.AddEditAttributes.FAX%>" label="org.oep.usermgt.portlet.workingunit.table.header.fax" type="text"></aui:input>
			</aui:column>
			<aui:column columnWidth="30">
				<aui:input style="width: 98%;" cssClass="form-control" name="<%=WorkingUnitKeys.AddEditAttributes.EMAIL%>" id="<%= WorkingUnitKeys.AddEditAttributes.EMAIL%>" label="org.oep.usermgt.portlet.workingunit.table.header.email" type="text"></aui:input>
			</aui:column>
		</aui:row>
		<aui:row>
			<aui:column columnWidth="60">
				<aui:input style="width: 98%;" cssClass="form-control" name="<%=WorkingUnitKeys.AddEditAttributes.WEBSITE%>" id="<%= WorkingUnitKeys.AddEditAttributes.WEBSITE%>" label="org.oep.usermgt.portlet.workingunit.table.header.website" type="text"></aui:input>				
			</aui:column>
		</aui:row>
		<aui:row>
			<aui:column>
				<input class="btn btn-primary" type="button" value="<liferay-ui:message key="org.oep.usermgt.portlet.button.save" />" onclick="<portlet:namespace/>save()">
				<input class="btn btn-default" type="button" value="<liferay-ui:message key="org.oep.usermgt.portlet.button.back" />" onclick="<portlet:namespace/>back()"/>
			</aui:column>
		</aui:row>
	</div>
	<aui:input style="width: 100%;" cssClass="form-control" name="<%=WorkingUnitKeys.AddEditAttributes.GPSPOSITION%>" id="<%= WorkingUnitKeys.AddEditAttributes.GPSPOSITION%>" label="org.oep.usermgt.portlet.workingunit.table.header.gpsPosition" type="text"></aui:input>
	
</aui:form>

<script type="text/javascript">
function <portlet:namespace/>save() {
	var form = document.<portlet:namespace />addEdit;
	form.action = "<%= addEdit %>";
	form.submit();
};

function <portlet:namespace/>back() {
	location.href = "<%= ParamUtil.getString(request, PortletKeys.REDIRECT_PAGE) %>";
};

</script>
<portlet:resourceURL var="resourceURL" ></portlet:resourceURL>
<aui:script>
AUI().use('aui-base','aui-io-request','aui-node', function(A){
    A.one("#<portlet:namespace/><%=WorkingUnitKeys.AddEditAttributes.CITYNO%>").on('change',function(){
        A.io.request('<%=resourceURL%>',
                {
            
            method :'POST',
            data: {'<portlet:namespace/><%=WorkingUnitKeys.AddEditAttributes.CITYNO%>' : A.one("#<portlet:namespace/><%=WorkingUnitKeys.AddEditAttributes.CITYNO%>").val() ,
            		'<portlet:namespace/>selectAction' : 'citySelected'
            		},
            dataType: 'json',
            on:{
                success: function(){
                    var names = this.get('responseData');
                    // alert(names.districtNameCode.length);
                     A.one('#<portlet:namespace /><%=WorkingUnitKeys.AddEditAttributes.DISTRICTNO%>').empty();
                     A.one('#<portlet:namespace /><%=WorkingUnitKeys.AddEditAttributes.WARDNO%>').empty();
                     //countryNameCode = data.countryNameCode[i].split(":");
                     //$('.cand').html(names.ata.districtNameCode);
                     A.one('#<portlet:namespace /><%=WorkingUnitKeys.AddEditAttributes.DISTRICTNO%>').append("<option    value='' >"+ "<%=LanguageUtil.get(pageContext,"org.oep.usermgt.portlet.select.label.districtName")%>" + "</option> ");
                     A.one('#<portlet:namespace /><%=WorkingUnitKeys.AddEditAttributes.WARDNO%>').append("<option    value='' >"+ "<%=LanguageUtil.get(pageContext,"org.oep.usermgt.portlet.select.label.wardName")%>" + "</option> ");
                    for( i in names.districtNameCode){
                           A.one('#<portlet:namespace /><%=WorkingUnitKeys.AddEditAttributes.DISTRICTNO%>').append("<option    value='"+ names.districtNameCode[i].districtCode +"' >"+ names.districtNameCode[i].districtName + "</option> "); 
                    
                    }
                }
                
            }
                    
    });
    });
    A.one("#<portlet:namespace/><%=WorkingUnitKeys.AddEditAttributes.DISTRICTNO%>").on('change',function(){
        A.io.request('<%=resourceURL%>',
                {
            
            method :'POST',
            data: {'<portlet:namespace/><%=WorkingUnitKeys.AddEditAttributes.DISTRICTNO%>' : A.one("#<portlet:namespace/><%=WorkingUnitKeys.AddEditAttributes.DISTRICTNO%>").val() ,
            		'<portlet:namespace/>selectAction' : 'districtSelected'
            		},
            dataType: 'json',
            on:{
                success: function(){
                    var names = this.get('responseData');
                    // alert(names.districtNameCode.length);
                     A.one('#<portlet:namespace /><%=WorkingUnitKeys.AddEditAttributes.WARDNO%>').empty();
                     //countryNameCode = data.countryNameCode[i].split(":");
                     //$('.cand').html(names.ata.districtNameCode);
                     A.one('#<portlet:namespace /><%=WorkingUnitKeys.AddEditAttributes.WARDNO%>').append("<option    value='' >"+ "<%=LanguageUtil.get(pageContext,"org.oep.usermgt.portlet.select.label.wardName")%>" + "</option> ");
                    for( i in names.wardNameCode){
                           A.one('#<portlet:namespace /><%=WorkingUnitKeys.AddEditAttributes.WARDNO%>').append("<option    value='"+ names.wardNameCode[i].wardCode +"' >"+ names.wardNameCode[i].wardName + "</option> "); 
                    
                    }
                }
                
            }
            
                    
    });
    });
});
</aui:script>
