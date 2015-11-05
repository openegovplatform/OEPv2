<%@ include file="/html/eservice/init.jsp"%>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<%@ page import="org.oep.datamgt.service.DictDataLocalServiceUtil"%>
<%@ page import="org.oep.datamgt.model.DictData"%>
<%@ page
	import="org.oep.core.dossiermgt.service.DossierProcLocalServiceUtil"%>
<%@ page import="org.oep.core.dossiermgt.model.DossierProc"%>
<%@ page import="java.util.ArrayList"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayPortletMode"%>
<%
    long dangkytructuyenplid = 12706;
	String dangkytructuyenpage = "oepcoreeserviceregisteronline_WAR_oepcoreeserviceportlet";
	ServiceContext serviceContext = ServiceContextThreadLocal
			.getServiceContext();
	List<DictData> lstDomainData = DictDataLocalServiceUtil
			.getByCollectionNameDataLevel("OEP_DOSSIER_ADMINISTRATION",
					1, serviceContext);

	int cur = ParamUtil.getInteger(request, "CURRENT_PAGE", 1);
	int delta = ParamUtil.getInteger(request, "DELTA", 5);

	PortletURL iteratorUrl = renderResponse.createRenderURL();
	iteratorUrl.setParameter("name",
			String.valueOf(ParamUtil.getString(request, "name", "")));
	iteratorUrl.setParameter("administrationNo", String
			.valueOf(ParamUtil.getString(request, "administrationNo",
					"")));
	iteratorUrl.setParameter("domainNo", String.valueOf(ParamUtil
			.getString(request, "domainNo", "")));
	SearchContainer searchContainer = new SearchContainer(
			renderRequest, null, null,
			SearchContainer.DEFAULT_CUR_PARAM, cur, delta, iteratorUrl,
			null, null);

	String name = ParamUtil.getString(request, "name", "");
	String administrationNo = ParamUtil.getString(request,
			"administrationNo", "");
	String domainNo = ParamUtil.getString(request, "domainNo", "");

	System.out.println("Name:" + name);
	System.out.println("Administration No:" + administrationNo);
	System.out.println("Domain no:" + domainNo);

	int total = DossierProcLocalServiceUtil
			.countByGroupCustomCondition(name, administrationNo,
					domainNo, null, null, 1, serviceContext);
	searchContainer.setTotal(total);
	List<DossierProc> datas = new ArrayList<DossierProc>();
	if (total > 0) {
		int startIndex = searchContainer.getStart();
		int endIndex = searchContainer.getEnd();
		datas = DossierProcLocalServiceUtil.findByGroupCustomCondition(
				name, administrationNo, domainNo, null, null, 1,
				startIndex, endIndex, serviceContext);
		searchContainer.setResults(datas);
	}

	//List<DictData>
%>
<portlet:renderURL var="redirectURL">
	<portlet:param name="DELTA"
		value="<%= String.valueOf(ParamUtil.getInteger(request, \"DELTA\", 5)) %>" />
	<portlet:param name="CURRENT_PAGE"
		value="<%= String.valueOf(ParamUtil.getInteger(request, \"CURRENT_PAGE\", 1)) %>" />
</portlet:renderURL>
<portlet:renderURL var="searchDossierProc">
	<portlet:param name="DELTA"
		value="<%= String.valueOf(ParamUtil.getInteger(request, \"DELTA\", 5)) %>" />
	<portlet:param name="CURRENT_PAGE"
		value="<%= String.valueOf(ParamUtil.getInteger(request, \"CURRENT_PAGE\", 1)) %>" />
</portlet:renderURL>
<liferay-portlet:renderURL varImpl="eserviceSearchURL">
	<portlet:param name="mvcPath"
		value="/html/eservice/portlet/danhsachthutuc.jsp" />
