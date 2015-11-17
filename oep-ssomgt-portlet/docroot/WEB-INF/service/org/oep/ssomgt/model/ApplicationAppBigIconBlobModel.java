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
 * The Blob model class for lazy loading the appBigIcon column in Application.
 *
 * @author trungdk
 * @see Application
 * @generated
 */
public class ApplicationAppBigIconBlobModel {
	public ApplicationAppBigIconBlobModel() {
	}

	public ApplicationAppBigIconBlobModel(long applicationId) {
		_applicationId = applicationId;
	}

	public ApplicationAppBigIconBlobModel(long applicationId,
		Blob appBigIconBlob) {
		_applicationId = applicationId;
		_appBigIconBlob = appBigIconBlob;
	}

	public long getApplicationId() {
		return _applicationId;
	}

	public void setApplicationId(long applicationId) {
		_applicationId = applicationId;
	}

	public Blob getAppBigIconBlob() {
		return _appBigIconBlob;
	}

	public void setAppBigIconBlob(Blob appBigIconBlob) {
		_appBigIconBlob = appBigIconBlob;
	}

	private long _applicationId;
	private Blob _appBigIconBlob;
}