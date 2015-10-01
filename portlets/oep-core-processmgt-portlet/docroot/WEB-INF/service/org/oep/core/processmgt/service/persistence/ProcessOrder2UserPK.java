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

package org.oep.core.processmgt.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author trungdk
 * @generated
 */
public class ProcessOrder2UserPK implements Comparable<ProcessOrder2UserPK>,
	Serializable {
	public long processOrderId;
	public long userId;

	public ProcessOrder2UserPK() {
	}

	public ProcessOrder2UserPK(long processOrderId, long userId) {
		this.processOrderId = processOrderId;
		this.userId = userId;
	}

	public long getProcessOrderId() {
		return processOrderId;
	}

	public void setProcessOrderId(long processOrderId) {
		this.processOrderId = processOrderId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	@Override
	public int compareTo(ProcessOrder2UserPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		if (processOrderId < pk.processOrderId) {
			value = -1;
		}
		else if (processOrderId > pk.processOrderId) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		if (userId < pk.userId) {
			value = -1;
		}
		else if (userId > pk.userId) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ProcessOrder2UserPK)) {
			return false;
		}

		ProcessOrder2UserPK pk = (ProcessOrder2UserPK)obj;

		if ((processOrderId == pk.processOrderId) && (userId == pk.userId)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (String.valueOf(processOrderId) + String.valueOf(userId)).hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(10);

		sb.append(StringPool.OPEN_CURLY_BRACE);

		sb.append("processOrderId");
		sb.append(StringPool.EQUAL);
		sb.append(processOrderId);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("userId");
		sb.append(StringPool.EQUAL);
		sb.append(userId);

		sb.append(StringPool.CLOSE_CURLY_BRACE);

		return sb.toString();
	}
}