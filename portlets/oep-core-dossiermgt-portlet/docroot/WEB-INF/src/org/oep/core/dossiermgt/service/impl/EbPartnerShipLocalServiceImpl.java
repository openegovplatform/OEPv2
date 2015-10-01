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

import org.oep.core.dossiermgt.model.EbPartnerShip;
import org.oep.core.dossiermgt.service.base.EbPartnerShipLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.service.ServiceContext;

/**
 * The implementation of the eb partner ship local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.core.dossiermgt.service.EbPartnerShipLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author trungdk
 * @see org.oep.core.dossiermgt.service.base.EbPartnerShipLocalServiceBaseImpl
 * @see org.oep.core.dossiermgt.service.EbPartnerShipLocalServiceUtil
 */
public class EbPartnerShipLocalServiceImpl
	extends EbPartnerShipLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.core.dossiermgt.service.EbPartnerShipLocalServiceUtil} to access the eb partner ship local service.
	 */
	
	/** 
	 * Add eb partner ship
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Create new
	 * @param
	 * @return: new eb partner ship
	 */
	@Indexable(type = IndexableType.REINDEX)	
	public EbPartnerShip addEbPartnerShip(
			String name,
			String cpaId,
			String service,
			String action,
			int inbound,
			ServiceContext serviceContext) throws SystemException, PortalException {
		validate();
		long id = counterLocalService.increment();
		EbPartnerShip ebPartnerShip = ebPartnerShipPersistence.create(id);
		Date now = new Date();
				
		ebPartnerShip.setCompanyId(serviceContext.getCompanyId());
		ebPartnerShip.setCreateDate(serviceContext.getCreateDate(now));
		ebPartnerShip.setName(name);
		ebPartnerShip.setCpaId(cpaId);
		ebPartnerShip.setService(service);
		ebPartnerShip.setAction(action);
		ebPartnerShip.setInbound(inbound);
		
		ebPartnerShipPersistence.update(ebPartnerShip);

		if (_log.isInfoEnabled()) {
			_log.info("Create new dossier proc " + id);
		}
		
		if (serviceContext.isAddGroupPermissions() || serviceContext.isAddGuestPermissions()) {
			addEbPartnerShipResources(ebPartnerShip, serviceContext.isAddGroupPermissions(), serviceContext.isAddGuestPermissions(), serviceContext);
		}
		else {
			addEbPartnerShipResources(ebPartnerShip, serviceContext.getGroupPermissions(), serviceContext.getGuestPermissions(), serviceContext);
		}
		return getEbPartnerShip(id);
	}

	@Indexable(type = IndexableType.REINDEX)
	public EbPartnerShip updateEbPartnerShip(
			long id, 
			String name,
			String cpaId,
			String service,
			String action,
			int inbound,
			ServiceContext serviceContext)
		throws PortalException, SystemException {

		validate();

		EbPartnerShip ebPartnerShip = ebPartnerShipPersistence.findByPrimaryKey(id);

		ebPartnerShip.setName(name);
		ebPartnerShip.setCpaId(cpaId);
		ebPartnerShip.setService(service);
		ebPartnerShip.setAction(action);
		ebPartnerShip.setInbound(inbound);

		ebPartnerShipPersistence.update(ebPartnerShip);

		if ((serviceContext.getGroupPermissions() != null) ||
			(serviceContext.getGuestPermissions() != null)) {

			updateEbPartnerShipResources(
				ebPartnerShip, serviceContext.getGroupPermissions(),
				serviceContext.getGuestPermissions(), serviceContext);
		}

		return getEbPartnerShip(ebPartnerShip.getEbPartnerShipId());
	}
	
	public void updateEbPartnerShipResources(
			EbPartnerShip ebPartnerShip, String[] groupPermissions,
			String[] guestPermissions, ServiceContext serviceContext)
		throws PortalException, SystemException {

		resourceLocalService.updateResources(
			ebPartnerShip.getCompanyId(), serviceContext.getScopeGroupId(),
			EbPartnerShip.class.getName(), ebPartnerShip.getEbPartnerShipId(), groupPermissions,
			guestPermissions);
	}
	
	public void removeEbPartnerShip(EbPartnerShip ebPartnerShip) throws PortalException, SystemException {
		ebPartnerShipPersistence.remove(ebPartnerShip);
		resourceLocalService.deleteResource(ebPartnerShip.getCompanyId(), EbPartnerShip.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, ebPartnerShip.getEbPartnerShipId());
	}
	
	public void removeEbPartnerShip(long id) throws PortalException, SystemException {
		EbPartnerShip ebPartnerShip = ebPartnerShipPersistence.findByPrimaryKey(id);
		removeEbPartnerShip(ebPartnerShip);
	}
	
	public EbPartnerShip getEbPartnerShip(long id) throws PortalException, SystemException {
		return ebPartnerShipPersistence.findByPrimaryKey(id);
	}

	public void addEbPartnerShipResources(EbPartnerShip ebPartnerShip, boolean addGroupPermission, boolean addGuestPermission, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addResources(ebPartnerShip.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), EbPartnerShip.class.getName(), ebPartnerShip.getEbPartnerShipId(), false, addGroupPermission, addGuestPermission);
	}

	public void addEbPartnerShipResources(EbPartnerShip ebPartnerShip, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addModelResources(ebPartnerShip.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), EbPartnerShip.class.getName(), ebPartnerShip.getEbPartnerShipId(), groupPermissions, guestPermissions);
	}
	
	public void addEbPartnerShipResources(long id, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		EbPartnerShip ebPartnerShip = ebPartnerShipPersistence.findByPrimaryKey(id);
		addEbPartnerShipResources(ebPartnerShip, groupPermissions, guestPermissions, serviceContext);
	}
	
	protected void validate() throws PortalException {
	}
	
	private static Log _log = LogFactoryUtil.getLog(EbPartnerShipLocalServiceImpl.class);
	
}