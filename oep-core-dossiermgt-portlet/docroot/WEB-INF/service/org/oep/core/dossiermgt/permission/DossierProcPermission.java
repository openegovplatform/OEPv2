package org.oep.core.dossiermgt.service.permission;

import org.oep.core.dossiermgt.model.DossierProc;
import org.oep.core.dossiermgt.service.DossierProcLocalServiceUtil;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.staging.permission.StagingPermissionUtil;
import com.liferay.portal.kernel.workflow.permission.WorkflowPermissionUtil;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.security.permission.ActionKeys;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portal.util.PortletKeys;

public class DossierProcPermission {	
	public static void check(
			PermissionChecker permissionChecker, DossierProc proc,
			String actionId)
		throws PortalException {

		if (!contains(permissionChecker, proc, actionId)) {
			throw new PrincipalException();
		}
	}

	public static void check(
			PermissionChecker permissionChecker, long dossierProcId, String actionId)
		throws PortalException, SystemException {

		if (!contains(permissionChecker, dossierProcId, actionId)) {
			throw new PrincipalException();
		}
	}

	public static boolean contains(
		PermissionChecker permissionChecker, DossierProc proc,
		String actionId) {

		if (permissionChecker.hasOwnerPermission(
				proc.getCompanyId(), DossierProc.class.getName(),
				proc.getDossierProcId(), proc.getUserId(), actionId)) {

			return true;
		}

		return permissionChecker.hasPermission(
			proc.getGroupId(), DossierProc.class.getName(), proc.getDossierProcId(),
			actionId);
	}

	public static boolean contains(
			PermissionChecker permissionChecker, long dossierProcId, String actionId)
		throws PortalException, SystemException {

		DossierProc proc = DossierProcLocalServiceUtil.getDossierProc(dossierProcId);

		return contains(permissionChecker, proc, actionId);
	}
	
}