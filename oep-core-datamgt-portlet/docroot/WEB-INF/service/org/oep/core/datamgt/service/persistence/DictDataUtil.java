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

import org.oep.core.datamgt.model.DictData;

import java.util.List;

/**
 * The persistence utility for the dictionary data service. This utility wraps {@link DictDataPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NQMINH
 * @see DictDataPersistence
 * @see DictDataPersistenceImpl
 * @generated
 */
public class DictDataUtil {
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
	public static void clearCache(DictData dictData) {
		getPersistence().clearCache(dictData);
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
	public static List<DictData> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DictData> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DictData> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static DictData update(DictData dictData) throws SystemException {
		return getPersistence().update(dictData);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static DictData update(DictData dictData,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(dictData, serviceContext);
	}

	/**
	* Returns all the dictionary datas where companyId = &#63; and dataCode = &#63;.
	*
	* @param companyId the company ID
	* @param dataCode the data code
	* @return the matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictData> findByC_DC(
		long companyId, java.lang.String dataCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_DC(companyId, dataCode);
	}

	/**
	* Returns a range of all the dictionary datas where companyId = &#63; and dataCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param dataCode the data code
	* @param start the lower bound of the range of dictionary datas
	* @param end the upper bound of the range of dictionary datas (not inclusive)
	* @return the range of matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictData> findByC_DC(
		long companyId, java.lang.String dataCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_DC(companyId, dataCode, start, end);
	}

	/**
	* Returns an ordered range of all the dictionary datas where companyId = &#63; and dataCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param dataCode the data code
	* @param start the lower bound of the range of dictionary datas
	* @param end the upper bound of the range of dictionary datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictData> findByC_DC(
		long companyId, java.lang.String dataCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_DC(companyId, dataCode, start, end,
			orderByComparator);
	}

	/**
	* Returns the first dictionary data in the ordered set where companyId = &#63; and dataCode = &#63;.
	*
	* @param companyId the company ID
	* @param dataCode the data code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary data
	* @throws org.oep.core.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData findByC_DC_First(
		long companyId, java.lang.String dataCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.NoSuchDictDataException {
		return getPersistence()
				   .findByC_DC_First(companyId, dataCode, orderByComparator);
	}

	/**
	* Returns the first dictionary data in the ordered set where companyId = &#63; and dataCode = &#63;.
	*
	* @param companyId the company ID
	* @param dataCode the data code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData fetchByC_DC_First(
		long companyId, java.lang.String dataCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_DC_First(companyId, dataCode, orderByComparator);
	}

	/**
	* Returns the last dictionary data in the ordered set where companyId = &#63; and dataCode = &#63;.
	*
	* @param companyId the company ID
	* @param dataCode the data code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary data
	* @throws org.oep.core.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData findByC_DC_Last(
		long companyId, java.lang.String dataCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.NoSuchDictDataException {
		return getPersistence()
				   .findByC_DC_Last(companyId, dataCode, orderByComparator);
	}

	/**
	* Returns the last dictionary data in the ordered set where companyId = &#63; and dataCode = &#63;.
	*
	* @param companyId the company ID
	* @param dataCode the data code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData fetchByC_DC_Last(
		long companyId, java.lang.String dataCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_DC_Last(companyId, dataCode, orderByComparator);
	}

	/**
	* Returns the dictionary datas before and after the current dictionary data in the ordered set where companyId = &#63; and dataCode = &#63;.
	*
	* @param dictDataId the primary key of the current dictionary data
	* @param companyId the company ID
	* @param dataCode the data code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dictionary data
	* @throws org.oep.core.datamgt.NoSuchDictDataException if a dictionary data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData[] findByC_DC_PrevAndNext(
		long dictDataId, long companyId, java.lang.String dataCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.NoSuchDictDataException {
		return getPersistence()
				   .findByC_DC_PrevAndNext(dictDataId, companyId, dataCode,
			orderByComparator);
	}

	/**
	* Removes all the dictionary datas where companyId = &#63; and dataCode = &#63; from the database.
	*
	* @param companyId the company ID
	* @param dataCode the data code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_DC(long companyId, java.lang.String dataCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC_DC(companyId, dataCode);
	}

	/**
	* Returns the number of dictionary datas where companyId = &#63; and dataCode = &#63;.
	*
	* @param companyId the company ID
	* @param dataCode the data code
	* @return the number of matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_DC(long companyId, java.lang.String dataCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_DC(companyId, dataCode);
	}

	/**
	* Returns all the dictionary datas where groupId = &#63; and dataCode = &#63;.
	*
	* @param groupId the group ID
	* @param dataCode the data code
	* @return the matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictData> findByG_DC(
		long groupId, java.lang.String dataCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_DC(groupId, dataCode);
	}

	/**
	* Returns a range of all the dictionary datas where groupId = &#63; and dataCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param dataCode the data code
	* @param start the lower bound of the range of dictionary datas
	* @param end the upper bound of the range of dictionary datas (not inclusive)
	* @return the range of matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictData> findByG_DC(
		long groupId, java.lang.String dataCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_DC(groupId, dataCode, start, end);
	}

	/**
	* Returns an ordered range of all the dictionary datas where groupId = &#63; and dataCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param dataCode the data code
	* @param start the lower bound of the range of dictionary datas
	* @param end the upper bound of the range of dictionary datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictData> findByG_DC(
		long groupId, java.lang.String dataCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_DC(groupId, dataCode, start, end, orderByComparator);
	}

	/**
	* Returns the first dictionary data in the ordered set where groupId = &#63; and dataCode = &#63;.
	*
	* @param groupId the group ID
	* @param dataCode the data code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary data
	* @throws org.oep.core.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData findByG_DC_First(
		long groupId, java.lang.String dataCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.NoSuchDictDataException {
		return getPersistence()
				   .findByG_DC_First(groupId, dataCode, orderByComparator);
	}

	/**
	* Returns the first dictionary data in the ordered set where groupId = &#63; and dataCode = &#63;.
	*
	* @param groupId the group ID
	* @param dataCode the data code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData fetchByG_DC_First(
		long groupId, java.lang.String dataCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_DC_First(groupId, dataCode, orderByComparator);
	}

	/**
	* Returns the last dictionary data in the ordered set where groupId = &#63; and dataCode = &#63;.
	*
	* @param groupId the group ID
	* @param dataCode the data code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary data
	* @throws org.oep.core.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData findByG_DC_Last(
		long groupId, java.lang.String dataCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.NoSuchDictDataException {
		return getPersistence()
				   .findByG_DC_Last(groupId, dataCode, orderByComparator);
	}

	/**
	* Returns the last dictionary data in the ordered set where groupId = &#63; and dataCode = &#63;.
	*
	* @param groupId the group ID
	* @param dataCode the data code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData fetchByG_DC_Last(
		long groupId, java.lang.String dataCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_DC_Last(groupId, dataCode, orderByComparator);
	}

	/**
	* Returns the dictionary datas before and after the current dictionary data in the ordered set where groupId = &#63; and dataCode = &#63;.
	*
	* @param dictDataId the primary key of the current dictionary data
	* @param groupId the group ID
	* @param dataCode the data code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dictionary data
	* @throws org.oep.core.datamgt.NoSuchDictDataException if a dictionary data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData[] findByG_DC_PrevAndNext(
		long dictDataId, long groupId, java.lang.String dataCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.NoSuchDictDataException {
		return getPersistence()
				   .findByG_DC_PrevAndNext(dictDataId, groupId, dataCode,
			orderByComparator);
	}

	/**
	* Returns all the dictionary datas that the user has permission to view where groupId = &#63; and dataCode = &#63;.
	*
	* @param groupId the group ID
	* @param dataCode the data code
	* @return the matching dictionary datas that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictData> filterFindByG_DC(
		long groupId, java.lang.String dataCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByG_DC(groupId, dataCode);
	}

	/**
	* Returns a range of all the dictionary datas that the user has permission to view where groupId = &#63; and dataCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param dataCode the data code
	* @param start the lower bound of the range of dictionary datas
	* @param end the upper bound of the range of dictionary datas (not inclusive)
	* @return the range of matching dictionary datas that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictData> filterFindByG_DC(
		long groupId, java.lang.String dataCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByG_DC(groupId, dataCode, start, end);
	}

	/**
	* Returns an ordered range of all the dictionary datas that the user has permissions to view where groupId = &#63; and dataCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param dataCode the data code
	* @param start the lower bound of the range of dictionary datas
	* @param end the upper bound of the range of dictionary datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dictionary datas that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictData> filterFindByG_DC(
		long groupId, java.lang.String dataCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByG_DC(groupId, dataCode, start, end,
			orderByComparator);
	}

	/**
	* Returns the dictionary datas before and after the current dictionary data in the ordered set of dictionary datas that the user has permission to view where groupId = &#63; and dataCode = &#63;.
	*
	* @param dictDataId the primary key of the current dictionary data
	* @param groupId the group ID
	* @param dataCode the data code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dictionary data
	* @throws org.oep.core.datamgt.NoSuchDictDataException if a dictionary data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData[] filterFindByG_DC_PrevAndNext(
		long dictDataId, long groupId, java.lang.String dataCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.NoSuchDictDataException {
		return getPersistence()
				   .filterFindByG_DC_PrevAndNext(dictDataId, groupId, dataCode,
			orderByComparator);
	}

	/**
	* Removes all the dictionary datas where groupId = &#63; and dataCode = &#63; from the database.
	*
	* @param groupId the group ID
	* @param dataCode the data code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_DC(long groupId, java.lang.String dataCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByG_DC(groupId, dataCode);
	}

	/**
	* Returns the number of dictionary datas where groupId = &#63; and dataCode = &#63;.
	*
	* @param groupId the group ID
	* @param dataCode the data code
	* @return the number of matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_DC(long groupId, java.lang.String dataCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_DC(groupId, dataCode);
	}

	/**
	* Returns the number of dictionary datas that the user has permission to view where groupId = &#63; and dataCode = &#63;.
	*
	* @param groupId the group ID
	* @param dataCode the data code
	* @return the number of matching dictionary datas that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static int filterCountByG_DC(long groupId, java.lang.String dataCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterCountByG_DC(groupId, dataCode);
	}

	/**
	* Returns all the dictionary datas where companyId = &#63; and collectionName = &#63; and dataLevel = &#63;.
	*
	* @param companyId the company ID
	* @param collectionName the collection name
	* @param dataLevel the data level
	* @return the matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictData> findByC_CN_DL(
		long companyId, java.lang.String collectionName, int dataLevel)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_CN_DL(companyId, collectionName, dataLevel);
	}

	/**
	* Returns a range of all the dictionary datas where companyId = &#63; and collectionName = &#63; and dataLevel = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param collectionName the collection name
	* @param dataLevel the data level
	* @param start the lower bound of the range of dictionary datas
	* @param end the upper bound of the range of dictionary datas (not inclusive)
	* @return the range of matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictData> findByC_CN_DL(
		long companyId, java.lang.String collectionName, int dataLevel,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_CN_DL(companyId, collectionName, dataLevel, start,
			end);
	}

	/**
	* Returns an ordered range of all the dictionary datas where companyId = &#63; and collectionName = &#63; and dataLevel = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param collectionName the collection name
	* @param dataLevel the data level
	* @param start the lower bound of the range of dictionary datas
	* @param end the upper bound of the range of dictionary datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictData> findByC_CN_DL(
		long companyId, java.lang.String collectionName, int dataLevel,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_CN_DL(companyId, collectionName, dataLevel, start,
			end, orderByComparator);
	}

	/**
	* Returns the first dictionary data in the ordered set where companyId = &#63; and collectionName = &#63; and dataLevel = &#63;.
	*
	* @param companyId the company ID
	* @param collectionName the collection name
	* @param dataLevel the data level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary data
	* @throws org.oep.core.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData findByC_CN_DL_First(
		long companyId, java.lang.String collectionName, int dataLevel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.NoSuchDictDataException {
		return getPersistence()
				   .findByC_CN_DL_First(companyId, collectionName, dataLevel,
			orderByComparator);
	}

	/**
	* Returns the first dictionary data in the ordered set where companyId = &#63; and collectionName = &#63; and dataLevel = &#63;.
	*
	* @param companyId the company ID
	* @param collectionName the collection name
	* @param dataLevel the data level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData fetchByC_CN_DL_First(
		long companyId, java.lang.String collectionName, int dataLevel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_CN_DL_First(companyId, collectionName, dataLevel,
			orderByComparator);
	}

	/**
	* Returns the last dictionary data in the ordered set where companyId = &#63; and collectionName = &#63; and dataLevel = &#63;.
	*
	* @param companyId the company ID
	* @param collectionName the collection name
	* @param dataLevel the data level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary data
	* @throws org.oep.core.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData findByC_CN_DL_Last(
		long companyId, java.lang.String collectionName, int dataLevel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.NoSuchDictDataException {
		return getPersistence()
				   .findByC_CN_DL_Last(companyId, collectionName, dataLevel,
			orderByComparator);
	}

	/**
	* Returns the last dictionary data in the ordered set where companyId = &#63; and collectionName = &#63; and dataLevel = &#63;.
	*
	* @param companyId the company ID
	* @param collectionName the collection name
	* @param dataLevel the data level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData fetchByC_CN_DL_Last(
		long companyId, java.lang.String collectionName, int dataLevel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_CN_DL_Last(companyId, collectionName, dataLevel,
			orderByComparator);
	}

	/**
	* Returns the dictionary datas before and after the current dictionary data in the ordered set where companyId = &#63; and collectionName = &#63; and dataLevel = &#63;.
	*
	* @param dictDataId the primary key of the current dictionary data
	* @param companyId the company ID
	* @param collectionName the collection name
	* @param dataLevel the data level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dictionary data
	* @throws org.oep.core.datamgt.NoSuchDictDataException if a dictionary data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData[] findByC_CN_DL_PrevAndNext(
		long dictDataId, long companyId, java.lang.String collectionName,
		int dataLevel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.NoSuchDictDataException {
		return getPersistence()
				   .findByC_CN_DL_PrevAndNext(dictDataId, companyId,
			collectionName, dataLevel, orderByComparator);
	}

	/**
	* Removes all the dictionary datas where companyId = &#63; and collectionName = &#63; and dataLevel = &#63; from the database.
	*
	* @param companyId the company ID
	* @param collectionName the collection name
	* @param dataLevel the data level
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_CN_DL(long companyId,
		java.lang.String collectionName, int dataLevel)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC_CN_DL(companyId, collectionName, dataLevel);
	}

	/**
	* Returns the number of dictionary datas where companyId = &#63; and collectionName = &#63; and dataLevel = &#63;.
	*
	* @param companyId the company ID
	* @param collectionName the collection name
	* @param dataLevel the data level
	* @return the number of matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_CN_DL(long companyId,
		java.lang.String collectionName, int dataLevel)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByC_CN_DL(companyId, collectionName, dataLevel);
	}

	/**
	* Returns all the dictionary datas where groupId = &#63; and collectionName = &#63; and dataLevel = &#63;.
	*
	* @param groupId the group ID
	* @param collectionName the collection name
	* @param dataLevel the data level
	* @return the matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictData> findByG_CN_DL(
		long groupId, java.lang.String collectionName, int dataLevel)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_CN_DL(groupId, collectionName, dataLevel);
	}

	/**
	* Returns a range of all the dictionary datas where groupId = &#63; and collectionName = &#63; and dataLevel = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param collectionName the collection name
	* @param dataLevel the data level
	* @param start the lower bound of the range of dictionary datas
	* @param end the upper bound of the range of dictionary datas (not inclusive)
	* @return the range of matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictData> findByG_CN_DL(
		long groupId, java.lang.String collectionName, int dataLevel,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_CN_DL(groupId, collectionName, dataLevel, start, end);
	}

	/**
	* Returns an ordered range of all the dictionary datas where groupId = &#63; and collectionName = &#63; and dataLevel = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param collectionName the collection name
	* @param dataLevel the data level
	* @param start the lower bound of the range of dictionary datas
	* @param end the upper bound of the range of dictionary datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictData> findByG_CN_DL(
		long groupId, java.lang.String collectionName, int dataLevel,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_CN_DL(groupId, collectionName, dataLevel, start,
			end, orderByComparator);
	}

	/**
	* Returns the first dictionary data in the ordered set where groupId = &#63; and collectionName = &#63; and dataLevel = &#63;.
	*
	* @param groupId the group ID
	* @param collectionName the collection name
	* @param dataLevel the data level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary data
	* @throws org.oep.core.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData findByG_CN_DL_First(
		long groupId, java.lang.String collectionName, int dataLevel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.NoSuchDictDataException {
		return getPersistence()
				   .findByG_CN_DL_First(groupId, collectionName, dataLevel,
			orderByComparator);
	}

	/**
	* Returns the first dictionary data in the ordered set where groupId = &#63; and collectionName = &#63; and dataLevel = &#63;.
	*
	* @param groupId the group ID
	* @param collectionName the collection name
	* @param dataLevel the data level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData fetchByG_CN_DL_First(
		long groupId, java.lang.String collectionName, int dataLevel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_CN_DL_First(groupId, collectionName, dataLevel,
			orderByComparator);
	}

	/**
	* Returns the last dictionary data in the ordered set where groupId = &#63; and collectionName = &#63; and dataLevel = &#63;.
	*
	* @param groupId the group ID
	* @param collectionName the collection name
	* @param dataLevel the data level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary data
	* @throws org.oep.core.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData findByG_CN_DL_Last(
		long groupId, java.lang.String collectionName, int dataLevel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.NoSuchDictDataException {
		return getPersistence()
				   .findByG_CN_DL_Last(groupId, collectionName, dataLevel,
			orderByComparator);
	}

	/**
	* Returns the last dictionary data in the ordered set where groupId = &#63; and collectionName = &#63; and dataLevel = &#63;.
	*
	* @param groupId the group ID
	* @param collectionName the collection name
	* @param dataLevel the data level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData fetchByG_CN_DL_Last(
		long groupId, java.lang.String collectionName, int dataLevel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_CN_DL_Last(groupId, collectionName, dataLevel,
			orderByComparator);
	}

	/**
	* Returns the dictionary datas before and after the current dictionary data in the ordered set where groupId = &#63; and collectionName = &#63; and dataLevel = &#63;.
	*
	* @param dictDataId the primary key of the current dictionary data
	* @param groupId the group ID
	* @param collectionName the collection name
	* @param dataLevel the data level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dictionary data
	* @throws org.oep.core.datamgt.NoSuchDictDataException if a dictionary data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData[] findByG_CN_DL_PrevAndNext(
		long dictDataId, long groupId, java.lang.String collectionName,
		int dataLevel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.NoSuchDictDataException {
		return getPersistence()
				   .findByG_CN_DL_PrevAndNext(dictDataId, groupId,
			collectionName, dataLevel, orderByComparator);
	}

	/**
	* Returns all the dictionary datas that the user has permission to view where groupId = &#63; and collectionName = &#63; and dataLevel = &#63;.
	*
	* @param groupId the group ID
	* @param collectionName the collection name
	* @param dataLevel the data level
	* @return the matching dictionary datas that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictData> filterFindByG_CN_DL(
		long groupId, java.lang.String collectionName, int dataLevel)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByG_CN_DL(groupId, collectionName, dataLevel);
	}

	/**
	* Returns a range of all the dictionary datas that the user has permission to view where groupId = &#63; and collectionName = &#63; and dataLevel = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param collectionName the collection name
	* @param dataLevel the data level
	* @param start the lower bound of the range of dictionary datas
	* @param end the upper bound of the range of dictionary datas (not inclusive)
	* @return the range of matching dictionary datas that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictData> filterFindByG_CN_DL(
		long groupId, java.lang.String collectionName, int dataLevel,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByG_CN_DL(groupId, collectionName, dataLevel,
			start, end);
	}

	/**
	* Returns an ordered range of all the dictionary datas that the user has permissions to view where groupId = &#63; and collectionName = &#63; and dataLevel = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param collectionName the collection name
	* @param dataLevel the data level
	* @param start the lower bound of the range of dictionary datas
	* @param end the upper bound of the range of dictionary datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dictionary datas that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictData> filterFindByG_CN_DL(
		long groupId, java.lang.String collectionName, int dataLevel,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByG_CN_DL(groupId, collectionName, dataLevel,
			start, end, orderByComparator);
	}

	/**
	* Returns the dictionary datas before and after the current dictionary data in the ordered set of dictionary datas that the user has permission to view where groupId = &#63; and collectionName = &#63; and dataLevel = &#63;.
	*
	* @param dictDataId the primary key of the current dictionary data
	* @param groupId the group ID
	* @param collectionName the collection name
	* @param dataLevel the data level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dictionary data
	* @throws org.oep.core.datamgt.NoSuchDictDataException if a dictionary data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData[] filterFindByG_CN_DL_PrevAndNext(
		long dictDataId, long groupId, java.lang.String collectionName,
		int dataLevel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.NoSuchDictDataException {
		return getPersistence()
				   .filterFindByG_CN_DL_PrevAndNext(dictDataId, groupId,
			collectionName, dataLevel, orderByComparator);
	}

	/**
	* Removes all the dictionary datas where groupId = &#63; and collectionName = &#63; and dataLevel = &#63; from the database.
	*
	* @param groupId the group ID
	* @param collectionName the collection name
	* @param dataLevel the data level
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_CN_DL(long groupId,
		java.lang.String collectionName, int dataLevel)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByG_CN_DL(groupId, collectionName, dataLevel);
	}

	/**
	* Returns the number of dictionary datas where groupId = &#63; and collectionName = &#63; and dataLevel = &#63;.
	*
	* @param groupId the group ID
	* @param collectionName the collection name
	* @param dataLevel the data level
	* @return the number of matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_CN_DL(long groupId,
		java.lang.String collectionName, int dataLevel)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByG_CN_DL(groupId, collectionName, dataLevel);
	}

	/**
	* Returns the number of dictionary datas that the user has permission to view where groupId = &#63; and collectionName = &#63; and dataLevel = &#63;.
	*
	* @param groupId the group ID
	* @param collectionName the collection name
	* @param dataLevel the data level
	* @return the number of matching dictionary datas that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static int filterCountByG_CN_DL(long groupId,
		java.lang.String collectionName, int dataLevel)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterCountByG_CN_DL(groupId, collectionName, dataLevel);
	}

	/**
	* Returns all the dictionary datas where companyId = &#63; and collectionName = &#63;.
	*
	* @param companyId the company ID
	* @param collectionName the collection name
	* @return the matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictData> findByC_CN(
		long companyId, java.lang.String collectionName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_CN(companyId, collectionName);
	}

	/**
	* Returns a range of all the dictionary datas where companyId = &#63; and collectionName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param collectionName the collection name
	* @param start the lower bound of the range of dictionary datas
	* @param end the upper bound of the range of dictionary datas (not inclusive)
	* @return the range of matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictData> findByC_CN(
		long companyId, java.lang.String collectionName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_CN(companyId, collectionName, start, end);
	}

	/**
	* Returns an ordered range of all the dictionary datas where companyId = &#63; and collectionName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param collectionName the collection name
	* @param start the lower bound of the range of dictionary datas
	* @param end the upper bound of the range of dictionary datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictData> findByC_CN(
		long companyId, java.lang.String collectionName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_CN(companyId, collectionName, start, end,
			orderByComparator);
	}

	/**
	* Returns the first dictionary data in the ordered set where companyId = &#63; and collectionName = &#63;.
	*
	* @param companyId the company ID
	* @param collectionName the collection name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary data
	* @throws org.oep.core.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData findByC_CN_First(
		long companyId, java.lang.String collectionName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.NoSuchDictDataException {
		return getPersistence()
				   .findByC_CN_First(companyId, collectionName,
			orderByComparator);
	}

	/**
	* Returns the first dictionary data in the ordered set where companyId = &#63; and collectionName = &#63;.
	*
	* @param companyId the company ID
	* @param collectionName the collection name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData fetchByC_CN_First(
		long companyId, java.lang.String collectionName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_CN_First(companyId, collectionName,
			orderByComparator);
	}

	/**
	* Returns the last dictionary data in the ordered set where companyId = &#63; and collectionName = &#63;.
	*
	* @param companyId the company ID
	* @param collectionName the collection name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary data
	* @throws org.oep.core.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData findByC_CN_Last(
		long companyId, java.lang.String collectionName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.NoSuchDictDataException {
		return getPersistence()
				   .findByC_CN_Last(companyId, collectionName, orderByComparator);
	}

	/**
	* Returns the last dictionary data in the ordered set where companyId = &#63; and collectionName = &#63;.
	*
	* @param companyId the company ID
	* @param collectionName the collection name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData fetchByC_CN_Last(
		long companyId, java.lang.String collectionName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_CN_Last(companyId, collectionName,
			orderByComparator);
	}

	/**
	* Returns the dictionary datas before and after the current dictionary data in the ordered set where companyId = &#63; and collectionName = &#63;.
	*
	* @param dictDataId the primary key of the current dictionary data
	* @param companyId the company ID
	* @param collectionName the collection name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dictionary data
	* @throws org.oep.core.datamgt.NoSuchDictDataException if a dictionary data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData[] findByC_CN_PrevAndNext(
		long dictDataId, long companyId, java.lang.String collectionName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.NoSuchDictDataException {
		return getPersistence()
				   .findByC_CN_PrevAndNext(dictDataId, companyId,
			collectionName, orderByComparator);
	}

	/**
	* Removes all the dictionary datas where companyId = &#63; and collectionName = &#63; from the database.
	*
	* @param companyId the company ID
	* @param collectionName the collection name
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_CN(long companyId,
		java.lang.String collectionName)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC_CN(companyId, collectionName);
	}

	/**
	* Returns the number of dictionary datas where companyId = &#63; and collectionName = &#63;.
	*
	* @param companyId the company ID
	* @param collectionName the collection name
	* @return the number of matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_CN(long companyId,
		java.lang.String collectionName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_CN(companyId, collectionName);
	}

	/**
	* Returns all the dictionary datas where groupId = &#63; and collectionName = &#63;.
	*
	* @param groupId the group ID
	* @param collectionName the collection name
	* @return the matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictData> findByG_CN(
		long groupId, java.lang.String collectionName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_CN(groupId, collectionName);
	}

	/**
	* Returns a range of all the dictionary datas where groupId = &#63; and collectionName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param collectionName the collection name
	* @param start the lower bound of the range of dictionary datas
	* @param end the upper bound of the range of dictionary datas (not inclusive)
	* @return the range of matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictData> findByG_CN(
		long groupId, java.lang.String collectionName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_CN(groupId, collectionName, start, end);
	}

	/**
	* Returns an ordered range of all the dictionary datas where groupId = &#63; and collectionName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param collectionName the collection name
	* @param start the lower bound of the range of dictionary datas
	* @param end the upper bound of the range of dictionary datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictData> findByG_CN(
		long groupId, java.lang.String collectionName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_CN(groupId, collectionName, start, end,
			orderByComparator);
	}

	/**
	* Returns the first dictionary data in the ordered set where groupId = &#63; and collectionName = &#63;.
	*
	* @param groupId the group ID
	* @param collectionName the collection name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary data
	* @throws org.oep.core.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData findByG_CN_First(
		long groupId, java.lang.String collectionName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.NoSuchDictDataException {
		return getPersistence()
				   .findByG_CN_First(groupId, collectionName, orderByComparator);
	}

	/**
	* Returns the first dictionary data in the ordered set where groupId = &#63; and collectionName = &#63;.
	*
	* @param groupId the group ID
	* @param collectionName the collection name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData fetchByG_CN_First(
		long groupId, java.lang.String collectionName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_CN_First(groupId, collectionName, orderByComparator);
	}

	/**
	* Returns the last dictionary data in the ordered set where groupId = &#63; and collectionName = &#63;.
	*
	* @param groupId the group ID
	* @param collectionName the collection name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary data
	* @throws org.oep.core.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData findByG_CN_Last(
		long groupId, java.lang.String collectionName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.NoSuchDictDataException {
		return getPersistence()
				   .findByG_CN_Last(groupId, collectionName, orderByComparator);
	}

	/**
	* Returns the last dictionary data in the ordered set where groupId = &#63; and collectionName = &#63;.
	*
	* @param groupId the group ID
	* @param collectionName the collection name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData fetchByG_CN_Last(
		long groupId, java.lang.String collectionName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_CN_Last(groupId, collectionName, orderByComparator);
	}

	/**
	* Returns the dictionary datas before and after the current dictionary data in the ordered set where groupId = &#63; and collectionName = &#63;.
	*
	* @param dictDataId the primary key of the current dictionary data
	* @param groupId the group ID
	* @param collectionName the collection name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dictionary data
	* @throws org.oep.core.datamgt.NoSuchDictDataException if a dictionary data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData[] findByG_CN_PrevAndNext(
		long dictDataId, long groupId, java.lang.String collectionName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.NoSuchDictDataException {
		return getPersistence()
				   .findByG_CN_PrevAndNext(dictDataId, groupId, collectionName,
			orderByComparator);
	}

	/**
	* Returns all the dictionary datas that the user has permission to view where groupId = &#63; and collectionName = &#63;.
	*
	* @param groupId the group ID
	* @param collectionName the collection name
	* @return the matching dictionary datas that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictData> filterFindByG_CN(
		long groupId, java.lang.String collectionName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByG_CN(groupId, collectionName);
	}

	/**
	* Returns a range of all the dictionary datas that the user has permission to view where groupId = &#63; and collectionName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param collectionName the collection name
	* @param start the lower bound of the range of dictionary datas
	* @param end the upper bound of the range of dictionary datas (not inclusive)
	* @return the range of matching dictionary datas that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictData> filterFindByG_CN(
		long groupId, java.lang.String collectionName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByG_CN(groupId, collectionName, start, end);
	}

	/**
	* Returns an ordered range of all the dictionary datas that the user has permissions to view where groupId = &#63; and collectionName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param collectionName the collection name
	* @param start the lower bound of the range of dictionary datas
	* @param end the upper bound of the range of dictionary datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dictionary datas that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictData> filterFindByG_CN(
		long groupId, java.lang.String collectionName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByG_CN(groupId, collectionName, start, end,
			orderByComparator);
	}

	/**
	* Returns the dictionary datas before and after the current dictionary data in the ordered set of dictionary datas that the user has permission to view where groupId = &#63; and collectionName = &#63;.
	*
	* @param dictDataId the primary key of the current dictionary data
	* @param groupId the group ID
	* @param collectionName the collection name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dictionary data
	* @throws org.oep.core.datamgt.NoSuchDictDataException if a dictionary data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData[] filterFindByG_CN_PrevAndNext(
		long dictDataId, long groupId, java.lang.String collectionName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.NoSuchDictDataException {
		return getPersistence()
				   .filterFindByG_CN_PrevAndNext(dictDataId, groupId,
			collectionName, orderByComparator);
	}

	/**
	* Removes all the dictionary datas where groupId = &#63; and collectionName = &#63; from the database.
	*
	* @param groupId the group ID
	* @param collectionName the collection name
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_CN(long groupId,
		java.lang.String collectionName)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByG_CN(groupId, collectionName);
	}

	/**
	* Returns the number of dictionary datas where groupId = &#63; and collectionName = &#63;.
	*
	* @param groupId the group ID
	* @param collectionName the collection name
	* @return the number of matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_CN(long groupId, java.lang.String collectionName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_CN(groupId, collectionName);
	}

	/**
	* Returns the number of dictionary datas that the user has permission to view where groupId = &#63; and collectionName = &#63;.
	*
	* @param groupId the group ID
	* @param collectionName the collection name
	* @return the number of matching dictionary datas that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static int filterCountByG_CN(long groupId,
		java.lang.String collectionName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterCountByG_CN(groupId, collectionName);
	}

	/**
	* Returns all the dictionary datas where groupId = &#63; and dataCode = &#63; and collectionName = &#63;.
	*
	* @param groupId the group ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @return the matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictData> findByG_DC_CN(
		long groupId, java.lang.String dataCode, java.lang.String collectionName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_DC_CN(groupId, dataCode, collectionName);
	}

	/**
	* Returns a range of all the dictionary datas where groupId = &#63; and dataCode = &#63; and collectionName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @param start the lower bound of the range of dictionary datas
	* @param end the upper bound of the range of dictionary datas (not inclusive)
	* @return the range of matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictData> findByG_DC_CN(
		long groupId, java.lang.String dataCode,
		java.lang.String collectionName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_DC_CN(groupId, dataCode, collectionName, start, end);
	}

	/**
	* Returns an ordered range of all the dictionary datas where groupId = &#63; and dataCode = &#63; and collectionName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @param start the lower bound of the range of dictionary datas
	* @param end the upper bound of the range of dictionary datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictData> findByG_DC_CN(
		long groupId, java.lang.String dataCode,
		java.lang.String collectionName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_DC_CN(groupId, dataCode, collectionName, start,
			end, orderByComparator);
	}

	/**
	* Returns the first dictionary data in the ordered set where groupId = &#63; and dataCode = &#63; and collectionName = &#63;.
	*
	* @param groupId the group ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary data
	* @throws org.oep.core.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData findByG_DC_CN_First(
		long groupId, java.lang.String dataCode,
		java.lang.String collectionName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.NoSuchDictDataException {
		return getPersistence()
				   .findByG_DC_CN_First(groupId, dataCode, collectionName,
			orderByComparator);
	}

	/**
	* Returns the first dictionary data in the ordered set where groupId = &#63; and dataCode = &#63; and collectionName = &#63;.
	*
	* @param groupId the group ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData fetchByG_DC_CN_First(
		long groupId, java.lang.String dataCode,
		java.lang.String collectionName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_DC_CN_First(groupId, dataCode, collectionName,
			orderByComparator);
	}

	/**
	* Returns the last dictionary data in the ordered set where groupId = &#63; and dataCode = &#63; and collectionName = &#63;.
	*
	* @param groupId the group ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary data
	* @throws org.oep.core.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData findByG_DC_CN_Last(
		long groupId, java.lang.String dataCode,
		java.lang.String collectionName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.NoSuchDictDataException {
		return getPersistence()
				   .findByG_DC_CN_Last(groupId, dataCode, collectionName,
			orderByComparator);
	}

	/**
	* Returns the last dictionary data in the ordered set where groupId = &#63; and dataCode = &#63; and collectionName = &#63;.
	*
	* @param groupId the group ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData fetchByG_DC_CN_Last(
		long groupId, java.lang.String dataCode,
		java.lang.String collectionName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_DC_CN_Last(groupId, dataCode, collectionName,
			orderByComparator);
	}

	/**
	* Returns the dictionary datas before and after the current dictionary data in the ordered set where groupId = &#63; and dataCode = &#63; and collectionName = &#63;.
	*
	* @param dictDataId the primary key of the current dictionary data
	* @param groupId the group ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dictionary data
	* @throws org.oep.core.datamgt.NoSuchDictDataException if a dictionary data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData[] findByG_DC_CN_PrevAndNext(
		long dictDataId, long groupId, java.lang.String dataCode,
		java.lang.String collectionName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.NoSuchDictDataException {
		return getPersistence()
				   .findByG_DC_CN_PrevAndNext(dictDataId, groupId, dataCode,
			collectionName, orderByComparator);
	}

	/**
	* Returns all the dictionary datas that the user has permission to view where groupId = &#63; and dataCode = &#63; and collectionName = &#63;.
	*
	* @param groupId the group ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @return the matching dictionary datas that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictData> filterFindByG_DC_CN(
		long groupId, java.lang.String dataCode, java.lang.String collectionName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByG_DC_CN(groupId, dataCode, collectionName);
	}

	/**
	* Returns a range of all the dictionary datas that the user has permission to view where groupId = &#63; and dataCode = &#63; and collectionName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @param start the lower bound of the range of dictionary datas
	* @param end the upper bound of the range of dictionary datas (not inclusive)
	* @return the range of matching dictionary datas that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictData> filterFindByG_DC_CN(
		long groupId, java.lang.String dataCode,
		java.lang.String collectionName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByG_DC_CN(groupId, dataCode, collectionName,
			start, end);
	}

	/**
	* Returns an ordered range of all the dictionary datas that the user has permissions to view where groupId = &#63; and dataCode = &#63; and collectionName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @param start the lower bound of the range of dictionary datas
	* @param end the upper bound of the range of dictionary datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dictionary datas that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictData> filterFindByG_DC_CN(
		long groupId, java.lang.String dataCode,
		java.lang.String collectionName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByG_DC_CN(groupId, dataCode, collectionName,
			start, end, orderByComparator);
	}

	/**
	* Returns the dictionary datas before and after the current dictionary data in the ordered set of dictionary datas that the user has permission to view where groupId = &#63; and dataCode = &#63; and collectionName = &#63;.
	*
	* @param dictDataId the primary key of the current dictionary data
	* @param groupId the group ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dictionary data
	* @throws org.oep.core.datamgt.NoSuchDictDataException if a dictionary data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData[] filterFindByG_DC_CN_PrevAndNext(
		long dictDataId, long groupId, java.lang.String dataCode,
		java.lang.String collectionName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.NoSuchDictDataException {
		return getPersistence()
				   .filterFindByG_DC_CN_PrevAndNext(dictDataId, groupId,
			dataCode, collectionName, orderByComparator);
	}

	/**
	* Removes all the dictionary datas where groupId = &#63; and dataCode = &#63; and collectionName = &#63; from the database.
	*
	* @param groupId the group ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_DC_CN(long groupId, java.lang.String dataCode,
		java.lang.String collectionName)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByG_DC_CN(groupId, dataCode, collectionName);
	}

	/**
	* Returns the number of dictionary datas where groupId = &#63; and dataCode = &#63; and collectionName = &#63;.
	*
	* @param groupId the group ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @return the number of matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_DC_CN(long groupId, java.lang.String dataCode,
		java.lang.String collectionName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_DC_CN(groupId, dataCode, collectionName);
	}

	/**
	* Returns the number of dictionary datas that the user has permission to view where groupId = &#63; and dataCode = &#63; and collectionName = &#63;.
	*
	* @param groupId the group ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @return the number of matching dictionary datas that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static int filterCountByG_DC_CN(long groupId,
		java.lang.String dataCode, java.lang.String collectionName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterCountByG_DC_CN(groupId, dataCode, collectionName);
	}

	/**
	* Returns all the dictionary datas where companyId = &#63; and dataCode = &#63; and collectionName = &#63;.
	*
	* @param companyId the company ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @return the matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictData> findByC_DC_CN(
		long companyId, java.lang.String dataCode,
		java.lang.String collectionName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_DC_CN(companyId, dataCode, collectionName);
	}

	/**
	* Returns a range of all the dictionary datas where companyId = &#63; and dataCode = &#63; and collectionName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @param start the lower bound of the range of dictionary datas
	* @param end the upper bound of the range of dictionary datas (not inclusive)
	* @return the range of matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictData> findByC_DC_CN(
		long companyId, java.lang.String dataCode,
		java.lang.String collectionName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_DC_CN(companyId, dataCode, collectionName, start,
			end);
	}

	/**
	* Returns an ordered range of all the dictionary datas where companyId = &#63; and dataCode = &#63; and collectionName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @param start the lower bound of the range of dictionary datas
	* @param end the upper bound of the range of dictionary datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictData> findByC_DC_CN(
		long companyId, java.lang.String dataCode,
		java.lang.String collectionName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_DC_CN(companyId, dataCode, collectionName, start,
			end, orderByComparator);
	}

	/**
	* Returns the first dictionary data in the ordered set where companyId = &#63; and dataCode = &#63; and collectionName = &#63;.
	*
	* @param companyId the company ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary data
	* @throws org.oep.core.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData findByC_DC_CN_First(
		long companyId, java.lang.String dataCode,
		java.lang.String collectionName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.NoSuchDictDataException {
		return getPersistence()
				   .findByC_DC_CN_First(companyId, dataCode, collectionName,
			orderByComparator);
	}

	/**
	* Returns the first dictionary data in the ordered set where companyId = &#63; and dataCode = &#63; and collectionName = &#63;.
	*
	* @param companyId the company ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData fetchByC_DC_CN_First(
		long companyId, java.lang.String dataCode,
		java.lang.String collectionName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_DC_CN_First(companyId, dataCode, collectionName,
			orderByComparator);
	}

	/**
	* Returns the last dictionary data in the ordered set where companyId = &#63; and dataCode = &#63; and collectionName = &#63;.
	*
	* @param companyId the company ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary data
	* @throws org.oep.core.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData findByC_DC_CN_Last(
		long companyId, java.lang.String dataCode,
		java.lang.String collectionName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.NoSuchDictDataException {
		return getPersistence()
				   .findByC_DC_CN_Last(companyId, dataCode, collectionName,
			orderByComparator);
	}

	/**
	* Returns the last dictionary data in the ordered set where companyId = &#63; and dataCode = &#63; and collectionName = &#63;.
	*
	* @param companyId the company ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData fetchByC_DC_CN_Last(
		long companyId, java.lang.String dataCode,
		java.lang.String collectionName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_DC_CN_Last(companyId, dataCode, collectionName,
			orderByComparator);
	}

	/**
	* Returns the dictionary datas before and after the current dictionary data in the ordered set where companyId = &#63; and dataCode = &#63; and collectionName = &#63;.
	*
	* @param dictDataId the primary key of the current dictionary data
	* @param companyId the company ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dictionary data
	* @throws org.oep.core.datamgt.NoSuchDictDataException if a dictionary data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData[] findByC_DC_CN_PrevAndNext(
		long dictDataId, long companyId, java.lang.String dataCode,
		java.lang.String collectionName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.NoSuchDictDataException {
		return getPersistence()
				   .findByC_DC_CN_PrevAndNext(dictDataId, companyId, dataCode,
			collectionName, orderByComparator);
	}

	/**
	* Removes all the dictionary datas where companyId = &#63; and dataCode = &#63; and collectionName = &#63; from the database.
	*
	* @param companyId the company ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_DC_CN(long companyId,
		java.lang.String dataCode, java.lang.String collectionName)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC_DC_CN(companyId, dataCode, collectionName);
	}

	/**
	* Returns the number of dictionary datas where companyId = &#63; and dataCode = &#63; and collectionName = &#63;.
	*
	* @param companyId the company ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @return the number of matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_DC_CN(long companyId, java.lang.String dataCode,
		java.lang.String collectionName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByC_DC_CN(companyId, dataCode, collectionName);
	}

	/**
	* Returns all the dictionary datas where groupId = &#63; and dataLevel = &#63;.
	*
	* @param groupId the group ID
	* @param dataLevel the data level
	* @return the matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictData> findByG_DL(
		long groupId, int dataLevel)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_DL(groupId, dataLevel);
	}

	/**
	* Returns a range of all the dictionary datas where groupId = &#63; and dataLevel = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param dataLevel the data level
	* @param start the lower bound of the range of dictionary datas
	* @param end the upper bound of the range of dictionary datas (not inclusive)
	* @return the range of matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictData> findByG_DL(
		long groupId, int dataLevel, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_DL(groupId, dataLevel, start, end);
	}

	/**
	* Returns an ordered range of all the dictionary datas where groupId = &#63; and dataLevel = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param dataLevel the data level
	* @param start the lower bound of the range of dictionary datas
	* @param end the upper bound of the range of dictionary datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictData> findByG_DL(
		long groupId, int dataLevel, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_DL(groupId, dataLevel, start, end, orderByComparator);
	}

	/**
	* Returns the first dictionary data in the ordered set where groupId = &#63; and dataLevel = &#63;.
	*
	* @param groupId the group ID
	* @param dataLevel the data level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary data
	* @throws org.oep.core.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData findByG_DL_First(
		long groupId, int dataLevel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.NoSuchDictDataException {
		return getPersistence()
				   .findByG_DL_First(groupId, dataLevel, orderByComparator);
	}

	/**
	* Returns the first dictionary data in the ordered set where groupId = &#63; and dataLevel = &#63;.
	*
	* @param groupId the group ID
	* @param dataLevel the data level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData fetchByG_DL_First(
		long groupId, int dataLevel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_DL_First(groupId, dataLevel, orderByComparator);
	}

	/**
	* Returns the last dictionary data in the ordered set where groupId = &#63; and dataLevel = &#63;.
	*
	* @param groupId the group ID
	* @param dataLevel the data level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary data
	* @throws org.oep.core.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData findByG_DL_Last(
		long groupId, int dataLevel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.NoSuchDictDataException {
		return getPersistence()
				   .findByG_DL_Last(groupId, dataLevel, orderByComparator);
	}

	/**
	* Returns the last dictionary data in the ordered set where groupId = &#63; and dataLevel = &#63;.
	*
	* @param groupId the group ID
	* @param dataLevel the data level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData fetchByG_DL_Last(
		long groupId, int dataLevel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_DL_Last(groupId, dataLevel, orderByComparator);
	}

	/**
	* Returns the dictionary datas before and after the current dictionary data in the ordered set where groupId = &#63; and dataLevel = &#63;.
	*
	* @param dictDataId the primary key of the current dictionary data
	* @param groupId the group ID
	* @param dataLevel the data level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dictionary data
	* @throws org.oep.core.datamgt.NoSuchDictDataException if a dictionary data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData[] findByG_DL_PrevAndNext(
		long dictDataId, long groupId, int dataLevel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.NoSuchDictDataException {
		return getPersistence()
				   .findByG_DL_PrevAndNext(dictDataId, groupId, dataLevel,
			orderByComparator);
	}

	/**
	* Returns all the dictionary datas that the user has permission to view where groupId = &#63; and dataLevel = &#63;.
	*
	* @param groupId the group ID
	* @param dataLevel the data level
	* @return the matching dictionary datas that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictData> filterFindByG_DL(
		long groupId, int dataLevel)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByG_DL(groupId, dataLevel);
	}

	/**
	* Returns a range of all the dictionary datas that the user has permission to view where groupId = &#63; and dataLevel = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param dataLevel the data level
	* @param start the lower bound of the range of dictionary datas
	* @param end the upper bound of the range of dictionary datas (not inclusive)
	* @return the range of matching dictionary datas that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictData> filterFindByG_DL(
		long groupId, int dataLevel, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByG_DL(groupId, dataLevel, start, end);
	}

	/**
	* Returns an ordered range of all the dictionary datas that the user has permissions to view where groupId = &#63; and dataLevel = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param dataLevel the data level
	* @param start the lower bound of the range of dictionary datas
	* @param end the upper bound of the range of dictionary datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dictionary datas that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictData> filterFindByG_DL(
		long groupId, int dataLevel, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByG_DL(groupId, dataLevel, start, end,
			orderByComparator);
	}

	/**
	* Returns the dictionary datas before and after the current dictionary data in the ordered set of dictionary datas that the user has permission to view where groupId = &#63; and dataLevel = &#63;.
	*
	* @param dictDataId the primary key of the current dictionary data
	* @param groupId the group ID
	* @param dataLevel the data level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dictionary data
	* @throws org.oep.core.datamgt.NoSuchDictDataException if a dictionary data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData[] filterFindByG_DL_PrevAndNext(
		long dictDataId, long groupId, int dataLevel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.NoSuchDictDataException {
		return getPersistence()
				   .filterFindByG_DL_PrevAndNext(dictDataId, groupId,
			dataLevel, orderByComparator);
	}

	/**
	* Removes all the dictionary datas where groupId = &#63; and dataLevel = &#63; from the database.
	*
	* @param groupId the group ID
	* @param dataLevel the data level
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_DL(long groupId, int dataLevel)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByG_DL(groupId, dataLevel);
	}

	/**
	* Returns the number of dictionary datas where groupId = &#63; and dataLevel = &#63;.
	*
	* @param groupId the group ID
	* @param dataLevel the data level
	* @return the number of matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_DL(long groupId, int dataLevel)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_DL(groupId, dataLevel);
	}

	/**
	* Returns the number of dictionary datas that the user has permission to view where groupId = &#63; and dataLevel = &#63;.
	*
	* @param groupId the group ID
	* @param dataLevel the data level
	* @return the number of matching dictionary datas that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static int filterCountByG_DL(long groupId, int dataLevel)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterCountByG_DL(groupId, dataLevel);
	}

	/**
	* Returns all the dictionary datas where companyId = &#63; and dataLevel = &#63;.
	*
	* @param companyId the company ID
	* @param dataLevel the data level
	* @return the matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictData> findByC_DL(
		long companyId, int dataLevel)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_DL(companyId, dataLevel);
	}

	/**
	* Returns a range of all the dictionary datas where companyId = &#63; and dataLevel = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param dataLevel the data level
	* @param start the lower bound of the range of dictionary datas
	* @param end the upper bound of the range of dictionary datas (not inclusive)
	* @return the range of matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictData> findByC_DL(
		long companyId, int dataLevel, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_DL(companyId, dataLevel, start, end);
	}

	/**
	* Returns an ordered range of all the dictionary datas where companyId = &#63; and dataLevel = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param dataLevel the data level
	* @param start the lower bound of the range of dictionary datas
	* @param end the upper bound of the range of dictionary datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictData> findByC_DL(
		long companyId, int dataLevel, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_DL(companyId, dataLevel, start, end,
			orderByComparator);
	}

	/**
	* Returns the first dictionary data in the ordered set where companyId = &#63; and dataLevel = &#63;.
	*
	* @param companyId the company ID
	* @param dataLevel the data level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary data
	* @throws org.oep.core.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData findByC_DL_First(
		long companyId, int dataLevel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.NoSuchDictDataException {
		return getPersistence()
				   .findByC_DL_First(companyId, dataLevel, orderByComparator);
	}

	/**
	* Returns the first dictionary data in the ordered set where companyId = &#63; and dataLevel = &#63;.
	*
	* @param companyId the company ID
	* @param dataLevel the data level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData fetchByC_DL_First(
		long companyId, int dataLevel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_DL_First(companyId, dataLevel, orderByComparator);
	}

	/**
	* Returns the last dictionary data in the ordered set where companyId = &#63; and dataLevel = &#63;.
	*
	* @param companyId the company ID
	* @param dataLevel the data level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary data
	* @throws org.oep.core.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData findByC_DL_Last(
		long companyId, int dataLevel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.NoSuchDictDataException {
		return getPersistence()
				   .findByC_DL_Last(companyId, dataLevel, orderByComparator);
	}

	/**
	* Returns the last dictionary data in the ordered set where companyId = &#63; and dataLevel = &#63;.
	*
	* @param companyId the company ID
	* @param dataLevel the data level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData fetchByC_DL_Last(
		long companyId, int dataLevel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_DL_Last(companyId, dataLevel, orderByComparator);
	}

	/**
	* Returns the dictionary datas before and after the current dictionary data in the ordered set where companyId = &#63; and dataLevel = &#63;.
	*
	* @param dictDataId the primary key of the current dictionary data
	* @param companyId the company ID
	* @param dataLevel the data level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dictionary data
	* @throws org.oep.core.datamgt.NoSuchDictDataException if a dictionary data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData[] findByC_DL_PrevAndNext(
		long dictDataId, long companyId, int dataLevel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.NoSuchDictDataException {
		return getPersistence()
				   .findByC_DL_PrevAndNext(dictDataId, companyId, dataLevel,
			orderByComparator);
	}

	/**
	* Removes all the dictionary datas where companyId = &#63; and dataLevel = &#63; from the database.
	*
	* @param companyId the company ID
	* @param dataLevel the data level
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_DL(long companyId, int dataLevel)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC_DL(companyId, dataLevel);
	}

	/**
	* Returns the number of dictionary datas where companyId = &#63; and dataLevel = &#63;.
	*
	* @param companyId the company ID
	* @param dataLevel the data level
	* @return the number of matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_DL(long companyId, int dataLevel)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_DL(companyId, dataLevel);
	}

	/**
	* Returns all the dictionary datas where groupId = &#63; and dataCode = &#63; and collectionName = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @param status the status
	* @return the matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictData> findByG_DC_CN_S(
		long groupId, java.lang.String dataCode,
		java.lang.String collectionName, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_DC_CN_S(groupId, dataCode, collectionName, status);
	}

	/**
	* Returns a range of all the dictionary datas where groupId = &#63; and dataCode = &#63; and collectionName = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @param status the status
	* @param start the lower bound of the range of dictionary datas
	* @param end the upper bound of the range of dictionary datas (not inclusive)
	* @return the range of matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictData> findByG_DC_CN_S(
		long groupId, java.lang.String dataCode,
		java.lang.String collectionName, int status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_DC_CN_S(groupId, dataCode, collectionName, status,
			start, end);
	}

	/**
	* Returns an ordered range of all the dictionary datas where groupId = &#63; and dataCode = &#63; and collectionName = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @param status the status
	* @param start the lower bound of the range of dictionary datas
	* @param end the upper bound of the range of dictionary datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictData> findByG_DC_CN_S(
		long groupId, java.lang.String dataCode,
		java.lang.String collectionName, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_DC_CN_S(groupId, dataCode, collectionName, status,
			start, end, orderByComparator);
	}

	/**
	* Returns the first dictionary data in the ordered set where groupId = &#63; and dataCode = &#63; and collectionName = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary data
	* @throws org.oep.core.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData findByG_DC_CN_S_First(
		long groupId, java.lang.String dataCode,
		java.lang.String collectionName, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.NoSuchDictDataException {
		return getPersistence()
				   .findByG_DC_CN_S_First(groupId, dataCode, collectionName,
			status, orderByComparator);
	}

	/**
	* Returns the first dictionary data in the ordered set where groupId = &#63; and dataCode = &#63; and collectionName = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData fetchByG_DC_CN_S_First(
		long groupId, java.lang.String dataCode,
		java.lang.String collectionName, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_DC_CN_S_First(groupId, dataCode, collectionName,
			status, orderByComparator);
	}

	/**
	* Returns the last dictionary data in the ordered set where groupId = &#63; and dataCode = &#63; and collectionName = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary data
	* @throws org.oep.core.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData findByG_DC_CN_S_Last(
		long groupId, java.lang.String dataCode,
		java.lang.String collectionName, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.NoSuchDictDataException {
		return getPersistence()
				   .findByG_DC_CN_S_Last(groupId, dataCode, collectionName,
			status, orderByComparator);
	}

	/**
	* Returns the last dictionary data in the ordered set where groupId = &#63; and dataCode = &#63; and collectionName = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData fetchByG_DC_CN_S_Last(
		long groupId, java.lang.String dataCode,
		java.lang.String collectionName, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_DC_CN_S_Last(groupId, dataCode, collectionName,
			status, orderByComparator);
	}

	/**
	* Returns the dictionary datas before and after the current dictionary data in the ordered set where groupId = &#63; and dataCode = &#63; and collectionName = &#63; and status = &#63;.
	*
	* @param dictDataId the primary key of the current dictionary data
	* @param groupId the group ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dictionary data
	* @throws org.oep.core.datamgt.NoSuchDictDataException if a dictionary data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData[] findByG_DC_CN_S_PrevAndNext(
		long dictDataId, long groupId, java.lang.String dataCode,
		java.lang.String collectionName, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.NoSuchDictDataException {
		return getPersistence()
				   .findByG_DC_CN_S_PrevAndNext(dictDataId, groupId, dataCode,
			collectionName, status, orderByComparator);
	}

	/**
	* Returns all the dictionary datas that the user has permission to view where groupId = &#63; and dataCode = &#63; and collectionName = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @param status the status
	* @return the matching dictionary datas that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictData> filterFindByG_DC_CN_S(
		long groupId, java.lang.String dataCode,
		java.lang.String collectionName, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByG_DC_CN_S(groupId, dataCode, collectionName,
			status);
	}

	/**
	* Returns a range of all the dictionary datas that the user has permission to view where groupId = &#63; and dataCode = &#63; and collectionName = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @param status the status
	* @param start the lower bound of the range of dictionary datas
	* @param end the upper bound of the range of dictionary datas (not inclusive)
	* @return the range of matching dictionary datas that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictData> filterFindByG_DC_CN_S(
		long groupId, java.lang.String dataCode,
		java.lang.String collectionName, int status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByG_DC_CN_S(groupId, dataCode, collectionName,
			status, start, end);
	}

	/**
	* Returns an ordered range of all the dictionary datas that the user has permissions to view where groupId = &#63; and dataCode = &#63; and collectionName = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @param status the status
	* @param start the lower bound of the range of dictionary datas
	* @param end the upper bound of the range of dictionary datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dictionary datas that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictData> filterFindByG_DC_CN_S(
		long groupId, java.lang.String dataCode,
		java.lang.String collectionName, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByG_DC_CN_S(groupId, dataCode, collectionName,
			status, start, end, orderByComparator);
	}

	/**
	* Returns the dictionary datas before and after the current dictionary data in the ordered set of dictionary datas that the user has permission to view where groupId = &#63; and dataCode = &#63; and collectionName = &#63; and status = &#63;.
	*
	* @param dictDataId the primary key of the current dictionary data
	* @param groupId the group ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dictionary data
	* @throws org.oep.core.datamgt.NoSuchDictDataException if a dictionary data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData[] filterFindByG_DC_CN_S_PrevAndNext(
		long dictDataId, long groupId, java.lang.String dataCode,
		java.lang.String collectionName, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.NoSuchDictDataException {
		return getPersistence()
				   .filterFindByG_DC_CN_S_PrevAndNext(dictDataId, groupId,
			dataCode, collectionName, status, orderByComparator);
	}

	/**
	* Removes all the dictionary datas where groupId = &#63; and dataCode = &#63; and collectionName = &#63; and status = &#63; from the database.
	*
	* @param groupId the group ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @param status the status
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_DC_CN_S(long groupId,
		java.lang.String dataCode, java.lang.String collectionName, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByG_DC_CN_S(groupId, dataCode, collectionName, status);
	}

	/**
	* Returns the number of dictionary datas where groupId = &#63; and dataCode = &#63; and collectionName = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @param status the status
	* @return the number of matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_DC_CN_S(long groupId, java.lang.String dataCode,
		java.lang.String collectionName, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByG_DC_CN_S(groupId, dataCode, collectionName, status);
	}

	/**
	* Returns the number of dictionary datas that the user has permission to view where groupId = &#63; and dataCode = &#63; and collectionName = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @param status the status
	* @return the number of matching dictionary datas that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static int filterCountByG_DC_CN_S(long groupId,
		java.lang.String dataCode, java.lang.String collectionName, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterCountByG_DC_CN_S(groupId, dataCode, collectionName,
			status);
	}

	/**
	* Returns all the dictionary datas where companyId = &#63; and dataCode = &#63; and collectionName = &#63; and status = &#63;.
	*
	* @param companyId the company ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @param status the status
	* @return the matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictData> findByC_DC_CN_S(
		long companyId, java.lang.String dataCode,
		java.lang.String collectionName, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_DC_CN_S(companyId, dataCode, collectionName, status);
	}

	/**
	* Returns a range of all the dictionary datas where companyId = &#63; and dataCode = &#63; and collectionName = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @param status the status
	* @param start the lower bound of the range of dictionary datas
	* @param end the upper bound of the range of dictionary datas (not inclusive)
	* @return the range of matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictData> findByC_DC_CN_S(
		long companyId, java.lang.String dataCode,
		java.lang.String collectionName, int status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_DC_CN_S(companyId, dataCode, collectionName,
			status, start, end);
	}

	/**
	* Returns an ordered range of all the dictionary datas where companyId = &#63; and dataCode = &#63; and collectionName = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @param status the status
	* @param start the lower bound of the range of dictionary datas
	* @param end the upper bound of the range of dictionary datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictData> findByC_DC_CN_S(
		long companyId, java.lang.String dataCode,
		java.lang.String collectionName, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_DC_CN_S(companyId, dataCode, collectionName,
			status, start, end, orderByComparator);
	}

	/**
	* Returns the first dictionary data in the ordered set where companyId = &#63; and dataCode = &#63; and collectionName = &#63; and status = &#63;.
	*
	* @param companyId the company ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary data
	* @throws org.oep.core.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData findByC_DC_CN_S_First(
		long companyId, java.lang.String dataCode,
		java.lang.String collectionName, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.NoSuchDictDataException {
		return getPersistence()
				   .findByC_DC_CN_S_First(companyId, dataCode, collectionName,
			status, orderByComparator);
	}

	/**
	* Returns the first dictionary data in the ordered set where companyId = &#63; and dataCode = &#63; and collectionName = &#63; and status = &#63;.
	*
	* @param companyId the company ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData fetchByC_DC_CN_S_First(
		long companyId, java.lang.String dataCode,
		java.lang.String collectionName, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_DC_CN_S_First(companyId, dataCode, collectionName,
			status, orderByComparator);
	}

	/**
	* Returns the last dictionary data in the ordered set where companyId = &#63; and dataCode = &#63; and collectionName = &#63; and status = &#63;.
	*
	* @param companyId the company ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary data
	* @throws org.oep.core.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData findByC_DC_CN_S_Last(
		long companyId, java.lang.String dataCode,
		java.lang.String collectionName, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.NoSuchDictDataException {
		return getPersistence()
				   .findByC_DC_CN_S_Last(companyId, dataCode, collectionName,
			status, orderByComparator);
	}

	/**
	* Returns the last dictionary data in the ordered set where companyId = &#63; and dataCode = &#63; and collectionName = &#63; and status = &#63;.
	*
	* @param companyId the company ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData fetchByC_DC_CN_S_Last(
		long companyId, java.lang.String dataCode,
		java.lang.String collectionName, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_DC_CN_S_Last(companyId, dataCode, collectionName,
			status, orderByComparator);
	}

	/**
	* Returns the dictionary datas before and after the current dictionary data in the ordered set where companyId = &#63; and dataCode = &#63; and collectionName = &#63; and status = &#63;.
	*
	* @param dictDataId the primary key of the current dictionary data
	* @param companyId the company ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dictionary data
	* @throws org.oep.core.datamgt.NoSuchDictDataException if a dictionary data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData[] findByC_DC_CN_S_PrevAndNext(
		long dictDataId, long companyId, java.lang.String dataCode,
		java.lang.String collectionName, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.NoSuchDictDataException {
		return getPersistence()
				   .findByC_DC_CN_S_PrevAndNext(dictDataId, companyId,
			dataCode, collectionName, status, orderByComparator);
	}

	/**
	* Removes all the dictionary datas where companyId = &#63; and dataCode = &#63; and collectionName = &#63; and status = &#63; from the database.
	*
	* @param companyId the company ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @param status the status
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_DC_CN_S(long companyId,
		java.lang.String dataCode, java.lang.String collectionName, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByC_DC_CN_S(companyId, dataCode, collectionName, status);
	}

	/**
	* Returns the number of dictionary datas where companyId = &#63; and dataCode = &#63; and collectionName = &#63; and status = &#63;.
	*
	* @param companyId the company ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @param status the status
	* @return the number of matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_DC_CN_S(long companyId,
		java.lang.String dataCode, java.lang.String collectionName, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByC_DC_CN_S(companyId, dataCode, collectionName, status);
	}

	/**
	* Caches the dictionary data in the entity cache if it is enabled.
	*
	* @param dictData the dictionary data
	*/
	public static void cacheResult(org.oep.core.datamgt.model.DictData dictData) {
		getPersistence().cacheResult(dictData);
	}

	/**
	* Caches the dictionary datas in the entity cache if it is enabled.
	*
	* @param dictDatas the dictionary datas
	*/
	public static void cacheResult(
		java.util.List<org.oep.core.datamgt.model.DictData> dictDatas) {
		getPersistence().cacheResult(dictDatas);
	}

	/**
	* Creates a new dictionary data with the primary key. Does not add the dictionary data to the database.
	*
	* @param dictDataId the primary key for the new dictionary data
	* @return the new dictionary data
	*/
	public static org.oep.core.datamgt.model.DictData create(long dictDataId) {
		return getPersistence().create(dictDataId);
	}

	/**
	* Removes the dictionary data with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dictDataId the primary key of the dictionary data
	* @return the dictionary data that was removed
	* @throws org.oep.core.datamgt.NoSuchDictDataException if a dictionary data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData remove(long dictDataId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.NoSuchDictDataException {
		return getPersistence().remove(dictDataId);
	}

	public static org.oep.core.datamgt.model.DictData updateImpl(
		org.oep.core.datamgt.model.DictData dictData)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dictData);
	}

	/**
	* Returns the dictionary data with the primary key or throws a {@link org.oep.core.datamgt.NoSuchDictDataException} if it could not be found.
	*
	* @param dictDataId the primary key of the dictionary data
	* @return the dictionary data
	* @throws org.oep.core.datamgt.NoSuchDictDataException if a dictionary data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData findByPrimaryKey(
		long dictDataId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.NoSuchDictDataException {
		return getPersistence().findByPrimaryKey(dictDataId);
	}

	/**
	* Returns the dictionary data with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param dictDataId the primary key of the dictionary data
	* @return the dictionary data, or <code>null</code> if a dictionary data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.datamgt.model.DictData fetchByPrimaryKey(
		long dictDataId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(dictDataId);
	}

	/**
	* Returns all the dictionary datas.
	*
	* @return the dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictData> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the dictionary datas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dictionary datas
	* @param end the upper bound of the range of dictionary datas (not inclusive)
	* @return the range of dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictData> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the dictionary datas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dictionary datas
	* @param end the upper bound of the range of dictionary datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictData> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dictionary datas from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dictionary datas.
	*
	* @return the number of dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	/**
	* Returns all the dictionary collections associated with the dictionary data.
	*
	* @param pk the primary key of the dictionary data
	* @return the dictionary collections associated with the dictionary data
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictCollection> getDictCollections(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getDictCollections(pk);
	}

	/**
	* Returns a range of all the dictionary collections associated with the dictionary data.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the dictionary data
	* @param start the lower bound of the range of dictionary datas
	* @param end the upper bound of the range of dictionary datas (not inclusive)
	* @return the range of dictionary collections associated with the dictionary data
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictCollection> getDictCollections(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getDictCollections(pk, start, end);
	}

	/**
	* Returns an ordered range of all the dictionary collections associated with the dictionary data.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the dictionary data
	* @param start the lower bound of the range of dictionary datas
	* @param end the upper bound of the range of dictionary datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dictionary collections associated with the dictionary data
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.datamgt.model.DictCollection> getDictCollections(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .getDictCollections(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of dictionary collections associated with the dictionary data.
	*
	* @param pk the primary key of the dictionary data
	* @return the number of dictionary collections associated with the dictionary data
	* @throws SystemException if a system exception occurred
	*/
	public static int getDictCollectionsSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getDictCollectionsSize(pk);
	}

	/**
	* Returns <code>true</code> if the dictionary collection is associated with the dictionary data.
	*
	* @param pk the primary key of the dictionary data
	* @param dictCollectionPK the primary key of the dictionary collection
	* @return <code>true</code> if the dictionary collection is associated with the dictionary data; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsDictCollection(long pk, long dictCollectionPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsDictCollection(pk, dictCollectionPK);
	}

	/**
	* Returns <code>true</code> if the dictionary data has any dictionary collections associated with it.
	*
	* @param pk the primary key of the dictionary data to check for associations with dictionary collections
	* @return <code>true</code> if the dictionary data has any dictionary collections associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsDictCollections(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsDictCollections(pk);
	}

	/**
	* Adds an association between the dictionary data and the dictionary collection. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dictionary data
	* @param dictCollectionPK the primary key of the dictionary collection
	* @throws SystemException if a system exception occurred
	*/
	public static void addDictCollection(long pk, long dictCollectionPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addDictCollection(pk, dictCollectionPK);
	}

	/**
	* Adds an association between the dictionary data and the dictionary collection. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dictionary data
	* @param dictCollection the dictionary collection
	* @throws SystemException if a system exception occurred
	*/
	public static void addDictCollection(long pk,
		org.oep.core.datamgt.model.DictCollection dictCollection)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addDictCollection(pk, dictCollection);
	}

