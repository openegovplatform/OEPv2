package org.oep.core.utilities.processmgt.action;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import org.oep.core.processmgt.model.DossierProcess;
import org.oep.core.processmgt.service.DossierProcessLocalServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextThreadLocal;
import com.liferay.portlet.documentlibrary.model.DLFileEntry;
import com.liferay.portlet.documentlibrary.service.DLFileEntryLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class DossierProcessPortlet
 */
public class DossierProcessPortlet extends MVCPortlet {
 
	public void addDossierProcess(ActionRequest actionRequest,
			ActionResponse actionResponse) throws PortletException {
		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();
		try {
			long dossierProcId = ParamUtil.getLong(actionRequest, "dossierProcId");
			String govAgencyId = ParamUtil.getString(actionRequest, "govAgencyId");
			String govAgencyName = ParamUtil.getString(actionRequest, "govAgencyName");
			long startStepTransitionId = 0;
			int daysDuration = ParamUtil.getInteger(actionRequest, "daysDuration");
			int fee = ParamUtil.getInteger(actionRequest, "fee");
			
			DossierProcess dossierProcess = DossierProcessLocalServiceUtil.addDossierProcess(dossierProcId, govAgencyId, govAgencyName, startStepTransitionId, daysDuration, fee, serviceContext);
			
			actionResponse.setRenderParameter("mvcPath",
					"/html/processmgt/portlet/dossierprocess/edit_dossierprocess.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void updateDossierProcess(ActionRequest actionRequest,
			ActionResponse actionResponse) throws PortletException {
		try {
			ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();
			long dossierProcessId = ParamUtil.getLong(actionRequest, "dossierProcessId");
			long dossierProcId = ParamUtil.getLong(actionRequest, "dossierProcId");
			String govAgencyId = ParamUtil.getString(actionRequest, "govAgencyId");
			String govAgencyName = ParamUtil.getString(actionRequest, "govAgencyName");
			long startStepTransitionId = 0;
			int daysDuration = ParamUtil.getInteger(actionRequest, "daysDuration");
			int fee = ParamUtil.getInteger(actionRequest, "fee");
			DossierProcess dossierProcess = DossierProcessLocalServiceUtil.getDossierProcess(dossierProcessId);
			dossierProcess = DossierProcessLocalServiceUtil.updateDossierProcess(dossierProcessId, dossierProcId, govAgencyId, govAgencyName, startStepTransitionId, daysDuration, fee, serviceContext);					
			actionResponse.setRenderParameter("mvcPath",
					"/html/processmgt/portlet/dossierprocess/list_dossierprocess.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteDossierProcess(ActionRequest actionRequest,
			ActionResponse actionResponse) throws PortletException {
		try {
			long dossierProcessId = ParamUtil.getLong(actionRequest, "dossierProcessId");
			DossierProcessLocalServiceUtil.removeDossierProcess(dossierProcessId);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static Log _log = LogFactoryUtil.getLog(DossierProcessPortlet.class);
		
}
