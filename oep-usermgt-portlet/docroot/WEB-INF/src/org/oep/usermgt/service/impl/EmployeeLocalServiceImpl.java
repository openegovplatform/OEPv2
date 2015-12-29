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

package org.oep.usermgt.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.oep.usermgt.model.Employee;
import org.oep.usermgt.model.JobPos;

import org.oep.usermgt.service.base.EmployeeLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.service.ServiceContext;

/**
 * The implementation of the employee local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.usermgt.service.EmployeeLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author NQMINH
 * @see org.oep.usermgt.service.base.EmployeeLocalServiceBaseImpl
 * @see org.oep.usermgt.service.EmployeeLocalServiceUtil
 */
public class EmployeeLocalServiceImpl extends EmployeeLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.usermgt.service.EmployeeLocalServiceUtil} to access the employee local service.
	 */
	public Employee addEmployee(
			long mappingUserId,
			long workingUnitId,
			long mainJobPosId,
			String employeeNo,
			String fullName,
			String officeTel,
			String homeTel,
			String mobile,
			String email,
			String personelDocNo,
			int gender,
			Date birthdate,

			ServiceContext serviceContext) throws SystemException, PortalException {
		//validate(collectionName, dataCode, title, status);
		long id = counterLocalService.increment();
		Employee employee = employeePersistence.create(id);
		Date now = new Date();

		employee.setMappingUserId(mappingUserId);
		employee.setWorkingUnitId(workingUnitId);
		employee.setMainJobPosId(mainJobPosId);
		employee.setEmployeeNo(employeeNo);
		employee.setFullName(fullName);
		employee.setOfficeTel(officeTel);
		employee.setHomeTel(homeTel);
		employee.setMobile(mobile);
		employee.setEmail(email);
		employee.setPersonelDocNo(personelDocNo);
		employee.setGender(gender);
		employee.setBirthdate(birthdate);
		
		employee.setCompanyId(serviceContext.getCompanyId());
		employee.setGroupId(serviceContext.getScopeGroupId());
		employee.setUserId(serviceContext.getUserId());
		employee.setCreateDate(serviceContext.getCreateDate(now));
		employee.setModifiedDate(serviceContext.getModifiedDate(null));
		employee.setShortName("");
		//System.out.println("toi day roi :  ");
		employeePersistence.update(employee);
		//System.out.println("toi day roi 1:  ");
		if (serviceContext.isAddGroupPermissions() || serviceContext.isAddGuestPermissions()) {
			addEmployeeResources(employee, serviceContext.isAddGroupPermissions(), serviceContext.isAddGuestPermissions(), serviceContext);
		}
		else {
			addEmployeeResources(employee, serviceContext.getGroupPermissions(), serviceContext.getGuestPermissions(), serviceContext);
		}
		return getEmployee(id);
	}
	
	public void addEmployee2JoPos(
			long employeeId,
			long jobPosId) throws SystemException, PortalException {
			employeePersistence.addJobPos(employeeId, jobPosId); //.update(jobPos2Role);
		/*
		if (serviceContext.isAddGroupPermissions() || serviceContext.isAddGuestPermissions()) {
			addJobPos2RoleResources(jobPos2Role, serviceContext.isAddGroupPermissions(), serviceContext.isAddGuestPermissions(), serviceContext);
		}
		else {
			addJobPos2RoleResources(jobPos2Role, serviceContext.getGroupPermissions(), serviceContext.getGuestPermissions(), serviceContext);
		}
		*/
	//return jobPos2Role;
	}
	public Employee updateEmployee(
			long employeeId,
			long mappingUserId,
			long workingUnitId,
			long mainJobPosId,
			String employeeNo,
			String fullName,
			String officeTel,
			String homeTel,
			String mobile,
			String email,
			String personelDocNo,
			int gender,
			Date birthdate,
			ServiceContext serviceContext)
		throws PortalException, SystemException {
		Employee employee = employeePersistence.findByPrimaryKey(employeeId);
		employee.setMappingUserId(mappingUserId);
		employee.setWorkingUnitId(workingUnitId);
		employee.setMainJobPosId(mainJobPosId);
		employee.setEmployeeNo(employeeNo);
		employee.setFullName(fullName);
		employee.setOfficeTel(officeTel);
		employee.setHomeTel(homeTel);
		employee.setMobile(mobile);
		employee.setEmail(email);
		employee.setPersonelDocNo(personelDocNo);
		employee.setGender(gender);
		employee.setBirthdate(birthdate);
		employee.setShortName("");
		employee.setModifiedDate(serviceContext.getModifiedDate(null));
		employeePersistence.update(employee);

		if ((serviceContext.getGroupPermissions() != null) ||
			(serviceContext.getGuestPermissions() != null)) {

			updateEmployeeResources(
				employee, serviceContext.getGroupPermissions(),
				serviceContext.getGuestPermissions(), serviceContext);
		}

		return getEmployee(employee.getEmployeeId());
	}
	public Employee saveEmployee(Employee employee, ServiceContext serviceContext) throws PortalException, SystemException {
		return updateEmployee(employee.getEmployeeId(), 
				employee.getMappingUserId(),
				employee.getWorkingUnitId(),
				employee.getMainJobPosId(),
				employee.getEmployeeNo(),
				employee.getFullName(),
				employee.getOfficeTel(),
				employee.getHomeTel(),
				employee.getMobile(),
				employee.getEmail(),
				employee.getPersonelDocNo(),
				employee.getGender(),
				employee.getBirthdate(),

				serviceContext);
	}
	
	public void updateEmployeeResources(
			Employee employee, String[] groupPermissions,
			String[] guestPermissions, ServiceContext serviceContext)
		throws PortalException, SystemException {

		resourceLocalService.updateResources(
			employee.getCompanyId(), serviceContext.getGuestOrUserId(),
			Employee.class.getName(), employee.getEmployeeId(), groupPermissions,
			guestPermissions);
	}
	public void removeEmployee(Employee employee) throws PortalException, SystemException {
		employeePersistence.remove(employee);
		resourceLocalService.deleteResource(employee.getCompanyId(), Employee.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, employee.getEmployeeId());
	}
	
	public void removeEmployee(long id) throws PortalException, SystemException {
		Employee employee = employeePersistence.findByPrimaryKey(id);
		removeEmployee(employee);
	}
	
	public void removeJobPos(long employeeId, long jobPosId) throws PortalException, SystemException {
		employeePersistence.removeJobPos(employeeId, jobPosId);
	}
	
	public Employee getEmployee(long id) throws PortalException, SystemException {
		return employeePersistence.findByPrimaryKey(id);
	}

	public void addEmployeeResources(Employee employee, boolean addGroupPermission, boolean addGuestPermission, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addResources(employee.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), Employee.class.getName(), employee.getEmployeeId(), false, addGroupPermission, addGuestPermission);
	}

	public void addEmployeeResources(Employee employee, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addModelResources(employee.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), Employee.class.getName(), employee.getEmployeeId(), groupPermissions, guestPermissions);
	}
	
	public void addEmployeeResources(long id, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		Employee employee = employeePersistence.findByPrimaryKey(id);
		addEmployeeResources(employee, groupPermissions, guestPermissions, serviceContext);
	}
	/* WorkingUnit */
	public int countEmployeeByWorkingUnit(long workingUnitId) throws PortalException, SystemException {
		return employeePersistence.countByWU(workingUnitId);
	}
	
	public List<Employee> getByWorkingUnit(long workingUnitId) throws PortalException, SystemException {
		return employeePersistence.findByWU(workingUnitId);
	}
	
	public List<Employee> getByWorkingUnit(long workingUnitId, int start, int end) throws PortalException, SystemException {
		return employeePersistence.findByWU(workingUnitId, start, end);
	}
	/* WorkingUnit MainJobPosId*/
	public int countEmployeeByWorkingUniMainJobPos(long workingUnitId, int mainJobPosId) throws PortalException, SystemException {
		return employeePersistence.countByWU_MJ(workingUnitId, mainJobPosId);
	}
	
	public List<Employee> getByWorkingUnitMainJobPos(long workingUnitId, int mainJobPosId) throws PortalException, SystemException {
		return employeePersistence.findByWU_MJ(workingUnitId, mainJobPosId);
	}
	
	public List<Employee> getByWorkingUnitMainJobPos(long workingUnitId, int mainJobPosId, int start, int end) throws PortalException, SystemException {
		return employeePersistence.findByWU_MJ(workingUnitId, mainJobPosId, start, end);
	}
	
	/* Tim kiem Employee with textSearch and workingUnitId*/
	public int countEmployeeByLikeNameWorkingUnit(String textSearch,long workingUnitId) throws PortalException, SystemException {
		return employeeFinder.countByLikeName(textSearch, workingUnitId);
	}
	
	public List<Employee> finnderByLikeNameWorkingUnit(String textSearch,long workingUnitId) throws PortalException, SystemException {
		return employeeFinder.findByLikeName(textSearch, workingUnitId);
	}
	
	public List<Employee> finderLikeNameWorkingUnit(String textSearch,long workingUnitId, int start, int end) throws PortalException, SystemException {
		return employeeFinder.findByLikeName(textSearch,workingUnitId, start, end);
	}
	public List<JobPos> getJobPosByEmployeeId(long employeeId) throws PortalException, SystemException {
		return employeePersistence.getJobPoses(employeeId);
		//return employeePersistence.findByWU(workingUnitId);
	}
	
	public List<JobPos> getJobPos(ArrayList<JobPos> listJobPos, long employeeId) throws PortalException, SystemException {
		List<JobPos> listEmployee2JobPos=  getJobPosByEmployeeId(employeeId);
		//ArrayList<Role> roles = new ArrayList<Role>();
		for (int i = 0; i < listEmployee2JobPos.size();i++){
			for (int k = 0; k < listJobPos.size();k++){
				if (listJobPos.get(k).getJobPosId() == listEmployee2JobPos.get(i).getJobPosId()){
					listJobPos.remove(k);
					break;
				}
			}
		}
		return listEmployee2JobPos;
	}
	
}