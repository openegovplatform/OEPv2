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

import org.oep.usermgt.model.Business;
import org.oep.usermgt.service.base.BusinessLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.service.ServiceContext;

/**
 * The implementation of the business local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.usermgt.service.BusinessLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author NQMINH
 * @see org.oep.usermgt.service.base.BusinessLocalServiceBaseImpl
 * @see org.oep.usermgt.service.BusinessLocalServiceUtil
 */
public class BusinessLocalServiceImpl extends BusinessLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.usermgt.service.BusinessLocalServiceUtil} to access the business local service.
	 */
	public Business addBusiness(
			long organizationId,
			long masterUserId,
			String name,
			String enName,
			String shortName,
			String address,
			String cityNo,
			String cityName,
			String districtNo,
			String districtName,
			String wardNo,
			String wardName,
			String gpsPosition,
			String telNo,
			String fax,
			String email,
			String businessNo,
			String businessType,
			String registerAgent,
			Date registerDate,
			String representative,
			String representativeRole,
			ServiceContext serviceContext) throws SystemException, PortalException {
		//validate(collectionName, dataCode, title, status);
		long id = counterLocalService.increment();
		Business business = businessPersistence.create(id);
		Date now = new Date();
		
		business.setOrganizationId(organizationId);
		business.setMasterUserId(masterUserId);
		business.setName(name);
		business.setEnName(enName);
		business.setShortName(shortName);
		business.setAddress(address);
		business.setCityNo(cityNo);
		business.setCityName(cityName);
		business.setDistrictNo(districtNo);
		business.setDistrictName(districtName);
		business.setWardNo(wardNo);
		business.setWardName(wardName);
		business.setGpsPosition(gpsPosition);
		business.setTelNo(telNo);
		business.setFax(fax);
		business.setEmail(email);
		business.setBusinessNo(businessNo);
		business.setBusinessType(businessType);
		business.setRegisterAgent(registerAgent);
		business.setRegisterDate(registerDate);
		business.setRepresentative(representative);
		business.setRepresentativeRole(representativeRole);
		
		business.setCompanyId(serviceContext.getCompanyId());
		business.setGroupId(serviceContext.getScopeGroupId());
		business.setUserId(serviceContext.getUserId());
		business.setCreateDate(serviceContext.getCreateDate(now));
		
		businessPersistence.update(business);

		if (serviceContext.isAddGroupPermissions() || serviceContext.isAddGuestPermissions()) {
			addBusinessResources(business, serviceContext.isAddGroupPermissions(), serviceContext.isAddGuestPermissions(), serviceContext);
		}
		else {
			addBusinessResources(business, serviceContext.getGroupPermissions(), serviceContext.getGuestPermissions(), serviceContext);
		}
		return getBusiness(id);
	}
	
	public Business updateBusiness(
			long businessId,
			long organizationId,
			long masterUserId,
			String name,
			String enName,
			String shortName,
			String address,
			String cityNo,
			String cityName,
			String districtNo,
			String districtName,
			String wardNo,
			String wardName,
			String gpsPosition,
			String telNo,
			String fax,
			String email,
			String businessNo,
			String businessType,
			String registerAgent,
			Date registerDate,
			String representative,
			String representativeRole,
			ServiceContext serviceContext)
		throws PortalException, SystemException {
		Business business = businessPersistence.findByPrimaryKey(businessId);
		business.setBusinessId(businessId);
		business.setOrganizationId(organizationId);
		business.setMasterUserId(masterUserId);
		business.setName(name);
		business.setEnName(enName);
		business.setShortName(shortName);
		business.setAddress(address);
		business.setCityNo(cityNo);
		business.setCityName(cityName);
		business.setDistrictNo(districtNo);
		business.setDistrictName(districtName);
		business.setWardNo(wardNo);
		business.setWardName(wardName);
		business.setGpsPosition(gpsPosition);
		business.setTelNo(telNo);
		business.setFax(fax);
		business.setEmail(email);
		business.setBusinessNo(businessNo);
		business.setBusinessType(businessType);
		business.setRegisterAgent(registerAgent);
		business.setRegisterDate(registerDate);
		business.setRepresentative(representative);
		business.setRepresentativeRole(representativeRole);
		
		business.setModifiedDate(serviceContext.getModifiedDate(null));
		businessPersistence.update(business);

		if ((serviceContext.getGroupPermissions() != null) ||
			(serviceContext.getGuestPermissions() != null)) {

			updateBusinessResources(
				business, serviceContext.getGroupPermissions(),
				serviceContext.getGuestPermissions(), serviceContext);
		}

		return getBusiness(business.getBusinessId());
	}
	public Business saveBusiness(Business business, ServiceContext serviceContext) throws PortalException, SystemException {
		return updateBusiness(business.getBusinessId(), 
				business.getOrganizationId(),
				business.getMasterUserId(),
				business.getName(),
				business.getEnName(),
				business.getShortName(),
				business.getAddress(),
				business.getCityNo(),
				business.getCityName(),
				business.getDistrictNo(),
				business.getDistrictName(),
				business.getWardNo(),
				business.getWardName(),
				business.getGpsPosition(),
				business.getTelNo(),
				business.getFax(),
				business.getEmail(),
				business.getBusinessNo(),
				business.getBusinessType(),
				business.getRegisterAgent(),
				business.getRegisterDate(),
				business.getRepresentative(),
				business.getRepresentativeRole(),

				serviceContext);
	}
	
	public void updateBusinessResources(
			Business business, String[] groupPermissions,
			String[] guestPermissions, ServiceContext serviceContext)
		throws PortalException, SystemException {

		resourceLocalService.updateResources(
			business.getCompanyId(), serviceContext.getGuestOrUserId(),
			Business.class.getName(), business.getBusinessId(), groupPermissions,
			guestPermissions);
	}
	public void removeBusiness(Business business) throws PortalException, SystemException {
		businessPersistence.remove(business);
		resourceLocalService.deleteResource(business.getCompanyId(), Business.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, business.getBusinessId());
	}
	
	public void removeBusiness(long id) throws PortalException, SystemException {
		Business business = businessPersistence.findByPrimaryKey(id);
		removeBusiness(business);
	}
	
	public Business getBusiness(long id) throws PortalException, SystemException {
		return businessPersistence.findByPrimaryKey(id);
	}

	public void addBusinessResources(Business business, boolean addGroupPermission, boolean addGuestPermission, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addResources(business.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), Business.class.getName(), business.getBusinessId(), false, addGroupPermission, addGuestPermission);
	}

	public void addBusinessResources(Business business, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addModelResources(business.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), Business.class.getName(), business.getBusinessId(), groupPermissions, guestPermissions);
	}
	
	public void addBusinessResources(long id, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		Business business = businessPersistence.findByPrimaryKey(id);
		addBusinessResources(business, groupPermissions, guestPermissions, serviceContext);
	}
}