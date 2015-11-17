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

package org.oep.dossiermgt.service.impl;

import java.util.Date;

import org.oep.dossiermgt.model.PaymentFile;
import org.oep.dossiermgt.service.base.PaymentFileLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.service.ServiceContext;

/**
 * The implementation of the payment file local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.dossiermgt.service.PaymentFileLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author trungdk
 * @see org.oep.dossiermgt.service.base.PaymentFileLocalServiceBaseImpl
 * @see org.oep.dossiermgt.service.PaymentFileLocalServiceUtil
 */
public class PaymentFileLocalServiceImpl extends PaymentFileLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.dossiermgt.service.PaymentFileLocalServiceUtil} to access the payment file local service.
	 */

	/** 
	 * Add payment file
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Create new
	 * @param
	 * @return: new payment file
	 */
	@Indexable(type = IndexableType.REINDEX)	
	public PaymentFile addPaymentFile(
			long organizationId,
			String govAgencyId,
			String govAgencyName,
			String subjectId,
			String subjectType,
			String subjectName,
			int amount,
			String paymentType,
			String paymentDescription,
			String transactionInfo,
			long fileEntryId,
			Date checkingDate,
			long checkingUserId,
			String checkingUserName,
			int checkingResult,
			String checkingNote,
			long ebMessageId,
			ServiceContext serviceContext) throws SystemException, PortalException {
		validate();
		long id = counterLocalService.increment();
		PaymentFile paymentFile = paymentFilePersistence.create(id);
		Date now = new Date();
				
		paymentFile.setCompanyId(serviceContext.getCompanyId());
		paymentFile.setGroupId(serviceContext.getScopeGroupId());
		paymentFile.setUserId(serviceContext.getUserId());
		paymentFile.setCreateDate(serviceContext.getCreateDate(now));
		paymentFile.setOrganizationId(organizationId);
		paymentFile.setGovAgencyId(govAgencyId);
		paymentFile.setGovAgencyName(govAgencyName);
		paymentFile.setSubjectId(subjectId);
		paymentFile.setSubjectName(subjectName);
		paymentFile.setSubjectType(subjectType);
		paymentFile.setAmount(amount);
		paymentFile.setPaymentType(paymentType);
		paymentFile.setPaymentDescription(paymentDescription);
		paymentFile.setTransactionInfo(transactionInfo);
		paymentFile.setFileEntryId(fileEntryId);
		paymentFile.setCheckingDate(checkingDate);
		paymentFile.setCheckingUserId(checkingUserId);
		paymentFile.setCheckingUserName(checkingUserName);
		paymentFile.setCheckingResult(checkingResult);
		paymentFile.setCheckingNote(checkingNote);
		paymentFile.setEbMessageId(ebMessageId);
		
		paymentFilePersistence.update(paymentFile);

		if (_log.isInfoEnabled()) {
			_log.info("Create new dossier proc " + id);
		}
		
		if (serviceContext.isAddGroupPermissions() || serviceContext.isAddGuestPermissions()) {
			addPaymentFileResources(paymentFile, serviceContext.isAddGroupPermissions(), serviceContext.isAddGuestPermissions(), serviceContext);
		}
		else {
			addPaymentFileResources(paymentFile, serviceContext.getGroupPermissions(), serviceContext.getGuestPermissions(), serviceContext);
		}
		return getPaymentFile(id);
	}

	@Indexable(type = IndexableType.REINDEX)
	public PaymentFile updatePaymentFile(
			long id, 
			long organizationId,
			String govAgencyId,
			String govAgencyName,
			String subjectId,
			String subjectType,
			String subjectName,
			int amount,
			String paymentType,
			String paymentDescription,
			String transactionInfo,
			long fileEntryId,
			Date checkingDate,
			long checkingUserId,
			String checkingUserName,
			int checkingResult,
			String checkingNote,
			long ebMessageId,
			ServiceContext serviceContext)
		throws PortalException, SystemException {

		validate();

		PaymentFile paymentFile = paymentFilePersistence.findByPrimaryKey(id);

		paymentFile.setModifiedDate(serviceContext.getModifiedDate(null));
		paymentFile.setOrganizationId(organizationId);
		paymentFile.setGovAgencyId(govAgencyId);
		paymentFile.setGovAgencyName(govAgencyName);
		paymentFile.setSubjectId(subjectId);
		paymentFile.setSubjectName(subjectName);
		paymentFile.setSubjectType(subjectType);
		paymentFile.setAmount(amount);
		paymentFile.setPaymentType(paymentType);
		paymentFile.setPaymentDescription(paymentDescription);
		paymentFile.setTransactionInfo(transactionInfo);
		paymentFile.setFileEntryId(fileEntryId);
		paymentFile.setCheckingDate(checkingDate);
		paymentFile.setCheckingUserId(checkingUserId);
		paymentFile.setCheckingUserName(checkingUserName);
		paymentFile.setCheckingResult(checkingResult);
		paymentFile.setCheckingNote(checkingNote);
		paymentFile.setEbMessageId(ebMessageId);

		paymentFilePersistence.update(paymentFile);

		if ((serviceContext.getGroupPermissions() != null) ||
			(serviceContext.getGuestPermissions() != null)) {

			updatePaymentFileResources(
				paymentFile, serviceContext.getGroupPermissions(),
				serviceContext.getGuestPermissions(), serviceContext);
		}

		return getPaymentFile(paymentFile.getPaymentFileId());
	}
	
	public void updatePaymentFileResources(
			PaymentFile paymentFile, String[] groupPermissions,
			String[] guestPermissions, ServiceContext serviceContext)
		throws PortalException, SystemException {

		resourceLocalService.updateResources(
			paymentFile.getCompanyId(), serviceContext.getScopeGroupId(),
			PaymentFile.class.getName(), paymentFile.getPaymentFileId(), groupPermissions,
			guestPermissions);
	}
	
	public void removePaymentFile(PaymentFile paymentFile) throws PortalException, SystemException {
		paymentFilePersistence.remove(paymentFile);
		resourceLocalService.deleteResource(paymentFile.getCompanyId(), PaymentFile.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, paymentFile.getPaymentFileId());
	}
	
	public void removePaymentFile(long id) throws PortalException, SystemException {
		PaymentFile paymentFile = paymentFilePersistence.findByPrimaryKey(id);
		removePaymentFile(paymentFile);
	}
	
	public PaymentFile getPaymentFile(long id) throws PortalException, SystemException {
		return paymentFilePersistence.findByPrimaryKey(id);
	}

	public void addPaymentFileResources(PaymentFile paymentFile, boolean addGroupPermission, boolean addGuestPermission, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addResources(paymentFile.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), PaymentFile.class.getName(), paymentFile.getPaymentFileId(), false, addGroupPermission, addGuestPermission);
	}

	public void addPaymentFileResources(PaymentFile paymentFile, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addModelResources(paymentFile.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), PaymentFile.class.getName(), paymentFile.getPaymentFileId(), groupPermissions, guestPermissions);
	}
	
	public void addPaymentFileResources(long id, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		PaymentFile paymentFile = paymentFilePersistence.findByPrimaryKey(id);
		addPaymentFileResources(paymentFile, groupPermissions, guestPermissions, serviceContext);
	}
	
	protected void validate() throws PortalException {
	}
	
	private static Log _log = LogFactoryUtil.getLog(PaymentFileLocalServiceImpl.class);

}