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
		StringBundler sb = new StringBundler(37);

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
		sb.append(", submittedNumber=");
		sb.append(submittedNumber);
		sb.append(", acceptedNumber=");
		sb.append(acceptedNumber);
		sb.append(", deniedNumber=");
		sb.append(deniedNumber);
		sb.append(", acceptedRatio=");
		sb.append(acceptedRatio);
		sb.append(", finishedNumber=");
		sb.append(finishedNumber);
		sb.append(", ontimeNumber=");
		sb.append(ontimeNumber);
		sb.append(", delayedNumber=");
		sb.append(delayedNumber);
		sb.append(", ontimeRatio=");
		sb.append(ontimeRatio);
		sb.append(", doneNumber=");
		sb.append(doneNumber);
		sb.append(", doneRatio=");
		sb.append(doneRatio);
		sb.append(", delayDaysAvg=");
		sb.append(delayDaysAvg);
		sb.append(", furtherDaysAvg=");
		sb.append(furtherDaysAvg);
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
		statisticByDayImpl.setSubmittedNumber(submittedNumber);
		statisticByDayImpl.setAcceptedNumber(acceptedNumber);
		statisticByDayImpl.setDeniedNumber(deniedNumber);
		statisticByDayImpl.setAcceptedRatio(acceptedRatio);
		statisticByDayImpl.setFinishedNumber(finishedNumber);
		statisticByDayImpl.setOntimeNumber(ontimeNumber);
		statisticByDayImpl.setDelayedNumber(delayedNumber);
		statisticByDayImpl.setOntimeRatio(ontimeRatio);
		statisticByDayImpl.setDoneNumber(doneNumber);
		statisticByDayImpl.setDoneRatio(doneRatio);
		statisticByDayImpl.setDelayDaysAvg(delayDaysAvg);
		statisticByDayImpl.setFurtherDaysAvg(furtherDaysAvg);

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
		submittedNumber = objectInput.readInt();
		acceptedNumber = objectInput.readInt();
		deniedNumber = objectInput.readInt();
		acceptedRatio = objectInput.readDouble();
		finishedNumber = objectInput.readInt();
		ontimeNumber = objectInput.readInt();
		delayedNumber = objectInput.readInt();
		ontimeRatio = objectInput.readDouble();
		doneNumber = objectInput.readInt();
		doneRatio = objectInput.readDouble();
		delayDaysAvg = objectInput.readDouble();
		furtherDaysAvg = objectInput.readDouble();
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
		objectOutput.writeInt(submittedNumber);
		objectOutput.writeInt(acceptedNumber);
		objectOutput.writeInt(deniedNumber);
		objectOutput.writeDouble(acceptedRatio);
		objectOutput.writeInt(finishedNumber);
		objectOutput.writeInt(ontimeNumber);
		objectOutput.writeInt(delayedNumber);
		objectOutput.writeDouble(ontimeRatio);
		objectOutput.writeInt(doneNumber);
		objectOutput.writeDouble(doneRatio);
		objectOutput.writeDouble(delayDaysAvg);
		objectOutput.writeDouble(furtherDaysAvg);
	}

	public long statisticByDayId;
	public long groupId;
	public long companyId;
	public long createDate;
	public long statisticDate;
	public int statisticWeek;
	public int submittedNumber;
	public int acceptedNumber;
	public int deniedNumber;
	public double acceptedRatio;
	public int finishedNumber;
	public int ontimeNumber;
	public int delayedNumber;
	public double ontimeRatio;
	public int doneNumber;
	public double doneRatio;
	public double delayDaysAvg;
	public double furtherDaysAvg;
}