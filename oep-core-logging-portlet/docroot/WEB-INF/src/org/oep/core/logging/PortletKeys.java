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

package org.oep.core.logging;

public class PortletKeys {

	public static final int PAGE = 1;
	public static final int DELTA = 10;
	public static final long LONG_DEFAULT = 0;
	public static final String STRING_DEFAULT = "";
	public static final long SELECT_BOX = -1;
	public static final String TEXT_BOX = STRING_DEFAULT;
	public static final boolean CHECK_BOX = false;
	public static final long TREE_ROOT_ID = -1;
	public static final String SET_VIEW_PARAMETER = "jspPage";
	public static final String REDIRECT_PAGE = "redirectPage";
	public static final String ERROR_REDIRECT_PAGE = "errorRedirectPage";
	public static final String SUCCESS_REDIRECT_PAGE = "successRedirectPage";
	
	public class SearchContainer {
		public static final String CURRENT_PAGE = "cur";
		public static final String DELTA = "delta";
	}
}
