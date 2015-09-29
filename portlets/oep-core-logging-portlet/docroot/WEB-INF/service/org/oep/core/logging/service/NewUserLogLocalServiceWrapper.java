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

package org.oep.core.logging.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NewUserLogLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see NewUserLogLocalService
 * @generated
 */
public class NewUserLogLocalServiceWrapper implements NewUserLogLocalService,
	ServiceWrapper<NewUserLogLocalService> {
	public NewUserLogLocalServiceWrapper(
		NewUserLogLocalService newUserLogLocalService) {
		_newUserLogLocalService = newUserLogLocalService;
	}

	/**
	* Adds the new user log to the database. Also notifies the appropriate model listeners.
	*
	* @param newUserLog the new user log
	* @return the new user log that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.logging.model.NewUserLog addNewUserLog(
		org.oep.core.logging.model.NewUserLog newUserLog)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _newUserLogLocalService.addNewUserLog(newUserLog);
	}

	/**
	* Creates a new new user log with the primary key. Does not add the new user log to the database.
	*
	* @param id the primary key for the new new user log
	* @return the new new user log
	*/
	@Override
	public org.oep.core.logging.model.NewUserLog createNewUserLog(long id) {
		return _newUserLogLocalService.createNewUserLog(id);
	}

	/**
	* Deletes the new user log with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the new user log
	* @return the new user log that was removed
	* @throws PortalException if a new user log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.logging.model.NewUserLog deleteNewUserLog(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _newUserLogLocalService.deleteNewUserLog(id);
	}

	/**
	* Deletes the new user log from the database. Also notifies the appropriate model listeners.
	*
	* @param newUserLog the new user log
	* @return the new user log that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.logging.model.NewUserLog deleteNewUserLog(
		org.oep.core.logging.model.NewUserLog newUserLog)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _newUserLogLocalService.deleteNewUserLog(newUserLog);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _newUserLogLocalService.dynamicQuery();
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
		return _newUserLogLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.logging.model.impl.NewUserLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _newUserLogLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.logging.model.impl.NewUserLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _newUserLogLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _newUserLogLocalService.dynamicQueryCount(dynamicQuery);
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
		return _newUserLogLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public org.oep.core.logging.model.NewUserLog fetchNewUserLog(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _newUserLogLocalService.fetchNewUserLog(id);
	}

	/**
	* Returns the new user log with the primary key.
	*
	* @param id the primary key of the new user log
	* @return the new user log
	* @throws PortalException if a new user log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.logging.model.NewUserLog getNewUserLog(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _newUserLogLocalService.getNewUserLog(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _newUserLogLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the new user logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.logging.model.impl.NewUserLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of new user logs
	* @param end the upper bound of the range of new user logs (not inclusive)
	* @return the range of new user logs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.oep.core.logging.model.NewUserLog> getNewUserLogs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _newUserLogLocalService.getNewUserLogs(start, end);
	}

	/**
	* Returns the number of new user logs.
	*
	* @return the number of new user logs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getNewUserLogsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _newUserLogLocalService.getNewUserLogsCount();
	}

	/**
	* Updates the new user log in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param newUserLog the new user log
	* @return the new user log that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.logging.model.NewUserLog updateNewUserLog(
		org.oep.core.logging.model.NewUserLog newUserLog)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _newUserLogLocalService.updateNewUserLog(newUserLog);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _newUserLogLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_newUserLogLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _newUserLogLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* This method add User's new log
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  20-September-2015  ThongDV    Create new
	*
	* @param userId
	* @param groupId
	* @param companyId
	* @param createDate
	* @param username
	* @param email
	* @param siter
	* @param page
	* @param action
	* @param description
	* @param userActivityId
	* @throws PortalException
	* @throws SystemException
	* @return NewUserLog
	*/
	@Override
	public org.oep.core.logging.model.NewUserLog addNewUserLog(long userId,
		long groupId, long companyId, java.util.Date createDate,
		java.lang.String userName, java.lang.String email,
		java.lang.String site, java.lang.String page, java.lang.String action,
		java.lang.String description, long userActivityId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _newUserLogLocalService.addNewUserLog(userId, groupId,
			companyId, createDate, userName, email, site, page, action,
			description, userActivityId);
	}

	/**
	* This method update User's new log
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  20-September-2015  ThongDV    Create new
	*
	* @param userId
	* @param groupId
	* @param companyId
	* @param createDate
	* @param username
	* @param email
	* @param siter
	* @param page
	* @param action
	* @param description
	* @param userActivityId
	* @throws PortalException
	* @throws SystemException
	* @return NewUserLog
	*/
	@Override
	public org.oep.core.logging.model.NewUserLog updateNewUserLog(long userId,
		long groupId, long companyId, java.util.Date createDate,
		java.lang.String userName, java.lang.String email,
		java.lang.String site, java.lang.String page, java.lang.String action,
		java.lang.String description, long userActivityId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _newUserLogLocalService.updateNewUserLog(userId, groupId,
			companyId, createDate, userName, email, site, page, action,
			description, userActivityId);
	}

	/**
	* This method count User's new log by list parameter
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  20-September-2015  ThongDV    Create new
	*
	* @param keyWord
	* @param isUserName
	* @param isEmail
	* @param fromDate
	* @param toDate
	* @throws SystemException, PortalException
	* @return Integer
	*/
	@Override
	public int countByParam(java.lang.String keyWord, boolean isUserName,
		boolean isEmail, java.util.Date fromDate, java.util.Date toDate,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _newUserLogLocalService.countByParam(keyWord, isUserName,
			isEmail, fromDate, toDate, serviceContext);
	}

	/**
	* This method get list record User's new log by list parameter
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  20-September-2015  ThongDV    Create new
	*
	* @param keyWord
	* @param isUserName
	* @param isEmail
	* @param fromDate
	* @param toDate
	* @throws SystemException, PortalException
	* @return List<NewUserLog>
	*/
	@Override
	public java.util.List<org.oep.core.logging.model.NewUserLog> getByParam(
		java.lang.String keyWord, boolean isUserName, boolean isEmail,
		java.util.Date fromDate, java.util.Date toDate,
		com.liferay.portal.service.ServiceContext serviceContext, int begin,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _newUserLogLocalService.getByParam(keyWord, isUserName, isEmail,
			fromDate, toDate, serviceContext, begin, end);
	}

	/**
	* This method get User's new log by userId
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  20-September-2015  ThongDV    Create new
	*
	* @param: userId
	* @throws SystemException
	* @return: NewUserLog
	*/
	@Override
	public org.oep.core.logging.model.NewUserLog getByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _newUserLogLocalService.getByUserId(userId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public NewUserLogLocalService getWrappedNewUserLogLocalService() {
		return _newUserLogLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedNewUserLogLocalService(
		NewUserLogLocalService newUserLogLocalService) {
		_newUserLogLocalService = newUserLogLocalService;
	}

	@Override
	public NewUserLogLocalService getWrappedService() {
		return _newUserLogLocalService;
	}

	@Override
	public void setWrappedService(NewUserLogLocalService newUserLogLocalService) {
		_newUserLogLocalService = newUserLogLocalService;
	}

	private NewUserLogLocalService _newUserLogLocalService;
}