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

package org.oep.usermgt.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for JobPos. This utility wraps
 * {@link org.oep.usermgt.service.impl.JobPosLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author NQMINH
 * @see JobPosLocalService
 * @see org.oep.usermgt.service.base.JobPosLocalServiceBaseImpl
 * @see org.oep.usermgt.service.impl.JobPosLocalServiceImpl
 * @generated
 */
public class JobPosLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.oep.usermgt.service.impl.JobPosLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the Job Pos to the database. Also notifies the appropriate model listeners.
	*
	* @param jobPos the Job Pos
	* @return the Job Pos that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.JobPos addJobPos(
		org.oep.usermgt.model.JobPos jobPos)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addJobPos(jobPos);
	}

	/**
	* Creates a new Job Pos with the primary key. Does not add the Job Pos to the database.
	*
	* @param jobPosId the primary key for the new Job Pos
	* @return the new Job Pos
	*/
	public static org.oep.usermgt.model.JobPos createJobPos(long jobPosId) {
		return getService().createJobPos(jobPosId);
	}

	/**
	* Deletes the Job Pos with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param jobPosId the primary key of the Job Pos
	* @return the Job Pos that was removed
	* @throws PortalException if a Job Pos with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.JobPos deleteJobPos(long jobPosId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteJobPos(jobPosId);
	}

	/**
	* Deletes the Job Pos from the database. Also notifies the appropriate model listeners.
	*
	* @param jobPos the Job Pos
	* @return the Job Pos that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.JobPos deleteJobPos(
		org.oep.usermgt.model.JobPos jobPos)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteJobPos(jobPos);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static org.oep.usermgt.model.JobPos fetchJobPos(long jobPosId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchJobPos(jobPosId);
	}

	/**
	* Returns the Job Pos with the primary key.
	*
	* @param jobPosId the primary key of the Job Pos
	* @return the Job Pos
	* @throws PortalException if a Job Pos with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.JobPos getJobPos(long jobPosId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getJobPos(jobPosId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the Job Poses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.usermgt.model.impl.JobPosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Job Poses
	* @param end the upper bound of the range of Job Poses (not inclusive)
	* @return the range of Job Poses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.JobPos> getJobPoses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getJobPoses(start, end);
	}

	/**
	* Returns the number of Job Poses.
	*
	* @return the number of Job Poses
	* @throws SystemException if a system exception occurred
	*/
	public static int getJobPosesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getJobPosesCount();
	}

	/**
	* Updates the Job Pos in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param jobPos the Job Pos
	* @return the Job Pos that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.oep.usermgt.model.JobPos updateJobPos(
		org.oep.usermgt.model.JobPos jobPos)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateJobPos(jobPos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addEmployeeJobPos(long employeeId, long jobPosId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addEmployeeJobPos(employeeId, jobPosId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addEmployeeJobPos(long employeeId,
		org.oep.usermgt.model.JobPos jobPos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addEmployeeJobPos(employeeId, jobPos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addEmployeeJobPoses(long employeeId, long[] jobPosIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addEmployeeJobPoses(employeeId, jobPosIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addEmployeeJobPoses(long employeeId,
		java.util.List<org.oep.usermgt.model.JobPos> JobPoses)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addEmployeeJobPoses(employeeId, JobPoses);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void clearEmployeeJobPoses(long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().clearEmployeeJobPoses(employeeId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteEmployeeJobPos(long employeeId, long jobPosId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteEmployeeJobPos(employeeId, jobPosId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteEmployeeJobPos(long employeeId,
		org.oep.usermgt.model.JobPos jobPos)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteEmployeeJobPos(employeeId, jobPos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteEmployeeJobPoses(long employeeId, long[] jobPosIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteEmployeeJobPoses(employeeId, jobPosIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteEmployeeJobPoses(long employeeId,
		java.util.List<org.oep.usermgt.model.JobPos> JobPoses)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteEmployeeJobPoses(employeeId, JobPoses);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.JobPos> getEmployeeJobPoses(
		long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getEmployeeJobPoses(employeeId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.JobPos> getEmployeeJobPoses(
		long employeeId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getEmployeeJobPoses(employeeId, start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.oep.usermgt.model.JobPos> getEmployeeJobPoses(
		long employeeId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getEmployeeJobPoses(employeeId, start, end,
			orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static int getEmployeeJobPosesCount(long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getEmployeeJobPosesCount(employeeId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasEmployeeJobPos(long employeeId, long jobPosId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().hasEmployeeJobPos(employeeId, jobPosId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasEmployeeJobPoses(long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().hasEmployeeJobPoses(employeeId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void setEmployeeJobPoses(long employeeId, long[] jobPosIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().setEmployeeJobPoses(employeeId, jobPosIds);
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

	public static org.oep.usermgt.model.JobPos addJobPos(
		java.lang.String title, java.lang.String positionCatNo,
		long workingUnitId, int leader,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addJobPos(title, positionCatNo, workingUnitId, leader,
			serviceContext);
	}

	public static org.oep.usermgt.model.JobPos updateJobPos(long jobPosId,
		java.lang.String title, java.lang.String positionCatNo,
		long workingUnitId, int leader,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateJobPos(jobPosId, title, positionCatNo, workingUnitId,
			leader, serviceContext);
	}

	public static org.oep.usermgt.model.JobPos saveJobPos(
		org.oep.usermgt.model.JobPos jobPos,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().saveJobPos(jobPos, serviceContext);
	}

	public static void updateJobPosResources(
		org.oep.usermgt.model.JobPos jobPos,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.updateJobPosResources(jobPos, groupPermissions, guestPermissions,
			serviceContext);
	}

	public static void removeJobPos(org.oep.usermgt.model.JobPos jobPos)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().removeJobPos(jobPos);
	}

	public static void removeJobPos(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().removeJobPos(id);
	}

	public static void addJobPosResources(org.oep.usermgt.model.JobPos jobPos,
		boolean addGroupPermission, boolean addGuestPermission,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addJobPosResources(jobPos, addGroupPermission, addGuestPermission,
			serviceContext);
	}

	public static void addJobPosResources(org.oep.usermgt.model.JobPos jobPos,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addJobPosResources(jobPos, groupPermissions, guestPermissions,
			serviceContext);
	}

	public static void addJobPosResources(long id,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addJobPosResources(id, groupPermissions, guestPermissions,
			serviceContext);
	}

	public static int countJobPosByWorkingUnit(long workingUnitId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().countJobPosByWorkingUnit(workingUnitId);
	}

	public static java.util.List<org.oep.usermgt.model.JobPos> getByWorkingUnit(
		long workingUnitId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getByWorkingUnit(workingUnitId);
	}

	public static java.util.List<org.oep.usermgt.model.JobPos> getByWorkingUnit(
		long workingUnitId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getByWorkingUnit(workingUnitId, start, end);
	}

	public static int countJobPosByWorkingUniLeadert(long workingUnitId,
		int leader)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().countJobPosByWorkingUniLeadert(workingUnitId, leader);
	}

	public static java.util.List<org.oep.usermgt.model.JobPos> getByWorkingUnitLeader(
		long workingUnitId, int leader)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getByWorkingUnitLeader(workingUnitId, leader);
	}

	public static java.util.List<org.oep.usermgt.model.JobPos> getByWorkingUnitLeader(
		long workingUnitId, int leader, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getByWorkingUnitLeader(workingUnitId, leader, start, end);
	}

	public static int countJobPosByWorkingUniLeadert(long workingUnitId,
		java.lang.String positionCatNo)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countJobPosByWorkingUniLeadert(workingUnitId, positionCatNo);
	}

	public static java.util.List<org.oep.usermgt.model.JobPos> getByWorkingUnitLeader(
		long workingUnitId, java.lang.String positionCatNo)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getByWorkingUnitLeader(workingUnitId, positionCatNo);
	}

	public static java.util.List<org.oep.usermgt.model.JobPos> getByWorkingUnitLeader(
		long workingUnitId, java.lang.String positionCatNo, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getByWorkingUnitLeader(workingUnitId, positionCatNo, start,
			end);
	}

	public static void clearService() {
		_service = null;
	}

	public static JobPosLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					JobPosLocalService.class.getName());

			if (invokableLocalService instanceof JobPosLocalService) {
				_service = (JobPosLocalService)invokableLocalService;
			}
			else {
				_service = new JobPosLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(JobPosLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(JobPosLocalService service) {
	}

	private static JobPosLocalService _service;
}