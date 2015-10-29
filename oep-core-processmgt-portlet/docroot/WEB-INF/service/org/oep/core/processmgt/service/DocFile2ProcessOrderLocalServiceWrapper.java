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
 * Provides a wrapper for {@link DocFile2ProcessOrderLocalService}.
 *
 * @author trungdk
 * @see DocFile2ProcessOrderLocalService
 * @generated
 */
public class DocFile2ProcessOrderLocalServiceWrapper
	implements DocFile2ProcessOrderLocalService,
		ServiceWrapper<DocFile2ProcessOrderLocalService> {
	public DocFile2ProcessOrderLocalServiceWrapper(
		DocFile2ProcessOrderLocalService docFile2ProcessOrderLocalService) {
		_docFile2ProcessOrderLocalService = docFile2ProcessOrderLocalService;
	}

	/**
	* Adds the doc file2 process order to the database. Also notifies the appropriate model listeners.
	*
	* @param docFile2ProcessOrder the doc file2 process order
	* @return the doc file2 process order that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.processmgt.model.DocFile2ProcessOrder addDocFile2ProcessOrder(
		org.oep.core.processmgt.model.DocFile2ProcessOrder docFile2ProcessOrder)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _docFile2ProcessOrderLocalService.addDocFile2ProcessOrder(docFile2ProcessOrder);
	}

	/**
	* Creates a new doc file2 process order with the primary key. Does not add the doc file2 process order to the database.
	*
	* @param docFileId the primary key for the new doc file2 process order
	* @return the new doc file2 process order
	*/
	@Override
	public org.oep.core.processmgt.model.DocFile2ProcessOrder createDocFile2ProcessOrder(
		long docFileId) {
		return _docFile2ProcessOrderLocalService.createDocFile2ProcessOrder(docFileId);
	}

	/**
	* Deletes the doc file2 process order with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param docFileId the primary key of the doc file2 process order
	* @return the doc file2 process order that was removed
	* @throws PortalException if a doc file2 process order with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.processmgt.model.DocFile2ProcessOrder deleteDocFile2ProcessOrder(
		long docFileId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _docFile2ProcessOrderLocalService.deleteDocFile2ProcessOrder(docFileId);
	}

	/**
	* Deletes the doc file2 process order from the database. Also notifies the appropriate model listeners.
	*
	* @param docFile2ProcessOrder the doc file2 process order
	* @return the doc file2 process order that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.processmgt.model.DocFile2ProcessOrder deleteDocFile2ProcessOrder(
		org.oep.core.processmgt.model.DocFile2ProcessOrder docFile2ProcessOrder)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _docFile2ProcessOrderLocalService.deleteDocFile2ProcessOrder(docFile2ProcessOrder);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _docFile2ProcessOrderLocalService.dynamicQuery();
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
		return _docFile2ProcessOrderLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.DocFile2ProcessOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _docFile2ProcessOrderLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.DocFile2ProcessOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _docFile2ProcessOrderLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
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
		return _docFile2ProcessOrderLocalService.dynamicQueryCount(dynamicQuery);
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
		return _docFile2ProcessOrderLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public org.oep.core.processmgt.model.DocFile2ProcessOrder fetchDocFile2ProcessOrder(
		long docFileId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _docFile2ProcessOrderLocalService.fetchDocFile2ProcessOrder(docFileId);
	}

	/**
	* Returns the doc file2 process order with the primary key.
	*
	* @param docFileId the primary key of the doc file2 process order
	* @return the doc file2 process order
	* @throws PortalException if a doc file2 process order with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.processmgt.model.DocFile2ProcessOrder getDocFile2ProcessOrder(
		long docFileId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _docFile2ProcessOrderLocalService.getDocFile2ProcessOrder(docFileId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _docFile2ProcessOrderLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the doc file2 process orders.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.DocFile2ProcessOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of doc file2 process orders
	* @param end the upper bound of the range of doc file2 process orders (not inclusive)
	* @return the range of doc file2 process orders
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.oep.core.processmgt.model.DocFile2ProcessOrder> getDocFile2ProcessOrders(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _docFile2ProcessOrderLocalService.getDocFile2ProcessOrders(start,
			end);
	}

	/**
	* Returns the number of doc file2 process orders.
	*
	* @return the number of doc file2 process orders
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDocFile2ProcessOrdersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _docFile2ProcessOrderLocalService.getDocFile2ProcessOrdersCount();
	}

	/**
	* Updates the doc file2 process order in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param docFile2ProcessOrder the doc file2 process order
	* @return the doc file2 process order that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.core.processmgt.model.DocFile2ProcessOrder updateDocFile2ProcessOrder(
		org.oep.core.processmgt.model.DocFile2ProcessOrder docFile2ProcessOrder)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _docFile2ProcessOrderLocalService.updateDocFile2ProcessOrder(docFile2ProcessOrder);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _docFile2ProcessOrderLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_docFile2ProcessOrderLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _docFile2ProcessOrderLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	* ThÃƒÂªm quan hÃ¡Â»â€¡ tÃƒÂ i liÃ¡Â»â€¡u hÃ¡Â»â€œ sÃ†Â¡ vÃ¡Â»â€ºi thÃƒÂ´ng tin xÃ¡Â»Â­ lÃƒÂ½ hÃ¡Â»â€œ sÃ†Â¡
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param docFileId mÃƒÂ£ tÃƒÂ i liÃ¡Â»â€¡u
	* @param processOrderId mÃƒÂ£ thÃƒÂ´ng tin xÃ¡Â»Â­ lÃƒÂ½ hÃ¡Â»â€œ sÃ†Â¡
	* @return: quan hÃ¡Â»â€¡ giÃ¡Â»Â¯a quan hÃ¡Â»â€¡ thÃ¡Â»Â§ tÃ¡Â»Â¥c hÃƒÂ nh chÃƒÂ­nh vÃ¡Â»â€ºi vai trÃƒÂ²
	*/
	@Override
	public org.oep.core.processmgt.model.DocFile2ProcessOrder addDocFile2ProcessOrder(
		long docFileId, long processOrderId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _docFile2ProcessOrderLocalService.addDocFile2ProcessOrder(docFileId,
			processOrderId, serviceContext);
	}

	@Override
	public void removeDocFile2ProcessOrder(
		org.oep.core.processmgt.model.DocFile2ProcessOrder docFile2ProcessOrder)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_docFile2ProcessOrderLocalService.removeDocFile2ProcessOrder(docFile2ProcessOrder);
	}

	@Override
	public void removeDocFile2ProcessOrder(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_docFile2ProcessOrderLocalService.removeDocFile2ProcessOrder(id);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DocFile2ProcessOrderLocalService getWrappedDocFile2ProcessOrderLocalService() {
		return _docFile2ProcessOrderLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDocFile2ProcessOrderLocalService(
		DocFile2ProcessOrderLocalService docFile2ProcessOrderLocalService) {
		_docFile2ProcessOrderLocalService = docFile2ProcessOrderLocalService;
	}

	@Override
	public DocFile2ProcessOrderLocalService getWrappedService() {
		return _docFile2ProcessOrderLocalService;
	}

	@Override
	public void setWrappedService(
		DocFile2ProcessOrderLocalService docFile2ProcessOrderLocalService) {
		_docFile2ProcessOrderLocalService = docFile2ProcessOrderLocalService;
	}

	private DocFile2ProcessOrderLocalService _docFile2ProcessOrderLocalService;
}