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

package org.oep.usermgt.service.base;

import org.oep.usermgt.service.EmployeeLocalServiceUtil;

import java.util.Arrays;

/**
 * @author NQMINH
 * @generated
 */
public class EmployeeLocalServiceClpInvoker {
	public EmployeeLocalServiceClpInvoker() {
		_methodName0 = "addEmployee";

		_methodParameterTypes0 = new String[] { "org.oep.usermgt.model.Employee" };

		_methodName1 = "createEmployee";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteEmployee";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteEmployee";

		_methodParameterTypes3 = new String[] { "org.oep.usermgt.model.Employee" };

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

		_methodName10 = "fetchEmployee";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getEmployee";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getEmployees";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getEmployeesCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateEmployee";

		_methodParameterTypes15 = new String[] { "org.oep.usermgt.model.Employee" };

		_methodName16 = "addJobPosEmployee";

		_methodParameterTypes16 = new String[] { "long", "long" };

		_methodName17 = "addJobPosEmployee";

		_methodParameterTypes17 = new String[] {
				"long", "org.oep.usermgt.model.Employee"
			};

		_methodName18 = "addJobPosEmployees";

		_methodParameterTypes18 = new String[] { "long", "long[][]" };

		_methodName19 = "addJobPosEmployees";

		_methodParameterTypes19 = new String[] { "long", "java.util.List" };

		_methodName20 = "clearJobPosEmployees";

		_methodParameterTypes20 = new String[] { "long" };

		_methodName21 = "deleteJobPosEmployee";

		_methodParameterTypes21 = new String[] { "long", "long" };

		_methodName22 = "deleteJobPosEmployee";

		_methodParameterTypes22 = new String[] {
				"long", "org.oep.usermgt.model.Employee"
			};

		_methodName23 = "deleteJobPosEmployees";

		_methodParameterTypes23 = new String[] { "long", "long[][]" };

		_methodName24 = "deleteJobPosEmployees";

		_methodParameterTypes24 = new String[] { "long", "java.util.List" };

		_methodName25 = "getJobPosEmployees";

		_methodParameterTypes25 = new String[] { "long" };

		_methodName26 = "getJobPosEmployees";

		_methodParameterTypes26 = new String[] { "long", "int", "int" };

		_methodName27 = "getJobPosEmployees";

		_methodParameterTypes27 = new String[] {
				"long", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName28 = "getJobPosEmployeesCount";

		_methodParameterTypes28 = new String[] { "long" };

		_methodName29 = "hasJobPosEmployee";

		_methodParameterTypes29 = new String[] { "long", "long" };

		_methodName30 = "hasJobPosEmployees";

		_methodParameterTypes30 = new String[] { "long" };

		_methodName31 = "setJobPosEmployees";

		_methodParameterTypes31 = new String[] { "long", "long[][]" };

		_methodName100 = "getBeanIdentifier";

		_methodParameterTypes100 = new String[] {  };

		_methodName101 = "setBeanIdentifier";

		_methodParameterTypes101 = new String[] { "java.lang.String" };

		_methodName106 = "addEmployee";

		_methodParameterTypes106 = new String[] {
				"long", "long", "long", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "int", "java.util.Date",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName107 = "addEmployee2JoPos";

		_methodParameterTypes107 = new String[] { "long", "long" };

		_methodName108 = "updateEmployee";

		_methodParameterTypes108 = new String[] {
				"long", "long", "long", "long", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"int", "java.util.Date",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName109 = "saveEmployee";

		_methodParameterTypes109 = new String[] {
				"org.oep.usermgt.model.Employee",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName110 = "updateEmployeeResources";

		_methodParameterTypes110 = new String[] {
				"org.oep.usermgt.model.Employee", "java.lang.String[][]",
				"java.lang.String[][]",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName111 = "removeEmployee";

		_methodParameterTypes111 = new String[] { "org.oep.usermgt.model.Employee" };

		_methodName112 = "removeEmployee";

		_methodParameterTypes112 = new String[] { "long" };

		_methodName113 = "removeJobPos";

		_methodParameterTypes113 = new String[] { "long", "long" };

		_methodName114 = "getEmployee";

		_methodParameterTypes114 = new String[] { "long" };

		_methodName115 = "addEmployeeResources";

		_methodParameterTypes115 = new String[] {
				"org.oep.usermgt.model.Employee", "boolean", "boolean",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName116 = "addEmployeeResources";

		_methodParameterTypes116 = new String[] {
				"org.oep.usermgt.model.Employee", "java.lang.String[][]",
				"java.lang.String[][]",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName117 = "addEmployeeResources";

		_methodParameterTypes117 = new String[] {
				"long", "java.lang.String[][]", "java.lang.String[][]",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName118 = "countEmployeeByWorkingUnit";

		_methodParameterTypes118 = new String[] { "long" };

		_methodName119 = "getByWorkingUnit";

		_methodParameterTypes119 = new String[] { "long" };

		_methodName120 = "getByWorkingUnit";

		_methodParameterTypes120 = new String[] { "long", "int", "int" };

		_methodName121 = "countEmployeeByWorkingUniMainJobPos";

		_methodParameterTypes121 = new String[] { "long", "int" };

		_methodName122 = "getByWorkingUnitMainJobPos";

		_methodParameterTypes122 = new String[] { "long", "int" };

		_methodName123 = "getByWorkingUnitMainJobPos";

		_methodParameterTypes123 = new String[] { "long", "int", "int", "int" };

		_methodName124 = "countEmployeeByLikeNameWorkingUnit";

		_methodParameterTypes124 = new String[] { "java.lang.String", "long" };

		_methodName125 = "finnderByLikeNameWorkingUnit";

		_methodParameterTypes125 = new String[] { "java.lang.String", "long" };

		_methodName126 = "finderLikeNameWorkingUnit";

		_methodParameterTypes126 = new String[] {
				"java.lang.String", "long", "int", "int"
			};

		_methodName127 = "finnderByLikeNameForView";

		_methodParameterTypes127 = new String[] { "java.lang.String", "long" };

		_methodName128 = "finderLikeNameForView";

		_methodParameterTypes128 = new String[] {
				"java.lang.String", "long", "int", "int"
			};

		_methodName129 = "getJobPosByEmployeeId";

		_methodParameterTypes129 = new String[] { "long" };

		_methodName130 = "getJobPos";

		_methodParameterTypes130 = new String[] { "java.util.ArrayList", "long" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return EmployeeLocalServiceUtil.addEmployee((org.oep.usermgt.model.Employee)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return EmployeeLocalServiceUtil.createEmployee(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return EmployeeLocalServiceUtil.deleteEmployee(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return EmployeeLocalServiceUtil.deleteEmployee((org.oep.usermgt.model.Employee)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return EmployeeLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return EmployeeLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return EmployeeLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return EmployeeLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return EmployeeLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return EmployeeLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return EmployeeLocalServiceUtil.fetchEmployee(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return EmployeeLocalServiceUtil.getEmployee(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return EmployeeLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return EmployeeLocalServiceUtil.getEmployees(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return EmployeeLocalServiceUtil.getEmployeesCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return EmployeeLocalServiceUtil.updateEmployee((org.oep.usermgt.model.Employee)arguments[0]);
		}

		if (_methodName16.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes16, parameterTypes)) {
			EmployeeLocalServiceUtil.addJobPosEmployee(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());

			return null;
		}

		if (_methodName17.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes17, parameterTypes)) {
			EmployeeLocalServiceUtil.addJobPosEmployee(((Long)arguments[0]).longValue(),
				(org.oep.usermgt.model.Employee)arguments[1]);

			return null;
		}

		if (_methodName18.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes18, parameterTypes)) {
			EmployeeLocalServiceUtil.addJobPosEmployees(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName19.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes19, parameterTypes)) {
			EmployeeLocalServiceUtil.addJobPosEmployees(((Long)arguments[0]).longValue(),
				(java.util.List<org.oep.usermgt.model.Employee>)arguments[1]);

			return null;
		}

		if (_methodName20.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes20, parameterTypes)) {
			EmployeeLocalServiceUtil.clearJobPosEmployees(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName21.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes21, parameterTypes)) {
			EmployeeLocalServiceUtil.deleteJobPosEmployee(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());

			return null;
		}

		if (_methodName22.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes22, parameterTypes)) {
			EmployeeLocalServiceUtil.deleteJobPosEmployee(((Long)arguments[0]).longValue(),
				(org.oep.usermgt.model.Employee)arguments[1]);

			return null;
		}

		if (_methodName23.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes23, parameterTypes)) {
			EmployeeLocalServiceUtil.deleteJobPosEmployees(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName24.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes24, parameterTypes)) {
			EmployeeLocalServiceUtil.deleteJobPosEmployees(((Long)arguments[0]).longValue(),
				(java.util.List<org.oep.usermgt.model.Employee>)arguments[1]);

			return null;
		}

		if (_methodName25.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes25, parameterTypes)) {
			return EmployeeLocalServiceUtil.getJobPosEmployees(((Long)arguments[0]).longValue());
		}

		if (_methodName26.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes26, parameterTypes)) {
			return EmployeeLocalServiceUtil.getJobPosEmployees(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName27.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes27, parameterTypes)) {
			return EmployeeLocalServiceUtil.getJobPosEmployees(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName28.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes28, parameterTypes)) {
			return EmployeeLocalServiceUtil.getJobPosEmployeesCount(((Long)arguments[0]).longValue());
		}

		if (_methodName29.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes29, parameterTypes)) {
			return EmployeeLocalServiceUtil.hasJobPosEmployee(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName30.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes30, parameterTypes)) {
			return EmployeeLocalServiceUtil.hasJobPosEmployees(((Long)arguments[0]).longValue());
		}

		if (_methodName31.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes31, parameterTypes)) {
			EmployeeLocalServiceUtil.setJobPosEmployees(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName100.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes100, parameterTypes)) {
			return EmployeeLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName101.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes101, parameterTypes)) {
			EmployeeLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName106.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes106, parameterTypes)) {
			return EmployeeLocalServiceUtil.addEmployee(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(),
				(java.lang.String)arguments[3], (java.lang.String)arguments[4],
				(java.lang.String)arguments[5], (java.lang.String)arguments[6],
				(java.lang.String)arguments[7], (java.lang.String)arguments[8],
				(java.lang.String)arguments[9],
				((Integer)arguments[10]).intValue(),
				(java.util.Date)arguments[11],
				(com.liferay.portal.service.ServiceContext)arguments[12]);
		}

		if (_methodName107.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes107, parameterTypes)) {
			EmployeeLocalServiceUtil.addEmployee2JoPos(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());

			return null;
		}

		if (_methodName108.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes108, parameterTypes)) {
			return EmployeeLocalServiceUtil.updateEmployee(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(),
				((Long)arguments[3]).longValue(),
				(java.lang.String)arguments[4], (java.lang.String)arguments[5],
				(java.lang.String)arguments[6], (java.lang.String)arguments[7],
				(java.lang.String)arguments[8], (java.lang.String)arguments[9],
				(java.lang.String)arguments[10],
				((Integer)arguments[11]).intValue(),
				(java.util.Date)arguments[12],
				(com.liferay.portal.service.ServiceContext)arguments[13]);
		}

		if (_methodName109.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes109, parameterTypes)) {
			return EmployeeLocalServiceUtil.saveEmployee((org.oep.usermgt.model.Employee)arguments[0],
				(com.liferay.portal.service.ServiceContext)arguments[1]);
		}

		if (_methodName110.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes110, parameterTypes)) {
			EmployeeLocalServiceUtil.updateEmployeeResources((org.oep.usermgt.model.Employee)arguments[0],
				(java.lang.String[])arguments[1],
				(java.lang.String[])arguments[2],
				(com.liferay.portal.service.ServiceContext)arguments[3]);

			return null;
		}

