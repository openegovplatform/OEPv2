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

import org.oep.core.dossiermgt.service.DossierProcLocalServiceUtil;

import java.util.Arrays;

/**
 * @author trungdk
 * @generated
 */
public class DossierProcLocalServiceClpInvoker {
	public DossierProcLocalServiceClpInvoker() {
		_methodName0 = "addDossierProc";

		_methodParameterTypes0 = new String[] {
				"org.oep.core.dossiermgt.model.DossierProc"
			};

		_methodName1 = "createDossierProc";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteDossierProc";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteDossierProc";

		_methodParameterTypes3 = new String[] {
				"org.oep.core.dossiermgt.model.DossierProc"
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

		_methodName10 = "fetchDossierProc";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getDossierProc";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getDossierProcs";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getDossierProcsCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateDossierProc";

		_methodParameterTypes15 = new String[] {
				"org.oep.core.dossiermgt.model.DossierProc"
			};

		_methodName128 = "getBeanIdentifier";

		_methodParameterTypes128 = new String[] {  };

		_methodName129 = "setBeanIdentifier";

		_methodParameterTypes129 = new String[] { "java.lang.String" };

		_methodName134 = "addDossierProc";

		_methodParameterTypes134 = new String[] {
				"long", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.util.Date",
				"java.util.Date", "int",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName135 = "addDossierProc";

		_methodParameterTypes135 = new String[] {
				"long", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName136 = "updateDossierProc";

		_methodParameterTypes136 = new String[] {
				"long", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.util.Date",
				"java.util.Date", "int",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName137 = "updateDossierProc";

		_methodParameterTypes137 = new String[] {
				"org.oep.core.dossiermgt.model.DossierProc",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName139 = "removeDossierProc";

		_methodParameterTypes139 = new String[] {
				"org.oep.core.dossiermgt.model.DossierProc"
			};

		_methodName140 = "removeDossierProc";

		_methodParameterTypes140 = new String[] { "long" };

		_methodName141 = "deleteDossierProcs";

		_methodParameterTypes141 = new String[] { "long" };

		_methodName142 = "getDossierProc";

		_methodParameterTypes142 = new String[] { "long" };

		_methodName147 = "getByDossierProcNo";

		_methodParameterTypes147 = new String[] {
				"java.lang.String", "com.liferay.portal.service.ServiceContext"
			};

		_methodName148 = "findAllByAdministrationNo";

		_methodParameterTypes148 = new String[] {
				"java.lang.String", "com.liferay.portal.service.ServiceContext"
			};

		_methodName149 = "findAllByDomainNo";

		_methodParameterTypes149 = new String[] {
				"java.lang.String", "com.liferay.portal.service.ServiceContext"
			};

		_methodName150 = "findAllByAdministrationAndDomain";

		_methodParameterTypes150 = new String[] {
				"java.lang.String", "java.lang.String",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName151 = "findByGroupAdministrationAndDomain";

		_methodParameterTypes151 = new String[] {
				"java.lang.String", "java.lang.String",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName152 = "getCompanyDossierProcs";

		_methodParameterTypes152 = new String[] {
				"long", "com.liferay.portal.kernel.dao.orm.QueryDefinition"
			};

		_methodName153 = "getCompanyDossierProcsCount";

		_methodParameterTypes153 = new String[] {
				"long", "com.liferay.portal.kernel.dao.orm.QueryDefinition"
			};

		_methodName154 = "findByGroupLikeName";

		_methodParameterTypes154 = new String[] {
				"java.lang.String", "int", "int",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName155 = "countByGroupLikeName";

		_methodParameterTypes155 = new String[] {
				"java.lang.String", "com.liferay.portal.service.ServiceContext"
			};

		_methodName156 = "findByLikeName";

		_methodParameterTypes156 = new String[] {
				"java.lang.String", "int", "int",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName157 = "countByLikeName";

		_methodParameterTypes157 = new String[] {
				"java.lang.String", "com.liferay.portal.service.ServiceContext"
			};

		_methodName158 = "findByCustomCondition";

		_methodParameterTypes158 = new String[] {
				"java.lang.String", "java.util.Date", "java.util.Date", "int",
				"int", "int", "com.liferay.portal.service.ServiceContext"
			};

		_methodName159 = "countByCustomCondition";

		_methodParameterTypes159 = new String[] {
				"java.lang.String", "java.util.Date", "java.util.Date", "int",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName160 = "findByGroupCustomCondition";

		_methodParameterTypes160 = new String[] {
				"java.lang.String", "java.util.Date", "java.util.Date", "int",
				"int", "int", "com.liferay.portal.service.ServiceContext"
			};

		_methodName161 = "countByGroupCustomCondition";

		_methodParameterTypes161 = new String[] {
				"java.lang.String", "java.util.Date", "java.util.Date", "int",
				"com.liferay.portal.service.ServiceContext"
			};
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return DossierProcLocalServiceUtil.addDossierProc((org.oep.core.dossiermgt.model.DossierProc)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return DossierProcLocalServiceUtil.createDossierProc(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return DossierProcLocalServiceUtil.deleteDossierProc(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return DossierProcLocalServiceUtil.deleteDossierProc((org.oep.core.dossiermgt.model.DossierProc)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return DossierProcLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return DossierProcLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return DossierProcLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return DossierProcLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return DossierProcLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return DossierProcLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return DossierProcLocalServiceUtil.fetchDossierProc(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return DossierProcLocalServiceUtil.getDossierProc(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return DossierProcLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return DossierProcLocalServiceUtil.getDossierProcs(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return DossierProcLocalServiceUtil.getDossierProcsCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return DossierProcLocalServiceUtil.updateDossierProc((org.oep.core.dossiermgt.model.DossierProc)arguments[0]);
		}

		if (_methodName128.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes128, parameterTypes)) {
			return DossierProcLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName129.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes129, parameterTypes)) {
			DossierProcLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName134.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes134, parameterTypes)) {
			return DossierProcLocalServiceUtil.addDossierProc(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				(java.lang.String)arguments[3], (java.lang.String)arguments[4],
				(java.lang.String)arguments[5], (java.lang.String)arguments[6],
				(java.lang.String)arguments[7], (java.lang.String)arguments[8],
				(java.lang.String)arguments[9],
				(java.lang.String)arguments[10],
				(java.lang.String)arguments[11],
				(java.lang.String)arguments[12],
				(java.lang.String)arguments[13],
				(java.lang.String)arguments[14],
				(java.lang.String)arguments[15],
				(java.lang.String)arguments[16], (java.util.Date)arguments[17],
				(java.util.Date)arguments[18],
				((Integer)arguments[19]).intValue(),
				(com.liferay.portal.service.ServiceContext)arguments[20]);
		}

		if (_methodName135.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes135, parameterTypes)) {
			return DossierProcLocalServiceUtil.addDossierProc(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				(java.lang.String)arguments[3], (java.lang.String)arguments[4],
				(com.liferay.portal.service.ServiceContext)arguments[5]);
		}

		if (_methodName136.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes136, parameterTypes)) {
			return DossierProcLocalServiceUtil.updateDossierProc(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				(java.lang.String)arguments[3], (java.lang.String)arguments[4],
				(java.lang.String)arguments[5], (java.lang.String)arguments[6],
				(java.lang.String)arguments[7], (java.lang.String)arguments[8],
				(java.lang.String)arguments[9],
				(java.lang.String)arguments[10],
				(java.lang.String)arguments[11],
				(java.lang.String)arguments[12],
				(java.lang.String)arguments[13],
				(java.lang.String)arguments[14],
				(java.lang.String)arguments[15],
				(java.lang.String)arguments[16], (java.util.Date)arguments[17],
				(java.util.Date)arguments[18],
				((Integer)arguments[19]).intValue(),
				(com.liferay.portal.service.ServiceContext)arguments[20]);
		}

		if (_methodName137.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes137, parameterTypes)) {
			return DossierProcLocalServiceUtil.updateDossierProc((org.oep.core.dossiermgt.model.DossierProc)arguments[0],
				(com.liferay.portal.service.ServiceContext)arguments[1]);
		}

		if (_methodName139.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes139, parameterTypes)) {
			DossierProcLocalServiceUtil.removeDossierProc((org.oep.core.dossiermgt.model.DossierProc)arguments[0]);

			return null;
		}

		if (_methodName140.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes140, parameterTypes)) {
			DossierProcLocalServiceUtil.removeDossierProc(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName141.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes141, parameterTypes)) {
			DossierProcLocalServiceUtil.deleteDossierProcs(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName142.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes142, parameterTypes)) {
			return DossierProcLocalServiceUtil.getDossierProc(((Long)arguments[0]).longValue());
		}

		if (_methodName147.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes147, parameterTypes)) {
			return DossierProcLocalServiceUtil.getByDossierProcNo((java.lang.String)arguments[0],
				(com.liferay.portal.service.ServiceContext)arguments[1]);
		}

		if (_methodName148.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes148, parameterTypes)) {
			return DossierProcLocalServiceUtil.findAllByAdministrationNo((java.lang.String)arguments[0],
				(com.liferay.portal.service.ServiceContext)arguments[1]);
		}

		if (_methodName149.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes149, parameterTypes)) {
			return DossierProcLocalServiceUtil.findAllByDomainNo((java.lang.String)arguments[0],
				(com.liferay.portal.service.ServiceContext)arguments[1]);
		}

		if (_methodName150.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes150, parameterTypes)) {
			return DossierProcLocalServiceUtil.findAllByAdministrationAndDomain((java.lang.String)arguments[0],
				(java.lang.String)arguments[1],
				(com.liferay.portal.service.ServiceContext)arguments[2]);
		}

		if (_methodName151.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes151, parameterTypes)) {
			return DossierProcLocalServiceUtil.findByGroupAdministrationAndDomain((java.lang.String)arguments[0],
				(java.lang.String)arguments[1],
				(com.liferay.portal.service.ServiceContext)arguments[2]);
		}

		if (_methodName152.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes152, parameterTypes)) {
			return DossierProcLocalServiceUtil.getCompanyDossierProcs(((Long)arguments[0]).longValue(),
				(com.liferay.portal.kernel.dao.orm.QueryDefinition)arguments[1]);
		}

		if (_methodName153.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes153, parameterTypes)) {
			return DossierProcLocalServiceUtil.getCompanyDossierProcsCount(((Long)arguments[0]).longValue(),
				(com.liferay.portal.kernel.dao.orm.QueryDefinition)arguments[1]);
		}

		if (_methodName154.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes154, parameterTypes)) {
			return DossierProcLocalServiceUtil.findByGroupLikeName((java.lang.String)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.service.ServiceContext)arguments[3]);
		}