	/**
	* Adds an association between the dictionary data and the dictionary collections. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dictionary data
	* @param dictCollectionPKs the primary keys of the dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public static void addDictCollections(long pk, long[] dictCollectionPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addDictCollections(pk, dictCollectionPKs);
	}

	/**
	* Adds an association between the dictionary data and the dictionary collections. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dictionary data
	* @param dictCollections the dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public static void addDictCollections(long pk,
		java.util.List<org.oep.core.datamgt.model.DictCollection> dictCollections)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addDictCollections(pk, dictCollections);
	}

	/**
	* Clears all associations between the dictionary data and its dictionary collections. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dictionary data to clear the associated dictionary collections from
	* @throws SystemException if a system exception occurred
	*/
	public static void clearDictCollections(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().clearDictCollections(pk);
	}

	/**
	* Removes the association between the dictionary data and the dictionary collection. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dictionary data
	* @param dictCollectionPK the primary key of the dictionary collection
	* @throws SystemException if a system exception occurred
	*/
	public static void removeDictCollection(long pk, long dictCollectionPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeDictCollection(pk, dictCollectionPK);
	}

	/**
	* Removes the association between the dictionary data and the dictionary collection. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dictionary data
	* @param dictCollection the dictionary collection
	* @throws SystemException if a system exception occurred
	*/
	public static void removeDictCollection(long pk,
		org.oep.core.datamgt.model.DictCollection dictCollection)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeDictCollection(pk, dictCollection);
	}

	/**
	* Removes the association between the dictionary data and the dictionary collections. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dictionary data
	* @param dictCollectionPKs the primary keys of the dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public static void removeDictCollections(long pk, long[] dictCollectionPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeDictCollections(pk, dictCollectionPKs);
	}

	/**
	* Removes the association between the dictionary data and the dictionary collections. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dictionary data
	* @param dictCollections the dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public static void removeDictCollections(long pk,
		java.util.List<org.oep.core.datamgt.model.DictCollection> dictCollections)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeDictCollections(pk, dictCollections);
	}

	/**
	* Sets the dictionary collections associated with the dictionary data, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dictionary data
	* @param dictCollectionPKs the primary keys of the dictionary collections to be associated with the dictionary data
	* @throws SystemException if a system exception occurred
	*/
	public static void setDictCollections(long pk, long[] dictCollectionPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setDictCollections(pk, dictCollectionPKs);
	}

	/**
	* Sets the dictionary collections associated with the dictionary data, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dictionary data
	* @param dictCollections the dictionary collections to be associated with the dictionary data
	* @throws SystemException if a system exception occurred
	*/
	public static void setDictCollections(long pk,
		java.util.List<org.oep.core.datamgt.model.DictCollection> dictCollections)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setDictCollections(pk, dictCollections);
	}

	public static DictDataPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DictDataPersistence)PortletBeanLocatorUtil.locate(org.oep.core.datamgt.service.ClpSerializer.getServletContextName(),
					DictDataPersistence.class.getName());

			ReferenceRegistry.registerReference(DictDataUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DictDataPersistence persistence) {
	}

	private static DictDataPersistence _persistence;
}