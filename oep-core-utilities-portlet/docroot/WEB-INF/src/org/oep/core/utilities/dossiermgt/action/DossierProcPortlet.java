package org.oep.core.utilities.dossiermgt.action;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class DossierProcPortlet
 */
public class DossierProcPortlet extends MVCPortlet {
	public void addDossierProc(ActionRequest request, ActionResponse response)
            throws Exception {
		_log.info("Add new dossier proc method");
		_updateDossierProc(request);
        sendRedirect(request, response);
    }
	
	private void _updateDossierProc(ActionRequest request) throws PortalException, SystemException {
		long dossierProcId = ParamUtil.getLong(request, "dossierProcId");
		String name = ParamUtil.getString(request, "name");
		_log.info("Name:" + name);
	}
	
    private static Log _log = LogFactoryUtil.getLog(DossierProcPortlet.class);
}
