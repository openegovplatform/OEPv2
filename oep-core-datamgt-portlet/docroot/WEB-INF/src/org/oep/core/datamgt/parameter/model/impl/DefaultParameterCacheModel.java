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

package org.oep.core.datamgt.parameter.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import org.oep.core.datamgt.parameter.model.DefaultParameter;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DefaultParameter in entity cache.
 *
 * @author TrungDK
 * @see DefaultParameter
 * @generated
 */
public class DefaultParameterCacheModel implements CacheModel<DefaultParameter>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{defaultParameterId=");
		sb.append(defaultParameterId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", applicationName=");
		sb.append(applicationName);
		sb.append(", parameterName=");
		sb.append(parameterName);
		sb.append(", title=");
		sb.append(title);
		sb.append(", parameterValue=");
		sb.append(parameterValue);
		sb.append(", changeable=");
		sb.append(changeable);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DefaultParameter toEntityModel() {
		DefaultParameterImpl defaultParameterImpl = new DefaultParameterImpl();

		defaultParameterImpl.setDefaultParameterId(defaultParameterId);
		defaultParameterImpl.setCompanyId(companyId);

		if (createDate == Long.MIN_VALUE) {
			defaultParameterImpl.setCreateDate(null);
		}
		else {
			defaultParameterImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			defaultParameterImpl.setModifiedDate(null);
		}
		else {
			defaultParameterImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (applicationName == null) {
			defaultParameterImpl.setApplicationName(StringPool.BLANK);
		}
		else {
			defaultParameterImpl.setApplicationName(applicationName);
		}

		if (parameterName == null) {
			defaultParameterImpl.setParameterName(StringPool.BLANK);
		}
		else {
			defaultParameterImpl.setParameterName(parameterName);
		}

		if (title == null) {
			defaultParameterImpl.setTitle(StringPool.BLANK);
		}
		else {
			defaultParameterImpl.setTitle(title);
		}

		if (parameterValue == null) {
			defaultParameterImpl.setParameterValue(StringPool.BLANK);
		}
		else {
			defaultParameterImpl.setParameterValue(parameterValue);
		}

		defaultParameterImpl.setChangeable(changeable);

		defaultParameterImpl.resetOriginalValues();

		return defaultParameterImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		defaultParameterId = objectInput.readLong();
		companyId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		applicationName = objectInput.readUTF();
		parameterName = objectInput.readUTF();
		title = objectInput.readUTF();
		parameterValue = objectInput.readUTF();
		changeable = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(defaultParameterId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (applicationName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(applicationName);
		}

		if (parameterName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(parameterName);
		}

		if (title == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(title);
		}

		if (parameterValue == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(parameterValue);
		}

		objectOutput.writeInt(changeable);
	}

	public long defaultParameterId;
	public long companyId;
	public long createDate;
	public long modifiedDate;
	public String applicationName;
	public String parameterName;
	public String title;
	public String parameterValue;
	public int changeable;
}