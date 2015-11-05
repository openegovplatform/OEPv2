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

import com.liferay.portal.service.persistence.BasePersistence;

import org.oep.datamgt.model.DictCollection;

/**
 * The persistence interface for the dictionary collection service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NQMINH
 * @see DictCollectionPersistenceImpl
 * @see DictCollectionUtil
 * @generated
 */
public interface DictCollectionPersistence extends BasePersistence<DictCollection> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DictCollectionUtil} to access the dictionary collection persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the dictionary collections where groupId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @return the matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.datamgt.model.DictCollection> findByG_N(
		long groupId, java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.datamgt.model.DictCollection> findByG_N(
		long groupId, java.lang.String name, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.datamgt.model.DictCollection> findByG_N(
		long groupId, java.lang.String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.oep.datamgt.model.DictCollection findByG_N_First(long groupId,
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException;

	/**
	* Returns the first dictionary collection in the ordered set where groupId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary collection, or <code>null</code> if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictCollection fetchByG_N_First(long groupId,
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.oep.datamgt.model.DictCollection findByG_N_Last(long groupId,
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException;

	/**
	* Returns the last dictionary collection in the ordered set where groupId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary collection, or <code>null</code> if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictCollection fetchByG_N_Last(long groupId,
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.oep.datamgt.model.DictCollection[] findByG_N_PrevAndNext(
		long dictCollectionId, long groupId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException;

	/**
	* Removes all the dictionary collections where groupId = &#63; and name = &#63; from the database.
	*
	* @param groupId the group ID
	* @param name the name
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_N(long groupId, java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dictionary collections where groupId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @return the number of matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_N(long groupId, java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dictionary collections where companyId = &#63; and name = &#63;.
	*
	* @param companyId the company ID
	* @param name the name
	* @return the matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.datamgt.model.DictCollection> findByC_N(
		long companyId, java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.datamgt.model.DictCollection> findByC_N(
		long companyId, java.lang.String name, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.datamgt.model.DictCollection> findByC_N(
		long companyId, java.lang.String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.oep.datamgt.model.DictCollection findByC_N_First(
		long companyId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException;

	/**
	* Returns the first dictionary collection in the ordered set where companyId = &#63; and name = &#63;.
	*
	* @param companyId the company ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary collection, or <code>null</code> if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictCollection fetchByC_N_First(
		long companyId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.oep.datamgt.model.DictCollection findByC_N_Last(long companyId,
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException;

	/**
	* Returns the last dictionary collection in the ordered set where companyId = &#63; and name = &#63;.
	*
	* @param companyId the company ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary collection, or <code>null</code> if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictCollection fetchByC_N_Last(
		long companyId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.oep.datamgt.model.DictCollection[] findByC_N_PrevAndNext(
		long dictCollectionId, long companyId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException;

	/**
	* Removes all the dictionary collections where companyId = &#63; and name = &#63; from the database.
	*
	* @param companyId the company ID
	* @param name the name
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_N(long companyId, java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dictionary collections where companyId = &#63; and name = &#63;.
	*
	* @param companyId the company ID
	* @param name the name
	* @return the number of matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_N(long companyId, java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dictionary collections where companyId = &#63; and name LIKE &#63;.
	*
	* @param companyId the company ID
	* @param name the name
	* @return the matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.datamgt.model.DictCollection> findByC_LikeN(
		long companyId, java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.datamgt.model.DictCollection> findByC_LikeN(
		long companyId, java.lang.String name, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.datamgt.model.DictCollection> findByC_LikeN(
		long companyId, java.lang.String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.oep.datamgt.model.DictCollection findByC_LikeN_First(
		long companyId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException;

	/**
	* Returns the first dictionary collection in the ordered set where companyId = &#63; and name LIKE &#63;.
	*
	* @param companyId the company ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary collection, or <code>null</code> if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictCollection fetchByC_LikeN_First(
		long companyId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.oep.datamgt.model.DictCollection findByC_LikeN_Last(
		long companyId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException;

	/**
	* Returns the last dictionary collection in the ordered set where companyId = &#63; and name LIKE &#63;.
	*
	* @param companyId the company ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary collection, or <code>null</code> if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictCollection fetchByC_LikeN_Last(
		long companyId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.oep.datamgt.model.DictCollection[] findByC_LikeN_PrevAndNext(
		long dictCollectionId, long companyId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException;

	/**
	* Removes all the dictionary collections where companyId = &#63; and name LIKE &#63; from the database.
	*
	* @param companyId the company ID
	* @param name the name
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_LikeN(long companyId, java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dictionary collections where companyId = &#63; and name LIKE &#63;.
	*
	* @param companyId the company ID
	* @param name the name
	* @return the number of matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_LikeN(long companyId, java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dictionary collections where groupId = &#63; and name LIKE &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @return the matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.datamgt.model.DictCollection> findByG_LikeN(
		long groupId, java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.datamgt.model.DictCollection> findByG_LikeN(
		long groupId, java.lang.String name, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.datamgt.model.DictCollection> findByG_LikeN(
		long groupId, java.lang.String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.oep.datamgt.model.DictCollection findByG_LikeN_First(
		long groupId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException;

	/**
	* Returns the first dictionary collection in the ordered set where groupId = &#63; and name LIKE &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary collection, or <code>null</code> if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictCollection fetchByG_LikeN_First(
		long groupId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.oep.datamgt.model.DictCollection findByG_LikeN_Last(
		long groupId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException;

	/**
	* Returns the last dictionary collection in the ordered set where groupId = &#63; and name LIKE &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary collection, or <code>null</code> if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictCollection fetchByG_LikeN_Last(
		long groupId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.oep.datamgt.model.DictCollection[] findByG_LikeN_PrevAndNext(
		long dictCollectionId, long groupId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException;

	/**
	* Removes all the dictionary collections where groupId = &#63; and name LIKE &#63; from the database.
	*
	* @param groupId the group ID
	* @param name the name
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_LikeN(long groupId, java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dictionary collections where groupId = &#63; and name LIKE &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @return the number of matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_LikeN(long groupId, java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.oep.datamgt.model.DictCollection findByC_N_V(long companyId,
		java.lang.String name, java.lang.String version)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException;

	/**
	* Returns the dictionary collection where companyId = &#63; and name = &#63; and version = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param companyId the company ID
	* @param name the name
	* @param version the version
	* @return the matching dictionary collection, or <code>null</code> if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictCollection fetchByC_N_V(long companyId,
		java.lang.String name, java.lang.String version)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.oep.datamgt.model.DictCollection fetchByC_N_V(long companyId,
		java.lang.String name, java.lang.String version,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the dictionary collection where companyId = &#63; and name = &#63; and version = &#63; from the database.
	*
	* @param companyId the company ID
	* @param name the name
	* @param version the version
	* @return the dictionary collection that was removed
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictCollection removeByC_N_V(long companyId,
		java.lang.String name, java.lang.String version)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException;

	/**
	* Returns the number of dictionary collections where companyId = &#63; and name = &#63; and version = &#63;.
	*
	* @param companyId the company ID
	* @param name the name
	* @param version the version
	* @return the number of matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_N_V(long companyId, java.lang.String name,
		java.lang.String version)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.oep.datamgt.model.DictCollection findByG_N_V(long groupId,
		java.lang.String name, java.lang.String version)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException;

	/**
	* Returns the dictionary collection where groupId = &#63; and name = &#63; and version = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param name the name
	* @param version the version
	* @return the matching dictionary collection, or <code>null</code> if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictCollection fetchByG_N_V(long groupId,
		java.lang.String name, java.lang.String version)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.oep.datamgt.model.DictCollection fetchByG_N_V(long groupId,
		java.lang.String name, java.lang.String version,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the dictionary collection where groupId = &#63; and name = &#63; and version = &#63; from the database.
	*
	* @param groupId the group ID
	* @param name the name
	* @param version the version
	* @return the dictionary collection that was removed
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictCollection removeByG_N_V(long groupId,
		java.lang.String name, java.lang.String version)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException;

	/**
	* Returns the number of dictionary collections where groupId = &#63; and name = &#63; and version = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param version the version
	* @return the number of matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_N_V(long groupId, java.lang.String name,
		java.lang.String version)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dictionary collections where companyId = &#63; and name LIKE &#63; and version = &#63;.
	*
	* @param companyId the company ID
	* @param name the name
	* @param version the version
	* @return the matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.datamgt.model.DictCollection> findByC_LikeN_V(
		long companyId, java.lang.String name, java.lang.String version)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.datamgt.model.DictCollection> findByC_LikeN_V(
		long companyId, java.lang.String name, java.lang.String version,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.datamgt.model.DictCollection> findByC_LikeN_V(
		long companyId, java.lang.String name, java.lang.String version,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.oep.datamgt.model.DictCollection findByC_LikeN_V_First(
		long companyId, java.lang.String name, java.lang.String version,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException;

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
	public org.oep.datamgt.model.DictCollection fetchByC_LikeN_V_First(
		long companyId, java.lang.String name, java.lang.String version,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.oep.datamgt.model.DictCollection findByC_LikeN_V_Last(
		long companyId, java.lang.String name, java.lang.String version,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException;

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
	public org.oep.datamgt.model.DictCollection fetchByC_LikeN_V_Last(
		long companyId, java.lang.String name, java.lang.String version,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.oep.datamgt.model.DictCollection[] findByC_LikeN_V_PrevAndNext(
		long dictCollectionId, long companyId, java.lang.String name,
		java.lang.String version,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException;

	/**
	* Removes all the dictionary collections where companyId = &#63; and name LIKE &#63; and version = &#63; from the database.
	*
	* @param companyId the company ID
	* @param name the name
	* @param version the version
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_LikeN_V(long companyId, java.lang.String name,
		java.lang.String version)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dictionary collections where companyId = &#63; and name LIKE &#63; and version = &#63;.
	*
	* @param companyId the company ID
	* @param name the name
	* @param version the version
	* @return the number of matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_LikeN_V(long companyId, java.lang.String name,
		java.lang.String version)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dictionary collections where groupId = &#63; and name LIKE &#63; and version = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param version the version
	* @return the matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.datamgt.model.DictCollection> findByG_LikeN_V(
		long groupId, java.lang.String name, java.lang.String version)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.datamgt.model.DictCollection> findByG_LikeN_V(
		long groupId, java.lang.String name, java.lang.String version,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.datamgt.model.DictCollection> findByG_LikeN_V(
		long groupId, java.lang.String name, java.lang.String version,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.oep.datamgt.model.DictCollection findByG_LikeN_V_First(
		long groupId, java.lang.String name, java.lang.String version,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException;

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
	public org.oep.datamgt.model.DictCollection fetchByG_LikeN_V_First(
		long groupId, java.lang.String name, java.lang.String version,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.oep.datamgt.model.DictCollection findByG_LikeN_V_Last(
		long groupId, java.lang.String name, java.lang.String version,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException;

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
	public org.oep.datamgt.model.DictCollection fetchByG_LikeN_V_Last(
		long groupId, java.lang.String name, java.lang.String version,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.oep.datamgt.model.DictCollection[] findByG_LikeN_V_PrevAndNext(
		long dictCollectionId, long groupId, java.lang.String name,
		java.lang.String version,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException;

	/**
	* Removes all the dictionary collections where groupId = &#63; and name LIKE &#63; and version = &#63; from the database.
	*
	* @param groupId the group ID
	* @param name the name
	* @param version the version
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_LikeN_V(long groupId, java.lang.String name,
		java.lang.String version)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dictionary collections where groupId = &#63; and name LIKE &#63; and version = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param version the version
	* @return the number of matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_LikeN_V(long groupId, java.lang.String name,
		java.lang.String version)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dictionary collections where groupId = &#63; and name = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param status the status
	* @return the matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.datamgt.model.DictCollection> findByG_N_S(
		long groupId, java.lang.String name, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.datamgt.model.DictCollection> findByG_N_S(
		long groupId, java.lang.String name, int status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.datamgt.model.DictCollection> findByG_N_S(
		long groupId, java.lang.String name, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.oep.datamgt.model.DictCollection findByG_N_S_First(
		long groupId, java.lang.String name, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException;

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
	public org.oep.datamgt.model.DictCollection fetchByG_N_S_First(
		long groupId, java.lang.String name, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.oep.datamgt.model.DictCollection findByG_N_S_Last(long groupId,
		java.lang.String name, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException;

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
	public org.oep.datamgt.model.DictCollection fetchByG_N_S_Last(
		long groupId, java.lang.String name, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.oep.datamgt.model.DictCollection[] findByG_N_S_PrevAndNext(
		long dictCollectionId, long groupId, java.lang.String name, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException;

	/**
	* Removes all the dictionary collections where groupId = &#63; and name = &#63; and status = &#63; from the database.
	*
	* @param groupId the group ID
	* @param name the name
	* @param status the status
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_N_S(long groupId, java.lang.String name, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dictionary collections where groupId = &#63; and name = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param status the status
	* @return the number of matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_N_S(long groupId, java.lang.String name, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dictionary collections where companyId = &#63; and name = &#63; and status = &#63;.
	*
	* @param companyId the company ID
	* @param name the name
	* @param status the status
	* @return the matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.datamgt.model.DictCollection> findByC_N_S(
		long companyId, java.lang.String name, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.datamgt.model.DictCollection> findByC_N_S(
		long companyId, java.lang.String name, int status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.datamgt.model.DictCollection> findByC_N_S(
		long companyId, java.lang.String name, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.oep.datamgt.model.DictCollection findByC_N_S_First(
		long companyId, java.lang.String name, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException;

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
	public org.oep.datamgt.model.DictCollection fetchByC_N_S_First(
		long companyId, java.lang.String name, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.oep.datamgt.model.DictCollection findByC_N_S_Last(
		long companyId, java.lang.String name, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException;

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
	public org.oep.datamgt.model.DictCollection fetchByC_N_S_Last(
		long companyId, java.lang.String name, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.oep.datamgt.model.DictCollection[] findByC_N_S_PrevAndNext(
		long dictCollectionId, long companyId, java.lang.String name,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException;

	/**
	* Removes all the dictionary collections where companyId = &#63; and name = &#63; and status = &#63; from the database.
	*
	* @param companyId the company ID
	* @param name the name
	* @param status the status
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_N_S(long companyId, java.lang.String name, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dictionary collections where companyId = &#63; and name = &#63; and status = &#63;.
	*
	* @param companyId the company ID
	* @param name the name
	* @param status the status
	* @return the number of matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_N_S(long companyId, java.lang.String name, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dictionary collections where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.datamgt.model.DictCollection> findByC(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.datamgt.model.DictCollection> findByC(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.datamgt.model.DictCollection> findByC(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dictionary collection in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary collection
	* @throws org.oep.datamgt.NoSuchDictCollectionException if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictCollection findByC_First(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException;

	/**
	* Returns the first dictionary collection in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary collection, or <code>null</code> if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictCollection fetchByC_First(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dictionary collection in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary collection
	* @throws org.oep.datamgt.NoSuchDictCollectionException if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictCollection findByC_Last(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException;

	/**
	* Returns the last dictionary collection in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary collection, or <code>null</code> if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictCollection fetchByC_Last(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.oep.datamgt.model.DictCollection[] findByC_PrevAndNext(
		long dictCollectionId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException;

	/**
	* Removes all the dictionary collections where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dictionary collections where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public int countByC(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dictionary collections where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.datamgt.model.DictCollection> findByG(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.datamgt.model.DictCollection> findByG(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.datamgt.model.DictCollection> findByG(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dictionary collection in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary collection
	* @throws org.oep.datamgt.NoSuchDictCollectionException if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictCollection findByG_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException;

	/**
	* Returns the first dictionary collection in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary collection, or <code>null</code> if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictCollection fetchByG_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dictionary collection in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary collection
	* @throws org.oep.datamgt.NoSuchDictCollectionException if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictCollection findByG_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException;

	/**
	* Returns the last dictionary collection in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary collection, or <code>null</code> if a matching dictionary collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictCollection fetchByG_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.oep.datamgt.model.DictCollection[] findByG_PrevAndNext(
		long dictCollectionId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException;

	/**
	* Removes all the dictionary collections where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dictionary collections where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public int countByG(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the dictionary collection in the entity cache if it is enabled.
	*
	* @param dictCollection the dictionary collection
	*/
	public void cacheResult(org.oep.datamgt.model.DictCollection dictCollection);

	/**
	* Caches the dictionary collections in the entity cache if it is enabled.
	*
	* @param dictCollections the dictionary collections
	*/
	public void cacheResult(
		java.util.List<org.oep.datamgt.model.DictCollection> dictCollections);

	/**
	* Creates a new dictionary collection with the primary key. Does not add the dictionary collection to the database.
	*
	* @param dictCollectionId the primary key for the new dictionary collection
	* @return the new dictionary collection
	*/
	public org.oep.datamgt.model.DictCollection create(long dictCollectionId);

	/**
	* Removes the dictionary collection with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dictCollectionId the primary key of the dictionary collection
	* @return the dictionary collection that was removed
	* @throws org.oep.datamgt.NoSuchDictCollectionException if a dictionary collection with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictCollection remove(long dictCollectionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException;

	public org.oep.datamgt.model.DictCollection updateImpl(
		org.oep.datamgt.model.DictCollection dictCollection)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dictionary collection with the primary key or throws a {@link org.oep.datamgt.NoSuchDictCollectionException} if it could not be found.
	*
	* @param dictCollectionId the primary key of the dictionary collection
	* @return the dictionary collection
	* @throws org.oep.datamgt.NoSuchDictCollectionException if a dictionary collection with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictCollection findByPrimaryKey(
		long dictCollectionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictCollectionException;

	/**
	* Returns the dictionary collection with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param dictCollectionId the primary key of the dictionary collection
	* @return the dictionary collection, or <code>null</code> if a dictionary collection with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictCollection fetchByPrimaryKey(
		long dictCollectionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dictionary collections.
	*
	* @return the dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.datamgt.model.DictCollection> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.datamgt.model.DictCollection> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.datamgt.model.DictCollection> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dictionary collections from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dictionary collections.
	*
	* @return the number of dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dictionary datas associated with the dictionary collection.
	*
	* @param pk the primary key of the dictionary collection
	* @return the dictionary datas associated with the dictionary collection
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.datamgt.model.DictData> getDictDatas(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.datamgt.model.DictData> getDictDatas(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.datamgt.model.DictData> getDictDatas(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dictionary datas associated with the dictionary collection.
	*
	* @param pk the primary key of the dictionary collection
	* @return the number of dictionary datas associated with the dictionary collection
	* @throws SystemException if a system exception occurred
	*/
	public int getDictDatasSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the dictionary data is associated with the dictionary collection.
	*
	* @param pk the primary key of the dictionary collection
	* @param dictDataPK the primary key of the dictionary data
	* @return <code>true</code> if the dictionary data is associated with the dictionary collection; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsDictData(long pk, long dictDataPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the dictionary collection has any dictionary datas associated with it.
	*
	* @param pk the primary key of the dictionary collection to check for associations with dictionary datas
	* @return <code>true</code> if the dictionary collection has any dictionary datas associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsDictDatas(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the dictionary collection and the dictionary data. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dictionary collection
	* @param dictDataPK the primary key of the dictionary data
	* @throws SystemException if a system exception occurred
	*/
	public void addDictData(long pk, long dictDataPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the dictionary collection and the dictionary data. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dictionary collection
	* @param dictData the dictionary data
	* @throws SystemException if a system exception occurred
	*/
	public void addDictData(long pk, org.oep.datamgt.model.DictData dictData)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the dictionary collection and the dictionary datas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dictionary collection
	* @param dictDataPKs the primary keys of the dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public void addDictDatas(long pk, long[] dictDataPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the dictionary collection and the dictionary datas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dictionary collection
	* @param dictDatas the dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public void addDictDatas(long pk,
		java.util.List<org.oep.datamgt.model.DictData> dictDatas)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Clears all associations between the dictionary collection and its dictionary datas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dictionary collection to clear the associated dictionary datas from
	* @throws SystemException if a system exception occurred
	*/
	public void clearDictDatas(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the dictionary collection and the dictionary data. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dictionary collection
	* @param dictDataPK the primary key of the dictionary data
	* @throws SystemException if a system exception occurred
	*/
	public void removeDictData(long pk, long dictDataPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the dictionary collection and the dictionary data. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dictionary collection
	* @param dictData the dictionary data
	* @throws SystemException if a system exception occurred
	*/
	public void removeDictData(long pk, org.oep.datamgt.model.DictData dictData)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the dictionary collection and the dictionary datas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dictionary collection
	* @param dictDataPKs the primary keys of the dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public void removeDictDatas(long pk, long[] dictDataPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the dictionary collection and the dictionary datas. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dictionary collection
	* @param dictDatas the dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public void removeDictDatas(long pk,
		java.util.List<org.oep.datamgt.model.DictData> dictDatas)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the dictionary datas associated with the dictionary collection, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dictionary collection
	* @param dictDataPKs the primary keys of the dictionary datas to be associated with the dictionary collection
	* @throws SystemException if a system exception occurred
	*/
	public void setDictDatas(long pk, long[] dictDataPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the dictionary datas associated with the dictionary collection, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dictionary collection
	* @param dictDatas the dictionary datas to be associated with the dictionary collection
	* @throws SystemException if a system exception occurred
	*/
	public void setDictDatas(long pk,
		java.util.List<org.oep.datamgt.model.DictData> dictDatas)
		throws com.liferay.portal.kernel.exception.SystemException;
}