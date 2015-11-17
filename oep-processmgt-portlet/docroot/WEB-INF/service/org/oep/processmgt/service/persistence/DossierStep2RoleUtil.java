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

package org.oep.processmgt.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import org.oep.processmgt.model.DossierStep2Role;

import java.util.List;

/**
 * The persistence utility for the dossier step2 role service. This utility wraps {@link DossierStep2RolePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see DossierStep2RolePersistence
 * @see DossierStep2RolePersistenceImpl
 * @generated
 */
public class DossierStep2RoleUtil {
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
	public static void clearCache(DossierStep2Role dossierStep2Role) {
		getPersistence().clearCache(dossierStep2Role);
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
	public static List<DossierStep2Role> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DossierStep2Role> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DossierStep2Role> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static DossierStep2Role update(DossierStep2Role dossierStep2Role)
		throws SystemException {
		return getPersistence().update(dossierStep2Role);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static DossierStep2Role update(DossierStep2Role dossierStep2Role,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(dossierStep2Role, serviceContext);
	}

	/**
	* Returns all the dossier step2 roles where dossierStepId = &#63;.
	*
	* @param dossierStepId the dossier step ID
	* @return the matching dossier step2 roles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.processmgt.model.DossierStep2Role> findByD(
		long dossierStepId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByD(dossierStepId);
	}

	/**
	* Returns a range of all the dossier step2 roles where dossierStepId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.processmgt.model.impl.DossierStep2RoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierStepId the dossier step ID
	* @param start the lower bound of the range of dossier step2 roles
	* @param end the upper bound of the range of dossier step2 roles (not inclusive)
	* @return the range of matching dossier step2 roles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.processmgt.model.DossierStep2Role> findByD(
		long dossierStepId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByD(dossierStepId, start, end);
	}

	/**
	* Returns an ordered range of all the dossier step2 roles where dossierStepId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.processmgt.model.impl.DossierStep2RoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierStepId the dossier step ID
	* @param start the lower bound of the range of dossier step2 roles
	* @param end the upper bound of the range of dossier step2 roles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossier step2 roles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.processmgt.model.DossierStep2Role> findByD(
		long dossierStepId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByD(dossierStepId, start, end, orderByComparator);
	}

	/**
	* Returns the first dossier step2 role in the ordered set where dossierStepId = &#63;.
	*
	* @param dossierStepId the dossier step ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier step2 role
	* @throws org.oep.processmgt.NoSuchDossierStep2RoleException if a matching dossier step2 role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.processmgt.model.DossierStep2Role findByD_First(
		long dossierStepId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.processmgt.NoSuchDossierStep2RoleException {
		return getPersistence().findByD_First(dossierStepId, orderByComparator);
	}

	/**
	* Returns the first dossier step2 role in the ordered set where dossierStepId = &#63;.
	*
	* @param dossierStepId the dossier step ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier step2 role, or <code>null</code> if a matching dossier step2 role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.processmgt.model.DossierStep2Role fetchByD_First(
		long dossierStepId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByD_First(dossierStepId, orderByComparator);
	}

	/**
	* Returns the last dossier step2 role in the ordered set where dossierStepId = &#63;.
	*
	* @param dossierStepId the dossier step ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier step2 role
	* @throws org.oep.processmgt.NoSuchDossierStep2RoleException if a matching dossier step2 role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.processmgt.model.DossierStep2Role findByD_Last(
		long dossierStepId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.processmgt.NoSuchDossierStep2RoleException {
		return getPersistence().findByD_Last(dossierStepId, orderByComparator);
	}

	/**
	* Returns the last dossier step2 role in the ordered set where dossierStepId = &#63;.
	*
	* @param dossierStepId the dossier step ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier step2 role, or <code>null</code> if a matching dossier step2 role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.processmgt.model.DossierStep2Role fetchByD_Last(
		long dossierStepId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByD_Last(dossierStepId, orderByComparator);
	}

	/**
	* Returns the dossier step2 roles before and after the current dossier step2 role in the ordered set where dossierStepId = &#63;.
	*
	* @param dossierStep2RolePK the primary key of the current dossier step2 role
	* @param dossierStepId the dossier step ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier step2 role
	* @throws org.oep.processmgt.NoSuchDossierStep2RoleException if a dossier step2 role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.processmgt.model.DossierStep2Role[] findByD_PrevAndNext(
		org.oep.processmgt.service.persistence.DossierStep2RolePK dossierStep2RolePK,
		long dossierStepId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.processmgt.NoSuchDossierStep2RoleException {
		return getPersistence()
				   .findByD_PrevAndNext(dossierStep2RolePK, dossierStepId,
			orderByComparator);
	}

	/**
	* Removes all the dossier step2 roles where dossierStepId = &#63; from the database.
	*
	* @param dossierStepId the dossier step ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByD(long dossierStepId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByD(dossierStepId);
	}

	/**
	* Returns the number of dossier step2 roles where dossierStepId = &#63;.
	*
	* @param dossierStepId the dossier step ID
	* @return the number of matching dossier step2 roles
	* @throws SystemException if a system exception occurred
	*/
	public static int countByD(long dossierStepId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByD(dossierStepId);
	}

	/**
	* Returns all the dossier step2 roles where roleId = &#63;.
	*
	* @param roleId the role ID
	* @return the matching dossier step2 roles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.processmgt.model.DossierStep2Role> findByR(
		long roleId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByR(roleId);
	}

	/**
	* Returns a range of all the dossier step2 roles where roleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.processmgt.model.impl.DossierStep2RoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param roleId the role ID
	* @param start the lower bound of the range of dossier step2 roles
	* @param end the upper bound of the range of dossier step2 roles (not inclusive)
	* @return the range of matching dossier step2 roles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.processmgt.model.DossierStep2Role> findByR(
		long roleId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByR(roleId, start, end);
	}

	/**
	* Returns an ordered range of all the dossier step2 roles where roleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.processmgt.model.impl.DossierStep2RoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param roleId the role ID
	* @param start the lower bound of the range of dossier step2 roles
	* @param end the upper bound of the range of dossier step2 roles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossier step2 roles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.processmgt.model.DossierStep2Role> findByR(
		long roleId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByR(roleId, start, end, orderByComparator);
	}

	/**
	* Returns the first dossier step2 role in the ordered set where roleId = &#63;.
	*
	* @param roleId the role ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier step2 role
	* @throws org.oep.processmgt.NoSuchDossierStep2RoleException if a matching dossier step2 role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.processmgt.model.DossierStep2Role findByR_First(
		long roleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.processmgt.NoSuchDossierStep2RoleException {
		return getPersistence().findByR_First(roleId, orderByComparator);
	}

	/**
	* Returns the first dossier step2 role in the ordered set where roleId = &#63;.
	*
	* @param roleId the role ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier step2 role, or <code>null</code> if a matching dossier step2 role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.processmgt.model.DossierStep2Role fetchByR_First(
		long roleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByR_First(roleId, orderByComparator);
	}

	/**
	* Returns the last dossier step2 role in the ordered set where roleId = &#63;.
	*
	* @param roleId the role ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier step2 role
	* @throws org.oep.processmgt.NoSuchDossierStep2RoleException if a matching dossier step2 role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.processmgt.model.DossierStep2Role findByR_Last(
		long roleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.processmgt.NoSuchDossierStep2RoleException {
		return getPersistence().findByR_Last(roleId, orderByComparator);
	}

	/**
	* Returns the last dossier step2 role in the ordered set where roleId = &#63;.
	*
	* @param roleId the role ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier step2 role, or <code>null</code> if a matching dossier step2 role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.processmgt.model.DossierStep2Role fetchByR_Last(
		long roleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByR_Last(roleId, orderByComparator);
	}

	/**
	* Returns the dossier step2 roles before and after the current dossier step2 role in the ordered set where roleId = &#63;.
	*
	* @param dossierStep2RolePK the primary key of the current dossier step2 role
	* @param roleId the role ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier step2 role
	* @throws org.oep.processmgt.NoSuchDossierStep2RoleException if a dossier step2 role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.processmgt.model.DossierStep2Role[] findByR_PrevAndNext(
		org.oep.processmgt.service.persistence.DossierStep2RolePK dossierStep2RolePK,
		long roleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.processmgt.NoSuchDossierStep2RoleException {
		return getPersistence()
				   .findByR_PrevAndNext(dossierStep2RolePK, roleId,
			orderByComparator);
	}

	/**
	* Removes all the dossier step2 roles where roleId = &#63; from the database.
	*
	* @param roleId the role ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByR(long roleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByR(roleId);
	}

	/**
	* Returns the number of dossier step2 roles where roleId = &#63;.
	*
	* @param roleId the role ID
	* @return the number of matching dossier step2 roles
	* @throws SystemException if a system exception occurred
	*/
	public static int countByR(long roleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByR(roleId);
	}

	/**
	* Caches the dossier step2 role in the entity cache if it is enabled.
	*
	* @param dossierStep2Role the dossier step2 role
	*/
	public static void cacheResult(
		org.oep.processmgt.model.DossierStep2Role dossierStep2Role) {
		getPersistence().cacheResult(dossierStep2Role);
	}

	/**
	* Caches the dossier step2 roles in the entity cache if it is enabled.
	*
	* @param dossierStep2Roles the dossier step2 roles
	*/
	public static void cacheResult(
		java.util.List<org.oep.processmgt.model.DossierStep2Role> dossierStep2Roles) {
		getPersistence().cacheResult(dossierStep2Roles);
	}

	/**
	* Creates a new dossier step2 role with the primary key. Does not add the dossier step2 role to the database.
	*
	* @param dossierStep2RolePK the primary key for the new dossier step2 role
	* @return the new dossier step2 role
	*/
	public static org.oep.processmgt.model.DossierStep2Role create(
		org.oep.processmgt.service.persistence.DossierStep2RolePK dossierStep2RolePK) {
		return getPersistence().create(dossierStep2RolePK);
	}

	/**
	* Removes the dossier step2 role with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierStep2RolePK the primary key of the dossier step2 role
	* @return the dossier step2 role that was removed
	* @throws org.oep.processmgt.NoSuchDossierStep2RoleException if a dossier step2 role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.processmgt.model.DossierStep2Role remove(
		org.oep.processmgt.service.persistence.DossierStep2RolePK dossierStep2RolePK)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.processmgt.NoSuchDossierStep2RoleException {
		return getPersistence().remove(dossierStep2RolePK);
	}

	public static org.oep.processmgt.model.DossierStep2Role updateImpl(
		org.oep.processmgt.model.DossierStep2Role dossierStep2Role)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dossierStep2Role);
	}

	/**
	* Returns the dossier step2 role with the primary key or throws a {@link org.oep.processmgt.NoSuchDossierStep2RoleException} if it could not be found.
	*
	* @param dossierStep2RolePK the primary key of the dossier step2 role
	* @return the dossier step2 role
	* @throws org.oep.processmgt.NoSuchDossierStep2RoleException if a dossier step2 role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.processmgt.model.DossierStep2Role findByPrimaryKey(
		org.oep.processmgt.service.persistence.DossierStep2RolePK dossierStep2RolePK)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.processmgt.NoSuchDossierStep2RoleException {
		return getPersistence().findByPrimaryKey(dossierStep2RolePK);
	}

	/**
	* Returns the dossier step2 role with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param dossierStep2RolePK the primary key of the dossier step2 role
	* @return the dossier step2 role, or <code>null</code> if a dossier step2 role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.processmgt.model.DossierStep2Role fetchByPrimaryKey(
		org.oep.processmgt.service.persistence.DossierStep2RolePK dossierStep2RolePK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(dossierStep2RolePK);
	}

	/**
	* Returns all the dossier step2 roles.
	*
	* @return the dossier step2 roles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.processmgt.model.DossierStep2Role> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the dossier step2 roles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.processmgt.model.impl.DossierStep2RoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossier step2 roles
	* @param end the upper bound of the range of dossier step2 roles (not inclusive)
	* @return the range of dossier step2 roles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.processmgt.model.DossierStep2Role> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the dossier step2 roles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.processmgt.model.impl.DossierStep2RoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossier step2 roles
	* @param end the upper bound of the range of dossier step2 roles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dossier step2 roles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.processmgt.model.DossierStep2Role> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dossier step2 roles from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dossier step2 roles.
	*
	* @return the number of dossier step2 roles
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DossierStep2RolePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DossierStep2RolePersistence)PortletBeanLocatorUtil.locate(org.oep.processmgt.service.ClpSerializer.getServletContextName(),
					DossierStep2RolePersistence.class.getName());

			ReferenceRegistry.registerReference(DossierStep2RoleUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DossierStep2RolePersistence persistence) {
	}

	private static DossierStep2RolePersistence _persistence;
}