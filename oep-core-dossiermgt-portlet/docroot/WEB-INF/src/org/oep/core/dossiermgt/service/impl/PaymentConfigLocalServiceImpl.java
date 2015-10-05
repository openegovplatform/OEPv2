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

package org.oep.core.dossiermgt.service.impl;

import java.util.Date;

import org.oep.core.dossiermgt.model.PaymentConfig;
import org.oep.core.dossiermgt.service.base.PaymentConfigLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.service.ServiceContext;

/**
 * The implementation of the payment config local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.core.dossiermgt.service.PaymentConfigLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author trungdk
 * @see org.oep.core.dossiermgt.service.base.PaymentConfigLocalServiceBaseImpl
 * @see org.oep.core.dossiermgt.service.PaymentConfigLocalServiceUtil
 */
public class PaymentConfigLocalServiceImpl
	extends PaymentConfigLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.core.dossiermgt.service.PaymentConfigLocalServiceUtil} to access the payment config local service.
	 */
	
	/** 
	 * Add dossier proc
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Create new
	 * @param
	 * @return: new dossier proc
	 */
	@Indexable(type = IndexableType.REINDEX)	
	public PaymentConfig addPaymentConfig(
			String govAgentId,
			String govAgentName,
			String bankTransfer,
			String keypay,
			long ebPartnerShipId,
			ServiceContext serviceContext) throws SystemException, PortalException {
		validate();
		long id = counterLocalService.increment();
		PaymentConfig paymentConfig = paymentConfigPersistence.create(id);
		Date now = new Date();
				
		paymentConfig.setCompanyId(serviceContext.getCompanyId());
		paymentConfig.setGovAgentId(govAgentId);
		paymentConfig.setGovAgentName(govAgentName);
		paymentConfig.setBankTransfer(bankTransfer);
		paymentConfig.setKeypay(keypay);
		paymentConfig.setEbPartnerShipId(ebPartnerShipId);
		
		paymentConfig.setCreateDate(serviceContext.getCreateDate(now));
		
		paymentConfigPersistence.update(paymentConfig);

		if (_log.isInfoEnabled()) {
			_log.info("Create new dossier proc " + id);
		}
		
		if (serviceContext.isAddGroupPermissions() || serviceContext.isAddGuestPermissions()) {
			addPaymentConfigResources(paymentConfig, serviceContext.isAddGroupPermissions(), serviceContext.isAddGuestPermissions(), serviceContext);
		}
		else {
			addPaymentConfigResources(paymentConfig, serviceContext.getGroupPermissions(), serviceContext.getGuestPermissions(), serviceContext);
		}
		return getPaymentConfig(id);
	}

	@Indexable(type = IndexableType.REINDEX)
	public PaymentConfig updatePaymentConfig(
			long id, 
			String govAgentId,
			String govAgentName,
			String bankTransfer,
			String keypay,
			long ebPartnerShipId,
			ServiceContext serviceContext)
		throws PortalException, SystemException {

		validate();

		PaymentConfig paymentConfig = paymentConfigPersistence.findByPrimaryKey(id);

		paymentConfig.setModifiedDate(serviceContext.getModifiedDate(null));
		paymentConfig.setGovAgentId(govAgentId);
		paymentConfig.setGovAgentName(govAgentName);
		paymentConfig.setBankTransfer(bankTransfer);
		paymentConfig.setKeypay(keypay);
		paymentConfig.setEbPartnerShipId(ebPartnerShipId);

		paymentConfigPersistence.update(paymentConfig);

		if ((serviceContext.getGroupPermissions() != null) ||
			(serviceContext.getGuestPermissions() != null)) {

			updatePaymentConfigResources(
				paymentConfig, serviceContext.getGroupPermissions(),
				serviceContext.getGuestPermissions(), serviceContext);
		}

		return getPaymentConfig(paymentConfig.getPaymentConfigId());
	}
	
	public void updatePaymentConfigResources(
			PaymentConfig paymentConfig, String[] groupPermissions,
			String[] guestPermissions, ServiceContext serviceContext)
		throws PortalException, SystemException {

		resourceLocalService.updateResources(
			paymentConfig.getCompanyId(), serviceContext.getScopeGroupId(),
			PaymentConfig.class.getName(), paymentConfig.getPaymentConfigId(), groupPermissions,
			guestPermissions);
	}
	
	
	public void removePaymentConfig(PaymentConfig paymentConfig) throws PortalException, SystemException {
		paymentConfigPersistence.remove(paymentConfig);
		resourceLocalService.deleteResource(paymentConfig.getCompanyId(), PaymentConfig.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, paymentConfig.getPaymentConfigId());
	}
	
	public void removePaymentConfig(long id) throws PortalException, SystemException {
		PaymentConfig paymentConfig = paymentConfigPersistence.findByPrimaryKey(id);
		removePaymentConfig(paymentConfig);
	}
	
	public PaymentConfig getPaymentConfig(long id) throws PortalException, SystemException {
		return paymentConfigPersistence.findByPrimaryKey(id);
	}

	public void addPaymentConfigResources(PaymentConfig paymentConfig, boolean addGroupPermission, boolean addGuestPermission, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addResources(paymentConfig.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), PaymentConfig.class.getName(), paymentConfig.getPaymentConfigId(), false, addGroupPermission, addGuestPermission);
	}

	public void addPaymentConfigResources(PaymentConfig paymentConfig, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addModelResources(paymentConfig.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), PaymentConfig.class.getName(), paymentConfig.getPaymentConfigId(), groupPermissions, guestPermissions);
	}
	
	public void addPaymentConfigResources(long id, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		PaymentConfig paymentConfig = paymentConfigPersistence.findByPrimaryKey(id);
		addPaymentConfigResources(paymentConfig, groupPermissions, guestPermissions, serviceContext);
	}
	
	protected void validate() throws PortalException {
	}
	
	private static Log _log = LogFactoryUtil.getLog(PaymentConfigLocalServiceImpl.class);
	
}