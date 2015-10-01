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

package org.oep.core.dossiermgt.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import org.oep.core.dossiermgt.model.DossierFolder2Role;
import org.oep.core.dossiermgt.model.DossierFolder2RoleModel;
import org.oep.core.dossiermgt.model.DossierFolder2RoleSoap;
import org.oep.core.dossiermgt.service.persistence.DossierFolder2RolePK;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the DossierFolder2Role service. Represents a row in the &quot;oep_dossiermgt_dossierfolder2role&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.oep.core.dossiermgt.model.DossierFolder2RoleModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DossierFolder2RoleImpl}.
 * </p>
 *
 * @author trungdk
 * @see DossierFolder2RoleImpl
 * @see org.oep.core.dossiermgt.model.DossierFolder2Role
 * @see org.oep.core.dossiermgt.model.DossierFolder2RoleModel
 * @generated
 */
@JSON(strict = true)
public class DossierFolder2RoleModelImpl extends BaseModelImpl<DossierFolder2Role>
	implements DossierFolder2RoleModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a dossier folder2 role model instance should use the {@link org.oep.core.dossiermgt.model.DossierFolder2Role} interface instead.
	 */
	public static final String TABLE_NAME = "oep_dossiermgt_dossierfolder2role";
	public static final Object[][] TABLE_COLUMNS = {
			{ "dossierFolderId", Types.BIGINT },
			{ "roleId", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table oep_dossiermgt_dossierfolder2role (dossierFolderId LONG not null,roleId LONG not null,primary key (dossierFolderId, roleId))";
	public static final String TABLE_SQL_DROP = "drop table oep_dossiermgt_dossierfolder2role";
	public static final String ORDER_BY_JPQL = " ORDER BY dossierFolder2Role.id.dossierFolderId ASC, dossierFolder2Role.id.roleId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY oep_dossiermgt_dossierfolder2role.dossierFolderId ASC, oep_dossiermgt_dossierfolder2role.roleId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.oep.core.dossiermgt.model.DossierFolder2Role"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.oep.core.dossiermgt.model.DossierFolder2Role"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static DossierFolder2Role toModel(DossierFolder2RoleSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		DossierFolder2Role model = new DossierFolder2RoleImpl();

		model.setDossierFolderId(soapModel.getDossierFolderId());
		model.setRoleId(soapModel.getRoleId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<DossierFolder2Role> toModels(
		DossierFolder2RoleSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<DossierFolder2Role> models = new ArrayList<DossierFolder2Role>(soapModels.length);

		for (DossierFolder2RoleSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.oep.core.dossiermgt.model.DossierFolder2Role"));

	public DossierFolder2RoleModelImpl() {
	}

	@Override
	public DossierFolder2RolePK getPrimaryKey() {
		return new DossierFolder2RolePK(_dossierFolderId, _roleId);
	}

	@Override
	public void setPrimaryKey(DossierFolder2RolePK primaryKey) {
		setDossierFolderId(primaryKey.dossierFolderId);
		setRoleId(primaryKey.roleId);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new DossierFolder2RolePK(_dossierFolderId, _roleId);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((DossierFolder2RolePK)primaryKeyObj);
	}

	@Override
	public Class<?> getModelClass() {
		return DossierFolder2Role.class;
	}

	@Override
	public String getModelClassName() {
		return DossierFolder2Role.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("dossierFolderId", getDossierFolderId());
		attributes.put("roleId", getRoleId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long dossierFolderId = (Long)attributes.get("dossierFolderId");

		if (dossierFolderId != null) {
			setDossierFolderId(dossierFolderId);
		}

		Long roleId = (Long)attributes.get("roleId");

		if (roleId != null) {
			setRoleId(roleId);
		}
	}

	@JSON
	@Override
	public long getDossierFolderId() {
		return _dossierFolderId;
	}

	@Override
	public void setDossierFolderId(long dossierFolderId) {
		_dossierFolderId = dossierFolderId;
	}

	@JSON
	@Override
	public long getRoleId() {
		return _roleId;
	}

	@Override
	public void setRoleId(long roleId) {
		_roleId = roleId;
	}

	@Override
	public DossierFolder2Role toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (DossierFolder2Role)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		DossierFolder2RoleImpl dossierFolder2RoleImpl = new DossierFolder2RoleImpl();

		dossierFolder2RoleImpl.setDossierFolderId(getDossierFolderId());
		dossierFolder2RoleImpl.setRoleId(getRoleId());

		dossierFolder2RoleImpl.resetOriginalValues();

		return dossierFolder2RoleImpl;
	}

	@Override
	public int compareTo(DossierFolder2Role dossierFolder2Role) {
		DossierFolder2RolePK primaryKey = dossierFolder2Role.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DossierFolder2Role)) {
			return false;
		}

		DossierFolder2Role dossierFolder2Role = (DossierFolder2Role)obj;

		DossierFolder2RolePK primaryKey = dossierFolder2Role.getPrimaryKey();

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
	}

	@Override
	public CacheModel<DossierFolder2Role> toCacheModel() {
		DossierFolder2RoleCacheModel dossierFolder2RoleCacheModel = new DossierFolder2RoleCacheModel();

		dossierFolder2RoleCacheModel.dossierFolderId = getDossierFolderId();

		dossierFolder2RoleCacheModel.roleId = getRoleId();

		return dossierFolder2RoleCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{dossierFolderId=");
		sb.append(getDossierFolderId());
		sb.append(", roleId=");
		sb.append(getRoleId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("org.oep.core.dossiermgt.model.DossierFolder2Role");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>dossierFolderId</column-name><column-value><![CDATA[");
		sb.append(getDossierFolderId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>roleId</column-name><column-value><![CDATA[");
		sb.append(getRoleId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = DossierFolder2Role.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			DossierFolder2Role.class
		};
	private long _dossierFolderId;
	private long _roleId;
	private DossierFolder2Role _escapedModel;
}