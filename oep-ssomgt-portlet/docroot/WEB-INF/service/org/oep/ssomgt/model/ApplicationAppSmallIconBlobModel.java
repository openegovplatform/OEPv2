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

package org.oep.ssomgt.model;

import java.sql.Blob;

/**
 * The Blob model class for lazy loading the appSmallIcon column in Application.
 *
 * @author trungdk
 * @see Application
 * @generated
 */
public class ApplicationAppSmallIconBlobModel {
	public ApplicationAppSmallIconBlobModel() {
	}

	public ApplicationAppSmallIconBlobModel(long applicationId) {
		_applicationId = applicationId;
	}

	public ApplicationAppSmallIconBlobModel(long applicationId,
		Blob appSmallIconBlob) {
		_applicationId = applicationId;
		_appSmallIconBlob = appSmallIconBlob;
	}

	public long getApplicationId() {
		return _applicationId;
	}

	public void setApplicationId(long applicationId) {
		_applicationId = applicationId;
	}

	public Blob getAppSmallIconBlob() {
		return _appSmallIconBlob;
	}

	public void setAppSmallIconBlob(Blob appSmallIconBlob) {
		_appSmallIconBlob = appSmallIconBlob;
	}

	private long _applicationId;
	private Blob _appSmallIconBlob;
}