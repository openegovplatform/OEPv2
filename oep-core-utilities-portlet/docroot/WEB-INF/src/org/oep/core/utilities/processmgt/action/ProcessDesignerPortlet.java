package org.oep.core.utilities.processmgt.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.json.JSONArray;
import org.json.JSONObject;

import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class ProcessDesignerPortlet
 */
public class ProcessDesignerPortlet extends MVCPortlet {
 
	@Override
    public void serveResource(ResourceRequest resourceRequest,
            ResourceResponse resourceResponse) throws IOException,
            PortletException {
        System.out.println("#############AJAX CALL####################");
        String diagram = ParamUtil.getString(resourceRequest, "diagram");
        
        JSONObject diagramJSON = new JSONObject(diagram);
        //System.out.println(diagram);
        System.out.println(diagramJSON.get("nodes"));
        JSONArray arrDiagram = diagramJSON.getJSONArray("nodes");
        for (int i = 0; i < arrDiagram.length(); i++) {
        	
        }
        resourceResponse.setContentType("text/html");
        PrintWriter writer = resourceResponse.getWriter();
        writer.print(diagram);
        writer.write("Hello");
        writer.flush();
        writer.close();
        super.serveResource(resourceRequest, resourceResponse);
    }
	
}
