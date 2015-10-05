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

package org.oep.core.logging.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class UserActivitySoap implements Serializable {
	public static UserActivitySoap toSoapModel(UserActivity model) {
		UserActivitySoap soapModel = new UserActivitySoap();

		soapModel.setId(model.getId());
		soapModel.setUserId(model.getUserId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setUserName(model.getUserName());
		soapModel.setEmail(model.getEmail());
		soapModel.setSite(model.getSite());
		soapModel.setPage(model.getPage());
		soapModel.setAction(model.getAction());
		soapModel.setDescription(model.getDescription());
		soapModel.setUrl(model.getUrl());
		soapModel.setSessionId(model.getSessionId());
		soapModel.setIp(model.getIp());
		soapModel.setUserAgent(model.getUserAgent());

		return soapModel;
	}

	public static UserActivitySoap[] toSoapModels(UserActivity[] models) {
		UserActivitySoap[] soapModels = new UserActivitySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static UserActivitySoap[][] toSoapModels(UserActivity[][] models) {
		UserActivitySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new UserActivitySoap[models.length][models[0].length];
		}
		else {
			soapModels = new UserActivitySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static UserActivitySoap[] toSoapModels(List<UserActivity> models) {
		List<UserActivitySoap> soapModels = new ArrayList<UserActivitySoap>(models.size());

		for (UserActivity model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new UserActivitySoap[soapModels.size()]);
	}

	public UserActivitySoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public String getSite() {
		return _site;
	}

	public void setSite(String site) {
		_site = site;
	}

	public String getPage() {
		return _page;
	}

	public void setPage(String page) {
		_page = page;
	}

	public String getAction() {
		return _action;
	}

	public void setAction(String action) {
		_action = action;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public String getUrl() {
		return _url;
	}

	public void setUrl(String url) {
		_url = url;
	}

	public String getSessionId() {
		return _sessionId;
	}

	public void setSessionId(String sessionId) {
		_sessionId = sessionId;
	}

	public String getIp() {
		return _ip;
	}

	public void setIp(String ip) {
		_ip = ip;
	}

	public String getUserAgent() {
		return _userAgent;
	}

	public void setUserAgent(String userAgent) {
		_userAgent = userAgent;
	}

	private long _id;
	private long _userId;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private String _userName;
	private String _email;
	private String _site;
	private String _page;
	private String _action;
	private String _description;
	private String _url;
	private String _sessionId;
	private String _ip;
	private String _userAgent;
}