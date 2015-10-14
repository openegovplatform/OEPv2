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

import org.oep.core.dossiermgt.service.DocTemplateLocalServiceUtil;

import java.util.Arrays;

/**
 * @author trungdk
 * @generated
 */
public class DocTemplateLocalServiceClpInvoker {
	public DocTemplateLocalServiceClpInvoker() {
		_methodName0 = "addDocTemplate";

		_methodParameterTypes0 = new String[] {
				"org.oep.core.dossiermgt.model.DocTemplate"
			};

		_methodName1 = "createDocTemplate";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteDocTemplate";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteDocTemplate";

		_methodParameterTypes3 = new String[] {
				"org.oep.core.dossiermgt.model.DocTemplate"
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

		_methodName10 = "fetchDocTemplate";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getDocTemplate";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getDocTemplates";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getDocTemplatesCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateDocTemplate";

		_methodParameterTypes15 = new String[] {
				"org.oep.core.dossiermgt.model.DocTemplate"
			};

		_methodName16 = "addDossierDocDocTemplate";

		_methodParameterTypes16 = new String[] { "long", "long" };

		_methodName17 = "addDossierDocDocTemplate";

		_methodParameterTypes17 = new String[] {
				"long", "org.oep.core.dossiermgt.model.DocTemplate"
			};

		_methodName18 = "addDossierDocDocTemplates";

		_methodParameterTypes18 = new String[] { "long", "long[][]" };

		_methodName19 = "addDossierDocDocTemplates";

		_methodParameterTypes19 = new String[] { "long", "java.util.List" };

		_methodName20 = "clearDossierDocDocTemplates";

		_methodParameterTypes20 = new String[] { "long" };

		_methodName21 = "deleteDossierDocDocTemplate";

		_methodParameterTypes21 = new String[] { "long", "long" };

		_methodName22 = "deleteDossierDocDocTemplate";

		_methodParameterTypes22 = new String[] {
				"long", "org.oep.core.dossiermgt.model.DocTemplate"
			};

		_methodName23 = "deleteDossierDocDocTemplates";

		_methodParameterTypes23 = new String[] { "long", "long[][]" };

		_methodName24 = "deleteDossierDocDocTemplates";

		_methodParameterTypes24 = new String[] { "long", "java.util.List" };

		_methodName25 = "getDossierDocDocTemplates";

		_methodParameterTypes25 = new String[] { "long" };

		_methodName26 = "getDossierDocDocTemplates";

		_methodParameterTypes26 = new String[] { "long", "int", "int" };

		_methodName27 = "getDossierDocDocTemplates";

		_methodParameterTypes27 = new String[] {
				"long", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName28 = "getDossierDocDocTemplatesCount";

		_methodParameterTypes28 = new String[] { "long" };

		_methodName29 = "hasDossierDocDocTemplate";

		_methodParameterTypes29 = new String[] { "long", "long" };

		_methodName30 = "hasDossierDocDocTemplates";

		_methodParameterTypes30 = new String[] { "long" };

		_methodName31 = "setDossierDocDocTemplates";

		_methodParameterTypes31 = new String[] { "long", "long[][]" };

		_methodName158 = "getBeanIdentifier";

		_methodParameterTypes158 = new String[] {  };

		_methodName159 = "setBeanIdentifier";

		_methodParameterTypes159 = new String[] { "java.lang.String" };

		_methodName164 = "addDocTemplate";

		_methodParameterTypes164 = new String[] {
				"java.lang.String", "java.lang.String", "java.lang.String",
				"long", "com.liferay.portal.service.ServiceContext"
			};

		_methodName165 = "updateDocTemplate";

		_methodParameterTypes165 = new String[] {
				"long", "java.lang.String", "java.lang.String",
				"java.lang.String", "long",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName166 = "updateDocTemplateResources";

		_methodParameterTypes166 = new String[] {
				"org.oep.core.dossiermgt.model.DocTemplate",
				"java.lang.String[][]", "java.lang.String[][]",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName167 = "removeDocTemplate";

		_methodParameterTypes167 = new String[] {
				"org.oep.core.dossiermgt.model.DocTemplate"
			};

		_methodName168 = "removeDocTemplate";

		_methodParameterTypes168 = new String[] { "long" };

		_methodName169 = "getDocTemplate";

		_methodParameterTypes169 = new String[] { "long" };

		_methodName170 = "addDocTemplateResources";

		_methodParameterTypes170 = new String[] {
				"org.oep.core.dossiermgt.model.DocTemplate", "boolean",
				"boolean", "com.liferay.portal.service.ServiceContext"
			};

		_methodName171 = "addDocTemplateResources";

		_methodParameterTypes171 = new String[] {
				"org.oep.core.dossiermgt.model.DocTemplate",
				"java.lang.String[][]", "java.lang.String[][]",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName172 = "addDocTemplateResources";

		_methodParameterTypes172 = new String[] {
				"long", "java.lang.String[][]", "java.lang.String[][]",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName174 = "findByLikeTitle";

		_methodParameterTypes174 = new String[] {
				"java.lang.String", "int", "int",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName175 = "countByLikeTitle";

		_methodParameterTypes175 = new String[] {
				"java.lang.String", "com.liferay.portal.service.ServiceContext"
			};

		_methodName176 = "findByGroupLikeTitle";

		_methodParameterTypes176 = new String[] {
				"java.lang.String", "int", "int",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName177 = "countByGroupLikeTitle";

		_methodParameterTypes177 = new String[] {
				"java.lang.String", "com.liferay.portal.service.ServiceContext"
			};
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return DocTemplateLocalServiceUtil.addDocTemplate((org.oep.core.dossiermgt.model.DocTemplate)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return DocTemplateLocalServiceUtil.createDocTemplate(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return DocTemplateLocalServiceUtil.deleteDocTemplate(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return DocTemplateLocalServiceUtil.deleteDocTemplate((org.oep.core.dossiermgt.model.DocTemplate)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return DocTemplateLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return DocTemplateLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return DocTemplateLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return DocTemplateLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return DocTemplateLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return DocTemplateLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return DocTemplateLocalServiceUtil.fetchDocTemplate(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return DocTemplateLocalServiceUtil.getDocTemplate(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return DocTemplateLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return DocTemplateLocalServiceUtil.getDocTemplates(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return DocTemplateLocalServiceUtil.getDocTemplatesCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return DocTemplateLocalServiceUtil.updateDocTemplate((org.oep.core.dossiermgt.model.DocTemplate)arguments[0]);
		}

		if (_methodName16.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes16, parameterTypes)) {
			DocTemplateLocalServiceUtil.addDossierDocDocTemplate(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());

			return null;
		}

		if (_methodName17.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes17, parameterTypes)) {
			DocTemplateLocalServiceUtil.addDossierDocDocTemplate(((Long)arguments[0]).longValue(),
				(org.oep.core.dossiermgt.model.DocTemplate)arguments[1]);

			return null;
		}

		if (_methodName18.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes18, parameterTypes)) {
			DocTemplateLocalServiceUtil.addDossierDocDocTemplates(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName19.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes19, parameterTypes)) {
			DocTemplateLocalServiceUtil.addDossierDocDocTemplates(((Long)arguments[0]).longValue(),
				(java.util.List<org.oep.core.dossiermgt.model.DocTemplate>)arguments[1]);

			return null;
		}

		if (_methodName20.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes20, parameterTypes)) {
			DocTemplateLocalServiceUtil.clearDossierDocDocTemplates(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName21.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes21, parameterTypes)) {
			DocTemplateLocalServiceUtil.deleteDossierDocDocTemplate(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());

			return null;
		}

		if (_methodName22.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes22, parameterTypes)) {
			DocTemplateLocalServiceUtil.deleteDossierDocDocTemplate(((Long)arguments[0]).longValue(),
				(org.oep.core.dossiermgt.model.DocTemplate)arguments[1]);

			return null;
		}

		if (_methodName23.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes23, parameterTypes)) {
			DocTemplateLocalServiceUtil.deleteDossierDocDocTemplates(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName24.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes24, parameterTypes)) {
			DocTemplateLocalServiceUtil.deleteDossierDocDocTemplates(((Long)arguments[0]).longValue(),
				(java.util.List<org.oep.core.dossiermgt.model.DocTemplate>)arguments[1]);

			return null;
		}

		if (_methodName25.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes25, parameterTypes)) {
			return DocTemplateLocalServiceUtil.getDossierDocDocTemplates(((Long)arguments[0]).longValue());
		}

		if (_methodName26.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes26, parameterTypes)) {
			return DocTemplateLocalServiceUtil.getDossierDocDocTemplates(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName27.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes27, parameterTypes)) {
			return DocTemplateLocalServiceUtil.getDossierDocDocTemplates(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName28.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes28, parameterTypes)) {
			return DocTemplateLocalServiceUtil.getDossierDocDocTemplatesCount(((Long)arguments[0]).longValue());
		}

		if (_methodName29.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes29, parameterTypes)) {
			return DocTemplateLocalServiceUtil.hasDossierDocDocTemplate(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName30.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes30, parameterTypes)) {
			return DocTemplateLocalServiceUtil.hasDossierDocDocTemplates(((Long)arguments[0]).longValue());
		}

		if (_methodName31.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes31, parameterTypes)) {
			DocTemplateLocalServiceUtil.setDossierDocDocTemplates(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

		if (_methodName158.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes158, parameterTypes)) {
			return DocTemplateLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName159.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes159, parameterTypes)) {
			DocTemplateLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName164.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes164, parameterTypes)) {
			return DocTemplateLocalServiceUtil.addDocTemplate((java.lang.String)arguments[0],
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				((Long)arguments[3]).longValue(),
				(com.liferay.portal.service.ServiceContext)arguments[4]);
		}

		if (_methodName165.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes165, parameterTypes)) {
			return DocTemplateLocalServiceUtil.updateDocTemplate(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				(java.lang.String)arguments[3],
				((Long)arguments[4]).longValue(),
				(com.liferay.portal.service.ServiceContext)arguments[5]);
		}

		if (_methodName166.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes166, parameterTypes)) {
			DocTemplateLocalServiceUtil.updateDocTemplateResources((org.oep.core.dossiermgt.model.DocTemplate)arguments[0],
				(java.lang.String[])arguments[1],
				(java.lang.String[])arguments[2],
				(com.liferay.portal.service.ServiceContext)arguments[3]);

			return null;
		}

		if (_methodName167.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes167, parameterTypes)) {
			DocTemplateLocalServiceUtil.removeDocTemplate((org.oep.core.dossiermgt.model.DocTemplate)arguments[0]);

			return null;
		}

		if (_methodName168.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes168, parameterTypes)) {
			DocTemplateLocalServiceUtil.removeDocTemplate(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName169.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes169, parameterTypes)) {
			return DocTemplateLocalServiceUtil.getDocTemplate(((Long)arguments[0]).longValue());
		}

