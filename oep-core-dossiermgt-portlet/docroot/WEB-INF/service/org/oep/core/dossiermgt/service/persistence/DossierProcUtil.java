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

package org.oep.core.dossiermgt.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import org.oep.core.dossiermgt.model.DossierProc;

import java.util.List;

/**
 * The persistence utility for the dossier proc service. This utility wraps {@link DossierProcPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see DossierProcPersistence
 * @see DossierProcPersistenceImpl
 * @generated
 */
public class DossierProcUtil {
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
	public static void clearCache(DossierProc dossierProc) {
		getPersistence().clearCache(dossierProc);
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
	public static List<DossierProc> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DossierProc> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DossierProc> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static DossierProc update(DossierProc dossierProc)
		throws SystemException {
		return getPersistence().update(dossierProc);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static DossierProc update(DossierProc dossierProc,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(dossierProc, serviceContext);
	}

	/**
	* Returns all the dossier procs where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByC(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC(companyId);
	}

	/**
	* Returns a range of all the dossier procs where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of dossier procs
	* @param end the upper bound of the range of dossier procs (not inclusive)
	* @return the range of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByC(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC(companyId, start, end);
	}

	/**
	* Returns an ordered range of all the dossier procs where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of dossier procs
	* @param end the upper bound of the range of dossier procs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByC(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC(companyId, start, end, orderByComparator);
	}

	/**
	* Returns the first dossier proc in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc findByC_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException {
		return getPersistence().findByC_First(companyId, orderByComparator);
	}

	/**
	* Returns the first dossier proc in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc fetchByC_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByC_First(companyId, orderByComparator);
	}

	/**
	* Returns the last dossier proc in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc findByC_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException {
		return getPersistence().findByC_Last(companyId, orderByComparator);
	}

	/**
	* Returns the last dossier proc in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc fetchByC_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByC_Last(companyId, orderByComparator);
	}

	/**
	* Returns the dossier procs before and after the current dossier proc in the ordered set where companyId = &#63;.
	*
	* @param dossierProcId the primary key of the current dossier proc
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a dossier proc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc[] findByC_PrevAndNext(
		long dossierProcId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException {
		return getPersistence()
				   .findByC_PrevAndNext(dossierProcId, companyId,
			orderByComparator);
	}

	/**
	* Removes all the dossier procs where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC(companyId);
	}

	/**
	* Returns the number of dossier procs where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC(companyId);
	}

	/**
	* Returns all the dossier procs where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByC_G(
		long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_G(companyId, groupId);
	}

	/**
	* Returns a range of all the dossier procs where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of dossier procs
	* @param end the upper bound of the range of dossier procs (not inclusive)
	* @return the range of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByC_G(
		long companyId, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_G(companyId, groupId, start, end);
	}

	/**
	* Returns an ordered range of all the dossier procs where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of dossier procs
	* @param end the upper bound of the range of dossier procs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByC_G(
		long companyId, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_G(companyId, groupId, start, end, orderByComparator);
	}

	/**
	* Returns the first dossier proc in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc findByC_G_First(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException {
		return getPersistence()
				   .findByC_G_First(companyId, groupId, orderByComparator);
	}

	/**
	* Returns the first dossier proc in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc fetchByC_G_First(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_G_First(companyId, groupId, orderByComparator);
	}

	/**
	* Returns the last dossier proc in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc findByC_G_Last(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException {
		return getPersistence()
				   .findByC_G_Last(companyId, groupId, orderByComparator);
	}

	/**
	* Returns the last dossier proc in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc fetchByC_G_Last(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_G_Last(companyId, groupId, orderByComparator);
	}

	/**
	* Returns the dossier procs before and after the current dossier proc in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param dossierProcId the primary key of the current dossier proc
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a dossier proc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc[] findByC_G_PrevAndNext(
		long dossierProcId, long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException {
		return getPersistence()
				   .findByC_G_PrevAndNext(dossierProcId, companyId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the dossier procs where companyId = &#63; and groupId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_G(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC_G(companyId, groupId);
	}

	/**
	* Returns the number of dossier procs where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the number of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_G(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_G(companyId, groupId);
	}

	/**
	* Returns all the dossier procs where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @return the matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByC_G_U(
		long companyId, long groupId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_G_U(companyId, groupId, userId);
	}

	/**
	* Returns a range of all the dossier procs where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param start the lower bound of the range of dossier procs
	* @param end the upper bound of the range of dossier procs (not inclusive)
	* @return the range of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByC_G_U(
		long companyId, long groupId, long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_G_U(companyId, groupId, userId, start, end);
	}

	/**
	* Returns an ordered range of all the dossier procs where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param start the lower bound of the range of dossier procs
	* @param end the upper bound of the range of dossier procs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByC_G_U(
		long companyId, long groupId, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_G_U(companyId, groupId, userId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first dossier proc in the ordered set where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc findByC_G_U_First(
		long companyId, long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException {
		return getPersistence()
				   .findByC_G_U_First(companyId, groupId, userId,
			orderByComparator);
	}

	/**
	* Returns the first dossier proc in the ordered set where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc fetchByC_G_U_First(
		long companyId, long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_G_U_First(companyId, groupId, userId,
			orderByComparator);
	}

	/**
	* Returns the last dossier proc in the ordered set where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc findByC_G_U_Last(
		long companyId, long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException {
		return getPersistence()
				   .findByC_G_U_Last(companyId, groupId, userId,
			orderByComparator);
	}

	/**
	* Returns the last dossier proc in the ordered set where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc fetchByC_G_U_Last(
		long companyId, long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_G_U_Last(companyId, groupId, userId,
			orderByComparator);
	}

	/**
	* Returns the dossier procs before and after the current dossier proc in the ordered set where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param dossierProcId the primary key of the current dossier proc
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a dossier proc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc[] findByC_G_U_PrevAndNext(
		long dossierProcId, long companyId, long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException {
		return getPersistence()
				   .findByC_G_U_PrevAndNext(dossierProcId, companyId, groupId,
			userId, orderByComparator);
	}

	/**
	* Removes all the dossier procs where companyId = &#63; and groupId = &#63; and userId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_G_U(long companyId, long groupId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC_G_U(companyId, groupId, userId);
	}

	/**
	* Returns the number of dossier procs where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @return the number of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_G_U(long companyId, long groupId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_G_U(companyId, groupId, userId);
	}

	/**
	* Returns the dossier proc where companyId = &#63; and groupId = &#63; and dossierProcNo = &#63; or throws a {@link org.oep.core.dossiermgt.NoSuchDossierProcException} if it could not be found.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param dossierProcNo the dossier proc no
	* @return the matching dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc findByC_G_DPN(
		long companyId, long groupId, java.lang.String dossierProcNo)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException {
		return getPersistence().findByC_G_DPN(companyId, groupId, dossierProcNo);
	}

	/**
	* Returns the dossier proc where companyId = &#63; and groupId = &#63; and dossierProcNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param dossierProcNo the dossier proc no
	* @return the matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc fetchByC_G_DPN(
		long companyId, long groupId, java.lang.String dossierProcNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByC_G_DPN(companyId, groupId, dossierProcNo);
	}

	/**
	* Returns the dossier proc where companyId = &#63; and groupId = &#63; and dossierProcNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param dossierProcNo the dossier proc no
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc fetchByC_G_DPN(
		long companyId, long groupId, java.lang.String dossierProcNo,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_G_DPN(companyId, groupId, dossierProcNo,
			retrieveFromCache);
	}

	/**
	* Removes the dossier proc where companyId = &#63; and groupId = &#63; and dossierProcNo = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param dossierProcNo the dossier proc no
	* @return the dossier proc that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc removeByC_G_DPN(
		long companyId, long groupId, java.lang.String dossierProcNo)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException {
		return getPersistence()
				   .removeByC_G_DPN(companyId, groupId, dossierProcNo);
	}

	/**
	* Returns the number of dossier procs where companyId = &#63; and groupId = &#63; and dossierProcNo = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param dossierProcNo the dossier proc no
	* @return the number of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_G_DPN(long companyId, long groupId,
		java.lang.String dossierProcNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_G_DPN(companyId, groupId, dossierProcNo);
	}

	/**
	* Returns all the dossier procs where companyId = &#63; and administrationNo = &#63;.
	*
	* @param companyId the company ID
	* @param administrationNo the administration no
	* @return the matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByC_ANO(
		long companyId, java.lang.String administrationNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_ANO(companyId, administrationNo);
	}

	/**
	* Returns a range of all the dossier procs where companyId = &#63; and administrationNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param administrationNo the administration no
	* @param start the lower bound of the range of dossier procs
	* @param end the upper bound of the range of dossier procs (not inclusive)
	* @return the range of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByC_ANO(
		long companyId, java.lang.String administrationNo, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_ANO(companyId, administrationNo, start, end);
	}

	/**
	* Returns an ordered range of all the dossier procs where companyId = &#63; and administrationNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param administrationNo the administration no
	* @param start the lower bound of the range of dossier procs
	* @param end the upper bound of the range of dossier procs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByC_ANO(
		long companyId, java.lang.String administrationNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_ANO(companyId, administrationNo, start, end,
			orderByComparator);
	}

	/**
	* Returns the first dossier proc in the ordered set where companyId = &#63; and administrationNo = &#63;.
	*
	* @param companyId the company ID
	* @param administrationNo the administration no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc findByC_ANO_First(
		long companyId, java.lang.String administrationNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException {
		return getPersistence()
				   .findByC_ANO_First(companyId, administrationNo,
			orderByComparator);
	}

	/**
	* Returns the first dossier proc in the ordered set where companyId = &#63; and administrationNo = &#63;.
	*
	* @param companyId the company ID
	* @param administrationNo the administration no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc fetchByC_ANO_First(
		long companyId, java.lang.String administrationNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_ANO_First(companyId, administrationNo,
			orderByComparator);
	}

	/**
	* Returns the last dossier proc in the ordered set where companyId = &#63; and administrationNo = &#63;.
	*
	* @param companyId the company ID
	* @param administrationNo the administration no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc findByC_ANO_Last(
		long companyId, java.lang.String administrationNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException {
		return getPersistence()
				   .findByC_ANO_Last(companyId, administrationNo,
			orderByComparator);
	}

	/**
	* Returns the last dossier proc in the ordered set where companyId = &#63; and administrationNo = &#63;.
	*
	* @param companyId the company ID
	* @param administrationNo the administration no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc fetchByC_ANO_Last(
		long companyId, java.lang.String administrationNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_ANO_Last(companyId, administrationNo,
			orderByComparator);
	}

	/**
	* Returns the dossier procs before and after the current dossier proc in the ordered set where companyId = &#63; and administrationNo = &#63;.
	*
	* @param dossierProcId the primary key of the current dossier proc
	* @param companyId the company ID
	* @param administrationNo the administration no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a dossier proc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc[] findByC_ANO_PrevAndNext(
		long dossierProcId, long companyId, java.lang.String administrationNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException {
		return getPersistence()
				   .findByC_ANO_PrevAndNext(dossierProcId, companyId,
			administrationNo, orderByComparator);
	}

	/**
	* Removes all the dossier procs where companyId = &#63; and administrationNo = &#63; from the database.
	*
	* @param companyId the company ID
	* @param administrationNo the administration no
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_ANO(long companyId,
		java.lang.String administrationNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC_ANO(companyId, administrationNo);
	}

	/**
	* Returns the number of dossier procs where companyId = &#63; and administrationNo = &#63;.
	*
	* @param companyId the company ID
	* @param administrationNo the administration no
	* @return the number of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_ANO(long companyId,
		java.lang.String administrationNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_ANO(companyId, administrationNo);
	}

	/**
	* Returns all the dossier procs where companyId = &#63; and groupId = &#63; and administrationNo = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param administrationNo the administration no
	* @return the matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByC_G_ANO(
		long companyId, long groupId, java.lang.String administrationNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_G_ANO(companyId, groupId, administrationNo);
	}

	/**
	* Returns a range of all the dossier procs where companyId = &#63; and groupId = &#63; and administrationNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param administrationNo the administration no
	* @param start the lower bound of the range of dossier procs
	* @param end the upper bound of the range of dossier procs (not inclusive)
	* @return the range of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByC_G_ANO(
		long companyId, long groupId, java.lang.String administrationNo,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_G_ANO(companyId, groupId, administrationNo, start,
			end);
	}

	/**
	* Returns an ordered range of all the dossier procs where companyId = &#63; and groupId = &#63; and administrationNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param administrationNo the administration no
	* @param start the lower bound of the range of dossier procs
	* @param end the upper bound of the range of dossier procs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByC_G_ANO(
		long companyId, long groupId, java.lang.String administrationNo,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_G_ANO(companyId, groupId, administrationNo, start,
			end, orderByComparator);
	}

	/**
	* Returns the first dossier proc in the ordered set where companyId = &#63; and groupId = &#63; and administrationNo = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param administrationNo the administration no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc findByC_G_ANO_First(
		long companyId, long groupId, java.lang.String administrationNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException {
		return getPersistence()
				   .findByC_G_ANO_First(companyId, groupId, administrationNo,
			orderByComparator);
	}

	/**
	* Returns the first dossier proc in the ordered set where companyId = &#63; and groupId = &#63; and administrationNo = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param administrationNo the administration no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc fetchByC_G_ANO_First(
		long companyId, long groupId, java.lang.String administrationNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_G_ANO_First(companyId, groupId, administrationNo,
			orderByComparator);
	}

	/**
	* Returns the last dossier proc in the ordered set where companyId = &#63; and groupId = &#63; and administrationNo = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param administrationNo the administration no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc findByC_G_ANO_Last(
		long companyId, long groupId, java.lang.String administrationNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException {
		return getPersistence()
				   .findByC_G_ANO_Last(companyId, groupId, administrationNo,
			orderByComparator);
	}

	/**
	* Returns the last dossier proc in the ordered set where companyId = &#63; and groupId = &#63; and administrationNo = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param administrationNo the administration no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc fetchByC_G_ANO_Last(
		long companyId, long groupId, java.lang.String administrationNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_G_ANO_Last(companyId, groupId, administrationNo,
			orderByComparator);
	}

	/**
	* Returns the dossier procs before and after the current dossier proc in the ordered set where companyId = &#63; and groupId = &#63; and administrationNo = &#63;.
	*
	* @param dossierProcId the primary key of the current dossier proc
	* @param companyId the company ID
	* @param groupId the group ID
	* @param administrationNo the administration no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a dossier proc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc[] findByC_G_ANO_PrevAndNext(
		long dossierProcId, long companyId, long groupId,
		java.lang.String administrationNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException {
		return getPersistence()
				   .findByC_G_ANO_PrevAndNext(dossierProcId, companyId,
			groupId, administrationNo, orderByComparator);
	}

	/**
	* Removes all the dossier procs where companyId = &#63; and groupId = &#63; and administrationNo = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param administrationNo the administration no
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_G_ANO(long companyId, long groupId,
		java.lang.String administrationNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC_G_ANO(companyId, groupId, administrationNo);
	}

	/**
	* Returns the number of dossier procs where companyId = &#63; and groupId = &#63; and administrationNo = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param administrationNo the administration no
	* @return the number of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_G_ANO(long companyId, long groupId,
		java.lang.String administrationNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByC_G_ANO(companyId, groupId, administrationNo);
	}

	/**
	* Returns all the dossier procs where companyId = &#63; and domainNo = &#63;.
	*
	* @param companyId the company ID
	* @param domainNo the domain no
	* @return the matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByC_DNO(
		long companyId, java.lang.String domainNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_DNO(companyId, domainNo);
	}

	/**
	* Returns a range of all the dossier procs where companyId = &#63; and domainNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param domainNo the domain no
	* @param start the lower bound of the range of dossier procs
	* @param end the upper bound of the range of dossier procs (not inclusive)
	* @return the range of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByC_DNO(
		long companyId, java.lang.String domainNo, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_DNO(companyId, domainNo, start, end);
	}

	/**
	* Returns an ordered range of all the dossier procs where companyId = &#63; and domainNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param domainNo the domain no
	* @param start the lower bound of the range of dossier procs
	* @param end the upper bound of the range of dossier procs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByC_DNO(
		long companyId, java.lang.String domainNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_DNO(companyId, domainNo, start, end,
			orderByComparator);
	}

	/**
	* Returns the first dossier proc in the ordered set where companyId = &#63; and domainNo = &#63;.
	*
	* @param companyId the company ID
	* @param domainNo the domain no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc findByC_DNO_First(
		long companyId, java.lang.String domainNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException {
		return getPersistence()
				   .findByC_DNO_First(companyId, domainNo, orderByComparator);
	}

	/**
	* Returns the first dossier proc in the ordered set where companyId = &#63; and domainNo = &#63;.
	*
	* @param companyId the company ID
	* @param domainNo the domain no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc fetchByC_DNO_First(
		long companyId, java.lang.String domainNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_DNO_First(companyId, domainNo, orderByComparator);
	}

	/**
	* Returns the last dossier proc in the ordered set where companyId = &#63; and domainNo = &#63;.
	*
	* @param companyId the company ID
	* @param domainNo the domain no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc findByC_DNO_Last(
		long companyId, java.lang.String domainNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException {
		return getPersistence()
				   .findByC_DNO_Last(companyId, domainNo, orderByComparator);
	}

	/**
	* Returns the last dossier proc in the ordered set where companyId = &#63; and domainNo = &#63;.
	*
	* @param companyId the company ID
	* @param domainNo the domain no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc fetchByC_DNO_Last(
		long companyId, java.lang.String domainNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_DNO_Last(companyId, domainNo, orderByComparator);
	}

	/**
	* Returns the dossier procs before and after the current dossier proc in the ordered set where companyId = &#63; and domainNo = &#63;.
	*
	* @param dossierProcId the primary key of the current dossier proc
	* @param companyId the company ID
	* @param domainNo the domain no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a dossier proc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc[] findByC_DNO_PrevAndNext(
		long dossierProcId, long companyId, java.lang.String domainNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException {
		return getPersistence()
				   .findByC_DNO_PrevAndNext(dossierProcId, companyId, domainNo,
			orderByComparator);
	}

	/**
	* Removes all the dossier procs where companyId = &#63; and domainNo = &#63; from the database.
	*
	* @param companyId the company ID
	* @param domainNo the domain no
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_DNO(long companyId, java.lang.String domainNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC_DNO(companyId, domainNo);
	}

	/**
	* Returns the number of dossier procs where companyId = &#63; and domainNo = &#63;.
	*
	* @param companyId the company ID
	* @param domainNo the domain no
	* @return the number of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_DNO(long companyId, java.lang.String domainNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_DNO(companyId, domainNo);
	}

	/**
	* Returns all the dossier procs where companyId = &#63; and groupId = &#63; and domainNo = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param domainNo the domain no
	* @return the matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByC_G_DNO(
		long companyId, long groupId, java.lang.String domainNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_G_DNO(companyId, groupId, domainNo);
	}

	/**
	* Returns a range of all the dossier procs where companyId = &#63; and groupId = &#63; and domainNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param domainNo the domain no
	* @param start the lower bound of the range of dossier procs
	* @param end the upper bound of the range of dossier procs (not inclusive)
	* @return the range of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByC_G_DNO(
		long companyId, long groupId, java.lang.String domainNo, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_G_DNO(companyId, groupId, domainNo, start, end);
	}

	/**
	* Returns an ordered range of all the dossier procs where companyId = &#63; and groupId = &#63; and domainNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param domainNo the domain no
	* @param start the lower bound of the range of dossier procs
	* @param end the upper bound of the range of dossier procs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByC_G_DNO(
		long companyId, long groupId, java.lang.String domainNo, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_G_DNO(companyId, groupId, domainNo, start, end,
			orderByComparator);
	}

	/**
	* Returns the first dossier proc in the ordered set where companyId = &#63; and groupId = &#63; and domainNo = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param domainNo the domain no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc findByC_G_DNO_First(
		long companyId, long groupId, java.lang.String domainNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException {
		return getPersistence()
				   .findByC_G_DNO_First(companyId, groupId, domainNo,
			orderByComparator);
	}

	/**
	* Returns the first dossier proc in the ordered set where companyId = &#63; and groupId = &#63; and domainNo = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param domainNo the domain no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc fetchByC_G_DNO_First(
		long companyId, long groupId, java.lang.String domainNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_G_DNO_First(companyId, groupId, domainNo,
			orderByComparator);
	}

	/**
	* Returns the last dossier proc in the ordered set where companyId = &#63; and groupId = &#63; and domainNo = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param domainNo the domain no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc findByC_G_DNO_Last(
		long companyId, long groupId, java.lang.String domainNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException {
		return getPersistence()
				   .findByC_G_DNO_Last(companyId, groupId, domainNo,
			orderByComparator);
	}

	/**
	* Returns the last dossier proc in the ordered set where companyId = &#63; and groupId = &#63; and domainNo = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param domainNo the domain no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc fetchByC_G_DNO_Last(
		long companyId, long groupId, java.lang.String domainNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_G_DNO_Last(companyId, groupId, domainNo,
			orderByComparator);
	}

	/**
	* Returns the dossier procs before and after the current dossier proc in the ordered set where companyId = &#63; and groupId = &#63; and domainNo = &#63;.
	*
	* @param dossierProcId the primary key of the current dossier proc
	* @param companyId the company ID
	* @param groupId the group ID
	* @param domainNo the domain no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a dossier proc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc[] findByC_G_DNO_PrevAndNext(
		long dossierProcId, long companyId, long groupId,
		java.lang.String domainNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException {
		return getPersistence()
				   .findByC_G_DNO_PrevAndNext(dossierProcId, companyId,
			groupId, domainNo, orderByComparator);
	}

	/**
	* Removes all the dossier procs where companyId = &#63; and groupId = &#63; and domainNo = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param domainNo the domain no
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_G_DNO(long companyId, long groupId,
		java.lang.String domainNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC_G_DNO(companyId, groupId, domainNo);
	}

	/**
	* Returns the number of dossier procs where companyId = &#63; and groupId = &#63; and domainNo = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param domainNo the domain no
	* @return the number of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_G_DNO(long companyId, long groupId,
		java.lang.String domainNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_G_DNO(companyId, groupId, domainNo);
	}

	/**
	* Returns all the dossier procs where companyId = &#63; and administrationNo = &#63; and domainNo = &#63;.
	*
	* @param companyId the company ID
	* @param administrationNo the administration no
	* @param domainNo the domain no
	* @return the matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByC_ANO_DNO(
		long companyId, java.lang.String administrationNo,
		java.lang.String domainNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_ANO_DNO(companyId, administrationNo, domainNo);
	}

	/**
	* Returns a range of all the dossier procs where companyId = &#63; and administrationNo = &#63; and domainNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param administrationNo the administration no
	* @param domainNo the domain no
	* @param start the lower bound of the range of dossier procs
	* @param end the upper bound of the range of dossier procs (not inclusive)
	* @return the range of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByC_ANO_DNO(
		long companyId, java.lang.String administrationNo,
		java.lang.String domainNo, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_ANO_DNO(companyId, administrationNo, domainNo,
			start, end);
	}

	/**
	* Returns an ordered range of all the dossier procs where companyId = &#63; and administrationNo = &#63; and domainNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param administrationNo the administration no
	* @param domainNo the domain no
	* @param start the lower bound of the range of dossier procs
	* @param end the upper bound of the range of dossier procs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByC_ANO_DNO(
		long companyId, java.lang.String administrationNo,
		java.lang.String domainNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_ANO_DNO(companyId, administrationNo, domainNo,
			start, end, orderByComparator);
	}

	/**
	* Returns the first dossier proc in the ordered set where companyId = &#63; and administrationNo = &#63; and domainNo = &#63;.
	*
	* @param companyId the company ID
	* @param administrationNo the administration no
	* @param domainNo the domain no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc findByC_ANO_DNO_First(
		long companyId, java.lang.String administrationNo,
		java.lang.String domainNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException {
		return getPersistence()
				   .findByC_ANO_DNO_First(companyId, administrationNo,
			domainNo, orderByComparator);
	}

	/**
	* Returns the first dossier proc in the ordered set where companyId = &#63; and administrationNo = &#63; and domainNo = &#63;.
	*
	* @param companyId the company ID
	* @param administrationNo the administration no
	* @param domainNo the domain no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc fetchByC_ANO_DNO_First(
		long companyId, java.lang.String administrationNo,
		java.lang.String domainNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_ANO_DNO_First(companyId, administrationNo,
			domainNo, orderByComparator);
	}

	/**
	* Returns the last dossier proc in the ordered set where companyId = &#63; and administrationNo = &#63; and domainNo = &#63;.
	*
	* @param companyId the company ID
	* @param administrationNo the administration no
	* @param domainNo the domain no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc findByC_ANO_DNO_Last(
		long companyId, java.lang.String administrationNo,
		java.lang.String domainNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException {
		return getPersistence()
				   .findByC_ANO_DNO_Last(companyId, administrationNo, domainNo,
			orderByComparator);
	}

	/**
	* Returns the last dossier proc in the ordered set where companyId = &#63; and administrationNo = &#63; and domainNo = &#63;.
	*
	* @param companyId the company ID
	* @param administrationNo the administration no
	* @param domainNo the domain no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc fetchByC_ANO_DNO_Last(
		long companyId, java.lang.String administrationNo,
		java.lang.String domainNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_ANO_DNO_Last(companyId, administrationNo,
			domainNo, orderByComparator);
	}

	/**
	* Returns the dossier procs before and after the current dossier proc in the ordered set where companyId = &#63; and administrationNo = &#63; and domainNo = &#63;.
	*
	* @param dossierProcId the primary key of the current dossier proc
	* @param companyId the company ID
	* @param administrationNo the administration no
	* @param domainNo the domain no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a dossier proc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc[] findByC_ANO_DNO_PrevAndNext(
		long dossierProcId, long companyId, java.lang.String administrationNo,
		java.lang.String domainNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException {
		return getPersistence()
				   .findByC_ANO_DNO_PrevAndNext(dossierProcId, companyId,
			administrationNo, domainNo, orderByComparator);
	}

	/**
	* Removes all the dossier procs where companyId = &#63; and administrationNo = &#63; and domainNo = &#63; from the database.
	*
	* @param companyId the company ID
	* @param administrationNo the administration no
	* @param domainNo the domain no
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_ANO_DNO(long companyId,
		java.lang.String administrationNo, java.lang.String domainNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC_ANO_DNO(companyId, administrationNo, domainNo);
	}

	/**
	* Returns the number of dossier procs where companyId = &#63; and administrationNo = &#63; and domainNo = &#63;.
	*
	* @param companyId the company ID
	* @param administrationNo the administration no
	* @param domainNo the domain no
	* @return the number of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_ANO_DNO(long companyId,
		java.lang.String administrationNo, java.lang.String domainNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByC_ANO_DNO(companyId, administrationNo, domainNo);
	}

	/**
	* Returns all the dossier procs where companyId = &#63; and groupId = &#63; and administrationNo = &#63; and domainNo = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param administrationNo the administration no
	* @param domainNo the domain no
	* @return the matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByC_G_ANO_DNO(
		long companyId, long groupId, java.lang.String administrationNo,
		java.lang.String domainNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_G_ANO_DNO(companyId, groupId, administrationNo,
			domainNo);
	}

	/**
	* Returns a range of all the dossier procs where companyId = &#63; and groupId = &#63; and administrationNo = &#63; and domainNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param administrationNo the administration no
	* @param domainNo the domain no
	* @param start the lower bound of the range of dossier procs
	* @param end the upper bound of the range of dossier procs (not inclusive)
	* @return the range of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByC_G_ANO_DNO(
		long companyId, long groupId, java.lang.String administrationNo,
		java.lang.String domainNo, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_G_ANO_DNO(companyId, groupId, administrationNo,
			domainNo, start, end);
	}

	/**
	* Returns an ordered range of all the dossier procs where companyId = &#63; and groupId = &#63; and administrationNo = &#63; and domainNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param administrationNo the administration no
	* @param domainNo the domain no
	* @param start the lower bound of the range of dossier procs
	* @param end the upper bound of the range of dossier procs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByC_G_ANO_DNO(
		long companyId, long groupId, java.lang.String administrationNo,
		java.lang.String domainNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_G_ANO_DNO(companyId, groupId, administrationNo,
			domainNo, start, end, orderByComparator);
	}

	/**
	* Returns the first dossier proc in the ordered set where companyId = &#63; and groupId = &#63; and administrationNo = &#63; and domainNo = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param administrationNo the administration no
	* @param domainNo the domain no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc findByC_G_ANO_DNO_First(
		long companyId, long groupId, java.lang.String administrationNo,
		java.lang.String domainNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException {
		return getPersistence()
				   .findByC_G_ANO_DNO_First(companyId, groupId,
			administrationNo, domainNo, orderByComparator);
	}

	/**
	* Returns the first dossier proc in the ordered set where companyId = &#63; and groupId = &#63; and administrationNo = &#63; and domainNo = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param administrationNo the administration no
	* @param domainNo the domain no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc fetchByC_G_ANO_DNO_First(
		long companyId, long groupId, java.lang.String administrationNo,
		java.lang.String domainNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_G_ANO_DNO_First(companyId, groupId,
			administrationNo, domainNo, orderByComparator);
	}

	/**
	* Returns the last dossier proc in the ordered set where companyId = &#63; and groupId = &#63; and administrationNo = &#63; and domainNo = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param administrationNo the administration no
	* @param domainNo the domain no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc findByC_G_ANO_DNO_Last(
		long companyId, long groupId, java.lang.String administrationNo,
		java.lang.String domainNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException {
		return getPersistence()
				   .findByC_G_ANO_DNO_Last(companyId, groupId,
			administrationNo, domainNo, orderByComparator);
	}

	/**
	* Returns the last dossier proc in the ordered set where companyId = &#63; and groupId = &#63; and administrationNo = &#63; and domainNo = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param administrationNo the administration no
	* @param domainNo the domain no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc fetchByC_G_ANO_DNO_Last(
		long companyId, long groupId, java.lang.String administrationNo,
		java.lang.String domainNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_G_ANO_DNO_Last(companyId, groupId,
			administrationNo, domainNo, orderByComparator);
	}

	/**
	* Returns the dossier procs before and after the current dossier proc in the ordered set where companyId = &#63; and groupId = &#63; and administrationNo = &#63; and domainNo = &#63;.
	*
	* @param dossierProcId the primary key of the current dossier proc
	* @param companyId the company ID
	* @param groupId the group ID
	* @param administrationNo the administration no
	* @param domainNo the domain no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a dossier proc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc[] findByC_G_ANO_DNO_PrevAndNext(
		long dossierProcId, long companyId, long groupId,
		java.lang.String administrationNo, java.lang.String domainNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException {
		return getPersistence()
				   .findByC_G_ANO_DNO_PrevAndNext(dossierProcId, companyId,
			groupId, administrationNo, domainNo, orderByComparator);
	}

	/**
	* Removes all the dossier procs where companyId = &#63; and groupId = &#63; and administrationNo = &#63; and domainNo = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param administrationNo the administration no
	* @param domainNo the domain no
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_G_ANO_DNO(long companyId, long groupId,
		java.lang.String administrationNo, java.lang.String domainNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByC_G_ANO_DNO(companyId, groupId, administrationNo, domainNo);
	}

	/**
	* Returns the number of dossier procs where companyId = &#63; and groupId = &#63; and administrationNo = &#63; and domainNo = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param administrationNo the administration no
	* @param domainNo the domain no
	* @return the number of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_G_ANO_DNO(long companyId, long groupId,
		java.lang.String administrationNo, java.lang.String domainNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByC_G_ANO_DNO(companyId, groupId, administrationNo,
			domainNo);
	}

	/**
	* Returns the dossier proc where dossierProcNo = &#63; or throws a {@link org.oep.core.dossiermgt.NoSuchDossierProcException} if it could not be found.
	*
	* @param dossierProcNo the dossier proc no
	* @return the matching dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc findByDPN(
		java.lang.String dossierProcNo)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException {
		return getPersistence().findByDPN(dossierProcNo);
	}

	/**
	* Returns the dossier proc where dossierProcNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param dossierProcNo the dossier proc no
	* @return the matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc fetchByDPN(
		java.lang.String dossierProcNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByDPN(dossierProcNo);
	}

	/**
	* Returns the dossier proc where dossierProcNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param dossierProcNo the dossier proc no
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc fetchByDPN(
		java.lang.String dossierProcNo, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByDPN(dossierProcNo, retrieveFromCache);
	}

	/**
	* Removes the dossier proc where dossierProcNo = &#63; from the database.
	*
	* @param dossierProcNo the dossier proc no
	* @return the dossier proc that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc removeByDPN(
		java.lang.String dossierProcNo)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException {
		return getPersistence().removeByDPN(dossierProcNo);
	}

	/**
	* Returns the number of dossier procs where dossierProcNo = &#63;.
	*
	* @param dossierProcNo the dossier proc no
	* @return the number of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDPN(java.lang.String dossierProcNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByDPN(dossierProcNo);
	}

	/**
	* Returns all the dossier procs where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Returns a range of all the dossier procs where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of dossier procs
	* @param end the upper bound of the range of dossier procs (not inclusive)
	* @return the range of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the dossier procs where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of dossier procs
	* @param end the upper bound of the range of dossier procs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns the first dossier proc in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first dossier proc in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last dossier proc in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last dossier proc in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the dossier procs before and after the current dossier proc in the ordered set where groupId = &#63;.
	*
	* @param dossierProcId the primary key of the current dossier proc
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a dossier proc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc[] findByGroupId_PrevAndNext(
		long dossierProcId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(dossierProcId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the dossier procs where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of dossier procs where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Returns all the dossier procs where companyId = &#63; and active = &#63;.
	*
	* @param companyId the company ID
	* @param active the active
	* @return the matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByC_AC(
		long companyId, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_AC(companyId, active);
	}

	/**
	* Returns a range of all the dossier procs where companyId = &#63; and active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param active the active
	* @param start the lower bound of the range of dossier procs
	* @param end the upper bound of the range of dossier procs (not inclusive)
	* @return the range of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByC_AC(
		long companyId, int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_AC(companyId, active, start, end);
	}

	/**
	* Returns an ordered range of all the dossier procs where companyId = &#63; and active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param active the active
	* @param start the lower bound of the range of dossier procs
	* @param end the upper bound of the range of dossier procs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByC_AC(
		long companyId, int active, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_AC(companyId, active, start, end, orderByComparator);
	}

	/**
	* Returns the first dossier proc in the ordered set where companyId = &#63; and active = &#63;.
	*
	* @param companyId the company ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc findByC_AC_First(
		long companyId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException {
		return getPersistence()
				   .findByC_AC_First(companyId, active, orderByComparator);
	}

	/**
	* Returns the first dossier proc in the ordered set where companyId = &#63; and active = &#63;.
	*
	* @param companyId the company ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc fetchByC_AC_First(
		long companyId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_AC_First(companyId, active, orderByComparator);
	}

	/**
	* Returns the last dossier proc in the ordered set where companyId = &#63; and active = &#63;.
	*
	* @param companyId the company ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc findByC_AC_Last(
		long companyId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException {
		return getPersistence()
				   .findByC_AC_Last(companyId, active, orderByComparator);
	}

	/**
	* Returns the last dossier proc in the ordered set where companyId = &#63; and active = &#63;.
	*
	* @param companyId the company ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc fetchByC_AC_Last(
		long companyId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_AC_Last(companyId, active, orderByComparator);
	}

	/**
	* Returns the dossier procs before and after the current dossier proc in the ordered set where companyId = &#63; and active = &#63;.
	*
	* @param dossierProcId the primary key of the current dossier proc
	* @param companyId the company ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a dossier proc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc[] findByC_AC_PrevAndNext(
		long dossierProcId, long companyId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException {
		return getPersistence()
				   .findByC_AC_PrevAndNext(dossierProcId, companyId, active,
			orderByComparator);
	}

	/**
	* Removes all the dossier procs where companyId = &#63; and active = &#63; from the database.
	*
	* @param companyId the company ID
	* @param active the active
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_AC(long companyId, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC_AC(companyId, active);
	}

	/**
	* Returns the number of dossier procs where companyId = &#63; and active = &#63;.
	*
	* @param companyId the company ID
	* @param active the active
	* @return the number of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_AC(long companyId, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_AC(companyId, active);
	}

	/**
	* Returns all the dossier procs where groupId = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param active the active
	* @return the matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByG_AC(
		long groupId, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_AC(groupId, active);
	}

	/**
	* Returns a range of all the dossier procs where groupId = &#63; and active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param active the active
	* @param start the lower bound of the range of dossier procs
	* @param end the upper bound of the range of dossier procs (not inclusive)
	* @return the range of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByG_AC(
		long groupId, int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_AC(groupId, active, start, end);
	}

	/**
	* Returns an ordered range of all the dossier procs where groupId = &#63; and active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param active the active
	* @param start the lower bound of the range of dossier procs
	* @param end the upper bound of the range of dossier procs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.DossierProc> findByG_AC(
		long groupId, int active, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_AC(groupId, active, start, end, orderByComparator);
	}

	/**
	* Returns the first dossier proc in the ordered set where groupId = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc findByG_AC_First(
		long groupId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException {
		return getPersistence()
				   .findByG_AC_First(groupId, active, orderByComparator);
	}

	/**
	* Returns the first dossier proc in the ordered set where groupId = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc fetchByG_AC_First(
		long groupId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_AC_First(groupId, active, orderByComparator);
	}

	/**
	* Returns the last dossier proc in the ordered set where groupId = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc findByG_AC_Last(
		long groupId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException {
		return getPersistence()
				   .findByG_AC_Last(groupId, active, orderByComparator);
	}

	/**
	* Returns the last dossier proc in the ordered set where groupId = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier proc, or <code>null</code> if a matching dossier proc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc fetchByG_AC_Last(
		long groupId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_AC_Last(groupId, active, orderByComparator);
	}

	/**
	* Returns the dossier procs before and after the current dossier proc in the ordered set where groupId = &#63; and active = &#63;.
	*
	* @param dossierProcId the primary key of the current dossier proc
	* @param groupId the group ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a dossier proc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc[] findByG_AC_PrevAndNext(
		long dossierProcId, long groupId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException {
		return getPersistence()
				   .findByG_AC_PrevAndNext(dossierProcId, groupId, active,
			orderByComparator);
	}

	/**
	* Removes all the dossier procs where groupId = &#63; and active = &#63; from the database.
	*
	* @param groupId the group ID
	* @param active the active
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_AC(long groupId, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByG_AC(groupId, active);
	}

	/**
	* Returns the number of dossier procs where groupId = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param active the active
	* @return the number of matching dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_AC(long groupId, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_AC(groupId, active);
	}

	/**
	* Caches the dossier proc in the entity cache if it is enabled.
	*
	* @param dossierProc the dossier proc
	*/
	public static void cacheResult(
		org.oep.core.dossiermgt.model.DossierProc dossierProc) {
		getPersistence().cacheResult(dossierProc);
	}

	/**
	* Caches the dossier procs in the entity cache if it is enabled.
	*
	* @param dossierProcs the dossier procs
	*/
	public static void cacheResult(
		java.util.List<org.oep.core.dossiermgt.model.DossierProc> dossierProcs) {
		getPersistence().cacheResult(dossierProcs);
	}

	/**
	* Creates a new dossier proc with the primary key. Does not add the dossier proc to the database.
	*
	* @param dossierProcId the primary key for the new dossier proc
	* @return the new dossier proc
	*/
	public static org.oep.core.dossiermgt.model.DossierProc create(
		long dossierProcId) {
		return getPersistence().create(dossierProcId);
	}

	/**
	* Removes the dossier proc with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierProcId the primary key of the dossier proc
	* @return the dossier proc that was removed
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a dossier proc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc remove(
		long dossierProcId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException {
		return getPersistence().remove(dossierProcId);
	}

	public static org.oep.core.dossiermgt.model.DossierProc updateImpl(
		org.oep.core.dossiermgt.model.DossierProc dossierProc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dossierProc);
	}

	/**
	* Returns the dossier proc with the primary key or throws a {@link org.oep.core.dossiermgt.NoSuchDossierProcException} if it could not be found.
	*
	* @param dossierProcId the primary key of the dossier proc
	* @return the dossier proc
	* @throws org.oep.core.dossiermgt.NoSuchDossierProcException if a dossier proc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc findByPrimaryKey(
		long dossierProcId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchDossierProcException {
		return getPersistence().findByPrimaryKey(dossierProcId);
	}

	/**
	* Returns the dossier proc with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param dossierProcId the primary key of the dossier proc
	* @return the dossier proc, or <code>null</code> if a dossier proc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DossierProc fetchByPrimaryKey(
		long dossierProcId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(dossierProcId);
	}

	/**
	* Returns all the dossier procs.
	*
	* @return the dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.DossierProc> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the dossier procs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossier procs
	* @param end the upper bound of the range of dossier procs (not inclusive)
	* @return the range of dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.DossierProc> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the dossier procs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DossierProcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossier procs
	* @param end the upper bound of the range of dossier procs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.DossierProc> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dossier procs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dossier procs.
	*
	* @return the number of dossier procs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DossierProcPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DossierProcPersistence)PortletBeanLocatorUtil.locate(org.oep.core.dossiermgt.service.ClpSerializer.getServletContextName(),
					DossierProcPersistence.class.getName());

			ReferenceRegistry.registerReference(DossierProcUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DossierProcPersistence persistence) {
	}

	private static DossierProcPersistence _persistence;
}