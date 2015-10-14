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

package org.oep.core.dossiermgt.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.StagedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Dossier service. Represents a row in the &quot;oep_dossiermgt_dossier&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.oep.core.dossiermgt.model.impl.DossierModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.oep.core.dossiermgt.model.impl.DossierImpl}.
 * </p>
 *
 * @author trungdk
 * @see Dossier
 * @see org.oep.core.dossiermgt.model.impl.DossierImpl
 * @see org.oep.core.dossiermgt.model.impl.DossierModelImpl
 * @generated
 */
public interface DossierModel extends BaseModel<Dossier>, StagedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a dossier model instance should use the {@link Dossier} interface instead.
	 */

	/**
	 * Returns the primary key of this dossier.
	 *
	 * @return the primary key of this dossier
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this dossier.
	 *
	 * @param primaryKey the primary key of this dossier
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this dossier.
	 *
	 * @return the uuid of this dossier
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this dossier.
	 *
	 * @param uuid the uuid of this dossier
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the dossier ID of this dossier.
	 *
	 * @return the dossier ID of this dossier
	 */
	public long getDossierId();

	/**
	 * Sets the dossier ID of this dossier.
	 *
	 * @param dossierId the dossier ID of this dossier
	 */
	public void setDossierId(long dossierId);

	/**
	 * Returns the user ID of this dossier.
	 *
	 * @return the user ID of this dossier
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this dossier.
	 *
	 * @param userId the user ID of this dossier
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this dossier.
	 *
	 * @return the user uuid of this dossier
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this dossier.
	 *
	 * @param userUuid the user uuid of this dossier
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the group ID of this dossier.
	 *
	 * @return the group ID of this dossier
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this dossier.
	 *
	 * @param groupId the group ID of this dossier
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this dossier.
	 *
	 * @return the company ID of this dossier
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this dossier.
	 *
	 * @param companyId the company ID of this dossier
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the create date of this dossier.
	 *
	 * @return the create date of this dossier
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this dossier.
	 *
	 * @param createDate the create date of this dossier
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this dossier.
	 *
	 * @return the modified date of this dossier
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this dossier.
	 *
	 * @param modifiedDate the modified date of this dossier
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the organization ID of this dossier.
	 *
	 * @return the organization ID of this dossier
	 */
	public long getOrganizationId();

	/**
	 * Sets the organization ID of this dossier.
	 *
	 * @param organizationId the organization ID of this dossier
	 */
	public void setOrganizationId(long organizationId);

	/**
	 * Returns the dossier proc ID of this dossier.
	 *
	 * @return the dossier proc ID of this dossier
	 */
	public long getDossierProcId();

	/**
	 * Sets the dossier proc ID of this dossier.
	 *
	 * @param dossierProcId the dossier proc ID of this dossier
	 */
	public void setDossierProcId(long dossierProcId);

	/**
	 * Returns the gov agency ID of this dossier.
	 *
	 * @return the gov agency ID of this dossier
	 */
	@AutoEscape
	public String getGovAgencyId();

	/**
	 * Sets the gov agency ID of this dossier.
	 *
	 * @param govAgencyId the gov agency ID of this dossier
	 */
	public void setGovAgencyId(String govAgencyId);

	/**
	 * Returns the gov agency name of this dossier.
	 *
	 * @return the gov agency name of this dossier
	 */
	@AutoEscape
	public String getGovAgencyName();

	/**
	 * Sets the gov agency name of this dossier.
	 *
	 * @param govAgencyName the gov agency name of this dossier
	 */
	public void setGovAgencyName(String govAgencyName);

	/**
	 * Returns the subject ID of this dossier.
	 *
	 * @return the subject ID of this dossier
	 */
	@AutoEscape
	public String getSubjectId();

	/**
	 * Sets the subject ID of this dossier.
	 *
	 * @param subjectId the subject ID of this dossier
	 */
	public void setSubjectId(String subjectId);

	/**
	 * Returns the subject type of this dossier.
	 *
	 * @return the subject type of this dossier
	 */
	@AutoEscape
	public String getSubjectType();

	/**
	 * Sets the subject type of this dossier.
	 *
	 * @param subjectType the subject type of this dossier
	 */
	public void setSubjectType(String subjectType);

	/**
	 * Returns the subject name of this dossier.
	 *
	 * @return the subject name of this dossier
	 */
	@AutoEscape
	public String getSubjectName();

	/**
	 * Sets the subject name of this dossier.
	 *
	 * @param subjectName the subject name of this dossier
	 */
	public void setSubjectName(String subjectName);

	/**
	 * Returns the address of this dossier.
	 *
	 * @return the address of this dossier
	 */
	@AutoEscape
	public String getAddress();

	/**
	 * Sets the address of this dossier.
	 *
	 * @param address the address of this dossier
	 */
	public void setAddress(String address);

	/**
	 * Returns the city no of this dossier.
	 *
	 * @return the city no of this dossier
	 */
	@AutoEscape
	public String getCityNo();

	/**
	 * Sets the city no of this dossier.
	 *
	 * @param cityNo the city no of this dossier
	 */
	public void setCityNo(String cityNo);

	/**
	 * Returns the city name of this dossier.
	 *
	 * @return the city name of this dossier
	 */
	@AutoEscape
	public String getCityName();

	/**
	 * Sets the city name of this dossier.
	 *
	 * @param cityName the city name of this dossier
	 */
	public void setCityName(String cityName);

	/**
	 * Returns the district no of this dossier.
	 *
	 * @return the district no of this dossier
	 */
	@AutoEscape
	public String getDistrictNo();

	/**
	 * Sets the district no of this dossier.
	 *
	 * @param districtNo the district no of this dossier
	 */
	public void setDistrictNo(String districtNo);

	/**
	 * Returns the district name of this dossier.
	 *
	 * @return the district name of this dossier
	 */
	@AutoEscape
	public String getDistrictName();

	/**
	 * Sets the district name of this dossier.
	 *
	 * @param districtName the district name of this dossier
	 */
	public void setDistrictName(String districtName);

	/**
	 * Returns the ward no of this dossier.
	 *
	 * @return the ward no of this dossier
	 */
	@AutoEscape
	public String getWardNo();

	/**
	 * Sets the ward no of this dossier.
	 *
	 * @param wardNo the ward no of this dossier
	 */
	public void setWardNo(String wardNo);

	/**
	 * Returns the ward name of this dossier.
	 *
	 * @return the ward name of this dossier
	 */
	@AutoEscape
	public String getWardName();

	/**
	 * Sets the ward name of this dossier.
	 *
	 * @param wardName the ward name of this dossier
	 */
	public void setWardName(String wardName);

	/**
	 * Returns the tel no of this dossier.
	 *
	 * @return the tel no of this dossier
	 */
	@AutoEscape
	public String getTelNo();

	/**
	 * Sets the tel no of this dossier.
	 *
	 * @param telNo the tel no of this dossier
	 */
	public void setTelNo(String telNo);

	/**
	 * Returns the contact person name of this dossier.
	 *
	 * @return the contact person name of this dossier
	 */
	@AutoEscape
	public String getContactPersonName();

	/**
	 * Sets the contact person name of this dossier.
	 *
	 * @param contactPersonName the contact person name of this dossier
	 */
	public void setContactPersonName(String contactPersonName);

	/**
	 * Returns the contact person tel of this dossier.
	 *
	 * @return the contact person tel of this dossier
	 */
	@AutoEscape
	public String getContactPersonTel();

	/**
	 * Sets the contact person tel of this dossier.
	 *
	 * @param contactPersonTel the contact person tel of this dossier
	 */
	public void setContactPersonTel(String contactPersonTel);

	/**
	 * Returns the note of this dossier.
	 *
	 * @return the note of this dossier
	 */
	@AutoEscape
	public String getNote();

	/**
	 * Sets the note of this dossier.
	 *
	 * @param note the note of this dossier
	 */
	public void setNote(String note);

	/**
	 * Returns the resume description of this dossier.
	 *
	 * @return the resume description of this dossier
	 */
	@AutoEscape
	public String getResumeDescription();

	/**
	 * Sets the resume description of this dossier.
	 *
	 * @param resumeDescription the resume description of this dossier
	 */
	public void setResumeDescription(String resumeDescription);

	/**
	 * Returns the reception no of this dossier.
	 *
	 * @return the reception no of this dossier
	 */
	@AutoEscape
	public String getReceptionNo();

	/**
	 * Sets the reception no of this dossier.
	 *
	 * @param receptionNo the reception no of this dossier
	 */
	public void setReceptionNo(String receptionNo);

	/**
	 * Returns the submit date of this dossier.
	 *
	 * @return the submit date of this dossier
	 */
	public Date getSubmitDate();

	/**
	 * Sets the submit date of this dossier.
	 *
	 * @param submitDate the submit date of this dossier
	 */
	public void setSubmitDate(Date submitDate);

	/**
	 * Returns the receive date of this dossier.
	 *
	 * @return the receive date of this dossier
	 */
	public Date getReceiveDate();

	/**
	 * Sets the receive date of this dossier.
	 *
	 * @param receiveDate the receive date of this dossier
	 */
	public void setReceiveDate(Date receiveDate);

	/**
	 * Returns the renew date of this dossier.
	 *
	 * @return the renew date of this dossier
	 */
	public Date getRenewDate();

	/**
	 * Sets the renew date of this dossier.
	 *
	 * @param renewDate the renew date of this dossier
	 */
	public void setRenewDate(Date renewDate);

	/**
	 * Returns the estimate date of this dossier.
	 *
	 * @return the estimate date of this dossier
	 */
	public Date getEstimateDate();

	/**
	 * Sets the estimate date of this dossier.
	 *
	 * @param estimateDate the estimate date of this dossier
	 */
	public void setEstimateDate(Date estimateDate);

	/**
	 * Returns the finish date of this dossier.
	 *
	 * @return the finish date of this dossier
	 */
	public Date getFinishDate();

	/**
	 * Sets the finish date of this dossier.
	 *
	 * @param finishDate the finish date of this dossier
	 */
	public void setFinishDate(Date finishDate);

	/**
	 * Returns the return date of this dossier.
	 *
	 * @return the return date of this dossier
	 */
	public Date getReturnDate();

	/**
	 * Sets the return date of this dossier.
	 *
	 * @param returnDate the return date of this dossier
	 */
	public void setReturnDate(Date returnDate);

	/**
	 * Returns the status of this dossier.
	 *
	 * @return the status of this dossier
	 */
	@AutoEscape
	public String getStatus();

	/**
	 * Sets the status of this dossier.
	 *
	 * @param status the status of this dossier
	 */
	public void setStatus(String status);

	/**
	 * Returns the status date of this dossier.
	 *
	 * @return the status date of this dossier
	 */
	public Date getStatusDate();

	/**
	 * Sets the status date of this dossier.
	 *
	 * @param statusDate the status date of this dossier
	 */
	public void setStatusDate(Date statusDate);

	/**
	 * Returns the status description of this dossier.
	 *
	 * @return the status description of this dossier
	 */
	@AutoEscape
	public String getStatusDescription();

	/**
	 * Sets the status description of this dossier.
	 *
	 * @param statusDescription the status description of this dossier
	 */
	public void setStatusDescription(String statusDescription);

	/**
	 * Returns the feedback note of this dossier.
	 *
	 * @return the feedback note of this dossier
	 */
	@AutoEscape
	public String getFeedbackNote();

	/**
	 * Sets the feedback note of this dossier.
	 *
	 * @param feedbackNote the feedback note of this dossier
	 */
	public void setFeedbackNote(String feedbackNote);

	/**
	 * Returns the days delay of this dossier.
	 *
	 * @return the days delay of this dossier
	 */
	public int getDaysDelay();

	/**
	 * Sets the days delay of this dossier.
	 *
	 * @param daysDelay the days delay of this dossier
	 */
	public void setDaysDelay(int daysDelay);

	/**
	 * Returns the close date of this dossier.
	 *
	 * @return the close date of this dossier
	 */
	public Date getCloseDate();

	/**
	 * Sets the close date of this dossier.
	 *
	 * @param closeDate the close date of this dossier
	 */
	public void setCloseDate(Date closeDate);

	/**
	 * Returns the error status of this dossier.
	 *
	 * @return the error status of this dossier
	 */
	@AutoEscape
	public String getErrorStatus();

	/**
	 * Sets the error status of this dossier.
	 *
	 * @param errorStatus the error status of this dossier
	 */
	public void setErrorStatus(String errorStatus);

	/**
	 * Returns the pending status of this dossier.
	 *
	 * @return the pending status of this dossier
	 */
	public int getPendingStatus();

	/**
	 * Sets the pending status of this dossier.
	 *
	 * @param pendingStatus the pending status of this dossier
	 */
	public void setPendingStatus(int pendingStatus);

	/**
	 * Returns the error code of this dossier.
	 *
	 * @return the error code of this dossier
	 */
	@AutoEscape
	public String getErrorCode();

	/**
	 * Sets the error code of this dossier.
	 *
	 * @param errorCode the error code of this dossier
	 */
	public void setErrorCode(String errorCode);

	/**
	 * Returns the dirty of this dossier.
	 *
	 * @return the dirty of this dossier
	 */
	public int getDirty();

	/**
	 * Sets the dirty of this dossier.
	 *
	 * @param dirty the dirty of this dossier
	 */
	public void setDirty(int dirty);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(Dossier dossier);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Dossier> toCacheModel();

	@Override
	public Dossier toEscapedModel();

	@Override
	public Dossier toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}