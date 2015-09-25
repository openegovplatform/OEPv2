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

package org.oep.core.datamgt.parameter.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link UserParameterLocalService}.
 *
 * @author TrungDK
 * @see UserParameterLocalService
 * @generated
 */
public class UserParameterLocalServiceWrapper
	implements UserParameterLocalService,
		ServiceWrapper<UserParameterLocalService> {
	public UserParameterLocalServiceWrapper(
		UserParameterLocalService userParameterLocalService) {
		_userParameterLocalService = userParameterLocalService;
	}

	/**
	* Adds the user parameter to the database. Also notifies the appropriate model listeners.
	*
	* @param userParameter the user parameter
	* @return the user parameter that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.datamgt.parameter.model.UserParameter addUserParameter(
		org.oep.core.datamgt.parameter.model.UserParameter userParameter)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userParameterLocalService.addUserParameter(userParameter);
	}

	/**
	* Creates a new user parameter with the primary key. Does not add the user parameter to the database.
	*
	* @param userParameterId the primary key for the new user parameter
	* @return the new user parameter
	*/
	@Override
	public org.oep.core.datamgt.parameter.model.UserParameter createUserParameter(
		long userParameterId) {
		return _userParameterLocalService.createUserParameter(userParameterId);
	}

	/**
	* Deletes the user parameter with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param userParameterId the primary key of the user parameter
	* @return the user parameter that was removed
	* @throws PortalException if a user parameter with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.datamgt.parameter.model.UserParameter deleteUserParameter(
		long userParameterId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userParameterLocalService.deleteUserParameter(userParameterId);
	}

	/**
	* Deletes the user parameter from the database. Also notifies the appropriate model listeners.
	*
	* @param userParameter the user parameter
	* @return the user parameter that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.datamgt.parameter.model.UserParameter deleteUserParameter(
		org.oep.core.datamgt.parameter.model.UserParameter userParameter)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userParameterLocalService.deleteUserParameter(userParameter);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _userParameterLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userParameterLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.parameter.model.impl.UserParameterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _userParameterLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.parameter.model.impl.UserParameterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userParameterLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userParameterLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userParameterLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public org.oep.core.datamgt.parameter.model.UserParameter fetchUserParameter(
		long userParameterId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userParameterLocalService.fetchUserParameter(userParameterId);
	}

	/**
	* Returns the user parameter with the primary key.
	*
	* @param userParameterId the primary key of the user parameter
	* @return the user parameter
	* @throws PortalException if a user parameter with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.datamgt.parameter.model.UserParameter getUserParameter(
		long userParameterId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userParameterLocalService.getUserParameter(userParameterId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userParameterLocalService.getPersistedModel(primaryKeyObj);
	}

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
	@Override
	public java.util.List<org.oep.core.datamgt.parameter.model.UserParameter> getUserParameters(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userParameterLocalService.getUserParameters(start, end);
	}

	/**
	* Returns the number of user parameters.
	*
	* @return the number of user parameters
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getUserParametersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userParameterLocalService.getUserParametersCount();
	}

	/**
	* Updates the user parameter in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param userParameter the user parameter
	* @return the user parameter that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.datamgt.parameter.model.UserParameter updateUserParameter(
		org.oep.core.datamgt.parameter.model.UserParameter userParameter)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userParameterLocalService.updateUserParameter(userParameter);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _userParameterLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_userParameterLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _userParameterLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public UserParameterLocalService getWrappedUserParameterLocalService() {
		return _userParameterLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedUserParameterLocalService(
		UserParameterLocalService userParameterLocalService) {
		_userParameterLocalService = userParameterLocalService;
	}

	@Override
	public UserParameterLocalService getWrappedService() {
		return _userParameterLocalService;
	}

	@Override
	public void setWrappedService(
		UserParameterLocalService userParameterLocalService) {
		_userParameterLocalService = userParameterLocalService;
	}

	private UserParameterLocalService _userParameterLocalService;
}