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

package org.oep.core.logging.business;

import java.util.Calendar;
import java.util.Date;

/**
*
* UserActivityBusiness class
*   
* This class is implementation business of UserActivity
* by call to service layer of common
* 
* 
* History:
*  
*   DATE         AUTHOR      DESCRIPTION 
*  --------------------------------------------------------
*  26-March-2015   ThongDV       Create new
*
*/
public class UserActivityBusiness {
	
	/** Check whether user is online 
	 *  Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  05-Aug-2015	  thongdv	Update
	 * @return: true if user is online, false if user is offline
	 * @param userId
	 * @throws Exception 
	 */
	public static boolean isUserOnline(Date latestActionTime) throws Exception{
		if (latestActionTime != null) {
			Calendar calendar = Calendar.getInstance();
			calendar.add(Calendar.MINUTE, 0 - TIMEOUT);
			if (latestActionTime.after(calendar.getTime())) {
				return true;
			}
		}
		return false;
	}
	
	private static int TIMEOUT = 5;
}
