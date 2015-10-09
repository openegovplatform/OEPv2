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

package org.oep.core.datamgt.dictionary.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import org.oep.core.datamgt.dictionary.model.DictAttribute;

/**
 * The persistence interface for the dictionary attribute service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author TrungDK
 * @see DictAttributePersistenceImpl
 * @see DictAttributeUtil
 * @generated
 */
public interface DictAttributePersistence extends BasePersistence<DictAttribute> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DictAttributeUtil} to access the dictionary attribute persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the dictionary attributes where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching dictionary attributes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.datamgt.dictionary.model.DictAttribute> findByC(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dictionary attributes where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.dictionary.model.impl.DictAttributeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of dictionary attributes
	* @param end the upper bound of the range of dictionary attributes (not inclusive)
	* @return the range of matching dictionary attributes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.datamgt.dictionary.model.DictAttribute> findByC(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dictionary attributes where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.dictionary.model.impl.DictAttributeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of dictionary attributes
	* @param end the upper bound of the range of dictionary attributes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dictionary attributes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.datamgt.dictionary.model.DictAttribute> findByC(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dictionary attribute in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary attribute
	* @throws org.oep.core.datamgt.dictionary.NoSuchDictAttributeException if a matching dictionary attribute could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.datamgt.dictionary.model.DictAttribute findByC_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.dictionary.NoSuchDictAttributeException;

	/**
	* Returns the first dictionary attribute in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary attribute, or <code>null</code> if a matching dictionary attribute could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.datamgt.dictionary.model.DictAttribute fetchByC_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dictionary attribute in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary attribute
	* @throws org.oep.core.datamgt.dictionary.NoSuchDictAttributeException if a matching dictionary attribute could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.datamgt.dictionary.model.DictAttribute findByC_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.dictionary.NoSuchDictAttributeException;

	/**
	* Returns the last dictionary attribute in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary attribute, or <code>null</code> if a matching dictionary attribute could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.datamgt.dictionary.model.DictAttribute fetchByC_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dictionary attributes before and after the current dictionary attribute in the ordered set where companyId = &#63;.
	*
	* @param dictAttributeId the primary key of the current dictionary attribute
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dictionary attribute
	* @throws org.oep.core.datamgt.dictionary.NoSuchDictAttributeException if a dictionary attribute with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.datamgt.dictionary.model.DictAttribute[] findByC_PrevAndNext(
		long dictAttributeId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.dictionary.NoSuchDictAttributeException;

	/**
	* Removes all the dictionary attributes where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dictionary attributes where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching dictionary attributes
	* @throws SystemException if a system exception occurred
	*/
	public int countByC(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dictionary attributes where companyId = &#63; and collectionName = &#63;.
	*
	* @param companyId the company ID
	* @param collectionName the collection name
	* @return the matching dictionary attributes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.datamgt.dictionary.model.DictAttribute> findByC_CN(
		long companyId, java.lang.String collectionName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dictionary attributes where companyId = &#63; and collectionName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.dictionary.model.impl.DictAttributeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param collectionName the collection name
	* @param start the lower bound of the range of dictionary attributes
	* @param end the upper bound of the range of dictionary attributes (not inclusive)
	* @return the range of matching dictionary attributes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.datamgt.dictionary.model.DictAttribute> findByC_CN(
		long companyId, java.lang.String collectionName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dictionary attributes where companyId = &#63; and collectionName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.dictionary.model.impl.DictAttributeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public java.util.List<org.oep.core.datamgt.dictionary.model.DictAttribute> findByC_CN(
		long companyId, java.lang.String collectionName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dictionary attribute in the ordered set where companyId = &#63; and collectionName = &#63;.
	*
	* @param companyId the company ID
	* @param collectionName the collection name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary attribute
	* @throws org.oep.core.datamgt.dictionary.NoSuchDictAttributeException if a matching dictionary attribute could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.datamgt.dictionary.model.DictAttribute findByC_CN_First(
		long companyId, java.lang.String collectionName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.dictionary.NoSuchDictAttributeException;

	/**
	* Returns the first dictionary attribute in the ordered set where companyId = &#63; and collectionName = &#63;.
	*
	* @param companyId the company ID
	* @param collectionName the collection name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary attribute, or <code>null</code> if a matching dictionary attribute could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.datamgt.dictionary.model.DictAttribute fetchByC_CN_First(
		long companyId, java.lang.String collectionName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dictionary attribute in the ordered set where companyId = &#63; and collectionName = &#63;.
	*
	* @param companyId the company ID
	* @param collectionName the collection name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary attribute
	* @throws org.oep.core.datamgt.dictionary.NoSuchDictAttributeException if a matching dictionary attribute could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.datamgt.dictionary.model.DictAttribute findByC_CN_Last(
		long companyId, java.lang.String collectionName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.dictionary.NoSuchDictAttributeException;

	/**
	* Returns the last dictionary attribute in the ordered set where companyId = &#63; and collectionName = &#63;.
	*
	* @param companyId the company ID
	* @param collectionName the collection name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary attribute, or <code>null</code> if a matching dictionary attribute could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.datamgt.dictionary.model.DictAttribute fetchByC_CN_Last(
		long companyId, java.lang.String collectionName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dictionary attributes before and after the current dictionary attribute in the ordered set where companyId = &#63; and collectionName = &#63;.
	*
	* @param dictAttributeId the primary key of the current dictionary attribute
	* @param companyId the company ID
	* @param collectionName the collection name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dictionary attribute
	* @throws org.oep.core.datamgt.dictionary.NoSuchDictAttributeException if a dictionary attribute with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.datamgt.dictionary.model.DictAttribute[] findByC_CN_PrevAndNext(
		long dictAttributeId, long companyId, java.lang.String collectionName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.dictionary.NoSuchDictAttributeException;

	/**
	* Removes all the dictionary attributes where companyId = &#63; and collectionName = &#63; from the database.
	*
	* @param companyId the company ID
	* @param collectionName the collection name
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_CN(long companyId, java.lang.String collectionName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dictionary attributes where companyId = &#63; and collectionName = &#63;.
	*
	* @param companyId the company ID
	* @param collectionName the collection name
	* @return the number of matching dictionary attributes
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_CN(long companyId, java.lang.String collectionName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dictionary attributes where companyId = &#63; and collectionName = &#63; and dataType = &#63;.
	*
	* @param companyId the company ID
	* @param collectionName the collection name
	* @param dataType the data type
	* @return the matching dictionary attributes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.datamgt.dictionary.model.DictAttribute> findByC_CN_DT(
		long companyId, java.lang.String collectionName,
		java.lang.String dataType)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dictionary attributes where companyId = &#63; and collectionName = &#63; and dataType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.dictionary.model.impl.DictAttributeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public java.util.List<org.oep.core.datamgt.dictionary.model.DictAttribute> findByC_CN_DT(
		long companyId, java.lang.String collectionName,
		java.lang.String dataType, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dictionary attributes where companyId = &#63; and collectionName = &#63; and dataType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.dictionary.model.impl.DictAttributeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public java.util.List<org.oep.core.datamgt.dictionary.model.DictAttribute> findByC_CN_DT(
		long companyId, java.lang.String collectionName,
		java.lang.String dataType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dictionary attribute in the ordered set where companyId = &#63; and collectionName = &#63; and dataType = &#63;.
	*
	* @param companyId the company ID
	* @param collectionName the collection name
	* @param dataType the data type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary attribute
	* @throws org.oep.core.datamgt.dictionary.NoSuchDictAttributeException if a matching dictionary attribute could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.datamgt.dictionary.model.DictAttribute findByC_CN_DT_First(
		long companyId, java.lang.String collectionName,
		java.lang.String dataType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.dictionary.NoSuchDictAttributeException;

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
	public org.oep.core.datamgt.dictionary.model.DictAttribute fetchByC_CN_DT_First(
		long companyId, java.lang.String collectionName,
		java.lang.String dataType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dictionary attribute in the ordered set where companyId = &#63; and collectionName = &#63; and dataType = &#63;.
	*
	* @param companyId the company ID
	* @param collectionName the collection name
	* @param dataType the data type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary attribute
	* @throws org.oep.core.datamgt.dictionary.NoSuchDictAttributeException if a matching dictionary attribute could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.datamgt.dictionary.model.DictAttribute findByC_CN_DT_Last(
		long companyId, java.lang.String collectionName,
		java.lang.String dataType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.dictionary.NoSuchDictAttributeException;

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
	public org.oep.core.datamgt.dictionary.model.DictAttribute fetchByC_CN_DT_Last(
		long companyId, java.lang.String collectionName,
		java.lang.String dataType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dictionary attributes before and after the current dictionary attribute in the ordered set where companyId = &#63; and collectionName = &#63; and dataType = &#63;.
	*
	* @param dictAttributeId the primary key of the current dictionary attribute
	* @param companyId the company ID
	* @param collectionName the collection name
	* @param dataType the data type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dictionary attribute
	* @throws org.oep.core.datamgt.dictionary.NoSuchDictAttributeException if a dictionary attribute with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.datamgt.dictionary.model.DictAttribute[] findByC_CN_DT_PrevAndNext(
		long dictAttributeId, long companyId, java.lang.String collectionName,
		java.lang.String dataType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.dictionary.NoSuchDictAttributeException;

	/**
	* Removes all the dictionary attributes where companyId = &#63; and collectionName = &#63; and dataType = &#63; from the database.
	*
	* @param companyId the company ID
	* @param collectionName the collection name
	* @param dataType the data type
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_CN_DT(long companyId,
		java.lang.String collectionName, java.lang.String dataType)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dictionary attributes where companyId = &#63; and collectionName = &#63; and dataType = &#63;.
	*
	* @param companyId the company ID
	* @param collectionName the collection name
	* @param dataType the data type
	* @return the number of matching dictionary attributes
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_CN_DT(long companyId, java.lang.String collectionName,
		java.lang.String dataType)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dictionary attributes where companyId = &#63; and dataType = &#63;.
	*
	* @param companyId the company ID
	* @param dataType the data type
	* @return the matching dictionary attributes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.datamgt.dictionary.model.DictAttribute> findByC_DT(
		long companyId, java.lang.String dataType)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dictionary attributes where companyId = &#63; and dataType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.dictionary.model.impl.DictAttributeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param dataType the data type
	* @param start the lower bound of the range of dictionary attributes
	* @param end the upper bound of the range of dictionary attributes (not inclusive)
	* @return the range of matching dictionary attributes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.datamgt.dictionary.model.DictAttribute> findByC_DT(
		long companyId, java.lang.String dataType, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dictionary attributes where companyId = &#63; and dataType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.dictionary.model.impl.DictAttributeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public java.util.List<org.oep.core.datamgt.dictionary.model.DictAttribute> findByC_DT(
		long companyId, java.lang.String dataType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dictionary attribute in the ordered set where companyId = &#63; and dataType = &#63;.
	*
	* @param companyId the company ID
	* @param dataType the data type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary attribute
	* @throws org.oep.core.datamgt.dictionary.NoSuchDictAttributeException if a matching dictionary attribute could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.datamgt.dictionary.model.DictAttribute findByC_DT_First(
		long companyId, java.lang.String dataType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.dictionary.NoSuchDictAttributeException;

	/**
	* Returns the first dictionary attribute in the ordered set where companyId = &#63; and dataType = &#63;.
	*
	* @param companyId the company ID
	* @param dataType the data type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary attribute, or <code>null</code> if a matching dictionary attribute could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.datamgt.dictionary.model.DictAttribute fetchByC_DT_First(
		long companyId, java.lang.String dataType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dictionary attribute in the ordered set where companyId = &#63; and dataType = &#63;.
	*
	* @param companyId the company ID
	* @param dataType the data type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary attribute
	* @throws org.oep.core.datamgt.dictionary.NoSuchDictAttributeException if a matching dictionary attribute could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.datamgt.dictionary.model.DictAttribute findByC_DT_Last(
		long companyId, java.lang.String dataType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.dictionary.NoSuchDictAttributeException;

	/**
	* Returns the last dictionary attribute in the ordered set where companyId = &#63; and dataType = &#63;.
	*
	* @param companyId the company ID
	* @param dataType the data type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary attribute, or <code>null</code> if a matching dictionary attribute could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.datamgt.dictionary.model.DictAttribute fetchByC_DT_Last(
		long companyId, java.lang.String dataType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dictionary attributes before and after the current dictionary attribute in the ordered set where companyId = &#63; and dataType = &#63;.
	*
	* @param dictAttributeId the primary key of the current dictionary attribute
	* @param companyId the company ID
	* @param dataType the data type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dictionary attribute
	* @throws org.oep.core.datamgt.dictionary.NoSuchDictAttributeException if a dictionary attribute with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.datamgt.dictionary.model.DictAttribute[] findByC_DT_PrevAndNext(
		long dictAttributeId, long companyId, java.lang.String dataType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.dictionary.NoSuchDictAttributeException;

	/**
	* Removes all the dictionary attributes where companyId = &#63; and dataType = &#63; from the database.
	*
	* @param companyId the company ID
	* @param dataType the data type
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_DT(long companyId, java.lang.String dataType)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dictionary attributes where companyId = &#63; and dataType = &#63;.
	*
	* @param companyId the company ID
	* @param dataType the data type
	* @return the number of matching dictionary attributes
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_DT(long companyId, java.lang.String dataType)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the dictionary attribute in the entity cache if it is enabled.
	*
	* @param dictAttribute the dictionary attribute
	*/
	public void cacheResult(
		org.oep.core.datamgt.dictionary.model.DictAttribute dictAttribute);

	/**
	* Caches the dictionary attributes in the entity cache if it is enabled.
	*
	* @param dictAttributes the dictionary attributes
	*/
	public void cacheResult(
		java.util.List<org.oep.core.datamgt.dictionary.model.DictAttribute> dictAttributes);

	/**
	* Creates a new dictionary attribute with the primary key. Does not add the dictionary attribute to the database.
	*
	* @param dictAttributeId the primary key for the new dictionary attribute
	* @return the new dictionary attribute
	*/
	public org.oep.core.datamgt.dictionary.model.DictAttribute create(
		long dictAttributeId);

	/**
	* Removes the dictionary attribute with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dictAttributeId the primary key of the dictionary attribute
	* @return the dictionary attribute that was removed
	* @throws org.oep.core.datamgt.dictionary.NoSuchDictAttributeException if a dictionary attribute with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.datamgt.dictionary.model.DictAttribute remove(
		long dictAttributeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.dictionary.NoSuchDictAttributeException;

	public org.oep.core.datamgt.dictionary.model.DictAttribute updateImpl(
		org.oep.core.datamgt.dictionary.model.DictAttribute dictAttribute)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dictionary attribute with the primary key or throws a {@link org.oep.core.datamgt.dictionary.NoSuchDictAttributeException} if it could not be found.
	*
	* @param dictAttributeId the primary key of the dictionary attribute
	* @return the dictionary attribute
	* @throws org.oep.core.datamgt.dictionary.NoSuchDictAttributeException if a dictionary attribute with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.datamgt.dictionary.model.DictAttribute findByPrimaryKey(
		long dictAttributeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.dictionary.NoSuchDictAttributeException;

	/**
	* Returns the dictionary attribute with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param dictAttributeId the primary key of the dictionary attribute
	* @return the dictionary attribute, or <code>null</code> if a dictionary attribute with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.datamgt.dictionary.model.DictAttribute fetchByPrimaryKey(
		long dictAttributeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dictionary attributes.
	*
	* @return the dictionary attributes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.datamgt.dictionary.model.DictAttribute> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dictionary attributes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.dictionary.model.impl.DictAttributeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dictionary attributes
	* @param end the upper bound of the range of dictionary attributes (not inclusive)
	* @return the range of dictionary attributes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.datamgt.dictionary.model.DictAttribute> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dictionary attributes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.dictionary.model.impl.DictAttributeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dictionary attributes
	* @param end the upper bound of the range of dictionary attributes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dictionary attributes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.datamgt.dictionary.model.DictAttribute> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dictionary attributes from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dictionary attributes.
	*
	* @return the number of dictionary attributes
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}