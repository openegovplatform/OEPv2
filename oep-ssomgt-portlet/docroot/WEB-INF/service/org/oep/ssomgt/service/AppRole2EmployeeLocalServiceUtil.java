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
 * Provides the local service utility for AppRole2Employee. This utility wraps
 * {@link org.oep.ssomgt.service.impl.AppRole2EmployeeLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author trungdk
 * @see AppRole2EmployeeLocalService
 * @see org.oep.ssomgt.service.base.AppRole2EmployeeLocalServiceBaseImpl
 * @see org.oep.ssomgt.service.impl.AppRole2EmployeeLocalServiceImpl
 * @generated
 */
public class AppRole2EmployeeLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.oep.ssomgt.service.impl.AppRole2EmployeeLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the app role2 employee to the database. Also notifies the appropriate model listeners.
	*
	* @param appRole2Employee the app role2 employee
	* @return the app role2 employee that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.AppRole2Employee addAppRole2Employee(
		org.oep.ssomgt.model.AppRole2Employee appRole2Employee)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addAppRole2Employee(appRole2Employee);
	}

	/**
	* Creates a new app role2 employee with the primary key. Does not add the app role2 employee to the database.
	*
	* @param appRole2EmployeeId the primary key for the new app role2 employee
	* @return the new app role2 employee
	*/
	public static org.oep.ssomgt.model.AppRole2Employee createAppRole2Employee(
		long appRole2EmployeeId) {
		return getService().createAppRole2Employee(appRole2EmployeeId);
	}

	/**
	* Deletes the app role2 employee with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param appRole2EmployeeId the primary key of the app role2 employee
	* @return the app role2 employee that was removed
	* @throws PortalException if a app role2 employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.AppRole2Employee deleteAppRole2Employee(
		long appRole2EmployeeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteAppRole2Employee(appRole2EmployeeId);
	}

	/**
	* Deletes the app role2 employee from the database. Also notifies the appropriate model listeners.
	*
	* @param appRole2Employee the app role2 employee
	* @return the app role2 employee that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.AppRole2Employee deleteAppRole2Employee(
		org.oep.ssomgt.model.AppRole2Employee appRole2Employee)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteAppRole2Employee(appRole2Employee);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppRole2EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppRole2EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static org.oep.ssomgt.model.AppRole2Employee fetchAppRole2Employee(
		long appRole2EmployeeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchAppRole2Employee(appRole2EmployeeId);
	}

	/**
	* Returns the app role2 employee with the primary key.
	*
	* @param appRole2EmployeeId the primary key of the app role2 employee
	* @return the app role2 employee
	* @throws PortalException if a app role2 employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.AppRole2Employee getAppRole2Employee(
		long appRole2EmployeeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getAppRole2Employee(appRole2EmployeeId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the app role2 employees.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppRole2EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of app role2 employees
	* @param end the upper bound of the range of app role2 employees (not inclusive)
	* @return the range of app role2 employees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.ssomgt.model.AppRole2Employee> getAppRole2Employees(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAppRole2Employees(start, end);
	}

	/**
	* Returns the number of app role2 employees.
	*
	* @return the number of app role2 employees
	* @throws SystemException if a system exception occurred
	*/
	public static int getAppRole2EmployeesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAppRole2EmployeesCount();
	}

	/**
	* Updates the app role2 employee in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param appRole2Employee the app role2 employee
	* @return the app role2 employee that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.ssomgt.model.AppRole2Employee updateAppRole2Employee(
		org.oep.ssomgt.model.AppRole2Employee appRole2Employee)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateAppRole2Employee(appRole2Employee);
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
	* ThÃƒÂªm mÃ¡Â»â€ºi mÃ¡Â»â„¢t vai trÃƒÂ² truy cÃ¡ÂºÂ­p Ã¡Â»Â©ng dÃ¡Â»Â¥ng theo cÃƒÂ¡n bÃ¡Â»â„¢
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param appRoleId mÃƒÂ£ vai trÃƒÂ² Ã¡Â»Â©ng dÃ¡Â»Â¥ng
	* @param employeeId mÃƒÂ£ cÃƒÂ¡n bÃ¡Â»â„¢ viÃƒÂªn chÃ¡Â»Â©c
	* @param serviceContext ngÃ¡Â»Â¯ cÃ¡ÂºÂ£nh dÃ¡Â»â€¹ch vÃ¡Â»Â¥
	* @return: Ã„â€˜Ã¡Â»â€˜i tÃ†Â°Ã¡Â»Â£ng vai trÃƒÂ² truy cÃ¡ÂºÂ­p cho cÃƒÂ¡n bÃ¡Â»â„¢ mÃ¡Â»â€ºi Ã„â€˜Ã†Â°Ã¡Â»Â£c thÃƒÂªm vÃƒÂ o
	*/
	public static org.oep.ssomgt.model.AppRole2Employee addAppRole2Employee(
		long appRoleId, long employeeId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addAppRole2Employee(appRoleId, employeeId, serviceContext);
	}

	/**
	* CÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t thÃƒÂ´ng tin mÃ¡Â»â„¢t vai trÃƒÂ² truy cÃ¡ÂºÂ­p Ã¡Â»Â©ng dÃ¡Â»Â¥ng theo vÃ¡Â»â€¹ trÃƒÂ­ cÃƒÂ´ng tÃƒÂ¡c
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param id mÃƒÂ£ phÃƒÂ¢n biÃ¡Â»â€¡t vai trÃƒÂ² truy cÃ¡ÂºÂ­p Ã¡Â»Â©ng dÃ¡Â»Â¥ng theo vÃ¡Â»â€¹ trÃƒÂ­ cÃƒÂ´ng tÃƒÂ¡c
	* @param appRoleId mÃƒÂ£ vai trÃƒÂ² Ã¡Â»Â©ng dÃ¡Â»Â¥ng
	* @param employeeId mÃƒÂ£ cÃƒÂ¡n bÃ¡Â»â„¢ viÃƒÂªn chÃ¡Â»Â©c
	* @param serviceContext ngÃ¡Â»Â¯ cÃ¡ÂºÂ£nh dÃ¡Â»â€¹ch vÃ¡Â»Â¥
	* @return: Ã„â€˜Ã¡Â»â€˜i tÃ†Â°Ã¡Â»Â£ng vai trÃƒÂ² truy cÃ¡ÂºÂ­p theo cÃƒÂ¡n bÃ¡Â»â„¢ mÃ¡Â»â€ºi Ã„â€˜Ã†Â°Ã¡Â»Â£c cÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t
	*/
	public static org.oep.ssomgt.model.AppRole2Employee updateAppRole2Employee(
		long id, long appRoleId, long employeeId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateAppRole2Employee(id, appRoleId, employeeId,
			serviceContext);
	}

	/**
	* CÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t thÃƒÂ´ng tin mÃ¡Â»â„¢t vai trÃƒÂ² truy cÃ¡ÂºÂ­p Ã¡Â»Â©ng dÃ¡Â»Â¥ng cho cÃƒÂ¡n bÃ¡Â»â„¢
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param appRole2Employee vai trÃƒÂ² truy cÃ¡ÂºÂ­p Ã¡Â»Â©ng dÃ¡Â»Â¥ng cho cÃƒÂ¡n bÃ¡Â»â„¢ cÃ¡ÂºÂ§n cÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t thÃƒÂ´ng tin
	* @param serviceContext ngÃ¡Â»Â¯ cÃ¡ÂºÂ£nh dÃ¡Â»â€¹ch vÃ¡Â»Â¥
	* @return: Ã„â€˜Ã¡Â»â€˜i tÃ†Â°Ã¡Â»Â£ng vai trÃƒÂ² truy cÃ¡ÂºÂ­p Ã¡Â»Â©ng dÃ¡Â»Â¥ng cho cÃƒÂ¡n bÃ¡Â»â„¢ mÃ¡Â»â€ºi Ã„â€˜Ã†Â°Ã¡Â»Â£c cÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t thÃƒÂ´ng tin
	*/
	public static org.oep.ssomgt.model.AppRole2Employee updateAppRole2Employee(
		org.oep.ssomgt.model.AppRole2Employee appRole2Employee,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateAppRole2Employee(appRole2Employee, serviceContext);
	}

	/**
	* XÃƒÂ³a bÃ¡Â»ï¿½ thÃƒÂ´ng tin mÃ¡Â»â„¢t vai trÃƒÂ² truy cÃ¡ÂºÂ­p Ã¡Â»Â©ng dÃ¡Â»Â¥ng cho cÃƒÂ¡n bÃ¡Â»â„¢ Ã„â€˜Ã†Â°Ã¡Â»Â£c tÃƒÂ­ch hÃ¡Â»Â£p trong cÃ¡Â»â€¢ng
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param appRole2Employee vai trÃƒÂ² truy cÃ¡ÂºÂ­p Ã¡Â»Â©ng dÃ¡Â»Â¥ng cho cÃƒÂ¡n bÃ¡Â»â„¢ sÃ¡ÂºÂ½ bÃ¡Â»â€¹ xÃƒÂ³a
	* @return
	*/
	public static void removeAppRole2Employee(
		org.oep.ssomgt.model.AppRole2Employee appRole2Employee)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().removeAppRole2Employee(appRole2Employee);
	}

	/**
	* XÃƒÂ³a bÃ¡Â»ï¿½ thÃƒÂ´ng tin mÃ¡Â»â„¢t vai trÃƒÂ² truy cÃ¡ÂºÂ­p Ã¡Â»Â©ng dÃ¡Â»Â¥ng cho cÃƒÂ¡n bÃ¡Â»â„¢ Ã„â€˜Ã†Â°Ã¡Â»Â£c tÃƒÂ­ch hÃ¡Â»Â£p trong cÃ¡Â»â€¢ng
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param id mÃƒÂ£ phÃƒÂ¢n biÃ¡Â»â€¡t vai trÃƒÂ² truy cÃ¡ÂºÂ­p Ã¡Â»Â©ng dÃ¡Â»Â¥ng cho cÃƒÂ¡n bÃ¡Â»â„¢
	* @return
	*/
	public static void removeAppRole2Employee(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().removeAppRole2Employee(id);
	}

	public static int countByWorkingUnit(long workingUnitId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countByWorkingUnit(workingUnitId, serviceContext);
	}

	public static java.util.List<org.oep.ssomgt.model.AppRole2Employee> findByWorkingUnit(
		long workingUnitId, int startIndex, int endIndex,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByWorkingUnit(workingUnitId, startIndex, endIndex,
			serviceContext);
	}

	public static int countByAppRoleWorkingUnit(long appRoleId,
		long workingUnitId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countByAppRoleWorkingUnit(appRoleId, workingUnitId,
			serviceContext);
	}

	public static java.util.List<org.oep.ssomgt.model.AppRole2Employee> findByAppRoleWorkingUnit(
		long appRoleId, long workingUnitId, int startIndex, int endIndex,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByAppRoleWorkingUnit(appRoleId, workingUnitId,
			startIndex, endIndex, serviceContext);
	}

	public static java.util.List<org.oep.ssomgt.model.AppRole> findRoleByEmployee(
		long employeeId, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findRoleByEmployee(employeeId, companyId);
	}

	public static java.util.List<org.oep.ssomgt.model.AppRole2Employee> findByArrayOfAppRole(
		long[] appRoleIds,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByArrayOfAppRole(appRoleIds, serviceContext);
	}

	public static void clearService() {
		_service = null;
	}

	public static AppRole2EmployeeLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					AppRole2EmployeeLocalService.class.getName());

			if (invokableLocalService instanceof AppRole2EmployeeLocalService) {
				_service = (AppRole2EmployeeLocalService)invokableLocalService;
			}
			else {
				_service = new AppRole2EmployeeLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(AppRole2EmployeeLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(AppRole2EmployeeLocalService service) {
	}

	private static AppRole2EmployeeLocalService _service;
}