package org.oep.core.utilities.dossiermgt;

public class DossierProcKeys {
	public class SearchAttributes extends BaseDossierProcAttributes {
		public static final String NAME = "searchName";
		public static final String EFFECTDATE = "searchEffectDate";
		public static final String EXPIREDATE = "searchExpireDate";
		public static final String ACTIVE = "searchActive";
	}
	
	public class AddEditAttributes extends BaseDossierProcAttributes {
		public static final String DOSSIER_PROC_NO = "editDossierProcNo";
		public static final String NAME = "editName";
		public static final String EN_NAME = "editEnName";
		public static final String SHORT_NAME = "editShortName";
		public static final String PROCESS_DESCRIPTION = "editProcessDescription";
		public static final String METHOD_DESCRIPTION = "editMethodDescription";
		public static final String DOSSIER_DESCRIPTION = "editDossierDescription";
		public static final String CONDITION_DESCRIPTION = "editConditionDescription";
		public static final String DURATION_DESCRIPTION = "editDurationDescription";
		public static final String ACTORS_DESCRIPTION = "editActorsDescription";		
		public static final String RESULTS_DESCRIPTION = "editResultsDescription";
		public static final String RECORDS_DESCRIPTION = "editRecordsDescription";
		public static final String FEE_DESCRIPTION = "editFeeDescription";
		public static final String INSTRUCTIONS_DESCRIPTION = "editInstructionsDescription";
		public static final String ADMINISTRATION_NO = "editAdministrationNo";
		public static final String ADMINISTRATION_NAME = "editAdministrationName";
		public static final String DOMAIN_NO = "editDomainNo";
		public static final String DOMAIN_NAME = "editDomainName";
		public static final String EFFECT_DATE = "editEffectDate";
		public static final String EXPIRE_DATE = "editExpireDate";
		public static final String ACTIVE = "editActive";
	}
	
	public class BaseDossierProcAttributes {
		public static final String DELETE_ID = "deleteId";
		public static final String EDIT_ID = "editId";
	}
	
	public class ErrorMessageKeys {
	}
	
	public class SuccessMessageKeys {
		public static final String ORG_OEP_CORE_UTILITIES_DOSSIERMGT_PORTLET_DOSSIERPROC_SUCCESS_UPDATE = "org.oep.core.utilities.dossiermgt.portlet.dossierproc.success.update";
		public static final String ORG_OEP_CORE_UTILITIES_DOSSIERMGT_PORTLET_DOSSIERPROC_SUCCESS_ADDNEW = "org.oep.core.utilities.dossiermgt.portlet.dossierproc.success.addnew";
		public static final String ORG_OEP_CORE_UTILITIES_DOSSIERMGT_PORTLET_DOSSIERPROC_SUCCESS_DELETE = "org.oep.core.utilities.dossiermgt.portlet.dossierproc.success.delete";
	}
}
