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

package org.oep.core.dossiermgt.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for EbPartnerShip. This utility wraps
 * {@link org.oep.core.dossiermgt.service.impl.EbPartnerShipLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author trungdk
 * @see EbPartnerShipLocalService
 * @see org.oep.core.dossiermgt.service.base.EbPartnerShipLocalServiceBaseImpl
 * @see org.oep.core.dossiermgt.service.impl.EbPartnerShipLocalServiceImpl
 * @generated
 */
public class EbPartnerShipLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.oep.core.dossiermgt.service.impl.EbPartnerShipLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the eb partner ship to the database. Also notifies the appropriate model listeners.
	*
	* @param ebPartnerShip the eb partner ship
	* @return the eb partner ship that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.EbPartnerShip addEbPartnerShip(
		org.oep.core.dossiermgt.model.EbPartnerShip ebPartnerShip)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addEbPartnerShip(ebPartnerShip);
	}

	/**
	* Creates a new eb partner ship with the primary key. Does not add the eb partner ship to the database.
	*
	* @param ebPartnerShipId the primary key for the new eb partner ship
	* @return the new eb partner ship
	*/
	public static org.oep.core.dossiermgt.model.EbPartnerShip createEbPartnerShip(
		long ebPartnerShipId) {
		return getService().createEbPartnerShip(ebPartnerShipId);
	}

	/**
	* Deletes the eb partner ship with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ebPartnerShipId the primary key of the eb partner ship
	* @return the eb partner ship that was removed
	* @throws PortalException if a eb partner ship with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.EbPartnerShip deleteEbPartnerShip(
		long ebPartnerShipId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteEbPartnerShip(ebPartnerShipId);
	}

	/**
	* Deletes the eb partner ship from the database. Also notifies the appropriate model listeners.
	*
	* @param ebPartnerShip the eb partner ship
	* @return the eb partner ship that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.EbPartnerShip deleteEbPartnerShip(
		org.oep.core.dossiermgt.model.EbPartnerShip ebPartnerShip)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteEbPartnerShip(ebPartnerShip);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.EbPartnerShipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.EbPartnerShipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static org.oep.core.dossiermgt.model.EbPartnerShip fetchEbPartnerShip(
		long ebPartnerShipId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchEbPartnerShip(ebPartnerShipId);
	}

	/**
	* Returns the eb partner ship with the primary key.
	*
	* @param ebPartnerShipId the primary key of the eb partner ship
	* @return the eb partner ship
	* @throws PortalException if a eb partner ship with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.EbPartnerShip getEbPartnerShip(
		long ebPartnerShipId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getEbPartnerShip(ebPartnerShipId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the eb partner ships.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.EbPartnerShipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of eb partner ships
	* @param end the upper bound of the range of eb partner ships (not inclusive)
	* @return the range of eb partner ships
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.EbPartnerShip> getEbPartnerShips(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getEbPartnerShips(start, end);
	}

	/**
	* Returns the number of eb partner ships.
	*
	* @return the number of eb partner ships
	* @throws SystemException if a system exception occurred
	*/
	public static int getEbPartnerShipsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getEbPartnerShipsCount();
	}

	/**
	* Updates the eb partner ship in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param ebPartnerShip the eb partner ship
	* @return the eb partner ship that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.EbPartnerShip updateEbPartnerShip(
		org.oep.core.dossiermgt.model.EbPartnerShip ebPartnerShip)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateEbPartnerShip(ebPartnerShip);
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
	* Add eb partner ship
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    Create new
	*
	* @param
	* @return: new eb partner ship
	*/
	public static org.oep.core.dossiermgt.model.EbPartnerShip addEbPartnerShip(
		java.lang.String name, java.lang.String cpaId,
		java.lang.String service,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addEbPartnerShip(name, cpaId, service, serviceContext);
	}

	public static org.oep.core.dossiermgt.model.EbPartnerShip updateEbPartnerShip(
		long id, java.lang.String name, java.lang.String cpaId,
		java.lang.String service,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateEbPartnerShip(id, name, cpaId, service, serviceContext);
	}

	public static void updateEbPartnerShipResources(
		org.oep.core.dossiermgt.model.EbPartnerShip ebPartnerShip,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.updateEbPartnerShipResources(ebPartnerShip, groupPermissions,
			guestPermissions, serviceContext);
	}

	public static void removeEbPartnerShip(
		org.oep.core.dossiermgt.model.EbPartnerShip ebPartnerShip)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().removeEbPartnerShip(ebPartnerShip);
	}

	public static void removeEbPartnerShip(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().removeEbPartnerShip(id);
	}

	public static void addEbPartnerShipResources(
		org.oep.core.dossiermgt.model.EbPartnerShip ebPartnerShip,
		boolean addGroupPermission, boolean addGuestPermission,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addEbPartnerShipResources(ebPartnerShip, addGroupPermission,
			addGuestPermission, serviceContext);
	}

	public static void addEbPartnerShipResources(
		org.oep.core.dossiermgt.model.EbPartnerShip ebPartnerShip,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addEbPartnerShipResources(ebPartnerShip, groupPermissions,
			guestPermissions, serviceContext);
	}

	public static void addEbPartnerShipResources(long id,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addEbPartnerShipResources(id, groupPermissions, guestPermissions,
			serviceContext);
	}

	public static java.util.List<org.oep.core.dossiermgt.model.EbPartnerShip> findByLikeName(
		java.lang.String name, int startIndex, int endIndex,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByLikeName(name, startIndex, endIndex, serviceContext);
	}

	public static int countByLikeName(java.lang.String name,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countByLikeName(name, serviceContext);
	}

	public static java.util.List<org.oep.core.dossiermgt.model.EbPartnerShip> findByGroupLikeName(
		java.lang.String name, int startIndex, int endIndex,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByGroupLikeName(name, startIndex, endIndex,
			serviceContext);
	}

	public static int countByGroupLikeName(java.lang.String name,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countByGroupLikeName(name, serviceContext);
	}

	public static void clearService() {
		_service = null;
	}

	public static EbPartnerShipLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					EbPartnerShipLocalService.class.getName());

			if (invokableLocalService instanceof EbPartnerShipLocalService) {
				_service = (EbPartnerShipLocalService)invokableLocalService;
			}
			else {
				_service = new EbPartnerShipLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(EbPartnerShipLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(EbPartnerShipLocalService service) {
	}

	private static EbPartnerShipLocalService _service;
}