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
 * Provides the local service interface for AppMessage. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author trungdk
 * @see AppMessageLocalServiceUtil
 * @see org.oep.ssomgt.service.base.AppMessageLocalServiceBaseImpl
 * @see org.oep.ssomgt.service.impl.AppMessageLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface AppMessageLocalService extends BaseLocalService,
	InvokableLocalService, PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AppMessageLocalServiceUtil} to access the app message local service. Add custom service methods to {@link org.oep.ssomgt.service.impl.AppMessageLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the app message to the database. Also notifies the appropriate model listeners.
	*
	* @param appMessage the app message
	* @return the app message that was added
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public org.oep.ssomgt.model.AppMessage addAppMessage(
		org.oep.ssomgt.model.AppMessage appMessage)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new app message with the primary key. Does not add the app message to the database.
	*
	* @param appMessageId the primary key for the new app message
	* @return the new app message
	*/
	public org.oep.ssomgt.model.AppMessage createAppMessage(long appMessageId);

	/**
	* Deletes the app message with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param appMessageId the primary key of the app message
	* @return the app message that was removed
	* @throws PortalException if a app message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.DELETE)
	public org.oep.ssomgt.model.AppMessage deleteAppMessage(long appMessageId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the app message from the database. Also notifies the appropriate model listeners.
	*
	* @param appMessage the app message
	* @return the app message that was removed
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.DELETE)
	public org.oep.ssomgt.model.AppMessage deleteAppMessage(
		org.oep.ssomgt.model.AppMessage appMessage)
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public org.oep.ssomgt.model.AppMessage fetchAppMessage(long appMessageId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the app message with the primary key.
	*
	* @param appMessageId the primary key of the app message
	* @return the app message
	* @throws PortalException if a app message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public org.oep.ssomgt.model.AppMessage getAppMessage(long appMessageId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the app messages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.AppMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of app messages
	* @param end the upper bound of the range of app messages (not inclusive)
	* @return the range of app messages
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<org.oep.ssomgt.model.AppMessage> getAppMessages(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of app messages.
	*
	* @return the number of app messages
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getAppMessagesCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the app message in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param appMessage the app message
	* @return the app message that was updated
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public org.oep.ssomgt.model.AppMessage updateAppMessage(
		org.oep.ssomgt.model.AppMessage appMessage)
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
	* ThÃªm má»›i má»™t thÃ´ng Ä‘iá»‡p gá»­i tá»›i ngÆ°á»�i dÃ¹ng
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    Táº¡o má»›i
	*
	* @param fromApplication mÃ£ cá»§a á»©ng dá»¥ng
	* @param toUser ngÆ°á»�i dÃ¹ng nháº­n thÃ´ng bÃ¡o
	* @param messageType kiá»ƒu thÃ´ng Ä‘iá»‡p
	* @param messageCode mÃ£ thÃ´ng bÃ¡o
	* @param messageText thÃ´ng Ä‘iá»‡p
	* @param messageValue giÃ¡ trá»‹ thÃ´ng Ä‘iá»‡p
	* @param messageUrl Ä‘á»‹a chá»‰ URL gá»­i thÃ´ng Ä‘iá»‡p
	* @param visitDate ngÃ y ngÆ°á»�i dÃ¹ng xem thÃ´ng Ä‘iá»‡p chung
	* @param serviceContext ngá»¯ cáº£nh dá»‹ch vá»¥
	* @return: thÃ´ng Ä‘iá»‡p tá»›i ngÆ°á»�i dÃ¹ng má»›i Ä‘Æ°á»£c thÃªm vÃ o
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public org.oep.ssomgt.model.AppMessage addAppMessage(
		java.lang.String fromApplication, java.lang.String toUser,
		java.lang.String messageType, java.lang.String messageCode,
		java.lang.String messageText, java.lang.String messageValue,
		java.lang.String messageUrl, java.util.Date visitDate,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* ThÃªm má»›i má»™t thÃ´ng Ä‘iá»‡p gá»­i tá»›i ngÆ°á»�i dÃ¹ng
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    Táº¡o má»›i
	*
	* @param fromApplication mÃ£ cá»§a á»©ng dá»¥ng
	* @param toUser ngÆ°á»�i dÃ¹ng nháº­n thÃ´ng bÃ¡o
	* @param messageType kiá»ƒu thÃ´ng Ä‘iá»‡p
	* @param messageCode mÃ£ thÃ´ng bÃ¡o
	* @param messageText thÃ´ng Ä‘iá»‡p
	* @param messageValue giÃ¡ trá»‹ thÃ´ng Ä‘iá»‡p
	* @param messageUrl Ä‘á»‹a chá»‰ URL gá»­i thÃ´ng Ä‘iá»‡p
	* @param visitDate ngÃ y ngÆ°á»�i dÃ¹ng xem thÃ´ng Ä‘iá»‡p chung
	* @param serviceContext ngá»¯ cáº£nh dá»‹ch vá»¥
	* @return: thÃ´ng Ä‘iá»‡p tá»›i ngÆ°á»�i dÃ¹ng má»›i Ä‘Æ°á»£c thÃªm vÃ o
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public org.oep.ssomgt.model.AppMessage addAppMessage(
		java.lang.String fromApplication, java.util.Date createDate,
		java.lang.String toUser, java.lang.String messageType,
		java.lang.String messageCode, java.lang.String messageText,
		java.lang.String messageValue, java.lang.String messageUrl,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* ThÃªm má»›i má»™t thÃ´ng Ä‘iá»‡p gá»­i tá»›i ngÆ°á»�i dÃ¹ng
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    Táº¡o má»›i
	*
	* @param fromApplication mÃ£ cá»§a á»©ng dá»¥ng
	* @param toUser ngÆ°á»�i dÃ¹ng nháº­n thÃ´ng bÃ¡o
	* @param messageType kiá»ƒu thÃ´ng Ä‘iá»‡p
	* @param messageCode mÃ£ thÃ´ng bÃ¡o
	* @param messageText thÃ´ng Ä‘iá»‡p
	* @param messageValue giÃ¡ trá»‹ thÃ´ng Ä‘iá»‡p
	* @param messageUrl Ä‘á»‹a chá»‰ URL gá»­i thÃ´ng Ä‘iá»‡p
	* @param visitDate ngÃ y ngÆ°á»�i dÃ¹ng xem thÃ´ng Ä‘iá»‡p chung
	* @param serviceContext ngá»¯ cáº£nh dá»‹ch vá»¥
	* @return: thÃ´ng Ä‘iá»‡p tá»›i ngÆ°á»�i dÃ¹ng má»›i Ä‘Æ°á»£c thÃªm vÃ o
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public org.oep.ssomgt.model.AppMessage addAppMessage(long userId,
		java.lang.String fromApplication, java.util.Date createDate,
		java.lang.String toUser, java.lang.String messageType,
		java.lang.String messageCode, java.lang.String messageText,
		java.lang.String messageValue, java.lang.String messageUrl)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Cáº­p nháº­t thÃ´ng tin má»™t thÃ´ng Ä‘iá»‡p gá»­i tá»›i ngÆ°á»�i dÃ¹ng
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    Táº¡o má»›i
	*
	* @param id mÃ£ phÃ¢n biá»‡t cá»§a thÃ´ng Ä‘iá»‡p
	* @param fromApplication mÃ£ cá»§a á»©ng dá»¥ng
	* @param toUser ngÆ°á»�i dÃ¹ng nháº­n thÃ´ng bÃ¡o
	* @param messageType kiá»ƒu thÃ´ng Ä‘iá»‡p
	* @param messageCode mÃ£ thÃ´ng bÃ¡o
	* @param messageText thÃ´ng Ä‘iá»‡p
	* @param messageValue giÃ¡ trá»‹ thÃ´ng Ä‘iá»‡p
	* @param messageUrl Ä‘á»‹a chá»‰ URL gá»­i thÃ´ng Ä‘iá»‡p
	* @param visitDate ngÃ y ngÆ°á»�i dÃ¹ng xem thÃ´ng Ä‘iá»‡p chung
	* @param serviceContext ngá»¯ cáº£nh dá»‹ch vá»¥
	* @return: Ä‘á»‘i tÆ°á»£ng thÃ´ng Ä‘iá»‡p má»›i Ä‘Æ°á»£c cáº­p nháº­t
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public org.oep.ssomgt.model.AppMessage updateAppMessage(long id,
		java.lang.String fromApplication, java.lang.String toUser,
		java.lang.String messageType, java.lang.String messageCode,
		java.lang.String messageText, java.lang.String messageValue,
		java.lang.String messageUrl, java.util.Date visitDate,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Cáº­p nháº­t thÃ´ng tin má»™t thÃ´ng Ä‘iá»‡p gá»­i tá»›i ngÆ°á»�i dÃ¹ng
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    Táº¡o má»›i
	*
	* @param appMessage thÃ´ng Ä‘iá»‡p cáº§n cáº­p nháº­t thÃ´ng tin
	* @param serviceContext ngá»¯ cáº£nh dá»‹ch vá»¥
	* @return: thÃ´ng Ä‘iá»‡p má»›i Ä‘Æ°á»£c cáº­p nháº­t thÃ´ng tin
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public org.oep.ssomgt.model.AppMessage updateAppMessage(
		org.oep.ssomgt.model.AppMessage appMessage,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* XÃ³a bá»� thÃ´ng tin má»™t thÃ´ng Ä‘iá»‡p gá»­i tá»›i ngÆ°á»�i dÃ¹ng
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    Táº¡o má»›i
	*
	* @param appMessage thÃ´ng Ä‘iá»‡p sáº½ bá»‹ xÃ³a
	* @return
	*/
	public void removeAppMessage(org.oep.ssomgt.model.AppMessage appMessage)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* XÃ³a bá»� thÃ´ng tin má»™t thÃ´ng Ä‘iá»‡p gá»­i tá»›i ngÆ°á»�i dÃ¹ng
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    Táº¡o má»›i
	*
	* @param id mÃ£ phÃ¢n biá»‡t thÃ´ng Ä‘iá»‡p
	* @return
	*/
	public void removeAppMessage(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public int countByCustomCondition(java.lang.String fromApplication,
		java.lang.String toUser, java.util.Date fromDate,
		java.util.Date toDate, java.lang.String messageType,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<org.oep.ssomgt.model.AppMessage> findByCustomCondition(
		java.lang.String fromApplication, java.lang.String toUser,
		java.util.Date fromDate, java.util.Date toDate,
		java.lang.String messageType, int startIndex, int endIndex,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<org.oep.ssomgt.model.AppMessage> findByFromApplicationToUser(
		java.lang.String fromApplication, java.lang.String toUser)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<org.oep.ssomgt.model.AppMessage> findByFromApplicationToUserMessageType(
		java.lang.String fromApplication, java.lang.String toUser,
		java.lang.String messageType)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countByFromApplicationToUserMessageType(
		java.lang.String fromApplication, java.lang.String toUser,
		java.lang.String messageType)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<org.oep.ssomgt.model.AppMessage> findByFromApplicationToUserMessageType(
		java.lang.String fromApplication, java.lang.String toUser,
		java.lang.String messageType, int startIndex, int endIndex)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<org.oep.ssomgt.model.AppMessage> findByFromApplicationToUserNotMessageType(
		java.lang.String fromApplication, java.lang.String toUser,
		java.lang.String messageType)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countByFromApplicationToUserNotMessageType(
		java.lang.String fromApplication, java.lang.String toUser,
		java.lang.String messageType)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<org.oep.ssomgt.model.AppMessage> findByFromApplicationToUserNotMessageType(
		java.lang.String fromApplication, java.lang.String toUser,
		java.lang.String messageType, int startIndex, int endIndex)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<org.oep.ssomgt.model.AppMessage> findByApplicationUser(
		java.lang.String fromApplication, java.lang.String toUser,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException;
}