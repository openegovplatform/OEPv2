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

import org.oep.core.datamgt.parameter.model.DefaultParameter;

/**
 * The persistence interface for the default parameter service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author TrungDK
 * @see DefaultParameterPersistenceImpl
 * @see DefaultParameterUtil
 * @generated
 */
public interface DefaultParameterPersistence extends BasePersistence<DefaultParameter> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DefaultParameterUtil} to access the default parameter persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the default parameter in the entity cache if it is enabled.
	*
	* @param defaultParameter the default parameter
	*/
	public void cacheResult(
		org.oep.core.datamgt.parameter.model.DefaultParameter defaultParameter);

	/**
	* Caches the default parameters in the entity cache if it is enabled.
	*
	* @param defaultParameters the default parameters
	*/
	public void cacheResult(
		java.util.List<org.oep.core.datamgt.parameter.model.DefaultParameter> defaultParameters);

	/**
	* Creates a new default parameter with the primary key. Does not add the default parameter to the database.
	*
	* @param defaultParameterId the primary key for the new default parameter
	* @return the new default parameter
	*/
	public org.oep.core.datamgt.parameter.model.DefaultParameter create(
		long defaultParameterId);

	/**
	* Removes the default parameter with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param defaultParameterId the primary key of the default parameter
	* @return the default parameter that was removed
	* @throws org.oep.core.datamgt.parameter.NoSuchDefaultParameterException if a default parameter with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.datamgt.parameter.model.DefaultParameter remove(
		long defaultParameterId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.parameter.NoSuchDefaultParameterException;

	public org.oep.core.datamgt.parameter.model.DefaultParameter updateImpl(
		org.oep.core.datamgt.parameter.model.DefaultParameter defaultParameter)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the default parameter with the primary key or throws a {@link org.oep.core.datamgt.parameter.NoSuchDefaultParameterException} if it could not be found.
	*
	* @param defaultParameterId the primary key of the default parameter
	* @return the default parameter
	* @throws org.oep.core.datamgt.parameter.NoSuchDefaultParameterException if a default parameter with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.datamgt.parameter.model.DefaultParameter findByPrimaryKey(
		long defaultParameterId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.datamgt.parameter.NoSuchDefaultParameterException;

	/**
	* Returns the default parameter with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param defaultParameterId the primary key of the default parameter
	* @return the default parameter, or <code>null</code> if a default parameter with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.oep.core.datamgt.parameter.model.DefaultParameter fetchByPrimaryKey(
		long defaultParameterId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the default parameters.
	*
	* @return the default parameters
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.datamgt.parameter.model.DefaultParameter> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the default parameters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.parameter.model.impl.DefaultParameterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of default parameters
	* @param end the upper bound of the range of default parameters (not inclusive)
	* @return the range of default parameters
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.datamgt.parameter.model.DefaultParameter> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the default parameters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.parameter.model.impl.DefaultParameterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of default parameters
	* @param end the upper bound of the range of default parameters (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of default parameters
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.oep.core.datamgt.parameter.model.DefaultParameter> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the default parameters from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of default parameters.
	*
	* @return the number of default parameters
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}