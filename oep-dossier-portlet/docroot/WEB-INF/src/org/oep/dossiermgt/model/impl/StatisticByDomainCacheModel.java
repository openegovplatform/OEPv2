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

import org.oep.dossiermgt.model.StatisticByDomain;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing StatisticByDomain in entity cache.
 *
 * @author trungdk
 * @see StatisticByDomain
 * @generated
 */
public class StatisticByDomainCacheModel implements CacheModel<StatisticByDomain>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{statisticByDomainId=");
		sb.append(statisticByDomainId);
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
		sb.append(", dossierDomain=");
		sb.append(dossierDomain);
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
	public StatisticByDomain toEntityModel() {
		StatisticByDomainImpl statisticByDomainImpl = new StatisticByDomainImpl();

		statisticByDomainImpl.setStatisticByDomainId(statisticByDomainId);
		statisticByDomainImpl.setGroupId(groupId);
		statisticByDomainImpl.setCompanyId(companyId);

		if (createDate == Long.MIN_VALUE) {
			statisticByDomainImpl.setCreateDate(null);
		}
		else {
			statisticByDomainImpl.setCreateDate(new Date(createDate));
		}

		statisticByDomainImpl.setMonth(month);
		statisticByDomainImpl.setYear(year);

		if (dossierDomain == null) {
			statisticByDomainImpl.setDossierDomain(StringPool.BLANK);
		}
		else {
			statisticByDomainImpl.setDossierDomain(dossierDomain);
		}

		statisticByDomainImpl.setReceiveNumber(receiveNumber);
		statisticByDomainImpl.setOnlineNumber(onlineNumber);
		statisticByDomainImpl.setOnlineRatio(onlineRatio);
		statisticByDomainImpl.setFinishNumber(finishNumber);
		statisticByDomainImpl.setOntimeNumber(ontimeNumber);
		statisticByDomainImpl.setOntimeRatio(ontimeRatio);
		statisticByDomainImpl.setDelayDaysAvg(delayDaysAvg);

		statisticByDomainImpl.resetOriginalValues();

		return statisticByDomainImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		statisticByDomainId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		createDate = objectInput.readLong();
		month = objectInput.readInt();
		year = objectInput.readInt();
		dossierDomain = objectInput.readUTF();
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
		objectOutput.writeLong(statisticByDomainId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createDate);
		objectOutput.writeInt(month);
		objectOutput.writeInt(year);

		if (dossierDomain == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dossierDomain);
		}

		objectOutput.writeLong(receiveNumber);
		objectOutput.writeLong(onlineNumber);
		objectOutput.writeDouble(onlineRatio);
		objectOutput.writeInt(finishNumber);
		objectOutput.writeInt(ontimeNumber);
		objectOutput.writeDouble(ontimeRatio);
		objectOutput.writeDouble(delayDaysAvg);
	}

	public long statisticByDomainId;
	public long groupId;
	public long companyId;
	public long createDate;
	public int month;
	public int year;
	public String dossierDomain;
	public long receiveNumber;
	public long onlineNumber;
	public double onlineRatio;
	public int finishNumber;
	public int ontimeNumber;
	public double ontimeRatio;
	public double delayDaysAvg;
}