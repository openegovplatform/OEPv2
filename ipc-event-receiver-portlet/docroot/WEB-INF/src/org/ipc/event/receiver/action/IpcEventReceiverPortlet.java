package org.ipc.event.receiver.action;

import javax.portlet.EventRequest;
import javax.portlet.EventResponse;
import javax.portlet.ProcessEvent;
import javax.portlet.Event;

import org.event.core.Employee;

import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class IpcEventReceiverPortlet
 */
public class IpcEventReceiverPortlet extends MVCPortlet {
 
    @ProcessEvent(qname = "{http://proliferay.com/events}ipc-text")
    public void myEvent(EventRequest request, EventResponse response) {
        Event event = request.getEvent();
        //Get data from the event
        //String sampleText = (String) event.getValue();
        Employee employee = (Employee)event.getValue();
        
        //Set the text in response to display in UI
        response.setRenderParameter("sampleText", employee.name);
    }
    
}
