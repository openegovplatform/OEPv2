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

package org.oep.core.dossiermgt.service.base;

import org.oep.core.dossiermgt.service.DossierProcAgentLocalServiceUtil;

import java.util.Arrays;

/**
 * @author trungdk
 * @generated
 */
public class DossierProcAgentLocalServiceClpInvoker {
	public DossierProcAgentLocalServiceClpInvoker() {
		_methodName0 = "addDossierProcAgent";

		_methodParameterTypes0 = new String[] {
				"org.oep.core.dossiermgt.model.DossierProcAgent"
			};

		_methodName1 = "createDossierProcAgent";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteDossierProcAgent";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteDossierProcAgent";

		_methodParameterTypes3 = new String[] {
				"org.oep.core.dossiermgt.model.DossierProcAgent"
			};

		_methodName4 = "dynamicQuery";

		_methodParameterTypes4 = new String[] {  };

		_methodName5 = "dynamicQuery";

		_methodParameterTypes5 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName6 = "dynamicQuery";

		_methodParameterTypes6 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
			};

		_methodName7 = "dynamicQuery";

		_methodParameterTypes7 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName8 = "dynamicQueryCount";

		_methodParameterTypes8 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName9 = "dynamicQueryCount";

		_methodParameterTypes9 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery",
				"com.liferay.portal.kernel.dao.orm.Projection"
			};

		_methodName10 = "fetchDossierProcAgent";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getDossierProcAgent";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getDossierProcAgents";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getDossierProcAgentsCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateDossierProcAgent";

		_methodParameterTypes15 = new String[] {
				"org.oep.core.dossiermgt.model.DossierProcAgent"
			};

		_methodName128 = "getBeanIdentifier";

		_methodParameterTypes128 = new String[] {  };

		_methodName129 = "setBeanIdentifier";

		_methodParameterTypes129 = new String[] { "java.lang.String" };

		_methodName134 = "addDossierProcAgent";

		_methodParameterTypes134 = new String[] {
				"long", "java.lang.String", "java.lang.String", "long",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName135 = "updateDossierProcAgent";

		_methodParameterTypes135 = new String[] {
				"long", "long", "java.lang.String", "java.lang.String", "long",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName136 = "updateDossierProcAgentResources";

		_methodParameterTypes136 = new String[] {
				"org.oep.core.dossiermgt.model.DossierProcAgent",
				"java.lang.String[][]", "java.lang.String[][]",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName137 = "removeDossierProcAgent";

		_methodParameterTypes137 = new String[] {
				"org.oep.core.dossiermgt.model.DossierProcAgent"
			};

		_methodName138 = "removeDossierProcAgent";

		_methodParameterTypes138 = new String[] { "long" };

		_methodName139 = "getDossierProcAgent";

		_methodParameterTypes139 = new String[] { "long" };

		_methodName140 = "addDossierProcAgentResources";

		_methodParameterTypes140 = new String[] {
				"org.oep.core.dossiermgt.model.DossierProcAgent", "boolean",
				"boolean", "com.liferay.portal.service.ServiceContext"
			};

		_methodName141 = "addDossierProcAgentResources";

		_methodParameterTypes141 = new String[] {
				"org.oep.core.dossiermgt.model.DossierProcAgent",
				"java.lang.String[][]", "java.lang.String[][]",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName142 = "addDossierProcAgentResources";

		_methodParameterTypes142 = new String[] {
				"long", "java.lang.String[][]", "java.lang.String[][]",
				"com.liferay.portal.service.ServiceContext"
			};
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return DossierProcAgentLocalServiceUtil.addDossierProcAgent((org.oep.core.dossiermgt.model.DossierProcAgent)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return DossierProcAgentLocalServiceUtil.createDossierProcAgent(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return DossierProcAgentLocalServiceUtil.deleteDossierProcAgent(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return DossierProcAgentLocalServiceUtil.deleteDossierProcAgent((org.oep.core.dossiermgt.model.DossierProcAgent)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return DossierProcAgentLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return DossierProcAgentLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return DossierProcAgentLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return DossierProcAgentLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return DossierProcAgentLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return DossierProcAgentLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return DossierProcAgentLocalServiceUtil.fetchDossierProcAgent(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return DossierProcAgentLocalServiceUtil.getDossierProcAgent(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return DossierProcAgentLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return DossierProcAgentLocalServiceUtil.getDossierProcAgents(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return DossierProcAgentLocalServiceUtil.getDossierProcAgentsCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return DossierProcAgentLocalServiceUtil.updateDossierProcAgent((org.oep.core.dossiermgt.model.DossierProcAgent)arguments[0]);
		}

		if (_methodName128.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes128, parameterTypes)) {
			return DossierProcAgentLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName129.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes129, parameterTypes)) {
			DossierProcAgentLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName134.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes134, parameterTypes)) {
			return DossierProcAgentLocalServiceUtil.addDossierProcAgent(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				((Long)arguments[3]).longValue(),
				(com.liferay.portal.service.ServiceContext)arguments[4]);
		}

		if (_methodName135.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes135, parameterTypes)) {
			return DossierProcAgentLocalServiceUtil.updateDossierProcAgent(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2], (java.lang.String)arguments[3],
				((Long)arguments[4]).longValue(),
				(com.liferay.portal.service.ServiceContext)arguments[5]);
		}

		if (_methodName136.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes136, parameterTypes)) {
			DossierProcAgentLocalServiceUtil.updateDossierProcAgentResources((org.oep.core.dossiermgt.model.DossierProcAgent)arguments[0],
				(java.lang.String[])arguments[1],
				(java.lang.String[])arguments[2],
				(com.liferay.portal.service.ServiceContext)arguments[3]);

			return null;
		}

		if (_methodName137.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes137, parameterTypes)) {
			DossierProcAgentLocalServiceUtil.removeDossierProcAgent((org.oep.core.dossiermgt.model.DossierProcAgent)arguments[0]);

			return null;
		}

		if (_methodName138.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes138, parameterTypes)) {
			DossierProcAgentLocalServiceUtil.removeDossierProcAgent(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName139.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes139, parameterTypes)) {
			return DossierProcAgentLocalServiceUtil.getDossierProcAgent(((Long)arguments[0]).longValue());
		}

		if (_methodName140.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes140, parameterTypes)) {
			DossierProcAgentLocalServiceUtil.addDossierProcAgentResources((org.oep.core.dossiermgt.model.DossierProcAgent)arguments[0],
				((Boolean)arguments[1]).booleanValue(),
				((Boolean)arguments[2]).booleanValue(),
				(com.liferay.portal.service.ServiceContext)arguments[3]);

			return null;
		}

		if (_methodName141.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes141, parameterTypes)) {
			DossierProcAgentLocalServiceUtil.addDossierProcAgentResources((org.oep.core.dossiermgt.model.DossierProcAgent)arguments[0],
				(java.lang.String[])arguments[1],
				(java.lang.String[])arguments[2],
				(com.liferay.portal.service.ServiceContext)arguments[3]);

			return null;
		}

		if (_methodName142.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes142, parameterTypes)) {
			DossierProcAgentLocalServiceUtil.addDossierProcAgentResources(((Long)arguments[0]).longValue(),
				(java.lang.String[])arguments[1],
				(java.lang.String[])arguments[2],
				(com.liferay.portal.service.ServiceContext)arguments[3]);

			return null;
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName0;
	private String[] _methodParameterTypes0;
	private String _methodName1;
	private String[] _methodParameterTypes1;
	private String _methodName2;
	private String[] _methodParameterTypes2;
	private String _methodName3;
	private String[] _methodParameterTypes3;
	private String _methodName4;
	private String[] _methodParameterTypes4;
	private String _methodName5;
	private String[] _methodParameterTypes5;
	private String _methodName6;
	private String[] _methodParameterTypes6;
	private String _methodName7;
	private String[] _methodParameterTypes7;
	private String _methodName8;
	private String[] _methodParameterTypes8;
	private String _methodName9;
	private String[] _methodParameterTypes9;
	private String _methodName10;
	private String[] _methodParameterTypes10;
	private String _methodName11;
	private String[] _methodParameterTypes11;
	private String _methodName12;
	private String[] _methodParameterTypes12;
	private String _methodName13;
	private String[] _methodParameterTypes13;
	private String _methodName14;
	private String[] _methodParameterTypes14;
	private String _methodName15;
	private String[] _methodParameterTypes15;
	private String _methodName128;
	private String[] _methodParameterTypes128;
	private String _methodName129;
	private String[] _methodParameterTypes129;
	private String _methodName134;
	private String[] _methodParameterTypes134;
	private String _methodName135;
	private String[] _methodParameterTypes135;
	private String _methodName136;
	private String[] _methodParameterTypes136;
	private String _methodName137;
	private String[] _methodParameterTypes137;
	private String _methodName138;
	private String[] _methodParameterTypes138;
	private String _methodName139;
	private String[] _methodParameterTypes139;
	private String _methodName140;
	private String[] _methodParameterTypes140;
	private String _methodName141;
	private String[] _methodParameterTypes141;
	private String _methodName142;
	private String[] _methodParameterTypes142;
}