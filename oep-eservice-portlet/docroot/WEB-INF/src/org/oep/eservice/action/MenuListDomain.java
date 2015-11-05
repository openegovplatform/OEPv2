package org.oep.eservice.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import javax.portlet.PortletSession;
import javax.portlet.ProcessEvent;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.xml.namespace.QName;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.ParamUtil;

import com.liferay.util.bridges.mvc.MVCPortlet;

public class MenuListDomain extends MVCPortlet {
	@Override
	public void render(RenderRequest request, RenderResponse response)
			throws PortletException, IOException {
		// _log.info(" This is render method of ActionURLByPortletTagPortlet");
		super.render(request, response);
	}

	@ProcessEvent(qname = "{http://org.oep.com/events}ipc-domainno")
	public void myDomainNoEvent(ActionRequest request, ActionResponse response) {

		/**
		 * Get sample text from UI
		 */
		String domainno = ParamUtil.getString(request, "domainNo", "");
		QName qName = new QName("http://org.oep.com/events", "ipc-domainno");
		System.out.println("Page: " + ParamUtil.getString(request, "tabs1"));
		response.setRenderParameter("tabs1",
				ParamUtil.getString(request, "tabs1"));
		response.setEvent(qName, domainno);
	}

	public void myAdministrationNoEvent(ActionRequest request,
			ActionResponse response) {

		/**
		 * Get sample text from UI
		 */
		String administrationNo = ParamUtil.getString(request,
				"administrationNo", "");
		QName qName = new QName("http://org.oep.com/events",
				"ipc-administrationno");
		String tg = ParamUtil.getString(request, "tabs1");
		if (tg == null || tg.equals("")) {
			tg = "one";
		}
		response.setRenderParameter("tabs1", tg);
		response.setEvent(qName, administrationNo);
	}

	public void selectTabs(ActionRequest request, ActionResponse response) {
		response.setRenderParameter("tabs1",
				ParamUtil.getString(request, "tabs1"));
		// response.setRenderParameter("redirectPage",
		// ParamUtil.getString(request, "redirectPage"));
		System.out.println("Page: " + ParamUtil.getString(request, "tabs1"));
		response.setRenderParameter("mvcPath",
				"/html/eservice/portlet/menulinhvucthutuc.jsp");
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
		session.setAttribute("domainNo", domainNo);
	}
}
