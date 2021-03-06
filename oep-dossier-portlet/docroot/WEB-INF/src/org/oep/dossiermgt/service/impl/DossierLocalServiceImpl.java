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

import org.oep.dossiermgt.model.Dossier;
import org.oep.dossiermgt.service.base.DossierLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.service.ServiceContext;

/**
 * The implementation of the dossier local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.dossiermgt.service.DossierLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author trungdk
 * @see org.oep.dossiermgt.service.base.DossierLocalServiceBaseImpl
 * @see org.oep.dossiermgt.service.DossierLocalServiceUtil
 */
public class DossierLocalServiceImpl extends DossierLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.oep.dossiermgt.service.DossierLocalServiceUtil} to access the dossier local service.
	 */
	
	/** 
	 * Add dossier
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  21-September-2015  trungdk    Create new
	 * @param
	 * @return: new dossier
	 */
	@Indexable(type = IndexableType.REINDEX)	
	public Dossier addDossier(
			long organizationId,
			long dossierProcId,
			String govAgencyId,
			String govAgencyName,
			String subjectId,
			String subjectType,
			String subjectName,
			String address,
			String cityNo,
			String cityName,
			String districtNo,
			String districtName,
			String wardNo,
			String wardName,
			String telNo,
			String email,
			int subjectAsContactPerson,
			String contactPersonName,
			String contactPersonId,
			int contactPersonSex,
			String contactPersonTel,
			String note,
			String resumeDescription,
			String receptionNo,
			int onegate,
			Date submitDate,
			Date receiveDate,
			Date processDate,
			Date renewDate,
			Date estimateDate,
			Date finishDate,
			Date handoverDate,
			Date returnDate,
			Date archiveDate,
			String mainStatus,
			String subStatus,
			Date statusDate,
			String statusDescription,
			String feedbackNote,
			int daysDelay,
			String errorStatus,
			String errorCode,
			int pendingStatus,
			int dirty,
			ServiceContext serviceContext) throws SystemException, PortalException {
		validate();
		long id = counterLocalService.increment();
		Dossier dossier = dossierPersistence.create(id);
		Date now = new Date();
				
		dossier.setCompanyId(serviceContext.getCompanyId());
		dossier.setGroupId(serviceContext.getScopeGroupId());
		dossier.setUserId(serviceContext.getUserId());
		dossier.setUuid(PortalUUIDUtil.generate());
		dossier.setCreateDate(serviceContext.getCreateDate(now));
		dossier.setOrganizationId(organizationId);
		dossier.setDossierProcId(dossierProcId);
		dossier.setGovAgencyId(govAgencyId);
		dossier.setGovAgencyName(govAgencyName);
		dossier.setSubjectId(subjectId);
		dossier.setSubjectType(subjectType);
		dossier.setSubjectName(subjectName);
		dossier.setAddress(address);
		dossier.setCityNo(cityNo);
		dossier.setCityName(cityName);
		dossier.setDistrictNo(districtNo);
		dossier.setDistrictName(districtName);
		dossier.setWardNo(wardNo);
		dossier.setWardName(wardName);
		dossier.setTelNo(telNo);
		dossier.setEmail(email);
		dossier.setSubjectAsContactPerson(subjectAsContactPerson);
		dossier.setContactPersonName(contactPersonName);
		dossier.setContactPersonId(contactPersonId);
		dossier.setContactPersonSex(contactPersonSex);
		dossier.setContactPersonTel(contactPersonTel);
		dossier.setNote(note);
		dossier.setResumeDescription(resumeDescription);
		dossier.setReceptionNo(receptionNo);
		dossier.setOnegate(onegate);
		dossier.setSubmitDate(submitDate);
		dossier.setReceiveDate(receiveDate);
		dossier.setProcessDate(processDate);
		dossier.setRenewDate(renewDate);
		dossier.setEstimateDate(estimateDate);
		dossier.setFinishDate(finishDate);
		dossier.setHandoverDate(handoverDate);
		dossier.setReturnDate(returnDate);
		dossier.setArchiveDate(archiveDate);
		dossier.setStatusDate(statusDate);
		dossier.setMainStatus(mainStatus);
		dossier.setSubStatus(subStatus);
		dossier.setStatusDescription(statusDescription);
		dossier.setFeedbackNote(feedbackNote);
		dossier.setDaysDelay(daysDelay);
		dossier.setErrorCode(errorCode);
		dossier.setErrorStatus(errorStatus);
		dossier.setPendingStatus(pendingStatus);
		dossier.setDirty(dirty);
		
		dossierPersistence.update(dossier);

		if (_log.isInfoEnabled()) {
			_log.info("Create new dossier " + id);
		}
		
		_log.info("After info enabled");
		
		if (serviceContext.isAddGroupPermissions() || serviceContext.isAddGuestPermissions()) {
			_log.info("Add guest permission");
			addDossierResources(dossier, serviceContext.isAddGroupPermissions(), serviceContext.isAddGuestPermissions(), serviceContext);
		}
		else {
			_log.info("Add permission");
			addDossierResources(dossier, serviceContext.getGroupPermissions(), serviceContext.getGuestPermissions(), serviceContext);
		}
		
		_log.info("Success create new dossier");
		
		return getDossier(id);
	}

	@Indexable(type = IndexableType.REINDEX)
	public Dossier updateDossier(
			long id, 
			long organizationId,
			long dossierProcId,
			String govAgencyId,
			String govAgencyName,
			String subjectId,
			String subjectType,
			String subjectName,
			String address,
			String cityNo,
			String cityName,
			String districtNo,
			String districtName,
			String wardNo,
			String wardName,
			String telNo,
			String email,
			int subjectAsContactPerson,
			String contactPersonName,
			String contactPersonId,
			int contactPersonSex,
			String contactPersonTel,
			String note,
			String resumeDescription,
			String receptionNo,
			int onegate,
			Date submitDate,
			Date receiveDate,
			Date processDate,
			Date renewDate,
			Date estimateDate,
			Date finishDate,
			Date handoverDate,
			Date returnDate,
			Date archiveDate,
			String mainStatus,
			String subStatus,
			Date statusDate,
			String statusDescription,
			String feedbackNote,
			int daysDelay,
			String errorStatus,
			String errorCode,
			int pendingStatus,
			int dirty,
			ServiceContext serviceContext)
		throws PortalException, SystemException {

		validate();

		Dossier dossier = dossierPersistence.findByPrimaryKey(id);

		dossier.setModifiedDate(serviceContext.getModifiedDate(null));
		dossier.setCompanyId(serviceContext.getCompanyId());
		dossier.setGroupId(serviceContext.getScopeGroupId());
		dossier.setUserId(serviceContext.getUserId());
		dossier.setOrganizationId(organizationId);
		dossier.setDossierProcId(dossierProcId);
		dossier.setGovAgencyId(govAgencyId);
		dossier.setGovAgencyName(govAgencyName);
		dossier.setSubjectId(subjectId);
		dossier.setSubjectType(subjectType);
		dossier.setSubjectName(subjectName);
		dossier.setAddress(address);
		dossier.setCityNo(cityNo);
		dossier.setCityName(cityName);
		dossier.setDistrictNo(districtNo);
		dossier.setDistrictName(districtName);
		dossier.setWardNo(wardNo);
		dossier.setWardName(wardName);
		dossier.setTelNo(telNo);
		dossier.setEmail(email);
		dossier.setSubjectAsContactPerson(subjectAsContactPerson);
		dossier.setContactPersonName(contactPersonName);
		dossier.setContactPersonId(contactPersonId);
		dossier.setContactPersonSex(contactPersonSex);
		dossier.setContactPersonTel(contactPersonTel);
		dossier.setNote(note);
		dossier.setResumeDescription(resumeDescription);
		dossier.setReceptionNo(receptionNo);
		dossier.setOnegate(onegate);
		dossier.setSubmitDate(submitDate);
		dossier.setReceiveDate(receiveDate);
		dossier.setProcessDate(processDate);
		dossier.setRenewDate(renewDate);
		dossier.setEstimateDate(estimateDate);
		dossier.setFinishDate(finishDate);
		dossier.setHandoverDate(handoverDate);
		dossier.setReturnDate(returnDate);
		dossier.setArchiveDate(archiveDate);
		dossier.setStatusDate(statusDate);
		dossier.setMainStatus(mainStatus);
		dossier.setSubStatus(subStatus);
		dossier.setStatusDescription(statusDescription);
		dossier.setFeedbackNote(feedbackNote);
		dossier.setDaysDelay(daysDelay);
		dossier.setErrorCode(errorCode);
		dossier.setErrorStatus(errorStatus);
		dossier.setPendingStatus(pendingStatus);
		dossier.setDirty(dirty);

		dossierPersistence.update(dossier);

		if ((serviceContext.getGroupPermissions() != null) ||
			(serviceContext.getGuestPermissions() != null)) {

			updateDossierResources(
				dossier, serviceContext.getGroupPermissions(),
				serviceContext.getGuestPermissions(), serviceContext);
		}

		return getDossier(dossier.getDossierId());
	}
	
	public void updateDossierResources(
			Dossier dossier, String[] groupPermissions,
			String[] guestPermissions, ServiceContext serviceContext)
		throws PortalException, SystemException {

		resourceLocalService.updateResources(
			dossier.getCompanyId(), serviceContext.getScopeGroupId(),
			Dossier.class.getName(), dossier.getDossierId(), groupPermissions,
			guestPermissions);
	}
	
	public void removeDossier(Dossier dossier) throws PortalException, SystemException {
		dossierPersistence.remove(dossier);
		resourceLocalService.deleteResource(dossier.getCompanyId(), Dossier.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, dossier.getDossierId());
	}
	
	public void removeDossier(long id) throws PortalException, SystemException {
		Dossier dossier = dossierPersistence.findByPrimaryKey(id);
		removeDossier(dossier);
	}
	
	public Dossier getDossier(long id) throws PortalException, SystemException {
		return dossierPersistence.findByPrimaryKey(id);
	}

	public void addDossierResources(Dossier dossier, boolean addGroupPermission, boolean addGuestPermission, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addResources(dossier.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), Dossier.class.getName(), dossier.getDossierId(), false, addGroupPermission, addGuestPermission);
	}

	public void addDossierResources(Dossier dossier, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		resourceLocalService.addModelResources(dossier.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(), Dossier.class.getName(), dossier.getDossierId(), groupPermissions, guestPermissions);
	}
	
	public void addDossierResources(long id, String[] groupPermissions, String[] guestPermissions, ServiceContext serviceContext) throws PortalException, SystemException {
		Dossier dossier = dossierPersistence.findByPrimaryKey(id);
		addDossierResources(dossier, groupPermissions, guestPermissions, serviceContext);
	}
	
	protected void validate() throws PortalException {
	}
	
	private static Log _log = LogFactoryUtil.getLog(DossierLocalServiceImpl.class);
	
}