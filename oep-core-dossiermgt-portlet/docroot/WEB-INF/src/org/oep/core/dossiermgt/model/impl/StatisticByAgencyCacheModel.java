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
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import org.oep.core.dossiermgt.model.StatisticByAgency;

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
		StringBundler sb = new StringBundler(39);

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

		statisticByAgencyImpl.setSubmittedNumber(submittedNumber);
		statisticByAgencyImpl.setAcceptedNumber(acceptedNumber);
		statisticByAgencyImpl.setDeniedNumber(deniedNumber);
		statisticByAgencyImpl.setAcceptedRatio(acceptedRatio);
		statisticByAgencyImpl.setFinishedNumber(finishedNumber);
		statisticByAgencyImpl.setOntimeNumber(ontimeNumber);
		statisticByAgencyImpl.setDelayedNumber(delayedNumber);
		statisticByAgencyImpl.setOntimeRatio(ontimeRatio);
		statisticByAgencyImpl.setDoneNumber(doneNumber);
		statisticByAgencyImpl.setDoneRatio(doneRatio);
		statisticByAgencyImpl.setDelayDaysAvg(delayDaysAvg);
		statisticByAgencyImpl.setFurtherDaysAvg(furtherDaysAvg);

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

	public long statisticByAgencyId;
	public long groupId;
	public long companyId;
	public long createDate;
	public int month;
	public int year;
	public String govAgencyId;
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