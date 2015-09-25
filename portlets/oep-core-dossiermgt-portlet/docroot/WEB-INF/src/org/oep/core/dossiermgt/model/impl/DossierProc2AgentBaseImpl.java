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

import com.liferay.portal.kernel.exception.SystemException;

import org.oep.core.dossiermgt.model.DossierProc2Agent;
import org.oep.core.dossiermgt.service.DossierProc2AgentLocalServiceUtil;

/**
 * The extended model base implementation for the DossierProc2Agent service. Represents a row in the &quot;oep_dossiermgt_DossierProc2Agent&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DossierProc2AgentImpl}.
 * </p>
 *
 * @author trungdk
 * @see DossierProc2AgentImpl
 * @see org.oep.core.dossiermgt.model.DossierProc2Agent
 * @generated
 */
public abstract class DossierProc2AgentBaseImpl
	extends DossierProc2AgentModelImpl implements DossierProc2Agent {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a dossier proc2 agent model instance should use the {@link DossierProc2Agent} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DossierProc2AgentLocalServiceUtil.addDossierProc2Agent(this);
		}
		else {
			DossierProc2AgentLocalServiceUtil.updateDossierProc2Agent(this);
		}
	}
}