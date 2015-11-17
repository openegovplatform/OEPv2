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

package org.oep.processmgt.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link DossierProc2Process}.
 * </p>
 *
 * @author trungdk
 * @see DossierProc2Process
 * @generated
 */
public class DossierProc2ProcessWrapper implements DossierProc2Process,
	ModelWrapper<DossierProc2Process> {
	public DossierProc2ProcessWrapper(DossierProc2Process dossierProc2Process) {
		_dossierProc2Process = dossierProc2Process;
	}

	@Override
	public Class<?> getModelClass() {
		return DossierProc2Process.class;
	}

	@Override
	public String getModelClassName() {
		return DossierProc2Process.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("dossierProc2ProcessId", getDossierProc2ProcessId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("dossierProcId", getDossierProcId());
		attributes.put("govAgencyId", getGovAgencyId());
		attributes.put("govAgencyName", getGovAgencyName());
		attributes.put("dossierProcessId", getDossierProcessId());
		attributes.put("aaaa", getAaaa());
		attributes.put("bbb", getBbb());
		attributes.put("daysDuration", getDaysDuration());
		attributes.put("paymentFee", getPaymentFee());
		attributes.put("paymentOneGate", getPaymentOneGate());
		attributes.put("paymentEservice", getPaymentEservice());
		attributes.put("organizationId", getOrganizationId());
		attributes.put("ebPartnershipId", getEbPartnershipId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long dossierProc2ProcessId = (Long)attributes.get(
				"dossierProc2ProcessId");

		if (dossierProc2ProcessId != null) {
			setDossierProc2ProcessId(dossierProc2ProcessId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long dossierProcId = (Long)attributes.get("dossierProcId");

		if (dossierProcId != null) {
			setDossierProcId(dossierProcId);
		}

		String govAgencyId = (String)attributes.get("govAgencyId");

		if (govAgencyId != null) {
			setGovAgencyId(govAgencyId);
		}

		String govAgencyName = (String)attributes.get("govAgencyName");

		if (govAgencyName != null) {
			setGovAgencyName(govAgencyName);
		}

		Long dossierProcessId = (Long)attributes.get("dossierProcessId");

		if (dossierProcessId != null) {
			setDossierProcessId(dossierProcessId);
		}

		String aaaa = (String)attributes.get("aaaa");

		if (aaaa != null) {
			setAaaa(aaaa);
		}

		String bbb = (String)attributes.get("bbb");

		if (bbb != null) {
			setBbb(bbb);
		}

		Integer daysDuration = (Integer)attributes.get("daysDuration");

		if (daysDuration != null) {
			setDaysDuration(daysDuration);
		}

		Integer paymentFee = (Integer)attributes.get("paymentFee");

		if (paymentFee != null) {
			setPaymentFee(paymentFee);
		}

		Integer paymentOneGate = (Integer)attributes.get("paymentOneGate");

		if (paymentOneGate != null) {
			setPaymentOneGate(paymentOneGate);
		}

		Integer paymentEservice = (Integer)attributes.get("paymentEservice");

		if (paymentEservice != null) {
			setPaymentEservice(paymentEservice);
		}

		Long organizationId = (Long)attributes.get("organizationId");

		if (organizationId != null) {
			setOrganizationId(organizationId);
		}

		Long ebPartnershipId = (Long)attributes.get("ebPartnershipId");

		if (ebPartnershipId != null) {
			setEbPartnershipId(ebPartnershipId);
		}
	}

	/**
	* Returns the primary key of this dossier proc2 process.
	*
	* @return the primary key of this dossier proc2 process
	*/
	@Override
	public long getPrimaryKey() {
		return _dossierProc2Process.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dossier proc2 process.
	*
	* @param primaryKey the primary key of this dossier proc2 process
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dossierProc2Process.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the dossier proc2 process ID of this dossier proc2 process.
	*
	* @return the dossier proc2 process ID of this dossier proc2 process
	*/
	@Override
	public long getDossierProc2ProcessId() {
		return _dossierProc2Process.getDossierProc2ProcessId();
	}

	/**
	* Sets the dossier proc2 process ID of this dossier proc2 process.
	*
	* @param dossierProc2ProcessId the dossier proc2 process ID of this dossier proc2 process
	*/
	@Override
	public void setDossierProc2ProcessId(long dossierProc2ProcessId) {
		_dossierProc2Process.setDossierProc2ProcessId(dossierProc2ProcessId);
	}

	/**
	* Returns the user ID of this dossier proc2 process.
	*
	* @return the user ID of this dossier proc2 process
	*/
	@Override
	public long getUserId() {
		return _dossierProc2Process.getUserId();
	}

	/**
	* Sets the user ID of this dossier proc2 process.
	*
	* @param userId the user ID of this dossier proc2 process
	*/
	@Override
	public void setUserId(long userId) {
		_dossierProc2Process.setUserId(userId);
	}

	/**
	* Returns the user uuid of this dossier proc2 process.
	*
	* @return the user uuid of this dossier proc2 process
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierProc2Process.getUserUuid();
	}

	/**
	* Sets the user uuid of this dossier proc2 process.
	*
	* @param userUuid the user uuid of this dossier proc2 process
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_dossierProc2Process.setUserUuid(userUuid);
	}

	/**
	* Returns the group ID of this dossier proc2 process.
	*
	* @return the group ID of this dossier proc2 process
	*/
	@Override
	public long getGroupId() {
		return _dossierProc2Process.getGroupId();
	}

	/**
	* Sets the group ID of this dossier proc2 process.
	*
	* @param groupId the group ID of this dossier proc2 process
	*/
	@Override
	public void setGroupId(long groupId) {
		_dossierProc2Process.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this dossier proc2 process.
	*
	* @return the company ID of this dossier proc2 process
	*/
	@Override
	public long getCompanyId() {
		return _dossierProc2Process.getCompanyId();
	}

	/**
	* Sets the company ID of this dossier proc2 process.
	*
	* @param companyId the company ID of this dossier proc2 process
	*/
	@Override
	public void setCompanyId(long companyId) {
		_dossierProc2Process.setCompanyId(companyId);
	}

	/**
	* Returns the create date of this dossier proc2 process.
	*
	* @return the create date of this dossier proc2 process
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _dossierProc2Process.getCreateDate();
	}

	/**
	* Sets the create date of this dossier proc2 process.
	*
	* @param createDate the create date of this dossier proc2 process
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_dossierProc2Process.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this dossier proc2 process.
	*
	* @return the modified date of this dossier proc2 process
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dossierProc2Process.getModifiedDate();
	}

	/**
	* Sets the modified date of this dossier proc2 process.
	*
	* @param modifiedDate the modified date of this dossier proc2 process
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dossierProc2Process.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the dossier proc ID of this dossier proc2 process.
	*
	* @return the dossier proc ID of this dossier proc2 process
	*/
	@Override
	public long getDossierProcId() {
		return _dossierProc2Process.getDossierProcId();
	}

	/**
	* Sets the dossier proc ID of this dossier proc2 process.
	*
	* @param dossierProcId the dossier proc ID of this dossier proc2 process
	*/
	@Override
	public void setDossierProcId(long dossierProcId) {
		_dossierProc2Process.setDossierProcId(dossierProcId);
	}

	/**
	* Returns the gov agency ID of this dossier proc2 process.
	*
	* @return the gov agency ID of this dossier proc2 process
	*/
	@Override
	public java.lang.String getGovAgencyId() {
		return _dossierProc2Process.getGovAgencyId();
	}

	/**
	* Sets the gov agency ID of this dossier proc2 process.
	*
	* @param govAgencyId the gov agency ID of this dossier proc2 process
	*/
	@Override
	public void setGovAgencyId(java.lang.String govAgencyId) {
		_dossierProc2Process.setGovAgencyId(govAgencyId);
	}

	/**
	* Returns the gov agency name of this dossier proc2 process.
	*
	* @return the gov agency name of this dossier proc2 process
	*/
	@Override
	public java.lang.String getGovAgencyName() {
		return _dossierProc2Process.getGovAgencyName();
	}

	/**
	* Sets the gov agency name of this dossier proc2 process.
	*
	* @param govAgencyName the gov agency name of this dossier proc2 process
	*/
	@Override
	public void setGovAgencyName(java.lang.String govAgencyName) {
		_dossierProc2Process.setGovAgencyName(govAgencyName);
	}

	/**
	* Returns the dossier process ID of this dossier proc2 process.
	*
	* @return the dossier process ID of this dossier proc2 process
	*/
	@Override
	public long getDossierProcessId() {
		return _dossierProc2Process.getDossierProcessId();
	}

	/**
	* Sets the dossier process ID of this dossier proc2 process.
	*
	* @param dossierProcessId the dossier process ID of this dossier proc2 process
	*/
	@Override
	public void setDossierProcessId(long dossierProcessId) {
		_dossierProc2Process.setDossierProcessId(dossierProcessId);
	}

	/**
	* Returns the aaaa of this dossier proc2 process.
	*
	* @return the aaaa of this dossier proc2 process
	*/
	@Override
	public java.lang.String getAaaa() {
		return _dossierProc2Process.getAaaa();
	}

	/**
	* Sets the aaaa of this dossier proc2 process.
	*
	* @param aaaa the aaaa of this dossier proc2 process
	*/
	@Override
	public void setAaaa(java.lang.String aaaa) {
		_dossierProc2Process.setAaaa(aaaa);
	}

	/**
	* Returns the bbb of this dossier proc2 process.
	*
	* @return the bbb of this dossier proc2 process
	*/
	@Override
	public java.lang.String getBbb() {
		return _dossierProc2Process.getBbb();
	}

	/**
	* Sets the bbb of this dossier proc2 process.
	*
	* @param bbb the bbb of this dossier proc2 process
	*/
	@Override
	public void setBbb(java.lang.String bbb) {
		_dossierProc2Process.setBbb(bbb);
	}

	/**
	* Returns the days duration of this dossier proc2 process.
	*
	* @return the days duration of this dossier proc2 process
	*/
	@Override
	public int getDaysDuration() {
		return _dossierProc2Process.getDaysDuration();
	}

	/**
	* Sets the days duration of this dossier proc2 process.
	*
	* @param daysDuration the days duration of this dossier proc2 process
	*/
	@Override
	public void setDaysDuration(int daysDuration) {
		_dossierProc2Process.setDaysDuration(daysDuration);
	}

	/**
	* Returns the payment fee of this dossier proc2 process.
	*
	* @return the payment fee of this dossier proc2 process
	*/
	@Override
	public int getPaymentFee() {
		return _dossierProc2Process.getPaymentFee();
	}

	/**
	* Sets the payment fee of this dossier proc2 process.
	*
	* @param paymentFee the payment fee of this dossier proc2 process
	*/
	@Override
	public void setPaymentFee(int paymentFee) {
		_dossierProc2Process.setPaymentFee(paymentFee);
	}

	/**
	* Returns the payment one gate of this dossier proc2 process.
	*
	* @return the payment one gate of this dossier proc2 process
	*/
	@Override
	public int getPaymentOneGate() {
		return _dossierProc2Process.getPaymentOneGate();
	}

	/**
	* Sets the payment one gate of this dossier proc2 process.
	*
	* @param paymentOneGate the payment one gate of this dossier proc2 process
	*/
	@Override
	public void setPaymentOneGate(int paymentOneGate) {
		_dossierProc2Process.setPaymentOneGate(paymentOneGate);
	}

	/**
	* Returns the payment eservice of this dossier proc2 process.
	*
	* @return the payment eservice of this dossier proc2 process
	*/
	@Override
	public int getPaymentEservice() {
		return _dossierProc2Process.getPaymentEservice();
	}

	/**
	* Sets the payment eservice of this dossier proc2 process.
	*
	* @param paymentEservice the payment eservice of this dossier proc2 process
	*/
	@Override
	public void setPaymentEservice(int paymentEservice) {
		_dossierProc2Process.setPaymentEservice(paymentEservice);
	}

	/**
	* Returns the organization ID of this dossier proc2 process.
	*
	* @return the organization ID of this dossier proc2 process
	*/
	@Override
	public long getOrganizationId() {
		return _dossierProc2Process.getOrganizationId();
	}

	/**
	* Sets the organization ID of this dossier proc2 process.
	*
	* @param organizationId the organization ID of this dossier proc2 process
	*/
	@Override
	public void setOrganizationId(long organizationId) {
		_dossierProc2Process.setOrganizationId(organizationId);
	}

	/**
	* Returns the eb partnership ID of this dossier proc2 process.
	*
	* @return the eb partnership ID of this dossier proc2 process
	*/
	@Override
	public long getEbPartnershipId() {
		return _dossierProc2Process.getEbPartnershipId();
	}

	/**
	* Sets the eb partnership ID of this dossier proc2 process.
	*
	* @param ebPartnershipId the eb partnership ID of this dossier proc2 process
	*/
	@Override
	public void setEbPartnershipId(long ebPartnershipId) {
		_dossierProc2Process.setEbPartnershipId(ebPartnershipId);
	}

	@Override
	public boolean isNew() {
		return _dossierProc2Process.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dossierProc2Process.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dossierProc2Process.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dossierProc2Process.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dossierProc2Process.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dossierProc2Process.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dossierProc2Process.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dossierProc2Process.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dossierProc2Process.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dossierProc2Process.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dossierProc2Process.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DossierProc2ProcessWrapper((DossierProc2Process)_dossierProc2Process.clone());
	}

	@Override
	public int compareTo(
		org.oep.processmgt.model.DossierProc2Process dossierProc2Process) {
		return _dossierProc2Process.compareTo(dossierProc2Process);
	}

	@Override
	public int hashCode() {
		return _dossierProc2Process.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.oep.processmgt.model.DossierProc2Process> toCacheModel() {
		return _dossierProc2Process.toCacheModel();
	}

	@Override
	public org.oep.processmgt.model.DossierProc2Process toEscapedModel() {
		return new DossierProc2ProcessWrapper(_dossierProc2Process.toEscapedModel());
	}

	@Override
	public org.oep.processmgt.model.DossierProc2Process toUnescapedModel() {
		return new DossierProc2ProcessWrapper(_dossierProc2Process.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dossierProc2Process.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dossierProc2Process.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dossierProc2Process.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DossierProc2ProcessWrapper)) {
			return false;
		}

		DossierProc2ProcessWrapper dossierProc2ProcessWrapper = (DossierProc2ProcessWrapper)obj;

		if (Validator.equals(_dossierProc2Process,
					dossierProc2ProcessWrapper._dossierProc2Process)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DossierProc2Process getWrappedDossierProc2Process() {
		return _dossierProc2Process;
	}

	@Override
	public DossierProc2Process getWrappedModel() {
		return _dossierProc2Process;
	}

	@Override
	public void resetOriginalValues() {
		_dossierProc2Process.resetOriginalValues();
	}

	private DossierProc2Process _dossierProc2Process;
}