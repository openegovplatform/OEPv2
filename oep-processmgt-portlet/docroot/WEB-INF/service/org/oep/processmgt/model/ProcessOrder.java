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

package org.oep.processmgt.model;

import com.liferay.portal.kernel.util.Accessor;
import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the ProcessOrder service. Represents a row in the &quot;oep_processmgt_processorder&quot; database table, with each column mapped to a property of this class.
 *
 * @author trungdk
 * @see ProcessOrderModel
 * @see org.oep.processmgt.model.impl.ProcessOrderImpl
 * @see org.oep.processmgt.model.impl.ProcessOrderModelImpl
 * @generated
 */
public interface ProcessOrder extends ProcessOrderModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link org.oep.processmgt.model.impl.ProcessOrderImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<ProcessOrder, String> UUID_ACCESSOR = new Accessor<ProcessOrder, String>() {
			@Override
			public String get(ProcessOrder processOrder) {
				return processOrder.getUuid();
			}
		};
}