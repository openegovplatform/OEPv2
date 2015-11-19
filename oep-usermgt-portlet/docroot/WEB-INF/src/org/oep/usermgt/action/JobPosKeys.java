package org.oep.usermgt.action;

public class  JobPosKeys {
	public class SearchAttributes extends BaseJobPosAttributes {
	}
	
	public class AddEditAttributes extends BaseJobPosAttributes {
		public static final String TITLE="addEditTitle";
		public static final String POSITIONCATNO="addEditPositionCatNo";
		public static final String WORKINGUNITID="addEditWorkingUnitId";
		public static final String LEADER="addEditLeader";
	}
	
	public class BaseJobPosAttributes {
		public static final String DELETE_ID = "deleteId";
		public static final String EDIT_ID = "editId";
		public static final String TEXTSEARCH="textSearch";
	}
	
	public class ErrorMessageKeys {
	}
	
	public class SuccessMessageKeys {
	}
}
