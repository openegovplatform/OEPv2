package org.oep.core.utilities.dossiermgt;

public class EbPartnerShipKeys {
	public class SearchAttributes extends BaseEbPartnerShipAttributes {
		public static final String NAME = "searchName";
	}
	
	public class AddEditAttributes extends BaseEbPartnerShipAttributes {
		public static final String NAME = "editName";
		public static final String CPAID = "editCpaId";
		public static final String SERVICE = "editService";
		public static final String ACTION = "editAction";
		public static final String INBOUND = "editInbound";
	}
	
	public class BaseEbPartnerShipAttributes {
		public static final String DELETE_ID = "deleteId";
		public static final String EDIT_ID = "editId";
	}
	
	public class ErrorMessageKeys {
	}
	
	public class SuccessMessageKeys {
		public static final String ORG_OEP_CORE_UTILITIES_DOSSIERMGT_PORTLET_EBPARTNERSHIP_SUCCESS_UPDATE = "org.oep.core.utilities.dossiermgt.portlet.ebpartnership.success.update";
		public static final String ORG_OEP_CORE_UTILITIES_DOSSIERMGT_PORTLET_EBPARTNERSHIP_SUCCESS_ADDNEW = "org.oep.core.utilities.dossiermgt.portlet.ebpartnership.success.addnew";
		public static final String ORG_OEP_CORE_UTILITIES_DOSSIERMGT_PORTLET_EBPARTNERSHIP_SUCCESS_DELETE = "org.oep.core.utilities.dossiermgt.portlet.ebpartnership.success.delete";
	}

}
