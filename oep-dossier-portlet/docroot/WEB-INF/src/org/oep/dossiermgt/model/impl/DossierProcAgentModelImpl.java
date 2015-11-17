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

package org.oep.dossiermgt.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import org.oep.dossiermgt.model.DossierProcAgent;
import org.oep.dossiermgt.model.DossierProcAgentModel;
import org.oep.dossiermgt.model.DossierProcAgentSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the DossierProcAgent service. Represents a row in the &quot;oep_dossiermgt_dossierprocagent&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.oep.dossiermgt.model.DossierProcAgentModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DossierProcAgentImpl}.
 * </p>
 *
 * @author trungdk
 * @see DossierProcAgentImpl
 * @see org.oep.dossiermgt.model.DossierProcAgent
 * @see org.oep.dossiermgt.model.DossierProcAgentModel
 * @generated
 */
@JSON(strict = true)
public class DossierProcAgentModelImpl extends BaseModelImpl<DossierProcAgent>
	implements DossierProcAgentModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a dossier proc agent model instance should use the {@link org.oep.dossiermgt.model.DossierProcAgent} interface instead.
	 */
	public static final String TABLE_NAME = "oep_dossiermgt_dossierprocagent";
	public static final Object[][] TABLE_COLUMNS = {
			{ "dossierProcAgentId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "dossierProcId", Types.BIGINT },
			{ "govAgencyId", Types.VARCHAR },
			{ "govAgencyName", Types.VARCHAR },
			{ "bankTransfer", Types.VARCHAR },
			{ "keypay", Types.VARCHAR },
			{ "ebPartnerShipId", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table oep_dossiermgt_dossierprocagent (dossierProcAgentId LONG not null primary key,companyId LONG,createDate DATE null,modifiedDate DATE null,dossierProcId LONG,govAgencyId VARCHAR(30) null,govAgencyName VARCHAR(200) null,bankTransfer VARCHAR(500) null,keypay VARCHAR(255) null,ebPartnerShipId LONG)";
	public static final String TABLE_SQL_DROP = "drop table oep_dossiermgt_dossierprocagent";
	public static final String ORDER_BY_JPQL = " ORDER BY dossierProcAgent.dossierProcAgentId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY oep_dossiermgt_dossierprocagent.dossierProcAgentId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.oep.dossiermgt.model.DossierProcAgent"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.oep.dossiermgt.model.DossierProcAgent"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static DossierProcAgent toModel(DossierProcAgentSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		DossierProcAgent model = new DossierProcAgentImpl();

		model.setDossierProcAgentId(soapModel.getDossierProcAgentId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setDossierProcId(soapModel.getDossierProcId());
		model.setGovAgencyId(soapModel.getGovAgencyId());
		model.setGovAgencyName(soapModel.getGovAgencyName());
		model.setBankTransfer(soapModel.getBankTransfer());
		model.setKeypay(soapModel.getKeypay());
		model.setEbPartnerShipId(soapModel.getEbPartnerShipId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<DossierProcAgent> toModels(
		DossierProcAgentSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<DossierProcAgent> models = new ArrayList<DossierProcAgent>(soapModels.length);

		for (DossierProcAgentSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.oep.dossiermgt.model.DossierProcAgent"));

	public DossierProcAgentModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _dossierProcAgentId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setDossierProcAgentId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _dossierProcAgentId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return DossierProcAgent.class;
	}

	@Override
	public String getModelClassName() {
		return DossierProcAgent.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("dossierProcAgentId", getDossierProcAgentId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("dossierProcId", getDossierProcId());
		attributes.put("govAgencyId", getGovAgencyId());
		attributes.put("govAgencyName", getGovAgencyName());
		attributes.put("bankTransfer", getBankTransfer());
		attributes.put("keypay", getKeypay());
		attributes.put("ebPartnerShipId", getEbPartnerShipId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long dossierProcAgentId = (Long)attributes.get("dossierProcAgentId");

		if (dossierProcAgentId != null) {
			setDossierProcAgentId(dossierProcAgentId);
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

		String bankTransfer = (String)attributes.get("bankTransfer");

		if (bankTransfer != null) {
			setBankTransfer(bankTransfer);
		}

		String keypay = (String)attributes.get("keypay");

		if (keypay != null) {
			setKeypay(keypay);
		}

		Long ebPartnerShipId = (Long)attributes.get("ebPartnerShipId");

		if (ebPartnerShipId != null) {
			setEbPartnerShipId(ebPartnerShipId);
		}
	}

	@JSON
	@Override
	public long getDossierProcAgentId() {
		return _dossierProcAgentId;
	}

	@Override
	public void setDossierProcAgentId(long dossierProcAgentId) {
		_dossierProcAgentId = dossierProcAgentId;
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
	public String getBankTransfer() {
		if (_bankTransfer == null) {
			return StringPool.BLANK;
		}
		else {
			return _bankTransfer;
		}
	}

	@Override
	public void setBankTransfer(String bankTransfer) {
		_bankTransfer = bankTransfer;
	}

	@JSON
	@Override
	public String getKeypay() {
		if (_keypay == null) {
			return StringPool.BLANK;
		}
		else {
			return _keypay;
		}
	}

	@Override
	public void setKeypay(String keypay) {
		_keypay = keypay;
	}

	@JSON
	@Override
	public long getEbPartnerShipId() {
		return _ebPartnerShipId;
	}

	@Override
	public void setEbPartnerShipId(long ebPartnerShipId) {
		_ebPartnerShipId = ebPartnerShipId;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			DossierProcAgent.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public DossierProcAgent toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (DossierProcAgent)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		DossierProcAgentImpl dossierProcAgentImpl = new DossierProcAgentImpl();

		dossierProcAgentImpl.setDossierProcAgentId(getDossierProcAgentId());
		dossierProcAgentImpl.setCompanyId(getCompanyId());
		dossierProcAgentImpl.setCreateDate(getCreateDate());
		dossierProcAgentImpl.setModifiedDate(getModifiedDate());
		dossierProcAgentImpl.setDossierProcId(getDossierProcId());
		dossierProcAgentImpl.setGovAgencyId(getGovAgencyId());
		dossierProcAgentImpl.setGovAgencyName(getGovAgencyName());
		dossierProcAgentImpl.setBankTransfer(getBankTransfer());
		dossierProcAgentImpl.setKeypay(getKeypay());
		dossierProcAgentImpl.setEbPartnerShipId(getEbPartnerShipId());

		dossierProcAgentImpl.resetOriginalValues();

		return dossierProcAgentImpl;
	}

	@Override
	public int compareTo(DossierProcAgent dossierProcAgent) {
		long primaryKey = dossierProcAgent.getPrimaryKey();

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

		if (!(obj instanceof DossierProcAgent)) {
			return false;
		}

		DossierProcAgent dossierProcAgent = (DossierProcAgent)obj;

		long primaryKey = dossierProcAgent.getPrimaryKey();

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
	public CacheModel<DossierProcAgent> toCacheModel() {
		DossierProcAgentCacheModel dossierProcAgentCacheModel = new DossierProcAgentCacheModel();

		dossierProcAgentCacheModel.dossierProcAgentId = getDossierProcAgentId();

		dossierProcAgentCacheModel.companyId = getCompanyId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			dossierProcAgentCacheModel.createDate = createDate.getTime();
		}
		else {
			dossierProcAgentCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			dossierProcAgentCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			dossierProcAgentCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		dossierProcAgentCacheModel.dossierProcId = getDossierProcId();

		dossierProcAgentCacheModel.govAgencyId = getGovAgencyId();

		String govAgencyId = dossierProcAgentCacheModel.govAgencyId;

		if ((govAgencyId != null) && (govAgencyId.length() == 0)) {
			dossierProcAgentCacheModel.govAgencyId = null;
		}

		dossierProcAgentCacheModel.govAgencyName = getGovAgencyName();

		String govAgencyName = dossierProcAgentCacheModel.govAgencyName;

		if ((govAgencyName != null) && (govAgencyName.length() == 0)) {
			dossierProcAgentCacheModel.govAgencyName = null;
		}

		dossierProcAgentCacheModel.bankTransfer = getBankTransfer();

		String bankTransfer = dossierProcAgentCacheModel.bankTransfer;

		if ((bankTransfer != null) && (bankTransfer.length() == 0)) {
			dossierProcAgentCacheModel.bankTransfer = null;
		}

		dossierProcAgentCacheModel.keypay = getKeypay();

		String keypay = dossierProcAgentCacheModel.keypay;

		if ((keypay != null) && (keypay.length() == 0)) {
			dossierProcAgentCacheModel.keypay = null;
		}

		dossierProcAgentCacheModel.ebPartnerShipId = getEbPartnerShipId();

		return dossierProcAgentCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{dossierProcAgentId=");
		sb.append(getDossierProcAgentId());
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
		sb.append(", bankTransfer=");
		sb.append(getBankTransfer());
		sb.append(", keypay=");
		sb.append(getKeypay());
		sb.append(", ebPartnerShipId=");
		sb.append(getEbPartnerShipId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("org.oep.dossiermgt.model.DossierProcAgent");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>dossierProcAgentId</column-name><column-value><![CDATA[");
		sb.append(getDossierProcAgentId());
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
			"<column><column-name>bankTransfer</column-name><column-value><![CDATA[");
		sb.append(getBankTransfer());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>keypay</column-name><column-value><![CDATA[");
		sb.append(getKeypay());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ebPartnerShipId</column-name><column-value><![CDATA[");
		sb.append(getEbPartnerShipId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = DossierProcAgent.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			DossierProcAgent.class
		};
	private long _dossierProcAgentId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _dossierProcId;
	private String _govAgencyId;
	private String _govAgencyName;
	private String _bankTransfer;
	private String _keypay;
	private long _ebPartnerShipId;
	private DossierProcAgent _escapedModel;
}