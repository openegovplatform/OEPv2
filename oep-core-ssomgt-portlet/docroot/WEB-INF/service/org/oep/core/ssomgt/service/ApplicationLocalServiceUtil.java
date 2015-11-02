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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Application. This utility wraps
 * {@link org.oep.core.ssomgt.service.impl.ApplicationLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author trungdk
 * @see ApplicationLocalService
 * @see org.oep.core.ssomgt.service.base.ApplicationLocalServiceBaseImpl
 * @see org.oep.core.ssomgt.service.impl.ApplicationLocalServiceImpl
 * @generated
 */
public class ApplicationLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.oep.core.ssomgt.service.impl.ApplicationLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the application to the database. Also notifies the appropriate model listeners.
	*
	* @param application the application
	* @return the application that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.ssomgt.model.Application addApplication(
		org.oep.core.ssomgt.model.Application application)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addApplication(application);
	}

	/**
	* Creates a new application with the primary key. Does not add the application to the database.
	*
	* @param applicationId the primary key for the new application
	* @return the new application
	*/
	public static org.oep.core.ssomgt.model.Application createApplication(
		long applicationId) {
		return getService().createApplication(applicationId);
	}

	/**
	* Deletes the application with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param applicationId the primary key of the application
	* @return the application that was removed
	* @throws PortalException if a application with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.ssomgt.model.Application deleteApplication(
		long applicationId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteApplication(applicationId);
	}

	/**
	* Deletes the application from the database. Also notifies the appropriate model listeners.
	*
	* @param application the application
	* @return the application that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.ssomgt.model.Application deleteApplication(
		org.oep.core.ssomgt.model.Application application)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteApplication(application);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.ssomgt.model.impl.ApplicationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.ssomgt.model.impl.ApplicationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static org.oep.core.ssomgt.model.Application fetchApplication(
		long applicationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchApplication(applicationId);
	}

	/**
	* Returns the application with the primary key.
	*
	* @param applicationId the primary key of the application
	* @return the application
	* @throws PortalException if a application with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.ssomgt.model.Application getApplication(
		long applicationId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getApplication(applicationId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the applications.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.ssomgt.model.impl.ApplicationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of applications
	* @param end the upper bound of the range of applications (not inclusive)
	* @return the range of applications
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.ssomgt.model.Application> getApplications(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getApplications(start, end);
	}

	/**
	* Returns the number of applications.
	*
	* @return the number of applications
	* @throws SystemException if a system exception occurred
	*/
	public static int getApplicationsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getApplicationsCount();
	}

	/**
	* Updates the application in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param application the application
	* @return the application that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.ssomgt.model.Application updateApplication(
		org.oep.core.ssomgt.model.Application application)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateApplication(application);
	}

	public static org.oep.core.ssomgt.model.ApplicationAppBigIconBlobModel getAppBigIconBlobModel(
		java.io.Serializable primaryKey)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAppBigIconBlobModel(primaryKey);
	}

	public static org.oep.core.ssomgt.model.ApplicationAppSmallIconBlobModel getAppSmallIconBlobModel(
		java.io.Serializable primaryKey)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAppSmallIconBlobModel(primaryKey);
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
	* ThÃƒÂªm mÃ¡Â»â€ºi mÃ¡Â»â„¢t Ã¡Â»Â©ng dÃ¡Â»Â¥ng tÃƒÂ­ch hÃ¡Â»Â£p trong cÃ¡Â»â€¢ng
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param appCode mÃƒÂ£ duy nhÃ¡ÂºÂ¥t cÃ¡Â»Â§a Ã¡Â»Â©ng dÃ¡Â»Â¥ng
	* @param appName tÃƒÂªn Ã¡Â»Â©ng dÃ¡Â»Â¥ng
	* @param appPin mÃƒÂ£ pin bÃ¡ÂºÂ£o mÃ¡ÂºÂ­t Ã¡Â»Â©ng dÃ¡Â»Â¥ng
	* @param appUrl Ã„â€˜Ã¡Â»â€¹a chÃ¡Â»â€° url gÃ¡Â»â€˜c Ã„â€˜Ã¡Â»Æ’ truy xuÃ¡ÂºÂ¥t vÃƒÂ o Ã¡Â»Â©ng dÃ¡Â»Â¥ng
	* @param appBigIcon lÃ†Â°u Ã¡ÂºÂ£nh icon Ã¡Â»Â©ng dÃ¡Â»Â¥ng
	* @param appSmallIcon lÃ†Â°u Ã¡ÂºÂ£nh icon Ã¡Â»Â©ng dÃ¡Â»Â¥ng
	* @param pingTime thÃ¡Â»ï¿½i Ã„â€˜iÃ¡Â»Æ’m ping cuÃ¡Â»â€˜i cÃƒÂ¹ng cÃ¡Â»Â§a Ã¡Â»Â©ng dÃ¡Â»Â¥ng vÃ¡Â»â€ºi hÃ¡Â»â€¡ thÃ¡Â»â€˜ng
	* @param sequenceNo thÃ¡Â»Â© tÃ¡Â»Â± quan trÃ¡Â»ï¿½ng cÃ¡Â»Â§a Ã¡Â»Â©ng dÃ¡Â»Â¥ng trong hÃ¡Â»â€¡ thÃ¡Â»â€˜ng
	* @param serviceContext ngÃ¡Â»Â¯ cÃ¡ÂºÂ£nh dÃ¡Â»â€¹ch vÃ¡Â»Â¥
	* @return: Ã„â€˜Ã¡Â»â€˜i tÃ†Â°Ã¡Â»Â£ng thÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh mÃ¡Â»â€ºi Ã„â€˜Ã†Â°Ã¡Â»Â£c thÃƒÂªm vÃƒÂ o
	*/
	public static org.oep.core.ssomgt.model.Application addApplication(
		java.lang.String appCode, java.lang.String appName,
		java.lang.String appPin, java.lang.String appUrl,
		java.sql.Blob appBigIcon, java.sql.Blob appSmallIcon,
		java.util.Date pingTime, int sequenceNo,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addApplication(appCode, appName, appPin, appUrl,
			appBigIcon, appSmallIcon, pingTime, sequenceNo, serviceContext);
	}

	/**
	* ThÃƒÂªm mÃ¡Â»â€ºi mÃ¡Â»â„¢t Ã¡Â»Â©ng dÃ¡Â»Â¥ng tÃƒÂ­ch hÃ¡Â»Â£p trong cÃ¡Â»â€¢ng
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param appCode mÃƒÂ£ duy nhÃ¡ÂºÂ¥t cÃ¡Â»Â§a Ã¡Â»Â©ng dÃ¡Â»Â¥ng
	* @param appName tÃƒÂªn Ã¡Â»Â©ng dÃ¡Â»Â¥ng
	* @param appPin mÃƒÂ£ pin bÃ¡ÂºÂ£o mÃ¡ÂºÂ­t Ã¡Â»Â©ng dÃ¡Â»Â¥ng
	* @param appUrl Ã„â€˜Ã¡Â»â€¹a chÃ¡Â»â€° url gÃ¡Â»â€˜c Ã„â€˜Ã¡Â»Æ’ truy xuÃ¡ÂºÂ¥t vÃƒÂ o Ã¡Â»Â©ng dÃ¡Â»Â¥ng
	* @param appBigIcon lÃ†Â°u Ã¡ÂºÂ£nh icon Ã¡Â»Â©ng dÃ¡Â»Â¥ng
	* @param appSmallIcon lÃ†Â°u Ã¡ÂºÂ£nh icon Ã¡Â»Â©ng dÃ¡Â»Â¥ng
	* @param pingTime thÃ¡Â»ï¿½i Ã„â€˜iÃ¡Â»Æ’m ping cuÃ¡Â»â€˜i cÃƒÂ¹ng cÃ¡Â»Â§a Ã¡Â»Â©ng dÃ¡Â»Â¥ng vÃ¡Â»â€ºi hÃ¡Â»â€¡ thÃ¡Â»â€˜ng
	* @param sequenceNo thÃ¡Â»Â© tÃ¡Â»Â± quan trÃ¡Â»ï¿½ng cÃ¡Â»Â§a Ã¡Â»Â©ng dÃ¡Â»Â¥ng trong hÃ¡Â»â€¡ thÃ¡Â»â€˜ng
	* @param serviceContext ngÃ¡Â»Â¯ cÃ¡ÂºÂ£nh dÃ¡Â»â€¹ch vÃ¡Â»Â¥
	* @return: Ã„â€˜Ã¡Â»â€˜i tÃ†Â°Ã¡Â»Â£ng thÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh mÃ¡Â»â€ºi Ã„â€˜Ã†Â°Ã¡Â»Â£c thÃƒÂªm vÃƒÂ o
	*/
	public static org.oep.core.ssomgt.model.Application addApplication(
		java.lang.String appCode, java.lang.String appName,
		java.lang.String appPin, java.lang.String appUrl,
		java.sql.Blob appBigIcon, java.sql.Blob appSmallIcon,
		java.util.Date pingTime,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addApplication(appCode, appName, appPin, appUrl,
			appBigIcon, appSmallIcon, pingTime, serviceContext);
	}

	/**
	* CÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t thÃƒÂ´ng tin mÃ¡Â»â„¢t Ã¡Â»Â©ng dÃ¡Â»Â¥ng tÃƒÂ­ch hÃ¡Â»Â£p vÃƒÂ o cÃ¡Â»â€¢ng
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param id mÃƒÂ£ phÃƒÂ¢n biÃ¡Â»â€¡t cÃ¡Â»Â§a Ã¡Â»Â©ng dÃ¡Â»Â¥ng trong cÃ¡Â»â€¢ng
	* @param appCode mÃƒÂ£ duy nhÃ¡ÂºÂ¥t cÃ¡Â»Â§a Ã¡Â»Â©ng dÃ¡Â»Â¥ng
	* @param appName tÃƒÂªn Ã¡Â»Â©ng dÃ¡Â»Â¥ng
	* @param appPin mÃƒÂ£ pin bÃ¡ÂºÂ£o mÃ¡ÂºÂ­t Ã¡Â»Â©ng dÃ¡Â»Â¥ng
	* @param appUrl Ã„â€˜Ã¡Â»â€¹a chÃ¡Â»â€° url gÃ¡Â»â€˜c Ã„â€˜Ã¡Â»Æ’ truy xuÃ¡ÂºÂ¥t vÃƒÂ o Ã¡Â»Â©ng dÃ¡Â»Â¥ng
	* @param appBigIcon lÃ†Â°u Ã¡ÂºÂ£nh icon Ã¡Â»Â©ng dÃ¡Â»Â¥ng
	* @param appSmallIcon lÃ†Â°u Ã¡ÂºÂ£nh icon Ã¡Â»Â©ng dÃ¡Â»Â¥ng
	* @param pingTime thÃ¡Â»ï¿½i Ã„â€˜iÃ¡Â»Æ’m ping cuÃ¡Â»â€˜i cÃƒÂ¹ng cÃ¡Â»Â§a Ã¡Â»Â©ng dÃ¡Â»Â¥ng vÃ¡Â»â€ºi hÃ¡Â»â€¡ thÃ¡Â»â€˜ng
	* @param sequenceNo thÃ¡Â»Â© tÃ¡Â»Â± quan trÃ¡Â»ï¿½ng cÃ¡Â»Â§a Ã¡Â»Â©ng dÃ¡Â»Â¥ng trong hÃ¡Â»â€¡ thÃ¡Â»â€˜ng
	* @param serviceContext ngÃ¡Â»Â¯ cÃ¡ÂºÂ£nh dÃ¡Â»â€¹ch vÃ¡Â»Â¥
	* @return: Ã„â€˜Ã¡Â»â€˜i tÃ†Â°Ã¡Â»Â£ng thÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh mÃ¡Â»â€ºi Ã„â€˜Ã†Â°Ã¡Â»Â£c cÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t
	*/
	public static org.oep.core.ssomgt.model.Application updateApplication(
		long id, java.lang.String appCode, java.lang.String appName,
		java.lang.String appPin, java.lang.String appUrl,
		java.sql.Blob appBigIcon, java.sql.Blob appSmallIcon,
		java.util.Date pingTime, int sequenceNo,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateApplication(id, appCode, appName, appPin, appUrl,
			appBigIcon, appSmallIcon, pingTime, sequenceNo, serviceContext);
	}

	/**
	* CÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t thÃƒÂ´ng tin mÃ¡Â»â„¢t Ã¡Â»Â©ng dÃ¡Â»Â¥ng tÃƒÂ­ch hÃ¡Â»Â£p vÃƒÂ o cÃ¡Â»â€¢ng
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param id mÃƒÂ£ phÃƒÂ¢n biÃ¡Â»â€¡t cÃ¡Â»Â§a Ã¡Â»Â©ng dÃ¡Â»Â¥ng trong cÃ¡Â»â€¢ng
	* @param appCode mÃƒÂ£ duy nhÃ¡ÂºÂ¥t cÃ¡Â»Â§a Ã¡Â»Â©ng dÃ¡Â»Â¥ng
	* @param appName tÃƒÂªn Ã¡Â»Â©ng dÃ¡Â»Â¥ng
	* @param appPin mÃƒÂ£ pin bÃ¡ÂºÂ£o mÃ¡ÂºÂ­t Ã¡Â»Â©ng dÃ¡Â»Â¥ng
	* @param appUrl Ã„â€˜Ã¡Â»â€¹a chÃ¡Â»â€° url gÃ¡Â»â€˜c Ã„â€˜Ã¡Â»Æ’ truy xuÃ¡ÂºÂ¥t vÃƒÂ o Ã¡Â»Â©ng dÃ¡Â»Â¥ng
	* @param appBigIcon lÃ†Â°u Ã¡ÂºÂ£nh icon Ã¡Â»Â©ng dÃ¡Â»Â¥ng
	* @param appSmallIcon lÃ†Â°u Ã¡ÂºÂ£nh icon Ã¡Â»Â©ng dÃ¡Â»Â¥ng
	* @param pingTime thÃ¡Â»ï¿½i Ã„â€˜iÃ¡Â»Æ’m ping cuÃ¡Â»â€˜i cÃƒÂ¹ng cÃ¡Â»Â§a Ã¡Â»Â©ng dÃ¡Â»Â¥ng vÃ¡Â»â€ºi hÃ¡Â»â€¡ thÃ¡Â»â€˜ng
	* @param sequenceNo thÃ¡Â»Â© tÃ¡Â»Â± quan trÃ¡Â»ï¿½ng cÃ¡Â»Â§a Ã¡Â»Â©ng dÃ¡Â»Â¥ng trong hÃ¡Â»â€¡ thÃ¡Â»â€˜ng
	* @param serviceContext ngÃ¡Â»Â¯ cÃ¡ÂºÂ£nh dÃ¡Â»â€¹ch vÃ¡Â»Â¥
	* @return: Ã„â€˜Ã¡Â»â€˜i tÃ†Â°Ã¡Â»Â£ng thÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh mÃ¡Â»â€ºi Ã„â€˜Ã†Â°Ã¡Â»Â£c cÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t
	*/
	public static org.oep.core.ssomgt.model.Application updateApplication(
		long id, java.lang.String appCode, java.lang.String appName,
		java.lang.String appPin, java.lang.String appUrl,
		java.sql.Blob appBigIcon, java.sql.Blob appSmallIcon,
		java.util.Date pingTime,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateApplication(id, appCode, appName, appPin, appUrl,
			appBigIcon, appSmallIcon, pingTime, serviceContext);
	}

	/**
	* CÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t thÃƒÂ´ng tin mÃ¡Â»â„¢t Ã¡Â»Â©ng dÃ¡Â»Â¥ng Ã„â€˜Ã†Â°Ã¡Â»Â£c tÃƒÂ­ch hÃ¡Â»Â£p trong cÃ¡Â»â€¢ng
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param application thÃƒÂ´ng tin Ã¡Â»Â©ng dÃ¡Â»Â¥ng cÃ¡ÂºÂ§n cÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t thÃƒÂ´ng tin
	* @param serviceContext ngÃ¡Â»Â¯ cÃ¡ÂºÂ£nh dÃ¡Â»â€¹ch vÃ¡Â»Â¥
	* @return: Ã„â€˜Ã¡Â»â€˜i tÃ†Â°Ã¡Â»Â£ng thÃƒÂ´ng tin Ã¡Â»Â©ng dÃ¡Â»Â¥ng mÃ¡Â»â€ºi Ã„â€˜Ã†Â°Ã¡Â»Â£c cÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t thÃƒÂ´ng tin
	*/
	public static org.oep.core.ssomgt.model.Application updateApplication(
		org.oep.core.ssomgt.model.Application application,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().updateApplication(application, serviceContext);
	}

	public static org.oep.core.ssomgt.model.Application getUpApplication(
		org.oep.core.ssomgt.model.Application application,
		com.liferay.portal.service.ServiceContext serviceContext) {
		return getService().getUpApplication(application, serviceContext);
	}

	public static org.oep.core.ssomgt.model.Application getDownApplication(
		org.oep.core.ssomgt.model.Application application,
		com.liferay.portal.service.ServiceContext serviceContext) {
		return getService().getDownApplication(application, serviceContext);
	}

	public static org.oep.core.ssomgt.model.Application up(
		org.oep.core.ssomgt.model.Application application,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().up(application, serviceContext);
	}

	public static org.oep.core.ssomgt.model.Application down(
		org.oep.core.ssomgt.model.Application application,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().down(application, serviceContext);
	}

	public static org.oep.core.ssomgt.model.Application ping(
		java.lang.String appCode, java.lang.String appPin)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().ping(appCode, appPin);
	}

	/**
	* XÃƒÂ³a bÃ¡Â»ï¿½ thÃƒÂ´ng tin mÃ¡Â»â„¢t Ã¡Â»Â©ng dÃ¡Â»Â¥ng Ã„â€˜Ã†Â°Ã¡Â»Â£c tÃƒÂ­ch hÃ¡Â»Â£p trong cÃ¡Â»â€¢ng
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param application Ã¡Â»Â©ng dÃ¡Â»Â¥ng tÃƒÂ­ch hÃ¡Â»Â£p sÃ¡ÂºÂ½ bÃ¡Â»â€¹ xÃƒÂ³a
	* @return
	*/
	public static void removeApplication(
		org.oep.core.ssomgt.model.Application application)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().removeApplication(application);
	}

	/**
	* XÃƒÂ³a bÃ¡Â»ï¿½ thÃƒÂ´ng tin mÃ¡Â»â„¢t Ã¡Â»Â©ng dÃ¡Â»Â¥ng Ã„â€˜Ã†Â°Ã¡Â»Â£c tÃƒÂ­ch hÃ¡Â»Â£p trong cÃ¡Â»â€¢ng
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param id mÃƒÂ£ phÃƒÂ¢n biÃ¡Â»â€¡t Ã¡Â»Â©ng dÃ¡Â»Â¥ng Ã„â€˜Ã†Â°Ã¡Â»Â£c tÃƒÂ­ch hÃ¡Â»Â£p
	* @return
	*/
	public static void removeApplication(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().removeApplication(id);
	}

	public static int countByCompany(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countByCompany(companyId);
	}

	public static java.util.List<org.oep.core.ssomgt.model.Application> findByCompany(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByCompany(companyId);
	}

	public static java.util.List<org.oep.core.ssomgt.model.Application> findByCompany(
		long companyId, int startIndex, int endIndex)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByCompany(companyId, startIndex, endIndex);
	}

	public static int countByCompany(
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countByCompany(serviceContext);
	}

	public static java.util.List<org.oep.core.ssomgt.model.Application> findByCompany(
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByCompany(serviceContext);
	}

	public static java.util.List<org.oep.core.ssomgt.model.Application> findByCompany(
		int startIndex, int endIndex,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByCompany(startIndex, endIndex, serviceContext);
	}

	public static int countByCompanyGroup(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countByCompanyGroup(companyId, groupId);
	}

	public static java.util.List<org.oep.core.ssomgt.model.Application> findByCompanyGroup(
		long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByCompanyGroup(companyId, groupId);
	}

	public static java.util.List<org.oep.core.ssomgt.model.Application> findByCompanyGroup(
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

	public static java.util.List<org.oep.core.ssomgt.model.Application> findByCompanyGroup(
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByCompanyGroup(serviceContext);
	}

	public static java.util.List<org.oep.core.ssomgt.model.Application> findByCompanyGroup(
		int startIndex, int endIndex,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByCompanyGroup(startIndex, endIndex, serviceContext);
	}

	public static org.oep.core.ssomgt.model.Application getByAppCode(
		java.lang.String appCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.core.ssomgt.NoSuchApplicationException {
		return getService().getByAppCode(appCode);
	}

	public static int getMaxSequenceNo(
		com.liferay.portal.service.ServiceContext serviceContext) {
		return getService().getMaxSequenceNo(serviceContext);
	}

	public static void clearService() {
		_service = null;
	}

	public static ApplicationLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					ApplicationLocalService.class.getName());

			if (invokableLocalService instanceof ApplicationLocalService) {
				_service = (ApplicationLocalService)invokableLocalService;
			}
			else {
				_service = new ApplicationLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(ApplicationLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(ApplicationLocalService service) {
	}

	private static ApplicationLocalService _service;
}