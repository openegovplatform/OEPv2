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

import org.oep.usermgt.service.JobPos2RoleLocalServiceUtil;

import java.util.Arrays;

/**
 * @author NQMINH
 * @generated
 */
public class JobPos2RoleLocalServiceClpInvoker {
	public JobPos2RoleLocalServiceClpInvoker() {
		_methodName0 = "addJobPos2Role";

		_methodParameterTypes0 = new String[] {
				"org.oep.usermgt.model.JobPos2Role"
			};

		_methodName1 = "createJobPos2Role";

		_methodParameterTypes1 = new String[] {
				"org.oep.usermgt.service.persistence.JobPos2RolePK"
			};

		_methodName2 = "deleteJobPos2Role";

		_methodParameterTypes2 = new String[] {
				"org.oep.usermgt.service.persistence.JobPos2RolePK"
			};

		_methodName3 = "deleteJobPos2Role";

		_methodParameterTypes3 = new String[] {
				"org.oep.usermgt.model.JobPos2Role"
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

		_methodName10 = "fetchJobPos2Role";

		_methodParameterTypes10 = new String[] {
				"org.oep.usermgt.service.persistence.JobPos2RolePK"
			};

		_methodName11 = "getJobPos2Role";

		_methodParameterTypes11 = new String[] {
				"org.oep.usermgt.service.persistence.JobPos2RolePK"
			};

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getJobPos2Roles";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getJobPos2RolesCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateJobPos2Role";

		_methodParameterTypes15 = new String[] {
				"org.oep.usermgt.model.JobPos2Role"
			};

		_methodName84 = "getBeanIdentifier";

		_methodParameterTypes84 = new String[] {  };

		_methodName85 = "setBeanIdentifier";

		_methodParameterTypes85 = new String[] { "java.lang.String" };

		_methodName90 = "addJobPos2Role";

		_methodParameterTypes90 = new String[] {
				"long", "long", "com.liferay.portal.service.ServiceContext"
			};

		_methodName91 = "updateJobPos2Role";

		_methodParameterTypes91 = new String[] {
				"long", "long", "com.liferay.portal.service.ServiceContext"
			};

		_methodName92 = "saveJobPos2Role";

		_methodParameterTypes92 = new String[] {
				"org.oep.usermgt.model.JobPos2Role",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName93 = "updateJobPos2RoleResources";

		_methodParameterTypes93 = new String[] {
				"org.oep.usermgt.model.JobPos2Role", "java.lang.String[][]",
				"java.lang.String[][]",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName94 = "removeJobPos2Role";

		_methodParameterTypes94 = new String[] {
				"org.oep.usermgt.model.JobPos2Role"
			};

		_methodName95 = "removeJobPos2Role";

		_methodParameterTypes95 = new String[] { "long", "long" };

		_methodName96 = "getJobPos2Role";

		_methodParameterTypes96 = new String[] { "long" };

		_methodName97 = "addJobPos2RoleResources";

		_methodParameterTypes97 = new String[] {
				"org.oep.usermgt.model.JobPos", "boolean", "boolean",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName98 = "addJobPos2RoleResources";

		_methodParameterTypes98 = new String[] {
				"org.oep.usermgt.model.JobPos", "java.lang.String[][]",
				"java.lang.String[][]",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName99 = "addJobPos2RoleResources";

		_methodParameterTypes99 = new String[] {
				"long", "java.lang.String[][]", "java.lang.String[][]",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName100 = "getByJobPos";

		_methodParameterTypes100 = new String[] { "long" };

		_methodName101 = "getRoleIdByJobPosId";

		_methodParameterTypes101 = new String[] { "long" };

		_methodName102 = "getRoleIdByJobPosId";

		_methodParameterTypes102 = new String[] { "java.util.ArrayList", "long" };

		_methodName103 = "getRoleByJobPosId";

		_methodParameterTypes103 = new String[] { "long" };

		_methodName104 = "getRoleByNotInJobPosId";

		_methodParameterTypes104 = new String[] { "long" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return JobPos2RoleLocalServiceUtil.addJobPos2Role((org.oep.usermgt.model.JobPos2Role)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return JobPos2RoleLocalServiceUtil.createJobPos2Role((org.oep.usermgt.service.persistence.JobPos2RolePK)arguments[0]);
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return JobPos2RoleLocalServiceUtil.deleteJobPos2Role((org.oep.usermgt.service.persistence.JobPos2RolePK)arguments[0]);
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return JobPos2RoleLocalServiceUtil.deleteJobPos2Role((org.oep.usermgt.model.JobPos2Role)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return JobPos2RoleLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return JobPos2RoleLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return JobPos2RoleLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return JobPos2RoleLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return JobPos2RoleLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return JobPos2RoleLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return JobPos2RoleLocalServiceUtil.fetchJobPos2Role((org.oep.usermgt.service.persistence.JobPos2RolePK)arguments[0]);
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return JobPos2RoleLocalServiceUtil.getJobPos2Role((org.oep.usermgt.service.persistence.JobPos2RolePK)arguments[0]);
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return JobPos2RoleLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return JobPos2RoleLocalServiceUtil.getJobPos2Roles(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return JobPos2RoleLocalServiceUtil.getJobPos2RolesCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return JobPos2RoleLocalServiceUtil.updateJobPos2Role((org.oep.usermgt.model.JobPos2Role)arguments[0]);
		}

		if (_methodName84.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes84, parameterTypes)) {
			return JobPos2RoleLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName85.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes85, parameterTypes)) {
			JobPos2RoleLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName90.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes90, parameterTypes)) {
			return JobPos2RoleLocalServiceUtil.addJobPos2Role(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(com.liferay.portal.service.ServiceContext)arguments[2]);
		}

		if (_methodName91.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes91, parameterTypes)) {
			return JobPos2RoleLocalServiceUtil.updateJobPos2Role(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(com.liferay.portal.service.ServiceContext)arguments[2]);
		}

		if (_methodName92.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes92, parameterTypes)) {
			return JobPos2RoleLocalServiceUtil.saveJobPos2Role((org.oep.usermgt.model.JobPos2Role)arguments[0],
				(com.liferay.portal.service.ServiceContext)arguments[1]);
		}

		if (_methodName93.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes93, parameterTypes)) {
			JobPos2RoleLocalServiceUtil.updateJobPos2RoleResources((org.oep.usermgt.model.JobPos2Role)arguments[0],
				(java.lang.String[])arguments[1],
				(java.lang.String[])arguments[2],
				(com.liferay.portal.service.ServiceContext)arguments[3]);

			return null;
		}

		if (_methodName94.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes94, parameterTypes)) {
			JobPos2RoleLocalServiceUtil.removeJobPos2Role((org.oep.usermgt.model.JobPos2Role)arguments[0]);

			return null;
		}

		if (_methodName95.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes95, parameterTypes)) {
			JobPos2RoleLocalServiceUtil.removeJobPos2Role(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());

			return null;
		}

		if (_methodName96.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes96, parameterTypes)) {
			return JobPos2RoleLocalServiceUtil.getJobPos2Role(((Long)arguments[0]).longValue());
		}

		if (_methodName97.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes97, parameterTypes)) {
			JobPos2RoleLocalServiceUtil.addJobPos2RoleResources((org.oep.usermgt.model.JobPos)arguments[0],
				((Boolean)arguments[1]).booleanValue(),
				((Boolean)arguments[2]).booleanValue(),
				(com.liferay.portal.service.ServiceContext)arguments[3]);

			return null;
		}

