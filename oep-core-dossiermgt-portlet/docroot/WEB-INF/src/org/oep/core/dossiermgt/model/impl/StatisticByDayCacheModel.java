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

package org.oep.core.dossiermgt.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import org.oep.core.dossiermgt.model.StatisticByDay;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing StatisticByDay in entity cache.
 *
 * @author trungdk
 * @see StatisticByDay
 * @generated
 */
public class StatisticByDayCacheModel implements CacheModel<StatisticByDay>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{statisticByDayId=");
		sb.append(statisticByDayId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", statisticDate=");
		sb.append(statisticDate);
		sb.append(", statisticWeek=");
		sb.append(statisticWeek);
		sb.append(", receiveNumber=");
		sb.append(receiveNumber);
		sb.append(", onlineNumber=");
		sb.append(onlineNumber);
		sb.append(", onlineRatio=");
		sb.append(onlineRatio);
		sb.append(", finishNumber=");
		sb.append(finishNumber);
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
	public StatisticByDay toEntityModel() {
		StatisticByDayImpl statisticByDayImpl = new StatisticByDayImpl();

		statisticByDayImpl.setStatisticByDayId(statisticByDayId);
		statisticByDayImpl.setGroupId(groupId);
		statisticByDayImpl.setCompanyId(companyId);

		if (createDate == Long.MIN_VALUE) {
			statisticByDayImpl.setCreateDate(null);
		}
		else {
			statisticByDayImpl.setCreateDate(new Date(createDate));
		}

		if (statisticDate == Long.MIN_VALUE) {
			statisticByDayImpl.setStatisticDate(null);
		}
		else {
			statisticByDayImpl.setStatisticDate(new Date(statisticDate));
		}

		statisticByDayImpl.setStatisticWeek(statisticWeek);
		statisticByDayImpl.setReceiveNumber(receiveNumber);
		statisticByDayImpl.setOnlineNumber(onlineNumber);
		statisticByDayImpl.setOnlineRatio(onlineRatio);
		statisticByDayImpl.setFinishNumber(finishNumber);
		statisticByDayImpl.setOntimeNumber(ontimeNumber);
		statisticByDayImpl.setOntimeRatio(ontimeRatio);
		statisticByDayImpl.setDelayDaysAvg(delayDaysAvg);

		statisticByDayImpl.resetOriginalValues();

		return statisticByDayImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		statisticByDayId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		createDate = objectInput.readLong();
		statisticDate = objectInput.readLong();
		statisticWeek = objectInput.readInt();
		receiveNumber = objectInput.readLong();
		onlineNumber = objectInput.readLong();
		onlineRatio = objectInput.readDouble();
		finishNumber = objectInput.readInt();
		ontimeNumber = objectInput.readInt();
		ontimeRatio = objectInput.readDouble();
		delayDaysAvg = objectInput.readDouble();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(statisticByDayId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(statisticDate);
		objectOutput.writeInt(statisticWeek);
		objectOutput.writeLong(receiveNumber);
		objectOutput.writeLong(onlineNumber);
		objectOutput.writeDouble(onlineRatio);
		objectOutput.writeInt(finishNumber);
		objectOutput.writeInt(ontimeNumber);
		objectOutput.writeDouble(ontimeRatio);
		objectOutput.writeDouble(delayDaysAvg);
	}

	public long statisticByDayId;
	public long groupId;
	public long companyId;
	public long createDate;
	public long statisticDate;
	public int statisticWeek;
	public long receiveNumber;
	public long onlineNumber;
	public double onlineRatio;
	public int finishNumber;
	public int ontimeNumber;
	public double ontimeRatio;
	public double delayDaysAvg;
}