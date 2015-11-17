package org.oep.dossiermgt.action;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.EventRequest;
import javax.portlet.EventResponse;
import javax.portlet.ProcessEvent;
import javax.portlet.Event;

import org.oep.datamgt.model.DictData;
import org.oep.datamgt.service.DictDataLocalServiceUtil;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class DossierProcPortlet
 */
public class DossierProcPortlet extends MVCPortlet {
 
    @ProcessEvent(qname = "{http://org.oep.com/events}ipc-domainno")
    public void myDomainNoEvent(EventRequest request, EventResponse response) {
        Event event = request.getEvent();
        //Get data from the event
        long dictDataId = Long.parseLong(event.getValue().toString());
        System.out.println("Dict data id: " + dictDataId);
        //Set the text in response to display in UI
        try {
			DictData dictData = DictDataLocalServiceUtil.getDictData(dictDataId);
			response.setRenderParameter("domainNo", dictData.getDataCode());
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        response.setRenderParameter("dictDataDomainId", String.valueOf(dictDataId));
        
    }
    
    @ProcessEvent(qname = "{http://org.oep.com/events}ipc-administrationno")
    public void myAdministrationNoEvent(EventRequest request, EventResponse response) {
        Event event = request.getEvent();
        //Get data from the event
        long dictDataId = Long.parseLong(event.getValue().toString());
        System.out.println("Dict data id: " + dictDataId);
        //Set the text in response to display in UI
        try {
			DictData dictData = DictDataLocalServiceUtil.getDictData(dictDataId);
			response.setRenderParameter("administrationNo", dictData.getDataCode());
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        response.setRenderParameter("dictDataAdministrationId", String.valueOf(dictDataId));
        
    }
    
    public void viewDossierProc(ActionRequest request, ActionResponse response) {
    	response.setRenderParameter("dossierProcId", ParamUtil.getString(request, "dossierProcId"));
    	response.setRenderParameter("redirectPage", ParamUtil.getString(request, "redirectPage"));
    	System.out.println("Page: " + ParamUtil.getString(request, "redirectPage"));
    	response.setRenderParameter("mvcPath", "/html/dossiermgt/portlet/dossierproc/dossierproc_detail.jsp");
    }
}
