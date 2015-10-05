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
import java.util.List;

import org.oep.core.dossiermgt.DossierProcNoException;
import org.oep.core.dossiermgt.model.DossierProc;
import org.oep.core.dossiermgt.service.base.DossierProcLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.service.ServiceContext;

/**
 * The implementation of the dossier proc local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.core.dossiermgt.service.DossierProcLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
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
	public DossierProc addDossierProc(
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
			String administrationName,
			String domainNo,
			String domainName,
			Date effectDate,
			Date expireDate,
			int active,
			ServiceContext serviceContext) throws SystemException, PortalException {
		validate(dossierProcNo);
		long id = counterLocalService.increment();
		DossierProc dossierProc = dossierProcPersistence.create(id);
		Date now = new Date();
		
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
		dossierProc.setAdministrationName(administrationName);
		dossierProc.setDomainNo(domainNo);
		dossierProc.setDomainName(domainName);
		dossierProc.setEffectDate(effectDate);
		dossierProc.setExpireDate(expireDate);
		dossierProc.setActive(active);
		
		dossierProc.setCompanyId(serviceContext.getCompanyId());
		dossierProc.setCreateDate(serviceContext.getCreateDate(now));
		
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
			String administrationName,
			String domainNo,
			String domainName,
			Date effectDate,
			Date expireDate,
			int active,
			ServiceContext serviceContext)
		throws PortalException, SystemException {

		validate(dossierProcNo);

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
		dossierProc.setAdministrationName(administrationName);
		dossierProc.setDomainNo(domainNo);
		dossierProc.setDomainName(domainName);
		dossierProc.setEffectDate(effectDate);
		dossierProc.setExpireDate(expireDate);
		dossierProc.setActive(active);

		dossierProcPersistence.update(dossierProc);

		if ((serviceContext.getGroupPermissions() != null) ||
			(serviceContext.getGuestPermissions() != null)) {

			updateDossierProcResources(
				dossierProc, serviceContext.getGroupPermissions(),
				serviceContext.getGuestPermissions(), serviceContext);
		}

		return getDossierProc(dossierProc.getDossierProcId());
	}
	
	public void updateDossierProcResources(
			DossierProc dossierProc, String[] groupPermissions,
			String[] guestPermissions, ServiceContext serviceContext)
		throws PortalException, SystemException {

		resourceLocalService.updateResources(
			dossierProc.getCompanyId(), serviceContext.getScopeGroupId(),
			DossierProc.class.getName(), dossierProc.getDossierProcId(), groupPermissions,
			guestPermissions);
	}
	
	public void removeDossierProc(DossierProc dossierProc) throws PortalException, SystemException {
		dossierProcPersistence.remove(dossierProc);
		resourceLocalService.deleteResource(dossierProc.getCompanyId(), DossierProc.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, dossierProc.getDossierProcId());
	}
	
	public void removeDossierProc(long id) throws PortalException, SystemException {
		DossierProc dossierProc = dossierProcPersistence.findByPrimaryKey(id);
		removeDossierProc(dossierProc);
	}
	
	public DossierProc getDossierProc(long id) throws PortalException, SystemException {
		return dossierProcPersistence.findByPrimaryKey(id);
	}

	public void addDossierProcResources(DossierProc dossierProc, boolean addGroupPermission, boolean addGuestPermission, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addResources(dossierProc.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), DossierProc.class.getName(), dossierProc.getDossierProcId(), false, addGroupPermission, addGuestPermission);
	}

	public void addDossierProcResources(DossierProc dossierProc, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addModelResources(dossierProc.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), DossierProc.class.getName(), dossierProc.getDossierProcId(), groupPermissions, guestPermissions);
	}
	
	public void addDossierProcResources(long id, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		DossierProc dossierProc = dossierProcPersistence.findByPrimaryKey(id);
		addDossierProcResources(dossierProc, groupPermissions, guestPermissions, serviceContext);
	}
	
	protected void validate(String dossierProcNo) throws PortalException {
		if (Validator.isNull(dossierProcNo)) {
			throw new DossierProcNoException();
		}
	}
	
	public DossierProc getByDossierProcNo(String dossierProcNo, ServiceContext serviceContext) throws PortalException, SystemException {
		return dossierProcPersistence.fetchByC_G_DPN(serviceContext.getCompanyId(), serviceContext.getScopeGroupId(), dossierProcNo);
	}
	
	public List<DossierProc> findAllByAdministrationNo(String administrationNo, ServiceContext serviceContext) throws PortalException, SystemException {
		return dossierProcPersistence.findByC_ANO(serviceContext.getCompanyId(), administrationNo);
	}
	
	public List<DossierProc> findAllByDomainNo(String domainNo, ServiceContext serviceContext) throws PortalException, SystemException {
		return dossierProcPersistence.findByC_DNO(serviceContext.getCompanyId(), domainNo);
	}
	
	public List<DossierProc> findAllByAdministrationAndDomain(String administrationNo, String domainNo, ServiceContext serviceContext) throws PortalException, SystemException {
		return dossierProcPersistence.findByC_ANO_DNO(serviceContext.getCompanyId(), administrationNo, domainNo);
	}
	
	public List<DossierProc> findByGroupAdministrationAndDomain(String administrationNo, String domainNo, ServiceContext serviceContext) throws PortalException, SystemException {
		return dossierProcPersistence.findByC_G_ANO_DNO(serviceContext.getCompanyId(), serviceContext.getScopeGroupId(), administrationNo, domainNo);
	}
	
	private static Log _log = LogFactoryUtil.getLog(DossierProcLocalServiceImpl.class);
	
}