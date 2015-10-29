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
 * Provides a wrapper for {@link ProcessOrderLocalService}.
 *
 * @author trungdk
 * @see ProcessOrderLocalService
 * @generated
 */
public class ProcessOrderLocalServiceWrapper implements ProcessOrderLocalService,
	ServiceWrapper<ProcessOrderLocalService> {
	public ProcessOrderLocalServiceWrapper(
		ProcessOrderLocalService processOrderLocalService) {
		_processOrderLocalService = processOrderLocalService;
	}

	/**
	* Adds the process order to the database. Also notifies the appropriate model listeners.
	*
	* @param processOrder the process order
	* @return the process order that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.processmgt.model.ProcessOrder addProcessOrder(
		org.oep.core.processmgt.model.ProcessOrder processOrder)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _processOrderLocalService.addProcessOrder(processOrder);
	}

	/**
	* Creates a new process order with the primary key. Does not add the process order to the database.
	*
	* @param processOrderId the primary key for the new process order
	* @return the new process order
	*/
	@Override
	public org.oep.core.processmgt.model.ProcessOrder createProcessOrder(
		long processOrderId) {
		return _processOrderLocalService.createProcessOrder(processOrderId);
	}

	/**
	* Deletes the process order with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param processOrderId the primary key of the process order
	* @return the process order that was removed
	* @throws PortalException if a process order with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.processmgt.model.ProcessOrder deleteProcessOrder(
		long processOrderId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _processOrderLocalService.deleteProcessOrder(processOrderId);
	}

	/**
	* Deletes the process order from the database. Also notifies the appropriate model listeners.
	*
	* @param processOrder the process order
	* @return the process order that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.processmgt.model.ProcessOrder deleteProcessOrder(
		org.oep.core.processmgt.model.ProcessOrder processOrder)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _processOrderLocalService.deleteProcessOrder(processOrder);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _processOrderLocalService.dynamicQuery();
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
		return _processOrderLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.ProcessOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _processOrderLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.ProcessOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _processOrderLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _processOrderLocalService.dynamicQueryCount(dynamicQuery);
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
		return _processOrderLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public org.oep.core.processmgt.model.ProcessOrder fetchProcessOrder(
		long processOrderId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _processOrderLocalService.fetchProcessOrder(processOrderId);
	}

	/**
	* Returns the process order with the matching UUID and company.
	*
	* @param uuid the process order's UUID
	* @param companyId the primary key of the company
	* @return the matching process order, or <code>null</code> if a matching process order could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.processmgt.model.ProcessOrder fetchProcessOrderByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _processOrderLocalService.fetchProcessOrderByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns the process order matching the UUID and group.
	*
	* @param uuid the process order's UUID
	* @param groupId the primary key of the group
	* @return the matching process order, or <code>null</code> if a matching process order could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.processmgt.model.ProcessOrder fetchProcessOrderByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _processOrderLocalService.fetchProcessOrderByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns the process order with the primary key.
	*
	* @param processOrderId the primary key of the process order
	* @return the process order
	* @throws PortalException if a process order with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.processmgt.model.ProcessOrder getProcessOrder(
		long processOrderId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _processOrderLocalService.getProcessOrder(processOrderId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _processOrderLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the process order with the matching UUID and company.
	*
	* @param uuid the process order's UUID
	* @param companyId the primary key of the company
	* @return the matching process order
	* @throws PortalException if a matching process order could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.processmgt.model.ProcessOrder getProcessOrderByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _processOrderLocalService.getProcessOrderByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns the process order matching the UUID and group.
	*
	* @param uuid the process order's UUID
	* @param groupId the primary key of the group
	* @return the matching process order
	* @throws PortalException if a matching process order could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.processmgt.model.ProcessOrder getProcessOrderByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _processOrderLocalService.getProcessOrderByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns a range of all the process orders.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.ProcessOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of process orders
	* @param end the upper bound of the range of process orders (not inclusive)
	* @return the range of process orders
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.oep.core.processmgt.model.ProcessOrder> getProcessOrders(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _processOrderLocalService.getProcessOrders(start, end);
	}

	/**
	* Returns the number of process orders.
	*
	* @return the number of process orders
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getProcessOrdersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _processOrderLocalService.getProcessOrdersCount();
	}

	/**
	* Updates the process order in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param processOrder the process order
	* @return the process order that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.processmgt.model.ProcessOrder updateProcessOrder(
		org.oep.core.processmgt.model.ProcessOrder processOrder)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _processOrderLocalService.updateProcessOrder(processOrder);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _processOrderLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_processOrderLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _processOrderLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* ThÃƒÂªm phiÃ¡ÂºÂ¿u xÃ¡Â»Â­ lÃƒÂ½ hÃ¡Â»â€œ sÃ†Â¡ mÃ¡Â»â€ºi
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param organizationId tÃ¡Â»â€¢ chÃ¡Â»Â©c thÃ¡Â»Â±c hiÃ¡Â»â€¡n xÃ¡Â»Â­ lÃƒÂ½ hÃ¡Â»â€œ sÃ†Â¡
	* @param parentProcessOrderId cÃƒÂ³ phÃ¡ÂºÂ£i lÃƒÂ  phiÃ¡ÂºÂ¿u xÃ¡Â»Â­ lÃƒÂ½ cha
	* @param dossierId hÃ¡Â»â€œ sÃ†Â¡ cÃ¡ÂºÂ§n xÃ¡Â»Â­ lÃƒÂ½
	* @param dossierProcessId nÃ¡ÂºÂ±m trong quy trÃƒÂ¬nh xÃ¡Â»Â­ lÃƒÂ½ hÃ¡Â»â€œ sÃ†Â¡ nÃƒÂ o
	* @param dossierStepId Ã„â€˜ang xÃ¡Â»Â­ lÃƒÂ½ tÃ¡ÂºÂ¡i bÃ†Â°Ã¡Â»â€ºc nÃƒÂ o (0 lÃƒÂ  Ã„â€˜ÃƒÂ£ kÃ¡ÂºÂ¿t thÃƒÂºc xÃ¡Â»Â­ lÃƒÂ½)
	* @param orderStatus trÃ¡ÂºÂ¡ng thÃƒÂ¡i hiÃ¡Â»â€¡n tÃ¡ÂºÂ¡i cÃ¡Â»Â§a phiÃ¡ÂºÂ¿u xÃ¡Â»Â­ lÃƒÂ½
	* @param orderResume tÃƒÂ³m tÃ¡ÂºÂ¯t nÃ¡Â»â„¢i dung cÃ¡ÂºÂ§n xÃ¡Â»Â­ lÃƒÂ½
	* @param stepDate thÃ¡Â»ï¿½i Ã„â€˜iÃ¡Â»Æ’m bÃ¡ÂºÂ¯t Ã„â€˜Ã¡ÂºÂ§u thÃ¡Â»Â±c hiÃ¡Â»â€¡n xÃ¡Â»Â­ lÃƒÂ½ hÃ¡Â»â€œ sÃ†Â¡
	* @param stepNote ghi lÃ¡ÂºÂ¡i ghi chÃƒÂº cÃ¡Â»Â§a ngÃ†Â°Ã¡Â»ï¿½i xÃ¡Â»Â­ lÃƒÂ½ cuÃ¡Â»â€˜i cÃƒÂ¹ng
	* @param assignToUserId ngÃ†Â°Ã¡Â»ï¿½i chÃ¡Â»â€¹u trÃƒÂ¡ch nhiÃ¡Â»â€¡m xÃ¡Â»Â­ lÃƒÂ½
	* @param currentCondition Ã„â€˜iÃ¡Â»ï¿½u kiÃ¡Â»â€¡n hiÃ¡Â»â€¡n tÃ¡ÂºÂ¡i cÃ¡Â»Â§a hÃ¡Â»â€œ sÃ†Â¡ Ã„â€˜Ã¡Â»Æ’ xÃƒÂ©t chuyÃ¡Â»Æ’n dÃ¡Â»â€¹ch
	* @param lastStepTransitionId chuyÃ¡Â»Æ’n dÃ¡Â»â€¹ch cuÃ¡Â»â€˜i cÃƒÂ¹ng cÃ¡Â»Â§a phiÃ¡ÂºÂ¿u xÃ¡Â»Â­ lÃƒÂ½
	* @param stopRollback cÃ¡Â»ï¿½ Ã„â€˜ÃƒÂ¡nh dÃ¡ÂºÂ¥u tÃ¡ÂºÂ¡m dÃ¡Â»Â«ng viÃ¡Â»â€¡c rollback
	* @param ebPartnershipId trao Ã„â€˜Ã¡Â»â€¢i hÃ¡Â»â€œ sÃ†Â¡ hiÃ¡Â»â€¡n tÃ¡ÂºÂ¡i vÃ¡Â»â€ºi hÃ¡Â»â€¡ thÃ¡Â»â€˜ng bÃƒÂªn ngoÃƒÂ i
	* @return: thÃƒÂ´ng tin xÃ¡Â»Â­ lÃƒÂ½ hÃ¡Â»â€œ sÃ†Â¡ mÃ¡Â»â€ºi Ã„â€˜Ã†Â°Ã¡Â»Â£c tÃ¡ÂºÂ¡o
	*/
	@Override
	public org.oep.core.processmgt.model.ProcessOrder addProcessOrder(
		long organizationId, long parentProcessOrderId, long dossierId,
		long dossierProcessId, long dossierStepId,
		java.lang.String orderStatus, java.lang.String orderResume,
		java.util.Date stepDate, java.lang.String stepNote,
		long assignToUserId, java.lang.String currentCondition,
		long lastStepTransitionId, int stopRollback,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _processOrderLocalService.addProcessOrder(organizationId,
			parentProcessOrderId, dossierId, dossierProcessId, dossierStepId,
			orderStatus, orderResume, stepDate, stepNote, assignToUserId,
			currentCondition, lastStepTransitionId, stopRollback, serviceContext);
	}

	/**
	* CÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t phiÃ¡ÂºÂ¿u xÃ¡Â»Â­ lÃƒÂ½ hÃ¡Â»â€œ sÃ†Â¡ mÃ¡Â»â€ºi
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param organizationId tÃ¡Â»â€¢ chÃ¡Â»Â©c thÃ¡Â»Â±c hiÃ¡Â»â€¡n xÃ¡Â»Â­ lÃƒÂ½ hÃ¡Â»â€œ sÃ†Â¡
	* @param parentProcessOrderId cÃƒÂ³ phÃ¡ÂºÂ£i lÃƒÂ  phiÃ¡ÂºÂ¿u xÃ¡Â»Â­ lÃƒÂ½ cha
	* @param dossierId hÃ¡Â»â€œ sÃ†Â¡ cÃ¡ÂºÂ§n xÃ¡Â»Â­ lÃƒÂ½
	* @param dossierProcessId nÃ¡ÂºÂ±m trong quy trÃƒÂ¬nh xÃ¡Â»Â­ lÃƒÂ½ hÃ¡Â»â€œ sÃ†Â¡ nÃƒÂ o
	* @param dossierStepId Ã„â€˜ang xÃ¡Â»Â­ lÃƒÂ½ tÃ¡ÂºÂ¡i bÃ†Â°Ã¡Â»â€ºc nÃƒÂ o (0 lÃƒÂ  Ã„â€˜ÃƒÂ£ kÃ¡ÂºÂ¿t thÃƒÂºc xÃ¡Â»Â­ lÃƒÂ½)
	* @param orderStatus trÃ¡ÂºÂ¡ng thÃƒÂ¡i hiÃ¡Â»â€¡n tÃ¡ÂºÂ¡i cÃ¡Â»Â§a phiÃ¡ÂºÂ¿u xÃ¡Â»Â­ lÃƒÂ½
	* @param orderResume tÃƒÂ³m tÃ¡ÂºÂ¯t nÃ¡Â»â„¢i dung cÃ¡ÂºÂ§n xÃ¡Â»Â­ lÃƒÂ½
	* @param stepDate thÃ¡Â»ï¿½i Ã„â€˜iÃ¡Â»Æ’m bÃ¡ÂºÂ¯t Ã„â€˜Ã¡ÂºÂ§u thÃ¡Â»Â±c hiÃ¡Â»â€¡n xÃ¡Â»Â­ lÃƒÂ½ hÃ¡Â»â€œ sÃ†Â¡
	* @param stepNote ghi lÃ¡ÂºÂ¡i ghi chÃƒÂº cÃ¡Â»Â§a ngÃ†Â°Ã¡Â»ï¿½i xÃ¡Â»Â­ lÃƒÂ½ cuÃ¡Â»â€˜i cÃƒÂ¹ng
	* @param assignToUserId ngÃ†Â°Ã¡Â»ï¿½i chÃ¡Â»â€¹u trÃƒÂ¡ch nhiÃ¡Â»â€¡m xÃ¡Â»Â­ lÃƒÂ½
	* @param currentCondition Ã„â€˜iÃ¡Â»ï¿½u kiÃ¡Â»â€¡n hiÃ¡Â»â€¡n tÃ¡ÂºÂ¡i cÃ¡Â»Â§a hÃ¡Â»â€œ sÃ†Â¡ Ã„â€˜Ã¡Â»Æ’ xÃƒÂ©t chuyÃ¡Â»Æ’n dÃ¡Â»â€¹ch
	* @param lastStepTransitionId chuyÃ¡Â»Æ’n dÃ¡Â»â€¹ch cuÃ¡Â»â€˜i cÃƒÂ¹ng cÃ¡Â»Â§a phiÃ¡ÂºÂ¿u xÃ¡Â»Â­ lÃƒÂ½
	* @param stopRollback cÃ¡Â»ï¿½ Ã„â€˜ÃƒÂ¡nh dÃ¡ÂºÂ¥u tÃ¡ÂºÂ¡m dÃ¡Â»Â«ng viÃ¡Â»â€¡c rollback
	* @param ebPartnershipId trao Ã„â€˜Ã¡Â»â€¢i hÃ¡Â»â€œ sÃ†Â¡ hiÃ¡Â»â€¡n tÃ¡ÂºÂ¡i vÃ¡Â»â€ºi hÃ¡Â»â€¡ thÃ¡Â»â€˜ng bÃƒÂªn ngoÃƒÂ i
	* @return: thÃƒÂ´ng tin xÃ¡Â»Â­ lÃƒÂ½ hÃ¡Â»â€œ sÃ†Â¡ mÃ¡Â»â€ºi Ã„â€˜Ã†Â°Ã¡Â»Â£c cÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t
	*/
	@Override
	public org.oep.core.processmgt.model.ProcessOrder updateProcessOrder(
		long id, long organizationId, long parentProcessOrderId,
		long dossierId, long dossierProcessId, long dossierStepId,
		java.lang.String orderStatus, java.lang.String orderResume,
		java.util.Date stepDate, java.lang.String stepNote,
		long assignToUserId, java.lang.String currentCondition,
		long lastStepTransitionId, int stopRollback,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _processOrderLocalService.updateProcessOrder(id, organizationId,
			parentProcessOrderId, dossierId, dossierProcessId, dossierStepId,
			orderStatus, orderResume, stepDate, stepNote, assignToUserId,
			currentCondition, lastStepTransitionId, stopRollback, serviceContext);
	}

	@Override
	public void updateProcessOrderResources(
		org.oep.core.processmgt.model.ProcessOrder processOrder,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_processOrderLocalService.updateProcessOrderResources(processOrder,
			groupPermissions, guestPermissions, serviceContext);
	}

	@Override
	public void removeProcessOrder(
		org.oep.core.processmgt.model.ProcessOrder processOrder)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_processOrderLocalService.removeProcessOrder(processOrder);
	}

	@Override
	public void removeProcessOrder(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_processOrderLocalService.removeProcessOrder(id);
	}

	@Override
	public void addProcessOrderResources(
		org.oep.core.processmgt.model.ProcessOrder processOrder,
		boolean addGroupPermission, boolean addGuestPermission,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_processOrderLocalService.addProcessOrderResources(processOrder,
			addGroupPermission, addGuestPermission, serviceContext);
	}

	@Override
	public void addProcessOrderResources(
		org.oep.core.processmgt.model.ProcessOrder processOrder,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_processOrderLocalService.addProcessOrderResources(processOrder,
			groupPermissions, guestPermissions, serviceContext);
	}

	@Override
	public void addProcessOrderResources(long id,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_processOrderLocalService.addProcessOrderResources(id,
			groupPermissions, guestPermissions, serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ProcessOrderLocalService getWrappedProcessOrderLocalService() {
		return _processOrderLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedProcessOrderLocalService(
		ProcessOrderLocalService processOrderLocalService) {
		_processOrderLocalService = processOrderLocalService;
	}

	@Override
	public ProcessOrderLocalService getWrappedService() {
		return _processOrderLocalService;
	}

	@Override
	public void setWrappedService(
		ProcessOrderLocalService processOrderLocalService) {
		_processOrderLocalService = processOrderLocalService;
	}

	private ProcessOrderLocalService _processOrderLocalService;
}