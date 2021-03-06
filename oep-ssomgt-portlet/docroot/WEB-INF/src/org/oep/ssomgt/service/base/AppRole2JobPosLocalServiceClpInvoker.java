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

import org.oep.ssomgt.service.AppRole2JobPosLocalServiceUtil;

import java.util.Arrays;

/**
 * @author trungdk
 * @generated
 */
public class AppRole2JobPosLocalServiceClpInvoker {
	public AppRole2JobPosLocalServiceClpInvoker() {
		_methodName0 = "addAppRole2JobPos";

		_methodParameterTypes0 = new String[] {
				"org.oep.ssomgt.model.AppRole2JobPos"
			};

		_methodName1 = "createAppRole2JobPos";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteAppRole2JobPos";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteAppRole2JobPos";

		_methodParameterTypes3 = new String[] {
				"org.oep.ssomgt.model.AppRole2JobPos"
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

		_methodName10 = "fetchAppRole2JobPos";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getAppRole2JobPos";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getAppRole2JobPoses";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getAppRole2JobPosesCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateAppRole2JobPos";

		_methodParameterTypes15 = new String[] {
				"org.oep.ssomgt.model.AppRole2JobPos"
			};

		_methodName74 = "getBeanIdentifier";

		_methodParameterTypes74 = new String[] {  };

		_methodName75 = "setBeanIdentifier";

		_methodParameterTypes75 = new String[] { "java.lang.String" };

		_methodName80 = "addAppRole2JobPos";

		_methodParameterTypes80 = new String[] {
				"long", "long", "com.liferay.portal.service.ServiceContext"
			};

		_methodName81 = "updateAppRole2JobPos";

		_methodParameterTypes81 = new String[] {
				"long", "long", "long",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName82 = "updateAppRole2JobPos";

		_methodParameterTypes82 = new String[] {
				"org.oep.ssomgt.model.AppRole2JobPos",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName84 = "removeAppRole2JobPos";

		_methodParameterTypes84 = new String[] {
				"org.oep.ssomgt.model.AppRole2JobPos"
			};

		_methodName85 = "removeAppRole2JobPos";

		_methodParameterTypes85 = new String[] { "long" };

		_methodName86 = "getAppRole2JobPos";

		_methodParameterTypes86 = new String[] { "long" };

		_methodName90 = "countAppRoleByJobPos";

		_methodParameterTypes90 = new String[] { "long", "long[][]" };

		_methodName91 = "countAppRoleByJobPos";

		_methodParameterTypes91 = new String[] {
				"long[][]", "com.liferay.portal.service.ServiceContext"
			};

		_methodName92 = "findAppRoleByJobPos";

		_methodParameterTypes92 = new String[] { "long", "long[][]" };

		_methodName93 = "findAppRoleByJobPos";

		_methodParameterTypes93 = new String[] {
				"com.liferay.portal.service.ServiceContext", "long[][]"
			};

		_methodName94 = "countAppRoleCGByJobPos";

		_methodParameterTypes94 = new String[] { "long", "long", "long[][]" };

		_methodName95 = "countAppRoleCGByJobPos";

		_methodParameterTypes95 = new String[] {
				"long[][]", "com.liferay.portal.service.ServiceContext"
			};

		_methodName96 = "findAppRoleCGByJobPos";

		_methodParameterTypes96 = new String[] { "long", "long", "long[][]" };

		_methodName97 = "findAppRoleCGByJobPos";

		_methodParameterTypes97 = new String[] {
				"com.liferay.portal.service.ServiceContext", "long[][]"
			};

		_methodName98 = "countByWorkingUnit";

		_methodParameterTypes98 = new String[] {
				"long", "com.liferay.portal.service.ServiceContext"
			};

		_methodName99 = "findByWorkingUnit";

		_methodParameterTypes99 = new String[] {
				"long", "int", "int",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName100 = "countByAppRoleWorkingUnit";

		_methodParameterTypes100 = new String[] {
				"long", "long", "com.liferay.portal.service.ServiceContext"
			};

		_methodName101 = "findByAppRoleWorkingUnit";

		_methodParameterTypes101 = new String[] {
				"long", "long", "int", "int",
				"com.liferay.portal.service.ServiceContext"
			};
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return AppRole2JobPosLocalServiceUtil.addAppRole2JobPos((org.oep.ssomgt.model.AppRole2JobPos)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return AppRole2JobPosLocalServiceUtil.createAppRole2JobPos(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return AppRole2JobPosLocalServiceUtil.deleteAppRole2JobPos(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return AppRole2JobPosLocalServiceUtil.deleteAppRole2JobPos((org.oep.ssomgt.model.AppRole2JobPos)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return AppRole2JobPosLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return AppRole2JobPosLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return AppRole2JobPosLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return AppRole2JobPosLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return AppRole2JobPosLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return AppRole2JobPosLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return AppRole2JobPosLocalServiceUtil.fetchAppRole2JobPos(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return AppRole2JobPosLocalServiceUtil.getAppRole2JobPos(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return AppRole2JobPosLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return AppRole2JobPosLocalServiceUtil.getAppRole2JobPoses(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return AppRole2JobPosLocalServiceUtil.getAppRole2JobPosesCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return AppRole2JobPosLocalServiceUtil.updateAppRole2JobPos((org.oep.ssomgt.model.AppRole2JobPos)arguments[0]);
		}

		if (_methodName74.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes74, parameterTypes)) {
			return AppRole2JobPosLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName75.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes75, parameterTypes)) {
			AppRole2JobPosLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName80.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes80, parameterTypes)) {
			return AppRole2JobPosLocalServiceUtil.addAppRole2JobPos(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(com.liferay.portal.service.ServiceContext)arguments[2]);
		}

		if (_methodName81.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes81, parameterTypes)) {
			return AppRole2JobPosLocalServiceUtil.updateAppRole2JobPos(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(),
				(com.liferay.portal.service.ServiceContext)arguments[3]);
		}

		if (_methodName82.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes82, parameterTypes)) {
			return AppRole2JobPosLocalServiceUtil.updateAppRole2JobPos((org.oep.ssomgt.model.AppRole2JobPos)arguments[0],
				(com.liferay.portal.service.ServiceContext)arguments[1]);
		}

		if (_methodName84.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes84, parameterTypes)) {
			AppRole2JobPosLocalServiceUtil.removeAppRole2JobPos((org.oep.ssomgt.model.AppRole2JobPos)arguments[0]);

			return null;
		}

		if (_methodName85.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes85, parameterTypes)) {
			AppRole2JobPosLocalServiceUtil.removeAppRole2JobPos(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName86.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes86, parameterTypes)) {
			return AppRole2JobPosLocalServiceUtil.getAppRole2JobPos(((Long)arguments[0]).longValue());
		}

		if (_methodName90.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes90, parameterTypes)) {
			return AppRole2JobPosLocalServiceUtil.countAppRoleByJobPos(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);
		}

		if (_methodName91.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes91, parameterTypes)) {
			return AppRole2JobPosLocalServiceUtil.countAppRoleByJobPos((long[])arguments[0],
				(com.liferay.portal.service.ServiceContext)arguments[1]);
		}

		if (_methodName92.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes92, parameterTypes)) {
			return AppRole2JobPosLocalServiceUtil.findAppRoleByJobPos(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);
		}

		if (_methodName93.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes93, parameterTypes)) {
			return AppRole2JobPosLocalServiceUtil.findAppRoleByJobPos((com.liferay.portal.service.ServiceContext)arguments[0],
				(long[])arguments[1]);
		}

