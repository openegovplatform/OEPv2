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
package org.oep.dossiermgt.util;

import java.text.SimpleDateFormat;
import java.util.Date;
/** 
 * Date utility class
 * This class contains method to manipulate date
 * 
 * Version: 1.0
 *  
 * History: 
 *   DATE        AUTHOR      DESCRIPTION 
 *  ------------------------------------------------- 
 *  2-Apr-2015  ThongDV    Create new
 */
public class DateUtil {
	
	public static final String DATE_FORMAT_FULL ="yyyyMMddHH24mmss";
	public static final String DATE_FORMAT_D_M_Y ="dd/MM/yyyy";
	public static final String DATE_FORMAT_D_M_Y_H_M_S ="dd/MM/yyyy HH:mm:ss";
	public static final String DATE_FORMAT_D_M_Y_H_M ="dd/MM/yyyy HH:mm";	
	public static final String DATE_FORMAT_Y_M_D="yyyymmdd";
	public static final String DATE_FORMAT_H_M_D_M_Y="HH:mm dd/MM/yyyy";		
	/** 
	 * This is method parse format date to string
	 * 
	 * Version: OEP 1.1
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  26-March-2015  ThongDV    Create new
	 * @param date
	 * @param format
	 * @return string  
	 */
	public static String parseDateToString(Date date,String format)	{
		try {
			SimpleDateFormat sdf= new SimpleDateFormat(format);
			return sdf.format(date);
		} catch (Exception e) {
		}
		return "";
	}	
	
	
	/** 
	 * This is method parse format string to date
	 * 
	 * Version: OEP 1.1
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  26-March-2015  ThongDV    Create new
	 * @param strDate
	 * @param format
	 * @return Date
	 */
	public static Date parseStringToDate(String strDate,String format){
		try {
			SimpleDateFormat sdf= new SimpleDateFormat(format);
			return sdf.parse(strDate);
		} catch (Exception e) {
		}
		return null;
	}
	
	/** 
	 * This is method get current date time
	 * 
	 * Version: OEP 1.1
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  26-March-2015  ThongDV    Create new
	 * @return Date
	 */
	public static Date getCurrentDateTime(){
		return new Date();
	}
}
