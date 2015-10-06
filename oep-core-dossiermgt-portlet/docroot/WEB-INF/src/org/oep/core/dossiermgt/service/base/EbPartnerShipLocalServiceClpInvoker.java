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

import org.oep.core.dossiermgt.service.EbPartnerShipLocalServiceUtil;

import java.util.Arrays;

/**
 * @author trungdk
 * @generated
 */
public class EbPartnerShipLocalServiceClpInvoker {
	public EbPartnerShipLocalServiceClpInvoker() {
		_methodName0 = "addEbPartnerShip";

		_methodParameterTypes0 = new String[] {
				"org.oep.core.dossiermgt.model.EbPartnerShip"
			};

		_methodName1 = "createEbPartnerShip";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteEbPartnerShip";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteEbPartnerShip";

		_methodParameterTypes3 = new String[] {
				"org.oep.core.dossiermgt.model.EbPartnerShip"
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

		_methodName10 = "fetchEbPartnerShip";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getEbPartnerShip";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getEbPartnerShips";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getEbPartnerShipsCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateEbPartnerShip";

		_methodParameterTypes15 = new String[] {
				"org.oep.core.dossiermgt.model.EbPartnerShip"
			};

		_methodName128 = "getBeanIdentifier";

		_methodParameterTypes128 = new String[] {  };

		_methodName129 = "setBeanIdentifier";

		_methodParameterTypes129 = new String[] { "java.lang.String" };

		_methodName134 = "addEbPartnerShip";

		_methodParameterTypes134 = new String[] {
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "int",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName135 = "updateEbPartnerShip";

		_methodParameterTypes135 = new String[] {
				"long", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "int",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName136 = "updateEbPartnerShipResources";

		_methodParameterTypes136 = new String[] {
				"org.oep.core.dossiermgt.model.EbPartnerShip",
				"java.lang.String[][]", "java.lang.String[][]",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName137 = "removeEbPartnerShip";

		_methodParameterTypes137 = new String[] {
				"org.oep.core.dossiermgt.model.EbPartnerShip"
			};

		_methodName138 = "removeEbPartnerShip";

		_methodParameterTypes138 = new String[] { "long" };

		_methodName139 = "getEbPartnerShip";

		_methodParameterTypes139 = new String[] { "long" };

		_methodName140 = "addEbPartnerShipResources";

		_methodParameterTypes140 = new String[] {
				"org.oep.core.dossiermgt.model.EbPartnerShip", "boolean",
				"boolean", "com.liferay.portal.service.ServiceContext"
			};

		_methodName141 = "addEbPartnerShipResources";

		_methodParameterTypes141 = new String[] {
				"org.oep.core.dossiermgt.model.EbPartnerShip",
				"java.lang.String[][]", "java.lang.String[][]",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName142 = "addEbPartnerShipResources";

		_methodParameterTypes142 = new String[] {
				"long", "java.lang.String[][]", "java.lang.String[][]",
				"com.liferay.portal.service.ServiceContext"
			};
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return EbPartnerShipLocalServiceUtil.addEbPartnerShip((org.oep.core.dossiermgt.model.EbPartnerShip)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return EbPartnerShipLocalServiceUtil.createEbPartnerShip(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return EbPartnerShipLocalServiceUtil.deleteEbPartnerShip(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return EbPartnerShipLocalServiceUtil.deleteEbPartnerShip((org.oep.core.dossiermgt.model.EbPartnerShip)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return EbPartnerShipLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return EbPartnerShipLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return EbPartnerShipLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return EbPartnerShipLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return EbPartnerShipLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return EbPartnerShipLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return EbPartnerShipLocalServiceUtil.fetchEbPartnerShip(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return EbPartnerShipLocalServiceUtil.getEbPartnerShip(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return EbPartnerShipLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return EbPartnerShipLocalServiceUtil.getEbPartnerShips(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return EbPartnerShipLocalServiceUtil.getEbPartnerShipsCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return EbPartnerShipLocalServiceUtil.updateEbPartnerShip((org.oep.core.dossiermgt.model.EbPartnerShip)arguments[0]);
		}

		if (_methodName128.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes128, parameterTypes)) {
			return EbPartnerShipLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName129.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes129, parameterTypes)) {
			EbPartnerShipLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName134.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes134, parameterTypes)) {
			return EbPartnerShipLocalServiceUtil.addEbPartnerShip((java.lang.String)arguments[0],
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				(java.lang.String)arguments[3],
				((Integer)arguments[4]).intValue(),
				(com.liferay.portal.service.ServiceContext)arguments[5]);
		}

		if (_methodName135.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes135, parameterTypes)) {
			return EbPartnerShipLocalServiceUtil.updateEbPartnerShip(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				(java.lang.String)arguments[3], (java.lang.String)arguments[4],
				((Integer)arguments[5]).intValue(),
				(com.liferay.portal.service.ServiceContext)arguments[6]);
		}

		if (_methodName136.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes136, parameterTypes)) {
			EbPartnerShipLocalServiceUtil.updateEbPartnerShipResources((org.oep.core.dossiermgt.model.EbPartnerShip)arguments[0],
				(java.lang.String[])arguments[1],
				(java.lang.String[])arguments[2],
				(com.liferay.portal.service.ServiceContext)arguments[3]);

			return null;
		}

		if (_methodName137.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes137, parameterTypes)) {
			EbPartnerShipLocalServiceUtil.removeEbPartnerShip((org.oep.core.dossiermgt.model.EbPartnerShip)arguments[0]);

			return null;
		}

		if (_methodName138.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes138, parameterTypes)) {
			EbPartnerShipLocalServiceUtil.removeEbPartnerShip(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName139.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes139, parameterTypes)) {
			return EbPartnerShipLocalServiceUtil.getEbPartnerShip(((Long)arguments[0]).longValue());
		}

		if (_methodName140.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes140, parameterTypes)) {
			EbPartnerShipLocalServiceUtil.addEbPartnerShipResources((org.oep.core.dossiermgt.model.EbPartnerShip)arguments[0],
				((Boolean)arguments[1]).booleanValue(),
				((Boolean)arguments[2]).booleanValue(),
				(com.liferay.portal.service.ServiceContext)arguments[3]);

			return null;
		}

		if (_methodName141.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes141, parameterTypes)) {
			EbPartnerShipLocalServiceUtil.addEbPartnerShipResources((org.oep.core.dossiermgt.model.EbPartnerShip)arguments[0],
				(java.lang.String[])arguments[1],
				(java.lang.String[])arguments[2],
				(com.liferay.portal.service.ServiceContext)arguments[3]);

			return null;
		}

		if (_methodName142.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes142, parameterTypes)) {
			EbPartnerShipLocalServiceUtil.addEbPartnerShipResources(((Long)arguments[0]).longValue(),
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