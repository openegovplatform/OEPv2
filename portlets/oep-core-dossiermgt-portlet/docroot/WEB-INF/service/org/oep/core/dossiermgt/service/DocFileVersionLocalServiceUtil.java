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

package org.oep.core.dossiermgt.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for DocFileVersion. This utility wraps
 * {@link org.oep.core.dossiermgt.service.impl.DocFileVersionLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author trungdk
 * @see DocFileVersionLocalService
 * @see org.oep.core.dossiermgt.service.base.DocFileVersionLocalServiceBaseImpl
 * @see org.oep.core.dossiermgt.service.impl.DocFileVersionLocalServiceImpl
 * @generated
 */
public class DocFileVersionLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.oep.core.dossiermgt.service.impl.DocFileVersionLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the doc file version to the database. Also notifies the appropriate model listeners.
	*
	* @param docFileVersion the doc file version
	* @return the doc file version that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DocFileVersion addDocFileVersion(
		org.oep.core.dossiermgt.model.DocFileVersion docFileVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addDocFileVersion(docFileVersion);
	}

	/**
	* Creates a new doc file version with the primary key. Does not add the doc file version to the database.
	*
	* @param docFileVersionId the primary key for the new doc file version
	* @return the new doc file version
	*/
	public static org.oep.core.dossiermgt.model.DocFileVersion createDocFileVersion(
		long docFileVersionId) {
		return getService().createDocFileVersion(docFileVersionId);
	}

	/**
	* Deletes the doc file version with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param docFileVersionId the primary key of the doc file version
	* @return the doc file version that was removed
	* @throws PortalException if a doc file version with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DocFileVersion deleteDocFileVersion(
		long docFileVersionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDocFileVersion(docFileVersionId);
	}

	/**
	* Deletes the doc file version from the database. Also notifies the appropriate model listeners.
	*
	* @param docFileVersion the doc file version
	* @return the doc file version that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DocFileVersion deleteDocFileVersion(
		org.oep.core.dossiermgt.model.DocFileVersion docFileVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDocFileVersion(docFileVersion);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DocFileVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DocFileVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static org.oep.core.dossiermgt.model.DocFileVersion fetchDocFileVersion(
		long docFileVersionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchDocFileVersion(docFileVersionId);
	}

	/**
	* Returns the doc file version with the matching UUID and company.
	*
	* @param uuid the doc file version's UUID
	* @param companyId the primary key of the company
	* @return the matching doc file version, or <code>null</code> if a matching doc file version could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DocFileVersion fetchDocFileVersionByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .fetchDocFileVersionByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the doc file version matching the UUID and group.
	*
	* @param uuid the doc file version's UUID
	* @param groupId the primary key of the group
	* @return the matching doc file version, or <code>null</code> if a matching doc file version could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DocFileVersion fetchDocFileVersionByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchDocFileVersionByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the doc file version with the primary key.
	*
	* @param docFileVersionId the primary key of the doc file version
	* @return the doc file version
	* @throws PortalException if a doc file version with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DocFileVersion getDocFileVersion(
		long docFileVersionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDocFileVersion(docFileVersionId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the doc file version with the matching UUID and company.
	*
	* @param uuid the doc file version's UUID
	* @param companyId the primary key of the company
	* @return the matching doc file version
	* @throws PortalException if a matching doc file version could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DocFileVersion getDocFileVersionByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDocFileVersionByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the doc file version matching the UUID and group.
	*
	* @param uuid the doc file version's UUID
	* @param groupId the primary key of the group
	* @return the matching doc file version
	* @throws PortalException if a matching doc file version could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DocFileVersion getDocFileVersionByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDocFileVersionByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns a range of all the doc file versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.DocFileVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of doc file versions
	* @param end the upper bound of the range of doc file versions (not inclusive)
	* @return the range of doc file versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.DocFileVersion> getDocFileVersions(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDocFileVersions(start, end);
	}

	/**
	* Returns the number of doc file versions.
	*
	* @return the number of doc file versions
	* @throws SystemException if a system exception occurred
	*/
	public static int getDocFileVersionsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDocFileVersionsCount();
	}

	/**
	* Updates the doc file version in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param docFileVersion the doc file version
	* @return the doc file version that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.DocFileVersion updateDocFileVersion(
		org.oep.core.dossiermgt.model.DocFileVersion docFileVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDocFileVersion(docFileVersion);
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

	public static void clearService() {
		_service = null;
	}

	public static DocFileVersionLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DocFileVersionLocalService.class.getName());

			if (invokableLocalService instanceof DocFileVersionLocalService) {
				_service = (DocFileVersionLocalService)invokableLocalService;
			}
			else {
				_service = new DocFileVersionLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(DocFileVersionLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(DocFileVersionLocalService service) {
	}

	private static DocFileVersionLocalService _service;
}