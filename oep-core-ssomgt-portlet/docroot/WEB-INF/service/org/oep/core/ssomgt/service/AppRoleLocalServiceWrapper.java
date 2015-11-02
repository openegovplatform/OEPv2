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

package org.oep.core.ssomgt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AppRoleLocalService}.
 *
 * @author trungdk
 * @see AppRoleLocalService
 * @generated
 */
public class AppRoleLocalServiceWrapper implements AppRoleLocalService,
	ServiceWrapper<AppRoleLocalService> {
	public AppRoleLocalServiceWrapper(AppRoleLocalService appRoleLocalService) {
		_appRoleLocalService = appRoleLocalService;
	}

	/**
	* Adds the app role to the database. Also notifies the appropriate model listeners.
	*
	* @param appRole the app role
	* @return the app role that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.ssomgt.model.AppRole addAppRole(
		org.oep.core.ssomgt.model.AppRole appRole)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _appRoleLocalService.addAppRole(appRole);
	}

	/**
	* Creates a new app role with the primary key. Does not add the app role to the database.
	*
	* @param appRoleId the primary key for the new app role
	* @return the new app role
	*/
	@Override
	public org.oep.core.ssomgt.model.AppRole createAppRole(long appRoleId) {
		return _appRoleLocalService.createAppRole(appRoleId);
	}

	/**
	* Deletes the app role with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param appRoleId the primary key of the app role
	* @return the app role that was removed
	* @throws PortalException if a app role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.ssomgt.model.AppRole deleteAppRole(long appRoleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _appRoleLocalService.deleteAppRole(appRoleId);
	}

	/**
	* Deletes the app role from the database. Also notifies the appropriate model listeners.
	*
	* @param appRole the app role
	* @return the app role that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.ssomgt.model.AppRole deleteAppRole(
		org.oep.core.ssomgt.model.AppRole appRole)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _appRoleLocalService.deleteAppRole(appRole);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _appRoleLocalService.dynamicQuery();
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
		return _appRoleLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.ssomgt.model.impl.AppRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _appRoleLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.ssomgt.model.impl.AppRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _appRoleLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _appRoleLocalService.dynamicQueryCount(dynamicQuery);
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
		return _appRoleLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public org.oep.core.ssomgt.model.AppRole fetchAppRole(long appRoleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _appRoleLocalService.fetchAppRole(appRoleId);
	}

	/**
	* Returns the app role with the primary key.
	*
	* @param appRoleId the primary key of the app role
	* @return the app role
	* @throws PortalException if a app role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.ssomgt.model.AppRole getAppRole(long appRoleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _appRoleLocalService.getAppRole(appRoleId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _appRoleLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the app roles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.ssomgt.model.impl.AppRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of app roles
	* @param end the upper bound of the range of app roles (not inclusive)
	* @return the range of app roles
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.oep.core.ssomgt.model.AppRole> getAppRoles(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _appRoleLocalService.getAppRoles(start, end);
	}

	/**
	* Returns the number of app roles.
	*
	* @return the number of app roles
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getAppRolesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _appRoleLocalService.getAppRolesCount();
	}

	/**
	* Updates the app role in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param appRole the app role
	* @return the app role that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.ssomgt.model.AppRole updateAppRole(
		org.oep.core.ssomgt.model.AppRole appRole)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _appRoleLocalService.updateAppRole(appRole);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _appRoleLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_appRoleLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _appRoleLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	* ThÃƒÂªm mÃ¡Â»â€ºi mÃ¡Â»â„¢t quyÃ¡Â»ï¿½n truy cÃ¡ÂºÂ­p Ã¡Â»Â©ng dÃ¡Â»Â¥ng
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param applicationId mÃƒÂ£ Ã¡Â»Â©ng dÃ¡Â»Â¥ng
	* @param roleCode mÃƒÂ£ quyÃ¡Â»ï¿½n truy cÃ¡ÂºÂ­p Ã¡Â»Â©ng dÃ¡Â»Â¥ng
	* @param roleName tÃƒÂªn quyÃ¡Â»ï¿½n truy cÃ¡ÂºÂ­p
	* @param serviceContext ngÃ¡Â»Â¯ cÃ¡ÂºÂ£nh dÃ¡Â»â€¹ch vÃ¡Â»Â¥
	* @return: Ã„â€˜Ã¡Â»â€˜i tÃ†Â°Ã¡Â»Â£ng quyÃ¡Â»ï¿½n truy cÃ¡ÂºÂ­p Ã¡Â»Â©ng dÃ¡Â»Â¥ng mÃ¡Â»â€ºi Ã„â€˜Ã†Â°Ã¡Â»Â£c thÃƒÂªm vÃƒÂ o
	*/
	@Override
	public org.oep.core.ssomgt.model.AppRole addAppRole(long applicationId,
		java.lang.String roleCode, java.lang.String roleName,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _appRoleLocalService.addAppRole(applicationId, roleCode,
			roleName, serviceContext);
	}

	/**
	* CÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t thÃƒÂ´ng tin mÃ¡Â»â„¢t quyÃ¡Â»ï¿½n truy cÃ¡ÂºÂ­p Ã¡Â»Â©ng dÃ¡Â»Â¥ng
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param id mÃƒÂ£ phÃƒÂ¢n biÃ¡Â»â€¡t cÃ¡Â»Â§a quyÃ¡Â»ï¿½n truy cÃ¡ÂºÂ­p Ã¡Â»Â©ng dÃ¡Â»Â¥ng
	* @param applicationId mÃƒÂ£ Ã¡Â»Â©ng dÃ¡Â»Â¥ng
	* @param roleCode mÃƒÂ£ quyÃ¡Â»ï¿½n truy cÃ¡ÂºÂ­p Ã¡Â»Â©ng dÃ¡Â»Â¥ng
	* @param roleName tÃƒÂªn quyÃ¡Â»ï¿½n truy cÃ¡ÂºÂ­p
	* @param serviceContext ngÃ¡Â»Â¯ cÃ¡ÂºÂ£nh dÃ¡Â»â€¹ch vÃ¡Â»Â¥
	* @return: Ã„â€˜Ã¡Â»â€˜i tÃ†Â°Ã¡Â»Â£ng quyÃ¡Â»ï¿½n truy cÃ¡ÂºÂ­p Ã¡Â»Â©ng dÃ¡Â»Â¥ng mÃ¡Â»â€ºi Ã„â€˜Ã†Â°Ã¡Â»Â£c cÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t
	*/
	@Override
	public org.oep.core.ssomgt.model.AppRole updateAppRole(long id,
		long applicationId, java.lang.String roleCode,
		java.lang.String roleName,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _appRoleLocalService.updateAppRole(id, applicationId, roleCode,
			roleName, serviceContext);
	}

	/**
	* CÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t thÃƒÂ´ng tin mÃ¡Â»â„¢t quyÃ¡Â»ï¿½n truy cÃ¡ÂºÂ­p Ã¡Â»Â©ng dÃ¡Â»Â¥ng Ã„â€˜Ã†Â°Ã¡Â»Â£c tÃƒÂ­ch hÃ¡Â»Â£p trong cÃ¡Â»â€¢ng
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param appRole quyÃ¡Â»ï¿½n truy cÃ¡ÂºÂ­p Ã¡Â»Â©ng dÃ¡Â»Â¥ng cÃ¡ÂºÂ§n cÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t thÃƒÂ´ng tin
	* @param serviceContext ngÃ¡Â»Â¯ cÃ¡ÂºÂ£nh dÃ¡Â»â€¹ch vÃ¡Â»Â¥
	* @return: Ã„â€˜Ã¡Â»â€˜i tÃ†Â°Ã¡Â»Â£ng quyÃ¡Â»ï¿½n truy cÃ¡ÂºÂ­p Ã¡Â»Â©ng dÃ¡Â»Â¥ng mÃ¡Â»â€ºi Ã„â€˜Ã†Â°Ã¡Â»Â£c cÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t thÃƒÂ´ng tin
	*/
	@Override
	public org.oep.core.ssomgt.model.AppRole updateAppRole(
		org.oep.core.ssomgt.model.AppRole appRole,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _appRoleLocalService.updateAppRole(appRole, serviceContext);
	}

	/**
	* XÃƒÂ³a bÃ¡Â»ï¿½ thÃƒÂ´ng tin mÃ¡Â»â„¢t quyÃ¡Â»ï¿½n truy cÃ¡ÂºÂ­p Ã¡Â»Â©ng dÃ¡Â»Â¥ng Ã„â€˜Ã†Â°Ã¡Â»Â£c tÃƒÂ­ch hÃ¡Â»Â£p trong cÃ¡Â»â€¢ng
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param appRole quyÃ¡Â»ï¿½n truy cÃ¡ÂºÂ­p Ã¡Â»Â©ng dÃ¡Â»Â¥ng tÃƒÂ­ch hÃ¡Â»Â£p sÃ¡ÂºÂ½ bÃ¡Â»â€¹ xÃƒÂ³a
	* @return
	*/
	@Override
	public void removeAppRole(org.oep.core.ssomgt.model.AppRole appRole)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_appRoleLocalService.removeAppRole(appRole);
	}

	/**
	* XÃƒÂ³a bÃ¡Â»ï¿½ thÃƒÂ´ng tin mÃ¡Â»â„¢t quyÃ¡Â»ï¿½n truy cÃ¡ÂºÂ­p Ã¡Â»Â©ng dÃ¡Â»Â¥ng Ã„â€˜Ã†Â°Ã¡Â»Â£c tÃƒÂ­ch hÃ¡Â»Â£p trong cÃ¡Â»â€¢ng
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param id mÃƒÂ£ phÃƒÂ¢n biÃ¡Â»â€¡t quyÃ¡Â»ï¿½n truy cÃ¡ÂºÂ­p Ã¡Â»Â©ng dÃ¡Â»Â¥ng Ã„â€˜Ã†Â°Ã¡Â»Â£c tÃƒÂ­ch hÃ¡Â»Â£p
	* @return
	*/
	@Override
	public void removeAppRole(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_appRoleLocalService.removeAppRole(id);
	}

	@Override
	public int countByCompany(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _appRoleLocalService.countByCompany(companyId);
	}

	@Override
	public java.util.List<org.oep.core.ssomgt.model.AppRole> findByCompany(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _appRoleLocalService.findByCompany(companyId);
	}

	@Override
	public java.util.List<org.oep.core.ssomgt.model.AppRole> findByCompany(
		long companyId, int startIndex, int endIndex)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _appRoleLocalService.findByCompany(companyId, startIndex,
			endIndex);
	}

	@Override
	public int countByCompany(
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _appRoleLocalService.countByCompany(serviceContext);
	}

	@Override
	public java.util.List<org.oep.core.ssomgt.model.AppRole> findByCompany(
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _appRoleLocalService.findByCompany(serviceContext);
	}

	@Override
	public java.util.List<org.oep.core.ssomgt.model.AppRole> findByCompany(
		int startIndex, int endIndex,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _appRoleLocalService.findByCompany(startIndex, endIndex,
			serviceContext);
	}

	@Override
	public int countByCompanyGroup(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _appRoleLocalService.countByCompanyGroup(companyId, groupId);
	}

	@Override
	public java.util.List<org.oep.core.ssomgt.model.AppRole> findByCompanyGroup(
		long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _appRoleLocalService.findByCompanyGroup(companyId, groupId);
	}

	@Override
	public java.util.List<org.oep.core.ssomgt.model.AppRole> findByCompanyGroup(
		long companyId, long groupId, int startIndex, int endIndex)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _appRoleLocalService.findByCompanyGroup(companyId, groupId,
			startIndex, endIndex);
	}

	@Override
	public int countByCompanyGroup(
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _appRoleLocalService.countByCompanyGroup(serviceContext);
	}

	@Override
	public java.util.List<org.oep.core.ssomgt.model.AppRole> findByCompanyGroup(
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _appRoleLocalService.findByCompanyGroup(serviceContext);
	}

	@Override
	public java.util.List<org.oep.core.ssomgt.model.AppRole> findByCompanyGroup(
		int startIndex, int endIndex,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _appRoleLocalService.findByCompanyGroup(startIndex, endIndex,
			serviceContext);
	}

	@Override
	public int countByCompanyGroupApplication(long companyId, long groupId,
		long applicationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _appRoleLocalService.countByCompanyGroupApplication(companyId,
			groupId, applicationId);
	}

	@Override
	public int countByCompanyGroupApplication(long applicationId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _appRoleLocalService.countByCompanyGroupApplication(applicationId,
			serviceContext);
	}

	@Override
	public java.util.List<org.oep.core.ssomgt.model.AppRole> findByCompanyGroupApplication(
		long companyId, long groupId, long applicationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _appRoleLocalService.findByCompanyGroupApplication(companyId,
			groupId, applicationId);
	}

	@Override
	public java.util.List<org.oep.core.ssomgt.model.AppRole> findByCompanyGroupApplication(
		long applicationId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _appRoleLocalService.findByCompanyGroupApplication(applicationId,
			serviceContext);
	}

	@Override
	public java.util.List<org.oep.core.ssomgt.model.AppRole> findByCompanyGroupApplication(
		long companyId, long groupId, long applicationId, int startIndex,
		int endIndex)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _appRoleLocalService.findByCompanyGroupApplication(companyId,
			groupId, applicationId, startIndex, endIndex);
	}

	@Override
	public java.util.List<org.oep.core.ssomgt.model.AppRole> findByCompanyGroupApplication(
		long applicationId, int startIndex, int endIndex,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _appRoleLocalService.findByCompanyGroupApplication(applicationId,
			startIndex, endIndex, serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public AppRoleLocalService getWrappedAppRoleLocalService() {
		return _appRoleLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedAppRoleLocalService(
		AppRoleLocalService appRoleLocalService) {
		_appRoleLocalService = appRoleLocalService;
	}

	@Override
	public AppRoleLocalService getWrappedService() {
		return _appRoleLocalService;
	}

	@Override
	public void setWrappedService(AppRoleLocalService appRoleLocalService) {
		_appRoleLocalService = appRoleLocalService;
	}

	private AppRoleLocalService _appRoleLocalService;
}