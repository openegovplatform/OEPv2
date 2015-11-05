<%@ include file="/html/eservice/init.jsp"%>
<%@ page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@ page import="org.oep.datamgt.service.DictDataLocalServiceUtil"%>
<%@ page import="org.oep.datamgt.model.DictData"%>
<%@page import="org.oep.core.dossiermgt.model.DossierProc"%>
<%@page
	import="org.oep.core.dossiermgt.service.DossierProcLocalServiceUtil"%>
<%
	long userId = themeDisplay.getUserId();
	DossierProc dossierProc = null;
	long dossierProcId = ParamUtil.getLong(request, "dossierProcId");
    if (dossierProcId != 0){
    	dossierProc = DossierProcLocalServiceUtil.getDossierProc(dossierProcId);
    }
%>
<c:if test="<%=dossierProcId != 0%>">
	<h4>
		<b><%=dossierProc.getName()%></b>
	</h4>
</c:if>
<table>
	<tr>
		<td width="60%">&nbsp; 
			<c:if test="<%=!themeDisplay.isSignedIn()%>">

	
			</c:if>
		</td>
		<td width="60%" align="right"><c:if test="<%=!themeDisplay.isSignedIn()%>">

				<aui:button cssClass="pull-right" name="login-popup"
					class="btn primary" id="login-popup"
					value="org.oep.eservice.dangkytructuyen.button.dangnhap">
				</aui:button>
	
			<aui:button cssClass="pull-right" name="dangkytaikhoan"
					class="btn primary" id="dangkytaikhoan"
					value="org.oep.eservice.dangkytructuyen.button.dangkytaikhoan">
				</aui:button>

			</c:if></td>
	</tr>
	<tr>
		<td width="60%"><aui:select name="domainNo" label="&nbsp;">
				<aui:option value=""><%=LanguageUtil
							.get(pageContext,
									"org.oep.dossiermgt.portlet.dossierproc.label.link.coquanxulythutucc")%></aui:option>
				<%
					ServiceContext serviceContext = ServiceContextThreadLocal
													.getServiceContext();

											List<DictData> lstDomainData = DictDataLocalServiceUtil
													.getByCollectionNameDataLevel(
															"OEP_DOSSIER_ADMINISTRATION", 1, serviceContext);

											//DictDataLocalServiceUtil.getByCollectionName("OEP_DOSSIER_DOMAIN", serviceContext);
											for (DictData data : lstDomainData) {
				%>
				<aui:option value="<%=data.getDictDataId()%>"><%=data.getTitle()%></aui:option>
				<%
					}
				%>
			</aui:select></td>
		<td align="right"><aui:button cssClass="pull-right"
				name="dangkytaikhoan" id="dangkytaikhoan"
				value="org.oep.eservice.dangkytructuyen.button.khaibaohosomoi">
			</aui:button></td>
	</tr>
</table>

<liferay-portlet:renderURL portletName="58" var="loginPortletURL"
	windowState="<%=LiferayWindowState.POP_UP.toString()%>">
</liferay-portlet:renderURL>
<liferay-ui:panel-container extended="<%=true%>"
	id="huongDanPanelContainer" persistState="<%=true%>">
	<liferay-ui:panel collapsible="<%=true%>" extended="<%=true%>"
		id="huongDanPanel" persistState="<%=true%>"
		title="org.oep.eservice.dangkytructuyen.title.huongdanthuchienthutuc">
		<c:if test="<%=dossierProcId != 0%>">
			<%=dossierProc.getInstructionsDescription()%>
		</c:if>

	</liferay-ui:panel>
</liferay-ui:panel-container>
<aui:script>
	function <portlet:namespace/>popup(url) {

		YUI().use('aui-base', 'liferay-util-window', function(A) {

			// Open the add a link modal dialog
			Liferay.Util.openWindow({

				title : 'Add a Link',
				uri : url,
				dialog : {
					modal : true,
					centered : true,
					width : 500,
					height : 400
				},
				id : '<portlet:namespace/>addLinkDialog',
			});

			// Provide a function to close modal dialogs in the parent page
			Liferay.provide(window, 'closePopup', function(popupId) {

				var dialog = Liferay.Util.getWindow(popupId);
				dialog.destroy();
			}, [ 'aui-base', 'aui-dialog', 'aui-dialog-iframe' ]);

		}).render();

	}
</aui:script>