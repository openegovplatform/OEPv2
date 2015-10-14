package org.oep.core.utilities.dossiermgt.action;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import org.oep.core.dossiermgt.model.EbPartnerShip;
import org.oep.core.dossiermgt.service.EbPartnerShipLocalServiceUtil;
import org.oep.core.utilities.dossiermgt.EbPartnerShipKeys;

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
 * Portlet implementation class EbPartnerShipPortlet
 */
public class EbPartnerShipPortlet extends MVCPortlet {
 
	public void addEbPartnerShip(ActionRequest actionRequest,
			ActionResponse actionResponse) throws PortletException {
		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();
		try {
			String name = ParamUtil.getString(actionRequest, "name");
			String cpaId = ParamUtil.getString(actionRequest, "cpaId");
			String service = ParamUtil.getString(actionRequest, "service");
			
			EbPartnerShip ebPartnerShip = EbPartnerShipLocalServiceUtil.addEbPartnerShip(name, cpaId, service, serviceContext);
			
			/*
			actionResponse.setRenderParameter("ebPartnerShipId", String.valueOf(ebPartnerShip.getEbPartnerShipId()));
			actionResponse.setRenderParameter("mvcPath",
					"/html/dossiermgt/portlet/ebpartnership/edit_ebpartnership.jsp");
			*/
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void updateEbPartnerShip(ActionRequest actionRequest,
			ActionResponse actionResponse) throws PortletException {
		try {
			ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();
			long ebPartnerShipId = ParamUtil.getLong(actionRequest, "ebPartnerShipId");
			
			String name = ParamUtil.getString(actionRequest, "name");
			String cpaId = ParamUtil.getString(actionRequest, "cpaId");
			String service = ParamUtil.getString(actionRequest, "service");

			EbPartnerShip ebPartnerShip = EbPartnerShipLocalServiceUtil.getEbPartnerShip(ebPartnerShipId);
			if (ebPartnerShip != null) {
				ebPartnerShip = EbPartnerShipLocalServiceUtil.updateEbPartnerShip(ebPartnerShipId, name, cpaId, service, serviceContext);										
			} else {
				_log.error("Could not find eb partner ship.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteEbPartnerShip(ActionRequest actionRequest,
			ActionResponse actionResponse) throws PortletException {
		try {
			long ebPartnerShipId = ParamUtil.getLong(actionRequest, "ebPartnerShipId");
			EbPartnerShipLocalServiceUtil.removeEbPartnerShip(ebPartnerShipId);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static Log _log = LogFactoryUtil.getLog(EbPartnerShipPortlet.class);
	
}
