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

package org.oep.usermgt.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import org.oep.usermgt.model.Jobpos2Role;
import org.oep.usermgt.model.Jobpos2RoleModel;
import org.oep.usermgt.model.Jobpos2RoleSoap;
import org.oep.usermgt.service.persistence.Jobpos2RolePK;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Jobpos2Role service. Represents a row in the &quot;oep_usermgt_jobpos2role&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.oep.usermgt.model.Jobpos2RoleModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link Jobpos2RoleImpl}.
 * </p>
 *
 * @author NQMINH
 * @see Jobpos2RoleImpl
 * @see org.oep.usermgt.model.Jobpos2Role
 * @see org.oep.usermgt.model.Jobpos2RoleModel
 * @generated
 */
@JSON(strict = true)
public class Jobpos2RoleModelImpl extends BaseModelImpl<Jobpos2Role>
	implements Jobpos2RoleModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a jobpos to role model instance should use the {@link org.oep.usermgt.model.Jobpos2Role} interface instead.
	 */
	public static final String TABLE_NAME = "oep_usermgt_jobpos2role";
	public static final Object[][] TABLE_COLUMNS = {
			{ "jobPosId", Types.BIGINT },
			{ "roleId", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table oep_usermgt_jobpos2role (jobPosId LONG not null,roleId LONG not null,primary key (jobPosId, roleId))";
	public static final String TABLE_SQL_DROP = "drop table oep_usermgt_jobpos2role";
	public static final String ORDER_BY_JPQL = " ORDER BY jobpos2Role.id.jobPosId ASC, jobpos2Role.id.roleId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY oep_usermgt_jobpos2role.jobPosId ASC, oep_usermgt_jobpos2role.roleId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.oep.usermgt.model.Jobpos2Role"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.oep.usermgt.model.Jobpos2Role"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.org.oep.usermgt.model.Jobpos2Role"),
			true);
	public static long JOBPOSID_COLUMN_BITMASK = 1L;
	public static long ROLEID_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Jobpos2Role toModel(Jobpos2RoleSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Jobpos2Role model = new Jobpos2RoleImpl();

		model.setJobPosId(soapModel.getJobPosId());
		model.setRoleId(soapModel.getRoleId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Jobpos2Role> toModels(Jobpos2RoleSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Jobpos2Role> models = new ArrayList<Jobpos2Role>(soapModels.length);

		for (Jobpos2RoleSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.oep.usermgt.model.Jobpos2Role"));

	public Jobpos2RoleModelImpl() {
	}

	@Override
	public Jobpos2RolePK getPrimaryKey() {
		return new Jobpos2RolePK(_jobPosId, _roleId);
	}

	@Override
	public void setPrimaryKey(Jobpos2RolePK primaryKey) {
		setJobPosId(primaryKey.jobPosId);
		setRoleId(primaryKey.roleId);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new Jobpos2RolePK(_jobPosId, _roleId);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((Jobpos2RolePK)primaryKeyObj);
	}

	@Override
	public Class<?> getModelClass() {
		return Jobpos2Role.class;
	}

	@Override
	public String getModelClassName() {
		return Jobpos2Role.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("jobPosId", getJobPosId());
		attributes.put("roleId", getRoleId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long jobPosId = (Long)attributes.get("jobPosId");

		if (jobPosId != null) {
			setJobPosId(jobPosId);
		}

		Long roleId = (Long)attributes.get("roleId");

		if (roleId != null) {
			setRoleId(roleId);
		}
	}

	@JSON
	@Override
	public long getJobPosId() {
		return _jobPosId;
	}

	@Override
	public void setJobPosId(long jobPosId) {
		_columnBitmask |= JOBPOSID_COLUMN_BITMASK;

		if (!_setOriginalJobPosId) {
			_setOriginalJobPosId = true;

			_originalJobPosId = _jobPosId;
		}

		_jobPosId = jobPosId;
	}

	public long getOriginalJobPosId() {
		return _originalJobPosId;
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
	public Jobpos2Role toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Jobpos2Role)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		Jobpos2RoleImpl jobpos2RoleImpl = new Jobpos2RoleImpl();

		jobpos2RoleImpl.setJobPosId(getJobPosId());
		jobpos2RoleImpl.setRoleId(getRoleId());

		jobpos2RoleImpl.resetOriginalValues();

		return jobpos2RoleImpl;
	}

	@Override
	public int compareTo(Jobpos2Role jobpos2Role) {
		Jobpos2RolePK primaryKey = jobpos2Role.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Jobpos2Role)) {
			return false;
		}

		Jobpos2Role jobpos2Role = (Jobpos2Role)obj;

		Jobpos2RolePK primaryKey = jobpos2Role.getPrimaryKey();

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
		Jobpos2RoleModelImpl jobpos2RoleModelImpl = this;

		jobpos2RoleModelImpl._originalJobPosId = jobpos2RoleModelImpl._jobPosId;

		jobpos2RoleModelImpl._setOriginalJobPosId = false;

		jobpos2RoleModelImpl._originalRoleId = jobpos2RoleModelImpl._roleId;

		jobpos2RoleModelImpl._setOriginalRoleId = false;

		jobpos2RoleModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Jobpos2Role> toCacheModel() {
		Jobpos2RoleCacheModel jobpos2RoleCacheModel = new Jobpos2RoleCacheModel();

		jobpos2RoleCacheModel.jobPosId = getJobPosId();

		jobpos2RoleCacheModel.roleId = getRoleId();

		return jobpos2RoleCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{jobPosId=");
		sb.append(getJobPosId());
		sb.append(", roleId=");
		sb.append(getRoleId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("org.oep.usermgt.model.Jobpos2Role");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>jobPosId</column-name><column-value><![CDATA[");
		sb.append(getJobPosId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>roleId</column-name><column-value><![CDATA[");
		sb.append(getRoleId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Jobpos2Role.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			Jobpos2Role.class
		};
	private long _jobPosId;
	private long _originalJobPosId;
	private boolean _setOriginalJobPosId;
	private long _roleId;
	private long _originalRoleId;
	private boolean _setOriginalRoleId;
	private long _columnBitmask;
	private Jobpos2Role _escapedModel;
}