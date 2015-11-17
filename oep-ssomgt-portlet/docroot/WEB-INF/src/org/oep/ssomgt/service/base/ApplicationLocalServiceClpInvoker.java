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

import org.oep.ssomgt.service.ApplicationLocalServiceUtil;

import java.util.Arrays;

/**
 * @author trungdk
 * @generated
 */
public class ApplicationLocalServiceClpInvoker {
	public ApplicationLocalServiceClpInvoker() {
		_methodName0 = "addApplication";

		_methodParameterTypes0 = new String[] { "org.oep.ssomgt.model.Application" };

		_methodName1 = "createApplication";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteApplication";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteApplication";

		_methodParameterTypes3 = new String[] { "org.oep.ssomgt.model.Application" };

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

		_methodName10 = "fetchApplication";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getApplication";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getApplications";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getApplicationsCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateApplication";

		_methodParameterTypes15 = new String[] {
				"org.oep.ssomgt.model.Application"
			};

		_methodName16 = "getAppBigIconBlobModel";

		_methodParameterTypes16 = new String[] { "java.io.Serializable" };

		_methodName17 = "getAppSmallIconBlobModel";

		_methodParameterTypes17 = new String[] { "java.io.Serializable" };

		_methodName76 = "getBeanIdentifier";

		_methodParameterTypes76 = new String[] {  };

		_methodName77 = "setBeanIdentifier";

		_methodParameterTypes77 = new String[] { "java.lang.String" };

		_methodName82 = "addApplication";

		_methodParameterTypes82 = new String[] {
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.sql.Blob", "java.sql.Blob",
				"java.util.Date", "int", "java.lang.String",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName83 = "addApplication";

		_methodParameterTypes83 = new String[] {
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.util.Date", "java.lang.String",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName84 = "addApplication";

		_methodParameterTypes84 = new String[] {
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.sql.Blob", "java.sql.Blob",
				"java.util.Date", "java.lang.String",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName85 = "updateApplication";

		_methodParameterTypes85 = new String[] {
				"long", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.sql.Blob",
				"java.sql.Blob", "java.util.Date", "int", "java.lang.String",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName86 = "updateApplication";

		_methodParameterTypes86 = new String[] {
				"long", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.sql.Blob",
				"java.sql.Blob", "java.util.Date", "java.lang.String",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName87 = "updateApplication";

		_methodParameterTypes87 = new String[] {
				"org.oep.ssomgt.model.Application",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName88 = "getUpApplication";

		_methodParameterTypes88 = new String[] {
				"org.oep.ssomgt.model.Application",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName89 = "getDownApplication";

		_methodParameterTypes89 = new String[] {
				"org.oep.ssomgt.model.Application",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName90 = "up";

		_methodParameterTypes90 = new String[] {
				"org.oep.ssomgt.model.Application",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName91 = "down";

		_methodParameterTypes91 = new String[] {
				"org.oep.ssomgt.model.Application",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName92 = "ping";

		_methodParameterTypes92 = new String[] {
				"java.lang.String", "java.lang.String"
			};

		_methodName94 = "removeApplication";

		_methodParameterTypes94 = new String[] {
				"org.oep.ssomgt.model.Application"
			};

		_methodName95 = "removeApplication";

		_methodParameterTypes95 = new String[] { "long" };

		_methodName96 = "getApplication";

		_methodParameterTypes96 = new String[] { "long" };

		_methodName100 = "countByCompany";

		_methodParameterTypes100 = new String[] { "long" };

		_methodName101 = "findByCompany";

		_methodParameterTypes101 = new String[] { "long" };

		_methodName102 = "findByCompany";

		_methodParameterTypes102 = new String[] { "long", "int", "int" };

		_methodName103 = "countByCompany";

		_methodParameterTypes103 = new String[] {
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName104 = "findByCompany";

		_methodParameterTypes104 = new String[] {
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName105 = "findByCompany";

		_methodParameterTypes105 = new String[] {
				"int", "int", "com.liferay.portal.service.ServiceContext"
			};

		_methodName106 = "countByCompanyGroup";

		_methodParameterTypes106 = new String[] { "long", "long" };

		_methodName107 = "findByCompanyGroup";

		_methodParameterTypes107 = new String[] { "long", "long" };

		_methodName108 = "findByCompanyGroup";

		_methodParameterTypes108 = new String[] { "long", "long", "int", "int" };

		_methodName109 = "countByCompanyGroup";

		_methodParameterTypes109 = new String[] {
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName110 = "findByCompanyGroup";

		_methodParameterTypes110 = new String[] {
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName111 = "findByCompanyGroup";

		_methodParameterTypes111 = new String[] {
				"int", "int", "com.liferay.portal.service.ServiceContext"
			};

		_methodName112 = "getByAppCode";

		_methodParameterTypes112 = new String[] { "java.lang.String" };

		_methodName113 = "getMaxSequenceNo";

		_methodParameterTypes113 = new String[] {
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName114 = "validate";

		_methodParameterTypes114 = new String[] {
				"long", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String"
			};
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return ApplicationLocalServiceUtil.addApplication((org.oep.ssomgt.model.Application)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return ApplicationLocalServiceUtil.createApplication(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return ApplicationLocalServiceUtil.deleteApplication(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return ApplicationLocalServiceUtil.deleteApplication((org.oep.ssomgt.model.Application)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return ApplicationLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return ApplicationLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return ApplicationLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return ApplicationLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return ApplicationLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return ApplicationLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return ApplicationLocalServiceUtil.fetchApplication(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return ApplicationLocalServiceUtil.getApplication(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return ApplicationLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return ApplicationLocalServiceUtil.getApplications(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return ApplicationLocalServiceUtil.getApplicationsCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return ApplicationLocalServiceUtil.updateApplication((org.oep.ssomgt.model.Application)arguments[0]);
		}

		if (_methodName16.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes16, parameterTypes)) {
			return ApplicationLocalServiceUtil.getAppBigIconBlobModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName17.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes17, parameterTypes)) {
			return ApplicationLocalServiceUtil.getAppSmallIconBlobModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName76.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes76, parameterTypes)) {
			return ApplicationLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName77.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes77, parameterTypes)) {
			ApplicationLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName82.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes82, parameterTypes)) {
			return ApplicationLocalServiceUtil.addApplication((java.lang.String)arguments[0],
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				(java.lang.String)arguments[3], (java.sql.Blob)arguments[4],
				(java.sql.Blob)arguments[5], (java.util.Date)arguments[6],
				((Integer)arguments[7]).intValue(),
				(java.lang.String)arguments[8],
				(com.liferay.portal.service.ServiceContext)arguments[9]);
		}

		if (_methodName83.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes83, parameterTypes)) {
			return ApplicationLocalServiceUtil.addApplication((java.lang.String)arguments[0],
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				(java.lang.String)arguments[3], (java.util.Date)arguments[4],
				(java.lang.String)arguments[5],
				(com.liferay.portal.service.ServiceContext)arguments[6]);
		}

		if (_methodName84.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes84, parameterTypes)) {
			return ApplicationLocalServiceUtil.addApplication((java.lang.String)arguments[0],
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				(java.lang.String)arguments[3], (java.sql.Blob)arguments[4],
				(java.sql.Blob)arguments[5], (java.util.Date)arguments[6],
				(java.lang.String)arguments[7],
				(com.liferay.portal.service.ServiceContext)arguments[8]);
		}

		if (_methodName85.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes85, parameterTypes)) {
			return ApplicationLocalServiceUtil.updateApplication(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				(java.lang.String)arguments[3], (java.lang.String)arguments[4],
				(java.sql.Blob)arguments[5], (java.sql.Blob)arguments[6],
				(java.util.Date)arguments[7],
				((Integer)arguments[8]).intValue(),
				(java.lang.String)arguments[9],
				(com.liferay.portal.service.ServiceContext)arguments[10]);
		}

		if (_methodName86.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes86, parameterTypes)) {
			return ApplicationLocalServiceUtil.updateApplication(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				(java.lang.String)arguments[3], (java.lang.String)arguments[4],
				(java.sql.Blob)arguments[5], (java.sql.Blob)arguments[6],
				(java.util.Date)arguments[7], (java.lang.String)arguments[8],
				(com.liferay.portal.service.ServiceContext)arguments[9]);
		}

		if (_methodName87.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes87, parameterTypes)) {
			return ApplicationLocalServiceUtil.updateApplication((org.oep.ssomgt.model.Application)arguments[0],
				(com.liferay.portal.service.ServiceContext)arguments[1]);
		}

		if (_methodName88.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes88, parameterTypes)) {
			return ApplicationLocalServiceUtil.getUpApplication((org.oep.ssomgt.model.Application)arguments[0],
				(com.liferay.portal.service.ServiceContext)arguments[1]);
		}

		if (_methodName89.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes89, parameterTypes)) {
			return ApplicationLocalServiceUtil.getDownApplication((org.oep.ssomgt.model.Application)arguments[0],
				(com.liferay.portal.service.ServiceContext)arguments[1]);
		}

		if (_methodName90.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes90, parameterTypes)) {
			return ApplicationLocalServiceUtil.up((org.oep.ssomgt.model.Application)arguments[0],
				(com.liferay.portal.service.ServiceContext)arguments[1]);
		}

		if (_methodName91.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes91, parameterTypes)) {
			return ApplicationLocalServiceUtil.down((org.oep.ssomgt.model.Application)arguments[0],
				(com.liferay.portal.service.ServiceContext)arguments[1]);
		}

		if (_methodName92.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes92, parameterTypes)) {
			return ApplicationLocalServiceUtil.ping((java.lang.String)arguments[0],
				(java.lang.String)arguments[1]);
		}

		if (_methodName94.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes94, parameterTypes)) {
			ApplicationLocalServiceUtil.removeApplication((org.oep.ssomgt.model.Application)arguments[0]);

			return null;
		}

		if (_methodName95.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes95, parameterTypes)) {
			ApplicationLocalServiceUtil.removeApplication(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName96.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes96, parameterTypes)) {
			return ApplicationLocalServiceUtil.getApplication(((Long)arguments[0]).longValue());
		}

		if (_methodName100.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes100, parameterTypes)) {
			return ApplicationLocalServiceUtil.countByCompany(((Long)arguments[0]).longValue());
		}

		if (_methodName101.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes101, parameterTypes)) {
			return ApplicationLocalServiceUtil.findByCompany(((Long)arguments[0]).longValue());
		}

		if (_methodName102.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes102, parameterTypes)) {
			return ApplicationLocalServiceUtil.findByCompany(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName103.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes103, parameterTypes)) {
			return ApplicationLocalServiceUtil.countByCompany((com.liferay.portal.service.ServiceContext)arguments[0]);
		}

		if (_methodName104.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes104, parameterTypes)) {
			return ApplicationLocalServiceUtil.findByCompany((com.liferay.portal.service.ServiceContext)arguments[0]);
		}

		if (_methodName105.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes105, parameterTypes)) {
			return ApplicationLocalServiceUtil.findByCompany(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue(),
				(com.liferay.portal.service.ServiceContext)arguments[2]);
		}

