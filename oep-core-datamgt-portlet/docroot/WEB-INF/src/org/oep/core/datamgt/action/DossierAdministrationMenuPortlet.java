package org.oep.core.datamgt.action;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.ProcessAction;
import javax.xml.namespace.QName;

import org.oep.core.datamgt.dictionary.model.DictData;
import org.oep.core.datamgt.dictionary.service.DictDataLocalServiceUtil;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class DossierAdministrationMenuPortlet
 */
public class DossierAdministrationMenuPortlet extends MVCPortlet {
 
    @ProcessAction(name="processEvent")
    public void processEvent(ActionRequest request, ActionResponse response) {
         
        /**
         * Get sample text from UI
         */
        
    	long dictDataId = ParamUtil.getLong(request, "dictDataId");
    	
    	System.out.println("Dict data id: " + dictDataId);
    	
    	DictData dictData;
		try {
			dictData = DictDataLocalServiceUtil.getDictData(dictDataId);
	        QName qName = new QName("http://org.oep.com/events", "ipc-domainno");
	        response.setEvent(qName, dictData.getDictDataId());
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        /**
         * Refer portlet.xml
         */
    }
    
}
