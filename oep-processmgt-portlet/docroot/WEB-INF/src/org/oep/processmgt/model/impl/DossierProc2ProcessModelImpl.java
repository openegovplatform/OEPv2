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

package org.oep.processmgt.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import org.oep.processmgt.model.DossierProc2Process;
import org.oep.processmgt.model.DossierProc2ProcessModel;
import org.oep.processmgt.model.DossierProc2ProcessSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the DossierProc2Process service. Represents a row in the &quot;oep_processmgt_dossierproc2process&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.oep.processmgt.model.DossierProc2ProcessModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DossierProc2ProcessImpl}.
 * </p>
 *
 * @author trungdk
 * @see DossierProc2ProcessImpl
 * @see org.oep.processmgt.model.DossierProc2Process
 * @see org.oep.processmgt.model.DossierProc2ProcessModel
 * @generated
 */
@JSON(strict = true)
public class DossierProc2ProcessModelImpl extends BaseModelImpl<DossierProc2Process>
	implements DossierProc2ProcessModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a dossier proc2 process model instance should use the {@link org.oep.processmgt.model.DossierProc2Process} interface instead.
	 */
	public static final String TABLE_NAME = "oep_processmgt_dossierproc2process";
	public static final Object[][] TABLE_COLUMNS = {
			{ "dossierProc2ProcessId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "dossierProcId", Types.BIGINT },
			{ "govAgencyId", Types.VARCHAR },
			{ "govAgencyName", Types.VARCHAR },
			{ "dossierProcessId", Types.BIGINT },
			{ "aaaa", Types.VARCHAR },
			{ "bbb", Types.VARCHAR },
			{ "daysDuration", Types.INTEGER },
			{ "paymentFee", Types.INTEGER },
			{ "paymentOneGate", Types.INTEGER },
			{ "paymentEservice", Types.INTEGER },
			{ "organizationId", Types.BIGINT },
			{ "ebPartnershipId", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table oep_processmgt_dossierproc2process (dossierProc2ProcessId LONG not null primary key,userId LONG,groupId LONG,companyId LONG,createDate DATE null,modifiedDate DATE null,dossierProcId LONG,govAgencyId VARCHAR(30) null,govAgencyName VARCHAR(200) null,dossierProcessId LONG,aaaa VARCHAR(4) null,bbb VARCHAR(3) null,daysDuration INTEGER,paymentFee INTEGER,paymentOneGate INTEGER,paymentEservice INTEGER,organizationId LONG,ebPartnershipId LONG)";
	public static final String TABLE_SQL_DROP = "drop table oep_processmgt_dossierproc2process";
	public static final String ORDER_BY_JPQL = " ORDER BY dossierProc2Process.dossierProc2ProcessId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY oep_processmgt_dossierproc2process.dossierProc2ProcessId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.oep.processmgt.model.DossierProc2Process"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.oep.processmgt.model.DossierProc2Process"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static DossierProc2Process toModel(DossierProc2ProcessSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		DossierProc2Process model = new DossierProc2ProcessImpl();

		model.setDossierProc2ProcessId(soapModel.getDossierProc2ProcessId());
		model.setUserId(soapModel.getUserId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setDossierProcId(soapModel.getDossierProcId());
		model.setGovAgencyId(soapModel.getGovAgencyId());
		model.setGovAgencyName(soapModel.getGovAgencyName());
		model.setDossierProcessId(soapModel.getDossierProcessId());
		model.setAaaa(soapModel.getAaaa());
		model.setBbb(soapModel.getBbb());
		model.setDaysDuration(soapModel.getDaysDuration());
		model.setPaymentFee(soapModel.getPaymentFee());
		model.setPaymentOneGate(soapModel.getPaymentOneGate());
		model.setPaymentEservice(soapModel.getPaymentEservice());
		model.setOrganizationId(soapModel.getOrganizationId());
		model.setEbPartnershipId(soapModel.getEbPartnershipId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<DossierProc2Process> toModels(
		DossierProc2ProcessSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<DossierProc2Process> models = new ArrayList<DossierProc2Process>(soapModels.length);

		for (DossierProc2ProcessSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.oep.processmgt.model.DossierProc2Process"));

	public DossierProc2ProcessModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _dossierProc2ProcessId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setDossierProc2ProcessId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _dossierProc2ProcessId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@JSON
	@Override
	public long getDossierProc2ProcessId() {
		return _dossierProc2ProcessId;
	}

	@Override
	public void setDossierProc2ProcessId(long dossierProc2ProcessId) {
		_dossierProc2ProcessId = dossierProc2ProcessId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public long getDossierProcId() {
		return _dossierProcId;
	}

	@Override
	public void setDossierProcId(long dossierProcId) {
		_dossierProcId = dossierProcId;
	}

	@JSON
	@Override
	public String getGovAgencyId() {
		if (_govAgencyId == null) {
			return StringPool.BLANK;
		}
		else {
			return _govAgencyId;
		}
	}

	@Override
	public void setGovAgencyId(String govAgencyId) {
		_govAgencyId = govAgencyId;
	}

	@JSON
	@Override
	public String getGovAgencyName() {
		if (_govAgencyName == null) {
			return StringPool.BLANK;
		}
		else {
			return _govAgencyName;
		}
	}

	@Override
	public void setGovAgencyName(String govAgencyName) {
		_govAgencyName = govAgencyName;
	}

	@JSON
	@Override
	public long getDossierProcessId() {
		return _dossierProcessId;
	}

	@Override
	public void setDossierProcessId(long dossierProcessId) {
		_dossierProcessId = dossierProcessId;
	}

	@JSON
	@Override
	public String getAaaa() {
		if (_aaaa == null) {
			return StringPool.BLANK;
		}
		else {
			return _aaaa;
		}
	}

	@Override
	public void setAaaa(String aaaa) {
		_aaaa = aaaa;
	}

	@JSON
	@Override
	public String getBbb() {
		if (_bbb == null) {
			return StringPool.BLANK;
		}
		else {
			return _bbb;
		}
	}

	@Override
	public void setBbb(String bbb) {
		_bbb = bbb;
	}

	@JSON
	@Override
	public int getDaysDuration() {
		return _daysDuration;
	}

	@Override
	public void setDaysDuration(int daysDuration) {
		_daysDuration = daysDuration;
	}

	@JSON
	@Override
	public int getPaymentFee() {
		return _paymentFee;
	}

	@Override
	public void setPaymentFee(int paymentFee) {
		_paymentFee = paymentFee;
	}

	@JSON
	@Override
	public int getPaymentOneGate() {
		return _paymentOneGate;
	}

	@Override
	public void setPaymentOneGate(int paymentOneGate) {
		_paymentOneGate = paymentOneGate;
	}

	@JSON
	@Override
	public int getPaymentEservice() {
		return _paymentEservice;
	}

	@Override
	public void setPaymentEservice(int paymentEservice) {
		_paymentEservice = paymentEservice;
	}

	@JSON
	@Override
	public long getOrganizationId() {
		return _organizationId;
	}

	@Override
	public void setOrganizationId(long organizationId) {
		_organizationId = organizationId;
	}

	@JSON
	@Override
	public long getEbPartnershipId() {
		return _ebPartnershipId;
	}

	@Override
	public void setEbPartnershipId(long ebPartnershipId) {
		_ebPartnershipId = ebPartnershipId;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			DossierProc2Process.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public DossierProc2Process toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (DossierProc2Process)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		DossierProc2ProcessImpl dossierProc2ProcessImpl = new DossierProc2ProcessImpl();

		dossierProc2ProcessImpl.setDossierProc2ProcessId(getDossierProc2ProcessId());
		dossierProc2ProcessImpl.setUserId(getUserId());
		dossierProc2ProcessImpl.setGroupId(getGroupId());
		dossierProc2ProcessImpl.setCompanyId(getCompanyId());
		dossierProc2ProcessImpl.setCreateDate(getCreateDate());
		dossierProc2ProcessImpl.setModifiedDate(getModifiedDate());
		dossierProc2ProcessImpl.setDossierProcId(getDossierProcId());
		dossierProc2ProcessImpl.setGovAgencyId(getGovAgencyId());
		dossierProc2ProcessImpl.setGovAgencyName(getGovAgencyName());
		dossierProc2ProcessImpl.setDossierProcessId(getDossierProcessId());
		dossierProc2ProcessImpl.setAaaa(getAaaa());
		dossierProc2ProcessImpl.setBbb(getBbb());
		dossierProc2ProcessImpl.setDaysDuration(getDaysDuration());
		dossierProc2ProcessImpl.setPaymentFee(getPaymentFee());
		dossierProc2ProcessImpl.setPaymentOneGate(getPaymentOneGate());
		dossierProc2ProcessImpl.setPaymentEservice(getPaymentEservice());
		dossierProc2ProcessImpl.setOrganizationId(getOrganizationId());
		dossierProc2ProcessImpl.setEbPartnershipId(getEbPartnershipId());

		dossierProc2ProcessImpl.resetOriginalValues();

		return dossierProc2ProcessImpl;
	}

	@Override
	public int compareTo(DossierProc2Process dossierProc2Process) {
		long primaryKey = dossierProc2Process.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DossierProc2Process)) {
			return false;
		}

		DossierProc2Process dossierProc2Process = (DossierProc2Process)obj;

		long primaryKey = dossierProc2Process.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<DossierProc2Process> toCacheModel() {
		DossierProc2ProcessCacheModel dossierProc2ProcessCacheModel = new DossierProc2ProcessCacheModel();

		dossierProc2ProcessCacheModel.dossierProc2ProcessId = getDossierProc2ProcessId();

		dossierProc2ProcessCacheModel.userId = getUserId();

		dossierProc2ProcessCacheModel.groupId = getGroupId();

		dossierProc2ProcessCacheModel.companyId = getCompanyId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			dossierProc2ProcessCacheModel.createDate = createDate.getTime();
		}
		else {
			dossierProc2ProcessCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			dossierProc2ProcessCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			dossierProc2ProcessCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		dossierProc2ProcessCacheModel.dossierProcId = getDossierProcId();

		dossierProc2ProcessCacheModel.govAgencyId = getGovAgencyId();

		String govAgencyId = dossierProc2ProcessCacheModel.govAgencyId;

		if ((govAgencyId != null) && (govAgencyId.length() == 0)) {
			dossierProc2ProcessCacheModel.govAgencyId = null;
		}

		dossierProc2ProcessCacheModel.govAgencyName = getGovAgencyName();

		String govAgencyName = dossierProc2ProcessCacheModel.govAgencyName;

		if ((govAgencyName != null) && (govAgencyName.length() == 0)) {
			dossierProc2ProcessCacheModel.govAgencyName = null;
		}

		dossierProc2ProcessCacheModel.dossierProcessId = getDossierProcessId();

		dossierProc2ProcessCacheModel.aaaa = getAaaa();

		String aaaa = dossierProc2ProcessCacheModel.aaaa;

		if ((aaaa != null) && (aaaa.length() == 0)) {
			dossierProc2ProcessCacheModel.aaaa = null;
		}

		dossierProc2ProcessCacheModel.bbb = getBbb();

		String bbb = dossierProc2ProcessCacheModel.bbb;

		if ((bbb != null) && (bbb.length() == 0)) {
			dossierProc2ProcessCacheModel.bbb = null;
		}

		dossierProc2ProcessCacheModel.daysDuration = getDaysDuration();

		dossierProc2ProcessCacheModel.paymentFee = getPaymentFee();

		dossierProc2ProcessCacheModel.paymentOneGate = getPaymentOneGate();

		dossierProc2ProcessCacheModel.paymentEservice = getPaymentEservice();

		dossierProc2ProcessCacheModel.organizationId = getOrganizationId();

		dossierProc2ProcessCacheModel.ebPartnershipId = getEbPartnershipId();

		return dossierProc2ProcessCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{dossierProc2ProcessId=");
		sb.append(getDossierProc2ProcessId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", dossierProcId=");
		sb.append(getDossierProcId());
		sb.append(", govAgencyId=");
		sb.append(getGovAgencyId());
		sb.append(", govAgencyName=");
		sb.append(getGovAgencyName());
		sb.append(", dossierProcessId=");
		sb.append(getDossierProcessId());
		sb.append(", aaaa=");
		sb.append(getAaaa());
		sb.append(", bbb=");
		sb.append(getBbb());
		sb.append(", daysDuration=");
		sb.append(getDaysDuration());
		sb.append(", paymentFee=");
		sb.append(getPaymentFee());
		sb.append(", paymentOneGate=");
		sb.append(getPaymentOneGate());
		sb.append(", paymentEservice=");
		sb.append(getPaymentEservice());
		sb.append(", organizationId=");
		sb.append(getOrganizationId());
		sb.append(", ebPartnershipId=");
		sb.append(getEbPartnershipId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(58);

		sb.append("<model><model-name>");
		sb.append("org.oep.processmgt.model.DossierProc2Process");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>dossierProc2ProcessId</column-name><column-value><![CDATA[");
		sb.append(getDossierProc2ProcessId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dossierProcId</column-name><column-value><![CDATA[");
		sb.append(getDossierProcId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>govAgencyId</column-name><column-value><![CDATA[");
		sb.append(getGovAgencyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>govAgencyName</column-name><column-value><![CDATA[");
		sb.append(getGovAgencyName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dossierProcessId</column-name><column-value><![CDATA[");
		sb.append(getDossierProcessId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>aaaa</column-name><column-value><![CDATA[");
		sb.append(getAaaa());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>bbb</column-name><column-value><![CDATA[");
		sb.append(getBbb());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>daysDuration</column-name><column-value><![CDATA[");
		sb.append(getDaysDuration());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>paymentFee</column-name><column-value><![CDATA[");
		sb.append(getPaymentFee());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>paymentOneGate</column-name><column-value><![CDATA[");
		sb.append(getPaymentOneGate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>paymentEservice</column-name><column-value><![CDATA[");
		sb.append(getPaymentEservice());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>organizationId</column-name><column-value><![CDATA[");
		sb.append(getOrganizationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ebPartnershipId</column-name><column-value><![CDATA[");
		sb.append(getEbPartnershipId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = DossierProc2Process.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			DossierProc2Process.class
		};
	private long _dossierProc2ProcessId;
	private long _userId;
	private String _userUuid;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _dossierProcId;
	private String _govAgencyId;
	private String _govAgencyName;
	private long _dossierProcessId;
	private String _aaaa;
	private String _bbb;
	private int _daysDuration;
	private int _paymentFee;
	private int _paymentOneGate;
	private int _paymentEservice;
	private long _organizationId;
	private long _ebPartnershipId;
	private DossierProc2Process _escapedModel;
}