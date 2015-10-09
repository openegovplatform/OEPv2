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

package org.oep.core.datamgt.parameter.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import org.oep.core.datamgt.parameter.model.UserParameter;

/**
 * The persistence interface for the user parameter service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author TrungDK
 * @see UserParameterPersistenceImpl
 * @see UserParameterUtil
 * @generated
 */
public interface UserParameterPersistence extends BasePersistence<UserParameter> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link UserParameterUtil} to access the user parameter persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the user parameter in the entity cache if it is enabled.
	*
	* @param userParameter the user parameter
	*/
	public void cacheResult(
		org.oep.core.datamgt.parameter.model.UserParameter userParameter);

	/**
	* Caches the user parameters in the entity cache if it is enabled.
	*
	* @param userParameters the user parameters
	*/
	public void cacheResult(
		java.util.List<org.oep.core.datamgt.parameter.model.UserParameter> userParameters);

	/**
	* Creates a new user parameter with the primary key. Does not add the user parameter to the database.
	*
	* @param userParameterId the primary key for the new user parameter
	* @return the new user parameter
	*/
	public org.oep.core.datamgt.parameter.model.UserParameter create(
		long userParameterId);

	/**
	* Removes the user parameter with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param userParameterId the primary key of the user parameter
	* @return the user parameter that was removed
	* @throws org.oep.core.datamgt.parameter.NoSuchUserParameterException if a user parameter with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.datamgt.parameter.model.UserParameter remove(
		long userParameterId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.parameter.NoSuchUserParameterException;

	public org.oep.core.datamgt.parameter.model.UserParameter updateImpl(
		org.oep.core.datamgt.parameter.model.UserParameter userParameter)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the user parameter with the primary key or throws a {@link org.oep.core.datamgt.parameter.NoSuchUserParameterException} if it could not be found.
	*
	* @param userParameterId the primary key of the user parameter
	* @return the user parameter
	* @throws org.oep.core.datamgt.parameter.NoSuchUserParameterException if a user parameter with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.datamgt.parameter.model.UserParameter findByPrimaryKey(
		long userParameterId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.parameter.NoSuchUserParameterException;

	/**
	* Returns the user parameter with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param userParameterId the primary key of the user parameter
	* @return the user parameter, or <code>null</code> if a user parameter with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.datamgt.parameter.model.UserParameter fetchByPrimaryKey(
		long userParameterId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the user parameters.
	*
	* @return the user parameters
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.datamgt.parameter.model.UserParameter> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the user parameters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.parameter.model.impl.UserParameterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of user parameters
	* @param end the upper bound of the range of user parameters (not inclusive)
	* @return the range of user parameters
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.datamgt.parameter.model.UserParameter> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the user parameters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.parameter.model.impl.UserParameterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of user parameters
	* @param end the upper bound of the range of user parameters (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of user parameters
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.datamgt.parameter.model.UserParameter> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the user parameters from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of user parameters.
	*
	* @return the number of user parameters
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}