</liferay-portlet:renderURL>
<aui:form action="<%=eserviceSearchURL%>" method="get"
	name="dossierProcForm">
	<aui:row>
		<aui:column columnWidth="50">
			<aui:select name="administrationNo" label="">
				<aui:option value="" selected="false"><%=LanguageUtil
										.get(pageContext,
												"org.oep.eservice.selection.coaquanquanlythutuc")%></aui:option>
				<%
					for (DictData data : lstDomainData) {
										if (data.getDataCode().equals(administrationNo)) {
								
									
				%>
				<aui:option value="<%=data.getDataCode()%>" selected="<%=true%>"><%=data.getTitle()%></aui:option>
				<%
					} else {
				%>
				<aui:option value="<%=data.getDataCode() %>" selected="<%=false%>"><%=data.getTitle()%></aui:option>
				<%
					}
									}
				%>
			</aui:select>
		</aui:column>
		<aui:column columnWidth="50">
			<aui:select name="domainNo" label="">
				<aui:option value=""><%=LanguageUtil
										.get(pageContext,
												"org.oep.eservice.selection.linhvucthutuc")%></aui:option>
				<%
					String[] tg = {
											"",
											"",
											"&nbsp;&nbsp;&nbsp;",
											"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;",
											"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;",
											"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" };
									List<DictData> lstData = DictDataLocalServiceUtil
											.getByCollectionNameTree(
													"OEP_DOSSIER_DOMAIN", 1,
													serviceContext);

									//DictDataLocalServiceUtil.getByCollectionName("OEP_DOSSIER_DOMAIN", serviceContext);
									for (DictData data1 : lstData) {
										if (data1.getDataCode().equals(domainNo)) {
											
				%>
				<aui:option value="<%=data1.getDataCode()%>" selected="<%=true%>"> <%=tg[data1.getDataLevel()]%><%=data1.getTitle()%></aui:option>
				<%
					} else {
				%>
				<aui:option value="<%=data1.getDataCode()%>" selected="<%=false%>"><%=tg[data1.getDataLevel()]%><%=data1.getTitle()%></aui:option>
				<%
					}
									}
				%>
			</aui:select>
		</aui:column>
		<aui:column columnWidth="50">
			<aui:input type="text" name="name" label=""></aui:input>
		</aui:column>
		<aui:button name="login-popup" id="login-popup"
			value="org.oep.eservice.button.timkiem">
		</aui:button>

	</aui:row>
	<aui:row>
		<aui:column columnWidth="100">
			<table class="table">
				<thead>
					<tr>
						<th><%=LanguageUtil
								.get(pageContext,
										"org.oep.dossiermgt.portlet.dossierproc.label.table.header.stt") %></th>
						<th><%=LanguageUtil
								.get(pageContext,
										"org.oep.dossiermgt.portlet.dossierproc.label.table.header.capcoquanquanly") %></th>
						<th><%=LanguageUtil
								.get(pageContext,
										"org.oep.dossiermgt.portlet.dossierproc.label.table.header.linhvucthutuc")%></th>
						<th><%=LanguageUtil
								.get(pageContext,
										"org.oep.dossiermgt.portlet.dossierproc.label.table.header.name")%></th>
						<th><%=LanguageUtil
								.get(pageContext,
										"org.oep.dossiermgt.portlet.dossierproc.label.table.header.thaotac")%></th>
					</tr>
				</thead>
				<tbody>
					<%
						if (datas != null && datas.size() > 0) {
										int index = 1;
										for (DossierProc data : datas) {
					%>
					<portlet:actionURL var="viewUrl" name="viewDossierProc">
						<portlet:param name="jspPage"
							value="/html/portlet/eservice/dossierproc_detail.jsp" />
						<portlet:param name="dossierProcId"
							value="<%=String.valueOf(data
											.getDossierProcId())%>" />
						<portlet:param name="redirectPage" value="<%=redirectURL%>" />
					</portlet:actionURL>

					<portlet:renderURL var="renderAction">
						<portlet:param name="pageParam" value="dichvucongtructuyen"></portlet:param>
						<portlet:param name="jspPage"
							value="/html/eservice/portlet/dangkytructuyen.jsp" />
						<portlet:param name="dossierProcId"
							value="<%=String.valueOf(data
											.getDossierProcId())%>" />
					</portlet:renderURL>
					<portlet:actionURL var="dangnhapUrl" name="dossierDangkyAction">
						<portlet:param name="jspPage"
							value="/html/eservice/portlet/dossierproc_detail.jsp" />
						<portlet:param name="dossierProcId"
							value="<%=String.valueOf(data
											.getDossierProcId())%>" />
					</portlet:actionURL>
					<liferay-portlet:renderURL 
						portletName="<%=dangkytructuyenpage%>" 
						var ="dangKyUrl" plid="<%=dangkytructuyenplid%>" >
						<liferay-portlet:param name="dossierProcId"
							value="<%=String.valueOf(data
											.getDossierProcId())%>" />
						<portlet:param name="jspPage"
							value="/html/eservice/portlet/dangkytructuyen.jsp" />
							<liferay-portlet:param name="demo" value="Value demo"/>
					</liferay-portlet:renderURL>
					<tr>
						<td style="text-align: center"><%=(searchContainer.getStart() + (index++))%></td>
						<td style="text-align: left"><%=data.getAdministrationName() %></td>
						<td style="text-align: left"><%=data.getDomainName() %></td>
						<td style="text-align: left"><a href="<%=viewUrl%>"><%=data.getName()%></a></td>
						<td style="text-align: left"><a href="<%=dangnhapUrl%>"> <%=LanguageUtil
								.get(pageContext,
										"org.oep.dossiermgt.portlet.dossierproc.label.link.dangkytructuyen")%>
						</a></td>
					</tr>
					<%
						}
					%>
					<%
						}
					%>
				</tbody>
			</table>
		</aui:column>
	</aui:row>
</aui:form>


<script>

Liferay.on(
'getUserData',function(event) {
	var domainNo = event.userData.domainNo;4
	var administrationNo = event.userData.administrationNo;
	var plid = themeDisplay.getPlid(); 
	        var nsShort = ("<portlet:namespace/>".substr(1)).substr(0, "<portlet:namespace/>".length-2); 
	        var portletId = "#p_p_id<portlet:namespace/>"; 
	        var loadId = "p_load<portlet:namespace/>"; 
	        
	        var url = "/c/portal/render_portlet?p_l_id=" + plid+ "&p_p_id="+nsShort+"&p_p_action=0&p_p_state=normal&p_p_mode=view";
	        if (domainNo != null){
	        	url =  url +  '&_'	+ '<%=themeDisplay.getPortletDisplay().getId()%>'
					+ '_domainNo=' + domainNo; 
	        }
	        if (administrationNo != null){
	        	url =  url +  '&_'	+ '<%=themeDisplay.getPortletDisplay().getId()%>'
				+ '_administrationNo=' + administrationNo; 
	        }
	        //		alert(url);
	       //
	       //jQuery(portletId).empty();
	       //jQuery(portletId).empty().append('<div class="loading-animation" id="'+loadId+'"></div>'); 
	       jQuery(portletId).load(url); 
	
	
});
</script>