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

import org.oep.datamgt.model.DictData;

/**
 * The persistence interface for the dictionary data service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NQMINH
 * @see DictDataPersistenceImpl
 * @see DictDataUtil
 * @generated
 */
public interface DictDataPersistence extends BasePersistence<DictData> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DictDataUtil} to access the dictionary data persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the dictionary datas where companyId = &#63; and dataCode = &#63;.
	*
	* @param companyId the company ID
	* @param dataCode the data code
	* @return the matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.datamgt.model.DictData> findByC_DC(
		long companyId, java.lang.String dataCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dictionary datas where companyId = &#63; and dataCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param dataCode the data code
	* @param start the lower bound of the range of dictionary datas
	* @param end the upper bound of the range of dictionary datas (not inclusive)
	* @return the range of matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.datamgt.model.DictData> findByC_DC(
		long companyId, java.lang.String dataCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dictionary datas where companyId = &#63; and dataCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public java.util.List<org.oep.datamgt.model.DictData> findByC_DC(
		long companyId, java.lang.String dataCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dictionary data in the ordered set where companyId = &#63; and dataCode = &#63;.
	*
	* @param companyId the company ID
	* @param dataCode the data code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary data
	* @throws org.oep.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictData findByC_DC_First(long companyId,
		java.lang.String dataCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictDataException;

	/**
	* Returns the first dictionary data in the ordered set where companyId = &#63; and dataCode = &#63;.
	*
	* @param companyId the company ID
	* @param dataCode the data code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictData fetchByC_DC_First(long companyId,
		java.lang.String dataCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dictionary data in the ordered set where companyId = &#63; and dataCode = &#63;.
	*
	* @param companyId the company ID
	* @param dataCode the data code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary data
	* @throws org.oep.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictData findByC_DC_Last(long companyId,
		java.lang.String dataCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictDataException;

	/**
	* Returns the last dictionary data in the ordered set where companyId = &#63; and dataCode = &#63;.
	*
	* @param companyId the company ID
	* @param dataCode the data code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictData fetchByC_DC_Last(long companyId,
		java.lang.String dataCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dictionary datas before and after the current dictionary data in the ordered set where companyId = &#63; and dataCode = &#63;.
	*
	* @param dictDataId the primary key of the current dictionary data
	* @param companyId the company ID
	* @param dataCode the data code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dictionary data
	* @throws org.oep.datamgt.NoSuchDictDataException if a dictionary data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictData[] findByC_DC_PrevAndNext(
		long dictDataId, long companyId, java.lang.String dataCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictDataException;

	/**
	* Removes all the dictionary datas where companyId = &#63; and dataCode = &#63; from the database.
	*
	* @param companyId the company ID
	* @param dataCode the data code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_DC(long companyId, java.lang.String dataCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dictionary datas where companyId = &#63; and dataCode = &#63;.
	*
	* @param companyId the company ID
	* @param dataCode the data code
	* @return the number of matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_DC(long companyId, java.lang.String dataCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dictionary datas where groupId = &#63; and dataCode = &#63;.
	*
	* @param groupId the group ID
	* @param dataCode the data code
	* @return the matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.datamgt.model.DictData> findByG_DC(
		long groupId, java.lang.String dataCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dictionary datas where groupId = &#63; and dataCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param dataCode the data code
	* @param start the lower bound of the range of dictionary datas
	* @param end the upper bound of the range of dictionary datas (not inclusive)
	* @return the range of matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.datamgt.model.DictData> findByG_DC(
		long groupId, java.lang.String dataCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dictionary datas where groupId = &#63; and dataCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public java.util.List<org.oep.datamgt.model.DictData> findByG_DC(
		long groupId, java.lang.String dataCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dictionary data in the ordered set where groupId = &#63; and dataCode = &#63;.
	*
	* @param groupId the group ID
	* @param dataCode the data code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary data
	* @throws org.oep.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictData findByG_DC_First(long groupId,
		java.lang.String dataCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictDataException;

	/**
	* Returns the first dictionary data in the ordered set where groupId = &#63; and dataCode = &#63;.
	*
	* @param groupId the group ID
	* @param dataCode the data code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictData fetchByG_DC_First(long groupId,
		java.lang.String dataCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dictionary data in the ordered set where groupId = &#63; and dataCode = &#63;.
	*
	* @param groupId the group ID
	* @param dataCode the data code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary data
	* @throws org.oep.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictData findByG_DC_Last(long groupId,
		java.lang.String dataCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictDataException;

	/**
	* Returns the last dictionary data in the ordered set where groupId = &#63; and dataCode = &#63;.
	*
	* @param groupId the group ID
	* @param dataCode the data code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictData fetchByG_DC_Last(long groupId,
		java.lang.String dataCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dictionary datas before and after the current dictionary data in the ordered set where groupId = &#63; and dataCode = &#63;.
	*
	* @param dictDataId the primary key of the current dictionary data
	* @param groupId the group ID
	* @param dataCode the data code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dictionary data
	* @throws org.oep.datamgt.NoSuchDictDataException if a dictionary data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictData[] findByG_DC_PrevAndNext(
		long dictDataId, long groupId, java.lang.String dataCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictDataException;

	/**
	* Removes all the dictionary datas where groupId = &#63; and dataCode = &#63; from the database.
	*
	* @param groupId the group ID
	* @param dataCode the data code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_DC(long groupId, java.lang.String dataCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dictionary datas where groupId = &#63; and dataCode = &#63;.
	*
	* @param groupId the group ID
	* @param dataCode the data code
	* @return the number of matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_DC(long groupId, java.lang.String dataCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dictionary datas where companyId = &#63; and collectionName = &#63; and dataLevel = &#63;.
	*
	* @param companyId the company ID
	* @param collectionName the collection name
	* @param dataLevel the data level
	* @return the matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.datamgt.model.DictData> findByC_CN_DL(
		long companyId, java.lang.String collectionName, int dataLevel)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dictionary datas where companyId = &#63; and collectionName = &#63; and dataLevel = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public java.util.List<org.oep.datamgt.model.DictData> findByC_CN_DL(
		long companyId, java.lang.String collectionName, int dataLevel,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dictionary datas where companyId = &#63; and collectionName = &#63; and dataLevel = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public java.util.List<org.oep.datamgt.model.DictData> findByC_CN_DL(
		long companyId, java.lang.String collectionName, int dataLevel,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dictionary data in the ordered set where companyId = &#63; and collectionName = &#63; and dataLevel = &#63;.
	*
	* @param companyId the company ID
	* @param collectionName the collection name
	* @param dataLevel the data level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary data
	* @throws org.oep.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictData findByC_CN_DL_First(long companyId,
		java.lang.String collectionName, int dataLevel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictDataException;

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
	public org.oep.datamgt.model.DictData fetchByC_CN_DL_First(long companyId,
		java.lang.String collectionName, int dataLevel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dictionary data in the ordered set where companyId = &#63; and collectionName = &#63; and dataLevel = &#63;.
	*
	* @param companyId the company ID
	* @param collectionName the collection name
	* @param dataLevel the data level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary data
	* @throws org.oep.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictData findByC_CN_DL_Last(long companyId,
		java.lang.String collectionName, int dataLevel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictDataException;

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
	public org.oep.datamgt.model.DictData fetchByC_CN_DL_Last(long companyId,
		java.lang.String collectionName, int dataLevel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dictionary datas before and after the current dictionary data in the ordered set where companyId = &#63; and collectionName = &#63; and dataLevel = &#63;.
	*
	* @param dictDataId the primary key of the current dictionary data
	* @param companyId the company ID
	* @param collectionName the collection name
	* @param dataLevel the data level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dictionary data
	* @throws org.oep.datamgt.NoSuchDictDataException if a dictionary data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictData[] findByC_CN_DL_PrevAndNext(
		long dictDataId, long companyId, java.lang.String collectionName,
		int dataLevel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictDataException;

	/**
	* Removes all the dictionary datas where companyId = &#63; and collectionName = &#63; and dataLevel = &#63; from the database.
	*
	* @param companyId the company ID
	* @param collectionName the collection name
	* @param dataLevel the data level
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_CN_DL(long companyId,
		java.lang.String collectionName, int dataLevel)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dictionary datas where companyId = &#63; and collectionName = &#63; and dataLevel = &#63;.
	*
	* @param companyId the company ID
	* @param collectionName the collection name
	* @param dataLevel the data level
	* @return the number of matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_CN_DL(long companyId, java.lang.String collectionName,
		int dataLevel)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dictionary datas where groupId = &#63; and collectionName = &#63; and dataLevel = &#63;.
	*
	* @param groupId the group ID
	* @param collectionName the collection name
	* @param dataLevel the data level
	* @return the matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.datamgt.model.DictData> findByG_CN_DL(
		long groupId, java.lang.String collectionName, int dataLevel)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dictionary datas where groupId = &#63; and collectionName = &#63; and dataLevel = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public java.util.List<org.oep.datamgt.model.DictData> findByG_CN_DL(
		long groupId, java.lang.String collectionName, int dataLevel,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dictionary datas where groupId = &#63; and collectionName = &#63; and dataLevel = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public java.util.List<org.oep.datamgt.model.DictData> findByG_CN_DL(
		long groupId, java.lang.String collectionName, int dataLevel,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dictionary data in the ordered set where groupId = &#63; and collectionName = &#63; and dataLevel = &#63;.
	*
	* @param groupId the group ID
	* @param collectionName the collection name
	* @param dataLevel the data level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary data
	* @throws org.oep.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictData findByG_CN_DL_First(long groupId,
		java.lang.String collectionName, int dataLevel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictDataException;

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
	public org.oep.datamgt.model.DictData fetchByG_CN_DL_First(long groupId,
		java.lang.String collectionName, int dataLevel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dictionary data in the ordered set where groupId = &#63; and collectionName = &#63; and dataLevel = &#63;.
	*
	* @param groupId the group ID
	* @param collectionName the collection name
	* @param dataLevel the data level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary data
	* @throws org.oep.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictData findByG_CN_DL_Last(long groupId,
		java.lang.String collectionName, int dataLevel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictDataException;

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
	public org.oep.datamgt.model.DictData fetchByG_CN_DL_Last(long groupId,
		java.lang.String collectionName, int dataLevel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dictionary datas before and after the current dictionary data in the ordered set where groupId = &#63; and collectionName = &#63; and dataLevel = &#63;.
	*
	* @param dictDataId the primary key of the current dictionary data
	* @param groupId the group ID
	* @param collectionName the collection name
	* @param dataLevel the data level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dictionary data
	* @throws org.oep.datamgt.NoSuchDictDataException if a dictionary data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictData[] findByG_CN_DL_PrevAndNext(
		long dictDataId, long groupId, java.lang.String collectionName,
		int dataLevel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictDataException;

	/**
	* Removes all the dictionary datas where groupId = &#63; and collectionName = &#63; and dataLevel = &#63; from the database.
	*
	* @param groupId the group ID
	* @param collectionName the collection name
	* @param dataLevel the data level
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_CN_DL(long groupId, java.lang.String collectionName,
		int dataLevel)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dictionary datas where groupId = &#63; and collectionName = &#63; and dataLevel = &#63;.
	*
	* @param groupId the group ID
	* @param collectionName the collection name
	* @param dataLevel the data level
	* @return the number of matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_CN_DL(long groupId, java.lang.String collectionName,
		int dataLevel)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dictionary datas where companyId = &#63; and collectionName = &#63;.
	*
	* @param companyId the company ID
	* @param collectionName the collection name
	* @return the matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.datamgt.model.DictData> findByC_CN(
		long companyId, java.lang.String collectionName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dictionary datas where companyId = &#63; and collectionName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param collectionName the collection name
	* @param start the lower bound of the range of dictionary datas
	* @param end the upper bound of the range of dictionary datas (not inclusive)
	* @return the range of matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.datamgt.model.DictData> findByC_CN(
		long companyId, java.lang.String collectionName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dictionary datas where companyId = &#63; and collectionName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public java.util.List<org.oep.datamgt.model.DictData> findByC_CN(
		long companyId, java.lang.String collectionName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dictionary data in the ordered set where companyId = &#63; and collectionName = &#63;.
	*
	* @param companyId the company ID
	* @param collectionName the collection name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary data
	* @throws org.oep.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictData findByC_CN_First(long companyId,
		java.lang.String collectionName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictDataException;

	/**
	* Returns the first dictionary data in the ordered set where companyId = &#63; and collectionName = &#63;.
	*
	* @param companyId the company ID
	* @param collectionName the collection name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictData fetchByC_CN_First(long companyId,
		java.lang.String collectionName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dictionary data in the ordered set where companyId = &#63; and collectionName = &#63;.
	*
	* @param companyId the company ID
	* @param collectionName the collection name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary data
	* @throws org.oep.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictData findByC_CN_Last(long companyId,
		java.lang.String collectionName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictDataException;

	/**
	* Returns the last dictionary data in the ordered set where companyId = &#63; and collectionName = &#63;.
	*
	* @param companyId the company ID
	* @param collectionName the collection name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictData fetchByC_CN_Last(long companyId,
		java.lang.String collectionName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dictionary datas before and after the current dictionary data in the ordered set where companyId = &#63; and collectionName = &#63;.
	*
	* @param dictDataId the primary key of the current dictionary data
	* @param companyId the company ID
	* @param collectionName the collection name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dictionary data
	* @throws org.oep.datamgt.NoSuchDictDataException if a dictionary data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictData[] findByC_CN_PrevAndNext(
		long dictDataId, long companyId, java.lang.String collectionName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictDataException;

	/**
	* Removes all the dictionary datas where companyId = &#63; and collectionName = &#63; from the database.
	*
	* @param companyId the company ID
	* @param collectionName the collection name
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_CN(long companyId, java.lang.String collectionName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dictionary datas where companyId = &#63; and collectionName = &#63;.
	*
	* @param companyId the company ID
	* @param collectionName the collection name
	* @return the number of matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_CN(long companyId, java.lang.String collectionName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dictionary datas where groupId = &#63; and collectionName = &#63;.
	*
	* @param groupId the group ID
	* @param collectionName the collection name
	* @return the matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.datamgt.model.DictData> findByG_CN(
		long groupId, java.lang.String collectionName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dictionary datas where groupId = &#63; and collectionName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param collectionName the collection name
	* @param start the lower bound of the range of dictionary datas
	* @param end the upper bound of the range of dictionary datas (not inclusive)
	* @return the range of matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.datamgt.model.DictData> findByG_CN(
		long groupId, java.lang.String collectionName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dictionary datas where groupId = &#63; and collectionName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public java.util.List<org.oep.datamgt.model.DictData> findByG_CN(
		long groupId, java.lang.String collectionName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dictionary data in the ordered set where groupId = &#63; and collectionName = &#63;.
	*
	* @param groupId the group ID
	* @param collectionName the collection name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary data
	* @throws org.oep.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictData findByG_CN_First(long groupId,
		java.lang.String collectionName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictDataException;

	/**
	* Returns the first dictionary data in the ordered set where groupId = &#63; and collectionName = &#63;.
	*
	* @param groupId the group ID
	* @param collectionName the collection name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictData fetchByG_CN_First(long groupId,
		java.lang.String collectionName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dictionary data in the ordered set where groupId = &#63; and collectionName = &#63;.
	*
	* @param groupId the group ID
	* @param collectionName the collection name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary data
	* @throws org.oep.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictData findByG_CN_Last(long groupId,
		java.lang.String collectionName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictDataException;

	/**
	* Returns the last dictionary data in the ordered set where groupId = &#63; and collectionName = &#63;.
	*
	* @param groupId the group ID
	* @param collectionName the collection name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictData fetchByG_CN_Last(long groupId,
		java.lang.String collectionName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dictionary datas before and after the current dictionary data in the ordered set where groupId = &#63; and collectionName = &#63;.
	*
	* @param dictDataId the primary key of the current dictionary data
	* @param groupId the group ID
	* @param collectionName the collection name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dictionary data
	* @throws org.oep.datamgt.NoSuchDictDataException if a dictionary data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictData[] findByG_CN_PrevAndNext(
		long dictDataId, long groupId, java.lang.String collectionName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictDataException;

	/**
	* Removes all the dictionary datas where groupId = &#63; and collectionName = &#63; from the database.
	*
	* @param groupId the group ID
	* @param collectionName the collection name
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_CN(long groupId, java.lang.String collectionName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dictionary datas where groupId = &#63; and collectionName = &#63;.
	*
	* @param groupId the group ID
	* @param collectionName the collection name
	* @return the number of matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_CN(long groupId, java.lang.String collectionName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dictionary datas where groupId = &#63; and dataCode = &#63; and collectionName = &#63;.
	*
	* @param groupId the group ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @return the matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.datamgt.model.DictData> findByG_DC_CN(
		long groupId, java.lang.String dataCode, java.lang.String collectionName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dictionary datas where groupId = &#63; and dataCode = &#63; and collectionName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public java.util.List<org.oep.datamgt.model.DictData> findByG_DC_CN(
		long groupId, java.lang.String dataCode,
		java.lang.String collectionName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dictionary datas where groupId = &#63; and dataCode = &#63; and collectionName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public java.util.List<org.oep.datamgt.model.DictData> findByG_DC_CN(
		long groupId, java.lang.String dataCode,
		java.lang.String collectionName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dictionary data in the ordered set where groupId = &#63; and dataCode = &#63; and collectionName = &#63;.
	*
	* @param groupId the group ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary data
	* @throws org.oep.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictData findByG_DC_CN_First(long groupId,
		java.lang.String dataCode, java.lang.String collectionName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictDataException;

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
	public org.oep.datamgt.model.DictData fetchByG_DC_CN_First(long groupId,
		java.lang.String dataCode, java.lang.String collectionName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dictionary data in the ordered set where groupId = &#63; and dataCode = &#63; and collectionName = &#63;.
	*
	* @param groupId the group ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary data
	* @throws org.oep.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictData findByG_DC_CN_Last(long groupId,
		java.lang.String dataCode, java.lang.String collectionName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictDataException;

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
	public org.oep.datamgt.model.DictData fetchByG_DC_CN_Last(long groupId,
		java.lang.String dataCode, java.lang.String collectionName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dictionary datas before and after the current dictionary data in the ordered set where groupId = &#63; and dataCode = &#63; and collectionName = &#63;.
	*
	* @param dictDataId the primary key of the current dictionary data
	* @param groupId the group ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dictionary data
	* @throws org.oep.datamgt.NoSuchDictDataException if a dictionary data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictData[] findByG_DC_CN_PrevAndNext(
		long dictDataId, long groupId, java.lang.String dataCode,
		java.lang.String collectionName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictDataException;

	/**
	* Removes all the dictionary datas where groupId = &#63; and dataCode = &#63; and collectionName = &#63; from the database.
	*
	* @param groupId the group ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_DC_CN(long groupId, java.lang.String dataCode,
		java.lang.String collectionName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dictionary datas where groupId = &#63; and dataCode = &#63; and collectionName = &#63;.
	*
	* @param groupId the group ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @return the number of matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_DC_CN(long groupId, java.lang.String dataCode,
		java.lang.String collectionName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dictionary datas where companyId = &#63; and dataCode = &#63; and collectionName = &#63;.
	*
	* @param companyId the company ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @return the matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.datamgt.model.DictData> findByC_DC_CN(
		long companyId, java.lang.String dataCode,
		java.lang.String collectionName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dictionary datas where companyId = &#63; and dataCode = &#63; and collectionName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public java.util.List<org.oep.datamgt.model.DictData> findByC_DC_CN(
		long companyId, java.lang.String dataCode,
		java.lang.String collectionName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dictionary datas where companyId = &#63; and dataCode = &#63; and collectionName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public java.util.List<org.oep.datamgt.model.DictData> findByC_DC_CN(
		long companyId, java.lang.String dataCode,
		java.lang.String collectionName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dictionary data in the ordered set where companyId = &#63; and dataCode = &#63; and collectionName = &#63;.
	*
	* @param companyId the company ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary data
	* @throws org.oep.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictData findByC_DC_CN_First(long companyId,
		java.lang.String dataCode, java.lang.String collectionName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictDataException;

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
	public org.oep.datamgt.model.DictData fetchByC_DC_CN_First(long companyId,
		java.lang.String dataCode, java.lang.String collectionName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dictionary data in the ordered set where companyId = &#63; and dataCode = &#63; and collectionName = &#63;.
	*
	* @param companyId the company ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary data
	* @throws org.oep.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictData findByC_DC_CN_Last(long companyId,
		java.lang.String dataCode, java.lang.String collectionName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictDataException;

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
	public org.oep.datamgt.model.DictData fetchByC_DC_CN_Last(long companyId,
		java.lang.String dataCode, java.lang.String collectionName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dictionary datas before and after the current dictionary data in the ordered set where companyId = &#63; and dataCode = &#63; and collectionName = &#63;.
	*
	* @param dictDataId the primary key of the current dictionary data
	* @param companyId the company ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dictionary data
	* @throws org.oep.datamgt.NoSuchDictDataException if a dictionary data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictData[] findByC_DC_CN_PrevAndNext(
		long dictDataId, long companyId, java.lang.String dataCode,
		java.lang.String collectionName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictDataException;

	/**
	* Removes all the dictionary datas where companyId = &#63; and dataCode = &#63; and collectionName = &#63; from the database.
	*
	* @param companyId the company ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_DC_CN(long companyId, java.lang.String dataCode,
		java.lang.String collectionName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dictionary datas where companyId = &#63; and dataCode = &#63; and collectionName = &#63;.
	*
	* @param companyId the company ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @return the number of matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_DC_CN(long companyId, java.lang.String dataCode,
		java.lang.String collectionName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dictionary datas where groupId = &#63; and dataLevel = &#63;.
	*
	* @param groupId the group ID
	* @param dataLevel the data level
	* @return the matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.datamgt.model.DictData> findByG_DL(
		long groupId, int dataLevel)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dictionary datas where groupId = &#63; and dataLevel = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param dataLevel the data level
	* @param start the lower bound of the range of dictionary datas
	* @param end the upper bound of the range of dictionary datas (not inclusive)
	* @return the range of matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.datamgt.model.DictData> findByG_DL(
		long groupId, int dataLevel, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dictionary datas where groupId = &#63; and dataLevel = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public java.util.List<org.oep.datamgt.model.DictData> findByG_DL(
		long groupId, int dataLevel, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dictionary data in the ordered set where groupId = &#63; and dataLevel = &#63;.
	*
	* @param groupId the group ID
	* @param dataLevel the data level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary data
	* @throws org.oep.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictData findByG_DL_First(long groupId,
		int dataLevel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictDataException;

	/**
	* Returns the first dictionary data in the ordered set where groupId = &#63; and dataLevel = &#63;.
	*
	* @param groupId the group ID
	* @param dataLevel the data level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictData fetchByG_DL_First(long groupId,
		int dataLevel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dictionary data in the ordered set where groupId = &#63; and dataLevel = &#63;.
	*
	* @param groupId the group ID
	* @param dataLevel the data level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary data
	* @throws org.oep.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictData findByG_DL_Last(long groupId,
		int dataLevel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictDataException;

	/**
	* Returns the last dictionary data in the ordered set where groupId = &#63; and dataLevel = &#63;.
	*
	* @param groupId the group ID
	* @param dataLevel the data level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictData fetchByG_DL_Last(long groupId,
		int dataLevel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dictionary datas before and after the current dictionary data in the ordered set where groupId = &#63; and dataLevel = &#63;.
	*
	* @param dictDataId the primary key of the current dictionary data
	* @param groupId the group ID
	* @param dataLevel the data level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dictionary data
	* @throws org.oep.datamgt.NoSuchDictDataException if a dictionary data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictData[] findByG_DL_PrevAndNext(
		long dictDataId, long groupId, int dataLevel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictDataException;

	/**
	* Removes all the dictionary datas where groupId = &#63; and dataLevel = &#63; from the database.
	*
	* @param groupId the group ID
	* @param dataLevel the data level
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_DL(long groupId, int dataLevel)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dictionary datas where groupId = &#63; and dataLevel = &#63;.
	*
	* @param groupId the group ID
	* @param dataLevel the data level
	* @return the number of matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_DL(long groupId, int dataLevel)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dictionary datas where companyId = &#63; and dataLevel = &#63;.
	*
	* @param companyId the company ID
	* @param dataLevel the data level
	* @return the matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.datamgt.model.DictData> findByC_DL(
		long companyId, int dataLevel)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dictionary datas where companyId = &#63; and dataLevel = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param dataLevel the data level
	* @param start the lower bound of the range of dictionary datas
	* @param end the upper bound of the range of dictionary datas (not inclusive)
	* @return the range of matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.datamgt.model.DictData> findByC_DL(
		long companyId, int dataLevel, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dictionary datas where companyId = &#63; and dataLevel = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public java.util.List<org.oep.datamgt.model.DictData> findByC_DL(
		long companyId, int dataLevel, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dictionary data in the ordered set where companyId = &#63; and dataLevel = &#63;.
	*
	* @param companyId the company ID
	* @param dataLevel the data level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary data
	* @throws org.oep.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictData findByC_DL_First(long companyId,
		int dataLevel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictDataException;

	/**
	* Returns the first dictionary data in the ordered set where companyId = &#63; and dataLevel = &#63;.
	*
	* @param companyId the company ID
	* @param dataLevel the data level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictData fetchByC_DL_First(long companyId,
		int dataLevel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dictionary data in the ordered set where companyId = &#63; and dataLevel = &#63;.
	*
	* @param companyId the company ID
	* @param dataLevel the data level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary data
	* @throws org.oep.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictData findByC_DL_Last(long companyId,
		int dataLevel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictDataException;

	/**
	* Returns the last dictionary data in the ordered set where companyId = &#63; and dataLevel = &#63;.
	*
	* @param companyId the company ID
	* @param dataLevel the data level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary data, or <code>null</code> if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictData fetchByC_DL_Last(long companyId,
		int dataLevel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dictionary datas before and after the current dictionary data in the ordered set where companyId = &#63; and dataLevel = &#63;.
	*
	* @param dictDataId the primary key of the current dictionary data
	* @param companyId the company ID
	* @param dataLevel the data level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dictionary data
	* @throws org.oep.datamgt.NoSuchDictDataException if a dictionary data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictData[] findByC_DL_PrevAndNext(
		long dictDataId, long companyId, int dataLevel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictDataException;

	/**
	* Removes all the dictionary datas where companyId = &#63; and dataLevel = &#63; from the database.
	*
	* @param companyId the company ID
	* @param dataLevel the data level
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_DL(long companyId, int dataLevel)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dictionary datas where companyId = &#63; and dataLevel = &#63;.
	*
	* @param companyId the company ID
	* @param dataLevel the data level
	* @return the number of matching dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_DL(long companyId, int dataLevel)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.datamgt.model.DictData> findByG_DC_CN_S(
		long groupId, java.lang.String dataCode,
		java.lang.String collectionName, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dictionary datas where groupId = &#63; and dataCode = &#63; and collectionName = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public java.util.List<org.oep.datamgt.model.DictData> findByG_DC_CN_S(
		long groupId, java.lang.String dataCode,
		java.lang.String collectionName, int status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dictionary datas where groupId = &#63; and dataCode = &#63; and collectionName = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public java.util.List<org.oep.datamgt.model.DictData> findByG_DC_CN_S(
		long groupId, java.lang.String dataCode,
		java.lang.String collectionName, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dictionary data in the ordered set where groupId = &#63; and dataCode = &#63; and collectionName = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary data
	* @throws org.oep.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictData findByG_DC_CN_S_First(long groupId,
		java.lang.String dataCode, java.lang.String collectionName, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictDataException;

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
	public org.oep.datamgt.model.DictData fetchByG_DC_CN_S_First(long groupId,
		java.lang.String dataCode, java.lang.String collectionName, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dictionary data in the ordered set where groupId = &#63; and dataCode = &#63; and collectionName = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary data
	* @throws org.oep.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictData findByG_DC_CN_S_Last(long groupId,
		java.lang.String dataCode, java.lang.String collectionName, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictDataException;

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
	public org.oep.datamgt.model.DictData fetchByG_DC_CN_S_Last(long groupId,
		java.lang.String dataCode, java.lang.String collectionName, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	* @throws org.oep.datamgt.NoSuchDictDataException if a dictionary data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictData[] findByG_DC_CN_S_PrevAndNext(
		long dictDataId, long groupId, java.lang.String dataCode,
		java.lang.String collectionName, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictDataException;

	/**
	* Removes all the dictionary datas where groupId = &#63; and dataCode = &#63; and collectionName = &#63; and status = &#63; from the database.
	*
	* @param groupId the group ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @param status the status
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_DC_CN_S(long groupId, java.lang.String dataCode,
		java.lang.String collectionName, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public int countByG_DC_CN_S(long groupId, java.lang.String dataCode,
		java.lang.String collectionName, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.oep.datamgt.model.DictData> findByC_DC_CN_S(
		long companyId, java.lang.String dataCode,
		java.lang.String collectionName, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dictionary datas where companyId = &#63; and dataCode = &#63; and collectionName = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public java.util.List<org.oep.datamgt.model.DictData> findByC_DC_CN_S(
		long companyId, java.lang.String dataCode,
		java.lang.String collectionName, int status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dictionary datas where companyId = &#63; and dataCode = &#63; and collectionName = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public java.util.List<org.oep.datamgt.model.DictData> findByC_DC_CN_S(
		long companyId, java.lang.String dataCode,
		java.lang.String collectionName, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dictionary data in the ordered set where companyId = &#63; and dataCode = &#63; and collectionName = &#63; and status = &#63;.
	*
	* @param companyId the company ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dictionary data
	* @throws org.oep.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictData findByC_DC_CN_S_First(
		long companyId, java.lang.String dataCode,
		java.lang.String collectionName, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictDataException;

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
	public org.oep.datamgt.model.DictData fetchByC_DC_CN_S_First(
		long companyId, java.lang.String dataCode,
		java.lang.String collectionName, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dictionary data in the ordered set where companyId = &#63; and dataCode = &#63; and collectionName = &#63; and status = &#63;.
	*
	* @param companyId the company ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dictionary data
	* @throws org.oep.datamgt.NoSuchDictDataException if a matching dictionary data could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictData findByC_DC_CN_S_Last(long companyId,
		java.lang.String dataCode, java.lang.String collectionName, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictDataException;

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
	public org.oep.datamgt.model.DictData fetchByC_DC_CN_S_Last(
		long companyId, java.lang.String dataCode,
		java.lang.String collectionName, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	* @throws org.oep.datamgt.NoSuchDictDataException if a dictionary data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictData[] findByC_DC_CN_S_PrevAndNext(
		long dictDataId, long companyId, java.lang.String dataCode,
		java.lang.String collectionName, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictDataException;

	/**
	* Removes all the dictionary datas where companyId = &#63; and dataCode = &#63; and collectionName = &#63; and status = &#63; from the database.
	*
	* @param companyId the company ID
	* @param dataCode the data code
	* @param collectionName the collection name
	* @param status the status
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_DC_CN_S(long companyId, java.lang.String dataCode,
		java.lang.String collectionName, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public int countByC_DC_CN_S(long companyId, java.lang.String dataCode,
		java.lang.String collectionName, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the dictionary data in the entity cache if it is enabled.
	*
	* @param dictData the dictionary data
	*/
	public void cacheResult(org.oep.datamgt.model.DictData dictData);

	/**
	* Caches the dictionary datas in the entity cache if it is enabled.
	*
	* @param dictDatas the dictionary datas
	*/
	public void cacheResult(
		java.util.List<org.oep.datamgt.model.DictData> dictDatas);

	/**
	* Creates a new dictionary data with the primary key. Does not add the dictionary data to the database.
	*
	* @param dictDataId the primary key for the new dictionary data
	* @return the new dictionary data
	*/
	public org.oep.datamgt.model.DictData create(long dictDataId);

	/**
	* Removes the dictionary data with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dictDataId the primary key of the dictionary data
	* @return the dictionary data that was removed
	* @throws org.oep.datamgt.NoSuchDictDataException if a dictionary data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictData remove(long dictDataId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictDataException;

	public org.oep.datamgt.model.DictData updateImpl(
		org.oep.datamgt.model.DictData dictData)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dictionary data with the primary key or throws a {@link org.oep.datamgt.NoSuchDictDataException} if it could not be found.
	*
	* @param dictDataId the primary key of the dictionary data
	* @return the dictionary data
	* @throws org.oep.datamgt.NoSuchDictDataException if a dictionary data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictData findByPrimaryKey(long dictDataId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.datamgt.NoSuchDictDataException;

	/**
	* Returns the dictionary data with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param dictDataId the primary key of the dictionary data
	* @return the dictionary data, or <code>null</code> if a dictionary data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.datamgt.model.DictData fetchByPrimaryKey(long dictDataId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dictionary datas.
	*
	* @return the dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.datamgt.model.DictData> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dictionary datas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dictionary datas
	* @param end the upper bound of the range of dictionary datas (not inclusive)
	* @return the range of dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.datamgt.model.DictData> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dictionary datas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dictionary datas
	* @param end the upper bound of the range of dictionary datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.datamgt.model.DictData> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dictionary datas from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dictionary datas.
	*
	* @return the number of dictionary datas
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dictionary collections associated with the dictionary data.
	*
	* @param pk the primary key of the dictionary data
	* @return the dictionary collections associated with the dictionary data
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.datamgt.model.DictCollection> getDictCollections(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dictionary collections associated with the dictionary data.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the dictionary data
	* @param start the lower bound of the range of dictionary datas
	* @param end the upper bound of the range of dictionary datas (not inclusive)
	* @return the range of dictionary collections associated with the dictionary data
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.datamgt.model.DictCollection> getDictCollections(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dictionary collections associated with the dictionary data.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.datamgt.model.impl.DictDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the dictionary data
	* @param start the lower bound of the range of dictionary datas
	* @param end the upper bound of the range of dictionary datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dictionary collections associated with the dictionary data
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.datamgt.model.DictCollection> getDictCollections(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dictionary collections associated with the dictionary data.
	*
	* @param pk the primary key of the dictionary data
	* @return the number of dictionary collections associated with the dictionary data
	* @throws SystemException if a system exception occurred
	*/
	public int getDictCollectionsSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the dictionary collection is associated with the dictionary data.
	*
	* @param pk the primary key of the dictionary data
	* @param dictCollectionPK the primary key of the dictionary collection
	* @return <code>true</code> if the dictionary collection is associated with the dictionary data; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsDictCollection(long pk, long dictCollectionPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the dictionary data has any dictionary collections associated with it.
	*
	* @param pk the primary key of the dictionary data to check for associations with dictionary collections
	* @return <code>true</code> if the dictionary data has any dictionary collections associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsDictCollections(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the dictionary data and the dictionary collection. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dictionary data
	* @param dictCollectionPK the primary key of the dictionary collection
	* @throws SystemException if a system exception occurred
	*/
	public void addDictCollection(long pk, long dictCollectionPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the dictionary data and the dictionary collection. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dictionary data
	* @param dictCollection the dictionary collection
	* @throws SystemException if a system exception occurred
	*/
	public void addDictCollection(long pk,
		org.oep.datamgt.model.DictCollection dictCollection)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the dictionary data and the dictionary collections. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dictionary data
	* @param dictCollectionPKs the primary keys of the dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public void addDictCollections(long pk, long[] dictCollectionPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the dictionary data and the dictionary collections. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dictionary data
	* @param dictCollections the dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public void addDictCollections(long pk,
		java.util.List<org.oep.datamgt.model.DictCollection> dictCollections)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Clears all associations between the dictionary data and its dictionary collections. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dictionary data to clear the associated dictionary collections from
	* @throws SystemException if a system exception occurred
	*/
	public void clearDictCollections(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the dictionary data and the dictionary collection. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dictionary data
	* @param dictCollectionPK the primary key of the dictionary collection
	* @throws SystemException if a system exception occurred
	*/
	public void removeDictCollection(long pk, long dictCollectionPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the dictionary data and the dictionary collection. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dictionary data
	* @param dictCollection the dictionary collection
	* @throws SystemException if a system exception occurred
	*/
	public void removeDictCollection(long pk,
		org.oep.datamgt.model.DictCollection dictCollection)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the dictionary data and the dictionary collections. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dictionary data
	* @param dictCollectionPKs the primary keys of the dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public void removeDictCollections(long pk, long[] dictCollectionPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the dictionary data and the dictionary collections. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dictionary data
	* @param dictCollections the dictionary collections
	* @throws SystemException if a system exception occurred
	*/
	public void removeDictCollections(long pk,
		java.util.List<org.oep.datamgt.model.DictCollection> dictCollections)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the dictionary collections associated with the dictionary data, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dictionary data
	* @param dictCollectionPKs the primary keys of the dictionary collections to be associated with the dictionary data
	* @throws SystemException if a system exception occurred
	*/
	public void setDictCollections(long pk, long[] dictCollectionPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the dictionary collections associated with the dictionary data, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the dictionary data
	* @param dictCollections the dictionary collections to be associated with the dictionary data
	* @throws SystemException if a system exception occurred
	*/
	public void setDictCollections(long pk,
		java.util.List<org.oep.datamgt.model.DictCollection> dictCollections)
		throws com.liferay.portal.kernel.exception.SystemException;
}