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

import org.oep.dossiermgt.model.DocTemplate;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DocTemplate in entity cache.
 *
 * @author trungdk
 * @see DocTemplate
 * @generated
 */
public class DocTemplateCacheModel implements CacheModel<DocTemplate>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{docTemplateId=");
		sb.append(docTemplateId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", templateNo=");
		sb.append(templateNo);
		sb.append(", title=");
		sb.append(title);
		sb.append(", enTitle=");
		sb.append(enTitle);
		sb.append(", fileEntryId=");
		sb.append(fileEntryId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DocTemplate toEntityModel() {
		DocTemplateImpl docTemplateImpl = new DocTemplateImpl();

		docTemplateImpl.setDocTemplateId(docTemplateId);
		docTemplateImpl.setUserId(userId);
		docTemplateImpl.setGroupId(groupId);
		docTemplateImpl.setCompanyId(companyId);

		if (createDate == Long.MIN_VALUE) {
			docTemplateImpl.setCreateDate(null);
		}
		else {
			docTemplateImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			docTemplateImpl.setModifiedDate(null);
		}
		else {
			docTemplateImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (templateNo == null) {
			docTemplateImpl.setTemplateNo(StringPool.BLANK);
		}
		else {
			docTemplateImpl.setTemplateNo(templateNo);
		}

		if (title == null) {
			docTemplateImpl.setTitle(StringPool.BLANK);
		}
		else {
			docTemplateImpl.setTitle(title);
		}

		if (enTitle == null) {
			docTemplateImpl.setEnTitle(StringPool.BLANK);
		}
		else {
			docTemplateImpl.setEnTitle(enTitle);
		}

		docTemplateImpl.setFileEntryId(fileEntryId);

		docTemplateImpl.resetOriginalValues();

		return docTemplateImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		docTemplateId = objectInput.readLong();
		userId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		templateNo = objectInput.readUTF();
		title = objectInput.readUTF();
		enTitle = objectInput.readUTF();
		fileEntryId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(docTemplateId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (templateNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(templateNo);
		}

		if (title == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(title);
		}

		if (enTitle == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(enTitle);
		}

		objectOutput.writeLong(fileEntryId);
	}

	public long docTemplateId;
	public long userId;
	public long groupId;
	public long companyId;
	public long createDate;
	public long modifiedDate;
	public String templateNo;
	public String title;
	public String enTitle;
	public long fileEntryId;
}