		if (_methodName94.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes94, parameterTypes)) {
			return AppRole2JobPosLocalServiceUtil.countAppRoleCGByJobPos(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(), (long[])arguments[2]);
		}

		if (_methodName95.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes95, parameterTypes)) {
			return AppRole2JobPosLocalServiceUtil.countAppRoleCGByJobPos((long[])arguments[0],
				(com.liferay.portal.service.ServiceContext)arguments[1]);
		}

		if (_methodName96.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes96, parameterTypes)) {
			return AppRole2JobPosLocalServiceUtil.findAppRoleCGByJobPos(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(), (long[])arguments[2]);
		}

		if (_methodName97.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes97, parameterTypes)) {
			return AppRole2JobPosLocalServiceUtil.findAppRoleCGByJobPos((com.liferay.portal.service.ServiceContext)arguments[0],
				(long[])arguments[1]);
		}

		if (_methodName98.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes98, parameterTypes)) {
			return AppRole2JobPosLocalServiceUtil.countByWorkingUnit(((Long)arguments[0]).longValue(),
				(com.liferay.portal.service.ServiceContext)arguments[1]);
		}

		if (_methodName99.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes99, parameterTypes)) {
			return AppRole2JobPosLocalServiceUtil.findByWorkingUnit(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.service.ServiceContext)arguments[3]);
		}

		if (_methodName100.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes100, parameterTypes)) {
			return AppRole2JobPosLocalServiceUtil.countByAppRoleWorkingUnit(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(com.liferay.portal.service.ServiceContext)arguments[2]);
		}

		if (_methodName101.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes101, parameterTypes)) {
			return AppRole2JobPosLocalServiceUtil.findByAppRoleWorkingUnit(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue(),
				(com.liferay.portal.service.ServiceContext)arguments[4]);
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
	private String _methodName95;
	private String[] _methodParameterTypes95;
	private String _methodName96;
	private String[] _methodParameterTypes96;
	private String _methodName97;
	private String[] _methodParameterTypes97;
	private String _methodName98;
	private String[] _methodParameterTypes98;
	private String _methodName99;
	private String[] _methodParameterTypes99;
	private String _methodName100;
	private String[] _methodParameterTypes100;
	private String _methodName101;
	private String[] _methodParameterTypes101;
}