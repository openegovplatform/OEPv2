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
package org.oep.core.util;


public class Constaints {
	
	public static final String VIEW_FORM = "View";
	public static final String ADD_FORM = "Add";
	public static final String EDIT_FORM = "Edit";
	public static final String UPLOAD_OK ="OK";
	public static final String CLASSNAME ="className";
	public static final String OBJECTID ="objectId";
	public static final String NGAYTAO ="ngayTao";
	
	public static interface Paging {
		public static int DELTA = 10;
		public static int CUR 	= 1;
		
	}
	
	public interface FileType{
		 public static final String ANHDAIDIEN	=	"ANHDAIDIEN";
		 public static final String VIDEO		=	"VIDEO";
		 public static final String AUDIO		=	"AUDIO";
		 public static final String DOC			=	"DOC";
		 public static final String PDF			=	"PDF";
		 public static final String FILE		=	"FILE";
	}
 
	public interface UploadFile{
		 public static final String ERROR_FORDER_NOT_FOUND		=	"ERROR_FORDER_NOT_FOUND";
		 public static final String ERROR_FORDER_NOT_CREATED	=	"ERROR_FORDER_NOT_CREATED";
		 public static final String ERROR_NOTFOUNT_CATEGORY		=	"ERROR_NOTFOUNT_CATEGORY";
		 public static final String OK							=	"OK";
	 
	}
	public interface UrlTarget
	{
		public static final String blank 	= "_blank";	//Opens new page in a new browser window
		public static final String self 	= "_self";	//Loads the new page in the current window
		public static final String parent 	= "_parent";	//Loads new page into a parent frame
		public static final String top 		= "_top";	//Loads new page into the current browser window, cancelling all frames
	}
	public static interface Action {
		public static final String LOAD 		 = "LOAD";
		public static final String UNLOAD 		 = "UNLOAD";
	}
	
	public static interface UserType {
		public static final int USER_TYPE 		 = 1;
		public static final int GROUP_TYPE 		 = 2;
	}
	
}
