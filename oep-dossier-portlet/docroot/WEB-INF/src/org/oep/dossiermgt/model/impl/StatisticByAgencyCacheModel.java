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

package org.oep.dossiermgt.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import org.oep.dossiermgt.model.StatisticByAgency;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing StatisticByAgency in entity cache.
 *
 * @author trungdk
 * @see StatisticByAgency
 * @generated
 */
public class StatisticByAgencyCacheModel implements CacheModel<StatisticByAgency>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{statisticByAgencyId=");
		sb.append(statisticByAgencyId);
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
		sb.append(", govAgencyId=");
		sb.append(govAgencyId);
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
	public StatisticByAgency toEntityModel() {
		StatisticByAgencyImpl statisticByAgencyImpl = new StatisticByAgencyImpl();

		statisticByAgencyImpl.setStatisticByAgencyId(statisticByAgencyId);
		statisticByAgencyImpl.setGroupId(groupId);
		statisticByAgencyImpl.setCompanyId(companyId);

		if (createDate == Long.MIN_VALUE) {
			statisticByAgencyImpl.setCreateDate(null);
		}
		else {
			statisticByAgencyImpl.setCreateDate(new Date(createDate));
		}

		statisticByAgencyImpl.setMonth(month);
		statisticByAgencyImpl.setYear(year);

		if (govAgencyId == null) {
			statisticByAgencyImpl.setGovAgencyId(StringPool.BLANK);
		}
		else {
			statisticByAgencyImpl.setGovAgencyId(govAgencyId);
		}

		statisticByAgencyImpl.setReceiveNumber(receiveNumber);
		statisticByAgencyImpl.setOnlineNumber(onlineNumber);
		statisticByAgencyImpl.setOnlineRatio(onlineRatio);
		statisticByAgencyImpl.setFinishNumber(finishNumber);
		statisticByAgencyImpl.setOntimeNumber(ontimeNumber);
		statisticByAgencyImpl.setOntimeRatio(ontimeRatio);
		statisticByAgencyImpl.setDelayDaysAvg(delayDaysAvg);

		statisticByAgencyImpl.resetOriginalValues();

		return statisticByAgencyImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		statisticByAgencyId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		createDate = objectInput.readLong();
		month = objectInput.readInt();
		year = objectInput.readInt();
		govAgencyId = objectInput.readUTF();
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
		objectOutput.writeLong(statisticByAgencyId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createDate);
		objectOutput.writeInt(month);
		objectOutput.writeInt(year);

		if (govAgencyId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(govAgencyId);
		}

		objectOutput.writeLong(receiveNumber);
		objectOutput.writeLong(onlineNumber);
		objectOutput.writeDouble(onlineRatio);
		objectOutput.writeInt(finishNumber);
		objectOutput.writeInt(ontimeNumber);
		objectOutput.writeDouble(ontimeRatio);
		objectOutput.writeDouble(delayDaysAvg);
	}

	public long statisticByAgencyId;
	public long groupId;
	public long companyId;
	public long createDate;
	public int month;
	public int year;
	public String govAgencyId;
	public long receiveNumber;
	public long onlineNumber;
	public double onlineRatio;
	public int finishNumber;
	public int ontimeNumber;
	public double ontimeRatio;
	public double delayDaysAvg;
}