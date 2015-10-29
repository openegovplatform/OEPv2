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

package org.oep.core.processmgt.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import org.oep.core.processmgt.model.DossierProc2Process;

import java.util.List;

/**
 * The persistence utility for the dossier proc2 process service. This utility wraps {@link DossierProc2ProcessPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see DossierProc2ProcessPersistence
 * @see DossierProc2ProcessPersistenceImpl
 * @generated
 */
public class DossierProc2ProcessUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(DossierProc2Process dossierProc2Process) {
		getPersistence().clearCache(dossierProc2Process);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<DossierProc2Process> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DossierProc2Process> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DossierProc2Process> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static DossierProc2Process update(
		DossierProc2Process dossierProc2Process) throws SystemException {
		return getPersistence().update(dossierProc2Process);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static DossierProc2Process update(
		DossierProc2Process dossierProc2Process, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(dossierProc2Process, serviceContext);
	}

	/**
	* Caches the dossier proc2 process in the entity cache if it is enabled.
	*
	* @param dossierProc2Process the dossier proc2 process
	*/
	public static void cacheResult(
		org.oep.core.processmgt.model.DossierProc2Process dossierProc2Process) {
		getPersistence().cacheResult(dossierProc2Process);
	}

	/**
	* Caches the dossier proc2 processes in the entity cache if it is enabled.
	*
	* @param dossierProc2Processes the dossier proc2 processes
	*/
	public static void cacheResult(
		java.util.List<org.oep.core.processmgt.model.DossierProc2Process> dossierProc2Processes) {
		getPersistence().cacheResult(dossierProc2Processes);
	}

	/**
	* Creates a new dossier proc2 process with the primary key. Does not add the dossier proc2 process to the database.
	*
	* @param dossierProc2ProcessId the primary key for the new dossier proc2 process
	* @return the new dossier proc2 process
	*/
	public static org.oep.core.processmgt.model.DossierProc2Process create(
		long dossierProc2ProcessId) {
		return getPersistence().create(dossierProc2ProcessId);
	}

	/**
	* Removes the dossier proc2 process with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierProc2ProcessId the primary key of the dossier proc2 process
	* @return the dossier proc2 process that was removed
	* @throws org.oep.core.processmgt.NoSuchDossierProc2ProcessException if a dossier proc2 process with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.processmgt.model.DossierProc2Process remove(
		long dossierProc2ProcessId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.processmgt.NoSuchDossierProc2ProcessException {
		return getPersistence().remove(dossierProc2ProcessId);
	}

	public static org.oep.core.processmgt.model.DossierProc2Process updateImpl(
		org.oep.core.processmgt.model.DossierProc2Process dossierProc2Process)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dossierProc2Process);
	}

	/**
	* Returns the dossier proc2 process with the primary key or throws a {@link org.oep.core.processmgt.NoSuchDossierProc2ProcessException} if it could not be found.
	*
	* @param dossierProc2ProcessId the primary key of the dossier proc2 process
	* @return the dossier proc2 process
	* @throws org.oep.core.processmgt.NoSuchDossierProc2ProcessException if a dossier proc2 process with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.processmgt.model.DossierProc2Process findByPrimaryKey(
		long dossierProc2ProcessId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.processmgt.NoSuchDossierProc2ProcessException {
		return getPersistence().findByPrimaryKey(dossierProc2ProcessId);
	}

	/**
	* Returns the dossier proc2 process with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param dossierProc2ProcessId the primary key of the dossier proc2 process
	* @return the dossier proc2 process, or <code>null</code> if a dossier proc2 process with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.processmgt.model.DossierProc2Process fetchByPrimaryKey(
		long dossierProc2ProcessId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(dossierProc2ProcessId);
	}

	/**
	* Returns all the dossier proc2 processes.
	*
	* @return the dossier proc2 processes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.processmgt.model.DossierProc2Process> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the dossier proc2 processes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.DossierProc2ProcessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossier proc2 processes
	* @param end the upper bound of the range of dossier proc2 processes (not inclusive)
	* @return the range of dossier proc2 processes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.processmgt.model.DossierProc2Process> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the dossier proc2 processes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.DossierProc2ProcessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossier proc2 processes
	* @param end the upper bound of the range of dossier proc2 processes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dossier proc2 processes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.processmgt.model.DossierProc2Process> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dossier proc2 processes from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dossier proc2 processes.
	*
	* @return the number of dossier proc2 processes
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DossierProc2ProcessPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DossierProc2ProcessPersistence)PortletBeanLocatorUtil.locate(org.oep.core.processmgt.service.ClpSerializer.getServletContextName(),
					DossierProc2ProcessPersistence.class.getName());

			ReferenceRegistry.registerReference(DossierProc2ProcessUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DossierProc2ProcessPersistence persistence) {
	}

	private static DossierProc2ProcessPersistence _persistence;
}