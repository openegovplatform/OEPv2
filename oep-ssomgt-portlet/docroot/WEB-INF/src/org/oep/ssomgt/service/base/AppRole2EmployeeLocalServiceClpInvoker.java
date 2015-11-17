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

package org.oep.ssomgt.service.base;

import org.oep.ssomgt.service.AppRole2EmployeeLocalServiceUtil;

import java.util.Arrays;

/**
 * @author trungdk
 * @generated
 */
public class AppRole2EmployeeLocalServiceClpInvoker {
	public AppRole2EmployeeLocalServiceClpInvoker() {
		_methodName0 = "addAppRole2Employee";

		_methodParameterTypes0 = new String[] {
				"org.oep.ssomgt.model.AppRole2Employee"
			};

		_methodName1 = "createAppRole2Employee";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteAppRole2Employee";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteAppRole2Employee";

		_methodParameterTypes3 = new String[] {
				"org.oep.ssomgt.model.AppRole2Employee"
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

		_methodName10 = "fetchAppRole2Employee";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getAppRole2Employee";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getAppRole2Employees";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getAppRole2EmployeesCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateAppRole2Employee";

		_methodParameterTypes15 = new String[] {
				"org.oep.ssomgt.model.AppRole2Employee"
			};

		_methodName74 = "getBeanIdentifier";

		_methodParameterTypes74 = new String[] {  };

		_methodName75 = "setBeanIdentifier";

		_methodParameterTypes75 = new String[] { "java.lang.String" };

		_methodName80 = "addAppRole2Employee";

		_methodParameterTypes80 = new String[] {
				"long", "long", "com.liferay.portal.service.ServiceContext"
			};

		_methodName81 = "updateAppRole2Employee";

		_methodParameterTypes81 = new String[] {
				"long", "long", "long",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName82 = "updateAppRole2Employee";

		_methodParameterTypes82 = new String[] {
				"org.oep.ssomgt.model.AppRole2Employee",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName84 = "removeAppRole2Employee";

		_methodParameterTypes84 = new String[] {
				"org.oep.ssomgt.model.AppRole2Employee"
			};

		_methodName85 = "removeAppRole2Employee";

		_methodParameterTypes85 = new String[] { "long" };

		_methodName86 = "getAppRole2Employee";

		_methodParameterTypes86 = new String[] { "long" };

		_methodName90 = "countByWorkingUnit";

		_methodParameterTypes90 = new String[] {
				"long", "com.liferay.portal.service.ServiceContext"
			};

		_methodName91 = "findByWorkingUnit";

		_methodParameterTypes91 = new String[] {
				"long", "int", "int",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName92 = "countByAppRoleWorkingUnit";

		_methodParameterTypes92 = new String[] {
				"long", "long", "com.liferay.portal.service.ServiceContext"
			};

		_methodName93 = "findByAppRoleWorkingUnit";

		_methodParameterTypes93 = new String[] {
				"long", "long", "int", "int",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName94 = "findRoleByEmployee";

		_methodParameterTypes94 = new String[] { "long", "long" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return AppRole2EmployeeLocalServiceUtil.addAppRole2Employee((org.oep.ssomgt.model.AppRole2Employee)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return AppRole2EmployeeLocalServiceUtil.createAppRole2Employee(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return AppRole2EmployeeLocalServiceUtil.deleteAppRole2Employee(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return AppRole2EmployeeLocalServiceUtil.deleteAppRole2Employee((org.oep.ssomgt.model.AppRole2Employee)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return AppRole2EmployeeLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return AppRole2EmployeeLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return AppRole2EmployeeLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return AppRole2EmployeeLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return AppRole2EmployeeLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return AppRole2EmployeeLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return AppRole2EmployeeLocalServiceUtil.fetchAppRole2Employee(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return AppRole2EmployeeLocalServiceUtil.getAppRole2Employee(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return AppRole2EmployeeLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return AppRole2EmployeeLocalServiceUtil.getAppRole2Employees(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return AppRole2EmployeeLocalServiceUtil.getAppRole2EmployeesCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return AppRole2EmployeeLocalServiceUtil.updateAppRole2Employee((org.oep.ssomgt.model.AppRole2Employee)arguments[0]);
		}

		if (_methodName74.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes74, parameterTypes)) {
			return AppRole2EmployeeLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName75.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes75, parameterTypes)) {
			AppRole2EmployeeLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName80.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes80, parameterTypes)) {
			return AppRole2EmployeeLocalServiceUtil.addAppRole2Employee(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(com.liferay.portal.service.ServiceContext)arguments[2]);
		}

		if (_methodName81.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes81, parameterTypes)) {
			return AppRole2EmployeeLocalServiceUtil.updateAppRole2Employee(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(),
				(com.liferay.portal.service.ServiceContext)arguments[3]);
		}

		if (_methodName82.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes82, parameterTypes)) {
			return AppRole2EmployeeLocalServiceUtil.updateAppRole2Employee((org.oep.ssomgt.model.AppRole2Employee)arguments[0],
				(com.liferay.portal.service.ServiceContext)arguments[1]);
		}

		if (_methodName84.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes84, parameterTypes)) {
			AppRole2EmployeeLocalServiceUtil.removeAppRole2Employee((org.oep.ssomgt.model.AppRole2Employee)arguments[0]);

			return null;
		}

		if (_methodName85.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes85, parameterTypes)) {
			AppRole2EmployeeLocalServiceUtil.removeAppRole2Employee(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName86.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes86, parameterTypes)) {
			return AppRole2EmployeeLocalServiceUtil.getAppRole2Employee(((Long)arguments[0]).longValue());
		}

		if (_methodName90.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes90, parameterTypes)) {
			return AppRole2EmployeeLocalServiceUtil.countByWorkingUnit(((Long)arguments[0]).longValue(),
				(com.liferay.portal.service.ServiceContext)arguments[1]);
		}

		if (_methodName91.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes91, parameterTypes)) {
			return AppRole2EmployeeLocalServiceUtil.findByWorkingUnit(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.service.ServiceContext)arguments[3]);
		}

		if (_methodName92.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes92, parameterTypes)) {
			return AppRole2EmployeeLocalServiceUtil.countByAppRoleWorkingUnit(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(com.liferay.portal.service.ServiceContext)arguments[2]);
		}

		if (_methodName93.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes93, parameterTypes)) {
			return AppRole2EmployeeLocalServiceUtil.findByAppRoleWorkingUnit(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue(),
				(com.liferay.portal.service.ServiceContext)arguments[4]);
		}

		if (_methodName94.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes94, parameterTypes)) {
			return AppRole2EmployeeLocalServiceUtil.findRoleByEmployee(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
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
	private String _methodName74;
	private String[] _methodParameterTypes74;
	private String _methodName75;
	private String[] _methodParameterTypes75;
	private String _methodName80;
	private String[] _methodParameterTypes80;
	private String _methodName81;
	private String[] _methodParameterTypes81;
	private String _methodName82;
	private String[] _methodParameterTypes82;
	private String _methodName84;
	private String[] _methodParameterTypes84;
	private String _methodName85;
	private String[] _methodParameterTypes85;
	private String _methodName86;
	private String[] _methodParameterTypes86;
	private String _methodName90;
	private String[] _methodParameterTypes90;
	private String _methodName91;
	private String[] _methodParameterTypes91;
	private String _methodName92;
	private String[] _methodParameterTypes92;
	private String _methodName93;
	private String[] _methodParameterTypes93;
	private String _methodName94;
	private String[] _methodParameterTypes94;
}