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

import org.oep.core.dossiermgt.service.DossierDocLocalServiceUtil;

import java.util.Arrays;

/**
 * @author trungdk
 * @generated
 */
public class DossierDocLocalServiceClpInvoker {
	public DossierDocLocalServiceClpInvoker() {
		_methodName0 = "addDossierDoc";

		_methodParameterTypes0 = new String[] {
				"org.oep.core.dossiermgt.model.DossierDoc"
			};

		_methodName1 = "createDossierDoc";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteDossierDoc";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteDossierDoc";

		_methodParameterTypes3 = new String[] {
				"org.oep.core.dossiermgt.model.DossierDoc"
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

		_methodName10 = "fetchDossierDoc";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getDossierDoc";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getDossierDocs";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getDossierDocsCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateDossierDoc";

		_methodParameterTypes15 = new String[] {
				"org.oep.core.dossiermgt.model.DossierDoc"
			};

		_methodName16 = "addDocTemplateDossierDoc";

		_methodParameterTypes16 = new String[] { "long", "long" };

		_methodName17 = "addDocTemplateDossierDoc";

		_methodParameterTypes17 = new String[] {
				"long", "org.oep.core.dossiermgt.model.DossierDoc"
			};

		_methodName18 = "addDocTemplateDossierDocs";

		_methodParameterTypes18 = new String[] { "long", "long[][]" };

		_methodName19 = "addDocTemplateDossierDocs";

		_methodParameterTypes19 = new String[] { "long", "java.util.List" };

		_methodName20 = "clearDocTemplateDossierDocs";

		_methodParameterTypes20 = new String[] { "long" };

		_methodName21 = "deleteDocTemplateDossierDoc";

		_methodParameterTypes21 = new String[] { "long", "long" };

		_methodName22 = "deleteDocTemplateDossierDoc";

		_methodParameterTypes22 = new String[] {
				"long", "org.oep.core.dossiermgt.model.DossierDoc"
			};

		_methodName23 = "deleteDocTemplateDossierDocs";

		_methodParameterTypes23 = new String[] { "long", "long[][]" };

		_methodName24 = "deleteDocTemplateDossierDocs";

		_methodParameterTypes24 = new String[] { "long", "java.util.List" };

		_methodName25 = "getDocTemplateDossierDocs";

		_methodParameterTypes25 = new String[] { "long" };

		_methodName26 = "getDocTemplateDossierDocs";

		_methodParameterTypes26 = new String[] { "long", "int", "int" };

		_methodName27 = "getDocTemplateDossierDocs";

		_methodParameterTypes27 = new String[] {
				"long", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName28 = "getDocTemplateDossierDocsCount";

		_methodParameterTypes28 = new String[] { "long" };

		_methodName29 = "hasDocTemplateDossierDoc";

		_methodParameterTypes29 = new String[] { "long", "long" };

		_methodName30 = "hasDocTemplateDossierDocs";

		_methodParameterTypes30 = new String[] { "long" };

		_methodName31 = "setDocTemplateDossierDocs";

		_methodParameterTypes31 = new String[] { "long", "long[][]" };

		_methodName152 = "getBeanIdentifier";

		_methodParameterTypes152 = new String[] {  };

		_methodName153 = "setBeanIdentifier";

		_methodParameterTypes153 = new String[] { "java.lang.String" };

		_methodName158 = "addDossierDoc";

		_methodParameterTypes158 = new String[] {
				"long", "java.lang.String", "java.lang.String",
				"java.lang.String", "int", "long", "int", "int",
				"java.lang.String", "com.liferay.portal.service.ServiceContext"
			};

		_methodName159 = "updateDossierDoc";

		_methodParameterTypes159 = new String[] {
				"long", "long", "java.lang.String", "java.lang.String",
				"java.lang.String", "int", "long", "int", "int",
				"java.lang.String", "com.liferay.portal.service.ServiceContext"
			};

		_methodName160 = "updateDossierDocResources";

		_methodParameterTypes160 = new String[] {
				"org.oep.core.dossiermgt.model.DossierDoc",
				"java.lang.String[][]", "java.lang.String[][]",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName161 = "removeDossierDoc";

		_methodParameterTypes161 = new String[] {
				"org.oep.core.dossiermgt.model.DossierDoc"
			};

		_methodName162 = "removeDossierDoc";

		_methodParameterTypes162 = new String[] { "long" };

		_methodName163 = "getDossierDoc";

		_methodParameterTypes163 = new String[] { "long" };

		_methodName164 = "addDossierDocResources";

		_methodParameterTypes164 = new String[] {
				"org.oep.core.dossiermgt.model.DossierDoc", "boolean", "boolean",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName165 = "addDossierDocResources";

		_methodParameterTypes165 = new String[] {
				"org.oep.core.dossiermgt.model.DossierDoc",
				"java.lang.String[][]", "java.lang.String[][]",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName166 = "addDossierDocResources";

		_methodParameterTypes166 = new String[] {
				"long", "java.lang.String[][]", "java.lang.String[][]",
				"com.liferay.portal.service.ServiceContext"
			};
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return DossierDocLocalServiceUtil.addDossierDoc((org.oep.core.dossiermgt.model.DossierDoc)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return DossierDocLocalServiceUtil.createDossierDoc(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return DossierDocLocalServiceUtil.deleteDossierDoc(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return DossierDocLocalServiceUtil.deleteDossierDoc((org.oep.core.dossiermgt.model.DossierDoc)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return DossierDocLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return DossierDocLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return DossierDocLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return DossierDocLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return DossierDocLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return DossierDocLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return DossierDocLocalServiceUtil.fetchDossierDoc(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return DossierDocLocalServiceUtil.getDossierDoc(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return DossierDocLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return DossierDocLocalServiceUtil.getDossierDocs(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return DossierDocLocalServiceUtil.getDossierDocsCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return DossierDocLocalServiceUtil.updateDossierDoc((org.oep.core.dossiermgt.model.DossierDoc)arguments[0]);
		}

		if (_methodName16.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes16, parameterTypes)) {
			DossierDocLocalServiceUtil.addDocTemplateDossierDoc(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());

			return null;
		}

		if (_methodName17.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes17, parameterTypes)) {
			DossierDocLocalServiceUtil.addDocTemplateDossierDoc(((Long)arguments[0]).longValue(),
				(org.oep.core.dossiermgt.model.DossierDoc)arguments[1]);

			return null;
		}

		if (_methodName18.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes18, parameterTypes)) {
			DossierDocLocalServiceUtil.addDocTemplateDossierDocs(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName19.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes19, parameterTypes)) {
			DossierDocLocalServiceUtil.addDocTemplateDossierDocs(((Long)arguments[0]).longValue(),
				(java.util.List<org.oep.core.dossiermgt.model.DossierDoc>)arguments[1]);

			return null;
		}

		if (_methodName20.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes20, parameterTypes)) {
			DossierDocLocalServiceUtil.clearDocTemplateDossierDocs(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName21.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes21, parameterTypes)) {
			DossierDocLocalServiceUtil.deleteDocTemplateDossierDoc(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());

			return null;
		}

		if (_methodName22.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes22, parameterTypes)) {
			DossierDocLocalServiceUtil.deleteDocTemplateDossierDoc(((Long)arguments[0]).longValue(),
				(org.oep.core.dossiermgt.model.DossierDoc)arguments[1]);

			return null;
		}

		if (_methodName23.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes23, parameterTypes)) {
			DossierDocLocalServiceUtil.deleteDocTemplateDossierDocs(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName24.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes24, parameterTypes)) {
			DossierDocLocalServiceUtil.deleteDocTemplateDossierDocs(((Long)arguments[0]).longValue(),
				(java.util.List<org.oep.core.dossiermgt.model.DossierDoc>)arguments[1]);

			return null;
		}

		if (_methodName25.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes25, parameterTypes)) {
			return DossierDocLocalServiceUtil.getDocTemplateDossierDocs(((Long)arguments[0]).longValue());
		}

		if (_methodName26.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes26, parameterTypes)) {
			return DossierDocLocalServiceUtil.getDocTemplateDossierDocs(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName27.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes27, parameterTypes)) {
			return DossierDocLocalServiceUtil.getDocTemplateDossierDocs(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName28.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes28, parameterTypes)) {
			return DossierDocLocalServiceUtil.getDocTemplateDossierDocsCount(((Long)arguments[0]).longValue());
		}

		if (_methodName29.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes29, parameterTypes)) {
			return DossierDocLocalServiceUtil.hasDocTemplateDossierDoc(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName30.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes30, parameterTypes)) {
			return DossierDocLocalServiceUtil.hasDocTemplateDossierDocs(((Long)arguments[0]).longValue());
		}

		if (_methodName31.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes31, parameterTypes)) {
			DossierDocLocalServiceUtil.setDocTemplateDossierDocs(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName152.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes152, parameterTypes)) {
			return DossierDocLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName153.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes153, parameterTypes)) {
			DossierDocLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName158.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes158, parameterTypes)) {
			return DossierDocLocalServiceUtil.addDossierDoc(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				(java.lang.String)arguments[3],
				((Integer)arguments[4]).intValue(),
				((Long)arguments[5]).longValue(),
				((Integer)arguments[6]).intValue(),
				((Integer)arguments[7]).intValue(),
				(java.lang.String)arguments[8],
				(com.liferay.portal.service.ServiceContext)arguments[9]);
		}

