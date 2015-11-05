package org.oep.eservice.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.EventRequest;
import javax.portlet.EventResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletRequest;
import javax.portlet.PortletSession;
import javax.portlet.PortletURL;
import javax.portlet.ProcessEvent;
import javax.portlet.Event;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.xml.namespace.QName;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.service.LayoutLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.PortletURLFactoryUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class DossierProcPortlet
 */
public class DossierProcPortlet extends MVCPortlet {

	@Override
	public void render(RenderRequest request, RenderResponse response)
			throws PortletException, IOException {
		String data = request.getParameter("dossierProcId");
		String data1 = ParamUtil.getString(request, "jspPage", "");
		// renderRequest.getAttribute(â€œstandardâ€�).
		System.out.println(" DossierProcPortlet goi ham  " + data + "        "
				+ data1);
		super.render(request, response);
	}

	@ProcessEvent(qname = "{http://org.oep.com/events}ipc-dossierdangky")
	public void dossierDangkyEvent(ActionRequest request,
			ActionResponse response) {

		/**
		 * Get sample text from UI
		 */

		String dossierProcId = ParamUtil
				.getString(request, "dossierProcId", "");
		QName qName = new QName("http://org.oep.com/events",
				"ipc-dossierdangky");
		response.setRenderParameter("tabs1",
				ParamUtil.getString(request, "tabs1"));
		response.setEvent(qName, dossierProcId);
	}

	@ProcessEvent(qname = "{http://org.oep.com/events}ipc-domainno")
	public void myDomainNoEvent(EventRequest request, EventResponse response) {
		Event event = request.getEvent();
		String domainNo = event.getValue().toString();
		response.setRenderParameter("domainNo", domainNo);

	}

	@ProcessEvent(qname = "{http://org.oep.com/events}ipc-administrationno")
	public void myAdministrationNoEvent(EventRequest request,
			EventResponse response) {
		Event event = request.getEvent();
		// Get data from the event
		String administrationNo = event.getValue().toString();
		response.setRenderParameter("administrationNo", administrationNo);

	}

	public void viewDossierProc(ActionRequest request, ActionResponse response) {
		response.setRenderParameter("dossierProcId",
				ParamUtil.getString(request, "dossierProcId"));
		response.setRenderParameter("redirectPage",
				ParamUtil.getString(request, "redirectPage"));

		response.setRenderParameter("mvcPath",
				"/html/eservice/portlet/dossierproc_detail.jsp");
	}

	public void viewReDossierProc(ActionRequest request, ActionResponse response) {
		response.setRenderParameter("dossierProcId",
				ParamUtil.getString(request, "dossierProcId"));
		System.out.println("Page: "
				+ ParamUtil.getString(request, "dossierProcId"));

	}

	public void registerDossierProcOnline(ActionRequest request,
			ActionResponse response) {
		response.setRenderParameter("dossierProcId",
				ParamUtil.getString(request, "dossierProcId"));
		response.setRenderParameter("redirectPage",
				ParamUtil.getString(request, "redirectPage"));
		response.setRenderParameter("mvcPath",
				"/html/eservice/portlet/dangkytructuyen.jsp");
	}

	public void viewListDossierProc(ActionRequest request,
			ActionResponse response) {
		response.setRenderParameter("administrationNo",
				ParamUtil.getString(request, "administrationNo"));
		response.setRenderParameter("domainNo",
				ParamUtil.getString(request, "domainNo"));
		response.setRenderParameter("name",
				ParamUtil.getString(request, "administrationNo"));
		response.setRenderParameter("mvcPath",
				"/html/eservice/portlet/danhsachthutuc.jsp");
	}

	@Override
	public void serveResource(ResourceRequest resourceRequest,
			ResourceResponse resourceResponse) throws IOException,
			PortletException {
		System.out.println("=====serveResource=======");
		String domainNo = ParamUtil.getString(resourceRequest, "domainNo");
		String administrationNo = ParamUtil.getString(resourceRequest,
				"administrationNo");
		PrintWriter pw = resourceResponse.getWriter();
		JSONObject juser = JSONFactoryUtil.createJSONObject();

		juser.put("domainNo", domainNo);
		juser.put("administrationNo", administrationNo);
		pw.println(juser.toString());
		PortletSession session = resourceRequest.getPortletSession();
		// PortletMode portletMode= resourceRequest.getPortletMode();
		// portletMode.s
		session.setAttribute("domainNo", domainNo);
		System.out.println(juser.toString());
	}

	public void dossierDangkyAction(ActionRequest request,
			ActionResponse response) throws PortletException, IOException {
		ThemeDisplay themeDisplay = (ThemeDisplay) request
				.getAttribute(WebKeys.THEME_DISPLAY);
		String pageName = "/dichvucongtructuyen";
		String portletName = "oepeserviceregisteronline_WAR_oepeserviceportlet";
		String dossierProcId = ParamUtil
				.getString(request, "dossierProcId", "");
		long plid = 0L;
		try {
			plid = LayoutLocalServiceUtil.getFriendlyURLLayout(
					themeDisplay.getScopeGroupId(), false, pageName).getPlid();
		} catch (Exception e) {
			e.printStackTrace();
		}

		PortletURL redirectURL = PortletURLFactoryUtil.create(
				PortalUtil.getHttpServletRequest(request), portletName, plid,
				PortletRequest.RENDER_PHASE);
		redirectURL.setParameter("dossierProcId", dossierProcId); 
		redirectURL.setParameter("data", "This Value Comes From Welcome Page");
		response.sendRedirect(redirectURL.toString());

	}

}
