package org.oep.core.utilities.dossiermgt;

public class DossierProcAgentKeys {
	public class SearchAttributes extends BaseDossierProcAgentAttributes {
		public static final String GOV_AGENCY_ID = "searchGovAgencyId";
	}
	
	public class AddEditAttributes extends BaseDossierProcAgentAttributes {
	}
	
	public class BaseDossierProcAgentAttributes {
		public static final String DELETE_ID = "deleteId";
		public static final String EDIT_ID = "editId";
	}
	
	public class ErrorMessageKeys {
	}
	
	public class SuccessMessageKeys {
		public static final String ORG_OEP_CORE_UTILITIES_DOSSIERMGT_PORTLET_DOSSIERPROCAGENT_SUCCESS_UPDATE = "org.oep.core.utilities.dossiermgt.portlet.dossierproc.success.update";
		public static final String ORG_OEP_CORE_UTILITIES_DOSSIERMGT_PORTLET_DOSSIERPROCAGENT_SUCCESS_ADDNEW = "org.oep.core.utilities.dossiermgt.portlet.dossierproc.success.addnew";
		public static final String ORG_OEP_CORE_UTILITIES_DOSSIERMGT_PORTLET_DOSSIERPROCAGENT_SUCCESS_DELETE = "org.oep.core.utilities.dossiermgt.portlet.dossierproc.success.delete";
	}

}
