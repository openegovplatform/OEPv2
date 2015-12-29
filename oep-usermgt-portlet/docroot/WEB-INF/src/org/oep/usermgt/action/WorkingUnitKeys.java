/**
 * Copyright (c) 2015 by Open eGovPlatform (http://http://openegovplatform.org/).
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.oep.usermgt.action;

public class WorkingUnitKeys {
	public class SearchAttributes extends BaseWorkingUnitAttributes {
	}
	
	public class AddEditAttributes extends BaseWorkingUnitAttributes {
		public static final String USERID="addEditUserId";
		public static final String GROUPID="addEditGroupId";
		public static final String COMPANYID="addEditCompanyId";
		public static final String CREATEDATE="addEditCreateDate";
		public static final String MODIFIEDDATE="addEditModifiedDate";
		public static final String ORGANIZATIONID="addEditOrganizationId";
		public static final String GOVAGENCYID="addEditGovAgencyId";
		public static final String NAME="addEditName";
		public static final String ENNAME="addEditEnName";
		public static final String PARENTWORKINGUNITID="addEditParentWorkingUnitId";
		public static final String WORKINGUNITID="addEditWorkingUnitId";
		public static final String ADDRESS="addEditAddress";
		public static final String CITYNO="addEditCityNo";
		public static final String CITYNAME="addEditCityName";
		public static final String DISTRICTNO="addEditDistrictNo";
		public static final String DISTRICTNAME="addEditDistrictName";
		public static final String WARDNO="addEditWardNo";
		public static final String WARDNAME="addEditWardName";
		public static final String GPSPOSITION="addEditGpsPosition";
		public static final String TELNO="addEditTelNo";
		public static final String FAX="addEditFax";
		public static final String EMAIL="addEditEmail";
		public static final String WEBSITE="addEditWebsite";
		public static final String LOCALSITEID="addEditLocalSiteId";
		public static final String ISEMPLOYER="addEditIsEmployer";
	}
	
	public class BaseWorkingUnitAttributes {
		public static final String DELETE_ID = "deleteId";
		public static final String EDIT_ID = "editId";
		public static final String TEXTSEARCH="textSearch";
	}
	
	public class ErrorMessageKeys {
	}
	
	public class SuccessMessageKeys {
	}
}
