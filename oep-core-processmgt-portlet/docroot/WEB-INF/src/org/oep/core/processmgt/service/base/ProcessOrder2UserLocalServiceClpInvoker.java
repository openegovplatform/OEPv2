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

package org.oep.core.processmgt.service.base;

import org.oep.core.processmgt.service.ProcessOrder2UserLocalServiceUtil;

import java.util.Arrays;

/**
 * @author trungdk
 * @generated
 */
public class ProcessOrder2UserLocalServiceClpInvoker {
	public ProcessOrder2UserLocalServiceClpInvoker() {
		_methodName0 = "addProcessOrder2User";

		_methodParameterTypes0 = new String[] {
				"org.oep.core.processmgt.model.ProcessOrder2User"
			};

		_methodName1 = "createProcessOrder2User";

		_methodParameterTypes1 = new String[] {
				"org.oep.core.processmgt.service.persistence.ProcessOrder2UserPK"
			};

		_methodName2 = "deleteProcessOrder2User";

		_methodParameterTypes2 = new String[] {
				"org.oep.core.processmgt.service.persistence.ProcessOrder2UserPK"
			};

		_methodName3 = "deleteProcessOrder2User";

		_methodParameterTypes3 = new String[] {
				"org.oep.core.processmgt.model.ProcessOrder2User"
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

		_methodName10 = "fetchProcessOrder2User";

		_methodParameterTypes10 = new String[] {
				"org.oep.core.processmgt.service.persistence.ProcessOrder2UserPK"
			};

		_methodName11 = "getProcessOrder2User";

		_methodParameterTypes11 = new String[] {
				"org.oep.core.processmgt.service.persistence.ProcessOrder2UserPK"
			};

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getProcessOrder2Users";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getProcessOrder2UsersCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateProcessOrder2User";

		_methodParameterTypes15 = new String[] {
				"org.oep.core.processmgt.model.ProcessOrder2User"
			};

		_methodName106 = "getBeanIdentifier";

		_methodParameterTypes106 = new String[] {  };

		_methodName107 = "setBeanIdentifier";

		_methodParameterTypes107 = new String[] { "java.lang.String" };

		_methodName112 = "addProcessOrder2User";

		_methodParameterTypes112 = new String[] {
				"long", "long", "com.liferay.portal.service.ServiceContext"
			};

		_methodName113 = "removeProcessOrder2User";

		_methodParameterTypes113 = new String[] {
				"org.oep.core.processmgt.model.ProcessOrder2User"
			};

		_methodName114 = "removeProcessOrder2User";

		_methodParameterTypes114 = new String[] { "long", "long" };

		_methodName115 = "getProcessOrder2User";

		_methodParameterTypes115 = new String[] { "long", "long" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return ProcessOrder2UserLocalServiceUtil.addProcessOrder2User((org.oep.core.processmgt.model.ProcessOrder2User)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return ProcessOrder2UserLocalServiceUtil.createProcessOrder2User((org.oep.core.processmgt.service.persistence.ProcessOrder2UserPK)arguments[0]);
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return ProcessOrder2UserLocalServiceUtil.deleteProcessOrder2User((org.oep.core.processmgt.service.persistence.ProcessOrder2UserPK)arguments[0]);
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return ProcessOrder2UserLocalServiceUtil.deleteProcessOrder2User((org.oep.core.processmgt.model.ProcessOrder2User)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return ProcessOrder2UserLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return ProcessOrder2UserLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return ProcessOrder2UserLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return ProcessOrder2UserLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return ProcessOrder2UserLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return ProcessOrder2UserLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return ProcessOrder2UserLocalServiceUtil.fetchProcessOrder2User((org.oep.core.processmgt.service.persistence.ProcessOrder2UserPK)arguments[0]);
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return ProcessOrder2UserLocalServiceUtil.getProcessOrder2User((org.oep.core.processmgt.service.persistence.ProcessOrder2UserPK)arguments[0]);
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return ProcessOrder2UserLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return ProcessOrder2UserLocalServiceUtil.getProcessOrder2Users(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return ProcessOrder2UserLocalServiceUtil.getProcessOrder2UsersCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return ProcessOrder2UserLocalServiceUtil.updateProcessOrder2User((org.oep.core.processmgt.model.ProcessOrder2User)arguments[0]);
		}

		if (_methodName106.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes106, parameterTypes)) {
			return ProcessOrder2UserLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName107.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes107, parameterTypes)) {
			ProcessOrder2UserLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName112.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes112, parameterTypes)) {
			return ProcessOrder2UserLocalServiceUtil.addProcessOrder2User(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(com.liferay.portal.service.ServiceContext)arguments[2]);
		}

		if (_methodName113.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes113, parameterTypes)) {
			ProcessOrder2UserLocalServiceUtil.removeProcessOrder2User((org.oep.core.processmgt.model.ProcessOrder2User)arguments[0]);

			return null;
		}

		if (_methodName114.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes114, parameterTypes)) {
			ProcessOrder2UserLocalServiceUtil.removeProcessOrder2User(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());

			return null;
		}

		if (_methodName115.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes115, parameterTypes)) {
			return ProcessOrder2UserLocalServiceUtil.getProcessOrder2User(((Long)arguments[0]).longValue(),
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
	private String _methodName106;
	private String[] _methodParameterTypes106;
	private String _methodName107;
	private String[] _methodParameterTypes107;
	private String _methodName112;
	private String[] _methodParameterTypes112;
	private String _methodName113;
	private String[] _methodParameterTypes113;
	private String _methodName114;
	private String[] _methodParameterTypes114;
	private String _methodName115;
	private String[] _methodParameterTypes115;
}