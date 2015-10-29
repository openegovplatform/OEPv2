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

import org.oep.core.processmgt.model.DocFile2ProcessOrder;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing DocFile2ProcessOrder in entity cache.
 *
 * @author trungdk
 * @see DocFile2ProcessOrder
 * @generated
 */
public class DocFile2ProcessOrderCacheModel implements CacheModel<DocFile2ProcessOrder>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{docFileId=");
		sb.append(docFileId);
		sb.append(", processOrderId=");
		sb.append(processOrderId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DocFile2ProcessOrder toEntityModel() {
		DocFile2ProcessOrderImpl docFile2ProcessOrderImpl = new DocFile2ProcessOrderImpl();

		docFile2ProcessOrderImpl.setDocFileId(docFileId);
		docFile2ProcessOrderImpl.setProcessOrderId(processOrderId);

		docFile2ProcessOrderImpl.resetOriginalValues();

		return docFile2ProcessOrderImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		docFileId = objectInput.readLong();
		processOrderId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(docFileId);
		objectOutput.writeLong(processOrderId);
	}

	public long docFileId;
	public long processOrderId;
}