		if (_methodName111.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes111, parameterTypes)) {
			EmployeeLocalServiceUtil.removeEmployee((org.oep.usermgt.model.Employee)arguments[0]);

			return null;
		}

		if (_methodName112.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes112, parameterTypes)) {
			EmployeeLocalServiceUtil.removeEmployee(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName113.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes113, parameterTypes)) {
			EmployeeLocalServiceUtil.removeJobPos(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());

			return null;
		}

		if (_methodName114.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes114, parameterTypes)) {
			return EmployeeLocalServiceUtil.getEmployee(((Long)arguments[0]).longValue());
		}

		if (_methodName115.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes115, parameterTypes)) {
			EmployeeLocalServiceUtil.addEmployeeResources((org.oep.usermgt.model.Employee)arguments[0],
				((Boolean)arguments[1]).booleanValue(),
				((Boolean)arguments[2]).booleanValue(),
				(com.liferay.portal.service.ServiceContext)arguments[3]);

			return null;
		}

		if (_methodName116.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes116, parameterTypes)) {
			EmployeeLocalServiceUtil.addEmployeeResources((org.oep.usermgt.model.Employee)arguments[0],
				(java.lang.String[])arguments[1],
				(java.lang.String[])arguments[2],
				(com.liferay.portal.service.ServiceContext)arguments[3]);

			return null;
		}

		if (_methodName117.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes117, parameterTypes)) {
			EmployeeLocalServiceUtil.addEmployeeResources(((Long)arguments[0]).longValue(),
				(java.lang.String[])arguments[1],
				(java.lang.String[])arguments[2],
				(com.liferay.portal.service.ServiceContext)arguments[3]);

			return null;
		}

		if (_methodName118.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes118, parameterTypes)) {
			return EmployeeLocalServiceUtil.countEmployeeByWorkingUnit(((Long)arguments[0]).longValue());
		}

		if (_methodName119.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes119, parameterTypes)) {
			return EmployeeLocalServiceUtil.getByWorkingUnit(((Long)arguments[0]).longValue());
		}

		if (_methodName120.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes120, parameterTypes)) {
			return EmployeeLocalServiceUtil.getByWorkingUnit(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName121.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes121, parameterTypes)) {
			return EmployeeLocalServiceUtil.countEmployeeByWorkingUniMainJobPos(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName122.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes122, parameterTypes)) {
			return EmployeeLocalServiceUtil.getByWorkingUnitMainJobPos(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName123.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes123, parameterTypes)) {
			return EmployeeLocalServiceUtil.getByWorkingUnitMainJobPos(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue());
		}

		if (_methodName124.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes124, parameterTypes)) {
			return EmployeeLocalServiceUtil.countEmployeeByLikeNameWorkingUnit((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue());
		}

		if (_methodName125.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes125, parameterTypes)) {
			return EmployeeLocalServiceUtil.finnderByLikeNameWorkingUnit((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue());
		}

		if (_methodName126.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes126, parameterTypes)) {
			return EmployeeLocalServiceUtil.finderLikeNameWorkingUnit((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue(),
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue());
		}

		if (_methodName127.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes127, parameterTypes)) {
			return EmployeeLocalServiceUtil.finnderByLikeNameForView((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue());
		}

		if (_methodName128.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes128, parameterTypes)) {
			return EmployeeLocalServiceUtil.finderLikeNameForView((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue(),
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue());
		}

		if (_methodName129.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes129, parameterTypes)) {
			return EmployeeLocalServiceUtil.getJobPosByEmployeeId(((Long)arguments[0]).longValue());
		}

		if (_methodName130.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes130, parameterTypes)) {
			return EmployeeLocalServiceUtil.getJobPos((java.util.ArrayList<org.oep.usermgt.model.JobPos>)arguments[0],
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
	private String _methodName16;
	private String[] _methodParameterTypes16;
	private String _methodName17;
	private String[] _methodParameterTypes17;
	private String _methodName18;
	private String[] _methodParameterTypes18;
	private String _methodName19;
	private String[] _methodParameterTypes19;
	private String _methodName20;
	private String[] _methodParameterTypes20;
	private String _methodName21;
	private String[] _methodParameterTypes21;
	private String _methodName22;
	private String[] _methodParameterTypes22;
	private String _methodName23;
	private String[] _methodParameterTypes23;
	private String _methodName24;
	private String[] _methodParameterTypes24;
	private String _methodName25;
	private String[] _methodParameterTypes25;
	private String _methodName26;
	private String[] _methodParameterTypes26;
	private String _methodName27;
	private String[] _methodParameterTypes27;
	private String _methodName28;
	private String[] _methodParameterTypes28;
	private String _methodName29;
	private String[] _methodParameterTypes29;
	private String _methodName30;
	private String[] _methodParameterTypes30;
	private String _methodName31;
	private String[] _methodParameterTypes31;
	private String _methodName100;
	private String[] _methodParameterTypes100;
	private String _methodName101;
	private String[] _methodParameterTypes101;
	private String _methodName106;
	private String[] _methodParameterTypes106;
	private String _methodName107;
	private String[] _methodParameterTypes107;
	private String _methodName108;
	private String[] _methodParameterTypes108;
	private String _methodName109;
	private String[] _methodParameterTypes109;
	private String _methodName110;
	private String[] _methodParameterTypes110;
	private String _methodName111;
	private String[] _methodParameterTypes111;
	private String _methodName112;
	private String[] _methodParameterTypes112;
	private String _methodName113;
	private String[] _methodParameterTypes113;
	private String _methodName114;
	private String[] _methodParameterTypes114;
	private String _methodName115;
	private String[] _methodParameterTypes115;
	private String _methodName116;
	private String[] _methodParameterTypes116;
	private String _methodName117;
	private String[] _methodParameterTypes117;
	private String _methodName118;
	private String[] _methodParameterTypes118;
	private String _methodName119;
	private String[] _methodParameterTypes119;
	private String _methodName120;
	private String[] _methodParameterTypes120;
	private String _methodName121;
	private String[] _methodParameterTypes121;
	private String _methodName122;
	private String[] _methodParameterTypes122;
	private String _methodName123;
	private String[] _methodParameterTypes123;
	private String _methodName124;
	private String[] _methodParameterTypes124;
	private String _methodName125;
	private String[] _methodParameterTypes125;
	private String _methodName126;
	private String[] _methodParameterTypes126;
	private String _methodName127;
	private String[] _methodParameterTypes127;
	private String _methodName128;
	private String[] _methodParameterTypes128;
	private String _methodName129;
	private String[] _methodParameterTypes129;
	private String _methodName130;
	private String[] _methodParameterTypes130;
}