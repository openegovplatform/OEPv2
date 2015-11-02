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
 * Provides the local service utility for AppMessage. This utility wraps
 * {@link org.oep.core.ssomgt.service.impl.AppMessageLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author trungdk
 * @see AppMessageLocalService
 * @see org.oep.core.ssomgt.service.base.AppMessageLocalServiceBaseImpl
 * @see org.oep.core.ssomgt.service.impl.AppMessageLocalServiceImpl
 * @generated
 */
public class AppMessageLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.oep.core.ssomgt.service.impl.AppMessageLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the app message to the database. Also notifies the appropriate model listeners.
	*
	* @param appMessage the app message
	* @return the app message that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.ssomgt.model.AppMessage addAppMessage(
		org.oep.core.ssomgt.model.AppMessage appMessage)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addAppMessage(appMessage);
	}

	/**
	* Creates a new app message with the primary key. Does not add the app message to the database.
	*
	* @param appMessageId the primary key for the new app message
	* @return the new app message
	*/
	public static org.oep.core.ssomgt.model.AppMessage createAppMessage(
		long appMessageId) {
		return getService().createAppMessage(appMessageId);
	}

	/**
	* Deletes the app message with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param appMessageId the primary key of the app message
	* @return the app message that was removed
	* @throws PortalException if a app message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.ssomgt.model.AppMessage deleteAppMessage(
		long appMessageId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteAppMessage(appMessageId);
	}

	/**
	* Deletes the app message from the database. Also notifies the appropriate model listeners.
	*
	* @param appMessage the app message
	* @return the app message that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.ssomgt.model.AppMessage deleteAppMessage(
		org.oep.core.ssomgt.model.AppMessage appMessage)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteAppMessage(appMessage);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.ssomgt.model.impl.AppMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.ssomgt.model.impl.AppMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static org.oep.core.ssomgt.model.AppMessage fetchAppMessage(
		long appMessageId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchAppMessage(appMessageId);
	}

	/**
	* Returns the app message with the primary key.
	*
	* @param appMessageId the primary key of the app message
	* @return the app message
	* @throws PortalException if a app message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.ssomgt.model.AppMessage getAppMessage(
		long appMessageId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getAppMessage(appMessageId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the app messages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.ssomgt.model.impl.AppMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of app messages
	* @param end the upper bound of the range of app messages (not inclusive)
	* @return the range of app messages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.ssomgt.model.AppMessage> getAppMessages(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAppMessages(start, end);
	}

	/**
	* Returns the number of app messages.
	*
	* @return the number of app messages
	* @throws SystemException if a system exception occurred
	*/
	public static int getAppMessagesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAppMessagesCount();
	}

	/**
	* Updates the app message in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param appMessage the app message
	* @return the app message that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.ssomgt.model.AppMessage updateAppMessage(
		org.oep.core.ssomgt.model.AppMessage appMessage)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateAppMessage(appMessage);
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
	* ThÃƒÂªm mÃ¡Â»â€ºi mÃ¡Â»â„¢t thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p gÃ¡Â»Â­i tÃ¡Â»â€ºi ngÃ†Â°Ã¡Â»ï¿½i dÃƒÂ¹ng
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param fromApplication mÃƒÂ£ cÃ¡Â»Â§a Ã¡Â»Â©ng dÃ¡Â»Â¥ng
	* @param toUser ngÃ†Â°Ã¡Â»ï¿½i dÃƒÂ¹ng nhÃ¡ÂºÂ­n thÃƒÂ´ng bÃƒÂ¡o
	* @param messageType kiÃ¡Â»Æ’u thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p
	* @param messageCode mÃƒÂ£ thÃƒÂ´ng bÃƒÂ¡o
	* @param messageText thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p
	* @param messageValue giÃƒÂ¡ trÃ¡Â»â€¹ thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p
	* @param messageUrl Ã„â€˜Ã¡Â»â€¹a chÃ¡Â»â€° URL gÃ¡Â»Â­i thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p
	* @param visitDate ngÃƒÂ y ngÃ†Â°Ã¡Â»ï¿½i dÃƒÂ¹ng xem thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p chung
	* @param serviceContext ngÃ¡Â»Â¯ cÃ¡ÂºÂ£nh dÃ¡Â»â€¹ch vÃ¡Â»Â¥
	* @return: thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p tÃ¡Â»â€ºi ngÃ†Â°Ã¡Â»ï¿½i dÃƒÂ¹ng mÃ¡Â»â€ºi Ã„â€˜Ã†Â°Ã¡Â»Â£c thÃƒÂªm vÃƒÂ o
	*/
	public static org.oep.core.ssomgt.model.AppMessage addAppMessage(
		java.lang.String fromApplication, java.lang.String toUser,
		java.lang.String messageType, java.lang.String messageCode,
		java.lang.String messageText, java.lang.String messageValue,
		java.lang.String messageUrl, java.util.Date visitDate,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addAppMessage(fromApplication, toUser, messageType,
			messageCode, messageText, messageValue, messageUrl, visitDate,
			serviceContext);
	}

	/**
	* ThÃƒÂªm mÃ¡Â»â€ºi mÃ¡Â»â„¢t thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p gÃ¡Â»Â­i tÃ¡Â»â€ºi ngÃ†Â°Ã¡Â»ï¿½i dÃƒÂ¹ng
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param fromApplication mÃƒÂ£ cÃ¡Â»Â§a Ã¡Â»Â©ng dÃ¡Â»Â¥ng
	* @param toUser ngÃ†Â°Ã¡Â»ï¿½i dÃƒÂ¹ng nhÃ¡ÂºÂ­n thÃƒÂ´ng bÃƒÂ¡o
	* @param messageType kiÃ¡Â»Æ’u thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p
	* @param messageCode mÃƒÂ£ thÃƒÂ´ng bÃƒÂ¡o
	* @param messageText thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p
	* @param messageValue giÃƒÂ¡ trÃ¡Â»â€¹ thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p
	* @param messageUrl Ã„â€˜Ã¡Â»â€¹a chÃ¡Â»â€° URL gÃ¡Â»Â­i thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p
	* @param visitDate ngÃƒÂ y ngÃ†Â°Ã¡Â»ï¿½i dÃƒÂ¹ng xem thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p chung
	* @param serviceContext ngÃ¡Â»Â¯ cÃ¡ÂºÂ£nh dÃ¡Â»â€¹ch vÃ¡Â»Â¥
	* @return: thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p tÃ¡Â»â€ºi ngÃ†Â°Ã¡Â»ï¿½i dÃƒÂ¹ng mÃ¡Â»â€ºi Ã„â€˜Ã†Â°Ã¡Â»Â£c thÃƒÂªm vÃƒÂ o
	*/
	public static org.oep.core.ssomgt.model.AppMessage addAppMessage(
		java.lang.String fromApplication, java.util.Date createDate,
		java.lang.String toUser, java.lang.String messageType,
		java.lang.String messageCode, java.lang.String messageText,
		java.lang.String messageValue, java.lang.String messageUrl,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addAppMessage(fromApplication, createDate, toUser,
			messageType, messageCode, messageText, messageValue, messageUrl,
			serviceContext);
	}

	/**
	* ThÃƒÂªm mÃ¡Â»â€ºi mÃ¡Â»â„¢t thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p gÃ¡Â»Â­i tÃ¡Â»â€ºi ngÃ†Â°Ã¡Â»ï¿½i dÃƒÂ¹ng
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param fromApplication mÃƒÂ£ cÃ¡Â»Â§a Ã¡Â»Â©ng dÃ¡Â»Â¥ng
	* @param toUser ngÃ†Â°Ã¡Â»ï¿½i dÃƒÂ¹ng nhÃ¡ÂºÂ­n thÃƒÂ´ng bÃƒÂ¡o
	* @param messageType kiÃ¡Â»Æ’u thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p
	* @param messageCode mÃƒÂ£ thÃƒÂ´ng bÃƒÂ¡o
	* @param messageText thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p
	* @param messageValue giÃƒÂ¡ trÃ¡Â»â€¹ thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p
	* @param messageUrl Ã„â€˜Ã¡Â»â€¹a chÃ¡Â»â€° URL gÃ¡Â»Â­i thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p
	* @param visitDate ngÃƒÂ y ngÃ†Â°Ã¡Â»ï¿½i dÃƒÂ¹ng xem thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p chung
	* @param serviceContext ngÃ¡Â»Â¯ cÃ¡ÂºÂ£nh dÃ¡Â»â€¹ch vÃ¡Â»Â¥
	* @return: thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p tÃ¡Â»â€ºi ngÃ†Â°Ã¡Â»ï¿½i dÃƒÂ¹ng mÃ¡Â»â€ºi Ã„â€˜Ã†Â°Ã¡Â»Â£c thÃƒÂªm vÃƒÂ o
	*/
	public static org.oep.core.ssomgt.model.AppMessage addAppMessage(
		long userId, java.lang.String fromApplication,
		java.util.Date createDate, java.lang.String toUser,
		java.lang.String messageType, java.lang.String messageCode,
		java.lang.String messageText, java.lang.String messageValue,
		java.lang.String messageUrl)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addAppMessage(userId, fromApplication, createDate, toUser,
			messageType, messageCode, messageText, messageValue, messageUrl);
	}

	/**
	* CÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t thÃƒÂ´ng tin mÃ¡Â»â„¢t thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p gÃ¡Â»Â­i tÃ¡Â»â€ºi ngÃ†Â°Ã¡Â»ï¿½i dÃƒÂ¹ng
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param id mÃƒÂ£ phÃƒÂ¢n biÃ¡Â»â€¡t cÃ¡Â»Â§a thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p
	* @param fromApplication mÃƒÂ£ cÃ¡Â»Â§a Ã¡Â»Â©ng dÃ¡Â»Â¥ng
	* @param toUser ngÃ†Â°Ã¡Â»ï¿½i dÃƒÂ¹ng nhÃ¡ÂºÂ­n thÃƒÂ´ng bÃƒÂ¡o
	* @param messageType kiÃ¡Â»Æ’u thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p
	* @param messageCode mÃƒÂ£ thÃƒÂ´ng bÃƒÂ¡o
	* @param messageText thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p
	* @param messageValue giÃƒÂ¡ trÃ¡Â»â€¹ thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p
	* @param messageUrl Ã„â€˜Ã¡Â»â€¹a chÃ¡Â»â€° URL gÃ¡Â»Â­i thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p
	* @param visitDate ngÃƒÂ y ngÃ†Â°Ã¡Â»ï¿½i dÃƒÂ¹ng xem thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p chung
	* @param serviceContext ngÃ¡Â»Â¯ cÃ¡ÂºÂ£nh dÃ¡Â»â€¹ch vÃ¡Â»Â¥
	* @return: Ã„â€˜Ã¡Â»â€˜i tÃ†Â°Ã¡Â»Â£ng thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p mÃ¡Â»â€ºi Ã„â€˜Ã†Â°Ã¡Â»Â£c cÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t
	*/
	public static org.oep.core.ssomgt.model.AppMessage updateAppMessage(
		long id, java.lang.String fromApplication, java.lang.String toUser,
		java.lang.String messageType, java.lang.String messageCode,
		java.lang.String messageText, java.lang.String messageValue,
		java.lang.String messageUrl, java.util.Date visitDate,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateAppMessage(id, fromApplication, toUser, messageType,
			messageCode, messageText, messageValue, messageUrl, visitDate,
			serviceContext);
	}

	/**
	* CÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t thÃƒÂ´ng tin mÃ¡Â»â„¢t thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p gÃ¡Â»Â­i tÃ¡Â»â€ºi ngÃ†Â°Ã¡Â»ï¿½i dÃƒÂ¹ng
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param appMessage thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p cÃ¡ÂºÂ§n cÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t thÃƒÂ´ng tin
	* @param serviceContext ngÃ¡Â»Â¯ cÃ¡ÂºÂ£nh dÃ¡Â»â€¹ch vÃ¡Â»Â¥
	* @return: thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p mÃ¡Â»â€ºi Ã„â€˜Ã†Â°Ã¡Â»Â£c cÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t thÃƒÂ´ng tin
	*/
	public static org.oep.core.ssomgt.model.AppMessage updateAppMessage(
		org.oep.core.ssomgt.model.AppMessage appMessage,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().updateAppMessage(appMessage, serviceContext);
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
	* @param appMessage thÃƒÂ´ng Ã„â€˜iÃ¡Â»â€¡p sÃ¡ÂºÂ½ bÃ¡Â»â€¹ xÃƒÂ³a
	* @return
	*/
	public static void removeAppMessage(
		org.oep.core.ssomgt.model.AppMessage appMessage)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().removeAppMessage(appMessage);
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
	public static void removeAppMessage(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().removeAppMessage(id);
	}

	public static int countByCustomCondition(java.lang.String fromApplication,
		java.lang.String toUser, java.util.Date fromDate,
		java.util.Date toDate, java.lang.String messageType,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countByCustomCondition(fromApplication, toUser, fromDate,
			toDate, messageType, serviceContext);
	}

	public static java.util.List<org.oep.core.ssomgt.model.AppMessage> findByCustomCondition(
		java.lang.String fromApplication, java.lang.String toUser,
		java.util.Date fromDate, java.util.Date toDate,
		java.lang.String messageType, int startIndex, int endIndex,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByCustomCondition(fromApplication, toUser, fromDate,
			toDate, messageType, startIndex, endIndex, serviceContext);
	}

	public static java.util.List<org.oep.core.ssomgt.model.AppMessage> findByFromApplicationToUser(
		java.lang.String fromApplication, java.lang.String toUser)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByFromApplicationToUser(fromApplication, toUser);
	}

	public static void clearService() {
		_service = null;
	}

	public static AppMessageLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					AppMessageLocalService.class.getName());

			if (invokableLocalService instanceof AppMessageLocalService) {
				_service = (AppMessageLocalService)invokableLocalService;
			}
			else {
				_service = new AppMessageLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(AppMessageLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(AppMessageLocalService service) {
	}

	private static AppMessageLocalService _service;
}