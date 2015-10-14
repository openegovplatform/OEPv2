package org.oep.core.dossiermgt.action;

import javax.portlet.EventRequest;
import javax.portlet.EventResponse;
import javax.portlet.ProcessEvent;
import javax.portlet.Event;

import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class DossierProcPortlet
 */
public class DossierProcPortlet extends MVCPortlet {
 
    @ProcessEvent(qname = "{http://org.oep.com/events}ipc-domainno")
    public void myEvent(EventRequest request, EventResponse response) {
        Event event = request.getEvent();
        //Get data from the event
        long dictDataId = (long) event.getValue();
        System.out.println("Dict data id: " + dictDataId);
        //Set the text in response to display in UI
        response.setRenderParameter("dictDataId", String.valueOf(dictDataId));
    }
    
}
