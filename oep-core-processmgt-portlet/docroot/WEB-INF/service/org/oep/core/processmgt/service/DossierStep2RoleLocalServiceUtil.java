/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package org.oep.core.processmgt.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for DossierStep2Role. This utility wraps
 * {@link org.oep.core.processmgt.service.impl.DossierStep2RoleLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author trungdk
 * @see DossierStep2RoleLocalService
 * @see org.oep.core.processmgt.service.base.DossierStep2RoleLocalServiceBaseImpl
 * @see org.oep.core.processmgt.service.impl.DossierStep2RoleLocalServiceImpl
 * @generated
 */
public class DossierStep2RoleLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.oep.core.processmgt.service.impl.DossierStep2RoleLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the dossier step2 role to the database. Also notifies the appropriate model listeners.
	*
	* @param dossierStep2Role the dossier step2 role
	* @return the dossier step2 role that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.processmgt.model.DossierStep2Role addDossierStep2Role(
		org.oep.core.processmgt.model.DossierStep2Role dossierStep2Role)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addDossierStep2Role(dossierStep2Role);
	}

	/**
	* Creates a new dossier step2 role with the primary key. Does not add the dossier step2 role to the database.
	*
	* @param dossierStep2RolePK the primary key for the new dossier step2 role
	* @return the new dossier step2 role
	*/
	public static org.oep.core.processmgt.model.DossierStep2Role createDossierStep2Role(
		org.oep.core.processmgt.service.persistence.DossierStep2RolePK dossierStep2RolePK) {
		return getService().createDossierStep2Role(dossierStep2RolePK);
	}

	/**
	* Deletes the dossier step2 role with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierStep2RolePK the primary key of the dossier step2 role
	* @return the dossier step2 role that was removed
	* @throws PortalException if a dossier step2 role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.processmgt.model.DossierStep2Role deleteDossierStep2Role(
		org.oep.core.processmgt.service.persistence.DossierStep2RolePK dossierStep2RolePK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDossierStep2Role(dossierStep2RolePK);
	}

	/**
	* Deletes the dossier step2 role from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierStep2Role the dossier step2 role
	* @return the dossier step2 role that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.processmgt.model.DossierStep2Role deleteDossierStep2Role(
		org.oep.core.processmgt.model.DossierStep2Role dossierStep2Role)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDossierStep2Role(dossierStep2Role);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.DossierStep2RoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.DossierStep2RoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static org.oep.core.processmgt.model.DossierStep2Role fetchDossierStep2Role(
		org.oep.core.processmgt.service.persistence.DossierStep2RolePK dossierStep2RolePK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchDossierStep2Role(dossierStep2RolePK);
	}

	/**
	* Returns the dossier step2 role with the primary key.
	*
	* @param dossierStep2RolePK the primary key of the dossier step2 role
	* @return the dossier step2 role
	* @throws PortalException if a dossier step2 role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.processmgt.model.DossierStep2Role getDossierStep2Role(
		org.oep.core.processmgt.service.persistence.DossierStep2RolePK dossierStep2RolePK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDossierStep2Role(dossierStep2RolePK);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dossier step2 roles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.DossierStep2RoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossier step2 roles
	* @param end the upper bound of the range of dossier step2 roles (not inclusive)
	* @return the range of dossier step2 roles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.processmgt.model.DossierStep2Role> getDossierStep2Roles(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDossierStep2Roles(start, end);
	}

	/**
	* Returns the number of dossier step2 roles.
	*
	* @return the number of dossier step2 roles
	* @throws SystemException if a system exception occurred
	*/
	public static int getDossierStep2RolesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDossierStep2RolesCount();
	}

	/**
	* Updates the dossier step2 role in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dossierStep2Role the dossier step2 role
	* @return the dossier step2 role that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.processmgt.model.DossierStep2Role updateDossierStep2Role(
		org.oep.core.processmgt.model.DossierStep2Role dossierStep2Role)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDossierStep2Role(dossierStep2Role);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	/**
	* ThÃƒÂªm quan hÃ¡Â»â€¡ giÃ¡Â»Â¯a bÃ†Â°Ã¡Â»â€ºc xÃ¡Â»Â­ lÃƒÂ½ vÃ¡Â»â€ºi vai trÃƒÂ²
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param dossierStepId mÃƒÂ£ bÃ†Â°Ã¡Â»â€ºc xÃ¡Â»Â­ lÃƒÂ½ hÃ¡Â»â€œ sÃ†Â¡
	* @param roleId mÃƒÂ£ vai trÃƒÂ²
	* @return: quan hÃ¡Â»â€¡ giÃ¡Â»Â¯a bÃ†Â°Ã¡Â»â€ºc xÃ¡Â»Â­ lÃƒÂ½ hÃ¡Â»â€œ sÃ†Â¡ vÃ¡Â»â€ºi vai trÃƒÂ²
	*/
	public static org.oep.core.processmgt.model.DossierStep2Role addDossierStep2Role(
		long dossierStepId, long roleId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addDossierStep2Role(dossierStepId, roleId, serviceContext);
	}

	public static void removeDossierStep2Role(
		org.oep.core.processmgt.model.DossierStep2Role dossierStep2Role)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().removeDossierStep2Role(dossierStep2Role);
	}

	public static void removeDossierStep2Role(long dossierStepId, long roleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().removeDossierStep2Role(dossierStepId, roleId);
	}

	public static org.oep.core.processmgt.model.DossierStep2Role getDossierStep2Role(
		long dossierStepId, long roleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDossierStep2Role(dossierStepId, roleId);
	}

	public static void clearService() {
		_service = null;
	}

	public static DossierStep2RoleLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DossierStep2RoleLocalService.class.getName());

			if (invokableLocalService instanceof DossierStep2RoleLocalService) {
				_service = (DossierStep2RoleLocalService)invokableLocalService;
			}
			else {
				_service = new DossierStep2RoleLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(DossierStep2RoleLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(DossierStep2RoleLocalService service) {
	}

	private static DossierStep2RoleLocalService _service;
}