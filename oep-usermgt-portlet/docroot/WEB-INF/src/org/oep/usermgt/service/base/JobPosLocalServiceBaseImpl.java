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

package org.oep.usermgt.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import org.oep.usermgt.model.JobPos;
import org.oep.usermgt.service.JobPosLocalService;
import org.oep.usermgt.service.persistence.BusinessPersistence;
import org.oep.usermgt.service.persistence.CitizenPersistence;
import org.oep.usermgt.service.persistence.DelegacyPersistence;
import org.oep.usermgt.service.persistence.EmployeeFinder;
import org.oep.usermgt.service.persistence.EmployeePersistence;
import org.oep.usermgt.service.persistence.JobPos2RoleFinder;
import org.oep.usermgt.service.persistence.JobPos2RolePersistence;
import org.oep.usermgt.service.persistence.JobPosFinder;
import org.oep.usermgt.service.persistence.JobPosPersistence;
import org.oep.usermgt.service.persistence.SubAccountPersistence;
import org.oep.usermgt.service.persistence.WorkingUnitFinder;
import org.oep.usermgt.service.persistence.WorkingUnitPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the Job Pos local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link org.oep.usermgt.service.impl.JobPosLocalServiceImpl}.
 * </p>
 *
 * @author NQMINH
 * @see org.oep.usermgt.service.impl.JobPosLocalServiceImpl
 * @see org.oep.usermgt.service.JobPosLocalServiceUtil
 * @generated
 */
