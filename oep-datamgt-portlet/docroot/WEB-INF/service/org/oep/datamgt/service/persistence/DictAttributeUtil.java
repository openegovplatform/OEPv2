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

package org.oep.datamgt.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import org.oep.datamgt.model.DictAttribute;

import java.util.List;

/**
 * The persistence utility for the dictionary attribute service. This utility wraps {@link DictAttributePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NQMINH
 * @see DictAttributePersistence
 * @see DictAttributePersistenceImpl
 * @generated
 */
public class DictAttributeUtil {
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
	public static void clearCache(DictAttribute dictAttribute) {
		getPersistence().clearCache(dictAttribute);
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
	public static List<DictAttribute> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DictAttribute> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DictAttribute> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static DictAttribute update(DictAttribute dictAttribute)
		throws SystemException {
		return getPersistence().update(dictAttribute);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static DictAttribute update(DictAttribute dictAttribute,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(dictAttribute, serviceContext);
	}

	/**
	* Returns all the dictionary attributes where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching dictionary attributes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictAttribute> findByC(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC(companyId);
	}

	/**
	* Returns a range of all the dictionary attributes where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictAttributeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of dictionary attributes
	* @param end the upper bound of the range of dictionary attributes (not inclusive)
	* @return the range of matching dictionary attributes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictAttribute> findByC(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC(companyId, start, end);
	}

	/**
	* Returns an ordered range of all the dictionary attributes where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictAttributeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of dictionary attributes
	* @param end the upper bound of the range of dictionary attributes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dictionary attributes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictAttribute> findByC(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC(companyId, start, end, orderByComparator);
	}

	/**
	* Returns the first dictionary attribute in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary attribute
	* @throws org.oep.datamgt.NoSuchDictAttributeException if a matching dictionary attribute could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictAttribute findByC_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictAttributeException {
		return getPersistence().findByC_First(companyId, orderByComparator);
	}

	/**
	* Returns the first dictionary attribute in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary attribute, or <code>null</code> if a matching dictionary attribute could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictAttribute fetchByC_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByC_First(companyId, orderByComparator);
	}

	/**
	* Returns the last dictionary attribute in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary attribute
	* @throws org.oep.datamgt.NoSuchDictAttributeException if a matching dictionary attribute could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictAttribute findByC_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictAttributeException {
		return getPersistence().findByC_Last(companyId, orderByComparator);
	}

	/**
	* Returns the last dictionary attribute in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary attribute, or <code>null</code> if a matching dictionary attribute could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictAttribute fetchByC_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByC_Last(companyId, orderByComparator);
	}

	/**
	* Returns the dictionary attributes before and after the current dictionary attribute in the ordered set where companyId = &#63;.
	*
	* @param dictAttributeId the primary key of the current dictionary attribute
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dictionary attribute
	* @throws org.oep.datamgt.NoSuchDictAttributeException if a dictionary attribute with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictAttribute[] findByC_PrevAndNext(
		long dictAttributeId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictAttributeException {
		return getPersistence()
				   .findByC_PrevAndNext(dictAttributeId, companyId,
			orderByComparator);
	}

	/**
	* Removes all the dictionary attributes where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC(companyId);
	}

	/**
	* Returns the number of dictionary attributes where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching dictionary attributes
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC(companyId);
	}

	/**
	* Returns all the dictionary attributes where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching dictionary attributes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictAttribute> findByG(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG(groupId);
	}

	/**
	* Returns a range of all the dictionary attributes where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictAttributeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of dictionary attributes
	* @param end the upper bound of the range of dictionary attributes (not inclusive)
	* @return the range of matching dictionary attributes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictAttribute> findByG(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the dictionary attributes where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictAttributeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of dictionary attributes
	* @param end the upper bound of the range of dictionary attributes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dictionary attributes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictAttribute> findByG(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG(groupId, start, end, orderByComparator);
	}

	/**
	* Returns the first dictionary attribute in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary attribute
	* @throws org.oep.datamgt.NoSuchDictAttributeException if a matching dictionary attribute could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictAttribute findByG_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictAttributeException {
		return getPersistence().findByG_First(groupId, orderByComparator);
	}

	/**
	* Returns the first dictionary attribute in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary attribute, or <code>null</code> if a matching dictionary attribute could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictAttribute fetchByG_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByG_First(groupId, orderByComparator);
	}

	/**
	* Returns the last dictionary attribute in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary attribute
	* @throws org.oep.datamgt.NoSuchDictAttributeException if a matching dictionary attribute could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictAttribute findByG_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictAttributeException {
		return getPersistence().findByG_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last dictionary attribute in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary attribute, or <code>null</code> if a matching dictionary attribute could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictAttribute fetchByG_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByG_Last(groupId, orderByComparator);
	}

	/**
	* Returns the dictionary attributes before and after the current dictionary attribute in the ordered set where groupId = &#63;.
	*
	* @param dictAttributeId the primary key of the current dictionary attribute
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dictionary attribute
	* @throws org.oep.datamgt.NoSuchDictAttributeException if a dictionary attribute with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictAttribute[] findByG_PrevAndNext(
		long dictAttributeId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictAttributeException {
		return getPersistence()
				   .findByG_PrevAndNext(dictAttributeId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the dictionary attributes where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByG(groupId);
	}

	/**
	* Returns the number of dictionary attributes where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching dictionary attributes
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG(groupId);
	}

	/**
	* Returns all the dictionary attributes where companyId = &#63; and collectionName = &#63;.
	*
	* @param companyId the company ID
	* @param collectionName the collection name
	* @return the matching dictionary attributes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictAttribute> findByC_CN(
		long companyId, java.lang.String collectionName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_CN(companyId, collectionName);
	}

	/**
	* Returns a range of all the dictionary attributes where companyId = &#63; and collectionName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictAttributeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param collectionName the collection name
	* @param start the lower bound of the range of dictionary attributes
	* @param end the upper bound of the range of dictionary attributes (not inclusive)
	* @return the range of matching dictionary attributes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictAttribute> findByC_CN(
		long companyId, java.lang.String collectionName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_CN(companyId, collectionName, start, end);
	}

	/**
	* Returns an ordered range of all the dictionary attributes where companyId = &#63; and collectionName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictAttributeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param collectionName the collection name
	* @param start the lower bound of the range of dictionary attributes
	* @param end the upper bound of the range of dictionary attributes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dictionary attributes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictAttribute> findByC_CN(
		long companyId, java.lang.String collectionName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_CN(companyId, collectionName, start, end,
			orderByComparator);
	}

	/**
	* Returns the first dictionary attribute in the ordered set where companyId = &#63; and collectionName = &#63;.
	*
	* @param companyId the company ID
	* @param collectionName the collection name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary attribute
	* @throws org.oep.datamgt.NoSuchDictAttributeException if a matching dictionary attribute could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictAttribute findByC_CN_First(
		long companyId, java.lang.String collectionName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictAttributeException {
		return getPersistence()
				   .findByC_CN_First(companyId, collectionName,
			orderByComparator);
	}

	/**
	* Returns the first dictionary attribute in the ordered set where companyId = &#63; and collectionName = &#63;.
	*
	* @param companyId the company ID
	* @param collectionName the collection name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary attribute, or <code>null</code> if a matching dictionary attribute could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictAttribute fetchByC_CN_First(
		long companyId, java.lang.String collectionName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_CN_First(companyId, collectionName,
			orderByComparator);
	}

	/**
	* Returns the last dictionary attribute in the ordered set where companyId = &#63; and collectionName = &#63;.
	*
	* @param companyId the company ID
	* @param collectionName the collection name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary attribute
	* @throws org.oep.datamgt.NoSuchDictAttributeException if a matching dictionary attribute could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictAttribute findByC_CN_Last(
		long companyId, java.lang.String collectionName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictAttributeException {
		return getPersistence()
				   .findByC_CN_Last(companyId, collectionName, orderByComparator);
	}

	/**
	* Returns the last dictionary attribute in the ordered set where companyId = &#63; and collectionName = &#63;.
	*
	* @param companyId the company ID
	* @param collectionName the collection name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary attribute, or <code>null</code> if a matching dictionary attribute could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictAttribute fetchByC_CN_Last(
		long companyId, java.lang.String collectionName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_CN_Last(companyId, collectionName,
			orderByComparator);
	}

	/**
	* Returns the dictionary attributes before and after the current dictionary attribute in the ordered set where companyId = &#63; and collectionName = &#63;.
	*
	* @param dictAttributeId the primary key of the current dictionary attribute
	* @param companyId the company ID
	* @param collectionName the collection name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dictionary attribute
	* @throws org.oep.datamgt.NoSuchDictAttributeException if a dictionary attribute with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictAttribute[] findByC_CN_PrevAndNext(
		long dictAttributeId, long companyId, java.lang.String collectionName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictAttributeException {
		return getPersistence()
				   .findByC_CN_PrevAndNext(dictAttributeId, companyId,
			collectionName, orderByComparator);
	}

	/**
	* Removes all the dictionary attributes where companyId = &#63; and collectionName = &#63; from the database.
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
	* Returns the number of dictionary attributes where companyId = &#63; and collectionName = &#63;.
	*
	* @param companyId the company ID
	* @param collectionName the collection name
	* @return the number of matching dictionary attributes
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_CN(long companyId,
		java.lang.String collectionName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_CN(companyId, collectionName);
	}

	/**
	* Returns all the dictionary attributes where groupId = &#63; and collectionName = &#63;.
	*
	* @param groupId the group ID
	* @param collectionName the collection name
	* @return the matching dictionary attributes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictAttribute> findByG_CN(
		long groupId, java.lang.String collectionName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_CN(groupId, collectionName);
	}

	/**
	* Returns a range of all the dictionary attributes where groupId = &#63; and collectionName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictAttributeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param collectionName the collection name
	* @param start the lower bound of the range of dictionary attributes
	* @param end the upper bound of the range of dictionary attributes (not inclusive)
	* @return the range of matching dictionary attributes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictAttribute> findByG_CN(
		long groupId, java.lang.String collectionName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_CN(groupId, collectionName, start, end);
	}

	/**
	* Returns an ordered range of all the dictionary attributes where groupId = &#63; and collectionName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictAttributeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param collectionName the collection name
	* @param start the lower bound of the range of dictionary attributes
	* @param end the upper bound of the range of dictionary attributes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dictionary attributes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictAttribute> findByG_CN(
		long groupId, java.lang.String collectionName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_CN(groupId, collectionName, start, end,
			orderByComparator);
	}

	/**
	* Returns the first dictionary attribute in the ordered set where groupId = &#63; and collectionName = &#63;.
	*
	* @param groupId the group ID
	* @param collectionName the collection name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary attribute
	* @throws org.oep.datamgt.NoSuchDictAttributeException if a matching dictionary attribute could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictAttribute findByG_CN_First(
		long groupId, java.lang.String collectionName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictAttributeException {
		return getPersistence()
				   .findByG_CN_First(groupId, collectionName, orderByComparator);
	}

	/**
	* Returns the first dictionary attribute in the ordered set where groupId = &#63; and collectionName = &#63;.
	*
	* @param groupId the group ID
	* @param collectionName the collection name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary attribute, or <code>null</code> if a matching dictionary attribute could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictAttribute fetchByG_CN_First(
		long groupId, java.lang.String collectionName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_CN_First(groupId, collectionName, orderByComparator);
	}

	/**
	* Returns the last dictionary attribute in the ordered set where groupId = &#63; and collectionName = &#63;.
	*
	* @param groupId the group ID
	* @param collectionName the collection name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary attribute
	* @throws org.oep.datamgt.NoSuchDictAttributeException if a matching dictionary attribute could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictAttribute findByG_CN_Last(
		long groupId, java.lang.String collectionName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictAttributeException {
		return getPersistence()
				   .findByG_CN_Last(groupId, collectionName, orderByComparator);
	}

	/**
	* Returns the last dictionary attribute in the ordered set where groupId = &#63; and collectionName = &#63;.
	*
	* @param groupId the group ID
	* @param collectionName the collection name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary attribute, or <code>null</code> if a matching dictionary attribute could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictAttribute fetchByG_CN_Last(
		long groupId, java.lang.String collectionName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_CN_Last(groupId, collectionName, orderByComparator);
	}

	/**
	* Returns the dictionary attributes before and after the current dictionary attribute in the ordered set where groupId = &#63; and collectionName = &#63;.
	*
	* @param dictAttributeId the primary key of the current dictionary attribute
	* @param groupId the group ID
	* @param collectionName the collection name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dictionary attribute
	* @throws org.oep.datamgt.NoSuchDictAttributeException if a dictionary attribute with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictAttribute[] findByG_CN_PrevAndNext(
		long dictAttributeId, long groupId, java.lang.String collectionName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictAttributeException {
		return getPersistence()
				   .findByG_CN_PrevAndNext(dictAttributeId, groupId,
			collectionName, orderByComparator);
	}

	/**
	* Removes all the dictionary attributes where groupId = &#63; and collectionName = &#63; from the database.
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
	* Returns the number of dictionary attributes where groupId = &#63; and collectionName = &#63;.
	*
	* @param groupId the group ID
	* @param collectionName the collection name
	* @return the number of matching dictionary attributes
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_CN(long groupId, java.lang.String collectionName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_CN(groupId, collectionName);
	}

	/**
	* Returns all the dictionary attributes where companyId = &#63; and collectionName = &#63; and dataType = &#63;.
	*
	* @param companyId the company ID
	* @param collectionName the collection name
	* @param dataType the data type
	* @return the matching dictionary attributes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictAttribute> findByC_CN_DT(
		long companyId, java.lang.String collectionName,
		java.lang.String dataType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_CN_DT(companyId, collectionName, dataType);
	}

	/**
	* Returns a range of all the dictionary attributes where companyId = &#63; and collectionName = &#63; and dataType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictAttributeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param collectionName the collection name
	* @param dataType the data type
	* @param start the lower bound of the range of dictionary attributes
	* @param end the upper bound of the range of dictionary attributes (not inclusive)
	* @return the range of matching dictionary attributes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictAttribute> findByC_CN_DT(
		long companyId, java.lang.String collectionName,
		java.lang.String dataType, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_CN_DT(companyId, collectionName, dataType, start,
			end);
	}

	/**
	* Returns an ordered range of all the dictionary attributes where companyId = &#63; and collectionName = &#63; and dataType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictAttributeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param collectionName the collection name
	* @param dataType the data type
	* @param start the lower bound of the range of dictionary attributes
	* @param end the upper bound of the range of dictionary attributes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dictionary attributes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictAttribute> findByC_CN_DT(
		long companyId, java.lang.String collectionName,
		java.lang.String dataType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_CN_DT(companyId, collectionName, dataType, start,
			end, orderByComparator);
	}

	/**
	* Returns the first dictionary attribute in the ordered set where companyId = &#63; and collectionName = &#63; and dataType = &#63;.
	*
	* @param companyId the company ID
	* @param collectionName the collection name
	* @param dataType the data type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary attribute
	* @throws org.oep.datamgt.NoSuchDictAttributeException if a matching dictionary attribute could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictAttribute findByC_CN_DT_First(
		long companyId, java.lang.String collectionName,
		java.lang.String dataType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictAttributeException {
		return getPersistence()
				   .findByC_CN_DT_First(companyId, collectionName, dataType,
			orderByComparator);
	}

	/**
	* Returns the first dictionary attribute in the ordered set where companyId = &#63; and collectionName = &#63; and dataType = &#63;.
	*
	* @param companyId the company ID
	* @param collectionName the collection name
	* @param dataType the data type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary attribute, or <code>null</code> if a matching dictionary attribute could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictAttribute fetchByC_CN_DT_First(
		long companyId, java.lang.String collectionName,
		java.lang.String dataType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_CN_DT_First(companyId, collectionName, dataType,
			orderByComparator);
	}

	/**
	* Returns the last dictionary attribute in the ordered set where companyId = &#63; and collectionName = &#63; and dataType = &#63;.
	*
	* @param companyId the company ID
	* @param collectionName the collection name
	* @param dataType the data type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary attribute
	* @throws org.oep.datamgt.NoSuchDictAttributeException if a matching dictionary attribute could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictAttribute findByC_CN_DT_Last(
		long companyId, java.lang.String collectionName,
		java.lang.String dataType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictAttributeException {
		return getPersistence()
				   .findByC_CN_DT_Last(companyId, collectionName, dataType,
			orderByComparator);
	}

	/**
	* Returns the last dictionary attribute in the ordered set where companyId = &#63; and collectionName = &#63; and dataType = &#63;.
	*
	* @param companyId the company ID
	* @param collectionName the collection name
	* @param dataType the data type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary attribute, or <code>null</code> if a matching dictionary attribute could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictAttribute fetchByC_CN_DT_Last(
		long companyId, java.lang.String collectionName,
		java.lang.String dataType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_CN_DT_Last(companyId, collectionName, dataType,
			orderByComparator);
	}

	/**
	* Returns the dictionary attributes before and after the current dictionary attribute in the ordered set where companyId = &#63; and collectionName = &#63; and dataType = &#63;.
	*
	* @param dictAttributeId the primary key of the current dictionary attribute
	* @param companyId the company ID
	* @param collectionName the collection name
	* @param dataType the data type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dictionary attribute
	* @throws org.oep.datamgt.NoSuchDictAttributeException if a dictionary attribute with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictAttribute[] findByC_CN_DT_PrevAndNext(
		long dictAttributeId, long companyId, java.lang.String collectionName,
		java.lang.String dataType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictAttributeException {
		return getPersistence()
				   .findByC_CN_DT_PrevAndNext(dictAttributeId, companyId,
			collectionName, dataType, orderByComparator);
	}

	/**
	* Removes all the dictionary attributes where companyId = &#63; and collectionName = &#63; and dataType = &#63; from the database.
	*
	* @param companyId the company ID
	* @param collectionName the collection name
	* @param dataType the data type
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_CN_DT(long companyId,
		java.lang.String collectionName, java.lang.String dataType)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC_CN_DT(companyId, collectionName, dataType);
	}

	/**
	* Returns the number of dictionary attributes where companyId = &#63; and collectionName = &#63; and dataType = &#63;.
	*
	* @param companyId the company ID
	* @param collectionName the collection name
	* @param dataType the data type
	* @return the number of matching dictionary attributes
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_CN_DT(long companyId,
		java.lang.String collectionName, java.lang.String dataType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByC_CN_DT(companyId, collectionName, dataType);
	}

	/**
	* Returns all the dictionary attributes where groupId = &#63; and collectionName = &#63; and dataType = &#63;.
	*
	* @param groupId the group ID
	* @param collectionName the collection name
	* @param dataType the data type
	* @return the matching dictionary attributes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictAttribute> findByG_CN_DT(
		long groupId, java.lang.String collectionName, java.lang.String dataType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_CN_DT(groupId, collectionName, dataType);
	}

	/**
	* Returns a range of all the dictionary attributes where groupId = &#63; and collectionName = &#63; and dataType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictAttributeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param collectionName the collection name
	* @param dataType the data type
	* @param start the lower bound of the range of dictionary attributes
	* @param end the upper bound of the range of dictionary attributes (not inclusive)
	* @return the range of matching dictionary attributes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictAttribute> findByG_CN_DT(
		long groupId, java.lang.String collectionName,
		java.lang.String dataType, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_CN_DT(groupId, collectionName, dataType, start, end);
	}

	/**
	* Returns an ordered range of all the dictionary attributes where groupId = &#63; and collectionName = &#63; and dataType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictAttributeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param collectionName the collection name
	* @param dataType the data type
	* @param start the lower bound of the range of dictionary attributes
	* @param end the upper bound of the range of dictionary attributes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dictionary attributes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictAttribute> findByG_CN_DT(
		long groupId, java.lang.String collectionName,
		java.lang.String dataType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_CN_DT(groupId, collectionName, dataType, start,
			end, orderByComparator);
	}

	/**
	* Returns the first dictionary attribute in the ordered set where groupId = &#63; and collectionName = &#63; and dataType = &#63;.
	*
	* @param groupId the group ID
	* @param collectionName the collection name
	* @param dataType the data type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary attribute
	* @throws org.oep.datamgt.NoSuchDictAttributeException if a matching dictionary attribute could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictAttribute findByG_CN_DT_First(
		long groupId, java.lang.String collectionName,
		java.lang.String dataType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictAttributeException {
		return getPersistence()
				   .findByG_CN_DT_First(groupId, collectionName, dataType,
			orderByComparator);
	}

	/**
	* Returns the first dictionary attribute in the ordered set where groupId = &#63; and collectionName = &#63; and dataType = &#63;.
	*
	* @param groupId the group ID
	* @param collectionName the collection name
	* @param dataType the data type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary attribute, or <code>null</code> if a matching dictionary attribute could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictAttribute fetchByG_CN_DT_First(
		long groupId, java.lang.String collectionName,
		java.lang.String dataType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_CN_DT_First(groupId, collectionName, dataType,
			orderByComparator);
	}

	/**
	* Returns the last dictionary attribute in the ordered set where groupId = &#63; and collectionName = &#63; and dataType = &#63;.
	*
	* @param groupId the group ID
	* @param collectionName the collection name
	* @param dataType the data type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary attribute
	* @throws org.oep.datamgt.NoSuchDictAttributeException if a matching dictionary attribute could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictAttribute findByG_CN_DT_Last(
		long groupId, java.lang.String collectionName,
		java.lang.String dataType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictAttributeException {
		return getPersistence()
				   .findByG_CN_DT_Last(groupId, collectionName, dataType,
			orderByComparator);
	}

	/**
	* Returns the last dictionary attribute in the ordered set where groupId = &#63; and collectionName = &#63; and dataType = &#63;.
	*
	* @param groupId the group ID
	* @param collectionName the collection name
	* @param dataType the data type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary attribute, or <code>null</code> if a matching dictionary attribute could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictAttribute fetchByG_CN_DT_Last(
		long groupId, java.lang.String collectionName,
		java.lang.String dataType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_CN_DT_Last(groupId, collectionName, dataType,
			orderByComparator);
	}

	/**
	* Returns the dictionary attributes before and after the current dictionary attribute in the ordered set where groupId = &#63; and collectionName = &#63; and dataType = &#63;.
	*
	* @param dictAttributeId the primary key of the current dictionary attribute
	* @param groupId the group ID
	* @param collectionName the collection name
	* @param dataType the data type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dictionary attribute
	* @throws org.oep.datamgt.NoSuchDictAttributeException if a dictionary attribute with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictAttribute[] findByG_CN_DT_PrevAndNext(
		long dictAttributeId, long groupId, java.lang.String collectionName,
		java.lang.String dataType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictAttributeException {
		return getPersistence()
				   .findByG_CN_DT_PrevAndNext(dictAttributeId, groupId,
			collectionName, dataType, orderByComparator);
	}

	/**
	* Removes all the dictionary attributes where groupId = &#63; and collectionName = &#63; and dataType = &#63; from the database.
	*
	* @param groupId the group ID
	* @param collectionName the collection name
	* @param dataType the data type
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_CN_DT(long groupId,
		java.lang.String collectionName, java.lang.String dataType)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByG_CN_DT(groupId, collectionName, dataType);
	}

	/**
	* Returns the number of dictionary attributes where groupId = &#63; and collectionName = &#63; and dataType = &#63;.
	*
	* @param groupId the group ID
	* @param collectionName the collection name
	* @param dataType the data type
	* @return the number of matching dictionary attributes
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_CN_DT(long groupId,
		java.lang.String collectionName, java.lang.String dataType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_CN_DT(groupId, collectionName, dataType);
	}

	/**
	* Returns all the dictionary attributes where companyId = &#63; and dataType = &#63;.
	*
	* @param companyId the company ID
	* @param dataType the data type
	* @return the matching dictionary attributes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictAttribute> findByC_DT(
		long companyId, java.lang.String dataType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_DT(companyId, dataType);
	}

	/**
	* Returns a range of all the dictionary attributes where companyId = &#63; and dataType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictAttributeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param dataType the data type
	* @param start the lower bound of the range of dictionary attributes
	* @param end the upper bound of the range of dictionary attributes (not inclusive)
	* @return the range of matching dictionary attributes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictAttribute> findByC_DT(
		long companyId, java.lang.String dataType, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_DT(companyId, dataType, start, end);
	}

	/**
	* Returns an ordered range of all the dictionary attributes where companyId = &#63; and dataType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictAttributeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param dataType the data type
	* @param start the lower bound of the range of dictionary attributes
	* @param end the upper bound of the range of dictionary attributes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dictionary attributes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictAttribute> findByC_DT(
		long companyId, java.lang.String dataType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_DT(companyId, dataType, start, end,
			orderByComparator);
	}

	/**
	* Returns the first dictionary attribute in the ordered set where companyId = &#63; and dataType = &#63;.
	*
	* @param companyId the company ID
	* @param dataType the data type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary attribute
	* @throws org.oep.datamgt.NoSuchDictAttributeException if a matching dictionary attribute could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictAttribute findByC_DT_First(
		long companyId, java.lang.String dataType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictAttributeException {
		return getPersistence()
				   .findByC_DT_First(companyId, dataType, orderByComparator);
	}

	/**
	* Returns the first dictionary attribute in the ordered set where companyId = &#63; and dataType = &#63;.
	*
	* @param companyId the company ID
	* @param dataType the data type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary attribute, or <code>null</code> if a matching dictionary attribute could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictAttribute fetchByC_DT_First(
		long companyId, java.lang.String dataType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_DT_First(companyId, dataType, orderByComparator);
	}

	/**
	* Returns the last dictionary attribute in the ordered set where companyId = &#63; and dataType = &#63;.
	*
	* @param companyId the company ID
	* @param dataType the data type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary attribute
	* @throws org.oep.datamgt.NoSuchDictAttributeException if a matching dictionary attribute could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictAttribute findByC_DT_Last(
		long companyId, java.lang.String dataType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictAttributeException {
		return getPersistence()
				   .findByC_DT_Last(companyId, dataType, orderByComparator);
	}

	/**
	* Returns the last dictionary attribute in the ordered set where companyId = &#63; and dataType = &#63;.
	*
	* @param companyId the company ID
	* @param dataType the data type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary attribute, or <code>null</code> if a matching dictionary attribute could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictAttribute fetchByC_DT_Last(
		long companyId, java.lang.String dataType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_DT_Last(companyId, dataType, orderByComparator);
	}

	/**
	* Returns the dictionary attributes before and after the current dictionary attribute in the ordered set where companyId = &#63; and dataType = &#63;.
	*
	* @param dictAttributeId the primary key of the current dictionary attribute
	* @param companyId the company ID
	* @param dataType the data type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dictionary attribute
	* @throws org.oep.datamgt.NoSuchDictAttributeException if a dictionary attribute with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictAttribute[] findByC_DT_PrevAndNext(
		long dictAttributeId, long companyId, java.lang.String dataType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictAttributeException {
		return getPersistence()
				   .findByC_DT_PrevAndNext(dictAttributeId, companyId,
			dataType, orderByComparator);
	}

	/**
	* Removes all the dictionary attributes where companyId = &#63; and dataType = &#63; from the database.
	*
	* @param companyId the company ID
	* @param dataType the data type
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_DT(long companyId, java.lang.String dataType)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC_DT(companyId, dataType);
	}

	/**
	* Returns the number of dictionary attributes where companyId = &#63; and dataType = &#63;.
	*
	* @param companyId the company ID
	* @param dataType the data type
	* @return the number of matching dictionary attributes
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_DT(long companyId, java.lang.String dataType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_DT(companyId, dataType);
	}

	/**
	* Returns all the dictionary attributes where groupId = &#63; and dataType = &#63;.
	*
	* @param groupId the group ID
	* @param dataType the data type
	* @return the matching dictionary attributes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictAttribute> findByG_DT(
		long groupId, java.lang.String dataType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_DT(groupId, dataType);
	}

	/**
	* Returns a range of all the dictionary attributes where groupId = &#63; and dataType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictAttributeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param dataType the data type
	* @param start the lower bound of the range of dictionary attributes
	* @param end the upper bound of the range of dictionary attributes (not inclusive)
	* @return the range of matching dictionary attributes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictAttribute> findByG_DT(
		long groupId, java.lang.String dataType, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_DT(groupId, dataType, start, end);
	}

	/**
	* Returns an ordered range of all the dictionary attributes where groupId = &#63; and dataType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictAttributeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param dataType the data type
	* @param start the lower bound of the range of dictionary attributes
	* @param end the upper bound of the range of dictionary attributes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dictionary attributes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictAttribute> findByG_DT(
		long groupId, java.lang.String dataType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_DT(groupId, dataType, start, end, orderByComparator);
	}

	/**
	* Returns the first dictionary attribute in the ordered set where groupId = &#63; and dataType = &#63;.
	*
	* @param groupId the group ID
	* @param dataType the data type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary attribute
	* @throws org.oep.datamgt.NoSuchDictAttributeException if a matching dictionary attribute could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictAttribute findByG_DT_First(
		long groupId, java.lang.String dataType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictAttributeException {
		return getPersistence()
				   .findByG_DT_First(groupId, dataType, orderByComparator);
	}

	/**
	* Returns the first dictionary attribute in the ordered set where groupId = &#63; and dataType = &#63;.
	*
	* @param groupId the group ID
	* @param dataType the data type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary attribute, or <code>null</code> if a matching dictionary attribute could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictAttribute fetchByG_DT_First(
		long groupId, java.lang.String dataType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_DT_First(groupId, dataType, orderByComparator);
	}

	/**
	* Returns the last dictionary attribute in the ordered set where groupId = &#63; and dataType = &#63;.
	*
	* @param groupId the group ID
	* @param dataType the data type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary attribute
	* @throws org.oep.datamgt.NoSuchDictAttributeException if a matching dictionary attribute could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictAttribute findByG_DT_Last(
		long groupId, java.lang.String dataType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictAttributeException {
		return getPersistence()
				   .findByG_DT_Last(groupId, dataType, orderByComparator);
	}

	/**
	* Returns the last dictionary attribute in the ordered set where groupId = &#63; and dataType = &#63;.
	*
	* @param groupId the group ID
	* @param dataType the data type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary attribute, or <code>null</code> if a matching dictionary attribute could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictAttribute fetchByG_DT_Last(
		long groupId, java.lang.String dataType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_DT_Last(groupId, dataType, orderByComparator);
	}

	/**
	* Returns the dictionary attributes before and after the current dictionary attribute in the ordered set where groupId = &#63; and dataType = &#63;.
	*
	* @param dictAttributeId the primary key of the current dictionary attribute
	* @param groupId the group ID
	* @param dataType the data type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dictionary attribute
	* @throws org.oep.datamgt.NoSuchDictAttributeException if a dictionary attribute with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictAttribute[] findByG_DT_PrevAndNext(
		long dictAttributeId, long groupId, java.lang.String dataType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictAttributeException {
		return getPersistence()
				   .findByG_DT_PrevAndNext(dictAttributeId, groupId, dataType,
			orderByComparator);
	}

	/**
	* Removes all the dictionary attributes where groupId = &#63; and dataType = &#63; from the database.
	*
	* @param groupId the group ID
	* @param dataType the data type
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_DT(long groupId, java.lang.String dataType)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByG_DT(groupId, dataType);
	}

	/**
	* Returns the number of dictionary attributes where groupId = &#63; and dataType = &#63;.
	*
	* @param groupId the group ID
	* @param dataType the data type
	* @return the number of matching dictionary attributes
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_DT(long groupId, java.lang.String dataType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_DT(groupId, dataType);
	}

	/**
	* Caches the dictionary attribute in the entity cache if it is enabled.
	*
	* @param dictAttribute the dictionary attribute
	*/
	public static void cacheResult(
		org.oep.datamgt.model.DictAttribute dictAttribute) {
		getPersistence().cacheResult(dictAttribute);
	}

	/**
	* Caches the dictionary attributes in the entity cache if it is enabled.
	*
	* @param dictAttributes the dictionary attributes
	*/
	public static void cacheResult(
		java.util.List<org.oep.datamgt.model.DictAttribute> dictAttributes) {
		getPersistence().cacheResult(dictAttributes);
	}

	/**
	* Creates a new dictionary attribute with the primary key. Does not add the dictionary attribute to the database.
	*
	* @param dictAttributeId the primary key for the new dictionary attribute
	* @return the new dictionary attribute
	*/
	public static org.oep.datamgt.model.DictAttribute create(
		long dictAttributeId) {
		return getPersistence().create(dictAttributeId);
	}

	/**
	* Removes the dictionary attribute with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dictAttributeId the primary key of the dictionary attribute
	* @return the dictionary attribute that was removed
	* @throws org.oep.datamgt.NoSuchDictAttributeException if a dictionary attribute with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictAttribute remove(
		long dictAttributeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictAttributeException {
		return getPersistence().remove(dictAttributeId);
	}

	public static org.oep.datamgt.model.DictAttribute updateImpl(
		org.oep.datamgt.model.DictAttribute dictAttribute)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dictAttribute);
	}

	/**
	* Returns the dictionary attribute with the primary key or throws a {@link org.oep.datamgt.NoSuchDictAttributeException} if it could not be found.
	*
	* @param dictAttributeId the primary key of the dictionary attribute
	* @return the dictionary attribute
	* @throws org.oep.datamgt.NoSuchDictAttributeException if a dictionary attribute with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictAttribute findByPrimaryKey(
		long dictAttributeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictAttributeException {
		return getPersistence().findByPrimaryKey(dictAttributeId);
	}

	/**
	* Returns the dictionary attribute with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param dictAttributeId the primary key of the dictionary attribute
	* @return the dictionary attribute, or <code>null</code> if a dictionary attribute with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictAttribute fetchByPrimaryKey(
		long dictAttributeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(dictAttributeId);
	}

	/**
	* Returns all the dictionary attributes.
	*
	* @return the dictionary attributes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictAttribute> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the dictionary attributes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictAttributeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dictionary attributes
	* @param end the upper bound of the range of dictionary attributes (not inclusive)
	* @return the range of dictionary attributes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictAttribute> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the dictionary attributes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictAttributeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dictionary attributes
	* @param end the upper bound of the range of dictionary attributes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dictionary attributes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictAttribute> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dictionary attributes from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dictionary attributes.
	*
	* @return the number of dictionary attributes
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DictAttributePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DictAttributePersistence)PortletBeanLocatorUtil.locate(org.oep.datamgt.service.ClpSerializer.getServletContextName(),
					DictAttributePersistence.class.getName());

			ReferenceRegistry.registerReference(DictAttributeUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DictAttributePersistence persistence) {
	}

	private static DictAttributePersistence _persistence;
}