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
 * Provides the local service utility for UserAssignment. This utility wraps
 * {@link org.oep.core.processmgt.service.impl.UserAssignmentLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author trungdk
 * @see UserAssignmentLocalService
 * @see org.oep.core.processmgt.service.base.UserAssignmentLocalServiceBaseImpl
 * @see org.oep.core.processmgt.service.impl.UserAssignmentLocalServiceImpl
 * @generated
 */
public class UserAssignmentLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.oep.core.processmgt.service.impl.UserAssignmentLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the user assignment to the database. Also notifies the appropriate model listeners.
	*
	* @param userAssignment the user assignment
	* @return the user assignment that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.processmgt.model.UserAssignment addUserAssignment(
		org.oep.core.processmgt.model.UserAssignment userAssignment)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addUserAssignment(userAssignment);
	}

	/**
	* Creates a new user assignment with the primary key. Does not add the user assignment to the database.
	*
	* @param userAssignmentId the primary key for the new user assignment
	* @return the new user assignment
	*/
	public static org.oep.core.processmgt.model.UserAssignment createUserAssignment(
		long userAssignmentId) {
		return getService().createUserAssignment(userAssignmentId);
	}

	/**
	* Deletes the user assignment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param userAssignmentId the primary key of the user assignment
	* @return the user assignment that was removed
	* @throws PortalException if a user assignment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.processmgt.model.UserAssignment deleteUserAssignment(
		long userAssignmentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteUserAssignment(userAssignmentId);
	}

	/**
	* Deletes the user assignment from the database. Also notifies the appropriate model listeners.
	*
	* @param userAssignment the user assignment
	* @return the user assignment that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.processmgt.model.UserAssignment deleteUserAssignment(
		org.oep.core.processmgt.model.UserAssignment userAssignment)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteUserAssignment(userAssignment);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.UserAssignmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.UserAssignmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static org.oep.core.processmgt.model.UserAssignment fetchUserAssignment(
		long userAssignmentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchUserAssignment(userAssignmentId);
	}

	/**
	* Returns the user assignment with the primary key.
	*
	* @param userAssignmentId the primary key of the user assignment
	* @return the user assignment
	* @throws PortalException if a user assignment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.processmgt.model.UserAssignment getUserAssignment(
		long userAssignmentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getUserAssignment(userAssignmentId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the user assignments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.processmgt.model.impl.UserAssignmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of user assignments
	* @param end the upper bound of the range of user assignments (not inclusive)
	* @return the range of user assignments
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.core.processmgt.model.UserAssignment> getUserAssignments(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getUserAssignments(start, end);
	}

	/**
	* Returns the number of user assignments.
	*
	* @return the number of user assignments
	* @throws SystemException if a system exception occurred
	*/
	public static int getUserAssignmentsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getUserAssignmentsCount();
	}

	/**
	* Updates the user assignment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param userAssignment the user assignment
	* @return the user assignment that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.core.processmgt.model.UserAssignment updateUserAssignment(
		org.oep.core.processmgt.model.UserAssignment userAssignment)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateUserAssignment(userAssignment);
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
	* ThÃƒÂªm phÃƒÂ¢n cÃƒÂ´ng mÃ¡Â»â€ºi
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param processOrderId phÃƒÂ¢n cÃƒÂ´ng xÃ¡Â»Â­ lÃƒÂ½ cho mÃ¡Â»â„¢t trÃ¡ÂºÂ¡ng thÃƒÂ¡i hÃ¡Â»â€œ sÃ†Â¡ trÃƒÂªn phiÃ¡ÂºÂ¿u chÃƒÂ­nh hoÃ¡ÂºÂ·c phÃ¡Â»Â¥
	* @param dossierStepId bÃ†Â°Ã¡Â»â€ºc xÃ¡Â»Â­ lÃƒÂ½
	* @param assignToUserId phÃƒÂ¢n cÃƒÂ´ng cho ngÃ†Â°Ã¡Â»ï¿½i dÃƒÂ¹ng
	* @return: phÃƒÂ¢n cÃƒÂ´ng mÃ¡Â»â€ºi Ã„â€˜Ã†Â°Ã¡Â»Â£c tÃ¡ÂºÂ¡o
	*/
	public static org.oep.core.processmgt.model.UserAssignment addUserAssignment(
		long processOrderId, long dossierStepId, long assignToUserId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addUserAssignment(processOrderId, dossierStepId,
			assignToUserId, serviceContext);
	}

	/**
	* CÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t thÃƒÂ´ng tin phÃƒÂ¢n cÃƒÂ´ng
	*
	* Version: OEP 2.0
	*
	* History:
	*   DATE        AUTHOR      DESCRIPTION
	*  -------------------------------------------------
	*  21-September-2015  trungdk    TÃ¡ÂºÂ¡o mÃ¡Â»â€ºi
	*
	* @param id mÃƒÂ£ thÃƒÂ´ng tin phÃƒÂ¢n cÃƒÂ´ng
	* @param processOrderId phÃƒÂ¢n cÃƒÂ´ng xÃ¡Â»Â­ lÃƒÂ½ cho mÃ¡Â»â„¢t trÃ¡ÂºÂ¡ng thÃƒÂ¡i hÃ¡Â»â€œ sÃ†Â¡ trÃƒÂªn phiÃ¡ÂºÂ¿u chÃƒÂ­nh hoÃ¡ÂºÂ·c phÃ¡Â»Â¥
	* @param dossierStepId bÃ†Â°Ã¡Â»â€ºc xÃ¡Â»Â­ lÃƒÂ½
	* @param assignToUserId phÃƒÂ¢n cÃƒÂ´ng cho ngÃ†Â°Ã¡Â»ï¿½i dÃƒÂ¹ng
	* @return: phÃƒÂ¢n cÃƒÂ´ng mÃ¡Â»â€ºi Ã„â€˜Ã†Â°Ã¡Â»Â£c cÃ¡ÂºÂ­p nhÃ¡ÂºÂ­t
	*/
	public static org.oep.core.processmgt.model.UserAssignment updateUserAssignment(
		long id, long processOrderId, long dossierStepId, long assignToUserId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateUserAssignment(id, processOrderId, dossierStepId,
			assignToUserId, serviceContext);
	}

	public static void updateUserAssignmentResources(
		org.oep.core.processmgt.model.UserAssignment userAssignment,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.updateUserAssignmentResources(userAssignment, groupPermissions,
			guestPermissions, serviceContext);
	}

	public static void removeUserAssignment(
		org.oep.core.processmgt.model.UserAssignment userAssignment)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().removeUserAssignment(userAssignment);
	}

	public static void removeUserAssignment(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().removeUserAssignment(id);
	}

	public static void addUserAssignmentResources(
		org.oep.core.processmgt.model.UserAssignment userAssignment,
		boolean addGroupPermission, boolean addGuestPermission,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addUserAssignmentResources(userAssignment, addGroupPermission,
			addGuestPermission, serviceContext);
	}

	public static void addUserAssignmentResources(
		org.oep.core.processmgt.model.UserAssignment userAssignment,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addUserAssignmentResources(userAssignment, groupPermissions,
			guestPermissions, serviceContext);
	}

	public static void addUserAssignmentResources(long id,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addUserAssignmentResources(id, groupPermissions, guestPermissions,
			serviceContext);
	}

	public static void clearService() {
		_service = null;
	}

	public static UserAssignmentLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					UserAssignmentLocalService.class.getName());

			if (invokableLocalService instanceof UserAssignmentLocalService) {
				_service = (UserAssignmentLocalService)invokableLocalService;
			}
			else {
				_service = new UserAssignmentLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(UserAssignmentLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(UserAssignmentLocalService service) {
	}

	private static UserAssignmentLocalService _service;
}