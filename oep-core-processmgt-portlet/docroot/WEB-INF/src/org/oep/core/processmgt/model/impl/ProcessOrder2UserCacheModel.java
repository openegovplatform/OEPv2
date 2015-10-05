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

package org.oep.core.processmgt.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import org.oep.core.processmgt.model.ProcessOrder2User;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing ProcessOrder2User in entity cache.
 *
 * @author trungdk
 * @see ProcessOrder2User
 * @generated
 */
public class ProcessOrder2UserCacheModel implements CacheModel<ProcessOrder2User>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{processOrderId=");
		sb.append(processOrderId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ProcessOrder2User toEntityModel() {
		ProcessOrder2UserImpl processOrder2UserImpl = new ProcessOrder2UserImpl();

		processOrder2UserImpl.setProcessOrderId(processOrderId);
		processOrder2UserImpl.setUserId(userId);

		processOrder2UserImpl.resetOriginalValues();

		return processOrder2UserImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		processOrderId = objectInput.readLong();
		userId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(processOrderId);
		objectOutput.writeLong(userId);
	}

	public long processOrderId;
	public long userId;
}