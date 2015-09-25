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

import org.oep.core.datamgt.dictionary.model.DictMetaData;

/**
 * The persistence interface for the dictionary meta data service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author TrungDK
 * @see DictMetaDataPersistenceImpl
 * @see DictMetaDataUtil
 * @generated
 */
public interface DictMetaDataPersistence extends BasePersistence<DictMetaData> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DictMetaDataUtil} to access the dictionary meta data persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the dictionary meta datas where companyId = &#63; and dictDataId = &#63;.
	*
	* @param companyId the company ID
	* @param dictDataId the dict data ID
	* @return the matching dictionary meta datas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.datamgt.dictionary.model.DictMetaData> findByC_DI(
		long companyId, long dictDataId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dictionary meta datas where companyId = &#63; and dictDataId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.dictionary.model.impl.DictMetaDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param dictDataId the dict data ID
	* @param start the lower bound of the range of dictionary meta datas
	* @param end the upper bound of the range of dictionary meta datas (not inclusive)
	* @return the range of matching dictionary meta datas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.datamgt.dictionary.model.DictMetaData> findByC_DI(
		long companyId, long dictDataId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dictionary meta datas where companyId = &#63; and dictDataId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.dictionary.model.impl.DictMetaDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public java.util.List<org.oep.core.datamgt.dictionary.model.DictMetaData> findByC_DI(
		long companyId, long dictDataId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dictionary meta data in the ordered set where companyId = &#63; and dictDataId = &#63;.
	*
	* @param companyId the company ID
	* @param dictDataId the dict data ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary meta data
	* @throws org.oep.core.datamgt.dictionary.NoSuchDictMetaDataException if a matching dictionary meta data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.datamgt.dictionary.model.DictMetaData findByC_DI_First(
		long companyId, long dictDataId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.dictionary.NoSuchDictMetaDataException;

	/**
	* Returns the first dictionary meta data in the ordered set where companyId = &#63; and dictDataId = &#63;.
	*
	* @param companyId the company ID
	* @param dictDataId the dict data ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary meta data, or <code>null</code> if a matching dictionary meta data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.datamgt.dictionary.model.DictMetaData fetchByC_DI_First(
		long companyId, long dictDataId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dictionary meta data in the ordered set where companyId = &#63; and dictDataId = &#63;.
	*
	* @param companyId the company ID
	* @param dictDataId the dict data ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary meta data
	* @throws org.oep.core.datamgt.dictionary.NoSuchDictMetaDataException if a matching dictionary meta data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.datamgt.dictionary.model.DictMetaData findByC_DI_Last(
		long companyId, long dictDataId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.dictionary.NoSuchDictMetaDataException;

	/**
	* Returns the last dictionary meta data in the ordered set where companyId = &#63; and dictDataId = &#63;.
	*
	* @param companyId the company ID
	* @param dictDataId the dict data ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary meta data, or <code>null</code> if a matching dictionary meta data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.datamgt.dictionary.model.DictMetaData fetchByC_DI_Last(
		long companyId, long dictDataId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dictionary meta datas before and after the current dictionary meta data in the ordered set where companyId = &#63; and dictDataId = &#63;.
	*
	* @param dictMetaDataId the primary key of the current dictionary meta data
	* @param companyId the company ID
	* @param dictDataId the dict data ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dictionary meta data
	* @throws org.oep.core.datamgt.dictionary.NoSuchDictMetaDataException if a dictionary meta data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.datamgt.dictionary.model.DictMetaData[] findByC_DI_PrevAndNext(
		long dictMetaDataId, long companyId, long dictDataId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.dictionary.NoSuchDictMetaDataException;

	/**
	* Removes all the dictionary meta datas where companyId = &#63; and dictDataId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param dictDataId the dict data ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_DI(long companyId, long dictDataId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dictionary meta datas where companyId = &#63; and dictDataId = &#63;.
	*
	* @param companyId the company ID
	* @param dictDataId the dict data ID
	* @return the number of matching dictionary meta datas
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_DI(long companyId, long dictDataId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dictionary meta data where companyId = &#63; and dictDataId = &#63; and attributeName = &#63; or throws a {@link org.oep.core.datamgt.dictionary.NoSuchDictMetaDataException} if it could not be found.
	*
	* @param companyId the company ID
	* @param dictDataId the dict data ID
	* @param attributeName the attribute name
	* @return the matching dictionary meta data
	* @throws org.oep.core.datamgt.dictionary.NoSuchDictMetaDataException if a matching dictionary meta data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.datamgt.dictionary.model.DictMetaData findByC_DI_N(
		long companyId, long dictDataId, java.lang.String attributeName)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.dictionary.NoSuchDictMetaDataException;

	/**
	* Returns the dictionary meta data where companyId = &#63; and dictDataId = &#63; and attributeName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param companyId the company ID
	* @param dictDataId the dict data ID
	* @param attributeName the attribute name
	* @return the matching dictionary meta data, or <code>null</code> if a matching dictionary meta data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.datamgt.dictionary.model.DictMetaData fetchByC_DI_N(
		long companyId, long dictDataId, java.lang.String attributeName)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.oep.core.datamgt.dictionary.model.DictMetaData fetchByC_DI_N(
		long companyId, long dictDataId, java.lang.String attributeName,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the dictionary meta data where companyId = &#63; and dictDataId = &#63; and attributeName = &#63; from the database.
	*
	* @param companyId the company ID
	* @param dictDataId the dict data ID
	* @param attributeName the attribute name
	* @return the dictionary meta data that was removed
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.datamgt.dictionary.model.DictMetaData removeByC_DI_N(
		long companyId, long dictDataId, java.lang.String attributeName)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.dictionary.NoSuchDictMetaDataException;

	/**
	* Returns the number of dictionary meta datas where companyId = &#63; and dictDataId = &#63; and attributeName = &#63;.
	*
	* @param companyId the company ID
	* @param dictDataId the dict data ID
	* @param attributeName the attribute name
	* @return the number of matching dictionary meta datas
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_DI_N(long companyId, long dictDataId,
		java.lang.String attributeName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the dictionary meta data in the entity cache if it is enabled.
	*
	* @param dictMetaData the dictionary meta data
	*/
	public void cacheResult(
		org.oep.core.datamgt.dictionary.model.DictMetaData dictMetaData);

	/**
	* Caches the dictionary meta datas in the entity cache if it is enabled.
	*
	* @param dictMetaDatas the dictionary meta datas
	*/
	public void cacheResult(
		java.util.List<org.oep.core.datamgt.dictionary.model.DictMetaData> dictMetaDatas);

	/**
	* Creates a new dictionary meta data with the primary key. Does not add the dictionary meta data to the database.
	*
	* @param dictMetaDataId the primary key for the new dictionary meta data
	* @return the new dictionary meta data
	*/
	public org.oep.core.datamgt.dictionary.model.DictMetaData create(
		long dictMetaDataId);

	/**
	* Removes the dictionary meta data with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dictMetaDataId the primary key of the dictionary meta data
	* @return the dictionary meta data that was removed
	* @throws org.oep.core.datamgt.dictionary.NoSuchDictMetaDataException if a dictionary meta data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.datamgt.dictionary.model.DictMetaData remove(
		long dictMetaDataId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.dictionary.NoSuchDictMetaDataException;

	public org.oep.core.datamgt.dictionary.model.DictMetaData updateImpl(
		org.oep.core.datamgt.dictionary.model.DictMetaData dictMetaData)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dictionary meta data with the primary key or throws a {@link org.oep.core.datamgt.dictionary.NoSuchDictMetaDataException} if it could not be found.
	*
	* @param dictMetaDataId the primary key of the dictionary meta data
	* @return the dictionary meta data
	* @throws org.oep.core.datamgt.dictionary.NoSuchDictMetaDataException if a dictionary meta data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.datamgt.dictionary.model.DictMetaData findByPrimaryKey(
		long dictMetaDataId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.dictionary.NoSuchDictMetaDataException;

	/**
	* Returns the dictionary meta data with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param dictMetaDataId the primary key of the dictionary meta data
	* @return the dictionary meta data, or <code>null</code> if a dictionary meta data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.datamgt.dictionary.model.DictMetaData fetchByPrimaryKey(
		long dictMetaDataId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dictionary meta datas.
	*
	* @return the dictionary meta datas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.datamgt.dictionary.model.DictMetaData> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dictionary meta datas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.dictionary.model.impl.DictMetaDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dictionary meta datas
	* @param end the upper bound of the range of dictionary meta datas (not inclusive)
	* @return the range of dictionary meta datas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.datamgt.dictionary.model.DictMetaData> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dictionary meta datas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.dictionary.model.impl.DictMetaDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dictionary meta datas
	* @param end the upper bound of the range of dictionary meta datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dictionary meta datas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.datamgt.dictionary.model.DictMetaData> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dictionary meta datas from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dictionary meta datas.
	*
	* @return the number of dictionary meta datas
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}