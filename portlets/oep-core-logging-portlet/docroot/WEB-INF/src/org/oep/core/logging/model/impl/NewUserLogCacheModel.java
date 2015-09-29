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

package org.oep.core.logging.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import org.oep.core.logging.model.NewUserLog;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing NewUserLog in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see NewUserLog
 * @generated
 */
public class NewUserLogCacheModel implements CacheModel<NewUserLog>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{id=");
		sb.append(id);
		sb.append(", userActivityId=");
		sb.append(userActivityId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", email=");
		sb.append(email);
		sb.append(", site=");
		sb.append(site);
		sb.append(", page=");
		sb.append(page);
		sb.append(", action=");
		sb.append(action);
		sb.append(", description=");
		sb.append(description);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public NewUserLog toEntityModel() {
		NewUserLogImpl newUserLogImpl = new NewUserLogImpl();

		newUserLogImpl.setId(id);
		newUserLogImpl.setUserActivityId(userActivityId);
		newUserLogImpl.setUserId(userId);
		newUserLogImpl.setGroupId(groupId);
		newUserLogImpl.setCompanyId(companyId);

		if (createDate == Long.MIN_VALUE) {
			newUserLogImpl.setCreateDate(null);
		}
		else {
			newUserLogImpl.setCreateDate(new Date(createDate));
		}

		if (userName == null) {
			newUserLogImpl.setUserName(StringPool.BLANK);
		}
		else {
			newUserLogImpl.setUserName(userName);
		}

		if (email == null) {
			newUserLogImpl.setEmail(StringPool.BLANK);
		}
		else {
			newUserLogImpl.setEmail(email);
		}

		if (site == null) {
			newUserLogImpl.setSite(StringPool.BLANK);
		}
		else {
			newUserLogImpl.setSite(site);
		}

		if (page == null) {
			newUserLogImpl.setPage(StringPool.BLANK);
		}
		else {
			newUserLogImpl.setPage(page);
		}

		if (action == null) {
			newUserLogImpl.setAction(StringPool.BLANK);
		}
		else {
			newUserLogImpl.setAction(action);
		}

		if (description == null) {
			newUserLogImpl.setDescription(StringPool.BLANK);
		}
		else {
			newUserLogImpl.setDescription(description);
		}

		newUserLogImpl.resetOriginalValues();

		return newUserLogImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		userActivityId = objectInput.readLong();
		userId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		createDate = objectInput.readLong();
		userName = objectInput.readUTF();
		email = objectInput.readUTF();
		site = objectInput.readUTF();
		page = objectInput.readUTF();
		action = objectInput.readUTF();
		description = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(userActivityId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createDate);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		if (email == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(email);
		}

		if (site == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(site);
		}

		if (page == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(page);
		}

		if (action == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(action);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}
	}

	public long id;
	public long userActivityId;
	public long userId;
	public long groupId;
	public long companyId;
	public long createDate;
	public String userName;
	public String email;
	public String site;
	public String page;
	public String action;
	public String description;
}