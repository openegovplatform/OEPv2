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

import com.liferay.portal.kernel.exception.SystemException;

import org.oep.core.processmgt.model.StepTransition;
import org.oep.core.processmgt.service.StepTransitionLocalServiceUtil;

/**
 * The extended model base implementation for the StepTransition service. Represents a row in the &quot;oep_processmgt_StepTransition&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link StepTransitionImpl}.
 * </p>
 *
 * @author trungdk
 * @see StepTransitionImpl
 * @see org.oep.core.processmgt.model.StepTransition
 * @generated
 */
public abstract class StepTransitionBaseImpl extends StepTransitionModelImpl
	implements StepTransition {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a step transition model instance should use the {@link StepTransition} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			StepTransitionLocalServiceUtil.addStepTransition(this);
		}
		else {
			StepTransitionLocalServiceUtil.updateStepTransition(this);
		}
	}
}