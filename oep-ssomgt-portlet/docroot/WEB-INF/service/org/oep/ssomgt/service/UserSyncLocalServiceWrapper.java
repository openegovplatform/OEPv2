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

package org.oep.ssomgt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link UserSyncLocalService}.
 *
 * @author trungdk
 * @see UserSyncLocalService
 * @generated
 */
public class UserSyncLocalServiceWrapper implements UserSyncLocalService,
	ServiceWrapper<UserSyncLocalService> {
	public UserSyncLocalServiceWrapper(
		UserSyncLocalService userSyncLocalService) {
		_userSyncLocalService = userSyncLocalService;
	}

	/**
	* Adds the user sync to the database. Also notifies the appropriate model listeners.
	*
	* @param userSync the user sync
	* @return the user sync that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.ssomgt.model.UserSync addUserSync(
		org.oep.ssomgt.model.UserSync userSync)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userSyncLocalService.addUserSync(userSync);
	}

	/**
	* Creates a new user sync with the primary key. Does not add the user sync to the database.
	*
	* @param userSyncId the primary key for the new user sync
	* @return the new user sync
	*/
	@Override
	public org.oep.ssomgt.model.UserSync createUserSync(long userSyncId) {
		return _userSyncLocalService.createUserSync(userSyncId);
	}

	/**
	* Deletes the user sync with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param userSyncId the primary key of the user sync
	* @return the user sync that was removed
	* @throws PortalException if a user sync with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.ssomgt.model.UserSync deleteUserSync(long userSyncId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userSyncLocalService.deleteUserSync(userSyncId);
	}

	/**
	* Deletes the user sync from the database. Also notifies the appropriate model listeners.
	*
	* @param userSync the user sync
	* @return the user sync that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.ssomgt.model.UserSync deleteUserSync(
		org.oep.ssomgt.model.UserSync userSync)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userSyncLocalService.deleteUserSync(userSync);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _userSyncLocalService.dynamicQuery();
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
		return _userSyncLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.UserSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _userSyncLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.UserSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _userSyncLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _userSyncLocalService.dynamicQueryCount(dynamicQuery);
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
		return _userSyncLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public org.oep.ssomgt.model.UserSync fetchUserSync(long userSyncId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userSyncLocalService.fetchUserSync(userSyncId);
	}

	/**
	* Returns the user sync with the primary key.
	*
	* @param userSyncId the primary key of the user sync
	* @return the user sync
	* @throws PortalException if a user sync with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.ssomgt.model.UserSync getUserSync(long userSyncId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userSyncLocalService.getUserSync(userSyncId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userSyncLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the user syncs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.UserSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of user syncs
	* @param end the upper bound of the range of user syncs (not inclusive)
	* @return the range of user syncs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.oep.ssomgt.model.UserSync> getUserSyncs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userSyncLocalService.getUserSyncs(start, end);
	}

	/**
	* Returns the number of user syncs.
	*
	* @return the number of user syncs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getUserSyncsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userSyncLocalService.getUserSyncsCount();
	}

	/**
	* Updates the user sync in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param userSync the user sync
	* @return the user sync that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.ssomgt.model.UserSync updateUserSync(
		org.oep.ssomgt.model.UserSync userSync)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userSyncLocalService.updateUserSync(userSync);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _userSyncLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_userSyncLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _userSyncLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* ThÃƒÂªm mÃ¡Â»â€ºi mÃ¡Â»â„¢t thÃƒÂ´ng tin Ã„â€˜Ã¡Â»â€œng bÃ¡Â»â„¢ ngÃ†Â°Ã¡Â»ï¿½i dÃƒÂ¹ng
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param applicationId mÃƒÂ£ phÃƒÂ¢n biÃ¡Â»â€¡t Ã¡Â»Â©ng dÃ¡Â»Â¥ng tÃƒÂ­ch hÃ¡Â»Â£p
	* @param employeeId mÃƒÂ£ cÃƒÂ¡n bÃ¡Â»â„¢
	* @param userId mÃƒÂ£ ngÃ†Â°Ã¡Â»ï¿½i sÃ¡Â»Â­ dÃ¡Â»Â¥ng
	* @param isAccessible trÃ¡ÂºÂ¡ng thÃƒÂ¡i cÃƒÂ³ quyÃ¡Â»ï¿½n truy cÃ¡ÂºÂ­p Ã¡Â»Â©ng dÃ¡Â»Â¥ng
	* @param checkpoint Ã„â€˜iÃ¡Â»Æ’m cÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t mÃ¡Â»â€ºi nhÃ¡ÂºÂ¥t thÃƒÂ´ng tin ngÃ†Â°Ã¡Â»ï¿½i dÃƒÂ¹ng
	* @param syncTime thÃ¡Â»ï¿½i Ã„â€˜iÃ¡Â»Æ’m Ã„â€˜Ã†Â°Ã¡Â»Â£c Ã„â€˜Ã¡Â»â€œng bÃ¡Â»â„¢ cuÃ¡Â»â€˜i
	* @return: thÃƒÂ´ng tin Ã„â€˜Ã¡Â»â€œng bÃ¡Â»â„¢ ngÃ†Â°Ã¡Â»ï¿½i dÃƒÂ¹ng mÃ¡Â»â€ºi Ã„â€˜Ã†Â°Ã¡Â»Â£c thÃƒÂªm vÃƒÂ o
	*/
	@Override
	public org.oep.ssomgt.model.UserSync addUserSync(long applicationId,
		long employeeId, long userId, java.lang.String ssoUserName,
		java.lang.String appUserName, java.lang.String fullName,
		java.lang.String email, java.lang.String password,
		int accessibleStatus, java.lang.String roles,
		java.util.Date checkpoint, java.util.Date syncTime)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userSyncLocalService.addUserSync(applicationId, employeeId,
			userId, ssoUserName, appUserName, fullName, email, password,
			accessibleStatus, roles, checkpoint, syncTime);
	}

	/**
	* CÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t thÃƒÂ´ng tin Ã„â€˜Ã¡Â»â€œng bÃ¡Â»â„¢ ngÃ†Â°Ã¡Â»ï¿½i dÃƒÂ¹ng
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param id mÃƒÂ£ phÃƒÂ¢n biÃ¡Â»â€¡t cÃ¡Â»Â§a thÃƒÂ´ng tin Ã„â€˜Ã¡Â»â€œng bÃ¡Â»â„¢
	* @param applicationId mÃƒÂ£ phÃƒÂ¢n biÃ¡Â»â€¡t Ã¡Â»Â©ng dÃ¡Â»Â¥ng tÃƒÂ­ch hÃ¡Â»Â£p
	* @param employeeId mÃƒÂ£ cÃƒÂ¡n bÃ¡Â»â„¢
	* @param userId mÃƒÂ£ ngÃ†Â°Ã¡Â»ï¿½i sÃ¡Â»Â­ dÃ¡Â»Â¥ng
	* @param accessible trÃ¡ÂºÂ¡ng thÃƒÂ¡i cÃƒÂ³ quyÃ¡Â»ï¿½n truy cÃ¡ÂºÂ­p Ã¡Â»Â©ng dÃ¡Â»Â¥ng
	* @param checkpoint Ã„â€˜iÃ¡Â»Æ’m cÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t mÃ¡Â»â€ºi nhÃ¡ÂºÂ¥t thÃƒÂ´ng tin ngÃ†Â°Ã¡Â»ï¿½i dÃƒÂ¹ng
	* @param syncTime thÃ¡Â»ï¿½i Ã„â€˜iÃ¡Â»Æ’m Ã„â€˜Ã†Â°Ã¡Â»Â£c Ã„â€˜Ã¡Â»â€œng bÃ¡Â»â„¢ cuÃ¡Â»â€˜i
	* @return: Ã„â€˜Ã¡Â»â€˜i tÃ†Â°Ã¡Â»Â£ng thÃƒÂ´ng tin Ã„â€˜Ã¡Â»â€œng bÃ¡Â»â„¢ mÃ¡Â»â€ºi Ã„â€˜Ã†Â°Ã¡Â»Â£c cÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t
	*/
	@Override
	public org.oep.ssomgt.model.UserSync updateUserSync(long id,
		long applicationId, long employeeId, long userId,
		java.lang.String ssoUserName, java.lang.String appUserName,
		java.lang.String fullName, java.lang.String email,
		java.lang.String password, int accessibleStatus,
		java.lang.String roles, java.util.Date checkpoint,
		java.util.Date syncTime)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userSyncLocalService.updateUserSync(id, applicationId,
			employeeId, userId, ssoUserName, appUserName, fullName, email,
			password, accessibleStatus, roles, checkpoint, syncTime);
	}

	/**
	* CÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t thÃƒÂ´ng tin Ã„â€˜Ã¡Â»â€œng bÃ¡Â»â„¢ ngÃ†Â°Ã¡Â»ï¿½i dÃƒÂ¹ng
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param userSync thÃƒÂ´ng tin Ã„â€˜Ã¡Â»â€œng bÃ¡Â»â„¢ cÃ¡ÂºÂ§n cÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t thÃƒÂ´ng tin
	* @param serviceContext ngÃ¡Â»Â¯ cÃ¡ÂºÂ£nh dÃ¡Â»â€¹ch vÃ¡Â»Â¥
	* @return: thÃƒÂ´ng tin Ã„â€˜Ã¡Â»â€œng bÃ¡Â»â„¢ ngÃ†Â°Ã¡Â»ï¿½i dÃƒÂ¹ng mÃ¡Â»â€ºi Ã„â€˜Ã†Â°Ã¡Â»Â£c cÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t thÃƒÂ´ng tin
	*/
	@Override
	public org.oep.ssomgt.model.UserSync updateUserSync(
		org.oep.ssomgt.model.UserSync userSync,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userSyncLocalService.updateUserSync(userSync, serviceContext);
	}

	/**
	* XÃƒÂ³a bÃ¡Â»ï¿½ thÃƒÂ´ng tin mÃ¡Â»â„¢t thÃƒÂ´ng tin Ã„â€˜Ã¡Â»â€œng bÃ¡Â»â„¢ ngÃ†Â°Ã¡Â»ï¿½i dÃƒÂ¹ng
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param userSync thÃƒÂ´ng tin Ã„â€˜Ã¡Â»â€œng bÃ¡Â»â„¢ sÃ¡ÂºÂ½ bÃ¡Â»â€¹ xÃƒÂ³a
	* @return
	*/
	@Override
	public void removeUserSync(org.oep.ssomgt.model.UserSync userSync)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_userSyncLocalService.removeUserSync(userSync);
	}

	/**
	* XÃƒÂ³a bÃ¡Â»ï¿½ thÃƒÂ´ng tin mÃ¡Â»â„¢t thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p gÃ¡Â»Â­i tÃ¡Â»â€ºi ngÃ†Â°Ã¡Â»ï¿½i dÃƒÂ¹ng
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param id mÃƒÂ£ phÃƒÂ¢n biÃ¡Â»â€¡t thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p
	* @return
	*/
	@Override
	public void removeUserSync(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_userSyncLocalService.removeUserSync(id);
	}

	@Override
	public java.util.List<org.oep.ssomgt.model.UserSync> findByApplicationCheckPoint(
		long applicationId, java.util.Date checkpoint)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userSyncLocalService.findByApplicationCheckPoint(applicationId,
			checkpoint);
	}

	@Override
	public int countByApplicationSync(long applicationId, boolean isSync,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userSyncLocalService.countByApplicationSync(applicationId,
			isSync, serviceContext);
	}

	@Override
	public java.util.List<org.oep.ssomgt.model.UserSync> findByApplicationSync(
		long applicationId, boolean isSync, int startIndex, int endIndex,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userSyncLocalService.findByApplicationSync(applicationId,
			isSync, startIndex, endIndex, serviceContext);
	}

	@Override
	public org.oep.ssomgt.model.UserSync findByApplicationEmployee(
		long applicationId, long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchUserSyncException {
		return _userSyncLocalService.findByApplicationEmployee(applicationId,
			employeeId);
	}

	@Override
	public org.oep.ssomgt.model.UserSync findByApplicationUser(
		long applicationId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchUserSyncException {
		return _userSyncLocalService.findByApplicationUser(applicationId, userId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public UserSyncLocalService getWrappedUserSyncLocalService() {
		return _userSyncLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedUserSyncLocalService(
		UserSyncLocalService userSyncLocalService) {
		_userSyncLocalService = userSyncLocalService;
	}

	@Override
	public UserSyncLocalService getWrappedService() {
		return _userSyncLocalService;
	}

	@Override
	public void setWrappedService(UserSyncLocalService userSyncLocalService) {
		_userSyncLocalService = userSyncLocalService;
	}

	private UserSyncLocalService _userSyncLocalService;
}