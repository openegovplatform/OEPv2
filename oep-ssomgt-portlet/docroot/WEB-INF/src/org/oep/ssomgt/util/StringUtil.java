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

package org.oep.ssomgt.util;

/** 
 * Handle util function for String
 * 
 * Version: OEP 1.1
 *  
 * History: 
 *   DATE        AUTHOR      DESCRIPTION 
 *  ------------------------------------------------- 
 *  01-April-2015  trungdv    Create new
 */
public class StringUtil {

	public static boolean isNullOrEmpty(String source) {
		return (source == null || "".equals(source));
	}
	
	public static boolean equalNullable(String source, String des) {
		if (source == null) source = "";
		if (des == null) des = "";
		return source.equals(des);
	}
	
	public static String join(final Object[] array, final String separator) {
		if (array == null) {
            return null;
        }
		int startIndex = 0;
		int endIndex = array.length;
        final int noOfItems = endIndex - startIndex;
        if (noOfItems <= 0) {
            return "";
        }
        final StringBuilder buf = new StringBuilder();
        for (int i = startIndex; i < endIndex; i++) {
            if (i > startIndex) {
                buf.append(separator);
            }
            if (array[i] != null) {
                buf.append(array[i]);
            }
        }
        return buf.toString();
	}
	
	public static boolean contains(String element, String[] sources) {
		if (element != null && sources != null && sources.length > 0) {
			for (String item : sources) {
				if (item != null && item.equals(element)) {
					return true;
				}
			}
		}
		return false;
	}
}
