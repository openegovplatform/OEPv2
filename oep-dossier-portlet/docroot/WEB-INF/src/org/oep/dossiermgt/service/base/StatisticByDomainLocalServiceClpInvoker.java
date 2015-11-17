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

package org.oep.dossiermgt.service.base;

import org.oep.dossiermgt.service.StatisticByDomainLocalServiceUtil;

import java.util.Arrays;

/**
 * @author trungdk
 * @generated
 */
public class StatisticByDomainLocalServiceClpInvoker {
	public StatisticByDomainLocalServiceClpInvoker() {
		_methodName0 = "addStatisticByDomain";

		_methodParameterTypes0 = new String[] {
				"org.oep.dossiermgt.model.StatisticByDomain"
			};

		_methodName1 = "createStatisticByDomain";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteStatisticByDomain";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteStatisticByDomain";

		_methodParameterTypes3 = new String[] {
				"org.oep.dossiermgt.model.StatisticByDomain"
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

		_methodName10 = "fetchStatisticByDomain";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getStatisticByDomain";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getStatisticByDomains";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getStatisticByDomainsCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateStatisticByDomain";

		_methodParameterTypes15 = new String[] {
				"org.oep.dossiermgt.model.StatisticByDomain"
			};

		_methodName152 = "getBeanIdentifier";

		_methodParameterTypes152 = new String[] {  };

		_methodName153 = "setBeanIdentifier";

		_methodParameterTypes153 = new String[] { "java.lang.String" };

		_methodName158 = "addStatisticByDomain";

		_methodParameterTypes158 = new String[] {
				"int", "int", "java.lang.String", "int", "int", "double", "int",
				"int", "double", "double",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName159 = "updateStatisticByDomain";

		_methodParameterTypes159 = new String[] {
				"long", "int", "int", "java.lang.String", "long", "long",
				"double", "int", "int", "double", "double",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName160 = "updateStatisticByDomain";

		_methodParameterTypes160 = new String[] {
				"org.oep.dossiermgt.model.StatisticByDomain",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName162 = "removeStatisticByDomain";

		_methodParameterTypes162 = new String[] {
				"org.oep.dossiermgt.model.StatisticByDomain"
			};

		_methodName163 = "removeStatisticByDomain";

		_methodParameterTypes163 = new String[] { "long" };

		_methodName164 = "getStatisticByDomain";

		_methodParameterTypes164 = new String[] { "long" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return StatisticByDomainLocalServiceUtil.addStatisticByDomain((org.oep.dossiermgt.model.StatisticByDomain)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return StatisticByDomainLocalServiceUtil.createStatisticByDomain(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return StatisticByDomainLocalServiceUtil.deleteStatisticByDomain(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return StatisticByDomainLocalServiceUtil.deleteStatisticByDomain((org.oep.dossiermgt.model.StatisticByDomain)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return StatisticByDomainLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return StatisticByDomainLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return StatisticByDomainLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return StatisticByDomainLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return StatisticByDomainLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return StatisticByDomainLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return StatisticByDomainLocalServiceUtil.fetchStatisticByDomain(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return StatisticByDomainLocalServiceUtil.getStatisticByDomain(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return StatisticByDomainLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return StatisticByDomainLocalServiceUtil.getStatisticByDomains(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return StatisticByDomainLocalServiceUtil.getStatisticByDomainsCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return StatisticByDomainLocalServiceUtil.updateStatisticByDomain((org.oep.dossiermgt.model.StatisticByDomain)arguments[0]);
		}

		if (_methodName152.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes152, parameterTypes)) {
			return StatisticByDomainLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName153.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes153, parameterTypes)) {
			StatisticByDomainLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName158.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes158, parameterTypes)) {
			return StatisticByDomainLocalServiceUtil.addStatisticByDomain(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue(),
				(java.lang.String)arguments[2],
				((Integer)arguments[3]).intValue(),
				((Integer)arguments[4]).intValue(),
				((Double)arguments[5]).doubleValue(),
				((Integer)arguments[6]).intValue(),
				((Integer)arguments[7]).intValue(),
				((Double)arguments[8]).doubleValue(),
				((Double)arguments[9]).doubleValue(),
				(com.liferay.portal.service.ServiceContext)arguments[10]);
		}

		if (_methodName159.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes159, parameterTypes)) {
			return StatisticByDomainLocalServiceUtil.updateStatisticByDomain(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(java.lang.String)arguments[3],
				((Long)arguments[4]).longValue(),
				((Long)arguments[5]).longValue(),
				((Double)arguments[6]).doubleValue(),
				((Integer)arguments[7]).intValue(),
				((Integer)arguments[8]).intValue(),
				((Double)arguments[9]).doubleValue(),
				((Double)arguments[10]).doubleValue(),
				(com.liferay.portal.service.ServiceContext)arguments[11]);
		}

		if (_methodName160.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes160, parameterTypes)) {
			return StatisticByDomainLocalServiceUtil.updateStatisticByDomain((org.oep.dossiermgt.model.StatisticByDomain)arguments[0],
				(com.liferay.portal.service.ServiceContext)arguments[1]);
		}

		if (_methodName162.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes162, parameterTypes)) {
			StatisticByDomainLocalServiceUtil.removeStatisticByDomain((org.oep.dossiermgt.model.StatisticByDomain)arguments[0]);

			return null;
		}

		if (_methodName163.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes163, parameterTypes)) {
			StatisticByDomainLocalServiceUtil.removeStatisticByDomain(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName164.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes164, parameterTypes)) {
			return StatisticByDomainLocalServiceUtil.getStatisticByDomain(((Long)arguments[0]).longValue());
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
	private String _methodName152;
	private String[] _methodParameterTypes152;
	private String _methodName153;
	private String[] _methodParameterTypes153;
	private String _methodName158;
	private String[] _methodParameterTypes158;
	private String _methodName159;
	private String[] _methodParameterTypes159;
	private String _methodName160;
	private String[] _methodParameterTypes160;
	private String _methodName162;
	private String[] _methodParameterTypes162;
	private String _methodName163;
	private String[] _methodParameterTypes163;
	private String _methodName164;
	private String[] _methodParameterTypes164;
}