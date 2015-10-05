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
public class NewUserLogSoap implements Serializable {
	public static NewUserLogSoap toSoapModel(NewUserLog model) {
		NewUserLogSoap soapModel = new NewUserLogSoap();

		soapModel.setId(model.getId());
		soapModel.setUserActivityId(model.getUserActivityId());
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

		return soapModel;
	}

	public static NewUserLogSoap[] toSoapModels(NewUserLog[] models) {
		NewUserLogSoap[] soapModels = new NewUserLogSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static NewUserLogSoap[][] toSoapModels(NewUserLog[][] models) {
		NewUserLogSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new NewUserLogSoap[models.length][models[0].length];
		}
		else {
			soapModels = new NewUserLogSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static NewUserLogSoap[] toSoapModels(List<NewUserLog> models) {
		List<NewUserLogSoap> soapModels = new ArrayList<NewUserLogSoap>(models.size());

		for (NewUserLog model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new NewUserLogSoap[soapModels.size()]);
	}

	public NewUserLogSoap() {
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

	public long getUserActivityId() {
		return _userActivityId;
	}

	public void setUserActivityId(long userActivityId) {
		_userActivityId = userActivityId;
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

	private long _id;
	private long _userActivityId;
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
}