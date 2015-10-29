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

/** 
 * Copyright (c) 2015 by Open eGovPlatform (http://http://openegovplatform.org/).
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
  */

package org.oep.core.dossiermgt.service.impl;

import java.util.Date;
import java.util.List;

import org.oep.core.datamgt.dictionary.model.DictData;
import org.oep.core.datamgt.service.DictionaryAppLocalServiceUtil;
import org.oep.core.dossiermgt.DossierProcEffectExpireDateException;
import org.oep.core.dossiermgt.DossierProcNoException;
import org.oep.core.dossiermgt.model.DossierProc;
import org.oep.core.dossiermgt.service.base.DossierProcLocalServiceBaseImpl;

import com.liferay.portal.kernel.dao.orm.QueryDefinition;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.IndexerRegistryUtil;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;

/**
 * Lớp dịch vụ cục bộ thao tác với thực thể thủ tục hành chính công
 *
 * Đây là lớp dịch vụ cục bộ cho nên sẽ không kiểm tra quyền truy cập.
 * </p>
 *
 * @author trungdk
 * @see org.oep.core.dossiermgt.service.base.DossierProcLocalServiceBaseImpl
 * @see org.oep.core.dossiermgt.service.DossierProcLocalServiceUtil
 */
public class DossierProcLocalServiceImpl extends DossierProcLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.core.dossiermgt.service.DossierProcLocalServiceUtil} to access the dossier proc local service.
	 */
	
	/** 
	 * Thêm mới một thủ tục hành chính công
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới thủ tục hành chính
	 * @param dossierProcNo mã thủ tục hành chính
	 * @param name tên thủ tục hành chính
	 * @param enName tên Tiếng Anh của thủ tục hành chính
	 * @param shortName tên viết tắt
	 * @param processDescription Trình tự thực hiện thủ tục hành chính
	 * @param methodDescription Cách thức thực hiện
	 * @param dossierDescription Thành phần hồ sơ
	 * @param conditionDescription Điều kiện thực hiện
	 * @param durationDescription Thời hạn giải quyết
	 * @param actorsDescription Đối tượng thực hiện thủ tục
	 * @param resultsDescription Mô tả kết quả thủ tục
	 * @param recordsDescription Mô tả căn cứ pháp lý HTML
	 * @param feeDescription Mô tả phí và lệ phí thực hiện
	 * @param instructionsDescription Mô tả hướng dẫn dạng HTML
	 * @param administrationNo Cấp quản lý
	 * @param domainNo Đơn vị quản lý
	 * @param effectDate Ngày bắt đầu có hiệu lực
	 * @param expireDate Ngày hết hiệu lực
	 * @param active Trạng thái hoạt động của thủ tục hành chính
	 * @param serviceContext ngữ cảnh dịch vụ
	 * @return: đối tượng thủ tục hành chính mới được thêm vào
	 */
	@Indexable(type = IndexableType.REINDEX)	
	public DossierProc addDossierProc(
			long userId,
			String dossierProcNo, 
			String name, 
			String enName,
			String shortName,
			String processDescription,
			String methodDescription,
			String dossierDescription,
			String conditionDescription,
			String durationDescription,
			String actorsDescription,
			String resultsDescription,
			String recordsDescription,
			String feeDescription,
			String instructionsDescription,
			String administrationNo,
			String domainNo,
			int forCitizen,
			int forBusiness,
			Date effectDate,
			Date expireDate,
			int statusActive,
			ServiceContext serviceContext) throws SystemException, PortalException {
		validate(-1, dossierProcNo, administrationNo, domainNo, effectDate, expireDate, true, serviceContext);
		long id = counterLocalService.increment();
		DossierProc dossierProc = dossierProcPersistence.create(id);
		Date now = new Date();
		
		User user = userPersistence.findByPrimaryKey(userId);
		
		dossierProc.setDossierProcNo(dossierProcNo);
		dossierProc.setName(name);
		dossierProc.setEnName(enName);
		dossierProc.setShortName(shortName);
		dossierProc.setProcessDescription(processDescription);
		dossierProc.setMethodDescription(methodDescription);
		dossierProc.setDossierDescription(dossierDescription);
		dossierProc.setConditionDescription(conditionDescription);
		dossierProc.setDurationDescription(durationDescription);
		dossierProc.setActorsDescription(actorsDescription);
		dossierProc.setResultsDescription(resultsDescription);
		dossierProc.setRecordsDescription(recordsDescription);
		dossierProc.setFeeDescription(feeDescription);
		dossierProc.setInstructionsDescription(instructionsDescription);
		dossierProc.setAdministrationNo(administrationNo);
		//String administrationName = DictionaryAppLocalServiceUtil.getDictDataByCode("OEP_CAPQUANLY", administrationNo, serviceContext).getTitle();
		String administrationName = administrationNo;
		dossierProc.setAdministrationName(administrationName);
		dossierProc.setDomainNo(domainNo);
		//String domainName = DictionaryAppLocalServiceUtil.getDictDataByCode("OEP_LINHVUCTHUTUC", domainNo, serviceContext).getTitle();
		String domainName = domainNo;
		dossierProc.setDomainName(domainName);
		dossierProc.setEffectDate(effectDate);
		dossierProc.setExpireDate(expireDate);
		dossierProc.setForCitizen(forCitizen);
		dossierProc.setForBusiness(forBusiness);
		dossierProc.setStatusActive(statusActive);
		
		dossierProc.setCompanyId(user.getCompanyId());
		dossierProc.setCreateDate(serviceContext.getCreateDate(now));
		dossierProc.setModifiedDate(serviceContext.getModifiedDate(now));
		
		dossierProcPersistence.update(dossierProc);

		if (_log.isInfoEnabled()) {
			_log.info("Create new dossier proc " + id);
		}
		
		if (serviceContext.isAddGroupPermissions() || serviceContext.isAddGuestPermissions()) {
			addDossierProcResources(dossierProc, serviceContext.isAddGroupPermissions(), serviceContext.isAddGuestPermissions(), serviceContext);
		}
		else {
			addDossierProcResources(dossierProc, serviceContext.getGroupPermissions(), serviceContext.getGuestPermissions(), serviceContext);
		}
		return getDossierProc(id);
	}
	
	/** 
	 * Cập nhật thông tin một thủ tục hành chính công
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Cập nhật thông tin thủ tục hành chính
	 * @param id mã phân biệt của thủ tục hành chính
	 * @param dossierProcNo mã thủ tục hành chính
	 * @param name tên thủ tục hành chính
	 * @param enName tên Tiếng Anh của thủ tục hành chính
	 * @param shortName tên viết tắt
	 * @param processDescription Trình tự thực hiện thủ tục hành chính
	 * @param methodDescription Cách thức thực hiện
	 * @param dossierDescription Thành phần hồ sơ
	 * @param conditionDescription Điều kiện thực hiện
	 * @param durationDescription Thời hạn giải quyết
	 * @param actorsDescription Đối tượng thực hiện thủ tục
	 * @param resultsDescription Mô tả kết quả thủ tục
	 * @param recordsDescription Mô tả căn cứ pháp lý HTML
	 * @param feeDescription Mô tả phí và lệ phí thực hiện
	 * @param instructionsDescription Mô tả hướng dẫn dạng HTML
	 * @param administrationNo Cấp quản lý
	 * @param domainNo Đơn vị quản lý
	 * @param effectDate Ngày bắt đầu có hiệu lực
	 * @param expireDate Ngày hết hiệu lực
	 * @param active Trạng thái hoạt động của thủ tục hành chính
	 * @param serviceContext ngữ cảnh dịch vụ
	 * @return: đối tượng thủ tục hành chính mới được cập nhật thông tin
	 */
	@Indexable(type = IndexableType.REINDEX)
	public DossierProc updateDossierProc(
			long id, 
			String dossierProcNo, 
			String name, 
			String enName,
			String shortName,
			String processDescription,
			String methodDescription,
			String dossierDescription,
			String conditionDescription,
			String durationDescription,
			String actorsDescription,
			String resultsDescription,
			String recordsDescription,
			String feeDescription,
			String instructionsDescription,
			String administrationNo,
			String domainNo,
			int forCitizen,
			int forBusiness,
			Date effectDate,
			Date expireDate,
			int statusActive,
			ServiceContext serviceContext)
		throws PortalException, SystemException {

		validate(id, dossierProcNo, administrationNo, domainNo, effectDate, expireDate, true, serviceContext);

		DossierProc dossierProc = dossierProcPersistence.findByPrimaryKey(id);

		dossierProc.setModifiedDate(serviceContext.getModifiedDate(null));
		dossierProc.setDossierProcNo(dossierProcNo);
		dossierProc.setName(name);
		dossierProc.setEnName(enName);
		dossierProc.setShortName(shortName);
		dossierProc.setProcessDescription(processDescription);
		dossierProc.setMethodDescription(methodDescription);
		dossierProc.setDossierDescription(dossierDescription);
		dossierProc.setConditionDescription(conditionDescription);
		dossierProc.setDurationDescription(durationDescription);
		dossierProc.setActorsDescription(actorsDescription);
		dossierProc.setResultsDescription(resultsDescription);
		dossierProc.setRecordsDescription(recordsDescription);
		dossierProc.setFeeDescription(feeDescription);
		dossierProc.setInstructionsDescription(instructionsDescription);
		dossierProc.setAdministrationNo(administrationNo);
		//String administrationName = DictionaryAppLocalServiceUtil.getDictDataByCode("OEP_CAPQUANLY", administrationNo, serviceContext).getTitle();
		String administrationName = administrationNo;
		dossierProc.setAdministrationName(administrationName);
		dossierProc.setDomainNo(domainNo);
		//String domainName = DictionaryAppLocalServiceUtil.getDictDataByCode("OEP_LINHVUCTHUTUC", domainNo, serviceContext).getTitle();
		String domainName = domainNo;
		dossierProc.setDomainName(domainName);
		dossierProc.setEffectDate(effectDate);
		dossierProc.setExpireDate(expireDate);
		dossierProc.setForCitizen(forCitizen);
		dossierProc.setForBusiness(forBusiness);
		dossierProc.setStatusActive(statusActive);

		dossierProcPersistence.update(dossierProc);

		if ((serviceContext.getGroupPermissions() != null) ||
			(serviceContext.getGuestPermissions() != null)) {

			updateDossierProcResources(
				dossierProc, serviceContext.getGroupPermissions(),
				serviceContext.getGuestPermissions(), serviceContext);
		}

		return getDossierProc(dossierProc.getDossierProcId());
	}

	/** 
	 * Cập nhật thông tin một thủ tục hành chính công
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Cập nhật thông tin thủ tục hành chính
	 * @param dossierProc Thủ tục hành chính cần cập nhật thông tin
	 * @param serviceContext ngữ cảnh dịch vụ
	 * @return: đối tượng thủ tục hành chính mới được cập nhật thông tin
	 */
	@Indexable(type = IndexableType.REINDEX)
	public DossierProc updateDossierProc(
		DossierProc dossierProc,
		ServiceContext serviceContext
		) throws PortalException, SystemException {
		return updateDossierProc(dossierProc.getDossierProcId(), dossierProc.getDossierProcNo(), dossierProc.getName(), dossierProc.getEnName(), dossierProc.getShortName(), dossierProc.getProcessDescription(), dossierProc.getMethodDescription(), dossierProc.getDossierDescription(), dossierProc.getConditionDescription(), dossierProc.getDurationDescription(), dossierProc.getActorsDescription(), dossierProc.getResultsDescription(), dossierProc.getRecordsDescription(), dossierProc.getFeeDescription(), dossierProc.getInstructionsDescription(), dossierProc.getAdministrationNo(), dossierProc.getDomainNo(), dossierProc.getForCitizen(), dossierProc.getForBusiness(), dossierProc.getEffectDate(), dossierProc.getExpireDate(), dossierProc.getStatusActive(), serviceContext);
	}
	
	private void updateDossierProcResources(
			DossierProc dossierProc, String[] groupPermissions,
			String[] guestPermissions, ServiceContext serviceContext)
		throws PortalException, SystemException {

		resourceLocalService.updateResources(
			dossierProc.getCompanyId(), serviceContext.getScopeGroupId(),
			DossierProc.class.getName(), dossierProc.getDossierProcId(), groupPermissions,
			guestPermissions);
	}
	
	/** 
	 * Xóa bỏ thông tin một thủ tục hành chính công
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Xóa bỏ thông tin thủ tục hành chính
	 * @param dossierProc Thủ tục hành chính sẽ bị xóa
	 * @return
	 */
	public void removeDossierProc(DossierProc dossierProc) throws PortalException, SystemException {
		dossierProcPersistence.remove(dossierProc);
		Indexer indexer = IndexerRegistryUtil.nullSafeGetIndexer(DossierProc.class);
		indexer.delete(dossierProc);
		resourceLocalService.deleteResource(dossierProc.getCompanyId(), DossierProc.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, dossierProc.getDossierProcId());
	}
	
	/** 
	 * Xóa bỏ thông tin một thủ tục hành chính công
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Xóa bỏ thông tin thủ tục hành chính
	 * @param id mã phân biệt thủ tục hành chính
	 * @return
	 */
	public void removeDossierProc(long id) throws PortalException, SystemException {
		DossierProc dossierProc = dossierProcPersistence.findByPrimaryKey(id);
		dossierProcLocalService.removeDossierProc(dossierProc);
	}
	
	/** 
	 * Xóa bỏ thông tin tất cả thủ tục hành chính công thuộc một nhóm
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Xóa bỏ thông tin thủ tục hành chính công thuộc một nhóm
	 * @param groupId mã nhóm quản lý thủ tục hành chính
	 * @return
	 */
	public void deleteDossierProcs(long groupId) throws PortalException, SystemException {
		for (DossierProc dossierProc : dossierProcPersistence.findByGroupId(groupId)) {
			dossierProcLocalService.removeDossierProc(dossierProc);
		}
	}
	public DossierProc getDossierProc(long id) throws PortalException, SystemException {
		return dossierProcPersistence.findByPrimaryKey(id);
	}

	private void addDossierProcResources(DossierProc dossierProc, boolean addGroupPermission, boolean addGuestPermission, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addResources(dossierProc.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), DossierProc.class.getName(), dossierProc.getDossierProcId(), false, addGroupPermission, addGuestPermission);
	}

	private void addDossierProcResources(DossierProc dossierProc, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addModelResources(dossierProc.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), DossierProc.class.getName(), dossierProc.getDossierProcId(), groupPermissions, guestPermissions);
	}
	
	protected void addDossierProcResources(long id, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		DossierProc dossierProc = dossierProcPersistence.findByPrimaryKey(id);
		addDossierProcResources(dossierProc, groupPermissions, guestPermissions, serviceContext);
	}
	
	protected void validate(long id, String dossierProcNo, String administrationNo, String domainNo, Date effectDate, Date expireDate, boolean createNew, ServiceContext serviceContext) throws PortalException, SystemException {
		if (Validator.isNull(dossierProcNo)) {
			throw new DossierProcNoException("Mã thủ tục hành chính phải có giá trị");
		}
		
		//Kiểm tra tính trùng nhau của mã thủ tục hành chính
		if (createNew) {
			DossierProc proc = getByDossierProcNo(dossierProcNo, serviceContext);
			if (proc != null) {
				throw new DossierProcNoException();
			}
		}
		else {
			DossierProc proc = getByDossierProcNo(dossierProcNo, serviceContext);
			if (proc.getDossierProcId() != id) {
				throw new DossierProcNoException();
			}
		}
		
		if (effectDate != null && expireDate != null) {
			int value = DateUtil.compareTo(effectDate, expireDate);
			if (value > 0) {
				throw new DossierProcEffectExpireDateException();
			}
		}
		
		//Kiểm tra mã cấp quản lý có tồn tại hay không
		boolean checkAdministrationNo = false;
		DictData administration = DictionaryAppLocalServiceUtil.getDictDataByCode("OEP_CAPQUANLY", administrationNo, serviceContext);
		if (administration == null)
			checkAdministrationNo = true;
		if (checkAdministrationNo) {
			//throw new NoSuchAdministrationException();
		}
		
		//Kiểm tra lĩnh vực thủ tục có tồn tại hay không
		boolean checkDomainNo = false;
		DictData domain = DictionaryAppLocalServiceUtil.getDictDataByCode("OEP_LINHVUCTHUTUC", domainNo, serviceContext);
		if (domain == null)
			checkDomainNo = true;
		if (checkDomainNo) {
			//throw new NoSuchDomainException();
		}
	}
	
	/** 
	 * Lấy thông tin một thủ tục hành chính công dựa vào mã thủ tục hành chính
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Lấy thông tin thủ tục hành chính
	 * @param dossierProcNo mã thủ tục hành chính
	 * @param serviceContext ngữ cảnh dịch vụ
	 * @return thủ tục hành chính
	 */
	public DossierProc getByDossierProcNo(String dossierProcNo, ServiceContext serviceContext) throws PortalException, SystemException {
		return dossierProcPersistence.fetchByC_G_DPN(serviceContext.getCompanyId(), serviceContext.getScopeGroupId(), dossierProcNo);
	}
	
	/** 
	 * Tìm kiếm tất cả thủ tục hành chính của một cấp quản lý
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tìm kiếm thủ tục hành chính của một cấp
	 * @param dossierProcNo mã thủ tục hành chính
	 * @param serviceContext ngữ cảnh dịch vụ
	 * @return danh sách thủ tục hành chính của một cấp quản lý
	 */
	public List<DossierProc> findAllByAdministrationNo(String administrationNo, ServiceContext serviceContext) throws PortalException, SystemException {
		return dossierProcPersistence.findByC_ANO(serviceContext.getCompanyId(), administrationNo);
	}
	
	/** 
	 * Tìm kiếm tất cả thủ tục hành chính của thuộc một lĩnh vực
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tìm kiếm thủ tục hành chính thuộc một lĩnh vực
	 * @param dossierProcNo mã thủ tục hành chính
	 * @param serviceContext ngữ cảnh dịch vụ
	 * @return danh sách thủ tục hành chính của một lĩnh vực
	 */
	public List<DossierProc> findAllByDomainNo(String domainNo, ServiceContext serviceContext) throws PortalException, SystemException {
		return dossierProcPersistence.findByC_DNO(serviceContext.getCompanyId(), domainNo);
	}
	
	/** 
	 * Tìm kiếm tất cả thủ tục hành chính của thuộc một lĩnh vực và cấp quản lý nào đó
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tìm kiếm thủ tục hành chính thuộc một lĩnh vực và cấp quản lý
	 * @param dossierProcNo mã thủ tục hành chính
	 * @param serviceContext ngữ cảnh dịch vụ
	 * @return danh sách thủ tục hành chính của một lĩnh vực và cấp quản lý
	 */
	public List<DossierProc> findAllByAdministrationAndDomain(String administrationNo, String domainNo, ServiceContext serviceContext) throws PortalException, SystemException {
		return dossierProcPersistence.findByC_ANO_DNO(serviceContext.getCompanyId(), administrationNo, domainNo);
	}
	
	/** 
	 * Tìm kiếm tất cả thủ tục hành chính của thuộc một lĩnh vực và cấp quản lý của một đơn vị
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tìm kiếm thủ tục hành chính thuộc một lĩnh vực và cấp quản lý của một đơn vị
	 * @param dossierProcNo mã thủ tục hành chính
	 * @param serviceContext ngữ cảnh dịch vụ
	 * @return danh sách thủ tục hành chính của một lĩnh vực và cấp quản lý của một đơn vị
	 */
	public List<DossierProc> findByGroupAdministrationAndDomain(String administrationNo, String domainNo, ServiceContext serviceContext) throws PortalException, SystemException {
		return dossierProcPersistence.findByC_G_ANO_DNO(serviceContext.getCompanyId(), serviceContext.getScopeGroupId(), administrationNo, domainNo);
	}
	
	public List<DossierProc> getCompanyDossierProcs(long companyId, QueryDefinition queryDefinition) throws SystemException {
		return dossierProcPersistence.findByC(companyId, queryDefinition.getStart(), queryDefinition.getEnd(), queryDefinition.getOrderByComparator());
	}
	
	public int getCompanyDossierProcsCount(long companyId, QueryDefinition queryDefinition) throws SystemException {
		return dossierProcPersistence.countByC(companyId);
	}
	
	public List<DossierProc> findByGroupLikeName(String name, int startIndex, int endIndex, ServiceContext serviceContext) throws SystemException {
		return dossierProcFinder.findByGroupLikeName(name, startIndex, endIndex, serviceContext);
	}
	
	public int countByGroupLikeName(String name, ServiceContext serviceContext) throws SystemException {
		return dossierProcFinder.countByGroupLikeName(name, serviceContext);
	}
	
	public List<DossierProc> findByLikeName(String name, int startIndex, int endIndex, ServiceContext serviceContext) throws SystemException {
		return dossierProcFinder.findByLikeName(name, startIndex, endIndex, serviceContext);
	}
	
	public int countByLikeName(String name, ServiceContext serviceContext) throws SystemException {
		return dossierProcFinder.countByLikeName(name, serviceContext);
	}
	
	public List<DossierProc> findByCustomCondition(String name, Date effectDate, Date expireDate, int active, int startIndex, int endIndex, ServiceContext serviceContext) throws SystemException {
		return dossierProcFinder.findByCustomCondition(name, effectDate, expireDate, active, startIndex, endIndex, serviceContext);
	}
	
	public int countByCustomCondition(String name, Date effectDate, Date expireDate, int active, ServiceContext serviceContext) throws SystemException {
		return dossierProcFinder.countByCustomCondition(name, effectDate, expireDate, active, serviceContext);
	}

	public List<DossierProc> findByGroupCustomCondition(String name, String administrationNo, String domainNo, Date effectDate, Date expireDate, int active, int startIndex, int endIndex, ServiceContext serviceContext) throws SystemException {
		return dossierProcFinder.findByGroupCustomCondition(name, administrationNo, domainNo, effectDate, expireDate, active, startIndex, endIndex, serviceContext);
	}
	
	public int countByGroupCustomCondition(String name, String administrationNo, String domainNo, Date effectDate, Date expireDate, int active, ServiceContext serviceContext) throws SystemException {
		return dossierProcFinder.countByGroupCustomCondition(name, administrationNo, domainNo, effectDate, expireDate, active, serviceContext);
	}
	
	public List<DossierProc> findByCompany(long companyId) throws SystemException {
		return dossierProcPersistence.findByC(companyId);
	}
	
	public List<DossierProc> findByCompany(ServiceContext serviceContext) throws SystemException {
		return dossierProcPersistence.findByC(serviceContext.getCompanyId());
	}
	
	private static Log _log = LogFactoryUtil.getLog(DossierProcLocalServiceImpl.class);
	
}