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
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import org.oep.processmgt.model.DossierStep2Role;
import org.oep.processmgt.model.DossierStep2RoleModel;
import org.oep.processmgt.model.DossierStep2RoleSoap;
import org.oep.processmgt.service.persistence.DossierStep2RolePK;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the DossierStep2Role service. Represents a row in the &quot;oep_processmgt_dossierstep2role&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.oep.processmgt.model.DossierStep2RoleModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DossierStep2RoleImpl}.
 * </p>
 *
 * @author trungdk
 * @see DossierStep2RoleImpl
 * @see org.oep.processmgt.model.DossierStep2Role
 * @see org.oep.processmgt.model.DossierStep2RoleModel
 * @generated
 */
@JSON(strict = true)
public class DossierStep2RoleModelImpl extends BaseModelImpl<DossierStep2Role>
	implements DossierStep2RoleModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a dossier step2 role model instance should use the {@link org.oep.processmgt.model.DossierStep2Role} interface instead.
	 */
	public static final String TABLE_NAME = "oep_processmgt_dossierstep2role";
	public static final Object[][] TABLE_COLUMNS = {
			{ "dossierStepId", Types.BIGINT },
			{ "roleId", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table oep_processmgt_dossierstep2role (dossierStepId LONG not null,roleId LONG not null,primary key (dossierStepId, roleId))";
	public static final String TABLE_SQL_DROP = "drop table oep_processmgt_dossierstep2role";
	public static final String ORDER_BY_JPQL = " ORDER BY dossierStep2Role.id.dossierStepId ASC, dossierStep2Role.id.roleId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY oep_processmgt_dossierstep2role.dossierStepId ASC, oep_processmgt_dossierstep2role.roleId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.oep.processmgt.model.DossierStep2Role"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.oep.processmgt.model.DossierStep2Role"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.org.oep.processmgt.model.DossierStep2Role"),
			true);
	public static long DOSSIERSTEPID_COLUMN_BITMASK = 1L;
	public static long ROLEID_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static DossierStep2Role toModel(DossierStep2RoleSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		DossierStep2Role model = new DossierStep2RoleImpl();

		model.setDossierStepId(soapModel.getDossierStepId());
		model.setRoleId(soapModel.getRoleId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<DossierStep2Role> toModels(
		DossierStep2RoleSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<DossierStep2Role> models = new ArrayList<DossierStep2Role>(soapModels.length);

		for (DossierStep2RoleSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.oep.processmgt.model.DossierStep2Role"));

	public DossierStep2RoleModelImpl() {
	}

	@Override
	public DossierStep2RolePK getPrimaryKey() {
		return new DossierStep2RolePK(_dossierStepId, _roleId);
	}

	@Override
	public void setPrimaryKey(DossierStep2RolePK primaryKey) {
		setDossierStepId(primaryKey.dossierStepId);
		setRoleId(primaryKey.roleId);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new DossierStep2RolePK(_dossierStepId, _roleId);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((DossierStep2RolePK)primaryKeyObj);
	}

	@Override
	public Class<?> getModelClass() {
		return DossierStep2Role.class;
	}

	@Override
	public String getModelClassName() {
		return DossierStep2Role.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("dossierStepId", getDossierStepId());
		attributes.put("roleId", getRoleId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long dossierStepId = (Long)attributes.get("dossierStepId");

		if (dossierStepId != null) {
			setDossierStepId(dossierStepId);
		}

		Long roleId = (Long)attributes.get("roleId");

		if (roleId != null) {
			setRoleId(roleId);
		}
	}

	@JSON
	@Override
	public long getDossierStepId() {
		return _dossierStepId;
	}

	@Override
	public void setDossierStepId(long dossierStepId) {
		_columnBitmask |= DOSSIERSTEPID_COLUMN_BITMASK;

		if (!_setOriginalDossierStepId) {
			_setOriginalDossierStepId = true;

			_originalDossierStepId = _dossierStepId;
		}

		_dossierStepId = dossierStepId;
	}

	public long getOriginalDossierStepId() {
		return _originalDossierStepId;
	}

	@JSON
	@Override
	public long getRoleId() {
		return _roleId;
	}

	@Override
	public void setRoleId(long roleId) {
		_columnBitmask |= ROLEID_COLUMN_BITMASK;

		if (!_setOriginalRoleId) {
			_setOriginalRoleId = true;

			_originalRoleId = _roleId;
		}

		_roleId = roleId;
	}

	public long getOriginalRoleId() {
		return _originalRoleId;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public DossierStep2Role toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (DossierStep2Role)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		DossierStep2RoleImpl dossierStep2RoleImpl = new DossierStep2RoleImpl();

		dossierStep2RoleImpl.setDossierStepId(getDossierStepId());
		dossierStep2RoleImpl.setRoleId(getRoleId());

		dossierStep2RoleImpl.resetOriginalValues();

		return dossierStep2RoleImpl;
	}

	@Override
	public int compareTo(DossierStep2Role dossierStep2Role) {
		DossierStep2RolePK primaryKey = dossierStep2Role.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DossierStep2Role)) {
			return false;
		}

		DossierStep2Role dossierStep2Role = (DossierStep2Role)obj;

		DossierStep2RolePK primaryKey = dossierStep2Role.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	@Override
	public void resetOriginalValues() {
		DossierStep2RoleModelImpl dossierStep2RoleModelImpl = this;

		dossierStep2RoleModelImpl._originalDossierStepId = dossierStep2RoleModelImpl._dossierStepId;

		dossierStep2RoleModelImpl._setOriginalDossierStepId = false;

		dossierStep2RoleModelImpl._originalRoleId = dossierStep2RoleModelImpl._roleId;

		dossierStep2RoleModelImpl._setOriginalRoleId = false;

		dossierStep2RoleModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<DossierStep2Role> toCacheModel() {
		DossierStep2RoleCacheModel dossierStep2RoleCacheModel = new DossierStep2RoleCacheModel();

		dossierStep2RoleCacheModel.dossierStepId = getDossierStepId();

		dossierStep2RoleCacheModel.roleId = getRoleId();

		return dossierStep2RoleCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{dossierStepId=");
		sb.append(getDossierStepId());
		sb.append(", roleId=");
		sb.append(getRoleId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("org.oep.processmgt.model.DossierStep2Role");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>dossierStepId</column-name><column-value><![CDATA[");
		sb.append(getDossierStepId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>roleId</column-name><column-value><![CDATA[");
		sb.append(getRoleId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = DossierStep2Role.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			DossierStep2Role.class
		};
	private long _dossierStepId;
	private long _originalDossierStepId;
	private boolean _setOriginalDossierStepId;
	private long _roleId;
	private long _originalRoleId;
	private boolean _setOriginalRoleId;
	private long _columnBitmask;
	private DossierStep2Role _escapedModel;
}