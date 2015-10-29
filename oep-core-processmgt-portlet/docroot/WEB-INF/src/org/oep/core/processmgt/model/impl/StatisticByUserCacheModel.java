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

import org.oep.core.processmgt.model.StatisticByUser;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing StatisticByUser in entity cache.
 *
 * @author trungdk
 * @see StatisticByUser
 * @generated
 */
public class StatisticByUserCacheModel implements CacheModel<StatisticByUser>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{statisticByUserId=");
		sb.append(statisticByUserId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", month=");
		sb.append(month);
		sb.append(", year=");
		sb.append(year);
		sb.append(", totalNumber=");
		sb.append(totalNumber);
		sb.append(", ontimeNumber=");
		sb.append(ontimeNumber);
		sb.append(", ontimeRatio=");
		sb.append(ontimeRatio);
		sb.append(", delayDaysAvg=");
		sb.append(delayDaysAvg);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public StatisticByUser toEntityModel() {
		StatisticByUserImpl statisticByUserImpl = new StatisticByUserImpl();

		statisticByUserImpl.setStatisticByUserId(statisticByUserId);
		statisticByUserImpl.setUserId(userId);
		statisticByUserImpl.setGroupId(groupId);
		statisticByUserImpl.setCompanyId(companyId);

		if (createDate == Long.MIN_VALUE) {
			statisticByUserImpl.setCreateDate(null);
		}
		else {
			statisticByUserImpl.setCreateDate(new Date(createDate));
		}

		statisticByUserImpl.setMonth(month);
		statisticByUserImpl.setYear(year);
		statisticByUserImpl.setTotalNumber(totalNumber);
		statisticByUserImpl.setOntimeNumber(ontimeNumber);
		statisticByUserImpl.setOntimeRatio(ontimeRatio);
		statisticByUserImpl.setDelayDaysAvg(delayDaysAvg);

		statisticByUserImpl.resetOriginalValues();

		return statisticByUserImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		statisticByUserId = objectInput.readLong();
		userId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		createDate = objectInput.readLong();
		month = objectInput.readInt();
		year = objectInput.readInt();
		totalNumber = objectInput.readInt();
		ontimeNumber = objectInput.readInt();
		ontimeRatio = objectInput.readDouble();
		delayDaysAvg = objectInput.readDouble();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(statisticByUserId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createDate);
		objectOutput.writeInt(month);
		objectOutput.writeInt(year);
		objectOutput.writeInt(totalNumber);
		objectOutput.writeInt(ontimeNumber);
		objectOutput.writeDouble(ontimeRatio);
		objectOutput.writeDouble(delayDaysAvg);
	}

	public long statisticByUserId;
	public long userId;
	public long groupId;
	public long companyId;
	public long createDate;
	public int month;
	public int year;
	public int totalNumber;
	public int ontimeNumber;
	public double ontimeRatio;
	public double delayDaysAvg;
}