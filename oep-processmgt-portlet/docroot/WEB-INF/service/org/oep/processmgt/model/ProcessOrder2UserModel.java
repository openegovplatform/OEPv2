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

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import org.oep.processmgt.service.persistence.ProcessOrder2UserPK;

import java.io.Serializable;

/**
 * The base model interface for the ProcessOrder2User service. Represents a row in the &quot;oep_processmgt_processorder2user&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.oep.processmgt.model.impl.ProcessOrder2UserModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.oep.processmgt.model.impl.ProcessOrder2UserImpl}.
 * </p>
 *
 * @author trungdk
 * @see ProcessOrder2User
 * @see org.oep.processmgt.model.impl.ProcessOrder2UserImpl
 * @see org.oep.processmgt.model.impl.ProcessOrder2UserModelImpl
 * @generated
 */
public interface ProcessOrder2UserModel extends BaseModel<ProcessOrder2User> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a process order2 user model instance should use the {@link ProcessOrder2User} interface instead.
	 */

	/**
	 * Returns the primary key of this process order2 user.
	 *
	 * @return the primary key of this process order2 user
	 */
	public ProcessOrder2UserPK getPrimaryKey();

	/**
	 * Sets the primary key of this process order2 user.
	 *
	 * @param primaryKey the primary key of this process order2 user
	 */
	public void setPrimaryKey(ProcessOrder2UserPK primaryKey);

	/**
	 * Returns the process order ID of this process order2 user.
	 *
	 * @return the process order ID of this process order2 user
	 */
	public long getProcessOrderId();

	/**
	 * Sets the process order ID of this process order2 user.
	 *
	 * @param processOrderId the process order ID of this process order2 user
	 */
	public void setProcessOrderId(long processOrderId);

	/**
	 * Returns the user ID of this process order2 user.
	 *
	 * @return the user ID of this process order2 user
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this process order2 user.
	 *
	 * @param userId the user ID of this process order2 user
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this process order2 user.
	 *
	 * @return the user uuid of this process order2 user
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this process order2 user.
	 *
	 * @param userUuid the user uuid of this process order2 user
	 */
	public void setUserUuid(String userUuid);

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
	public int compareTo(ProcessOrder2User processOrder2User);

	@Override
	public int hashCode();

	@Override
	public CacheModel<ProcessOrder2User> toCacheModel();

	@Override
	public ProcessOrder2User toEscapedModel();

	@Override
	public ProcessOrder2User toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}