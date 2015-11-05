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

import org.oep.datamgt.model.DictCollection;

import java.util.List;

/**
 * The persistence utility for the dictionary collection service. This utility wraps {@link DictCollectionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NQMINH
 * @see DictCollectionPersistence
 * @see DictCollectionPersistenceImpl
 * @generated
 */
public class DictCollectionUtil {
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
	public static void clearCache(DictCollection dictCollection) {
		getPersistence().clearCache(dictCollection);
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
	public static List<DictCollection> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DictCollection> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DictCollection> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static DictCollection update(DictCollection dictCollection)
		throws SystemException {
		return getPersistence().update(dictCollection);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static DictCollection update(DictCollection dictCollection,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(dictCollection, serviceContext);
	}

	/**
	* Returns all the dictionary collections where groupId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @return the matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictCollection> findByG_N(
		long groupId, java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_N(groupId, name);
	}

	/**
	* Returns a range of all the dictionary collections where groupId = &#63; and name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param name the name
	* @param start the lower bound of the range of dictionary collections
	* @param end the upper bound of the range of dictionary collections (not inclusive)
	* @return the range of matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictCollection> findByG_N(
		long groupId, java.lang.String name, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_N(groupId, name, start, end);
	}

	/**
	* Returns an ordered range of all the dictionary collections where groupId = &#63; and name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param name the name
	* @param start the lower bound of the range of dictionary collections
	* @param end the upper bound of the range of dictionary collections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictCollection> findByG_N(
		long groupId, java.lang.String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_N(groupId, name, start, end, orderByComparator);
	}

	/**
	* Returns the first dictionary collection in the ordered set where groupId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary collection
	* @throws org.oep.datamgt.NoSuchDictCollectionException if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictCollection findByG_N_First(
		long groupId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException {
		return getPersistence().findByG_N_First(groupId, name, orderByComparator);
	}

	/**
	* Returns the first dictionary collection in the ordered set where groupId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary collection, or <code>null</code> if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictCollection fetchByG_N_First(
		long groupId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_N_First(groupId, name, orderByComparator);
	}

	/**
	* Returns the last dictionary collection in the ordered set where groupId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary collection
	* @throws org.oep.datamgt.NoSuchDictCollectionException if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictCollection findByG_N_Last(
		long groupId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException {
		return getPersistence().findByG_N_Last(groupId, name, orderByComparator);
	}

	/**
	* Returns the last dictionary collection in the ordered set where groupId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary collection, or <code>null</code> if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictCollection fetchByG_N_Last(
		long groupId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByG_N_Last(groupId, name, orderByComparator);
	}

	/**
	* Returns the dictionary collections before and after the current dictionary collection in the ordered set where groupId = &#63; and name = &#63;.
	*
	* @param dictCollectionId the primary key of the current dictionary collection
	* @param groupId the group ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dictionary collection
	* @throws org.oep.datamgt.NoSuchDictCollectionException if a dictionary collection with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictCollection[] findByG_N_PrevAndNext(
		long dictCollectionId, long groupId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException {
		return getPersistence()
				   .findByG_N_PrevAndNext(dictCollectionId, groupId, name,
			orderByComparator);
	}

	/**
	* Removes all the dictionary collections where groupId = &#63; and name = &#63; from the database.
	*
	* @param groupId the group ID
	* @param name the name
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_N(long groupId, java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByG_N(groupId, name);
	}

	/**
	* Returns the number of dictionary collections where groupId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @return the number of matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_N(long groupId, java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_N(groupId, name);
	}

	/**
	* Returns all the dictionary collections where companyId = &#63; and name = &#63;.
	*
	* @param companyId the company ID
	* @param name the name
	* @return the matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictCollection> findByC_N(
		long companyId, java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_N(companyId, name);
	}

	/**
	* Returns a range of all the dictionary collections where companyId = &#63; and name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param name the name
	* @param start the lower bound of the range of dictionary collections
	* @param end the upper bound of the range of dictionary collections (not inclusive)
	* @return the range of matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictCollection> findByC_N(
		long companyId, java.lang.String name, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_N(companyId, name, start, end);
	}

	/**
	* Returns an ordered range of all the dictionary collections where companyId = &#63; and name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param name the name
	* @param start the lower bound of the range of dictionary collections
	* @param end the upper bound of the range of dictionary collections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictCollection> findByC_N(
		long companyId, java.lang.String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_N(companyId, name, start, end, orderByComparator);
	}

	/**
	* Returns the first dictionary collection in the ordered set where companyId = &#63; and name = &#63;.
	*
	* @param companyId the company ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary collection
	* @throws org.oep.datamgt.NoSuchDictCollectionException if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictCollection findByC_N_First(
		long companyId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException {
		return getPersistence()
				   .findByC_N_First(companyId, name, orderByComparator);
	}

	/**
	* Returns the first dictionary collection in the ordered set where companyId = &#63; and name = &#63;.
	*
	* @param companyId the company ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary collection, or <code>null</code> if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictCollection fetchByC_N_First(
		long companyId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_N_First(companyId, name, orderByComparator);
	}

	/**
	* Returns the last dictionary collection in the ordered set where companyId = &#63; and name = &#63;.
	*
	* @param companyId the company ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary collection
	* @throws org.oep.datamgt.NoSuchDictCollectionException if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictCollection findByC_N_Last(
		long companyId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException {
		return getPersistence()
				   .findByC_N_Last(companyId, name, orderByComparator);
	}

	/**
	* Returns the last dictionary collection in the ordered set where companyId = &#63; and name = &#63;.
	*
	* @param companyId the company ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary collection, or <code>null</code> if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictCollection fetchByC_N_Last(
		long companyId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_N_Last(companyId, name, orderByComparator);
	}

	/**
	* Returns the dictionary collections before and after the current dictionary collection in the ordered set where companyId = &#63; and name = &#63;.
	*
	* @param dictCollectionId the primary key of the current dictionary collection
	* @param companyId the company ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dictionary collection
	* @throws org.oep.datamgt.NoSuchDictCollectionException if a dictionary collection with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictCollection[] findByC_N_PrevAndNext(
		long dictCollectionId, long companyId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException {
		return getPersistence()
				   .findByC_N_PrevAndNext(dictCollectionId, companyId, name,
			orderByComparator);
	}

	/**
	* Removes all the dictionary collections where companyId = &#63; and name = &#63; from the database.
	*
	* @param companyId the company ID
	* @param name the name
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_N(long companyId, java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC_N(companyId, name);
	}

	/**
	* Returns the number of dictionary collections where companyId = &#63; and name = &#63;.
	*
	* @param companyId the company ID
	* @param name the name
	* @return the number of matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_N(long companyId, java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_N(companyId, name);
	}

	/**
	* Returns all the dictionary collections where companyId = &#63; and name LIKE &#63;.
	*
	* @param companyId the company ID
	* @param name the name
	* @return the matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictCollection> findByC_LikeN(
		long companyId, java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_LikeN(companyId, name);
	}

	/**
	* Returns a range of all the dictionary collections where companyId = &#63; and name LIKE &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param name the name
	* @param start the lower bound of the range of dictionary collections
	* @param end the upper bound of the range of dictionary collections (not inclusive)
	* @return the range of matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictCollection> findByC_LikeN(
		long companyId, java.lang.String name, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_LikeN(companyId, name, start, end);
	}

	/**
	* Returns an ordered range of all the dictionary collections where companyId = &#63; and name LIKE &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param name the name
	* @param start the lower bound of the range of dictionary collections
	* @param end the upper bound of the range of dictionary collections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictCollection> findByC_LikeN(
		long companyId, java.lang.String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_LikeN(companyId, name, start, end, orderByComparator);
	}

	/**
	* Returns the first dictionary collection in the ordered set where companyId = &#63; and name LIKE &#63;.
	*
	* @param companyId the company ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary collection
	* @throws org.oep.datamgt.NoSuchDictCollectionException if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictCollection findByC_LikeN_First(
		long companyId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException {
		return getPersistence()
				   .findByC_LikeN_First(companyId, name, orderByComparator);
	}

	/**
	* Returns the first dictionary collection in the ordered set where companyId = &#63; and name LIKE &#63;.
	*
	* @param companyId the company ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary collection, or <code>null</code> if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictCollection fetchByC_LikeN_First(
		long companyId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_LikeN_First(companyId, name, orderByComparator);
	}

	/**
	* Returns the last dictionary collection in the ordered set where companyId = &#63; and name LIKE &#63;.
	*
	* @param companyId the company ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary collection
	* @throws org.oep.datamgt.NoSuchDictCollectionException if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictCollection findByC_LikeN_Last(
		long companyId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException {
		return getPersistence()
				   .findByC_LikeN_Last(companyId, name, orderByComparator);
	}

	/**
	* Returns the last dictionary collection in the ordered set where companyId = &#63; and name LIKE &#63;.
	*
	* @param companyId the company ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary collection, or <code>null</code> if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictCollection fetchByC_LikeN_Last(
		long companyId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_LikeN_Last(companyId, name, orderByComparator);
	}

	/**
	* Returns the dictionary collections before and after the current dictionary collection in the ordered set where companyId = &#63; and name LIKE &#63;.
	*
	* @param dictCollectionId the primary key of the current dictionary collection
	* @param companyId the company ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dictionary collection
	* @throws org.oep.datamgt.NoSuchDictCollectionException if a dictionary collection with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictCollection[] findByC_LikeN_PrevAndNext(
		long dictCollectionId, long companyId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException {
		return getPersistence()
				   .findByC_LikeN_PrevAndNext(dictCollectionId, companyId,
			name, orderByComparator);
	}

	/**
	* Removes all the dictionary collections where companyId = &#63; and name LIKE &#63; from the database.
	*
	* @param companyId the company ID
	* @param name the name
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_LikeN(long companyId, java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC_LikeN(companyId, name);
	}

	/**
	* Returns the number of dictionary collections where companyId = &#63; and name LIKE &#63;.
	*
	* @param companyId the company ID
	* @param name the name
	* @return the number of matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_LikeN(long companyId, java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_LikeN(companyId, name);
	}

	/**
	* Returns all the dictionary collections where groupId = &#63; and name LIKE &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @return the matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictCollection> findByG_LikeN(
		long groupId, java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_LikeN(groupId, name);
	}

	/**
	* Returns a range of all the dictionary collections where groupId = &#63; and name LIKE &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param name the name
	* @param start the lower bound of the range of dictionary collections
	* @param end the upper bound of the range of dictionary collections (not inclusive)
	* @return the range of matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictCollection> findByG_LikeN(
		long groupId, java.lang.String name, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_LikeN(groupId, name, start, end);
	}

	/**
	* Returns an ordered range of all the dictionary collections where groupId = &#63; and name LIKE &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param name the name
	* @param start the lower bound of the range of dictionary collections
	* @param end the upper bound of the range of dictionary collections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictCollection> findByG_LikeN(
		long groupId, java.lang.String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_LikeN(groupId, name, start, end, orderByComparator);
	}

	/**
	* Returns the first dictionary collection in the ordered set where groupId = &#63; and name LIKE &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary collection
	* @throws org.oep.datamgt.NoSuchDictCollectionException if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictCollection findByG_LikeN_First(
		long groupId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException {
		return getPersistence()
				   .findByG_LikeN_First(groupId, name, orderByComparator);
	}

	/**
	* Returns the first dictionary collection in the ordered set where groupId = &#63; and name LIKE &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary collection, or <code>null</code> if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictCollection fetchByG_LikeN_First(
		long groupId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_LikeN_First(groupId, name, orderByComparator);
	}

	/**
	* Returns the last dictionary collection in the ordered set where groupId = &#63; and name LIKE &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary collection
	* @throws org.oep.datamgt.NoSuchDictCollectionException if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictCollection findByG_LikeN_Last(
		long groupId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException {
		return getPersistence()
				   .findByG_LikeN_Last(groupId, name, orderByComparator);
	}

	/**
	* Returns the last dictionary collection in the ordered set where groupId = &#63; and name LIKE &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary collection, or <code>null</code> if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictCollection fetchByG_LikeN_Last(
		long groupId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_LikeN_Last(groupId, name, orderByComparator);
	}

	/**
	* Returns the dictionary collections before and after the current dictionary collection in the ordered set where groupId = &#63; and name LIKE &#63;.
	*
	* @param dictCollectionId the primary key of the current dictionary collection
	* @param groupId the group ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dictionary collection
	* @throws org.oep.datamgt.NoSuchDictCollectionException if a dictionary collection with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictCollection[] findByG_LikeN_PrevAndNext(
		long dictCollectionId, long groupId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException {
		return getPersistence()
				   .findByG_LikeN_PrevAndNext(dictCollectionId, groupId, name,
			orderByComparator);
	}

	/**
	* Removes all the dictionary collections where groupId = &#63; and name LIKE &#63; from the database.
	*
	* @param groupId the group ID
	* @param name the name
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_LikeN(long groupId, java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByG_LikeN(groupId, name);
	}

	/**
	* Returns the number of dictionary collections where groupId = &#63; and name LIKE &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @return the number of matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_LikeN(long groupId, java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_LikeN(groupId, name);
	}

	/**
	* Returns the dictionary collection where companyId = &#63; and name = &#63; and version = &#63; or throws a {@link org.oep.datamgt.NoSuchDictCollectionException} if it could not be found.
	*
	* @param companyId the company ID
	* @param name the name
	* @param version the version
	* @return the matching dictionary collection
	* @throws org.oep.datamgt.NoSuchDictCollectionException if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictCollection findByC_N_V(
		long companyId, java.lang.String name, java.lang.String version)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException {
		return getPersistence().findByC_N_V(companyId, name, version);
	}

	/**
	* Returns the dictionary collection where companyId = &#63; and name = &#63; and version = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param companyId the company ID
	* @param name the name
	* @param version the version
	* @return the matching dictionary collection, or <code>null</code> if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictCollection fetchByC_N_V(
		long companyId, java.lang.String name, java.lang.String version)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByC_N_V(companyId, name, version);
	}

	/**
	* Returns the dictionary collection where companyId = &#63; and name = &#63; and version = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param companyId the company ID
	* @param name the name
	* @param version the version
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dictionary collection, or <code>null</code> if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictCollection fetchByC_N_V(
		long companyId, java.lang.String name, java.lang.String version,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_N_V(companyId, name, version, retrieveFromCache);
	}

	/**
	* Removes the dictionary collection where companyId = &#63; and name = &#63; and version = &#63; from the database.
	*
	* @param companyId the company ID
	* @param name the name
	* @param version the version
	* @return the dictionary collection that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictCollection removeByC_N_V(
		long companyId, java.lang.String name, java.lang.String version)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException {
		return getPersistence().removeByC_N_V(companyId, name, version);
	}

	/**
	* Returns the number of dictionary collections where companyId = &#63; and name = &#63; and version = &#63;.
	*
	* @param companyId the company ID
	* @param name the name
	* @param version the version
	* @return the number of matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_N_V(long companyId, java.lang.String name,
		java.lang.String version)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_N_V(companyId, name, version);
	}

	/**
	* Returns the dictionary collection where groupId = &#63; and name = &#63; and version = &#63; or throws a {@link org.oep.datamgt.NoSuchDictCollectionException} if it could not be found.
	*
	* @param groupId the group ID
	* @param name the name
	* @param version the version
	* @return the matching dictionary collection
	* @throws org.oep.datamgt.NoSuchDictCollectionException if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictCollection findByG_N_V(
		long groupId, java.lang.String name, java.lang.String version)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException {
		return getPersistence().findByG_N_V(groupId, name, version);
	}

	/**
	* Returns the dictionary collection where groupId = &#63; and name = &#63; and version = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param name the name
	* @param version the version
	* @return the matching dictionary collection, or <code>null</code> if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictCollection fetchByG_N_V(
		long groupId, java.lang.String name, java.lang.String version)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByG_N_V(groupId, name, version);
	}

	/**
	* Returns the dictionary collection where groupId = &#63; and name = &#63; and version = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group ID
	* @param name the name
	* @param version the version
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dictionary collection, or <code>null</code> if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictCollection fetchByG_N_V(
		long groupId, java.lang.String name, java.lang.String version,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_N_V(groupId, name, version, retrieveFromCache);
	}

	/**
	* Removes the dictionary collection where groupId = &#63; and name = &#63; and version = &#63; from the database.
	*
	* @param groupId the group ID
	* @param name the name
	* @param version the version
	* @return the dictionary collection that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictCollection removeByG_N_V(
		long groupId, java.lang.String name, java.lang.String version)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException {
		return getPersistence().removeByG_N_V(groupId, name, version);
	}

	/**
	* Returns the number of dictionary collections where groupId = &#63; and name = &#63; and version = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param version the version
	* @return the number of matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_N_V(long groupId, java.lang.String name,
		java.lang.String version)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_N_V(groupId, name, version);
	}

	/**
	* Returns all the dictionary collections where companyId = &#63; and name LIKE &#63; and version = &#63;.
	*
	* @param companyId the company ID
	* @param name the name
	* @param version the version
	* @return the matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictCollection> findByC_LikeN_V(
		long companyId, java.lang.String name, java.lang.String version)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_LikeN_V(companyId, name, version);
	}

	/**
	* Returns a range of all the dictionary collections where companyId = &#63; and name LIKE &#63; and version = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param name the name
	* @param version the version
	* @param start the lower bound of the range of dictionary collections
	* @param end the upper bound of the range of dictionary collections (not inclusive)
	* @return the range of matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictCollection> findByC_LikeN_V(
		long companyId, java.lang.String name, java.lang.String version,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_LikeN_V(companyId, name, version, start, end);
	}

	/**
	* Returns an ordered range of all the dictionary collections where companyId = &#63; and name LIKE &#63; and version = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param name the name
	* @param version the version
	* @param start the lower bound of the range of dictionary collections
	* @param end the upper bound of the range of dictionary collections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictCollection> findByC_LikeN_V(
		long companyId, java.lang.String name, java.lang.String version,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_LikeN_V(companyId, name, version, start, end,
			orderByComparator);
	}

	/**
	* Returns the first dictionary collection in the ordered set where companyId = &#63; and name LIKE &#63; and version = &#63;.
	*
	* @param companyId the company ID
	* @param name the name
	* @param version the version
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary collection
	* @throws org.oep.datamgt.NoSuchDictCollectionException if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictCollection findByC_LikeN_V_First(
		long companyId, java.lang.String name, java.lang.String version,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException {
		return getPersistence()
				   .findByC_LikeN_V_First(companyId, name, version,
			orderByComparator);
	}

	/**
	* Returns the first dictionary collection in the ordered set where companyId = &#63; and name LIKE &#63; and version = &#63;.
	*
	* @param companyId the company ID
	* @param name the name
	* @param version the version
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary collection, or <code>null</code> if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictCollection fetchByC_LikeN_V_First(
		long companyId, java.lang.String name, java.lang.String version,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_LikeN_V_First(companyId, name, version,
			orderByComparator);
	}

	/**
	* Returns the last dictionary collection in the ordered set where companyId = &#63; and name LIKE &#63; and version = &#63;.
	*
	* @param companyId the company ID
	* @param name the name
	* @param version the version
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary collection
	* @throws org.oep.datamgt.NoSuchDictCollectionException if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictCollection findByC_LikeN_V_Last(
		long companyId, java.lang.String name, java.lang.String version,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException {
		return getPersistence()
				   .findByC_LikeN_V_Last(companyId, name, version,
			orderByComparator);
	}

	/**
	* Returns the last dictionary collection in the ordered set where companyId = &#63; and name LIKE &#63; and version = &#63;.
	*
	* @param companyId the company ID
	* @param name the name
	* @param version the version
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary collection, or <code>null</code> if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictCollection fetchByC_LikeN_V_Last(
		long companyId, java.lang.String name, java.lang.String version,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_LikeN_V_Last(companyId, name, version,
			orderByComparator);
	}

	/**
	* Returns the dictionary collections before and after the current dictionary collection in the ordered set where companyId = &#63; and name LIKE &#63; and version = &#63;.
	*
	* @param dictCollectionId the primary key of the current dictionary collection
	* @param companyId the company ID
	* @param name the name
	* @param version the version
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dictionary collection
	* @throws org.oep.datamgt.NoSuchDictCollectionException if a dictionary collection with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictCollection[] findByC_LikeN_V_PrevAndNext(
		long dictCollectionId, long companyId, java.lang.String name,
		java.lang.String version,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException {
		return getPersistence()
				   .findByC_LikeN_V_PrevAndNext(dictCollectionId, companyId,
			name, version, orderByComparator);
	}

	/**
	* Removes all the dictionary collections where companyId = &#63; and name LIKE &#63; and version = &#63; from the database.
	*
	* @param companyId the company ID
	* @param name the name
	* @param version the version
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_LikeN_V(long companyId, java.lang.String name,
		java.lang.String version)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC_LikeN_V(companyId, name, version);
	}

	/**
	* Returns the number of dictionary collections where companyId = &#63; and name LIKE &#63; and version = &#63;.
	*
	* @param companyId the company ID
	* @param name the name
	* @param version the version
	* @return the number of matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_LikeN_V(long companyId, java.lang.String name,
		java.lang.String version)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_LikeN_V(companyId, name, version);
	}

	/**
	* Returns all the dictionary collections where groupId = &#63; and name LIKE &#63; and version = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param version the version
	* @return the matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictCollection> findByG_LikeN_V(
		long groupId, java.lang.String name, java.lang.String version)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_LikeN_V(groupId, name, version);
	}

	/**
	* Returns a range of all the dictionary collections where groupId = &#63; and name LIKE &#63; and version = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param name the name
	* @param version the version
	* @param start the lower bound of the range of dictionary collections
	* @param end the upper bound of the range of dictionary collections (not inclusive)
	* @return the range of matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictCollection> findByG_LikeN_V(
		long groupId, java.lang.String name, java.lang.String version,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_LikeN_V(groupId, name, version, start, end);
	}

	/**
	* Returns an ordered range of all the dictionary collections where groupId = &#63; and name LIKE &#63; and version = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param name the name
	* @param version the version
	* @param start the lower bound of the range of dictionary collections
	* @param end the upper bound of the range of dictionary collections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictCollection> findByG_LikeN_V(
		long groupId, java.lang.String name, java.lang.String version,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_LikeN_V(groupId, name, version, start, end,
			orderByComparator);
	}

	/**
	* Returns the first dictionary collection in the ordered set where groupId = &#63; and name LIKE &#63; and version = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param version the version
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary collection
	* @throws org.oep.datamgt.NoSuchDictCollectionException if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictCollection findByG_LikeN_V_First(
		long groupId, java.lang.String name, java.lang.String version,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException {
		return getPersistence()
				   .findByG_LikeN_V_First(groupId, name, version,
			orderByComparator);
	}

	/**
	* Returns the first dictionary collection in the ordered set where groupId = &#63; and name LIKE &#63; and version = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param version the version
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary collection, or <code>null</code> if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictCollection fetchByG_LikeN_V_First(
		long groupId, java.lang.String name, java.lang.String version,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_LikeN_V_First(groupId, name, version,
			orderByComparator);
	}

	/**
	* Returns the last dictionary collection in the ordered set where groupId = &#63; and name LIKE &#63; and version = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param version the version
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary collection
	* @throws org.oep.datamgt.NoSuchDictCollectionException if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictCollection findByG_LikeN_V_Last(
		long groupId, java.lang.String name, java.lang.String version,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException {
		return getPersistence()
				   .findByG_LikeN_V_Last(groupId, name, version,
			orderByComparator);
	}

	/**
	* Returns the last dictionary collection in the ordered set where groupId = &#63; and name LIKE &#63; and version = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param version the version
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary collection, or <code>null</code> if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictCollection fetchByG_LikeN_V_Last(
		long groupId, java.lang.String name, java.lang.String version,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_LikeN_V_Last(groupId, name, version,
			orderByComparator);
	}

	/**
	* Returns the dictionary collections before and after the current dictionary collection in the ordered set where groupId = &#63; and name LIKE &#63; and version = &#63;.
	*
	* @param dictCollectionId the primary key of the current dictionary collection
	* @param groupId the group ID
	* @param name the name
	* @param version the version
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dictionary collection
	* @throws org.oep.datamgt.NoSuchDictCollectionException if a dictionary collection with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictCollection[] findByG_LikeN_V_PrevAndNext(
		long dictCollectionId, long groupId, java.lang.String name,
		java.lang.String version,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException {
		return getPersistence()
				   .findByG_LikeN_V_PrevAndNext(dictCollectionId, groupId,
			name, version, orderByComparator);
	}

	/**
	* Removes all the dictionary collections where groupId = &#63; and name LIKE &#63; and version = &#63; from the database.
	*
	* @param groupId the group ID
	* @param name the name
	* @param version the version
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_LikeN_V(long groupId, java.lang.String name,
		java.lang.String version)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByG_LikeN_V(groupId, name, version);
	}

	/**
	* Returns the number of dictionary collections where groupId = &#63; and name LIKE &#63; and version = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param version the version
	* @return the number of matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_LikeN_V(long groupId, java.lang.String name,
		java.lang.String version)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_LikeN_V(groupId, name, version);
	}

	/**
	* Returns all the dictionary collections where groupId = &#63; and name = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param status the status
	* @return the matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictCollection> findByG_N_S(
		long groupId, java.lang.String name, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_N_S(groupId, name, status);
	}

	/**
	* Returns a range of all the dictionary collections where groupId = &#63; and name = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param name the name
	* @param status the status
	* @param start the lower bound of the range of dictionary collections
	* @param end the upper bound of the range of dictionary collections (not inclusive)
	* @return the range of matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictCollection> findByG_N_S(
		long groupId, java.lang.String name, int status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_N_S(groupId, name, status, start, end);
	}

	/**
	* Returns an ordered range of all the dictionary collections where groupId = &#63; and name = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param name the name
	* @param status the status
	* @param start the lower bound of the range of dictionary collections
	* @param end the upper bound of the range of dictionary collections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictCollection> findByG_N_S(
		long groupId, java.lang.String name, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_N_S(groupId, name, status, start, end,
			orderByComparator);
	}

	/**
	* Returns the first dictionary collection in the ordered set where groupId = &#63; and name = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary collection
	* @throws org.oep.datamgt.NoSuchDictCollectionException if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictCollection findByG_N_S_First(
		long groupId, java.lang.String name, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException {
		return getPersistence()
				   .findByG_N_S_First(groupId, name, status, orderByComparator);
	}

	/**
	* Returns the first dictionary collection in the ordered set where groupId = &#63; and name = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary collection, or <code>null</code> if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictCollection fetchByG_N_S_First(
		long groupId, java.lang.String name, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_N_S_First(groupId, name, status, orderByComparator);
	}

	/**
	* Returns the last dictionary collection in the ordered set where groupId = &#63; and name = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary collection
	* @throws org.oep.datamgt.NoSuchDictCollectionException if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictCollection findByG_N_S_Last(
		long groupId, java.lang.String name, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException {
		return getPersistence()
				   .findByG_N_S_Last(groupId, name, status, orderByComparator);
	}

	/**
	* Returns the last dictionary collection in the ordered set where groupId = &#63; and name = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary collection, or <code>null</code> if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictCollection fetchByG_N_S_Last(
		long groupId, java.lang.String name, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_N_S_Last(groupId, name, status, orderByComparator);
	}

	/**
	* Returns the dictionary collections before and after the current dictionary collection in the ordered set where groupId = &#63; and name = &#63; and status = &#63;.
	*
	* @param dictCollectionId the primary key of the current dictionary collection
	* @param groupId the group ID
	* @param name the name
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dictionary collection
	* @throws org.oep.datamgt.NoSuchDictCollectionException if a dictionary collection with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictCollection[] findByG_N_S_PrevAndNext(
		long dictCollectionId, long groupId, java.lang.String name, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException {
		return getPersistence()
				   .findByG_N_S_PrevAndNext(dictCollectionId, groupId, name,
			status, orderByComparator);
	}

	/**
	* Removes all the dictionary collections where groupId = &#63; and name = &#63; and status = &#63; from the database.
	*
	* @param groupId the group ID
	* @param name the name
	* @param status the status
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_N_S(long groupId, java.lang.String name,
		int status) throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByG_N_S(groupId, name, status);
	}

	/**
	* Returns the number of dictionary collections where groupId = &#63; and name = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param status the status
	* @return the number of matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_N_S(long groupId, java.lang.String name,
		int status) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_N_S(groupId, name, status);
	}

	/**
	* Returns all the dictionary collections where companyId = &#63; and name = &#63; and status = &#63;.
	*
	* @param companyId the company ID
	* @param name the name
	* @param status the status
	* @return the matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictCollection> findByC_N_S(
		long companyId, java.lang.String name, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_N_S(companyId, name, status);
	}

	/**
	* Returns a range of all the dictionary collections where companyId = &#63; and name = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param name the name
	* @param status the status
	* @param start the lower bound of the range of dictionary collections
	* @param end the upper bound of the range of dictionary collections (not inclusive)
	* @return the range of matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictCollection> findByC_N_S(
		long companyId, java.lang.String name, int status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_N_S(companyId, name, status, start, end);
	}

	/**
	* Returns an ordered range of all the dictionary collections where companyId = &#63; and name = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param name the name
	* @param status the status
	* @param start the lower bound of the range of dictionary collections
	* @param end the upper bound of the range of dictionary collections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictCollection> findByC_N_S(
		long companyId, java.lang.String name, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_N_S(companyId, name, status, start, end,
			orderByComparator);
	}

	/**
	* Returns the first dictionary collection in the ordered set where companyId = &#63; and name = &#63; and status = &#63;.
	*
	* @param companyId the company ID
	* @param name the name
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary collection
	* @throws org.oep.datamgt.NoSuchDictCollectionException if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictCollection findByC_N_S_First(
		long companyId, java.lang.String name, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException {
		return getPersistence()
				   .findByC_N_S_First(companyId, name, status, orderByComparator);
	}

	/**
	* Returns the first dictionary collection in the ordered set where companyId = &#63; and name = &#63; and status = &#63;.
	*
	* @param companyId the company ID
	* @param name the name
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary collection, or <code>null</code> if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictCollection fetchByC_N_S_First(
		long companyId, java.lang.String name, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_N_S_First(companyId, name, status,
			orderByComparator);
	}

	/**
	* Returns the last dictionary collection in the ordered set where companyId = &#63; and name = &#63; and status = &#63;.
	*
	* @param companyId the company ID
	* @param name the name
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary collection
	* @throws org.oep.datamgt.NoSuchDictCollectionException if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictCollection findByC_N_S_Last(
		long companyId, java.lang.String name, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException {
		return getPersistence()
				   .findByC_N_S_Last(companyId, name, status, orderByComparator);
	}

	/**
	* Returns the last dictionary collection in the ordered set where companyId = &#63; and name = &#63; and status = &#63;.
	*
	* @param companyId the company ID
	* @param name the name
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary collection, or <code>null</code> if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictCollection fetchByC_N_S_Last(
		long companyId, java.lang.String name, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_N_S_Last(companyId, name, status, orderByComparator);
	}

	/**
	* Returns the dictionary collections before and after the current dictionary collection in the ordered set where companyId = &#63; and name = &#63; and status = &#63;.
	*
	* @param dictCollectionId the primary key of the current dictionary collection
	* @param companyId the company ID
	* @param name the name
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dictionary collection
	* @throws org.oep.datamgt.NoSuchDictCollectionException if a dictionary collection with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictCollection[] findByC_N_S_PrevAndNext(
		long dictCollectionId, long companyId, java.lang.String name,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException {
		return getPersistence()
				   .findByC_N_S_PrevAndNext(dictCollectionId, companyId, name,
			status, orderByComparator);
	}

	/**
	* Removes all the dictionary collections where companyId = &#63; and name = &#63; and status = &#63; from the database.
	*
	* @param companyId the company ID
	* @param name the name
	* @param status the status
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_N_S(long companyId, java.lang.String name,
		int status) throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC_N_S(companyId, name, status);
	}

	/**
	* Returns the number of dictionary collections where companyId = &#63; and name = &#63; and status = &#63;.
	*
	* @param companyId the company ID
	* @param name the name
	* @param status the status
	* @return the number of matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_N_S(long companyId, java.lang.String name,
		int status) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_N_S(companyId, name, status);
	}

	/**
	* Returns all the dictionary collections where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictCollection> findByC(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC(companyId);
	}

	/**
	* Returns a range of all the dictionary collections where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of dictionary collections
	* @param end the upper bound of the range of dictionary collections (not inclusive)
	* @return the range of matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictCollection> findByC(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC(companyId, start, end);
	}

	/**
	* Returns an ordered range of all the dictionary collections where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of dictionary collections
	* @param end the upper bound of the range of dictionary collections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictCollection> findByC(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC(companyId, start, end, orderByComparator);
	}

	/**
	* Returns the first dictionary collection in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary collection
	* @throws org.oep.datamgt.NoSuchDictCollectionException if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictCollection findByC_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException {
		return getPersistence().findByC_First(companyId, orderByComparator);
	}

	/**
	* Returns the first dictionary collection in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary collection, or <code>null</code> if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictCollection fetchByC_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByC_First(companyId, orderByComparator);
	}

	/**
	* Returns the last dictionary collection in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary collection
	* @throws org.oep.datamgt.NoSuchDictCollectionException if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictCollection findByC_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException {
		return getPersistence().findByC_Last(companyId, orderByComparator);
	}

	/**
	* Returns the last dictionary collection in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary collection, or <code>null</code> if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictCollection fetchByC_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByC_Last(companyId, orderByComparator);
	}

	/**
	* Returns the dictionary collections before and after the current dictionary collection in the ordered set where companyId = &#63;.
	*
	* @param dictCollectionId the primary key of the current dictionary collection
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dictionary collection
	* @throws org.oep.datamgt.NoSuchDictCollectionException if a dictionary collection with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictCollection[] findByC_PrevAndNext(
		long dictCollectionId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException {
		return getPersistence()
				   .findByC_PrevAndNext(dictCollectionId, companyId,
			orderByComparator);
	}

	/**
	* Removes all the dictionary collections where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC(companyId);
	}

	/**
	* Returns the number of dictionary collections where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC(companyId);
	}

	/**
	* Returns all the dictionary collections where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictCollection> findByG(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG(groupId);
	}

	/**
	* Returns a range of all the dictionary collections where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of dictionary collections
	* @param end the upper bound of the range of dictionary collections (not inclusive)
	* @return the range of matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictCollection> findByG(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the dictionary collections where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of dictionary collections
	* @param end the upper bound of the range of dictionary collections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictCollection> findByG(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG(groupId, start, end, orderByComparator);
	}

	/**
	* Returns the first dictionary collection in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary collection
	* @throws org.oep.datamgt.NoSuchDictCollectionException if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictCollection findByG_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException {
		return getPersistence().findByG_First(groupId, orderByComparator);
	}

	/**
	* Returns the first dictionary collection in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary collection, or <code>null</code> if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictCollection fetchByG_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByG_First(groupId, orderByComparator);
	}

	/**
	* Returns the last dictionary collection in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary collection
	* @throws org.oep.datamgt.NoSuchDictCollectionException if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictCollection findByG_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException {
		return getPersistence().findByG_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last dictionary collection in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary collection, or <code>null</code> if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictCollection fetchByG_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByG_Last(groupId, orderByComparator);
	}

	/**
	* Returns the dictionary collections before and after the current dictionary collection in the ordered set where groupId = &#63;.
	*
	* @param dictCollectionId the primary key of the current dictionary collection
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dictionary collection
	* @throws org.oep.datamgt.NoSuchDictCollectionException if a dictionary collection with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictCollection[] findByG_PrevAndNext(
		long dictCollectionId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException {
		return getPersistence()
				   .findByG_PrevAndNext(dictCollectionId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the dictionary collections where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByG(groupId);
	}

	/**
	* Returns the number of dictionary collections where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG(groupId);
	}

	/**
	* Caches the dictionary collection in the entity cache if it is enabled.
	*
	* @param dictCollection the dictionary collection
	*/
	public static void cacheResult(
		org.oep.datamgt.model.DictCollection dictCollection) {
		getPersistence().cacheResult(dictCollection);
	}

	/**
	* Caches the dictionary collections in the entity cache if it is enabled.
	*
	* @param dictCollections the dictionary collections
	*/
	public static void cacheResult(
		java.util.List<org.oep.datamgt.model.DictCollection> dictCollections) {
		getPersistence().cacheResult(dictCollections);
	}

	/**
	* Creates a new dictionary collection with the primary key. Does not add the dictionary collection to the database.
	*
	* @param dictCollectionId the primary key for the new dictionary collection
	* @return the new dictionary collection
	*/
	public static org.oep.datamgt.model.DictCollection create(
		long dictCollectionId) {
		return getPersistence().create(dictCollectionId);
	}

	/**
	* Removes the dictionary collection with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dictCollectionId the primary key of the dictionary collection
	* @return the dictionary collection that was removed
	* @throws org.oep.datamgt.NoSuchDictCollectionException if a dictionary collection with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictCollection remove(
		long dictCollectionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException {
		return getPersistence().remove(dictCollectionId);
	}

	public static org.oep.datamgt.model.DictCollection updateImpl(
		org.oep.datamgt.model.DictCollection dictCollection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dictCollection);
	}

	/**
	* Returns the dictionary collection with the primary key or throws a {@link org.oep.datamgt.NoSuchDictCollectionException} if it could not be found.
	*
	* @param dictCollectionId the primary key of the dictionary collection
	* @return the dictionary collection
	* @throws org.oep.datamgt.NoSuchDictCollectionException if a dictionary collection with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictCollection findByPrimaryKey(
		long dictCollectionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException {
		return getPersistence().findByPrimaryKey(dictCollectionId);
	}

	/**
	* Returns the dictionary collection with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param dictCollectionId the primary key of the dictionary collection
	* @return the dictionary collection, or <code>null</code> if a dictionary collection with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.datamgt.model.DictCollection fetchByPrimaryKey(
		long dictCollectionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(dictCollectionId);
	}

	/**
	* Returns all the dictionary collections.
	*
	* @return the dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictCollection> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the dictionary collections.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dictionary collections
	* @param end the upper bound of the range of dictionary collections (not inclusive)
	* @return the range of dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictCollection> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the dictionary collections.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dictionary collections
	* @param end the upper bound of the range of dictionary collections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictCollection> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dictionary collections from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dictionary collections.
	*
	* @return the number of dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	/**
	* Returns all the dictionary datas associated with the dictionary collection.
	*
	* @param pk the primary key of the dictionary collection
	* @return the dictionary datas associated with the dictionary collection
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictData> getDictDatas(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getDictDatas(pk);
	}

	/**
	* Returns a range of all the dictionary datas associated with the dictionary collection.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the dictionary collection
	* @param start the lower bound of the range of dictionary collections
	* @param end the upper bound of the range of dictionary collections (not inclusive)
	* @return the range of dictionary datas associated with the dictionary collection
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictData> getDictDatas(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getDictDatas(pk, start, end);
	}

	/**
	* Returns an ordered range of all the dictionary datas associated with the dictionary collection.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the dictionary collection
	* @param start the lower bound of the range of dictionary collections
	* @param end the upper bound of the range of dictionary collections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dictionary datas associated with the dictionary collection
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.datamgt.model.DictData> getDictDatas(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getDictDatas(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of dictionary datas associated with the dictionary collection.
	*
	* @param pk the primary key of the dictionary collection
	* @return the number of dictionary datas associated with the dictionary collection
	* @throws SystemException if a system exception occurred
	*/
	public static int getDictDatasSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getDictDatasSize(pk);
	}

	/**
	* Returns <code>true</code> if the dictionary data is associated with the dictionary collection.
	*
	* @param pk the primary key of the dictionary collection
	* @param dictDataPK the primary key of the dictionary data
	* @return <code>true</code> if the dictionary data is associated with the dictionary collection; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsDictData(long pk, long dictDataPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsDictData(pk, dictDataPK);
	}

	/**
	* Returns <code>true</code> if the dictionary collection has any dictionary datas associated with it.
	*
	* @param pk the primary key of the dictionary collection to check for associations with dictionary datas
	* @return <code>true</code> if the dictionary collection has any dictionary datas associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsDictDatas(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsDictDatas(pk);
	}

	/**
	* Adds an association between the dictionary collection and the dictionary data. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dictionary collection
	* @param dictDataPK the primary key of the dictionary data
	* @throws SystemException if a system exception occurred
	*/
	public static void addDictData(long pk, long dictDataPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addDictData(pk, dictDataPK);
	}

	/**
	* Adds an association between the dictionary collection and the dictionary data. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dictionary collection
	* @param dictData the dictionary data
	* @throws SystemException if a system exception occurred
	*/
	public static void addDictData(long pk,
		org.oep.datamgt.model.DictData dictData)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addDictData(pk, dictData);
	}