public abstract class JobPosLocalServiceBaseImpl extends BaseLocalServiceImpl
	implements JobPosLocalService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link org.oep.usermgt.service.JobPosLocalServiceUtil} to access the Job Pos local service.
	 */

	/**
	 * Adds the Job Pos to the database. Also notifies the appropriate model listeners.
	 *
	 * @param jobPos the Job Pos
	 * @return the Job Pos that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public JobPos addJobPos(JobPos jobPos) throws SystemException {
		jobPos.setNew(true);

		return jobPosPersistence.update(jobPos);
	}

	/**
	 * Creates a new Job Pos with the primary key. Does not add the Job Pos to the database.
	 *
	 * @param jobPosId the primary key for the new Job Pos
	 * @return the new Job Pos
	 */
	@Override
	public JobPos createJobPos(long jobPosId) {
		return jobPosPersistence.create(jobPosId);
	}

	/**
	 * Deletes the Job Pos with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jobPosId the primary key of the Job Pos
	 * @return the Job Pos that was removed
	 * @throws PortalException if a Job Pos with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public JobPos deleteJobPos(long jobPosId)
		throws PortalException, SystemException {
		return jobPosPersistence.remove(jobPosId);
	}

	/**
	 * Deletes the Job Pos from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jobPos the Job Pos
	 * @return the Job Pos that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public JobPos deleteJobPos(JobPos jobPos) throws SystemException {
		return jobPosPersistence.remove(jobPos);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(JobPos.class,
			clazz.getClassLoader());
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
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return jobPosPersistence.findWithDynamicQuery(dynamicQuery);
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
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return jobPosPersistence.findWithDynamicQuery(dynamicQuery, start, end);
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
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return jobPosPersistence.findWithDynamicQuery(dynamicQuery, start, end,
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
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return jobPosPersistence.countWithDynamicQuery(dynamicQuery);
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
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) throws SystemException {
		return jobPosPersistence.countWithDynamicQuery(dynamicQuery, projection);
	}

	@Override
	public JobPos fetchJobPos(long jobPosId) throws SystemException {
		return jobPosPersistence.fetchByPrimaryKey(jobPosId);
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
	public JobPos getJobPos(long jobPosId)
		throws PortalException, SystemException {
		return jobPosPersistence.findByPrimaryKey(jobPosId);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return jobPosPersistence.findByPrimaryKey(primaryKeyObj);
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
	public List<JobPos> getJobPoses(int start, int end)
		throws SystemException {
		return jobPosPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of Job Poses.
	 *
	 * @return the number of Job Poses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getJobPosesCount() throws SystemException {
		return jobPosPersistence.countAll();
	}

	/**
	 * Updates the Job Pos in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param jobPos the Job Pos
	 * @return the Job Pos that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public JobPos updateJobPos(JobPos jobPos) throws SystemException {
		return jobPosPersistence.update(jobPos);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addEmployeeJobPos(long employeeId, long jobPosId)
		throws SystemException {
		employeePersistence.addJobPos(employeeId, jobPosId);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addEmployeeJobPos(long employeeId, JobPos jobPos)
		throws SystemException {
		employeePersistence.addJobPos(employeeId, jobPos);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addEmployeeJobPoses(long employeeId, long[] jobPosIds)
		throws SystemException {
		employeePersistence.addJobPoses(employeeId, jobPosIds);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addEmployeeJobPoses(long employeeId, List<JobPos> JobPoses)
		throws SystemException {
		employeePersistence.addJobPoses(employeeId, JobPoses);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void clearEmployeeJobPoses(long employeeId)
		throws SystemException {
		employeePersistence.clearJobPoses(employeeId);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void deleteEmployeeJobPos(long employeeId, long jobPosId)
		throws SystemException {
		employeePersistence.removeJobPos(employeeId, jobPosId);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void deleteEmployeeJobPos(long employeeId, JobPos jobPos)
		throws SystemException {
		employeePersistence.removeJobPos(employeeId, jobPos);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void deleteEmployeeJobPoses(long employeeId, long[] jobPosIds)
		throws SystemException {
		employeePersistence.removeJobPoses(employeeId, jobPosIds);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void deleteEmployeeJobPoses(long employeeId, List<JobPos> JobPoses)
		throws SystemException {
		employeePersistence.removeJobPoses(employeeId, JobPoses);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<JobPos> getEmployeeJobPoses(long employeeId)
		throws SystemException {
		return employeePersistence.getJobPoses(employeeId);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<JobPos> getEmployeeJobPoses(long employeeId, int start, int end)
		throws SystemException {
		return employeePersistence.getJobPoses(employeeId, start, end);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<JobPos> getEmployeeJobPoses(long employeeId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		return employeePersistence.getJobPoses(employeeId, start, end,
			orderByComparator);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getEmployeeJobPosesCount(long employeeId)
		throws SystemException {
		return employeePersistence.getJobPosesSize(employeeId);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean hasEmployeeJobPos(long employeeId, long jobPosId)
		throws SystemException {
		return employeePersistence.containsJobPos(employeeId, jobPosId);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean hasEmployeeJobPoses(long employeeId)
		throws SystemException {
		return employeePersistence.containsJobPoses(employeeId);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setEmployeeJobPoses(long employeeId, long[] jobPosIds)
		throws SystemException {
		employeePersistence.setJobPoses(employeeId, jobPosIds);
	}

	/**
	 * Returns the business local service.
	 *
	 * @return the business local service
	 */
	public org.oep.usermgt.service.BusinessLocalService getBusinessLocalService() {
		return businessLocalService;
	}

	/**
	 * Sets the business local service.
	 *
	 * @param businessLocalService the business local service
	 */
	public void setBusinessLocalService(
		org.oep.usermgt.service.BusinessLocalService businessLocalService) {
		this.businessLocalService = businessLocalService;
	}

	/**
	 * Returns the business remote service.
	 *
	 * @return the business remote service
	 */
	public org.oep.usermgt.service.BusinessService getBusinessService() {
		return businessService;
	}

	/**
	 * Sets the business remote service.
	 *
	 * @param businessService the business remote service
	 */
	public void setBusinessService(
		org.oep.usermgt.service.BusinessService businessService) {
		this.businessService = businessService;
	}

	/**
	 * Returns the business persistence.
	 *
	 * @return the business persistence
	 */
	public BusinessPersistence getBusinessPersistence() {
		return businessPersistence;
	}

	/**
	 * Sets the business persistence.
	 *
	 * @param businessPersistence the business persistence
	 */
	public void setBusinessPersistence(BusinessPersistence businessPersistence) {
		this.businessPersistence = businessPersistence;
	}

	/**
	 * Returns the citizen local service.
	 *
	 * @return the citizen local service
	 */
	public org.oep.usermgt.service.CitizenLocalService getCitizenLocalService() {
		return citizenLocalService;
	}

	/**
	 * Sets the citizen local service.
	 *
	 * @param citizenLocalService the citizen local service
	 */
	public void setCitizenLocalService(
		org.oep.usermgt.service.CitizenLocalService citizenLocalService) {
		this.citizenLocalService = citizenLocalService;
	}

	/**
	 * Returns the citizen remote service.
	 *
	 * @return the citizen remote service
	 */
	public org.oep.usermgt.service.CitizenService getCitizenService() {
		return citizenService;
	}

	/**
	 * Sets the citizen remote service.
	 *
	 * @param citizenService the citizen remote service
	 */
	public void setCitizenService(
		org.oep.usermgt.service.CitizenService citizenService) {
		this.citizenService = citizenService;
	}

	/**
	 * Returns the citizen persistence.
	 *
	 * @return the citizen persistence
	 */
	public CitizenPersistence getCitizenPersistence() {
		return citizenPersistence;
	}

	/**
	 * Sets the citizen persistence.
	 *
	 * @param citizenPersistence the citizen persistence
	 */
	public void setCitizenPersistence(CitizenPersistence citizenPersistence) {
		this.citizenPersistence = citizenPersistence;
	}

	/**
	 * Returns the delegacy local service.
	 *
	 * @return the delegacy local service
	 */
	public org.oep.usermgt.service.DelegacyLocalService getDelegacyLocalService() {
		return delegacyLocalService;
	}

	/**
	 * Sets the delegacy local service.
	 *
	 * @param delegacyLocalService the delegacy local service
	 */
	public void setDelegacyLocalService(
		org.oep.usermgt.service.DelegacyLocalService delegacyLocalService) {
		this.delegacyLocalService = delegacyLocalService;
	}

	/**
	 * Returns the delegacy remote service.
	 *
	 * @return the delegacy remote service
	 */
	public org.oep.usermgt.service.DelegacyService getDelegacyService() {
		return delegacyService;
	}

	/**
	 * Sets the delegacy remote service.
	 *
	 * @param delegacyService the delegacy remote service
	 */
	public void setDelegacyService(
		org.oep.usermgt.service.DelegacyService delegacyService) {
		this.delegacyService = delegacyService;
	}

	/**
	 * Returns the delegacy persistence.
	 *
	 * @return the delegacy persistence
	 */
	public DelegacyPersistence getDelegacyPersistence() {
		return delegacyPersistence;
	}

	/**
	 * Sets the delegacy persistence.
	 *
	 * @param delegacyPersistence the delegacy persistence
	 */
	public void setDelegacyPersistence(DelegacyPersistence delegacyPersistence) {
		this.delegacyPersistence = delegacyPersistence;
	}

	/**
	 * Returns the employee local service.
	 *
	 * @return the employee local service
	 */
	public org.oep.usermgt.service.EmployeeLocalService getEmployeeLocalService() {
		return employeeLocalService;
	}

	/**
	 * Sets the employee local service.
	 *
	 * @param employeeLocalService the employee local service
	 */
	public void setEmployeeLocalService(
		org.oep.usermgt.service.EmployeeLocalService employeeLocalService) {
		this.employeeLocalService = employeeLocalService;
	}

	/**
	 * Returns the employee remote service.
	 *
	 * @return the employee remote service
	 */
	public org.oep.usermgt.service.EmployeeService getEmployeeService() {
		return employeeService;
	}

	/**
	 * Sets the employee remote service.
	 *
	 * @param employeeService the employee remote service
	 */
	public void setEmployeeService(
		org.oep.usermgt.service.EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	/**
	 * Returns the employee persistence.
	 *
	 * @return the employee persistence
	 */
	public EmployeePersistence getEmployeePersistence() {
		return employeePersistence;
	}

	/**
	 * Sets the employee persistence.
	 *
	 * @param employeePersistence the employee persistence
	 */
	public void setEmployeePersistence(EmployeePersistence employeePersistence) {
		this.employeePersistence = employeePersistence;
	}

	/**
	 * Returns the employee finder.
	 *
	 * @return the employee finder
	 */
	public EmployeeFinder getEmployeeFinder() {
		return employeeFinder;
	}

	/**
	 * Sets the employee finder.
	 *
	 * @param employeeFinder the employee finder
	 */
	public void setEmployeeFinder(EmployeeFinder employeeFinder) {
		this.employeeFinder = employeeFinder;
	}

	/**
	 * Returns the Job Pos local service.
	 *
	 * @return the Job Pos local service
	 */
	public org.oep.usermgt.service.JobPosLocalService getJobPosLocalService() {
		return jobPosLocalService;
	}

	/**
	 * Sets the Job Pos local service.
	 *
	 * @param jobPosLocalService the Job Pos local service
	 */
	public void setJobPosLocalService(
		org.oep.usermgt.service.JobPosLocalService jobPosLocalService) {
		this.jobPosLocalService = jobPosLocalService;
	}

	/**
	 * Returns the Job Pos remote service.
	 *
	 * @return the Job Pos remote service
	 */
	public org.oep.usermgt.service.JobPosService getJobPosService() {
		return jobPosService;
	}

	/**
	 * Sets the Job Pos remote service.
	 *
	 * @param jobPosService the Job Pos remote service
	 */
	public void setJobPosService(
		org.oep.usermgt.service.JobPosService jobPosService) {
		this.jobPosService = jobPosService;
	}

	/**
	 * Returns the Job Pos persistence.
	 *
	 * @return the Job Pos persistence
	 */
	public JobPosPersistence getJobPosPersistence() {
		return jobPosPersistence;
	}

	/**
	 * Sets the Job Pos persistence.
	 *
	 * @param jobPosPersistence the Job Pos persistence
	 */
	public void setJobPosPersistence(JobPosPersistence jobPosPersistence) {
		this.jobPosPersistence = jobPosPersistence;
	}

	/**
	 * Returns the Job Pos finder.
	 *
	 * @return the Job Pos finder
	 */
	public JobPosFinder getJobPosFinder() {
		return jobPosFinder;
	}

	/**
	 * Sets the Job Pos finder.
	 *
	 * @param jobPosFinder the Job Pos finder
	 */
	public void setJobPosFinder(JobPosFinder jobPosFinder) {
		this.jobPosFinder = jobPosFinder;
	}

	/**
	 * Returns the jobpos to role local service.
	 *
	 * @return the jobpos to role local service
	 */
	public org.oep.usermgt.service.JobPos2RoleLocalService getJobPos2RoleLocalService() {
		return jobPos2RoleLocalService;
	}

	/**
	 * Sets the jobpos to role local service.
	 *
	 * @param jobPos2RoleLocalService the jobpos to role local service
	 */
	public void setJobPos2RoleLocalService(
		org.oep.usermgt.service.JobPos2RoleLocalService jobPos2RoleLocalService) {
		this.jobPos2RoleLocalService = jobPos2RoleLocalService;
	}

	/**
	 * Returns the jobpos to role remote service.
	 *
	 * @return the jobpos to role remote service
	 */
	public org.oep.usermgt.service.JobPos2RoleService getJobPos2RoleService() {
		return jobPos2RoleService;
	}

	/**
	 * Sets the jobpos to role remote service.
	 *
	 * @param jobPos2RoleService the jobpos to role remote service
	 */
	public void setJobPos2RoleService(
		org.oep.usermgt.service.JobPos2RoleService jobPos2RoleService) {
		this.jobPos2RoleService = jobPos2RoleService;
	}

	/**
	 * Returns the jobpos to role persistence.
	 *
	 * @return the jobpos to role persistence
	 */
	public JobPos2RolePersistence getJobPos2RolePersistence() {
		return jobPos2RolePersistence;
	}

	/**
	 * Sets the jobpos to role persistence.
	 *
	 * @param jobPos2RolePersistence the jobpos to role persistence
	 */
	public void setJobPos2RolePersistence(
		JobPos2RolePersistence jobPos2RolePersistence) {
		this.jobPos2RolePersistence = jobPos2RolePersistence;
	}

	/**
	 * Returns the jobpos to role finder.
	 *
	 * @return the jobpos to role finder
	 */
	public JobPos2RoleFinder getJobPos2RoleFinder() {
		return jobPos2RoleFinder;
	}

	/**
	 * Sets the jobpos to role finder.
	 *
	 * @param jobPos2RoleFinder the jobpos to role finder
	 */
	public void setJobPos2RoleFinder(JobPos2RoleFinder jobPos2RoleFinder) {
		this.jobPos2RoleFinder = jobPos2RoleFinder;
	}

	/**
	 * Returns the sub account local service.
	 *
	 * @return the sub account local service
	 */
	public org.oep.usermgt.service.SubAccountLocalService getSubAccountLocalService() {
		return subAccountLocalService;
	}

	/**
	 * Sets the sub account local service.
	 *
	 * @param subAccountLocalService the sub account local service
	 */
	public void setSubAccountLocalService(
		org.oep.usermgt.service.SubAccountLocalService subAccountLocalService) {
		this.subAccountLocalService = subAccountLocalService;
	}

	/**
	 * Returns the sub account remote service.
	 *
	 * @return the sub account remote service
	 */
	public org.oep.usermgt.service.SubAccountService getSubAccountService() {
		return subAccountService;
	}

	/**
	 * Sets the sub account remote service.
	 *
	 * @param subAccountService the sub account remote service
	 */
	public void setSubAccountService(
		org.oep.usermgt.service.SubAccountService subAccountService) {
		this.subAccountService = subAccountService;
	}

	/**
	 * Returns the sub account persistence.
	 *
	 * @return the sub account persistence
	 */
	public SubAccountPersistence getSubAccountPersistence() {
		return subAccountPersistence;
	}

	/**
	 * Sets the sub account persistence.
	 *
	 * @param subAccountPersistence the sub account persistence
	 */
	public void setSubAccountPersistence(
		SubAccountPersistence subAccountPersistence) {
		this.subAccountPersistence = subAccountPersistence;
	}

	/**
	 * Returns the Working Unit local service.
	 *
	 * @return the Working Unit local service
	 */
	public org.oep.usermgt.service.WorkingUnitLocalService getWorkingUnitLocalService() {
		return workingUnitLocalService;
	}

	/**
	 * Sets the Working Unit local service.
	 *
	 * @param workingUnitLocalService the Working Unit local service
	 */
	public void setWorkingUnitLocalService(
		org.oep.usermgt.service.WorkingUnitLocalService workingUnitLocalService) {
		this.workingUnitLocalService = workingUnitLocalService;
	}

	/**
	 * Returns the Working Unit remote service.
	 *
	 * @return the Working Unit remote service
	 */
	public org.oep.usermgt.service.WorkingUnitService getWorkingUnitService() {
		return workingUnitService;
	}

	/**
	 * Sets the Working Unit remote service.
	 *
	 * @param workingUnitService the Working Unit remote service
	 */
	public void setWorkingUnitService(
		org.oep.usermgt.service.WorkingUnitService workingUnitService) {
		this.workingUnitService = workingUnitService;
	}

	/**
	 * Returns the Working Unit persistence.
	 *
	 * @return the Working Unit persistence
	 */
	public WorkingUnitPersistence getWorkingUnitPersistence() {
		return workingUnitPersistence;
	}

	/**
	 * Sets the Working Unit persistence.
	 *
	 * @param workingUnitPersistence the Working Unit persistence
	 */
	public void setWorkingUnitPersistence(
		WorkingUnitPersistence workingUnitPersistence) {
		this.workingUnitPersistence = workingUnitPersistence;
	}

	/**
	 * Returns the Working Unit finder.
	 *
	 * @return the Working Unit finder
	 */
	public WorkingUnitFinder getWorkingUnitFinder() {
		return workingUnitFinder;
	}

	/**
	 * Sets the Working Unit finder.
	 *
	 * @param workingUnitFinder the Working Unit finder
	 */
	public void setWorkingUnitFinder(WorkingUnitFinder workingUnitFinder) {
		this.workingUnitFinder = workingUnitFinder;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();

		PersistedModelLocalServiceRegistryUtil.register("org.oep.usermgt.model.JobPos",
			jobPosLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"org.oep.usermgt.model.JobPos");
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return JobPos.class;
	}

	protected String getModelClassName() {
		return JobPos.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = jobPosPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = org.oep.usermgt.service.BusinessLocalService.class)
	protected org.oep.usermgt.service.BusinessLocalService businessLocalService;
	@BeanReference(type = org.oep.usermgt.service.BusinessService.class)
	protected org.oep.usermgt.service.BusinessService businessService;
	@BeanReference(type = BusinessPersistence.class)
	protected BusinessPersistence businessPersistence;
	@BeanReference(type = org.oep.usermgt.service.CitizenLocalService.class)
	protected org.oep.usermgt.service.CitizenLocalService citizenLocalService;
	@BeanReference(type = org.oep.usermgt.service.CitizenService.class)
	protected org.oep.usermgt.service.CitizenService citizenService;
	@BeanReference(type = CitizenPersistence.class)
	protected CitizenPersistence citizenPersistence;
	@BeanReference(type = org.oep.usermgt.service.DelegacyLocalService.class)
	protected org.oep.usermgt.service.DelegacyLocalService delegacyLocalService;
	@BeanReference(type = org.oep.usermgt.service.DelegacyService.class)
	protected org.oep.usermgt.service.DelegacyService delegacyService;
	@BeanReference(type = DelegacyPersistence.class)
	protected DelegacyPersistence delegacyPersistence;
	@BeanReference(type = org.oep.usermgt.service.EmployeeLocalService.class)
	protected org.oep.usermgt.service.EmployeeLocalService employeeLocalService;
	@BeanReference(type = org.oep.usermgt.service.EmployeeService.class)
	protected org.oep.usermgt.service.EmployeeService employeeService;
	@BeanReference(type = EmployeePersistence.class)
	protected EmployeePersistence employeePersistence;
	@BeanReference(type = EmployeeFinder.class)
	protected EmployeeFinder employeeFinder;
	@BeanReference(type = org.oep.usermgt.service.JobPosLocalService.class)
	protected org.oep.usermgt.service.JobPosLocalService jobPosLocalService;
	@BeanReference(type = org.oep.usermgt.service.JobPosService.class)
	protected org.oep.usermgt.service.JobPosService jobPosService;
	@BeanReference(type = JobPosPersistence.class)
	protected JobPosPersistence jobPosPersistence;
	@BeanReference(type = JobPosFinder.class)
	protected JobPosFinder jobPosFinder;
	@BeanReference(type = org.oep.usermgt.service.JobPos2RoleLocalService.class)
	protected org.oep.usermgt.service.JobPos2RoleLocalService jobPos2RoleLocalService;
	@BeanReference(type = org.oep.usermgt.service.JobPos2RoleService.class)
	protected org.oep.usermgt.service.JobPos2RoleService jobPos2RoleService;
	@BeanReference(type = JobPos2RolePersistence.class)
	protected JobPos2RolePersistence jobPos2RolePersistence;
	@BeanReference(type = JobPos2RoleFinder.class)
	protected JobPos2RoleFinder jobPos2RoleFinder;
	@BeanReference(type = org.oep.usermgt.service.SubAccountLocalService.class)
	protected org.oep.usermgt.service.SubAccountLocalService subAccountLocalService;
	@BeanReference(type = org.oep.usermgt.service.SubAccountService.class)
	protected org.oep.usermgt.service.SubAccountService subAccountService;
	@BeanReference(type = SubAccountPersistence.class)
	protected SubAccountPersistence subAccountPersistence;
	@BeanReference(type = org.oep.usermgt.service.WorkingUnitLocalService.class)
	protected org.oep.usermgt.service.WorkingUnitLocalService workingUnitLocalService;
	@BeanReference(type = org.oep.usermgt.service.WorkingUnitService.class)
	protected org.oep.usermgt.service.WorkingUnitService workingUnitService;
	@BeanReference(type = WorkingUnitPersistence.class)
	protected WorkingUnitPersistence workingUnitPersistence;
	@BeanReference(type = WorkingUnitFinder.class)
	protected WorkingUnitFinder workingUnitFinder;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private JobPosLocalServiceClpInvoker _clpInvoker = new JobPosLocalServiceClpInvoker();
}