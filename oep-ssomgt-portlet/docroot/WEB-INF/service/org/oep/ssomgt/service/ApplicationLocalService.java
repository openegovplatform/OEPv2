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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.BaseLocalService;
import com.liferay.portal.service.InvokableLocalService;
import com.liferay.portal.service.PersistedModelLocalService;

/**
 * Provides the local service interface for Application. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author trungdk
 * @see ApplicationLocalServiceUtil
 * @see org.oep.ssomgt.service.base.ApplicationLocalServiceBaseImpl
 * @see org.oep.ssomgt.service.impl.ApplicationLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface ApplicationLocalService extends BaseLocalService,
	InvokableLocalService, PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ApplicationLocalServiceUtil} to access the application local service. Add custom service methods to {@link org.oep.ssomgt.service.impl.ApplicationLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the application to the database. Also notifies the appropriate model listeners.
	*
	* @param application the application
	* @return the application that was added
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public org.oep.ssomgt.model.Application addApplication(
		org.oep.ssomgt.model.Application application)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new application with the primary key. Does not add the application to the database.
	*
	* @param applicationId the primary key for the new application
	* @return the new application
	*/
	public org.oep.ssomgt.model.Application createApplication(
		long applicationId);

	/**
	* Deletes the application with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param applicationId the primary key of the application
	* @return the application that was removed
	* @throws PortalException if a application with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.DELETE)
	public org.oep.ssomgt.model.Application deleteApplication(
		long applicationId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the application from the database. Also notifies the appropriate model listeners.
	*
	* @param application the application
	* @return the application that was removed
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.DELETE)
	public org.oep.ssomgt.model.Application deleteApplication(
		org.oep.ssomgt.model.Application application)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.ApplicationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.ApplicationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public org.oep.ssomgt.model.Application fetchApplication(long applicationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the application with the primary key.
	*
	* @param applicationId the primary key of the application
	* @return the application
	* @throws PortalException if a application with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public org.oep.ssomgt.model.Application getApplication(long applicationId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the applications.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.ApplicationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of applications
	* @param end the upper bound of the range of applications (not inclusive)
	* @return the range of applications
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<org.oep.ssomgt.model.Application> getApplications(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of applications.
	*
	* @return the number of applications
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getApplicationsCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the application in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param application the application
	* @return the application that was updated
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public org.oep.ssomgt.model.Application updateApplication(
		org.oep.ssomgt.model.Application application)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public org.oep.ssomgt.model.ApplicationAppBigIconBlobModel getAppBigIconBlobModel(
		java.io.Serializable primaryKey)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public org.oep.ssomgt.model.ApplicationAppSmallIconBlobModel getAppSmallIconBlobModel(
		java.io.Serializable primaryKey)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier();

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier);

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable;

	/**
	* ThÃªm má»›i má»™t á»©ng dá»¥ng tÃ­ch há»£p trong cá»•ng
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    Táº¡o má»›i
	*
	* @param appCode mÃ£ duy nháº¥t cá»§a á»©ng dá»¥ng
	* @param appName tÃªn á»©ng dá»¥ng
	* @param appPin mÃ£ pin báº£o máº­t á»©ng dá»¥ng
	* @param appUrl Ä‘á»‹a chá»‰ url gá»‘c Ä‘á»ƒ truy xuáº¥t vÃ o á»©ng dá»¥ng
	* @param appBigIcon lÆ°u áº£nh icon á»©ng dá»¥ng
	* @param appSmallIcon lÆ°u áº£nh icon á»©ng dá»¥ng
	* @param pingTime thá»�i Ä‘iá»ƒm ping cuá»‘i cÃ¹ng cá»§a á»©ng dá»¥ng vá»›i há»‡ thá»‘ng
	* @param sequenceNo thá»© tá»± quan trá»�ng cá»§a á»©ng dá»¥ng trong há»‡ thá»‘ng
	* @param serviceContext ngá»¯ cáº£nh dá»‹ch vá»¥
	* @return: Ä‘á»‘i tÆ°á»£ng thá»§ tá»¥c hÃ nh chÃ­nh má»›i Ä‘Æ°á»£c thÃªm vÃ o
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public org.oep.ssomgt.model.Application addApplication(
		java.lang.String appCode, java.lang.String appName,
		java.lang.String appPin, java.lang.String appUrl,
		java.sql.Blob appBigIcon, java.sql.Blob appSmallIcon,
		java.util.Date pingTime, int sequenceNo, java.lang.String publicKey,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* ThÃªm má»›i má»™t á»©ng dá»¥ng tÃ­ch há»£p trong cá»•ng
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    Táº¡o má»›i
	*
	* @param appCode mÃ£ duy nháº¥t cá»§a á»©ng dá»¥ng
	* @param appName tÃªn á»©ng dá»¥ng
	* @param appPin mÃ£ pin báº£o máº­t á»©ng dá»¥ng
	* @param appUrl Ä‘á»‹a chá»‰ url gá»‘c Ä‘á»ƒ truy xuáº¥t vÃ o á»©ng dá»¥ng
	* @param appBigIcon lÆ°u áº£nh icon á»©ng dá»¥ng
	* @param appSmallIcon lÆ°u áº£nh icon á»©ng dá»¥ng
	* @param pingTime thá»�i Ä‘iá»ƒm ping cuá»‘i cÃ¹ng cá»§a á»©ng dá»¥ng vá»›i há»‡ thá»‘ng
	* @param sequenceNo thá»© tá»± quan trá»�ng cá»§a á»©ng dá»¥ng trong há»‡ thá»‘ng
	* @param serviceContext ngá»¯ cáº£nh dá»‹ch vá»¥
	* @return: Ä‘á»‘i tÆ°á»£ng thá»§ tá»¥c hÃ nh chÃ­nh má»›i Ä‘Æ°á»£c thÃªm vÃ o
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public org.oep.ssomgt.model.Application addApplication(
		java.lang.String appCode, java.lang.String appName,
		java.lang.String appPin, java.lang.String appUrl,
		java.util.Date pingTime, java.lang.String publicKey,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* ThÃªm má»›i má»™t á»©ng dá»¥ng tÃ­ch há»£p trong cá»•ng
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    Táº¡o má»›i
	*
	* @param appCode mÃ£ duy nháº¥t cá»§a á»©ng dá»¥ng
	* @param appName tÃªn á»©ng dá»¥ng
	* @param appPin mÃ£ pin báº£o máº­t á»©ng dá»¥ng
	* @param appUrl Ä‘á»‹a chá»‰ url gá»‘c Ä‘á»ƒ truy xuáº¥t vÃ o á»©ng dá»¥ng
	* @param appBigIcon lÆ°u áº£nh icon á»©ng dá»¥ng
	* @param appSmallIcon lÆ°u áº£nh icon á»©ng dá»¥ng
	* @param pingTime thá»�i Ä‘iá»ƒm ping cuá»‘i cÃ¹ng cá»§a á»©ng dá»¥ng vá»›i há»‡ thá»‘ng
	* @param sequenceNo thá»© tá»± quan trá»�ng cá»§a á»©ng dá»¥ng trong há»‡ thá»‘ng
	* @param serviceContext ngá»¯ cáº£nh dá»‹ch vá»¥
	* @return: Ä‘á»‘i tÆ°á»£ng thá»§ tá»¥c hÃ nh chÃ­nh má»›i Ä‘Æ°á»£c thÃªm vÃ o
	*/
	public org.oep.ssomgt.model.Application addApplication(
		java.lang.String appCode, java.lang.String appName,
		java.lang.String appPin, java.lang.String appUrl,
		java.sql.Blob appBigIcon, java.sql.Blob appSmallIcon,
		java.util.Date pingTime, java.lang.String publicKey,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Cáº­p nháº­t thÃ´ng tin má»™t á»©ng dá»¥ng tÃ­ch há»£p vÃ o cá»•ng
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    Táº¡o má»›i
	*
	* @param id mÃ£ phÃ¢n biá»‡t cá»§a á»©ng dá»¥ng trong cá»•ng
	* @param appCode mÃ£ duy nháº¥t cá»§a á»©ng dá»¥ng
	* @param appName tÃªn á»©ng dá»¥ng
	* @param appPin mÃ£ pin báº£o máº­t á»©ng dá»¥ng
	* @param appUrl Ä‘á»‹a chá»‰ url gá»‘c Ä‘á»ƒ truy xuáº¥t vÃ o á»©ng dá»¥ng
	* @param appBigIcon lÆ°u áº£nh icon á»©ng dá»¥ng
	* @param appSmallIcon lÆ°u áº£nh icon á»©ng dá»¥ng
	* @param pingTime thá»�i Ä‘iá»ƒm ping cuá»‘i cÃ¹ng cá»§a á»©ng dá»¥ng vá»›i há»‡ thá»‘ng
	* @param sequenceNo thá»© tá»± quan trá»�ng cá»§a á»©ng dá»¥ng trong há»‡ thá»‘ng
	* @param serviceContext ngá»¯ cáº£nh dá»‹ch vá»¥
	* @return: Ä‘á»‘i tÆ°á»£ng thá»§ tá»¥c hÃ nh chÃ­nh má»›i Ä‘Æ°á»£c cáº­p nháº­t
	*/
	public org.oep.ssomgt.model.Application updateApplication(long id,
		java.lang.String appCode, java.lang.String appName,
		java.lang.String appPin, java.lang.String appUrl,
		java.sql.Blob appBigIcon, java.sql.Blob appSmallIcon,
		java.util.Date pingTime, int sequenceNo, java.lang.String publicKey,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Cáº­p nháº­t thÃ´ng tin má»™t á»©ng dá»¥ng tÃ­ch há»£p vÃ o cá»•ng
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    Táº¡o má»›i
	*
	* @param id mÃ£ phÃ¢n biá»‡t cá»§a á»©ng dá»¥ng trong cá»•ng
	* @param appCode mÃ£ duy nháº¥t cá»§a á»©ng dá»¥ng
	* @param appName tÃªn á»©ng dá»¥ng
	* @param appPin mÃ£ pin báº£o máº­t á»©ng dá»¥ng
	* @param appUrl Ä‘á»‹a chá»‰ url gá»‘c Ä‘á»ƒ truy xuáº¥t vÃ o á»©ng dá»¥ng
	* @param appBigIcon lÆ°u áº£nh icon á»©ng dá»¥ng
	* @param appSmallIcon lÆ°u áº£nh icon á»©ng dá»¥ng
	* @param pingTime thá»�i Ä‘iá»ƒm ping cuá»‘i cÃ¹ng cá»§a á»©ng dá»¥ng vá»›i há»‡ thá»‘ng
	* @param sequenceNo thá»© tá»± quan trá»�ng cá»§a á»©ng dá»¥ng trong há»‡ thá»‘ng
	* @param serviceContext ngá»¯ cáº£nh dá»‹ch vá»¥
	* @return: Ä‘á»‘i tÆ°á»£ng thá»§ tá»¥c hÃ nh chÃ­nh má»›i Ä‘Æ°á»£c cáº­p nháº­t
	*/
	public org.oep.ssomgt.model.Application updateApplication(long id,
		java.lang.String appCode, java.lang.String appName,
		java.lang.String appPin, java.lang.String appUrl,
		java.sql.Blob appBigIcon, java.sql.Blob appSmallIcon,
		java.util.Date pingTime, java.lang.String publicKey,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Cáº­p nháº­t thÃ´ng tin má»™t á»©ng dá»¥ng Ä‘Æ°á»£c tÃ­ch há»£p trong cá»•ng
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    Táº¡o má»›i
	*
	* @param application thÃ´ng tin á»©ng dá»¥ng cáº§n cáº­p nháº­t thÃ´ng tin
	* @param serviceContext ngá»¯ cáº£nh dá»‹ch vá»¥
	* @return: Ä‘á»‘i tÆ°á»£ng thÃ´ng tin á»©ng dá»¥ng má»›i Ä‘Æ°á»£c cáº­p nháº­t thÃ´ng tin
	*/
	public org.oep.ssomgt.model.Application updateApplication(
		org.oep.ssomgt.model.Application application,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public org.oep.ssomgt.model.Application getUpApplication(
		org.oep.ssomgt.model.Application application,
		com.liferay.portal.service.ServiceContext serviceContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public org.oep.ssomgt.model.Application getDownApplication(
		org.oep.ssomgt.model.Application application,
		com.liferay.portal.service.ServiceContext serviceContext);

	public org.oep.ssomgt.model.Application up(
		org.oep.ssomgt.model.Application application,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public org.oep.ssomgt.model.Application down(
		org.oep.ssomgt.model.Application application,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public org.oep.ssomgt.model.Application ping(java.lang.String appCode,
		java.lang.String appPin)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* XÃ³a bá»� thÃ´ng tin má»™t á»©ng dá»¥ng Ä‘Æ°á»£c tÃ­ch há»£p trong cá»•ng
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    Táº¡o má»›i
	*
	* @param application á»©ng dá»¥ng tÃ­ch há»£p sáº½ bá»‹ xÃ³a
	* @return
	*/
	public void removeApplication(org.oep.ssomgt.model.Application application)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* XÃ³a bá»� thÃ´ng tin má»™t á»©ng dá»¥ng Ä‘Æ°á»£c tÃ­ch há»£p trong cá»•ng
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    Táº¡o má»›i
	*
	* @param id mÃ£ phÃ¢n biá»‡t á»©ng dá»¥ng Ä‘Æ°á»£c tÃ­ch há»£p
	* @return
	*/
	public void removeApplication(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public int countByCompany(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<org.oep.ssomgt.model.Application> findByCompany(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<org.oep.ssomgt.model.Application> findByCompany(
		long companyId, int startIndex, int endIndex)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countByCompany(
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<org.oep.ssomgt.model.Application> findByCompany(
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<org.oep.ssomgt.model.Application> findByCompany(
		int startIndex, int endIndex,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countByCompanyGroup(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<org.oep.ssomgt.model.Application> findByCompanyGroup(
		long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<org.oep.ssomgt.model.Application> findByCompanyGroup(
		long companyId, long groupId, int startIndex, int endIndex)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countByCompanyGroup(
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<org.oep.ssomgt.model.Application> findByCompanyGroup(
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<org.oep.ssomgt.model.Application> findByCompanyGroup(
		int startIndex, int endIndex,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public org.oep.ssomgt.model.Application getByAppCode(
		java.lang.String appCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchApplicationException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getMaxSequenceNo(
		com.liferay.portal.service.ServiceContext serviceContext);

	public void validate(long applicationId, java.lang.String appCode,
		java.lang.String appName, java.lang.String appPin,
		java.lang.String appUrl, java.lang.String publicKey)
		throws org.oep.ssomgt.AppCodeRangeLengthException,
			org.oep.ssomgt.AppNameRangeLengthException,
			org.oep.ssomgt.AppPinRangeLengthException,
			org.oep.ssomgt.AppUrlRangeLengthException,
			org.oep.ssomgt.DuplicateAppCodeException,
			org.oep.ssomgt.PublicKeyRangeLengthException;
}