		if (_methodName170.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes170, parameterTypes)) {
			DocTemplateLocalServiceUtil.addDocTemplateResources((org.oep.core.dossiermgt.model.DocTemplate)arguments[0],
				((Boolean)arguments[1]).booleanValue(),
				((Boolean)arguments[2]).booleanValue(),
				(com.liferay.portal.service.ServiceContext)arguments[3]);

			return null;
		}

		if (_methodName171.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes171, parameterTypes)) {
			DocTemplateLocalServiceUtil.addDocTemplateResources((org.oep.core.dossiermgt.model.DocTemplate)arguments[0],
				(java.lang.String[])arguments[1],
				(java.lang.String[])arguments[2],
				(com.liferay.portal.service.ServiceContext)arguments[3]);

			return null;
		}

		if (_methodName172.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes172, parameterTypes)) {
			DocTemplateLocalServiceUtil.addDocTemplateResources(((Long)arguments[0]).longValue(),
				(java.lang.String[])arguments[1],
				(java.lang.String[])arguments[2],
				(com.liferay.portal.service.ServiceContext)arguments[3]);

			return null;
		}

		if (_methodName174.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes174, parameterTypes)) {
			return DocTemplateLocalServiceUtil.findByLikeTitle((java.lang.String)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.service.ServiceContext)arguments[3]);
		}

		if (_methodName175.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes175, parameterTypes)) {
			return DocTemplateLocalServiceUtil.countByLikeTitle((java.lang.String)arguments[0],
				(com.liferay.portal.service.ServiceContext)arguments[1]);
		}

		if (_methodName176.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes176, parameterTypes)) {
			return DocTemplateLocalServiceUtil.findByGroupLikeTitle((java.lang.String)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.service.ServiceContext)arguments[3]);
		}

		if (_methodName177.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes177, parameterTypes)) {
			return DocTemplateLocalServiceUtil.countByGroupLikeTitle((java.lang.String)arguments[0],
				(com.liferay.portal.service.ServiceContext)arguments[1]);
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
	private String _methodName158;
	private String[] _methodParameterTypes158;
	private String _methodName159;
	private String[] _methodParameterTypes159;
	private String _methodName164;
	private String[] _methodParameterTypes164;
	private String _methodName165;
	private String[] _methodParameterTypes165;
	private String _methodName166;
	private String[] _methodParameterTypes166;
	private String _methodName167;
	private String[] _methodParameterTypes167;
	private String _methodName168;
	private String[] _methodParameterTypes168;
	private String _methodName169;
	private String[] _methodParameterTypes169;
	private String _methodName170;
	private String[] _methodParameterTypes170;
	private String _methodName171;
	private String[] _methodParameterTypes171;
	private String _methodName172;
	private String[] _methodParameterTypes172;
	private String _methodName174;
	private String[] _methodParameterTypes174;
	private String _methodName175;
	private String[] _methodParameterTypes175;
	private String _methodName176;
	private String[] _methodParameterTypes176;
	private String _methodName177;
	private String[] _methodParameterTypes177;
}