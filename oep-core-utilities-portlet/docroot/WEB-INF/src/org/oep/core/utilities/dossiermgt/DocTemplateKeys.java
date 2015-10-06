package org.oep.core.utilities.dossiermgt;

public class DocTemplateKeys {
	public class SearchAttributes extends BaseDocTemplateAttributes {
		public static final String TEMPLATE_NO = "searchTemplateNo";
		public static final String TITLE = "searchTitle";
	}
	
	public class AddEditAttributes extends BaseDocTemplateAttributes {
		public static final String TEMPLATE_NO = "editTemplateNo";
		public static final String TITLE = "editTitle";
		public static final String EN_TITLE = "editEnTitle";
		public static final String FILE_ENTRYID = "editFileEntryId";
	}
	
	public class BaseDocTemplateAttributes {
		public static final String DELETE_ID = "deleteId";
		public static final String EDIT_ID = "editId";
	}
	
	public class ErrorMessageKeys {
	}
	
	public class SuccessMessageKeys {
		public static final String ORG_OEP_CORE_UTILITIES_DOSSIERMGT_PORTLET_DOCTEMPLATE_SUCCESS_UPDATE = "org.oep.core.utilities.dossiermgt.portlet.doctemplate.success.update";
		public static final String ORG_OEP_CORE_UTILITIES_DOSSIERMGT_PORTLET_DOCTEMPLATE_SUCCESS_ADDNEW = "org.oep.core.utilities.dossiermgt.portlet.doctemplate.success.addnew";
		public static final String ORG_OEP_CORE_UTILITIES_DOSSIERMGT_PORTLET_DOCTEMPLATE_SUCCESS_DELETE = "org.oep.core.utilities.dossiermgt.portlet.doctemplate.success.delete";
	}
}
