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

package org.oep.core.dossiermgt.model;

import com.liferay.portal.kernel.util.Accessor;
import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the DocFileVersion service. Represents a row in the &quot;oep_dossiermgt_docfileversion&quot; database table, with each column mapped to a property of this class.
 *
 * @author trungdk
 * @see DocFileVersionModel
 * @see org.oep.core.dossiermgt.model.impl.DocFileVersionImpl
 * @see org.oep.core.dossiermgt.model.impl.DocFileVersionModelImpl
 * @generated
 */
public interface DocFileVersion extends DocFileVersionModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link org.oep.core.dossiermgt.model.impl.DocFileVersionImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<DocFileVersion, String> UUID_ACCESSOR = new Accessor<DocFileVersion, String>() {
			@Override
			public String get(DocFileVersion docFileVersion) {
				return docFileVersion.getUuid();
			}
		};
}