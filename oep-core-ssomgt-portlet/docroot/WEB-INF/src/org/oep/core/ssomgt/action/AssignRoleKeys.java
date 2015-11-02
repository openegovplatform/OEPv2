package org.oep.core.ssomgt.action;

public abstract class AssignRoleKeys {
	public class SearchAttributes extends BaseAssignRoleAttributes {
		public static final String WORKING_UNIT_ID = "searchWorkingUnitId";
	}
	
	public class BaseAssignRoleAttributes {
		public static final String DELETE_ID = "deleteId";
		public static final String EDIT_ID = "editId";
	}
	
	public class ErrorMessageKeys {
	}
	
	public class SuccessMessageKeys {
	}

}
