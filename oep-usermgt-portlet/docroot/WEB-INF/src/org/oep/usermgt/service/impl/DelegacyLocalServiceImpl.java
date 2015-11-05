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

import org.oep.usermgt.model.Delegacy;
import org.oep.usermgt.service.base.DelegacyLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.service.ServiceContext;

/**
 * The implementation of the delegacy local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.usermgt.service.DelegacyLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author NQMINH
 * @see org.oep.usermgt.service.base.DelegacyLocalServiceBaseImpl
 * @see org.oep.usermgt.service.DelegacyLocalServiceUtil
 */
public class DelegacyLocalServiceImpl extends DelegacyLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.usermgt.service.DelegacyLocalServiceUtil} to access the delegacy local service.
	 */
	public Delegacy addDelegacy(
			long fromEmployeeId,
			long toEmployeeId,
			long roleId,

			ServiceContext serviceContext) throws SystemException, PortalException {
		//validate(collectionName, dataCode, title, status);
		long id = counterLocalService.increment();
		Delegacy delegacy = delegacyPersistence.create(id);
		Date now = new Date();
		delegacy.setFromEmployeeId(fromEmployeeId);
		delegacy.setToEmployeeId(toEmployeeId);
		delegacy.setRoleId(roleId);

		delegacy.setCompanyId(serviceContext.getCompanyId());
		delegacy.setGroupId(serviceContext.getScopeGroupId());
		delegacy.setUserId(serviceContext.getUserId());
		delegacy.setCreateDate(serviceContext.getCreateDate(now));
		
		delegacyPersistence.update(delegacy);

		if (serviceContext.isAddGroupPermissions() || serviceContext.isAddGuestPermissions()) {
			addDelegacyResources(delegacy, serviceContext.isAddGroupPermissions(), serviceContext.isAddGuestPermissions(), serviceContext);
		}
		else {
			addDelegacyResources(delegacy, serviceContext.getGroupPermissions(), serviceContext.getGuestPermissions(), serviceContext);
		}
		return getDelegacy(id);
	}
	

	public Delegacy updateDelegacy(
			long delegacyId,
			long fromEmployeeId,
			long toEmployeeId,
			long roleId,
			ServiceContext serviceContext)
		throws PortalException, SystemException {
		Delegacy delegacy = delegacyPersistence.findByPrimaryKey(delegacyId);
		delegacy.setFromEmployeeId(fromEmployeeId);
		delegacy.setToEmployeeId(toEmployeeId);
		delegacy.setRoleId(roleId);

		delegacyPersistence.update(delegacy);

		if ((serviceContext.getGroupPermissions() != null) ||
			(serviceContext.getGuestPermissions() != null)) {

			updateDelegacyResources(
				delegacy, serviceContext.getGroupPermissions(),
				serviceContext.getGuestPermissions(), serviceContext);
		}

		return getDelegacy(delegacy.getDelegacyId());
	}
	public Delegacy saveDelegacy(Delegacy delegacy, ServiceContext serviceContext) throws PortalException, SystemException {
		return updateDelegacy(delegacy.getDelegacyId(), 
				delegacy.getFromEmployeeId(),
				delegacy.getToEmployeeId(),
				delegacy.getRoleId(),
				serviceContext);
	}
	
	public void updateDelegacyResources(
			Delegacy delegacy, String[] groupPermissions,
			String[] guestPermissions, ServiceContext serviceContext)
		throws PortalException, SystemException {

		resourceLocalService.updateResources(
			delegacy.getCompanyId(), serviceContext.getGuestOrUserId(),
			Delegacy.class.getName(), delegacy.getDelegacyId(), groupPermissions,
			guestPermissions);
	}
	public void removeDelegacy(Delegacy delegacy) throws PortalException, SystemException {
		delegacyPersistence.remove(delegacy);
		resourceLocalService.deleteResource(delegacy.getCompanyId(), Delegacy.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, delegacy.getDelegacyId());
	}
	
	public void removeDelegacy(long id) throws PortalException, SystemException {
		Delegacy delegacy = delegacyPersistence.findByPrimaryKey(id);
		removeDelegacy(delegacy);
	}
	
	public Delegacy getDelegacy(long id) throws PortalException, SystemException {
		return delegacyPersistence.findByPrimaryKey(id);
	}

	public void addDelegacyResources(Delegacy delegacy, boolean addGroupPermission, boolean addGuestPermission, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addResources(delegacy.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), Delegacy.class.getName(), delegacy.getDelegacyId(), false, addGroupPermission, addGuestPermission);
	}

	public void addDelegacyResources(Delegacy delegacy, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addModelResources(delegacy.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), Delegacy.class.getName(), delegacy.getDelegacyId(), groupPermissions, guestPermissions);
	}
	
	public void addDelegacyResources(long id, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		Delegacy delegacy = delegacyPersistence.findByPrimaryKey(id);
		addDelegacyResources(delegacy, groupPermissions, guestPermissions, serviceContext);
	}
}