		if (_methodName159.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes159, parameterTypes)) {
			return DossierDocLocalServiceUtil.updateDossierDoc(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2], (java.lang.String)arguments[3],
				(java.lang.String)arguments[4],
				((Integer)arguments[5]).intValue(),
				((Long)arguments[6]).longValue(),
				((Integer)arguments[7]).intValue(),
				((Integer)arguments[8]).intValue(),
				(java.lang.String)arguments[9],
				(com.liferay.portal.service.ServiceContext)arguments[10]);
		}

		if (_methodName160.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes160, parameterTypes)) {
			DossierDocLocalServiceUtil.updateDossierDocResources((org.oep.core.dossiermgt.model.DossierDoc)arguments[0],
				(java.lang.String[])arguments[1],
				(java.lang.String[])arguments[2],
				(com.liferay.portal.service.ServiceContext)arguments[3]);

			return null;
		}

		if (_methodName161.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes161, parameterTypes)) {
			DossierDocLocalServiceUtil.removeDossierDoc((org.oep.core.dossiermgt.model.DossierDoc)arguments[0]);

			return null;
		}

		if (_methodName162.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes162, parameterTypes)) {
			DossierDocLocalServiceUtil.removeDossierDoc(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName163.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes163, parameterTypes)) {
			return DossierDocLocalServiceUtil.getDossierDoc(((Long)arguments[0]).longValue());
		}

		if (_methodName164.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes164, parameterTypes)) {
			DossierDocLocalServiceUtil.addDossierDocResources((org.oep.core.dossiermgt.model.DossierDoc)arguments[0],
				((Boolean)arguments[1]).booleanValue(),
				((Boolean)arguments[2]).booleanValue(),
				(com.liferay.portal.service.ServiceContext)arguments[3]);

			return null;
		}

		if (_methodName165.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes165, parameterTypes)) {
			DossierDocLocalServiceUtil.addDossierDocResources((org.oep.core.dossiermgt.model.DossierDoc)arguments[0],
				(java.lang.String[])arguments[1],
				(java.lang.String[])arguments[2],
				(com.liferay.portal.service.ServiceContext)arguments[3]);

			return null;
		}

		if (_methodName166.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes166, parameterTypes)) {
			DossierDocLocalServiceUtil.addDossierDocResources(((Long)arguments[0]).longValue(),
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
	private String _methodName161;
	private String[] _methodParameterTypes161;
	private String _methodName162;
	private String[] _methodParameterTypes162;
	private String _methodName163;
	private String[] _methodParameterTypes163;
	private String _methodName164;
	private String[] _methodParameterTypes164;
	private String _methodName165;
	private String[] _methodParameterTypes165;
	private String _methodName166;
	private String[] _methodParameterTypes166;
}