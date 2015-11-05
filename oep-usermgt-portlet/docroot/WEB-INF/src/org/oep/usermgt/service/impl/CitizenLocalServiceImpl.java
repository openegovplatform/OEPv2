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

import java.util.Date;

import org.oep.usermgt.model.Citizen;
import org.oep.usermgt.service.base.CitizenLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.service.ServiceContext;

/**
 * The implementation of the citizen local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.usermgt.service.CitizenLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author NQMINH
 * @see org.oep.usermgt.service.base.CitizenLocalServiceBaseImpl
 * @see org.oep.usermgt.service.CitizenLocalServiceUtil
 */
public class CitizenLocalServiceImpl extends CitizenLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.usermgt.service.CitizenLocalServiceUtil} to access the citizen local service.
	 */
	public Citizen addCitizen(
			long mappingUserId,
			String citizenNo,
			String fullName,
			int gender,
			String identificationNo,
			String address,
			String cityNo,
			String cityName,
			String districtNo,
			String districtName,
			String wardNo,
			String wardName,
			String homeAddress,
			String homeTel,
			String mobile,
			String email,
			ServiceContext serviceContext) throws SystemException, PortalException {
		//validate(collectionName, dataCode, title, status);
		long id = counterLocalService.increment();
		Citizen citizen = citizenPersistence.create(id);
		Date now = new Date();

		citizen.setMappingUserId(mappingUserId);
		citizen.setCitizenNo(citizenNo);
		citizen.setFullName(fullName);
		citizen.setGender(gender);
		citizen.setIdentificationNo(identificationNo);
		citizen.setAddress(address);
		citizen.setCityNo(cityNo);
		citizen.setCityName(cityName);
		citizen.setDistrictNo(districtNo);
		citizen.setDistrictName(districtName);
		citizen.setWardNo(wardNo);
		citizen.setWardName(wardName);
		citizen.setHomeAddress(homeAddress);
		citizen.setHomeTel(homeTel);
		citizen.setMobile(mobile);
		citizen.setEmail(email);

		citizen.setCompanyId(serviceContext.getCompanyId());
		citizen.setGroupId(serviceContext.getScopeGroupId());
		citizen.setUserId(serviceContext.getUserId());
		citizen.setCreateDate(serviceContext.getCreateDate(now));
		
		citizenPersistence.update(citizen);

		if (serviceContext.isAddGroupPermissions() || serviceContext.isAddGuestPermissions()) {
			addCitizenResources(citizen, serviceContext.isAddGroupPermissions(), serviceContext.isAddGuestPermissions(), serviceContext);
		}
		else {
			addCitizenResources(citizen, serviceContext.getGroupPermissions(), serviceContext.getGuestPermissions(), serviceContext);
		}
		return getCitizen(id);
	}
	

	public Citizen updateCitizen(
			long citizenId,
			long mappingUserId,
			String citizenNo,
			String fullName,
			int gender,
			String identificationNo,
			String address,
			String cityNo,
			String cityName,
			String districtNo,
			String districtName,
			String wardNo,
			String wardName,
			String homeAddress,
			String homeTel,
			String mobile,
			String email,
			ServiceContext serviceContext)
		throws PortalException, SystemException {
		Citizen citizen = citizenPersistence.findByPrimaryKey(citizenId);
		citizen.setMappingUserId(mappingUserId);
		citizen.setCitizenNo(citizenNo);
		citizen.setFullName(fullName);
		citizen.setGender(gender);
		citizen.setIdentificationNo(identificationNo);
		citizen.setAddress(address);
		citizen.setCityNo(cityNo);
		citizen.setCityName(cityName);
		citizen.setDistrictNo(districtNo);
		citizen.setDistrictName(districtName);
		citizen.setWardNo(wardNo);
		citizen.setWardName(wardName);
		citizen.setHomeAddress(homeAddress);
		citizen.setHomeTel(homeTel);
		citizen.setMobile(mobile);
		citizen.setEmail(email);
		
		citizen.setModifiedDate(serviceContext.getModifiedDate(null));
		citizenPersistence.update(citizen);

		if ((serviceContext.getGroupPermissions() != null) ||
			(serviceContext.getGuestPermissions() != null)) {

			updateCitizenResources(
				citizen, serviceContext.getGroupPermissions(),
				serviceContext.getGuestPermissions(), serviceContext);
		}

		return getCitizen(citizen.getCitizenId());
	}
	public Citizen saveCitizen(Citizen citizen, ServiceContext serviceContext) throws PortalException, SystemException {
		return updateCitizen(citizen.getCitizenId(), 
				citizen.getMappingUserId(),
				citizen.getCitizenNo(),
				citizen.getFullName(),
				citizen.getGender(),
				citizen.getIdentificationNo(),
				citizen.getAddress(),
				citizen.getCityNo(),
				citizen.getCityName(),
				citizen.getDistrictNo(),
				citizen.getDistrictName(),
				citizen.getWardNo(),
				citizen.getWardName(),
				citizen.getHomeAddress(),
				citizen.getHomeTel(),
				citizen.getMobile(),
				citizen.getEmail(),
				serviceContext);
	}
	
	public void updateCitizenResources(
			Citizen citizen, String[] groupPermissions,
			String[] guestPermissions, ServiceContext serviceContext)
		throws PortalException, SystemException {

		resourceLocalService.updateResources(
			citizen.getCompanyId(), serviceContext.getGuestOrUserId(),
			Citizen.class.getName(), citizen.getCitizenId(), groupPermissions,
			guestPermissions);
	}
	public void removeCitizen(Citizen citizen) throws PortalException, SystemException {
		citizenPersistence.remove(citizen);
		resourceLocalService.deleteResource(citizen.getCompanyId(), Citizen.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, citizen.getCitizenId());
	}
	
	public void removeCitizen(long id) throws PortalException, SystemException {
		Citizen citizen = citizenPersistence.findByPrimaryKey(id);
		removeCitizen(citizen);
	}
	
	public Citizen getCitizen(long id) throws PortalException, SystemException {
		return citizenPersistence.findByPrimaryKey(id);
	}

	public void addCitizenResources(Citizen citizen, boolean addGroupPermission, boolean addGuestPermission, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addResources(citizen.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), Citizen.class.getName(), citizen.getCitizenId(), false, addGroupPermission, addGuestPermission);
	}

	public void addCitizenResources(Citizen citizen, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addModelResources(citizen.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), Citizen.class.getName(), citizen.getCitizenId(), groupPermissions, guestPermissions);
	}
	
	public void addCitizenResources(long id, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		Citizen citizen = citizenPersistence.findByPrimaryKey(id);
		addCitizenResources(citizen, groupPermissions, guestPermissions, serviceContext);
	}
}