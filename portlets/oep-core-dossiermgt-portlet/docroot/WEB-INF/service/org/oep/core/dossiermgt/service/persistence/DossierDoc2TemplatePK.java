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

package org.oep.core.dossiermgt.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author trungdk
 * @generated
 */
public class DossierDoc2TemplatePK implements Comparable<DossierDoc2TemplatePK>,
	Serializable {
	public long dossierDocId;
	public long docTemplateId;

	public DossierDoc2TemplatePK() {
	}

	public DossierDoc2TemplatePK(long dossierDocId, long docTemplateId) {
		this.dossierDocId = dossierDocId;
		this.docTemplateId = docTemplateId;
	}

	public long getDossierDocId() {
		return dossierDocId;
	}

	public void setDossierDocId(long dossierDocId) {
		this.dossierDocId = dossierDocId;
	}

	public long getDocTemplateId() {
		return docTemplateId;
	}

	public void setDocTemplateId(long docTemplateId) {
		this.docTemplateId = docTemplateId;
	}

	@Override
	public int compareTo(DossierDoc2TemplatePK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		if (dossierDocId < pk.dossierDocId) {
			value = -1;
		}
		else if (dossierDocId > pk.dossierDocId) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		if (docTemplateId < pk.docTemplateId) {
			value = -1;
		}
		else if (docTemplateId > pk.docTemplateId) {
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

		if (!(obj instanceof DossierDoc2TemplatePK)) {
			return false;
		}

		DossierDoc2TemplatePK pk = (DossierDoc2TemplatePK)obj;

		if ((dossierDocId == pk.dossierDocId) &&
				(docTemplateId == pk.docTemplateId)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (String.valueOf(dossierDocId) + String.valueOf(docTemplateId)).hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(10);

		sb.append(StringPool.OPEN_CURLY_BRACE);

		sb.append("dossierDocId");
		sb.append(StringPool.EQUAL);
		sb.append(dossierDocId);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("docTemplateId");
		sb.append(StringPool.EQUAL);
		sb.append(docTemplateId);

		sb.append(StringPool.CLOSE_CURLY_BRACE);

		return sb.toString();
	}
}