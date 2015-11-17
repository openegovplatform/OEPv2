package org.oep.ssomgt.action;

public class UserSyncKeys {
	public class SearchAttributes extends BaseUserSyncAttributes {
		public static final String APPLICATION_ID = "searchApplicationId";
		public static final String IS_SYNC = "searchIsSync";
	}
	
	public class AddEditAttributes extends BaseUserSyncAttributes {
		public static final String SSO_USERNAME = "addEditSSOUserName";
		public static final String EMAIL = "addEditEmail";
		public static final String APPLICATION_ID = "addEditApplicationId";
		public static final String APP_USERNAME = "addEditAppUserName";
		public static final String EMPLOYEE_ID = "addEditEmployeeId";
	}
	
	public class BaseUserSyncAttributes {
		public static final String DELETE_ID = "deleteAppRoleId";
		public static final String EDIT_ID = "editAppRoleId";
	}
	
	public class ErrorMessageKeys {
	}
	
	public class SuccessMessageKeys {
	}

}
