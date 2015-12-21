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

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link JobPosLocalService}.
 *
 * @author NQMINH
 * @see JobPosLocalService
 * @generated
 */
public class JobPosLocalServiceWrapper implements JobPosLocalService,
	ServiceWrapper<JobPosLocalService> {
	public JobPosLocalServiceWrapper(JobPosLocalService jobPosLocalService) {
		_jobPosLocalService = jobPosLocalService;
	}

	/**
	* Adds the Job Pos to the database. Also notifies the appropriate model listeners.
	*
	* @param jobPos the Job Pos
	* @return the Job Pos that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.usermgt.model.JobPos addJobPos(
		org.oep.usermgt.model.JobPos jobPos)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jobPosLocalService.addJobPos(jobPos);
	}

	/**
	* Creates a new Job Pos with the primary key. Does not add the Job Pos to the database.
	*
	* @param jobPosId the primary key for the new Job Pos
	* @return the new Job Pos
	*/
	@Override
	public org.oep.usermgt.model.JobPos createJobPos(long jobPosId) {
		return _jobPosLocalService.createJobPos(jobPosId);
	}

	/**
	* Deletes the Job Pos with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param jobPosId the primary key of the Job Pos
	* @return the Job Pos that was removed
	* @throws PortalException if a Job Pos with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.usermgt.model.JobPos deleteJobPos(long jobPosId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _jobPosLocalService.deleteJobPos(jobPosId);
	}

	/**
	* Deletes the Job Pos from the database. Also notifies the appropriate model listeners.
	*
	* @param jobPos the Job Pos
	* @return the Job Pos that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.usermgt.model.JobPos deleteJobPos(
		org.oep.usermgt.model.JobPos jobPos)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jobPosLocalService.deleteJobPos(jobPos);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _jobPosLocalService.dynamicQuery();
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
		return _jobPosLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _jobPosLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jobPosLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _jobPosLocalService.dynamicQueryCount(dynamicQuery);
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
		return _jobPosLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public org.oep.usermgt.model.JobPos fetchJobPos(long jobPosId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jobPosLocalService.fetchJobPos(jobPosId);
	}

	/**
	* Returns the Job Pos with the primary key.
	*
	* @param jobPosId the primary key of the Job Pos
	* @return the Job Pos
	* @throws PortalException if a Job Pos with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.usermgt.model.JobPos getJobPos(long jobPosId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _jobPosLocalService.getJobPos(jobPosId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _jobPosLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<org.oep.usermgt.model.JobPos> getJobPoses(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _jobPosLocalService.getJobPoses(start, end);
	}

	/**
	* Returns the number of Job Poses.
	*
	* @return the number of Job Poses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getJobPosesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jobPosLocalService.getJobPosesCount();
	}

	/**
	* Updates the Job Pos in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param jobPos the Job Pos
	* @return the Job Pos that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.oep.usermgt.model.JobPos updateJobPos(
		org.oep.usermgt.model.JobPos jobPos)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jobPosLocalService.updateJobPos(jobPos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addEmployeeJobPos(long employeeId, long jobPosId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_jobPosLocalService.addEmployeeJobPos(employeeId, jobPosId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addEmployeeJobPos(long employeeId,
		org.oep.usermgt.model.JobPos jobPos)
		throws com.liferay.portal.kernel.exception.SystemException {
		_jobPosLocalService.addEmployeeJobPos(employeeId, jobPos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addEmployeeJobPoses(long employeeId, long[] jobPosIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_jobPosLocalService.addEmployeeJobPoses(employeeId, jobPosIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addEmployeeJobPoses(long employeeId,
		java.util.List<org.oep.usermgt.model.JobPos> JobPoses)
		throws com.liferay.portal.kernel.exception.SystemException {
		_jobPosLocalService.addEmployeeJobPoses(employeeId, JobPoses);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void clearEmployeeJobPoses(long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_jobPosLocalService.clearEmployeeJobPoses(employeeId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteEmployeeJobPos(long employeeId, long jobPosId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_jobPosLocalService.deleteEmployeeJobPos(employeeId, jobPosId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteEmployeeJobPos(long employeeId,
		org.oep.usermgt.model.JobPos jobPos)
		throws com.liferay.portal.kernel.exception.SystemException {
		_jobPosLocalService.deleteEmployeeJobPos(employeeId, jobPos);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteEmployeeJobPoses(long employeeId, long[] jobPosIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_jobPosLocalService.deleteEmployeeJobPoses(employeeId, jobPosIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteEmployeeJobPoses(long employeeId,
		java.util.List<org.oep.usermgt.model.JobPos> JobPoses)
		throws com.liferay.portal.kernel.exception.SystemException {
		_jobPosLocalService.deleteEmployeeJobPoses(employeeId, JobPoses);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.oep.usermgt.model.JobPos> getEmployeeJobPoses(
		long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jobPosLocalService.getEmployeeJobPoses(employeeId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.oep.usermgt.model.JobPos> getEmployeeJobPoses(
		long employeeId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jobPosLocalService.getEmployeeJobPoses(employeeId, start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.oep.usermgt.model.JobPos> getEmployeeJobPoses(
		long employeeId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jobPosLocalService.getEmployeeJobPoses(employeeId, start, end,
			orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getEmployeeJobPosesCount(long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jobPosLocalService.getEmployeeJobPosesCount(employeeId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasEmployeeJobPos(long employeeId, long jobPosId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jobPosLocalService.hasEmployeeJobPos(employeeId, jobPosId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasEmployeeJobPoses(long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _jobPosLocalService.hasEmployeeJobPoses(employeeId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void setEmployeeJobPoses(long employeeId, long[] jobPosIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_jobPosLocalService.setEmployeeJobPoses(employeeId, jobPosIds);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _jobPosLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_jobPosLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _jobPosLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public org.oep.usermgt.model.JobPos addJobPos(java.lang.String title,
		java.lang.String positionCatNo, long workingUnitId,
		long subWorkingUnitId, int leader,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _jobPosLocalService.addJobPos(title, positionCatNo,
			workingUnitId, subWorkingUnitId, leader, serviceContext);
	}

	@Override
	public org.oep.usermgt.model.JobPos updateJobPos(long jobPosId,
		java.lang.String title, java.lang.String positionCatNo,
		long workingUnitId, long subWorkingUnitId, int leader,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _jobPosLocalService.updateJobPos(jobPosId, title, positionCatNo,
			workingUnitId, subWorkingUnitId, leader, serviceContext);
	}

	@Override
	public org.oep.usermgt.model.JobPos saveJobPos(
		org.oep.usermgt.model.JobPos jobPos,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _jobPosLocalService.saveJobPos(jobPos, serviceContext);
	}

	@Override
	public void updateJobPosResources(org.oep.usermgt.model.JobPos jobPos,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_jobPosLocalService.updateJobPosResources(jobPos, groupPermissions,
			guestPermissions, serviceContext);
	}

	@Override
	public void removeJobPos(org.oep.usermgt.model.JobPos jobPos)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_jobPosLocalService.removeJobPos(jobPos);
	}

	@Override
	public void removeJobPos(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_jobPosLocalService.removeJobPos(id);
	}

	@Override
	public void addJobPosResources(org.oep.usermgt.model.JobPos jobPos,
		boolean addGroupPermission, boolean addGuestPermission,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_jobPosLocalService.addJobPosResources(jobPos, addGroupPermission,
			addGuestPermission, serviceContext);
	}

	@Override
	public void addJobPosResources(org.oep.usermgt.model.JobPos jobPos,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_jobPosLocalService.addJobPosResources(jobPos, groupPermissions,
			guestPermissions, serviceContext);
	}

	@Override
	public void addJobPosResources(long id,
		java.lang.String[] groupPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_jobPosLocalService.addJobPosResources(id, groupPermissions,
			guestPermissions, serviceContext);
	}

	@Override
	public int countJobPosByWorkingUnit(long workingUnitId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _jobPosLocalService.countJobPosByWorkingUnit(workingUnitId);
	}

	@Override
	public java.util.List<org.oep.usermgt.model.JobPos> getByWorkingUnit(
		long workingUnitId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _jobPosLocalService.getByWorkingUnit(workingUnitId);
	}

	@Override
	public java.util.List<org.oep.usermgt.model.JobPos> getByWorkingUnit(
		long workingUnitId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _jobPosLocalService.getByWorkingUnit(workingUnitId, start, end);
	}

	@Override
	public int countJobPosByWorkingUniLeadert(long workingUnitId, int leader)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _jobPosLocalService.countJobPosByWorkingUniLeadert(workingUnitId,
			leader);
	}

	@Override
	public java.util.List<org.oep.usermgt.model.JobPos> getByWorkingUnitLeader(
		long workingUnitId, int leader)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _jobPosLocalService.getByWorkingUnitLeader(workingUnitId, leader);
	}

	@Override
	public java.util.List<org.oep.usermgt.model.JobPos> getByWorkingUnitLeader(
		long workingUnitId, int leader, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _jobPosLocalService.getByWorkingUnitLeader(workingUnitId,
			leader, start, end);
	}

	@Override
	public int countJobPosByWorkingUniLeadert(long workingUnitId,
		java.lang.String positionCatNo)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _jobPosLocalService.countJobPosByWorkingUniLeadert(workingUnitId,
			positionCatNo);
	}

	@Override
	public java.util.List<org.oep.usermgt.model.JobPos> getByWorkingUnitLeader(
		long workingUnitId, java.lang.String positionCatNo)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _jobPosLocalService.getByWorkingUnitLeader(workingUnitId,
			positionCatNo);
	}

	@Override
	public java.util.List<org.oep.usermgt.model.JobPos> getByWorkingUnitLeader(
		long workingUnitId, java.lang.String positionCatNo, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _jobPosLocalService.getByWorkingUnitLeader(workingUnitId,
			positionCatNo, start, end);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public JobPosLocalService getWrappedJobPosLocalService() {
		return _jobPosLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedJobPosLocalService(
		JobPosLocalService jobPosLocalService) {
		_jobPosLocalService = jobPosLocalService;
	}

	@Override
	public JobPosLocalService getWrappedService() {
		return _jobPosLocalService;
	}

	@Override
	public void setWrappedService(JobPosLocalService jobPosLocalService) {
		_jobPosLocalService = jobPosLocalService;
	}

	private JobPosLocalService _jobPosLocalService;
}