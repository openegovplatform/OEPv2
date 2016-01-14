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

import org.oep.usermgt.model.WorkingUnit;
import org.oep.usermgt.service.base.WorkingUnitLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.service.ServiceContext;

/**
 * The implementation of the Working Unit local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.usermgt.service.WorkingUnitLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author NQMINH
 * @see org.oep.usermgt.service.base.WorkingUnitLocalServiceBaseImpl
 * @see org.oep.usermgt.service.WorkingUnitLocalServiceUtil
 */
public class WorkingUnitLocalServiceImpl extends WorkingUnitLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.usermgt.service.WorkingUnitLocalServiceUtil} to access the Working Unit local service.
	 */
	/** 
	 * Thêm mới mới đơn vị
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  nqminh    Tạo mới
	 * @param userId: 
	 * @param groupId:
	 * @param companyId:
	 * @param createDate:Ngày tạo
	 * @param modifiedDate:Ngay sửa
	 * @param organizationId:Tổ chức trong cổng
	 * @param govAgencyId:Cơ quan định danh
	 * @param name:Tên cơ đơn vị
	 * @param enName:Tên đơn vị tiếng anh
	 * @param parentWorkingUnitId:Đơn vị cấp trên
	 * @param address:Địa chỉ 
	 * @param cityNo:
	 * @param cityName:Tỉnh/Thành phố
	 * @param districtNo:
	 * @param districtName:Quận/Huyện
	 * @param wardNo:
	 * @param wardName:Xã/Phường
	 * @param gpsPosition:Tọa độ
	 * @param telNo:Điện thoại
	 * @param fax:Fax
	 * @param email:Email
	 * @param website:Website
	 */
	@Indexable(type = IndexableType.REINDEX)	
	public WorkingUnit addWorkingUnit(
			long organizationId,
			String govAgencyId,
			String name,
			String enName,
			long parentWorkingUnitId,
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
			String website,
			long localSiteId,
			int isEmployer,
			ServiceContext serviceContext) throws SystemException, PortalException {
		//validate(collectionName, dataCode, title, status);
		long id = counterLocalService.increment();
		WorkingUnit workingUnit = workingUnitPersistence.create(id);
		Date now = new Date();
		workingUnit.setOrganizationId(organizationId);
		workingUnit.setGovAgencyId(govAgencyId);
		workingUnit.setName(name);
		workingUnit.setEnName(enName);
		workingUnit.setParentWorkingUnitId(parentWorkingUnitId);
		workingUnit.setAddress(address);
		workingUnit.setCityNo(cityNo);
		workingUnit.setCityName(cityName);
		workingUnit.setDistrictNo(districtNo);
		workingUnit.setDistrictName(districtName);
		workingUnit.setWardNo(wardNo);
		workingUnit.setWardName(wardName);
		workingUnit.setGpsPosition(gpsPosition);
		workingUnit.setTelNo(telNo);
		workingUnit.setFax(fax);
		workingUnit.setEmail(email);
		workingUnit.setWebsite(website);
		workingUnit.setLocalSiteId(localSiteId);
		workingUnit.setIsEmployer(isEmployer);
		
		workingUnit.setCompanyId(serviceContext.getCompanyId());
		workingUnit.setGroupId(serviceContext.getScopeGroupId());
		workingUnit.setUserId(serviceContext.getUserId());
		workingUnit.setCreateDate(serviceContext.getCreateDate(now));
		workingUnit.setModifiedDate(serviceContext.getCreateDate(now));
		
		workingUnitPersistence.update(workingUnit);
		if (_log.isInfoEnabled()) {
			_log.info("Create new application " + id);
		}
		
		if (serviceContext.isAddGroupPermissions() || serviceContext.isAddGuestPermissions()) {
			_log.info("Create new application  1" + id);
			addWorkingUnitResources(workingUnit, serviceContext.isAddGroupPermissions(), serviceContext.isAddGuestPermissions(), serviceContext);
			
		}
		else {
			_log.info("Create new application 2" + id);
			addWorkingUnitResources(workingUnit, serviceContext.getGroupPermissions(), serviceContext.getGuestPermissions(), serviceContext);
			
		}
		return getWorkingUnit(id);
	}
	

	public WorkingUnit updateWorkingUnit(
			long workingUnitId,
			long organizationId,
			String govAgencyId,
			String name,
			String enName,
			long parentWorkingUnitId,
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
			String website,
			long localSiteId,
			int isEmployer,
			ServiceContext serviceContext)
		throws PortalException, SystemException {
		WorkingUnit workingUnit = workingUnitPersistence.findByPrimaryKey(workingUnitId);
		workingUnit.setOrganizationId(organizationId);
		workingUnit.setGovAgencyId(govAgencyId);
		workingUnit.setName(name);
		workingUnit.setEnName(enName);
		workingUnit.setParentWorkingUnitId(parentWorkingUnitId);
		workingUnit.setAddress(address);
		workingUnit.setCityNo(cityNo);
		workingUnit.setCityName(cityName);
		workingUnit.setDistrictNo(districtNo);
		workingUnit.setDistrictName(districtName);
		workingUnit.setWardNo(wardNo);
		workingUnit.setWardName(wardName);
		workingUnit.setGpsPosition(gpsPosition);
		workingUnit.setTelNo(telNo);
		workingUnit.setFax(fax);
		workingUnit.setEmail(email);
		workingUnit.setWebsite(website);
		workingUnit.setLocalSiteId(localSiteId);
		workingUnit.setIsEmployer(isEmployer);
		Date now = new Date();
		workingUnit.setModifiedDate(serviceContext.getModifiedDate(now));
		workingUnitPersistence.update(workingUnit);

		if ((serviceContext.getGroupPermissions() != null) ||
			(serviceContext.getGuestPermissions() != null)) {

			updateWorkingUnitResources(
				workingUnit, serviceContext.getGroupPermissions(),
				serviceContext.getGuestPermissions(), serviceContext);
		}

		return getWorkingUnit(workingUnit.getWorkingUnitId());
	}
	public WorkingUnit saveWorkingUnit(WorkingUnit workingUnit, ServiceContext serviceContext) throws PortalException, SystemException {
		return updateWorkingUnit(workingUnit.getWorkingUnitId(), 
				workingUnit.getOrganizationId(),
				workingUnit.getGovAgencyId(),
				workingUnit.getName(),
				workingUnit.getEnName(),
				workingUnit.getParentWorkingUnitId(),
				workingUnit.getAddress(),
				workingUnit.getCityNo(),
				workingUnit.getCityName(),
				workingUnit.getDistrictNo(),
				workingUnit.getDistrictName(),
				workingUnit.getWardNo(),
				workingUnit.getWardName(),
				workingUnit.getGpsPosition(),
				workingUnit.getTelNo(),
				workingUnit.getFax(),
				workingUnit.getEmail(),
				workingUnit.getWebsite(),
				workingUnit.getLocalSiteId(),
				workingUnit.getIsEmployer(),
				serviceContext);
	}
	
	public void updateWorkingUnitResources(
			WorkingUnit workingUnit, String[] groupPermissions,
			String[] guestPermissions, ServiceContext serviceContext)
		throws PortalException, SystemException {

		resourceLocalService.updateResources(
			workingUnit.getCompanyId(), serviceContext.getGuestOrUserId(),
			WorkingUnit.class.getName(), workingUnit.getWorkingUnitId(), groupPermissions,
			guestPermissions);
	}
	public void removeWorkingUnit(WorkingUnit workingUnit) throws PortalException, SystemException {
		workingUnitPersistence.remove(workingUnit);
		resourceLocalService.deleteResource(workingUnit.getCompanyId(), WorkingUnit.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, workingUnit.getWorkingUnitId());
	}
	
	public void removeWorkingUnit(long id) throws PortalException, SystemException {
		WorkingUnit workingUnit = workingUnitPersistence.findByPrimaryKey(id);
		removeWorkingUnit(workingUnit);
	}
	
	public WorkingUnit getWorkingUnit(long id) throws PortalException, SystemException {
		return workingUnitPersistence.findByPrimaryKey(id);
	}

	public void addWorkingUnitResources(WorkingUnit workingUnit, boolean addGroupPermission, boolean addGuestPermission, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addResources(workingUnit.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), WorkingUnit.class.getName(), workingUnit.getWorkingUnitId(), false, addGroupPermission, addGuestPermission);
	}

	public void addWorkingUnitResources(WorkingUnit workingUnit, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addModelResources(workingUnit.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), WorkingUnit.class.getName(), workingUnit.getWorkingUnitId(), groupPermissions, guestPermissions);
	}
	
	public void addWorkingUnitResources(long id, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		WorkingUnit workingUnit = workingUnitPersistence.findByPrimaryKey(id);
		addWorkingUnitResources(workingUnit, groupPermissions, guestPermissions, serviceContext);
	}
	/* Company */
	public int countWorkingUnitByCompany(ServiceContext serviceContext) throws PortalException, SystemException {
		return workingUnitPersistence.countByC(serviceContext.getCompanyId());
	}
	
	public List<WorkingUnit> getByCompany(ServiceContext serviceContext) throws PortalException, SystemException {
		return workingUnitPersistence.findByC(serviceContext.getCompanyId());
	}
	
	public List<WorkingUnit> getByCompany(int start, int end, ServiceContext serviceContext) throws PortalException, SystemException {
		return workingUnitPersistence.findByC(serviceContext.getCompanyId(), start, end);
	}
	
	/* Company AND parentWorkingUnit*/
	public int countWorkingUnitByCompanyParentWorkingUnit(long parentWorkingUnitId,ServiceContext serviceContext) throws PortalException, SystemException {
		return workingUnitPersistence.countByC_PW(serviceContext.getCompanyId(),parentWorkingUnitId);
	}
	
	public List<WorkingUnit> getByCompanyParentWorkingUnit(long parentWorkingUnitId, ServiceContext serviceContext) throws PortalException, SystemException {
		return workingUnitPersistence.findByC_PW(serviceContext.getCompanyId(),parentWorkingUnitId);
	}
	
	public List<WorkingUnit> getByCompanyParentWorkingUnit(long parentWorkingUnitId, int start, int end, ServiceContext serviceContext) throws PortalException, SystemException {
		return workingUnitPersistence.findByC_PW(serviceContext.getCompanyId(),parentWorkingUnitId, start, end);
	}
		
	/* Group  */
	public int countWorkingUnitByGroup(ServiceContext serviceContext) throws PortalException, SystemException {
		return workingUnitPersistence.countByG(serviceContext.getScopeGroupId());
	}
	
	public List<WorkingUnit> getByGroup(ServiceContext serviceContext) throws PortalException, SystemException {
		return workingUnitPersistence.findByG(serviceContext.getScopeGroupId());
	}
	
	public List<WorkingUnit> getByGroup(int start, int end, ServiceContext serviceContext) throws PortalException, SystemException {
		return workingUnitPersistence.findByC(serviceContext.getScopeGroupId(), start, end);
	}
	/* Group AND parentWorkingUnit*/
	public int countWorkingUnitByGroupParentWorkingUnit(long parentWorkingUnitId,ServiceContext serviceContext) throws PortalException, SystemException {
		return workingUnitPersistence.countByG_PW(serviceContext.getScopeGroupId(),parentWorkingUnitId);
	}
	
	public List<WorkingUnit> getByGroupParentWorkingUnit(long parentWorkingUnitId, ServiceContext serviceContext) throws PortalException, SystemException {
		return workingUnitPersistence.findByG_PW(serviceContext.getScopeGroupId(),parentWorkingUnitId);
	}
	
	public List<WorkingUnit> getByGroupParentWorkingUnit(long parentWorkingUnitId, int start, int end, ServiceContext serviceContext) throws PortalException, SystemException {
		return workingUnitPersistence.findByG_PW(serviceContext.getScopeGroupId(),parentWorkingUnitId, start, end);
	}
	
	/* Tim theo ten */
	public int countWorkingUnitByLikeName(String textSearch, long parentWorkingUnitId, ServiceContext serviceContext) throws SystemException {
		return workingUnitFinder.countByLikeName(textSearch,parentWorkingUnitId,serviceContext);
	}
	
	public List<WorkingUnit> finderByLikeName(String textSearch, long parentWorkingUnitId,ServiceContext serviceContext) throws SystemException {
		return workingUnitFinder.findByLikeName(textSearch, parentWorkingUnitId, serviceContext);
	}
	
	public List<Object[]> finderByLikeNameShort(String textSearch, long parentWorkingUnitId,ServiceContext serviceContext) throws SystemException {
		return workingUnitFinder.findByLikeNameShort(textSearch, parentWorkingUnitId, serviceContext);
	}
	
	public List<WorkingUnit> finderByLikeName(String textSearch, long parentWorkingUnitId,int startIndex, int endIndex, ServiceContext serviceContext) throws SystemException {
		return workingUnitFinder.findByLikeName(textSearch, parentWorkingUnitId, startIndex, endIndex, serviceContext);
	}
	
	public List<Object[]> finderByLikeNameShort(String textSearch, long parentWorkingUnitId,int startIndex, int endIndex, ServiceContext serviceContext) throws SystemException {
		return workingUnitFinder.findByLikeNameShort(textSearch, parentWorkingUnitId, startIndex, endIndex, serviceContext);
	}
	
	public List<WorkingUnit> getByCompanyTree (ServiceContext serviceContext) throws SystemException {
		ArrayList<WorkingUnit> kq = new ArrayList<WorkingUnit>();
		
		List<WorkingUnit> luu = workingUnitPersistence.findByC_PW(serviceContext.getCompanyId(),0);
		//System.out.println(" rrrrrrrrrrr " + luu.size());
		int i = 0;
		 kq.addAll(luu);
		 while (i < kq.size()){ 
			 List<WorkingUnit> tg = workingUnitPersistence.findByC_PW(serviceContext.getCompanyId(),kq.get(i).getWorkingUnitId());
			// System.out.println(" ttttttt " + tg.size());
			 i++;
			 if (tg.size() > 0)  kq.addAll(i, tg);
		 }
		return kq;
	}
	private static Log _log = LogFactoryUtil.getLog(WorkingUnitLocalServiceImpl.class);	
}