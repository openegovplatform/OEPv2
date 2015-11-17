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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for AppRole. This utility wraps
 * {@link org.oep.ssomgt.service.impl.AppRoleLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author trungdk
 * @see AppRoleLocalService
 * @see org.oep.ssomgt.service.base.AppRoleLocalServiceBaseImpl
 * @see org.oep.ssomgt.service.impl.AppRoleLocalServiceImpl
 * @generated
 */
public class AppRoleLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.oep.ssomgt.service.impl.AppRoleLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the app role to the database. Also notifies the appropriate model listeners.
	*
	* @param appRole the app role
	* @return the app role that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.AppRole addAppRole(
		org.oep.ssomgt.model.AppRole appRole)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addAppRole(appRole);
	}

	/**
	* Creates a new app role with the primary key. Does not add the app role to the database.
	*
	* @param appRoleId the primary key for the new app role
	* @return the new app role
	*/
	public static org.oep.ssomgt.model.AppRole createAppRole(long appRoleId) {
		return getService().createAppRole(appRoleId);
	}

	/**
	* Deletes the app role with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param appRoleId the primary key of the app role
	* @return the app role that was removed
	* @throws PortalException if a app role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.AppRole deleteAppRole(long appRoleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteAppRole(appRoleId);
	}

	/**
	* Deletes the app role from the database. Also notifies the appropriate model listeners.
	*
	* @param appRole the app role
	* @return the app role that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.AppRole deleteAppRole(
		org.oep.ssomgt.model.AppRole appRole)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteAppRole(appRole);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static org.oep.ssomgt.model.AppRole fetchAppRole(long appRoleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchAppRole(appRoleId);
	}

	/**
	* Returns the app role with the primary key.
	*
	* @param appRoleId the primary key of the app role
	* @return the app role
	* @throws PortalException if a app role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.AppRole getAppRole(long appRoleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getAppRole(appRoleId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the app roles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of app roles
	* @param end the upper bound of the range of app roles (not inclusive)
	* @return the range of app roles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.ssomgt.model.AppRole> getAppRoles(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAppRoles(start, end);
	}

	/**
	* Returns the number of app roles.
	*
	* @return the number of app roles
	* @throws SystemException if a system exception occurred
	*/
	public static int getAppRolesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAppRolesCount();
	}

	/**
	* Updates the app role in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param appRole the app role
	* @return the app role that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.AppRole updateAppRole(
		org.oep.ssomgt.model.AppRole appRole)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateAppRole(appRole);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
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
	public static org.oep.ssomgt.model.AppRole addAppRole(long applicationId,
		java.lang.String roleCode, java.lang.String roleName,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addAppRole(applicationId, roleCode, roleName, serviceContext);
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
	public static org.oep.ssomgt.model.AppRole updateAppRole(long id,
		long applicationId, java.lang.String roleCode,
		java.lang.String roleName,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateAppRole(id, applicationId, roleCode, roleName,
			serviceContext);
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
	public static org.oep.ssomgt.model.AppRole updateAppRole(
		org.oep.ssomgt.model.AppRole appRole,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().updateAppRole(appRole, serviceContext);
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
	public static void removeAppRole(org.oep.ssomgt.model.AppRole appRole)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().removeAppRole(appRole);
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
	public static void removeAppRole(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().removeAppRole(id);
	}

	public static int countByCompany(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countByCompany(companyId);
	}

	public static java.util.List<org.oep.ssomgt.model.AppRole> findByCompany(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByCompany(companyId);
	}

	public static java.util.List<org.oep.ssomgt.model.AppRole> findByCompany(
		long companyId, int startIndex, int endIndex)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByCompany(companyId, startIndex, endIndex);
	}

	public static int countByCompany(
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countByCompany(serviceContext);
	}

	public static java.util.List<org.oep.ssomgt.model.AppRole> findByCompany(
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByCompany(serviceContext);
	}

	public static java.util.List<org.oep.ssomgt.model.AppRole> findByCompany(
		int startIndex, int endIndex,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByCompany(startIndex, endIndex, serviceContext);
	}

	public static int countByCompanyGroup(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countByCompanyGroup(companyId, groupId);
	}

	public static java.util.List<org.oep.ssomgt.model.AppRole> findByCompanyGroup(
		long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByCompanyGroup(companyId, groupId);
	}

	public static java.util.List<org.oep.ssomgt.model.AppRole> findByCompanyGroup(
		long companyId, long groupId, int startIndex, int endIndex)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByCompanyGroup(companyId, groupId, startIndex, endIndex);
	}

	public static int countByCompanyGroup(
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countByCompanyGroup(serviceContext);
	}

	public static java.util.List<org.oep.ssomgt.model.AppRole> findByCompanyGroup(
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByCompanyGroup(serviceContext);
	}

	public static java.util.List<org.oep.ssomgt.model.AppRole> findByCompanyGroup(
		int startIndex, int endIndex,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByCompanyGroup(startIndex, endIndex, serviceContext);
	}

	public static int countByCompanyGroupApplication(long companyId,
		long groupId, long applicationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countByCompanyGroupApplication(companyId, groupId,
			applicationId);
	}

	public static int countByCompanyGroupApplication(long applicationId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countByCompanyGroupApplication(applicationId, serviceContext);
	}

	public static java.util.List<org.oep.ssomgt.model.AppRole> findByCompanyGroupApplication(
		long companyId, long groupId, long applicationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByCompanyGroupApplication(companyId, groupId,
			applicationId);
	}

	public static java.util.List<org.oep.ssomgt.model.AppRole> findByCompanyGroupApplication(
		long applicationId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByCompanyGroupApplication(applicationId, serviceContext);
	}

	public static java.util.List<org.oep.ssomgt.model.AppRole> findByCompanyGroupApplication(
		long companyId, long groupId, long applicationId, int startIndex,
		int endIndex)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByCompanyGroupApplication(companyId, groupId,
			applicationId, startIndex, endIndex);
	}

	public static java.util.List<org.oep.ssomgt.model.AppRole> findByCompanyGroupApplication(
		long applicationId, int startIndex, int endIndex,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByCompanyGroupApplication(applicationId, startIndex,
			endIndex, serviceContext);
	}

	public static void validate(long appRoleId, java.lang.String roleCode,
		java.lang.String roleName)
		throws org.oep.ssomgt.DuplicateRoleCodeException,
			org.oep.ssomgt.RoleCodeRangeLengthException,
			org.oep.ssomgt.RoleNameRangeLengthException {
		getService().validate(appRoleId, roleCode, roleName);
	}

	public static void clearService() {
		_service = null;
	}

	public static AppRoleLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					AppRoleLocalService.class.getName());

			if (invokableLocalService instanceof AppRoleLocalService) {
				_service = (AppRoleLocalService)invokableLocalService;
			}
			else {
				_service = new AppRoleLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(AppRoleLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(AppRoleLocalService service) {
	}

	private static AppRoleLocalService _service;
}