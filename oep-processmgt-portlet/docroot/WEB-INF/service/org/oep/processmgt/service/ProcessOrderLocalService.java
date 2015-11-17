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

package org.oep.processmgt.service;

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
 * Provides the local service interface for ProcessOrder. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author trungdk
 * @see ProcessOrderLocalServiceUtil
 * @see org.oep.processmgt.service.base.ProcessOrderLocalServiceBaseImpl
 * @see org.oep.processmgt.service.impl.ProcessOrderLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface ProcessOrderLocalService extends BaseLocalService,
	InvokableLocalService, PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ProcessOrderLocalServiceUtil} to access the process order local service. Add custom service methods to {@link org.oep.processmgt.service.impl.ProcessOrderLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the process order to the database. Also notifies the appropriate model listeners.
	*
	* @param processOrder the process order
	* @return the process order that was added
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public org.oep.processmgt.model.ProcessOrder addProcessOrder(
		org.oep.processmgt.model.ProcessOrder processOrder)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new process order with the primary key. Does not add the process order to the database.
	*
	* @param processOrderId the primary key for the new process order
	* @return the new process order
	*/
	public org.oep.processmgt.model.ProcessOrder createProcessOrder(
		long processOrderId);

	/**
	* Deletes the process order with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param processOrderId the primary key of the process order
	* @return the process order that was removed
	* @throws PortalException if a process order with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.DELETE)
	public org.oep.processmgt.model.ProcessOrder deleteProcessOrder(
		long processOrderId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the process order from the database. Also notifies the appropriate model listeners.
	*
	* @param processOrder the process order
	* @return the process order that was removed
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.DELETE)
	public org.oep.processmgt.model.ProcessOrder deleteProcessOrder(
		org.oep.processmgt.model.ProcessOrder processOrder)
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.processmgt.model.impl.ProcessOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.processmgt.model.impl.ProcessOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public org.oep.processmgt.model.ProcessOrder fetchProcessOrder(
		long processOrderId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the process order with the matching UUID and company.
	*
	* @param uuid the process order's UUID
	* @param companyId the primary key of the company
	* @return the matching process order, or <code>null</code> if a matching process order could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public org.oep.processmgt.model.ProcessOrder fetchProcessOrderByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the process order matching the UUID and group.
	*
	* @param uuid the process order's UUID
	* @param groupId the primary key of the group
	* @return the matching process order, or <code>null</code> if a matching process order could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public org.oep.processmgt.model.ProcessOrder fetchProcessOrderByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the process order with the primary key.
	*
	* @param processOrderId the primary key of the process order
	* @return the process order
	* @throws PortalException if a process order with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public org.oep.processmgt.model.ProcessOrder getProcessOrder(
		long processOrderId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the process order with the matching UUID and company.
	*
	* @param uuid the process order's UUID
	* @param companyId the primary key of the company
	* @return the matching process order
	* @throws PortalException if a matching process order could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public org.oep.processmgt.model.ProcessOrder getProcessOrderByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the process order matching the UUID and group.
	*
	* @param uuid the process order's UUID
	* @param groupId the primary key of the group
	* @return the matching process order
	* @throws PortalException if a matching process order could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public org.oep.processmgt.model.ProcessOrder getProcessOrderByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the process orders.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.processmgt.model.impl.ProcessOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of process orders
	* @param end the upper bound of the range of process orders (not inclusive)
	* @return the range of process orders
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<org.oep.processmgt.model.ProcessOrder> getProcessOrders(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of process orders.
	*
	* @return the number of process orders
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getProcessOrdersCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the process order in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param processOrder the process order
	* @return the process order that was updated
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public org.oep.processmgt.model.ProcessOrder updateProcessOrder(
		org.oep.processmgt.model.ProcessOrder processOrder)
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
	* ThÃªm phiáº¿u xá»­ lÃ½ há»“ sÆ¡ má»›i
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    Táº¡o má»›i
	*
	* @param organizationId tá»• chá»©c thá»±c hiá»‡n xá»­ lÃ½ há»“ sÆ¡
	* @param parentProcessOrderId cÃ³ pháº£i lÃ  phiáº¿u xá»­ lÃ½ cha
	* @param dossierId há»“ sÆ¡ cáº§n xá»­ lÃ½
	* @param dossierProcessId náº±m trong quy trÃ¬nh xá»­ lÃ½ há»“ sÆ¡ nÃ o
	* @param dossierStepId Ä‘ang xá»­ lÃ½ táº¡i bÆ°á»›c nÃ o (0 lÃ  Ä‘Ã£ káº¿t thÃºc xá»­ lÃ½)
	* @param orderStatus tráº¡ng thÃ¡i hiá»‡n táº¡i cá»§a phiáº¿u xá»­ lÃ½
	* @param orderResume tÃ³m táº¯t ná»™i dung cáº§n xá»­ lÃ½
	* @param stepDate thá»�i Ä‘iá»ƒm báº¯t Ä‘áº§u thá»±c hiá»‡n xá»­ lÃ½ há»“ sÆ¡
	* @param stepNote ghi láº¡i ghi chÃº cá»§a ngÆ°á»�i xá»­ lÃ½ cuá»‘i cÃ¹ng
	* @param assignToUserId ngÆ°á»�i chá»‹u trÃ¡ch nhiá»‡m xá»­ lÃ½
	* @param currentCondition Ä‘iá»�u kiá»‡n hiá»‡n táº¡i cá»§a há»“ sÆ¡ Ä‘á»ƒ xÃ©t chuyá»ƒn dá»‹ch
	* @param lastStepTransitionId chuyá»ƒn dá»‹ch cuá»‘i cÃ¹ng cá»§a phiáº¿u xá»­ lÃ½
	* @param stopRollback cá»� Ä‘Ã¡nh dáº¥u táº¡m dá»«ng viá»‡c rollback
	* @param ebPartnershipId trao Ä‘á»•i há»“ sÆ¡ hiá»‡n táº¡i vá»›i há»‡ thá»‘ng bÃªn ngoÃ i
	* @return: thÃ´ng tin xá»­ lÃ½ há»“ sÆ¡ má»›i Ä‘Æ°á»£c táº¡o
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	@com.liferay.portal.kernel.transaction.Transactional
	public org.oep.processmgt.model.ProcessOrder addProcessOrder(
		long organizationId, long parentProcessOrderId, long dossierId,
		long dossierProcessId, long dossierStepId,
		java.lang.String orderStatus, java.lang.String orderResume,
		java.util.Date stepDate, java.lang.String stepNote,
		long assignToUserId, java.lang.String currentCondition,
		long lastStepTransitionId, int stopRollback,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Cáº­p nháº­t phiáº¿u xá»­ lÃ½ há»“ sÆ¡ má»›i
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    Táº¡o má»›i
	*
	* @param organizationId tá»• chá»©c thá»±c hiá»‡n xá»­ lÃ½ há»“ sÆ¡
	* @param parentProcessOrderId cÃ³ pháº£i lÃ  phiáº¿u xá»­ lÃ½ cha
	* @param dossierId há»“ sÆ¡ cáº§n xá»­ lÃ½
	* @param dossierProcessId náº±m trong quy trÃ¬nh xá»­ lÃ½ há»“ sÆ¡ nÃ o
	* @param dossierStepId Ä‘ang xá»­ lÃ½ táº¡i bÆ°á»›c nÃ o (0 lÃ  Ä‘Ã£ káº¿t thÃºc xá»­ lÃ½)
	* @param orderStatus tráº¡ng thÃ¡i hiá»‡n táº¡i cá»§a phiáº¿u xá»­ lÃ½
	* @param orderResume tÃ³m táº¯t ná»™i dung cáº§n xá»­ lÃ½
	* @param stepDate thá»�i Ä‘iá»ƒm báº¯t Ä‘áº§u thá»±c hiá»‡n xá»­ lÃ½ há»“ sÆ¡
	* @param stepNote ghi láº¡i ghi chÃº cá»§a ngÆ°á»�i xá»­ lÃ½ cuá»‘i cÃ¹ng
	* @param assignToUserId ngÆ°á»�i chá»‹u trÃ¡ch nhiá»‡m xá»­ lÃ½
	* @param currentCondition Ä‘iá»�u kiá»‡n hiá»‡n táº¡i cá»§a há»“ sÆ¡ Ä‘á»ƒ xÃ©t chuyá»ƒn dá»‹ch
	* @param lastStepTransitionId chuyá»ƒn dá»‹ch cuá»‘i cÃ¹ng cá»§a phiáº¿u xá»­ lÃ½
	* @param stopRollback cá»� Ä‘Ã¡nh dáº¥u táº¡m dá»«ng viá»‡c rollback
	* @param ebPartnershipId trao Ä‘á»•i há»“ sÆ¡ hiá»‡n táº¡i vá»›i há»‡ thá»‘ng bÃªn ngoÃ i
	* @return: thÃ´ng tin xá»­ lÃ½ há»“ sÆ¡ má»›i Ä‘Æ°á»£c cáº­p nháº­t
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public org.oep.processmgt.model.ProcessOrder updateProcessOrder(long id,
		long organizationId, long parentProcessOrderId, long dossierId,
		long dossierProcessId, long dossierStepId,
		java.lang.String orderStatus, java.lang.String orderResume,
		java.util.Date stepDate, java.lang.String stepNote,
		long assignToUserId, java.lang.String currentCondition,
		long lastStepTransitionId, int stopRollback,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public void updateProcessOrderResources(
		org.oep.processmgt.model.ProcessOrder processOrder,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public void removeProcessOrder(
		org.oep.processmgt.model.ProcessOrder processOrder)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public void removeProcessOrder(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public void addProcessOrderResources(
		org.oep.processmgt.model.ProcessOrder processOrder,
		boolean addGroupPermission, boolean addGuestPermission,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public void addProcessOrderResources(
		org.oep.processmgt.model.ProcessOrder processOrder,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public void addProcessOrderResources(long id,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<org.oep.processmgt.model.ProcessOrder> findAllCanAutoCondition(
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public long countByWaitingProcessed(long userId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<org.oep.processmgt.model.ProcessOrder> findByWaitingProcessed(
		long userId, int startIndex, int endIndex,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<org.oep.processmgt.model.ProcessOrder> findAllCanAutoCondition(
		long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;
}