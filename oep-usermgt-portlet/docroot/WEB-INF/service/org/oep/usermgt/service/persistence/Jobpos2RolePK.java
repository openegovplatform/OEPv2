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

package org.oep.usermgt.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author NQMINH
 * @generated
 */
public class JobPos2RolePK implements Comparable<JobPos2RolePK>, Serializable {
	public long jobPosId;
	public long roleId;

	public JobPos2RolePK() {
	}

	public JobPos2RolePK(long jobPosId, long roleId) {
		this.jobPosId = jobPosId;
		this.roleId = roleId;
	}

	public long getJobPosId() {
		return jobPosId;
	}

	public void setJobPosId(long jobPosId) {
		this.jobPosId = jobPosId;
	}

	public long getRoleId() {
		return roleId;
	}

	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}

	@Override
	public int compareTo(JobPos2RolePK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		if (jobPosId < pk.jobPosId) {
			value = -1;
		}
		else if (jobPosId > pk.jobPosId) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		if (roleId < pk.roleId) {
			value = -1;
		}
		else if (roleId > pk.roleId) {
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

		if (!(obj instanceof JobPos2RolePK)) {
			return false;
		}

		JobPos2RolePK pk = (JobPos2RolePK)obj;

		if ((jobPosId == pk.jobPosId) && (roleId == pk.roleId)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (String.valueOf(jobPosId) + String.valueOf(roleId)).hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(10);

		sb.append(StringPool.OPEN_CURLY_BRACE);

		sb.append("jobPosId");
		sb.append(StringPool.EQUAL);
		sb.append(jobPosId);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("roleId");
		sb.append(StringPool.EQUAL);
		sb.append(roleId);

		sb.append(StringPool.CLOSE_CURLY_BRACE);

		return sb.toString();
	}
}