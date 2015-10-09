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

package org.oep.core.datamgt.dictionary.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import org.oep.core.datamgt.dictionary.model.DictData;
import org.oep.core.datamgt.dictionary.service.DictDataLocalServiceUtil;

/**
 * @author TrungDK
 * @generated
 */
public abstract class DictDataActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public DictDataActionableDynamicQuery() throws SystemException {
		setBaseLocalService(DictDataLocalServiceUtil.getService());
		setClass(DictData.class);

		setClassLoader(org.oep.core.datamgt.dictionary.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("dictDataId");
	}
}