		if (_methodName155.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes155, parameterTypes)) {
			return DossierProcLocalServiceUtil.countByGroupLikeName((java.lang.String)arguments[0],
				(com.liferay.portal.service.ServiceContext)arguments[1]);
		}

		if (_methodName156.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes156, parameterTypes)) {
			return DossierProcLocalServiceUtil.findByLikeName((java.lang.String)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.service.ServiceContext)arguments[3]);
		}

		if (_methodName157.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes157, parameterTypes)) {
			return DossierProcLocalServiceUtil.countByLikeName((java.lang.String)arguments[0],
				(com.liferay.portal.service.ServiceContext)arguments[1]);
		}

		if (_methodName158.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes158, parameterTypes)) {
			return DossierProcLocalServiceUtil.findByCustomCondition((java.lang.String)arguments[0],
				(java.util.Date)arguments[1], (java.util.Date)arguments[2],
				((Integer)arguments[3]).intValue(),
				((Integer)arguments[4]).intValue(),
				((Integer)arguments[5]).intValue(),
				(com.liferay.portal.service.ServiceContext)arguments[6]);
		}

		if (_methodName159.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes159, parameterTypes)) {
			return DossierProcLocalServiceUtil.countByCustomCondition((java.lang.String)arguments[0],
				(java.util.Date)arguments[1], (java.util.Date)arguments[2],
				((Integer)arguments[3]).intValue(),
				(com.liferay.portal.service.ServiceContext)arguments[4]);
		}

		if (_methodName160.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes160, parameterTypes)) {
			return DossierProcLocalServiceUtil.findByGroupCustomCondition((java.lang.String)arguments[0],
				(java.util.Date)arguments[1], (java.util.Date)arguments[2],
				((Integer)arguments[3]).intValue(),
				((Integer)arguments[4]).intValue(),
				((Integer)arguments[5]).intValue(),
				(com.liferay.portal.service.ServiceContext)arguments[6]);
		}

		if (_methodName161.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes161, parameterTypes)) {
			return DossierProcLocalServiceUtil.countByGroupCustomCondition((java.lang.String)arguments[0],
				(java.util.Date)arguments[1], (java.util.Date)arguments[2],
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
	private String _methodName128;
	private String[] _methodParameterTypes128;
	private String _methodName129;
	private String[] _methodParameterTypes129;
	private String _methodName134;
	private String[] _methodParameterTypes134;
	private String _methodName135;
	private String[] _methodParameterTypes135;
	private String _methodName136;
	private String[] _methodParameterTypes136;
	private String _methodName137;
	private String[] _methodParameterTypes137;
	private String _methodName139;
	private String[] _methodParameterTypes139;
	private String _methodName140;
	private String[] _methodParameterTypes140;
	private String _methodName141;
	private String[] _methodParameterTypes141;
	private String _methodName142;
	private String[] _methodParameterTypes142;
	private String _methodName147;
	private String[] _methodParameterTypes147;
	private String _methodName148;
	private String[] _methodParameterTypes148;
	private String _methodName149;
	private String[] _methodParameterTypes149;
	private String _methodName150;
	private String[] _methodParameterTypes150;
	private String _methodName151;
	private String[] _methodParameterTypes151;
	private String _methodName152;
	private String[] _methodParameterTypes152;
	private String _methodName153;
	private String[] _methodParameterTypes153;
	private String _methodName154;
	private String[] _methodParameterTypes154;
	private String _methodName155;
	private String[] _methodParameterTypes155;
	private String _methodName156;
	private String[] _methodParameterTypes156;
	private String _methodName157;
	private String[] _methodParameterTypes157;
	private String _methodName158;
	private String[] _methodParameterTypes158;
	private String _methodName159;
	private String[] _methodParameterTypes159;
	private String _methodName160;
	private String[] _methodParameterTypes160;
	private String _methodName161;
	private String[] _methodParameterTypes161;
}