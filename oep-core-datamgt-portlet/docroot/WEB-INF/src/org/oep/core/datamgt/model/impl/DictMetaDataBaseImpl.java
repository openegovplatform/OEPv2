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

package org.oep.core.datamgt.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import org.oep.core.datamgt.model.DictMetaData;
import org.oep.core.datamgt.service.DictMetaDataLocalServiceUtil;

/**
 * The extended model base implementation for the DictMetaData service. Represents a row in the &quot;oep_datamgt_dictmetadata&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DictMetaDataImpl}.
 * </p>
 *
 * @author NQMINH
 * @see DictMetaDataImpl
 * @see org.oep.core.datamgt.model.DictMetaData
 * @generated
 */
public abstract class DictMetaDataBaseImpl extends DictMetaDataModelImpl
	implements DictMetaData {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a dictionary meta data model instance should use the {@link DictMetaData} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DictMetaDataLocalServiceUtil.addDictMetaData(this);
		}
		else {
			DictMetaDataLocalServiceUtil.updateDictMetaData(this);
		}
	}
}