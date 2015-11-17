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
package org.oep.ssomgt.action;

public class ApplicationKeys {
	public class SearchAttributes extends BaseApplicationAttributes {
	}
	
	public class AddEditAttributes extends BaseApplicationAttributes {
		public static final String APP_CODE = "addEditAppCode";
		public static final String APP_NAME = "addEditAppName";
		public static final String APP_PIN = "addEditAppPin";
		public static final String APP_URL = "addEditAppUrl";
		public static final String APP_BIGICON = "addEditAppBigIcon";
		public static final String APP_SMALLICON = "addEditAppSmallIcon";
		public static final String PINGTIME = "addEditPingTime";
		public static final String SEQUENCENO = "addEditSequenceNo";
		public static final String PUBLICKEY = "addEditPublicKey";
	}
	
	public class BaseApplicationAttributes {
		public static final String DELETE_ID = "deleteId";
		public static final String EDIT_ID = "editId";
	}
	
	public class ErrorMessageKeys {
		public static final String ORG_OEP_SSOMGT_PORTLET_APPLICATIONMANAGEMENT_APPCODE = "org.oep.ssomgt.portlet.applicationmanagement.validator.appcode";
		public static final String ORG_OEP_SSOMGT_PORTLET_APPLICATIONMANAGEMENT_APPNAME = "org.oep.ssomgt.portlet.applicationmanagement.validator.appname";
		public static final String ORG_OEP_SSOMGT_PORTLET_APPLICATIONMANAGEMENT_APPPIN = "org.oep.ssomgt.portlet.applicationmanagement.validator.apppin";
		public static final String ORG_OEP_SSOMGT_PORTLET_APPLICATIONMANAGEMENT_APPURL = "org.oep.ssomgt.portlet.applicationmanagement.validator.appurl";
		public static final String ORG_OEP_SSOMGT_PORTLET_APPLICATIONMANAGEMENT_PUBLICKEY = "org.oep.ssomgt.portlet.applicationmanagement.validator.publickey";
		public static final String ORG_OEP_SSOMGT_PORTLET_APPLICATIONMANAGEMENT_APPICONNULL = "org.oep.ssomgt.portlet.applicationmanagement.validator.appiconnull";
		public static final String ORG_OEP_SSOMGT_PORTLET_APPLICATIONMANAGEMENT_ERROR_DELETE = "org.oep.ssomgt.portlet.applicationmanagement.error.delete";
	}
	
	public class SuccessMessageKeys {
		public static final String ORG_OEP_SSOMGT_PORTLET_APPLICATION_SUCCESS_ADDNEW = "org.oep.ssomgt.portlet.applicationmanagement.success.addnew";
		public static final String ORG_OEP_SSOMGT_PORTLET_APPLICATION_SUCCESS_UPDATE = "org.oep.ssomgt.portlet.applicationmanagement.success.update";
		public static final String ORG_OEP_SSOMGT_PORTLET_APPLICATION_SUCCESS_DELETE = "org.oep.ssomgt.portlet.applicationmanagement.success.delete";
	}
}
