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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for DocFile2ProcessOrder. This utility wraps
 * {@link org.oep.core.processmgt.service.impl.DocFile2ProcessOrderLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author trungdk
 * @see DocFile2ProcessOrderLocalService
 * @see org.oep.core.processmgt.service.base.DocFile2ProcessOrderLocalServiceBaseImpl
 * @see org.oep.core.processmgt.service.impl.DocFile2ProcessOrderLocalServiceImpl
 * @generated
 */
public class DocFile2ProcessOrderLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.oep.core.processmgt.service.impl.DocFile2ProcessOrderLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the doc file2 process order to the database. Also notifies the appropriate model listeners.
	*
	* @param docFile2ProcessOrder the doc file2 process order
	* @return the doc file2 process order that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.processmgt.model.DocFile2ProcessOrder addDocFile2ProcessOrder(
		org.oep.core.processmgt.model.DocFile2ProcessOrder docFile2ProcessOrder)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addDocFile2ProcessOrder(docFile2ProcessOrder);
	}

	/**
	* Creates a new doc file2 process order with the primary key. Does not add the doc file2 process order to the database.
	*
	* @param docFileId the primary key for the new doc file2 process order
	* @return the new doc file2 process order
	*/
	public static org.oep.core.processmgt.model.DocFile2ProcessOrder createDocFile2ProcessOrder(
		long docFileId) {
		return getService().createDocFile2ProcessOrder(docFileId);
	}

	/**
	* Deletes the doc file2 process order with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param docFileId the primary key of the doc file2 process order
	* @return the doc file2 process order that was removed
	* @throws PortalException if a doc file2 process order with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.processmgt.model.DocFile2ProcessOrder deleteDocFile2ProcessOrder(
		long docFileId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDocFile2ProcessOrder(docFileId);
	}

	/**
	* Deletes the doc file2 process order from the database. Also notifies the appropriate model listeners.
	*
	* @param docFile2ProcessOrder the doc file2 process order
	* @return the doc file2 process order that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.processmgt.model.DocFile2ProcessOrder deleteDocFile2ProcessOrder(
		org.oep.core.processmgt.model.DocFile2ProcessOrder docFile2ProcessOrder)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDocFile2ProcessOrder(docFile2ProcessOrder);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.DocFile2ProcessOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static org.oep.core.processmgt.model.DocFile2ProcessOrder fetchDocFile2ProcessOrder(
		long docFileId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchDocFile2ProcessOrder(docFileId);
	}

	/**
	* Returns the doc file2 process order with the primary key.
	*
	* @param docFileId the primary key of the doc file2 process order
	* @return the doc file2 process order
	* @throws PortalException if a doc file2 process order with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.processmgt.model.DocFile2ProcessOrder getDocFile2ProcessOrder(
		long docFileId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDocFile2ProcessOrder(docFileId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<org.oep.core.processmgt.model.DocFile2ProcessOrder> getDocFile2ProcessOrders(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDocFile2ProcessOrders(start, end);
	}

	/**
	* Returns the number of doc file2 process orders.
	*
	* @return the number of doc file2 process orders
	* @throws SystemException if a system exception occurred
	*/
	public static int getDocFile2ProcessOrdersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDocFile2ProcessOrdersCount();
	}

	/**
	* Updates the doc file2 process order in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param docFile2ProcessOrder the doc file2 process order
	* @return the doc file2 process order that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.processmgt.model.DocFile2ProcessOrder updateDocFile2ProcessOrder(
		org.oep.core.processmgt.model.DocFile2ProcessOrder docFile2ProcessOrder)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDocFile2ProcessOrder(docFile2ProcessOrder);
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
	public static org.oep.core.processmgt.model.DocFile2ProcessOrder addDocFile2ProcessOrder(
		long docFileId, long processOrderId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addDocFile2ProcessOrder(docFileId, processOrderId,
			serviceContext);
	}

	public static void removeDocFile2ProcessOrder(
		org.oep.core.processmgt.model.DocFile2ProcessOrder docFile2ProcessOrder)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().removeDocFile2ProcessOrder(docFile2ProcessOrder);
	}

	public static void removeDocFile2ProcessOrder(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().removeDocFile2ProcessOrder(id);
	}

	public static void clearService() {
		_service = null;
	}

	public static DocFile2ProcessOrderLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DocFile2ProcessOrderLocalService.class.getName());

			if (invokableLocalService instanceof DocFile2ProcessOrderLocalService) {
				_service = (DocFile2ProcessOrderLocalService)invokableLocalService;
			}
			else {
				_service = new DocFile2ProcessOrderLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(DocFile2ProcessOrderLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(DocFile2ProcessOrderLocalService service) {
	}

	private static DocFile2ProcessOrderLocalService _service;
}