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

package org.oep.core.processmgt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ProcessOrder2UserLocalService}.
 *
 * @author trungdk
 * @see ProcessOrder2UserLocalService
 * @generated
 */
public class ProcessOrder2UserLocalServiceWrapper
	implements ProcessOrder2UserLocalService,
		ServiceWrapper<ProcessOrder2UserLocalService> {
	public ProcessOrder2UserLocalServiceWrapper(
		ProcessOrder2UserLocalService processOrder2UserLocalService) {
		_processOrder2UserLocalService = processOrder2UserLocalService;
	}

	/**
	* Adds the process order2 user to the database. Also notifies the appropriate model listeners.
	*
	* @param processOrder2User the process order2 user
	* @return the process order2 user that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.processmgt.model.ProcessOrder2User addProcessOrder2User(
		org.oep.core.processmgt.model.ProcessOrder2User processOrder2User)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _processOrder2UserLocalService.addProcessOrder2User(processOrder2User);
	}

	/**
	* Creates a new process order2 user with the primary key. Does not add the process order2 user to the database.
	*
	* @param processOrder2UserPK the primary key for the new process order2 user
	* @return the new process order2 user
	*/
	@Override
	public org.oep.core.processmgt.model.ProcessOrder2User createProcessOrder2User(
		org.oep.core.processmgt.service.persistence.ProcessOrder2UserPK processOrder2UserPK) {
		return _processOrder2UserLocalService.createProcessOrder2User(processOrder2UserPK);
	}

	/**
	* Deletes the process order2 user with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param processOrder2UserPK the primary key of the process order2 user
	* @return the process order2 user that was removed
	* @throws PortalException if a process order2 user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.processmgt.model.ProcessOrder2User deleteProcessOrder2User(
		org.oep.core.processmgt.service.persistence.ProcessOrder2UserPK processOrder2UserPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _processOrder2UserLocalService.deleteProcessOrder2User(processOrder2UserPK);
	}

	/**
	* Deletes the process order2 user from the database. Also notifies the appropriate model listeners.
	*
	* @param processOrder2User the process order2 user
	* @return the process order2 user that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.processmgt.model.ProcessOrder2User deleteProcessOrder2User(
		org.oep.core.processmgt.model.ProcessOrder2User processOrder2User)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _processOrder2UserLocalService.deleteProcessOrder2User(processOrder2User);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _processOrder2UserLocalService.dynamicQuery();
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
		return _processOrder2UserLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.ProcessOrder2UserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _processOrder2UserLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.ProcessOrder2UserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _processOrder2UserLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
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
		return _processOrder2UserLocalService.dynamicQueryCount(dynamicQuery);
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
		return _processOrder2UserLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public org.oep.core.processmgt.model.ProcessOrder2User fetchProcessOrder2User(
		org.oep.core.processmgt.service.persistence.ProcessOrder2UserPK processOrder2UserPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _processOrder2UserLocalService.fetchProcessOrder2User(processOrder2UserPK);
	}

	/**
	* Returns the process order2 user with the primary key.
	*
	* @param processOrder2UserPK the primary key of the process order2 user
	* @return the process order2 user
	* @throws PortalException if a process order2 user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.processmgt.model.ProcessOrder2User getProcessOrder2User(
		org.oep.core.processmgt.service.persistence.ProcessOrder2UserPK processOrder2UserPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _processOrder2UserLocalService.getProcessOrder2User(processOrder2UserPK);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _processOrder2UserLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the process order2 users.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.ProcessOrder2UserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of process order2 users
	* @param end the upper bound of the range of process order2 users (not inclusive)
	* @return the range of process order2 users
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.oep.core.processmgt.model.ProcessOrder2User> getProcessOrder2Users(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _processOrder2UserLocalService.getProcessOrder2Users(start, end);
	}

	/**
	* Returns the number of process order2 users.
	*
	* @return the number of process order2 users
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getProcessOrder2UsersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _processOrder2UserLocalService.getProcessOrder2UsersCount();
	}

	/**
	* Updates the process order2 user in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param processOrder2User the process order2 user
	* @return the process order2 user that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.processmgt.model.ProcessOrder2User updateProcessOrder2User(
		org.oep.core.processmgt.model.ProcessOrder2User processOrder2User)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _processOrder2UserLocalService.updateProcessOrder2User(processOrder2User);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _processOrder2UserLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_processOrder2UserLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _processOrder2UserLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	* ThÃƒÂªm quan hÃ¡Â»â€¡ giÃ¡Â»Â¯a thÃƒÂ´ng tin xÃ¡Â»Â­ lÃƒÂ½ hÃ¡Â»â€œ sÃ†Â¡ vÃ¡Â»â€ºi ngÃ†Â°Ã¡Â»ï¿½i xÃ¡Â»Â­ lÃƒÂ½ hÃ¡Â»â€œ sÃ†Â¡
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param processOrderId mÃƒÂ£ thÃƒÂ´ng tin xÃ¡Â»Â­ lÃƒÂ½ hÃ¡Â»â€œ sÃ†Â¡
	* @param userId mÃƒÂ£ vai trÃƒÂ²
	* @return: quan hÃ¡Â»â€¡ giÃ¡Â»Â¯a thÃƒÂ´ng tin xÃ¡Â»Â­ lÃƒÂ½ hÃ¡Â»â€œ sÃ†Â¡ vÃ¡Â»â€ºi cÃƒÂ¡n bÃ¡Â»â„¢ xÃ¡Â»Â­ lÃƒÂ½Ã¡Â»Â§e
	*/
	@Override
	public org.oep.core.processmgt.model.ProcessOrder2User addProcessOrder2User(
		long processOrderId, long userId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _processOrder2UserLocalService.addProcessOrder2User(processOrderId,
			userId, serviceContext);
	}

	@Override
	public void removeProcessOrder2User(
		org.oep.core.processmgt.model.ProcessOrder2User processOrder2User)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_processOrder2UserLocalService.removeProcessOrder2User(processOrder2User);
	}

	@Override
	public void removeProcessOrder2User(long processOrderId, long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_processOrder2UserLocalService.removeProcessOrder2User(processOrderId,
			userId);
	}

	@Override
	public org.oep.core.processmgt.model.ProcessOrder2User getProcessOrder2User(
		long processOrderId, long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _processOrder2UserLocalService.getProcessOrder2User(processOrderId,
			userId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ProcessOrder2UserLocalService getWrappedProcessOrder2UserLocalService() {
		return _processOrder2UserLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedProcessOrder2UserLocalService(
		ProcessOrder2UserLocalService processOrder2UserLocalService) {
		_processOrder2UserLocalService = processOrder2UserLocalService;
	}

	@Override
	public ProcessOrder2UserLocalService getWrappedService() {
		return _processOrder2UserLocalService;
	}

	@Override
	public void setWrappedService(
		ProcessOrder2UserLocalService processOrder2UserLocalService) {
		_processOrder2UserLocalService = processOrder2UserLocalService;
	}

	private ProcessOrder2UserLocalService _processOrder2UserLocalService;
}