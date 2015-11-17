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

package org.oep.processmgt.service.impl;

import java.util.Date;

import org.oep.processmgt.model.DossierProc2Process;
import org.oep.processmgt.service.base.DossierProc2ProcessLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.IndexerRegistryUtil;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.service.ServiceContext;

/**
 * API cung cấp thao tác với dữ liệu quy trình trong thủ tục hành chính.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.processmgt.service.DossierProc2ProcessLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author trungdk
 * @see org.oep.processmgt.service.base.DossierProc2ProcessLocalServiceBaseImpl
 * @see org.oep.processmgt.service.DossierProc2ProcessLocalServiceUtil
 */
public class DossierProc2ProcessLocalServiceImpl
	extends DossierProc2ProcessLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.processmgt.service.DossierProc2ProcessLocalServiceUtil} to access the dossier proc2 process local service.
	 */
	
	/** 
	 * Thêm mới một cấu hình thủ tục thực hiện bên ứng dụng một cửa
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param dossierProcId mã thủ tục hành chính
	 * @param govAgencyId tham chiếu cơ quan xử lý hồ sơ
	 * @param govAgencyName tham chiếu cơ quan xử lý hồ sơ
	 * @param dossierProcessId mã quy trình xử lý thủ tục hành chính
	 * @param aaaa 4 số cố định cấp phát cho thủ tục
	 * @param bbb 3 số lặp quay vòng để tránh trùng lặp
	 * @param daysDuration số ngày xử lý thủ tục
	 * @param paymentFee số tiền phí thủ tục phải thanh toán ban đầu
	 * @param paymentOnegate cho phép thanh toán qua một cửa
	 * @param paymentEservice cho phép thanh toán bằng hình thức online
	 * @param organizationId cấu hình org nhận từ cổng dịch vụ
	 * @param ebPartnershipId service được sử dụng để trao đổi thông tin hồ sơ với cổng
	 * @param serviceContext ngữ cảnh dịch vụ
	 * @return: tag hồ sơ mới được tạo
	 */
	@Indexable(type = IndexableType.REINDEX)	
	public DossierProc2Process addDossierProc2Process(
			long dossierProcId,
			String govAgencyId,
			String govAgencyName,
			long dossierProcessId,
			String aaaa,
			String bbb,
			int daysDuration,
			int paymentFee,
			int paymentOnegate,
			int paymentEservice,
			long organizationId,
			long ebPartnershipId,
			ServiceContext serviceContext) throws SystemException, PortalException {
		long id = counterLocalService.increment();
		DossierProc2Process dossierProc2Process = dossierProc2ProcessPersistence.create(id);
		Date now = new Date();
		
		dossierProc2Process.setUserId(serviceContext.getUserId());
		dossierProc2Process.setCompanyId(serviceContext.getCompanyId());
		dossierProc2Process.setGroupId(serviceContext.getScopeGroupId());
		dossierProc2Process.setCreateDate(serviceContext.getCreateDate(now));
		dossierProc2Process.setDossierProcId(dossierProcId);
		dossierProc2Process.setGovAgencyId(govAgencyId);
		dossierProc2Process.setGovAgencyName(govAgencyName);
		dossierProc2Process.setDossierProcessId(dossierProcessId);
		dossierProc2Process.setAaaa(aaaa);
		dossierProc2Process.setBbb(bbb);
		dossierProc2Process.setDaysDuration(daysDuration);
		dossierProc2Process.setPaymentFee(paymentFee);
		dossierProc2Process.setPaymentOneGate(paymentOnegate);
		dossierProc2Process.setPaymentEservice(paymentEservice);
		dossierProc2Process.setOrganizationId(organizationId);
		dossierProc2Process.setEbPartnershipId(ebPartnershipId);
		
		dossierProc2ProcessPersistence.update(dossierProc2Process);

		if (_log.isInfoEnabled()) {
			_log.info("Create new dossier proc 2 process " + id);
		}
		
		if (serviceContext.isAddGroupPermissions() || serviceContext.isAddGuestPermissions()) {
			addDossierProc2ProcessResources(dossierProc2Process, serviceContext.isAddGroupPermissions(), serviceContext.isAddGuestPermissions(), serviceContext);
		}
		else {
			addDossierProc2ProcessResources(dossierProc2Process, serviceContext.getGroupPermissions(), serviceContext.getGuestPermissions(), serviceContext);
		}
		return getDossierProc2Process(id);
	}
	
	/** 
	 * Cập nhật thông tin một cấu hình thủ tục bên ứng dụng một cửa
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Tạo mới
	 * @param id mã phân biệt của cấu hình thủ tục 
	 * @param dossierProcId mã thủ tục hành chính
	 * @param govAgencyId tham chiếu cơ quan xử lý hồ sơ
	 * @param govAgencyName tham chiếu cơ quan xử lý hồ sơ
	 * @param dossierProcessId mã quy trình xử lý thủ tục hành chính
	 * @param aaaa 4 số cố định cấp phát cho thủ tục
	 * @param bbb 3 số lặp quay vòng để tránh trùng lặp
	 * @param daysDuration số ngày xử lý thủ tục
	 * @param paymentFee số tiền phí thủ tục phải thanh toán ban đầu
	 * @param paymentOnegate cho phép thanh toán qua một cửa
	 * @param paymentEservice cho phép thanh toán bằng hình thức online
	 * @param organizationId cấu hình org nhận từ cổng dịch vụ
	 * @param ebPartnershipId service được sử dụng để trao đổi thông tin hồ sơ với cổng
	 * @param serviceContext ngữ cảnh dịch vụ
	 * @return: đối tượng cấu hình thủ tục mới được cập nhật thông tin
	 */
	@Indexable(type = IndexableType.REINDEX)
	public DossierProc2Process updateDossierProc2Process(
			long id, 
			long dossierProcId,
			String govAgencyId,
			String govAgencyName,
			long dossierProcessId,
			String aaaa,
			String bbb,
			int daysDuration,
			int paymentFee,
			int paymentOnegate,
			int paymentEservice,
			long organizationId,
			long ebPartnershipId,
			ServiceContext serviceContext)
		throws PortalException, SystemException {

		DossierProc2Process dossierProc2Process = dossierProc2ProcessPersistence.findByPrimaryKey(id);
		dossierProc2Process.setModifiedDate(serviceContext.getModifiedDate());
		dossierProc2Process.setDossierProcId(dossierProcId);
		dossierProc2Process.setGovAgencyId(govAgencyId);
		dossierProc2Process.setGovAgencyName(govAgencyName);
		dossierProc2Process.setDossierProcessId(dossierProcessId);
		dossierProc2Process.setAaaa(aaaa);
		dossierProc2Process.setBbb(bbb);
		dossierProc2Process.setDaysDuration(daysDuration);
		dossierProc2Process.setPaymentFee(paymentFee);
		dossierProc2Process.setPaymentOneGate(paymentOnegate);
		dossierProc2Process.setPaymentEservice(paymentEservice);
		dossierProc2Process.setOrganizationId(organizationId);
		dossierProc2Process.setEbPartnershipId(ebPartnershipId);

		dossierProc2ProcessPersistence.update(dossierProc2Process);

		if ((serviceContext.getGroupPermissions() != null) ||
			(serviceContext.getGuestPermissions() != null)) {

			updateDossierProc2ProcessResources(
				dossierProc2Process, serviceContext.getGroupPermissions(),
				serviceContext.getGuestPermissions(), serviceContext);
		}

		return getDossierProc2Process(dossierProc2Process.getDossierProc2ProcessId());
	}

	/** 
	 * Cập nhật thông tin một cấu hình thủ tục
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Cập nhật thông tin cấu hình thủ tục
	 * @param dossierProc2Process cấu hình thủ tục cần cập nhật
	 * @param serviceContext ngữ cảnh dịch vụ
	 * @return: đối tượng cấu hình thủ tục được cập nhật thông tin
	 */
	@Indexable(type = IndexableType.REINDEX)
	public DossierProc2Process updateDossierProc2Process(
		DossierProc2Process dossierProc2Process,
		ServiceContext serviceContext
		) throws PortalException, SystemException {
		return updateDossierProc2Process(dossierProc2Process.getDossierProc2ProcessId(), dossierProc2Process.getDossierProcId(), dossierProc2Process.getGovAgencyId(), dossierProc2Process.getGovAgencyName(), dossierProc2Process.getDossierProcessId(), dossierProc2Process.getAaaa(), dossierProc2Process.getBbb(), dossierProc2Process.getDaysDuration(), dossierProc2Process.getPaymentFee(), dossierProc2Process.getPaymentOneGate(), dossierProc2Process.getPaymentEservice(), dossierProc2Process.getOrganizationId(), dossierProc2Process.getEbPartnershipId(), serviceContext);
	}
	
	private void updateDossierProc2ProcessResources(
			DossierProc2Process dossierProc2Process, String[] groupPermissions,
			String[] guestPermissions, ServiceContext serviceContext)
		throws PortalException, SystemException {

		resourceLocalService.updateResources(
			dossierProc2Process.getCompanyId(), serviceContext.getScopeGroupId(),
			DossierProc2Process.class.getName(), dossierProc2Process.getDossierProc2ProcessId(), groupPermissions,
			guestPermissions);
	}
	
	/** 
	 * Xóa bỏ thông tin một cấu hình thủ tục
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Xóa bỏ thông tin cấu hình thủ tục
	 * @param dossierProc2Process cấu hình thủ tục cần xóa
	 * @return
	 */
	public void removeDossierProc2Process(DossierProc2Process dossierProc2Process) throws PortalException, SystemException {
		dossierProc2ProcessPersistence.remove(dossierProc2Process);
		Indexer indexer = IndexerRegistryUtil.nullSafeGetIndexer(DossierProc2Process.class);
		indexer.delete(dossierProc2Process);
		resourceLocalService.deleteResource(dossierProc2Process.getCompanyId(), DossierProc2Process.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, dossierProc2Process.getDossierProc2ProcessId());
	}
	
	/** 
	 * Xóa bỏ thông tin một cấu hình thủ tục
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Xóa bỏ thông tin cấu hình thủ tục
	 * @param id mã phân biệt cấu hình thủ tục
	 * @return
	 */
	public void removeDossierProc2Process(long id) throws PortalException, SystemException {
		DossierProc2Process dossierProc2Process = dossierProc2ProcessPersistence.findByPrimaryKey(id);
		dossierProc2ProcessLocalService.removeDossierProc2Process(dossierProc2Process);
	}
	
	public DossierProc2Process getDossierProc2Process(long id) throws PortalException, SystemException {
		return dossierProc2ProcessPersistence.findByPrimaryKey(id);
	}

	private void addDossierProc2ProcessResources(DossierProc2Process dossierProc2Process, boolean addGroupPermission, boolean addGuestPermission, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addResources(dossierProc2Process.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), DossierProc2Process.class.getName(), dossierProc2Process.getDossierProc2ProcessId(), false, addGroupPermission, addGuestPermission);
	}

	private void addDossierProc2ProcessResources(DossierProc2Process dossierProc2Process, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addModelResources(dossierProc2Process.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), DossierProc2Process.class.getName(), dossierProc2Process.getDossierProc2ProcessId(), groupPermissions, guestPermissions);
	}
	
	protected void addDossierProc2ProcessResources(long id, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		DossierProc2Process dossierProc2Process = dossierProc2ProcessPersistence.findByPrimaryKey(id);
		addDossierProc2ProcessResources(dossierProc2Process, groupPermissions, guestPermissions, serviceContext);
	}
					
	private static Log _log = LogFactoryUtil.getLog(DossierProc2ProcessLocalServiceImpl.class);	
	
}