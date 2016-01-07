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
 * Provides the local service interface for UserSync. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author trungdk
 * @see UserSyncLocalServiceUtil
 * @see org.oep.ssomgt.service.base.UserSyncLocalServiceBaseImpl
 * @see org.oep.ssomgt.service.impl.UserSyncLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface UserSyncLocalService extends BaseLocalService,
	InvokableLocalService, PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link UserSyncLocalServiceUtil} to access the user sync local service. Add custom service methods to {@link org.oep.ssomgt.service.impl.UserSyncLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the user sync to the database. Also notifies the appropriate model listeners.
	*
	* @param userSync the user sync
	* @return the user sync that was added
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public org.oep.ssomgt.model.UserSync addUserSync(
		org.oep.ssomgt.model.UserSync userSync)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new user sync with the primary key. Does not add the user sync to the database.
	*
	* @param userSyncId the primary key for the new user sync
	* @return the new user sync
	*/
	public org.oep.ssomgt.model.UserSync createUserSync(long userSyncId);

	/**
	* Deletes the user sync with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param userSyncId the primary key of the user sync
	* @return the user sync that was removed
	* @throws PortalException if a user sync with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.DELETE)
	public org.oep.ssomgt.model.UserSync deleteUserSync(long userSyncId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the user sync from the database. Also notifies the appropriate model listeners.
	*
	* @param userSync the user sync
	* @return the user sync that was removed
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.DELETE)
	public org.oep.ssomgt.model.UserSync deleteUserSync(
		org.oep.ssomgt.model.UserSync userSync)
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.ssomgt.model.impl.UserSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public org.oep.ssomgt.model.UserSync fetchUserSync(long userSyncId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the user sync with the primary key.
	*
	* @param userSyncId the primary key of the user sync
	* @return the user sync
	* @throws PortalException if a user sync with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public org.oep.ssomgt.model.UserSync getUserSync(long userSyncId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<org.oep.ssomgt.model.UserSync> getUserSyncs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of user syncs.
	*
	* @return the number of user syncs
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getUserSyncsCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the user sync in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param userSync the user sync
	* @return the user sync that was updated
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public org.oep.ssomgt.model.UserSync updateUserSync(
		org.oep.ssomgt.model.UserSync userSync)
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
	* ThÃªm má»›i má»™t thÃ´ng tin Ä‘á»“ng bá»™ ngÆ°á»�i dÃ¹ng
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    Táº¡o má»›i
	*
	* @param applicationId mÃ£ phÃ¢n biá»‡t á»©ng dá»¥ng tÃ­ch há»£p
	* @param employeeId mÃ£ cÃ¡n bá»™
	* @param userId mÃ£ ngÆ°á»�i sá»­ dá»¥ng
	* @param isAccessible tráº¡ng thÃ¡i cÃ³ quyá»�n truy cáº­p á»©ng dá»¥ng
	* @param checkpoint Ä‘iá»ƒm cáº­p nháº­t má»›i nháº¥t thÃ´ng tin ngÆ°á»�i dÃ¹ng
	* @param syncTime thá»�i Ä‘iá»ƒm Ä‘Æ°á»£c Ä‘á»“ng bá»™ cuá»‘i
	* @return: thÃ´ng tin Ä‘á»“ng bá»™ ngÆ°á»�i dÃ¹ng má»›i Ä‘Æ°á»£c thÃªm vÃ o
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public org.oep.ssomgt.model.UserSync addUserSync(long applicationId,
		long employeeId, long userId, java.lang.String ssoUserName,
		java.lang.String appUserName, java.lang.String fullName,
		java.lang.String email, java.lang.String password,
		int accessibleStatus, java.lang.String roles,
		java.util.Date checkpoint, java.util.Date syncTime)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Cáº­p nháº­t thÃ´ng tin Ä‘á»“ng bá»™ ngÆ°á»�i dÃ¹ng
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    Táº¡o má»›i
	*
	* @param id mÃ£ phÃ¢n biá»‡t cá»§a thÃ´ng tin Ä‘á»“ng bá»™
	* @param applicationId mÃ£ phÃ¢n biá»‡t á»©ng dá»¥ng tÃ­ch há»£p
	* @param employeeId mÃ£ cÃ¡n bá»™
	* @param userId mÃ£ ngÆ°á»�i sá»­ dá»¥ng
	* @param accessible tráº¡ng thÃ¡i cÃ³ quyá»�n truy cáº­p á»©ng dá»¥ng
	* @param checkpoint Ä‘iá»ƒm cáº­p nháº­t má»›i nháº¥t thÃ´ng tin ngÆ°á»�i dÃ¹ng
	* @param syncTime thá»�i Ä‘iá»ƒm Ä‘Æ°á»£c Ä‘á»“ng bá»™ cuá»‘i
	* @return: Ä‘á»‘i tÆ°á»£ng thÃ´ng tin Ä‘á»“ng bá»™ má»›i Ä‘Æ°á»£c cáº­p nháº­t
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public org.oep.ssomgt.model.UserSync updateUserSync(long id,
		long applicationId, long employeeId, long userId,
		java.lang.String ssoUserName, java.lang.String appUserName,
		java.lang.String fullName, java.lang.String email,
		java.lang.String password, int accessibleStatus,
		java.lang.String roles, java.util.Date checkpoint,
		java.util.Date syncTime)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Cáº­p nháº­t thÃ´ng tin Ä‘á»“ng bá»™ ngÆ°á»�i dÃ¹ng
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    Táº¡o má»›i
	*
	* @param userSync thÃ´ng tin Ä‘á»“ng bá»™ cáº§n cáº­p nháº­t thÃ´ng tin
	* @param serviceContext ngá»¯ cáº£nh dá»‹ch vá»¥
	* @return: thÃ´ng tin Ä‘á»“ng bá»™ ngÆ°á»�i dÃ¹ng má»›i Ä‘Æ°á»£c cáº­p nháº­t thÃ´ng tin
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public org.oep.ssomgt.model.UserSync updateUserSync(
		org.oep.ssomgt.model.UserSync userSync,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* XÃ³a bá»� thÃ´ng tin má»™t thÃ´ng tin Ä‘á»“ng bá»™ ngÆ°á»�i dÃ¹ng
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    Táº¡o má»›i
	*
	* @param userSync thÃ´ng tin Ä‘á»“ng bá»™ sáº½ bá»‹ xÃ³a
	* @return
	*/
	public void removeUserSync(org.oep.ssomgt.model.UserSync userSync)
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
	public void removeUserSync(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<org.oep.ssomgt.model.UserSync> findByApplicationCheckPoint(
		long applicationId, java.util.Date checkpoint)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countByApplicationSync(long applicationId, boolean isSync,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<org.oep.ssomgt.model.UserSync> findByApplicationSync(
		long applicationId, boolean isSync, int startIndex, int endIndex,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException;

	public org.oep.ssomgt.model.UserSync findByApplicationEmployee(
		long applicationId, long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchUserSyncException;

	public org.oep.ssomgt.model.UserSync findByApplicationUser(
		long applicationId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.oep.ssomgt.NoSuchUserSyncException;
}