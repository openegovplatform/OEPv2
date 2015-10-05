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

import org.oep.core.logging.model.UserActivity;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing UserActivity in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see UserActivity
 * @generated
 */
public class UserActivityCacheModel implements CacheModel<UserActivity>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{id=");
		sb.append(id);
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
		sb.append(", url=");
		sb.append(url);
		sb.append(", sessionId=");
		sb.append(sessionId);
		sb.append(", ip=");
		sb.append(ip);
		sb.append(", userAgent=");
		sb.append(userAgent);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public UserActivity toEntityModel() {
		UserActivityImpl userActivityImpl = new UserActivityImpl();

		userActivityImpl.setId(id);
		userActivityImpl.setUserId(userId);
		userActivityImpl.setGroupId(groupId);
		userActivityImpl.setCompanyId(companyId);

		if (createDate == Long.MIN_VALUE) {
			userActivityImpl.setCreateDate(null);
		}
		else {
			userActivityImpl.setCreateDate(new Date(createDate));
		}

		if (userName == null) {
			userActivityImpl.setUserName(StringPool.BLANK);
		}
		else {
			userActivityImpl.setUserName(userName);
		}

		if (email == null) {
			userActivityImpl.setEmail(StringPool.BLANK);
		}
		else {
			userActivityImpl.setEmail(email);
		}

		if (site == null) {
			userActivityImpl.setSite(StringPool.BLANK);
		}
		else {
			userActivityImpl.setSite(site);
		}

		if (page == null) {
			userActivityImpl.setPage(StringPool.BLANK);
		}
		else {
			userActivityImpl.setPage(page);
		}

		if (action == null) {
			userActivityImpl.setAction(StringPool.BLANK);
		}
		else {
			userActivityImpl.setAction(action);
		}

		if (description == null) {
			userActivityImpl.setDescription(StringPool.BLANK);
		}
		else {
			userActivityImpl.setDescription(description);
		}

		if (url == null) {
			userActivityImpl.setUrl(StringPool.BLANK);
		}
		else {
			userActivityImpl.setUrl(url);
		}

		if (sessionId == null) {
			userActivityImpl.setSessionId(StringPool.BLANK);
		}
		else {
			userActivityImpl.setSessionId(sessionId);
		}

		if (ip == null) {
			userActivityImpl.setIp(StringPool.BLANK);
		}
		else {
			userActivityImpl.setIp(ip);
		}

		if (userAgent == null) {
			userActivityImpl.setUserAgent(StringPool.BLANK);
		}
		else {
			userActivityImpl.setUserAgent(userAgent);
		}

		userActivityImpl.resetOriginalValues();

		return userActivityImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
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
		url = objectInput.readUTF();
		sessionId = objectInput.readUTF();
		ip = objectInput.readUTF();
		userAgent = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
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

		if (url == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(url);
		}

		if (sessionId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(sessionId);
		}

		if (ip == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ip);
		}

		if (userAgent == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userAgent);
		}
	}

	public long id;
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
	public String url;
	public String sessionId;
	public String ip;
	public String userAgent;
}