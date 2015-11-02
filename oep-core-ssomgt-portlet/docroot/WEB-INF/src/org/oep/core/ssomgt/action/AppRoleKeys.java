package org.oep.core.ssomgt.action;

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
		public static final String DELETE_ID = "deleteId";
		public static final String EDIT_ID = "editId";
	}
	
	public class ErrorMessageKeys {
	}
	
	public class SuccessMessageKeys {
	}
}
