package org.oep.ssomgt.action;

public class AppRoleKeys {
	public class SearchAttributes extends BaseAppRoleAttributes {
		public static final String APPLICATION_ID = "searchApplicationId";
	}
	
	public class AddEditAttributes extends BaseAppRoleAttributes {
		public static final String APPLICATION_ID = "addEditApplicationId";
		public static final String ROLE_CODE = "addEditRoleCode";
		public static final String ROLE_NAME = "addEditRoleName";
	}
	
	public class BaseAppRoleAttributes {
		public static final String DELETE_ID = "deleteAppRoleId";
		public static final String EDIT_ID = "editAppRoleId";
	}
	
	public class ErrorMessageKeys {
		public static final String ORG_OEP_SSOMGT_PORTLET_APPROLE_ROLECODE = "org.oep.ssomgt.portlet.approle.validator.rolecode";
		public static final String ORG_OEP_SSOMGT_PORTLET_APPROLE_ROLENAME = "org.oep.ssomgt.portlet.approle.validator.rolename";		
		public static final String ORG_OEP_SSOMGT_PORTLET_APPROLE_ERROR_DELETE = "org.oep.ssomgt.portlet.approle.error.delete";
	}
	
	public class SuccessMessageKeys {
		public static final String ORG_OEP_SSOMGT_PORTLET_APPROLE_SUCCESS_ADDNEW = "org.oep.ssomgt.portlet.approle.success.addnew";
		public static final String ORG_OEP_SSOMGT_PORTLET_APPROLE_SUCCESS_UPDATE = "org.oep.ssomgt.portlet.approle.success.update";
		public static final String ORG_OEP_SSOMGT_PORTLET_APPROLE_SUCCESS_DELETE = "org.oep.ssomgt.portlet.approle.success.delete";	
	}
}
