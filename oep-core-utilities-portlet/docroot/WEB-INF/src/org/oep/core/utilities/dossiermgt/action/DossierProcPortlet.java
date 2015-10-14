package org.oep.core.utilities.dossiermgt.action;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import org.oep.core.dossiermgt.model.DossierProc;
import org.oep.core.dossiermgt.service.DossierProcLocalServiceUtil;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
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
 * Portlet implementation class DossierProcPortlet
 */
public class DossierProcPortlet extends MVCPortlet {
	public void addDossierProc(ActionRequest request, ActionResponse response)
            throws Exception {
		_log.info("Add new dossier proc method");
		try {
			ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();
			String dossierProcNo = ParamUtil.getString(request, "dossierProcNo");
			String name = ParamUtil.getString(request, "name");
			String enName = ParamUtil.getString(request, "enName");
			String shortName = ParamUtil.getString(request, "shortName");
			String processDescription = ParamUtil.getString(request, "processDescription");
			String methodDescription = ParamUtil.getString(request, "methodDescription");
			String dossierDescription = ParamUtil.getString(request, "dossierDescription");
			String conditionDescription = ParamUtil.getString(request, "conditionDescription");
			String durationDescription = ParamUtil.getString(request, "durationDescription");
			String actorsDescription = ParamUtil.getString(request, "actorsDescription");
			String resultsDescription = ParamUtil.getString(request, "resultsDescription");
			String recordsDescription = ParamUtil.getString(request, "recordsDescription");
			String feeDescription = ParamUtil.getString(request, "feeDescription");
			String instructionsDescription = ParamUtil.getString(request, "instructionsDescription");
			String administrationNo = ParamUtil.getString(request, "administrationNo");
			String administrationName = administrationNo;
			String domainNo = ParamUtil.getString(request, "domainNo");
			String domainName = domainNo;
			
			DateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
			Date effectDate = simpleDateFormat.parse(ParamUtil.getString(request, "effectDate"));
			Date expireDate = simpleDateFormat.parse(ParamUtil.getString(request, "expireDate"));
			
			int active = ParamUtil.getInteger(request, "active");
			
			DossierProc dossierProc = DossierProcLocalServiceUtil.addDossierProc(serviceContext.getUserId(), dossierProcNo, domainName, enName, shortName, processDescription, methodDescription, dossierDescription, conditionDescription, durationDescription, actorsDescription, resultsDescription, recordsDescription, feeDescription, instructionsDescription, administrationNo, domainNo, effectDate, expireDate, active, serviceContext);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
   
		sendRedirect(request, response);
    }
	
	public void updateDossierProc(ActionRequest actionRequest,
			ActionResponse actionResponse) throws PortletException {
		try {
			ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();
			long dossierProcId = ParamUtil.getLong(actionRequest, "dossierProcId");
			DossierProc dossierProc = DossierProcLocalServiceUtil.getDossierProc(dossierProcId);
			String dossierProcNo = ParamUtil.getString(actionRequest, "dossierProcNo");
			String name = ParamUtil.getString(actionRequest, "name");
			String enName = ParamUtil.getString(actionRequest, "enName");
			String shortName = ParamUtil.getString(actionRequest, "shortName");
			String processDescription = ParamUtil.getString(actionRequest, "processDescription");
			String methodDescription = ParamUtil.getString(actionRequest, "methodDescription");
			String dossierDescription = ParamUtil.getString(actionRequest, "dossierDescription");
			String conditionDescription = ParamUtil.getString(actionRequest, "conditionDescription");
			String durationDescription = ParamUtil.getString(actionRequest, "durationDescription");
			String actorsDescription = ParamUtil.getString(actionRequest, "actorsDescription");
			String resultsDescription = ParamUtil.getString(actionRequest, "resultsDescription");
			String recordsDescription = ParamUtil.getString(actionRequest, "recordsDescription");
			String feeDescription = ParamUtil.getString(actionRequest, "feeDescription");
			String instructionsDescription = ParamUtil.getString(actionRequest, "instructionsDescription");
			String administrationNo = ParamUtil.getString(actionRequest, "administrationNo");
			String administrationName = administrationNo;
			String domainNo = ParamUtil.getString(actionRequest, "domainNo");
			String domainName = domainNo;
			
			DateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
			Date effectDate = simpleDateFormat.parse(ParamUtil.getString(actionRequest, "effectDate"));
			Date expireDate = simpleDateFormat.parse(ParamUtil.getString(actionRequest, "expireDate"));
			
			int active = ParamUtil.getInteger(actionRequest, "active");

			DossierProcLocalServiceUtil.updateDossierProc(dossierProcId, dossierProcNo, domainName, enName, shortName, processDescription, methodDescription, dossierDescription, conditionDescription, durationDescription, actorsDescription, resultsDescription, recordsDescription, feeDescription, instructionsDescription, administrationNo, domainNo, effectDate, expireDate, active, serviceContext);
			/*
			actionResponse.setRenderParameter("mvcPath",
					"/html/dossiermgt/portlet/dossierproc/list_dossierproc.jsp");
			*/
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteDossierProc(ActionRequest actionRequest,
			ActionResponse actionResponse) throws PortletException {
		try {
			long dossierProcId = ParamUtil.getLong(actionRequest, "dossierProcId");
			DossierProcLocalServiceUtil.removeDossierProc(dossierProcId);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
    private static Log _log = LogFactoryUtil.getLog(DossierProcPortlet.class);
}
