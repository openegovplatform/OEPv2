package org.oep.usermgt.action;

public class  EmployeeKeys {
	public class SearchAttributes extends BaseEmployeeAttributes {
	}
	
	public class AddEditAttributes extends BaseEmployeeAttributes {
	
		public static final String MAPPINGUSERID="addEditMappingUserId";
		public static final String WORKINGUNITID="addEditWorkingUnitId";
		public static final String MAINJOBPOSID="addEditMainJobPosId";
		public static final String EMPLOYEENO="addEditEmployeeNo";
		public static final String PERSONELDOCNO="addEditPersonelDocNo";
		public static final String FULLNAME="addEditFullName";
		public static final String GENDER="addEditGender";
		public static final String BIRTHDATE="addEditBirthdate";
		public static final String OFFICETEL="addEditOfficeTel";
		public static final String HOMETEL="addEditHomeTel";
		public static final String MOBILE="addEditMobile";
		public static final String EMAIL="addEditEmail";
		public static final String ISCREATUSER="isAddUser";
		public static final String SCREENNAME="addEditScreenName";
		public static final String PASSWORD="addPassword";
		public static final String REPASSWORD="addRePassword";
		public static final String JOBPOSID="addJobPosId";
	}
	
	public class BaseEmployeeAttributes {
		public static final String DELETE_ID = "deleteId";
		public static final String EDIT_ID = "editId";
		public static final String TEXTSEARCH="textSearch";
		public static final String WORKINGUNITID = "workingUnitId";
	}
	
	public class ErrorMessageKeys {
	}
	
	public class SuccessMessageKeys {
	}
}