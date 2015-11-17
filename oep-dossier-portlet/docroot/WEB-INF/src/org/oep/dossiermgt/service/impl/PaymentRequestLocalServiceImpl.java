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

import org.oep.dossiermgt.model.PaymentRequest;
import org.oep.dossiermgt.service.base.PaymentRequestLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.service.ServiceContext;

/**
 * The implementation of the payment request local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.dossiermgt.service.PaymentRequestLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author trungdk
 * @see org.oep.dossiermgt.service.base.PaymentRequestLocalServiceBaseImpl
 * @see org.oep.dossiermgt.service.PaymentRequestLocalServiceUtil
 */
public class PaymentRequestLocalServiceImpl
	extends PaymentRequestLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.dossiermgt.service.PaymentRequestLocalServiceUtil} to access the payment request local service.
	 */
	
	/** 
	 * Add payment request
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Create new
	 * @param
	 * @return: new payment request
	 */
	@Indexable(type = IndexableType.REINDEX)	
	public PaymentRequest addPaymentRequest(
			long organizationId,
			long dossierId,
			String govAgencyId,
			String govAgencyName,
			String subjectId,
			String subjectType,
			String subjectName,
			int amount,
			String requestNote,
			long paymentFileId,
			int confirmOK,
			long ebMessageId,
			ServiceContext serviceContext) throws SystemException, PortalException {
		validate();
		long id = counterLocalService.increment();
		PaymentRequest paymentRequest = paymentRequestPersistence.create(id);
		Date now = new Date();
				
		paymentRequest.setCompanyId(serviceContext.getCompanyId());
		paymentRequest.setGroupId(serviceContext.getScopeGroupId());
		paymentRequest.setUserId(serviceContext.getUserId());
		paymentRequest.setCreateDate(serviceContext.getCreateDate(now));
		paymentRequest.setOrganizationId(organizationId);
		paymentRequest.setDossierId(dossierId);
		paymentRequest.setGovAgencyId(govAgencyId);
		paymentRequest.setGovAgencyName(govAgencyName);
		paymentRequest.setSubjectId(subjectId);
		paymentRequest.setSubjectName(subjectName);
		paymentRequest.setSubjectType(subjectType);
		paymentRequest.setAmount(amount);
		paymentRequest.setRequestNote(requestNote);
		paymentRequest.setConfirmOK(confirmOK);
		paymentRequest.setEbMessageId(ebMessageId);
		
		paymentRequestPersistence.update(paymentRequest);

		if (_log.isInfoEnabled()) {
			_log.info("Create new payment request " + id);
		}
		
		if (serviceContext.isAddGroupPermissions() || serviceContext.isAddGuestPermissions()) {
			addPaymentRequestResources(paymentRequest, serviceContext.isAddGroupPermissions(), serviceContext.isAddGuestPermissions(), serviceContext);
		}
		else {
			addPaymentRequestResources(paymentRequest, serviceContext.getGroupPermissions(), serviceContext.getGuestPermissions(), serviceContext);
		}
		return getPaymentRequest(id);
	}

	@Indexable(type = IndexableType.REINDEX)
	public PaymentRequest updatePaymentRequest(
			long id, 
			long organizationId,
			long dossierId,
			String govAgencyId,
			String govAgencyName,
			String subjectId,
			String subjectType,
			String subjectName,
			int amount,
			String requestNote,
			long paymentFileId,
			int confirmOK,
			long ebMessageId,
			ServiceContext serviceContext)
		throws PortalException, SystemException {

		validate();

		PaymentRequest paymentRequest = paymentRequestPersistence.findByPrimaryKey(id);

		paymentRequest.setModifiedDate(serviceContext.getModifiedDate(null));
		paymentRequest.setOrganizationId(organizationId);
		paymentRequest.setDossierId(dossierId);
		paymentRequest.setGovAgencyId(govAgencyId);
		paymentRequest.setGovAgencyName(govAgencyName);
		paymentRequest.setSubjectId(subjectId);
		paymentRequest.setSubjectName(subjectName);
		paymentRequest.setSubjectType(subjectType);
		paymentRequest.setAmount(amount);
		paymentRequest.setRequestNote(requestNote);
		paymentRequest.setConfirmOK(confirmOK);
		paymentRequest.setEbMessageId(ebMessageId);

		paymentRequestPersistence.update(paymentRequest);

		if ((serviceContext.getGroupPermissions() != null) ||
			(serviceContext.getGuestPermissions() != null)) {

			updatePaymentRequestResources(
				paymentRequest, serviceContext.getGroupPermissions(),
				serviceContext.getGuestPermissions(), serviceContext);
		}

		return getPaymentRequest(paymentRequest.getPaymentRequestId());
	}
	
	public void updatePaymentRequestResources(
			PaymentRequest paymentRequest, String[] groupPermissions,
			String[] guestPermissions, ServiceContext serviceContext)
		throws PortalException, SystemException {

		resourceLocalService.updateResources(
			paymentRequest.getCompanyId(), serviceContext.getScopeGroupId(),
			PaymentRequest.class.getName(), paymentRequest.getPaymentRequestId(), groupPermissions,
			guestPermissions);
	}
	
	public void removePaymentRequest(PaymentRequest paymentRequest) throws PortalException, SystemException {
		paymentRequestPersistence.remove(paymentRequest);
		resourceLocalService.deleteResource(paymentRequest.getCompanyId(), PaymentRequest.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, paymentRequest.getPaymentRequestId());
	}
	
	public void removePaymentRequest(long id) throws PortalException, SystemException {
		PaymentRequest paymentRequest = paymentRequestPersistence.findByPrimaryKey(id);
		removePaymentRequest(paymentRequest);
	}
	
	public PaymentRequest getPaymentRequest(long id) throws PortalException, SystemException {
		return paymentRequestPersistence.findByPrimaryKey(id);
	}

	public void addPaymentRequestResources(PaymentRequest paymentRequest, boolean addGroupPermission, boolean addGuestPermission, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addResources(paymentRequest.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), PaymentRequest.class.getName(), paymentRequest.getPaymentRequestId(), false, addGroupPermission, addGuestPermission);
	}

	public void addPaymentRequestResources(PaymentRequest paymentRequest, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addModelResources(paymentRequest.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), PaymentRequest.class.getName(), paymentRequest.getPaymentRequestId(), groupPermissions, guestPermissions);
	}
	
	public void addPaymentRequestResources(long id, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		PaymentRequest paymentRequest = paymentRequestPersistence.findByPrimaryKey(id);
		addPaymentRequestResources(paymentRequest, groupPermissions, guestPermissions, serviceContext);
	}
	
	protected void validate() throws PortalException {
	}
	
	private static Log _log = LogFactoryUtil.getLog(PaymentRequestLocalServiceImpl.class);
	
}