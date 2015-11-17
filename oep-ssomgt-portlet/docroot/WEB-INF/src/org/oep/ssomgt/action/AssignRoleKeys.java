package org.oep.ssomgt.action;

public abstract class AssignRoleKeys {
	public class SearchAttributes extends BaseAssignRoleAttributes {
		public static final String WORKING_UNIT_ID = "searchWorkingUnitId";
	}
	
	public class AddEditAttributes extends BaseAssignRoleAttributes {
		public static final String WORKING_UNIT_ID = "addEditWorkingUnitId";
	}
	
	public class BaseAssignRoleAttributes {
		public static final String DELETE_ID = "deleteId";
		public static final String EDIT_ID = "editId";
	}
	
	public class ErrorMessageKeys {
		public static final String ORG_OEP_SSOMGT_PORTLET_APPROLE_ASSIGNROLE2JOBPOS_ERROR_DELETE = "org.oep.ssomgt.portlet.approle.assignrole2jobpos.error.delete";
		public static final String ORG_OEP_SSOMGT_PORTLET_APPROLE_ASSIGNROLE2EMPLOYEE_ERROR_DELETE = "org.oep.ssomgt.portlet.approle.assignrole2employee.error.delete";
	}
	
	public class SuccessMessageKeys {
		public static final String ORG_OEP_SSOMGT_PORTLET_APPROLE_ASSIGNROLE2JOBPOS_SUCCESS_ADDNEW = "org.oep.ssomgt.portlet.approle.assignrole2jobpos.success.addnew";
		public static final String ORG_OEP_SSOMGT_PORTLET_APPROLE_ASSIGNROLE2EMPLOYEE_SUCCESS_ADDNEW = "org.oep.ssomgt.portlet.approle.assignrole2employee.success.addnew";		
		public static final String ORG_OEP_SSOMGT_PORTLET_APPROLE_ASSIGNROLE2JOBPOS_SUCCESS_DELETE = "org.oep.ssomgt.portlet.approle.assignrole2jobpos.success.delete";
		public static final String ORG_OEP_SSOMGT_PORTLET_APPROLE_ASSIGNROLE2EMPLOYEE_SUCCESS_DELETE = "org.oep.ssomgt.portlet.approle.assignrole2employee.success.delete";		
	}

	public class SearchContainer {
		public static final String CURRENT_JOBPOS_PAGE = "curJobPos";
		public static final String DELTA_JOBPOS = "deltaJobPos";		
		public static final String CURRENT_EMPLOYEE_PAGE = "curEmployee";
		public static final String DELTA_EMPLOYEE = "deltaEmployee";		
	}
}