	/**
	* Adds an association between the dictionary collection and the dictionary datas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dictionary collection
	* @param dictDataPKs the primary keys of the dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public static void addDictDatas(long pk, long[] dictDataPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addDictDatas(pk, dictDataPKs);
	}

	/**
	* Adds an association between the dictionary collection and the dictionary datas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dictionary collection
	* @param dictDatas the dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public static void addDictDatas(long pk,
		java.util.List<org.oep.datamgt.model.DictData> dictDatas)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addDictDatas(pk, dictDatas);
	}

	/**
	* Clears all associations between the dictionary collection and its dictionary datas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dictionary collection to clear the associated dictionary datas from
	* @throws SystemException if a system exception occurred
	*/
	public static void clearDictDatas(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().clearDictDatas(pk);
	}

	/**
	* Removes the association between the dictionary collection and the dictionary data. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dictionary collection
	* @param dictDataPK the primary key of the dictionary data
	* @throws SystemException if a system exception occurred
	*/
	public static void removeDictData(long pk, long dictDataPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeDictData(pk, dictDataPK);
	}

	/**
	* Removes the association between the dictionary collection and the dictionary data. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dictionary collection
	* @param dictData the dictionary data
	* @throws SystemException if a system exception occurred
	*/
	public static void removeDictData(long pk,
		org.oep.datamgt.model.DictData dictData)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeDictData(pk, dictData);
	}

	/**
	* Removes the association between the dictionary collection and the dictionary datas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dictionary collection
	* @param dictDataPKs the primary keys of the dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public static void removeDictDatas(long pk, long[] dictDataPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeDictDatas(pk, dictDataPKs);
	}

	/**
	* Removes the association between the dictionary collection and the dictionary datas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dictionary collection
	* @param dictDatas the dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public static void removeDictDatas(long pk,
		java.util.List<org.oep.datamgt.model.DictData> dictDatas)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeDictDatas(pk, dictDatas);
	}

	/**
	* Sets the dictionary datas associated with the dictionary collection, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dictionary collection
	* @param dictDataPKs the primary keys of the dictionary datas to be associated with the dictionary collection
	* @throws SystemException if a system exception occurred
	*/
	public static void setDictDatas(long pk, long[] dictDataPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setDictDatas(pk, dictDataPKs);
	}

	/**
	* Sets the dictionary datas associated with the dictionary collection, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dictionary collection
	* @param dictDatas the dictionary datas to be associated with the dictionary collection
	* @throws SystemException if a system exception occurred
	*/
	public static void setDictDatas(long pk,
		java.util.List<org.oep.datamgt.model.DictData> dictDatas)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setDictDatas(pk, dictDatas);
	}

	public static DictCollectionPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DictCollectionPersistence)PortletBeanLocatorUtil.locate(org.oep.datamgt.service.ClpSerializer.getServletContextName(),
					DictCollectionPersistence.class.getName());

			ReferenceRegistry.registerReference(DictCollectionUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DictCollectionPersistence persistence) {
	}

	private static DictCollectionPersistence _persistence;
}