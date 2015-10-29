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

		_methodName168 = "getBeanIdentifier";

		_methodParameterTypes168 = new String[] {  };

		_methodName169 = "setBeanIdentifier";

		_methodParameterTypes169 = new String[] { "java.lang.String" };

		_methodName174 = "addDossierDoc";

		_methodParameterTypes174 = new String[] {
				"long", "java.lang.String", "java.lang.String",
				"java.lang.String", "int", "long", "int", "int",
				"java.lang.String", "com.liferay.portal.service.ServiceContext"
			};

		_methodName175 = "updateDossierDoc";

		_methodParameterTypes175 = new String[] {
				"long", "long", "java.lang.String", "java.lang.String",
				"java.lang.String", "int", "long", "int", "int",
				"java.lang.String", "com.liferay.portal.service.ServiceContext"
			};

		_methodName176 = "updateDossierDocResources";

		_methodParameterTypes176 = new String[] {
				"org.oep.core.dossiermgt.model.DossierDoc",
				"java.lang.String[][]", "java.lang.String[][]",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName177 = "removeDossierDoc";

		_methodParameterTypes177 = new String[] {
				"org.oep.core.dossiermgt.model.DossierDoc"
			};

		_methodName178 = "removeDossierDoc";

		_methodParameterTypes178 = new String[] { "long" };

		_methodName179 = "getDossierDoc";

		_methodParameterTypes179 = new String[] { "long" };

		_methodName180 = "addDossierDocResources";

		_methodParameterTypes180 = new String[] {
				"org.oep.core.dossiermgt.model.DossierDoc", "boolean", "boolean",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName181 = "addDossierDocResources";

		_methodParameterTypes181 = new String[] {
				"org.oep.core.dossiermgt.model.DossierDoc",
				"java.lang.String[][]", "java.lang.String[][]",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName182 = "addDossierDocResources";

		_methodParameterTypes182 = new String[] {
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

		if (_methodName168.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes168, parameterTypes)) {
			return DossierDocLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName169.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes169, parameterTypes)) {
			DossierDocLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName174.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes174, parameterTypes)) {
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

		if (_methodName175.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes175, parameterTypes)) {
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

		if (_methodName176.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes176, parameterTypes)) {
			DossierDocLocalServiceUtil.updateDossierDocResources((org.oep.core.dossiermgt.model.DossierDoc)arguments[0],
				(java.lang.String[])arguments[1],
				(java.lang.String[])arguments[2],
				(com.liferay.portal.service.ServiceContext)arguments[3]);

			return null;
		}

		if (_methodName177.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes177, parameterTypes)) {
			DossierDocLocalServiceUtil.removeDossierDoc((org.oep.core.dossiermgt.model.DossierDoc)arguments[0]);

			return null;
		}

		if (_methodName178.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes178, parameterTypes)) {
			DossierDocLocalServiceUtil.removeDossierDoc(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName179.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes179, parameterTypes)) {
			return DossierDocLocalServiceUtil.getDossierDoc(((Long)arguments[0]).longValue());
		}

		if (_methodName180.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes180, parameterTypes)) {
			DossierDocLocalServiceUtil.addDossierDocResources((org.oep.core.dossiermgt.model.DossierDoc)arguments[0],
				((Boolean)arguments[1]).booleanValue(),
				((Boolean)arguments[2]).booleanValue(),
				(com.liferay.portal.service.ServiceContext)arguments[3]);

			return null;
		}

		if (_methodName181.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes181, parameterTypes)) {
			DossierDocLocalServiceUtil.addDossierDocResources((org.oep.core.dossiermgt.model.DossierDoc)arguments[0],
				(java.lang.String[])arguments[1],
				(java.lang.String[])arguments[2],
				(com.liferay.portal.service.ServiceContext)arguments[3]);

			return null;
		}

		if (_methodName182.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes182, parameterTypes)) {
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
	private String _methodName168;
	private String[] _methodParameterTypes168;
	private String _methodName169;
	private String[] _methodParameterTypes169;
	private String _methodName174;
	private String[] _methodParameterTypes174;
	private String _methodName175;
	private String[] _methodParameterTypes175;
	private String _methodName176;
	private String[] _methodParameterTypes176;
	private String _methodName177;
	private String[] _methodParameterTypes177;
	private String _methodName178;
	private String[] _methodParameterTypes178;
	private String _methodName179;
	private String[] _methodParameterTypes179;
	private String _methodName180;
	private String[] _methodParameterTypes180;
	private String _methodName181;
	private String[] _methodParameterTypes181;
	private String _methodName182;
	private String[] _methodParameterTypes182;
}