		if (_methodName106.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes106, parameterTypes)) {
			return ApplicationLocalServiceUtil.countByCompanyGroup(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName107.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes107, parameterTypes)) {
			return ApplicationLocalServiceUtil.findByCompanyGroup(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName108.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes108, parameterTypes)) {
			return ApplicationLocalServiceUtil.findByCompanyGroup(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue());
		}

		if (_methodName109.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes109, parameterTypes)) {
			return ApplicationLocalServiceUtil.countByCompanyGroup((com.liferay.portal.service.ServiceContext)arguments[0]);
		}

		if (_methodName110.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes110, parameterTypes)) {
			return ApplicationLocalServiceUtil.findByCompanyGroup((com.liferay.portal.service.ServiceContext)arguments[0]);
		}

		if (_methodName111.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes111, parameterTypes)) {
			return ApplicationLocalServiceUtil.findByCompanyGroup(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue(),
				(com.liferay.portal.service.ServiceContext)arguments[2]);
		}

		if (_methodName112.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes112, parameterTypes)) {
			return ApplicationLocalServiceUtil.getByAppCode((java.lang.String)arguments[0]);
		}

		if (_methodName113.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes113, parameterTypes)) {
			return ApplicationLocalServiceUtil.getMaxSequenceNo((com.liferay.portal.service.ServiceContext)arguments[0]);
		}

		if (_methodName114.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes114, parameterTypes)) {
			ApplicationLocalServiceUtil.validate(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				(java.lang.String)arguments[3], (java.lang.String)arguments[4],
				(java.lang.String)arguments[5]);

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
	private String _methodName16;
	private String[] _methodParameterTypes16;
	private String _methodName17;
	private String[] _methodParameterTypes17;
	private String _methodName76;
	private String[] _methodParameterTypes76;
	private String _methodName77;
	private String[] _methodParameterTypes77;
	private String _methodName82;
	private String[] _methodParameterTypes82;
	private String _methodName83;
	private String[] _methodParameterTypes83;
	private String _methodName84;
	private String[] _methodParameterTypes84;
	private String _methodName85;
	private String[] _methodParameterTypes85;
	private String _methodName86;
	private String[] _methodParameterTypes86;
	private String _methodName87;
	private String[] _methodParameterTypes87;
	private String _methodName88;
	private String[] _methodParameterTypes88;
	private String _methodName89;
	private String[] _methodParameterTypes89;
	private String _methodName90;
	private String[] _methodParameterTypes90;
	private String _methodName91;
	private String[] _methodParameterTypes91;
	private String _methodName92;
	private String[] _methodParameterTypes92;
	private String _methodName94;
	private String[] _methodParameterTypes94;
	private String _methodName95;
	private String[] _methodParameterTypes95;
	private String _methodName96;
	private String[] _methodParameterTypes96;
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
	private String _methodName105;
	private String[] _methodParameterTypes105;
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
}