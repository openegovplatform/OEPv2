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

package org.oep.usermgt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SubAccountLocalService}.
 *
 * @author NQMINH
 * @see SubAccountLocalService
 * @generated
 */
public class SubAccountLocalServiceWrapper implements SubAccountLocalService,
	ServiceWrapper<SubAccountLocalService> {
	public SubAccountLocalServiceWrapper(
		SubAccountLocalService subAccountLocalService) {
		_subAccountLocalService = subAccountLocalService;
	}

	/**
	* Adds the sub account to the database. Also notifies the appropriate model listeners.
	*
	* @param subAccount the sub account
	* @return the sub account that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.usermgt.model.SubAccount addSubAccount(
		org.oep.usermgt.model.SubAccount subAccount)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _subAccountLocalService.addSubAccount(subAccount);
	}

	/**
	* Creates a new sub account with the primary key. Does not add the sub account to the database.
	*
	* @param subAccountId the primary key for the new sub account
	* @return the new sub account
	*/
	@Override
	public org.oep.usermgt.model.SubAccount createSubAccount(long subAccountId) {
		return _subAccountLocalService.createSubAccount(subAccountId);
	}

	/**
	* Deletes the sub account with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param subAccountId the primary key of the sub account
	* @return the sub account that was removed
	* @throws PortalException if a sub account with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.usermgt.model.SubAccount deleteSubAccount(long subAccountId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _subAccountLocalService.deleteSubAccount(subAccountId);
	}

	/**
	* Deletes the sub account from the database. Also notifies the appropriate model listeners.
	*
	* @param subAccount the sub account
	* @return the sub account that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.usermgt.model.SubAccount deleteSubAccount(
		org.oep.usermgt.model.SubAccount subAccount)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _subAccountLocalService.deleteSubAccount(subAccount);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _subAccountLocalService.dynamicQuery();
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
		return _subAccountLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.SubAccountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _subAccountLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.SubAccountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _subAccountLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
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
		return _subAccountLocalService.dynamicQueryCount(dynamicQuery);
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
		return _subAccountLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public org.oep.usermgt.model.SubAccount fetchSubAccount(long subAccountId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _subAccountLocalService.fetchSubAccount(subAccountId);
	}

	/**
	* Returns the sub account with the primary key.
	*
	* @param subAccountId the primary key of the sub account
	* @return the sub account
	* @throws PortalException if a sub account with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.usermgt.model.SubAccount getSubAccount(long subAccountId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _subAccountLocalService.getSubAccount(subAccountId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _subAccountLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the sub accounts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.SubAccountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of sub accounts
	* @param end the upper bound of the range of sub accounts (not inclusive)
	* @return the range of sub accounts
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.oep.usermgt.model.SubAccount> getSubAccounts(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _subAccountLocalService.getSubAccounts(start, end);
	}

	/**
	* Returns the number of sub accounts.
	*
	* @return the number of sub accounts
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getSubAccountsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _subAccountLocalService.getSubAccountsCount();
	}

	/**
	* Updates the sub account in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param subAccount the sub account
	* @return the sub account that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.usermgt.model.SubAccount updateSubAccount(
		org.oep.usermgt.model.SubAccount subAccount)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _subAccountLocalService.updateSubAccount(subAccount);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _subAccountLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_subAccountLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _subAccountLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public SubAccountLocalService getWrappedSubAccountLocalService() {
		return _subAccountLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedSubAccountLocalService(
		SubAccountLocalService subAccountLocalService) {
		_subAccountLocalService = subAccountLocalService;
	}

	@Override
	public SubAccountLocalService getWrappedService() {
		return _subAccountLocalService;
	}

	@Override
	public void setWrappedService(SubAccountLocalService subAccountLocalService) {
		_subAccountLocalService = subAccountLocalService;
	}

	private SubAccountLocalService _subAccountLocalService;
}