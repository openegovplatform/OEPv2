package org.ipc.example.action;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.ProcessAction;
import javax.xml.namespace.QName;

import org.event.core.Employee;

import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class IpcEventGeneratorPortlet
 */
public class IpcEventGeneratorPortlet extends MVCPortlet {
 
    @ProcessAction(name="processEvent")
    public void processEvent(ActionRequest request, ActionResponse response) {
         
        /**
         * Get sample text from UI
         */
         
        String sampleText = ParamUtil.getString(request, "sampleText","");
        Employee employee = new Employee();
        //employee.name = "Trung";
        employee.name = sampleText;
        employee.address = "Dong Anh";
        /**
         * Refer portlet.xml
         */
        QName qName = new QName("http://proliferay.com/events", "ipc-text");
        response.setEvent(qName, employee);
    }
    
}
