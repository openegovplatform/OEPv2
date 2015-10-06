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

import com.liferay.portal.service.persistence.BasePersistence;

import org.oep.core.dossiermgt.model.ProfileData;

/**
 * The persistence interface for the profile data service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see ProfileDataPersistenceImpl
 * @see ProfileDataUtil
 * @generated
 */
public interface ProfileDataPersistence extends BasePersistence<ProfileData> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ProfileDataUtil} to access the profile data persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the profile data in the entity cache if it is enabled.
	*
	* @param profileData the profile data
	*/
	public void cacheResult(
		org.oep.core.dossiermgt.model.ProfileData profileData);

	/**
	* Caches the profile datas in the entity cache if it is enabled.
	*
	* @param profileDatas the profile datas
	*/
	public void cacheResult(
		java.util.List<org.oep.core.dossiermgt.model.ProfileData> profileDatas);

	/**
	* Creates a new profile data with the primary key. Does not add the profile data to the database.
	*
	* @param profileDataId the primary key for the new profile data
	* @return the new profile data
	*/
	public org.oep.core.dossiermgt.model.ProfileData create(long profileDataId);

	/**
	* Removes the profile data with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param profileDataId the primary key of the profile data
	* @return the profile data that was removed
	* @throws org.oep.core.dossiermgt.NoSuchProfileDataException if a profile data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.ProfileData remove(long profileDataId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchProfileDataException;

	public org.oep.core.dossiermgt.model.ProfileData updateImpl(
		org.oep.core.dossiermgt.model.ProfileData profileData)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the profile data with the primary key or throws a {@link org.oep.core.dossiermgt.NoSuchProfileDataException} if it could not be found.
	*
	* @param profileDataId the primary key of the profile data
	* @return the profile data
	* @throws org.oep.core.dossiermgt.NoSuchProfileDataException if a profile data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.ProfileData findByPrimaryKey(
		long profileDataId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.dossiermgt.NoSuchProfileDataException;

	/**
	* Returns the profile data with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param profileDataId the primary key of the profile data
	* @return the profile data, or <code>null</code> if a profile data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.dossiermgt.model.ProfileData fetchByPrimaryKey(
		long profileDataId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the profile datas.
	*
	* @return the profile datas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.dossiermgt.model.ProfileData> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the profile datas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.ProfileDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of profile datas
	* @param end the upper bound of the range of profile datas (not inclusive)
	* @return the range of profile datas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.dossiermgt.model.ProfileData> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the profile datas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.ProfileDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of profile datas
	* @param end the upper bound of the range of profile datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of profile datas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.dossiermgt.model.ProfileData> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the profile datas from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of profile datas.
	*
	* @return the number of profile datas
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}