		if (_methodName98.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes98, parameterTypes)) {
			JobPos2RoleLocalServiceUtil.addJobPos2RoleResources((org.oep.usermgt.model.JobPos)arguments[0],
				(java.lang.String[])arguments[1],
				(java.lang.String[])arguments[2],
				(com.liferay.portal.service.ServiceContext)arguments[3]);

			return null;
		}

		if (_methodName99.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes99, parameterTypes)) {
			JobPos2RoleLocalServiceUtil.addJobPos2RoleResources(((Long)arguments[0]).longValue(),
				(java.lang.String[])arguments[1],
				(java.lang.String[])arguments[2],
				(com.liferay.portal.service.ServiceContext)arguments[3]);

			return null;
		}

		if (_methodName100.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes100, parameterTypes)) {
			return JobPos2RoleLocalServiceUtil.getByJobPos(((Long)arguments[0]).longValue());
		}

		if (_methodName101.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes101, parameterTypes)) {
			return JobPos2RoleLocalServiceUtil.getRoleIdByJobPosId(((Long)arguments[0]).longValue());
		}

		if (_methodName102.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes102, parameterTypes)) {
			return JobPos2RoleLocalServiceUtil.getRoleIdByJobPosId((java.util.ArrayList<com.liferay.portal.model.Role>)arguments[0],
				((Long)arguments[1]).longValue());
		}

		if (_methodName103.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes103, parameterTypes)) {
			return JobPos2RoleLocalServiceUtil.getRoleByJobPosId(((Long)arguments[0]).longValue());
		}

		if (_methodName104.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes104, parameterTypes)) {
			return JobPos2RoleLocalServiceUtil.getRoleByNotInJobPosId(((Long)arguments[0]).longValue());
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
	private String _methodName84;
	private String[] _methodParameterTypes84;
	private String _methodName85;
	private String[] _methodParameterTypes85;
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
	private String _methodName102;
	private String[] _methodParameterTypes102;
	private String _methodName103;
	private String[] _methodParameterTypes103;
	private String _methodName104;
	private String[] _methodParameterTypes104;
}