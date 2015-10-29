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

package org.oep.core.datamgt.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import org.oep.core.datamgt.model.DictMetaData;

import java.util.List;

/**
 * The persistence utility for the dictionary meta data service. This utility wraps {@link DictMetaDataPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NQMINH
 * @see DictMetaDataPersistence
 * @see DictMetaDataPersistenceImpl
 * @generated
 */
public class DictMetaDataUtil {
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
	public static void clearCache(DictMetaData dictMetaData) {
		getPersistence().clearCache(dictMetaData);
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
	public static List<DictMetaData> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DictMetaData> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DictMetaData> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static DictMetaData update(DictMetaData dictMetaData)
		throws SystemException {
		return getPersistence().update(dictMetaData);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static DictMetaData update(DictMetaData dictMetaData,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(dictMetaData, serviceContext);
	}

	/**
	* Returns all the dictionary meta datas where companyId = &#63; and dictDataId = &#63;.
	*
	* @param companyId the company ID
	* @param dictDataId the dict data ID
	* @return the matching dictionary meta datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictMetaData> findByC_DI(
		long companyId, long dictDataId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_DI(companyId, dictDataId);
	}

	/**
	* Returns a range of all the dictionary meta datas where companyId = &#63; and dictDataId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictMetaDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param dictDataId the dict data ID
	* @param start the lower bound of the range of dictionary meta datas
	* @param end the upper bound of the range of dictionary meta datas (not inclusive)
	* @return the range of matching dictionary meta datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictMetaData> findByC_DI(
		long companyId, long dictDataId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_DI(companyId, dictDataId, start, end);
	}

	/**
	* Returns an ordered range of all the dictionary meta datas where companyId = &#63; and dictDataId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictMetaDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param dictDataId the dict data ID
	* @param start the lower bound of the range of dictionary meta datas
	* @param end the upper bound of the range of dictionary meta datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dictionary meta datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictMetaData> findByC_DI(
		long companyId, long dictDataId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_DI(companyId, dictDataId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first dictionary meta data in the ordered set where companyId = &#63; and dictDataId = &#63;.
	*
	* @param companyId the company ID
	* @param dictDataId the dict data ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary meta data
	* @throws org.oep.core.datamgt.NoSuchDictMetaDataException if a matching dictionary meta data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictMetaData findByC_DI_First(
		long companyId, long dictDataId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.NoSuchDictMetaDataException {
		return getPersistence()
				   .findByC_DI_First(companyId, dictDataId, orderByComparator);
	}

	/**
	* Returns the first dictionary meta data in the ordered set where companyId = &#63; and dictDataId = &#63;.
	*
	* @param companyId the company ID
	* @param dictDataId the dict data ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary meta data, or <code>null</code> if a matching dictionary meta data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictMetaData fetchByC_DI_First(
		long companyId, long dictDataId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_DI_First(companyId, dictDataId, orderByComparator);
	}

	/**
	* Returns the last dictionary meta data in the ordered set where companyId = &#63; and dictDataId = &#63;.
	*
	* @param companyId the company ID
	* @param dictDataId the dict data ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary meta data
	* @throws org.oep.core.datamgt.NoSuchDictMetaDataException if a matching dictionary meta data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictMetaData findByC_DI_Last(
		long companyId, long dictDataId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.NoSuchDictMetaDataException {
		return getPersistence()
				   .findByC_DI_Last(companyId, dictDataId, orderByComparator);
	}

	/**
	* Returns the last dictionary meta data in the ordered set where companyId = &#63; and dictDataId = &#63;.
	*
	* @param companyId the company ID
	* @param dictDataId the dict data ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary meta data, or <code>null</code> if a matching dictionary meta data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictMetaData fetchByC_DI_Last(
		long companyId, long dictDataId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_DI_Last(companyId, dictDataId, orderByComparator);
	}

	/**
	* Returns the dictionary meta datas before and after the current dictionary meta data in the ordered set where companyId = &#63; and dictDataId = &#63;.
	*
	* @param dictMetaDataId the primary key of the current dictionary meta data
	* @param companyId the company ID
	* @param dictDataId the dict data ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dictionary meta data
	* @throws org.oep.core.datamgt.NoSuchDictMetaDataException if a dictionary meta data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictMetaData[] findByC_DI_PrevAndNext(
		long dictMetaDataId, long companyId, long dictDataId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.NoSuchDictMetaDataException {
		return getPersistence()
				   .findByC_DI_PrevAndNext(dictMetaDataId, companyId,
			dictDataId, orderByComparator);
	}

	/**
	* Removes all the dictionary meta datas where companyId = &#63; and dictDataId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param dictDataId the dict data ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_DI(long companyId, long dictDataId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC_DI(companyId, dictDataId);
	}

	/**
	* Returns the number of dictionary meta datas where companyId = &#63; and dictDataId = &#63;.
	*
	* @param companyId the company ID
	* @param dictDataId the dict data ID
	* @return the number of matching dictionary meta datas
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_DI(long companyId, long dictDataId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_DI(companyId, dictDataId);
	}

	/**
	* Returns the dictionary meta data where companyId = &#63; and dictDataId = &#63; and attributeName = &#63; or throws a {@link org.oep.core.datamgt.NoSuchDictMetaDataException} if it could not be found.
	*
	* @param companyId the company ID
	* @param dictDataId the dict data ID
	* @param attributeName the attribute name
	* @return the matching dictionary meta data
	* @throws org.oep.core.datamgt.NoSuchDictMetaDataException if a matching dictionary meta data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictMetaData findByC_DI_AN(
		long companyId, long dictDataId, java.lang.String attributeName)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.NoSuchDictMetaDataException {
		return getPersistence()
				   .findByC_DI_AN(companyId, dictDataId, attributeName);
	}

	/**
	* Returns the dictionary meta data where companyId = &#63; and dictDataId = &#63; and attributeName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param companyId the company ID
	* @param dictDataId the dict data ID
	* @param attributeName the attribute name
	* @return the matching dictionary meta data, or <code>null</code> if a matching dictionary meta data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictMetaData fetchByC_DI_AN(
		long companyId, long dictDataId, java.lang.String attributeName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_DI_AN(companyId, dictDataId, attributeName);
	}

	/**
	* Returns the dictionary meta data where companyId = &#63; and dictDataId = &#63; and attributeName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param companyId the company ID
	* @param dictDataId the dict data ID
	* @param attributeName the attribute name
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dictionary meta data, or <code>null</code> if a matching dictionary meta data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictMetaData fetchByC_DI_AN(
		long companyId, long dictDataId, java.lang.String attributeName,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_DI_AN(companyId, dictDataId, attributeName,
			retrieveFromCache);
	}

	/**
	* Removes the dictionary meta data where companyId = &#63; and dictDataId = &#63; and attributeName = &#63; from the database.
	*
	* @param companyId the company ID
	* @param dictDataId the dict data ID
	* @param attributeName the attribute name
	* @return the dictionary meta data that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictMetaData removeByC_DI_AN(
		long companyId, long dictDataId, java.lang.String attributeName)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.NoSuchDictMetaDataException {
		return getPersistence()
				   .removeByC_DI_AN(companyId, dictDataId, attributeName);
	}

	/**
	* Returns the number of dictionary meta datas where companyId = &#63; and dictDataId = &#63; and attributeName = &#63;.
	*
	* @param companyId the company ID
	* @param dictDataId the dict data ID
	* @param attributeName the attribute name
	* @return the number of matching dictionary meta datas
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_DI_AN(long companyId, long dictDataId,
		java.lang.String attributeName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByC_DI_AN(companyId, dictDataId, attributeName);
	}

	/**
	* Returns all the dictionary meta datas where companyId = &#63; and groupId = &#63; and dictDataId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param dictDataId the dict data ID
	* @return the matching dictionary meta datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictMetaData> findByC_G_DI(
		long companyId, long groupId, long dictDataId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_G_DI(companyId, groupId, dictDataId);
	}

	/**
	* Returns a range of all the dictionary meta datas where companyId = &#63; and groupId = &#63; and dictDataId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictMetaDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param dictDataId the dict data ID
	* @param start the lower bound of the range of dictionary meta datas
	* @param end the upper bound of the range of dictionary meta datas (not inclusive)
	* @return the range of matching dictionary meta datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictMetaData> findByC_G_DI(
		long companyId, long groupId, long dictDataId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_G_DI(companyId, groupId, dictDataId, start, end);
	}

	/**
	* Returns an ordered range of all the dictionary meta datas where companyId = &#63; and groupId = &#63; and dictDataId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictMetaDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param dictDataId the dict data ID
	* @param start the lower bound of the range of dictionary meta datas
	* @param end the upper bound of the range of dictionary meta datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dictionary meta datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictMetaData> findByC_G_DI(
		long companyId, long groupId, long dictDataId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_G_DI(companyId, groupId, dictDataId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first dictionary meta data in the ordered set where companyId = &#63; and groupId = &#63; and dictDataId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param dictDataId the dict data ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary meta data
	* @throws org.oep.core.datamgt.NoSuchDictMetaDataException if a matching dictionary meta data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictMetaData findByC_G_DI_First(
		long companyId, long groupId, long dictDataId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.NoSuchDictMetaDataException {
		return getPersistence()
				   .findByC_G_DI_First(companyId, groupId, dictDataId,
			orderByComparator);
	}

	/**
	* Returns the first dictionary meta data in the ordered set where companyId = &#63; and groupId = &#63; and dictDataId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param dictDataId the dict data ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary meta data, or <code>null</code> if a matching dictionary meta data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictMetaData fetchByC_G_DI_First(
		long companyId, long groupId, long dictDataId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_G_DI_First(companyId, groupId, dictDataId,
			orderByComparator);
	}

	/**
	* Returns the last dictionary meta data in the ordered set where companyId = &#63; and groupId = &#63; and dictDataId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param dictDataId the dict data ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary meta data
	* @throws org.oep.core.datamgt.NoSuchDictMetaDataException if a matching dictionary meta data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictMetaData findByC_G_DI_Last(
		long companyId, long groupId, long dictDataId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.NoSuchDictMetaDataException {
		return getPersistence()
				   .findByC_G_DI_Last(companyId, groupId, dictDataId,
			orderByComparator);
	}

	/**
	* Returns the last dictionary meta data in the ordered set where companyId = &#63; and groupId = &#63; and dictDataId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param dictDataId the dict data ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary meta data, or <code>null</code> if a matching dictionary meta data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictMetaData fetchByC_G_DI_Last(
		long companyId, long groupId, long dictDataId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_G_DI_Last(companyId, groupId, dictDataId,
			orderByComparator);
	}

	/**
	* Returns the dictionary meta datas before and after the current dictionary meta data in the ordered set where companyId = &#63; and groupId = &#63; and dictDataId = &#63;.
	*
	* @param dictMetaDataId the primary key of the current dictionary meta data
	* @param companyId the company ID
	* @param groupId the group ID
	* @param dictDataId the dict data ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dictionary meta data
	* @throws org.oep.core.datamgt.NoSuchDictMetaDataException if a dictionary meta data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictMetaData[] findByC_G_DI_PrevAndNext(
		long dictMetaDataId, long companyId, long groupId, long dictDataId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.NoSuchDictMetaDataException {
		return getPersistence()
				   .findByC_G_DI_PrevAndNext(dictMetaDataId, companyId,
			groupId, dictDataId, orderByComparator);
	}

	/**
	* Returns all the dictionary meta datas that the user has permission to view where companyId = &#63; and groupId = &#63; and dictDataId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param dictDataId the dict data ID
	* @return the matching dictionary meta datas that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictMetaData> filterFindByC_G_DI(
		long companyId, long groupId, long dictDataId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByC_G_DI(companyId, groupId, dictDataId);
	}

	/**
	* Returns a range of all the dictionary meta datas that the user has permission to view where companyId = &#63; and groupId = &#63; and dictDataId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictMetaDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param dictDataId the dict data ID
	* @param start the lower bound of the range of dictionary meta datas
	* @param end the upper bound of the range of dictionary meta datas (not inclusive)
	* @return the range of matching dictionary meta datas that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictMetaData> filterFindByC_G_DI(
		long companyId, long groupId, long dictDataId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByC_G_DI(companyId, groupId, dictDataId, start,
			end);
	}

	/**
	* Returns an ordered range of all the dictionary meta datas that the user has permissions to view where companyId = &#63; and groupId = &#63; and dictDataId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictMetaDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param dictDataId the dict data ID
	* @param start the lower bound of the range of dictionary meta datas
	* @param end the upper bound of the range of dictionary meta datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dictionary meta datas that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictMetaData> filterFindByC_G_DI(
		long companyId, long groupId, long dictDataId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByC_G_DI(companyId, groupId, dictDataId, start,
			end, orderByComparator);
	}

	/**
	* Returns the dictionary meta datas before and after the current dictionary meta data in the ordered set of dictionary meta datas that the user has permission to view where companyId = &#63; and groupId = &#63; and dictDataId = &#63;.
	*
	* @param dictMetaDataId the primary key of the current dictionary meta data
	* @param companyId the company ID
	* @param groupId the group ID
	* @param dictDataId the dict data ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dictionary meta data
	* @throws org.oep.core.datamgt.NoSuchDictMetaDataException if a dictionary meta data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictMetaData[] filterFindByC_G_DI_PrevAndNext(
		long dictMetaDataId, long companyId, long groupId, long dictDataId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.NoSuchDictMetaDataException {
		return getPersistence()
				   .filterFindByC_G_DI_PrevAndNext(dictMetaDataId, companyId,
			groupId, dictDataId, orderByComparator);
	}

	/**
	* Removes all the dictionary meta datas where companyId = &#63; and groupId = &#63; and dictDataId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param dictDataId the dict data ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_G_DI(long companyId, long groupId,
		long dictDataId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC_G_DI(companyId, groupId, dictDataId);
	}

	/**
	* Returns the number of dictionary meta datas where companyId = &#63; and groupId = &#63; and dictDataId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param dictDataId the dict data ID
	* @return the number of matching dictionary meta datas
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_G_DI(long companyId, long groupId,
		long dictDataId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_G_DI(companyId, groupId, dictDataId);
	}

	/**
	* Returns the number of dictionary meta datas that the user has permission to view where companyId = &#63; and groupId = &#63; and dictDataId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param dictDataId the dict data ID
	* @return the number of matching dictionary meta datas that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static int filterCountByC_G_DI(long companyId, long groupId,
		long dictDataId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterCountByC_G_DI(companyId, groupId, dictDataId);
	}

	/**
	* Returns the dictionary meta data where companyId = &#63; and groupId = &#63; and dictDataId = &#63; and attributeName = &#63; or throws a {@link org.oep.core.datamgt.NoSuchDictMetaDataException} if it could not be found.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param dictDataId the dict data ID
	* @param attributeName the attribute name
	* @return the matching dictionary meta data
	* @throws org.oep.core.datamgt.NoSuchDictMetaDataException if a matching dictionary meta data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictMetaData findByC_G_DI_AN(
		long companyId, long groupId, long dictDataId,
		java.lang.String attributeName)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.NoSuchDictMetaDataException {
		return getPersistence()
				   .findByC_G_DI_AN(companyId, groupId, dictDataId,
			attributeName);
	}

	/**
	* Returns the dictionary meta data where companyId = &#63; and groupId = &#63; and dictDataId = &#63; and attributeName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param dictDataId the dict data ID
	* @param attributeName the attribute name
	* @return the matching dictionary meta data, or <code>null</code> if a matching dictionary meta data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictMetaData fetchByC_G_DI_AN(
		long companyId, long groupId, long dictDataId,
		java.lang.String attributeName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_G_DI_AN(companyId, groupId, dictDataId,
			attributeName);
	}

	/**
	* Returns the dictionary meta data where companyId = &#63; and groupId = &#63; and dictDataId = &#63; and attributeName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param dictDataId the dict data ID
	* @param attributeName the attribute name
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dictionary meta data, or <code>null</code> if a matching dictionary meta data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictMetaData fetchByC_G_DI_AN(
		long companyId, long groupId, long dictDataId,
		java.lang.String attributeName, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_G_DI_AN(companyId, groupId, dictDataId,
			attributeName, retrieveFromCache);
	}

	/**
	* Removes the dictionary meta data where companyId = &#63; and groupId = &#63; and dictDataId = &#63; and attributeName = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param dictDataId the dict data ID
	* @param attributeName the attribute name
	* @return the dictionary meta data that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictMetaData removeByC_G_DI_AN(
		long companyId, long groupId, long dictDataId,
		java.lang.String attributeName)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.NoSuchDictMetaDataException {
		return getPersistence()
				   .removeByC_G_DI_AN(companyId, groupId, dictDataId,
			attributeName);
	}

	/**
	* Returns the number of dictionary meta datas where companyId = &#63; and groupId = &#63; and dictDataId = &#63; and attributeName = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param dictDataId the dict data ID
	* @param attributeName the attribute name
	* @return the number of matching dictionary meta datas
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_G_DI_AN(long companyId, long groupId,
		long dictDataId, java.lang.String attributeName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByC_G_DI_AN(companyId, groupId, dictDataId,
			attributeName);
	}

	/**
	* Caches the dictionary meta data in the entity cache if it is enabled.
	*
	* @param dictMetaData the dictionary meta data
	*/
	public static void cacheResult(
		org.oep.core.datamgt.model.DictMetaData dictMetaData) {
		getPersistence().cacheResult(dictMetaData);
	}

	/**
	* Caches the dictionary meta datas in the entity cache if it is enabled.
	*
	* @param dictMetaDatas the dictionary meta datas
	*/
	public static void cacheResult(
		java.util.List<org.oep.core.datamgt.model.DictMetaData> dictMetaDatas) {
		getPersistence().cacheResult(dictMetaDatas);
	}

	/**
	* Creates a new dictionary meta data with the primary key. Does not add the dictionary meta data to the database.
	*
	* @param dictMetaDataId the primary key for the new dictionary meta data
	* @return the new dictionary meta data
	*/
	public static org.oep.core.datamgt.model.DictMetaData create(
		long dictMetaDataId) {
		return getPersistence().create(dictMetaDataId);
	}

	/**
	* Removes the dictionary meta data with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dictMetaDataId the primary key of the dictionary meta data
	* @return the dictionary meta data that was removed
	* @throws org.oep.core.datamgt.NoSuchDictMetaDataException if a dictionary meta data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictMetaData remove(
		long dictMetaDataId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.NoSuchDictMetaDataException {
		return getPersistence().remove(dictMetaDataId);
	}

	public static org.oep.core.datamgt.model.DictMetaData updateImpl(
		org.oep.core.datamgt.model.DictMetaData dictMetaData)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dictMetaData);
	}

	/**
	* Returns the dictionary meta data with the primary key or throws a {@link org.oep.core.datamgt.NoSuchDictMetaDataException} if it could not be found.
	*
	* @param dictMetaDataId the primary key of the dictionary meta data
	* @return the dictionary meta data
	* @throws org.oep.core.datamgt.NoSuchDictMetaDataException if a dictionary meta data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictMetaData findByPrimaryKey(
		long dictMetaDataId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.NoSuchDictMetaDataException {
		return getPersistence().findByPrimaryKey(dictMetaDataId);
	}

	/**
	* Returns the dictionary meta data with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param dictMetaDataId the primary key of the dictionary meta data
	* @return the dictionary meta data, or <code>null</code> if a dictionary meta data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictMetaData fetchByPrimaryKey(
		long dictMetaDataId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(dictMetaDataId);
	}

	/**
	* Returns all the dictionary meta datas.
	*
	* @return the dictionary meta datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictMetaData> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the dictionary meta datas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictMetaDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dictionary meta datas
	* @param end the upper bound of the range of dictionary meta datas (not inclusive)
	* @return the range of dictionary meta datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictMetaData> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the dictionary meta datas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictMetaDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dictionary meta datas
	* @param end the upper bound of the range of dictionary meta datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dictionary meta datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictMetaData> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dictionary meta datas from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dictionary meta datas.
	*
	* @return the number of dictionary meta datas
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DictMetaDataPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DictMetaDataPersistence)PortletBeanLocatorUtil.locate(org.oep.core.datamgt.service.ClpSerializer.getServletContextName(),
					DictMetaDataPersistence.class.getName());

			ReferenceRegistry.registerReference(DictMetaDataUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DictMetaDataPersistence persistence) {
	}

	private static DictMetaDataPersistence _persistence;
}