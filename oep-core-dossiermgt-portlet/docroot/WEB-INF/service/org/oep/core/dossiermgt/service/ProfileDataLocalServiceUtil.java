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
 * Provides the local service utility for ProfileData. This utility wraps
 * {@link org.oep.core.dossiermgt.service.impl.ProfileDataLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author trungdk
 * @see ProfileDataLocalService
 * @see org.oep.core.dossiermgt.service.base.ProfileDataLocalServiceBaseImpl
 * @see org.oep.core.dossiermgt.service.impl.ProfileDataLocalServiceImpl
 * @generated
 */
public class ProfileDataLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.oep.core.dossiermgt.service.impl.ProfileDataLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the profile data to the database. Also notifies the appropriate model listeners.
	*
	* @param profileData the profile data
	* @return the profile data that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.ProfileData addProfileData(
		org.oep.core.dossiermgt.model.ProfileData profileData)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addProfileData(profileData);
	}

	/**
	* Creates a new profile data with the primary key. Does not add the profile data to the database.
	*
	* @param profileDataId the primary key for the new profile data
	* @return the new profile data
	*/
	public static org.oep.core.dossiermgt.model.ProfileData createProfileData(
		long profileDataId) {
		return getService().createProfileData(profileDataId);
	}

	/**
	* Deletes the profile data with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param profileDataId the primary key of the profile data
	* @return the profile data that was removed
	* @throws PortalException if a profile data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.ProfileData deleteProfileData(
		long profileDataId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteProfileData(profileDataId);
	}

	/**
	* Deletes the profile data from the database. Also notifies the appropriate model listeners.
	*
	* @param profileData the profile data
	* @return the profile data that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.ProfileData deleteProfileData(
		org.oep.core.dossiermgt.model.ProfileData profileData)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteProfileData(profileData);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.ProfileDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.ProfileDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static org.oep.core.dossiermgt.model.ProfileData fetchProfileData(
		long profileDataId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchProfileData(profileDataId);
	}

	/**
	* Returns the profile data with the primary key.
	*
	* @param profileDataId the primary key of the profile data
	* @return the profile data
	* @throws PortalException if a profile data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.ProfileData getProfileData(
		long profileDataId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getProfileData(profileDataId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the profile datas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.ProfileDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of profile datas
	* @param end the upper bound of the range of profile datas (not inclusive)
	* @return the range of profile datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.dossiermgt.model.ProfileData> getProfileDatas(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getProfileDatas(start, end);
	}

	/**
	* Returns the number of profile datas.
	*
	* @return the number of profile datas
	* @throws SystemException if a system exception occurred
	*/
	public static int getProfileDatasCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getProfileDatasCount();
	}

	/**
	* Updates the profile data in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param profileData the profile data
	* @return the profile data that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.dossiermgt.model.ProfileData updateProfileData(
		org.oep.core.dossiermgt.model.ProfileData profileData)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateProfileData(profileData);
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

	public static ProfileDataLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					ProfileDataLocalService.class.getName());

			if (invokableLocalService instanceof ProfileDataLocalService) {
				_service = (ProfileDataLocalService)invokableLocalService;
			}
			else {
				_service = new ProfileDataLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(ProfileDataLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(ProfileDataLocalService service) {
	}

	private static ProfileDataLocalService _service;
}