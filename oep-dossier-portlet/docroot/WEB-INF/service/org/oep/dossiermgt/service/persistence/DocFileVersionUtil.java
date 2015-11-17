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

package org.oep.dossiermgt.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import org.oep.dossiermgt.model.DocFileVersion;

import java.util.List;

/**
 * The persistence utility for the doc file version service. This utility wraps {@link DocFileVersionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see DocFileVersionPersistence
 * @see DocFileVersionPersistenceImpl
 * @generated
 */
public class DocFileVersionUtil {
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
	public static void clearCache(DocFileVersion docFileVersion) {
		getPersistence().clearCache(docFileVersion);
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
	public static List<DocFileVersion> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DocFileVersion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DocFileVersion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static DocFileVersion update(DocFileVersion docFileVersion)
		throws SystemException {
		return getPersistence().update(docFileVersion);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static DocFileVersion update(DocFileVersion docFileVersion,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(docFileVersion, serviceContext);
	}

	/**
	* Returns all the doc file versions where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching doc file versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.dossiermgt.model.DocFileVersion> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the doc file versions where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.DocFileVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of doc file versions
	* @param end the upper bound of the range of doc file versions (not inclusive)
	* @return the range of matching doc file versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.dossiermgt.model.DocFileVersion> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the doc file versions where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.DocFileVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of doc file versions
	* @param end the upper bound of the range of doc file versions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching doc file versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.dossiermgt.model.DocFileVersion> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns the first doc file version in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching doc file version
	* @throws org.oep.dossiermgt.NoSuchDocFileVersionException if a matching doc file version could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.dossiermgt.model.DocFileVersion findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.dossiermgt.NoSuchDocFileVersionException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first doc file version in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching doc file version, or <code>null</code> if a matching doc file version could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.dossiermgt.model.DocFileVersion fetchByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last doc file version in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching doc file version
	* @throws org.oep.dossiermgt.NoSuchDocFileVersionException if a matching doc file version could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.dossiermgt.model.DocFileVersion findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.dossiermgt.NoSuchDocFileVersionException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last doc file version in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching doc file version, or <code>null</code> if a matching doc file version could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.dossiermgt.model.DocFileVersion fetchByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the doc file versions before and after the current doc file version in the ordered set where uuid = &#63;.
	*
	* @param docFileVersionId the primary key of the current doc file version
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next doc file version
	* @throws org.oep.dossiermgt.NoSuchDocFileVersionException if a doc file version with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.dossiermgt.model.DocFileVersion[] findByUuid_PrevAndNext(
		long docFileVersionId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.dossiermgt.NoSuchDocFileVersionException {
		return getPersistence()
				   .findByUuid_PrevAndNext(docFileVersionId, uuid,
			orderByComparator);
	}

	/**
	* Removes all the doc file versions where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of doc file versions where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching doc file versions
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the doc file version where uuid = &#63; and groupId = &#63; or throws a {@link org.oep.dossiermgt.NoSuchDocFileVersionException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching doc file version
	* @throws org.oep.dossiermgt.NoSuchDocFileVersionException if a matching doc file version could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.dossiermgt.model.DocFileVersion findByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.dossiermgt.NoSuchDocFileVersionException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the doc file version where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching doc file version, or <code>null</code> if a matching doc file version could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.dossiermgt.model.DocFileVersion fetchByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the doc file version where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching doc file version, or <code>null</code> if a matching doc file version could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.dossiermgt.model.DocFileVersion fetchByUUID_G(
		java.lang.String uuid, long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the doc file version where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the doc file version that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.dossiermgt.model.DocFileVersion removeByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.dossiermgt.NoSuchDocFileVersionException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of doc file versions where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching doc file versions
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the doc file versions where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching doc file versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.dossiermgt.model.DocFileVersion> findByUuid_C(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the doc file versions where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.DocFileVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of doc file versions
	* @param end the upper bound of the range of doc file versions (not inclusive)
	* @return the range of matching doc file versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.dossiermgt.model.DocFileVersion> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the doc file versions where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.DocFileVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of doc file versions
	* @param end the upper bound of the range of doc file versions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching doc file versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.dossiermgt.model.DocFileVersion> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns the first doc file version in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching doc file version
	* @throws org.oep.dossiermgt.NoSuchDocFileVersionException if a matching doc file version could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.dossiermgt.model.DocFileVersion findByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.dossiermgt.NoSuchDocFileVersionException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first doc file version in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching doc file version, or <code>null</code> if a matching doc file version could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.dossiermgt.model.DocFileVersion fetchByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last doc file version in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching doc file version
	* @throws org.oep.dossiermgt.NoSuchDocFileVersionException if a matching doc file version could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.dossiermgt.model.DocFileVersion findByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.dossiermgt.NoSuchDocFileVersionException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last doc file version in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching doc file version, or <code>null</code> if a matching doc file version could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.dossiermgt.model.DocFileVersion fetchByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the doc file versions before and after the current doc file version in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param docFileVersionId the primary key of the current doc file version
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next doc file version
	* @throws org.oep.dossiermgt.NoSuchDocFileVersionException if a doc file version with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.dossiermgt.model.DocFileVersion[] findByUuid_C_PrevAndNext(
		long docFileVersionId, java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.dossiermgt.NoSuchDocFileVersionException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(docFileVersionId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the doc file versions where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of doc file versions where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching doc file versions
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Caches the doc file version in the entity cache if it is enabled.
	*
	* @param docFileVersion the doc file version
	*/
	public static void cacheResult(
		org.oep.dossiermgt.model.DocFileVersion docFileVersion) {
		getPersistence().cacheResult(docFileVersion);
	}

	/**
	* Caches the doc file versions in the entity cache if it is enabled.
	*
	* @param docFileVersions the doc file versions
	*/
	public static void cacheResult(
		java.util.List<org.oep.dossiermgt.model.DocFileVersion> docFileVersions) {
		getPersistence().cacheResult(docFileVersions);
	}

	/**
	* Creates a new doc file version with the primary key. Does not add the doc file version to the database.
	*
	* @param docFileVersionId the primary key for the new doc file version
	* @return the new doc file version
	*/
	public static org.oep.dossiermgt.model.DocFileVersion create(
		long docFileVersionId) {
		return getPersistence().create(docFileVersionId);
	}

	/**
	* Removes the doc file version with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param docFileVersionId the primary key of the doc file version
	* @return the doc file version that was removed
	* @throws org.oep.dossiermgt.NoSuchDocFileVersionException if a doc file version with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.dossiermgt.model.DocFileVersion remove(
		long docFileVersionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.dossiermgt.NoSuchDocFileVersionException {
		return getPersistence().remove(docFileVersionId);
	}

	public static org.oep.dossiermgt.model.DocFileVersion updateImpl(
		org.oep.dossiermgt.model.DocFileVersion docFileVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(docFileVersion);
	}

	/**
	* Returns the doc file version with the primary key or throws a {@link org.oep.dossiermgt.NoSuchDocFileVersionException} if it could not be found.
	*
	* @param docFileVersionId the primary key of the doc file version
	* @return the doc file version
	* @throws org.oep.dossiermgt.NoSuchDocFileVersionException if a doc file version with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.dossiermgt.model.DocFileVersion findByPrimaryKey(
		long docFileVersionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.dossiermgt.NoSuchDocFileVersionException {
		return getPersistence().findByPrimaryKey(docFileVersionId);
	}

	/**
	* Returns the doc file version with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param docFileVersionId the primary key of the doc file version
	* @return the doc file version, or <code>null</code> if a doc file version with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.dossiermgt.model.DocFileVersion fetchByPrimaryKey(
		long docFileVersionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(docFileVersionId);
	}

	/**
	* Returns all the doc file versions.
	*
	* @return the doc file versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.dossiermgt.model.DocFileVersion> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the doc file versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.DocFileVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of doc file versions
	* @param end the upper bound of the range of doc file versions (not inclusive)
	* @return the range of doc file versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.dossiermgt.model.DocFileVersion> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the doc file versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.DocFileVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of doc file versions
	* @param end the upper bound of the range of doc file versions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of doc file versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.dossiermgt.model.DocFileVersion> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the doc file versions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of doc file versions.
	*
	* @return the number of doc file versions
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DocFileVersionPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DocFileVersionPersistence)PortletBeanLocatorUtil.locate(org.oep.dossiermgt.service.ClpSerializer.getServletContextName(),
					DocFileVersionPersistence.class.getName());

			ReferenceRegistry.registerReference(DocFileVersionUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DocFileVersionPersistence persistence) {
	}

	private static DocFileVersionPersistence _persistence;
}