package org.oep.processmgt.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/** 
 * ConfigUtil Class help to getValue configuration in file.
 * This class contains method get value
 * 
 * Version: 1.0
 *  
 * History: 
 *   DATE        AUTHOR      DESCRIPTION 
 *  ------------------------------------------------- 
 *  2-Apr-2015  liemnn    Create new
 */

public class ConfigUtil {
	public static final String FOLDER_ID ="org.oep.core.service.sotrage.folder.id";
	public static final String ADMIN_ID ="org.oep.core.service.sotrage.user.admin.id";
	public static final String DATABASE="org.oep.database";
	
	// value configuration path
	private static final String CONFIG_PATH = "/oep-config.properties";

	// this is static cache for value configuration
	private static Map<String, String> values = null;
	
	/** 
	 * This is function get value by key in file configuration of system.
	 * @param : key string 
	 * @param : defaultValue  , if not found return defautlvalue
	 * 
	 * Version: 1.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  2-Apr-2015  liemnn    Create new
	 * @throws IOException 
	 */
	
	public static String getValue(String key,String defaultValue){
		
		if(values == null){ 
			// load from file config
			try {
				values = getConfig();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		if (values != null) {
			if (values.containsKey(key)) {
				return values.get(key);
			}
		}
		return defaultValue;
		
	}
	
	private static Map<String, String> getConfig() throws IOException {
		
		Map<String, String> returnValue = new HashMap<String, String>();
		Properties prop = new Properties();
		InputStream is = ConfigUtil.class.getResourceAsStream(CONFIG_PATH);
		prop.load(is);
		is.close();
		Set<Object> keys = prop.keySet();
		if (keys != null && keys.size() > 0) {
			for (Object key : keys) {
				String temp = String.valueOf(key);
				returnValue.put(temp, prop.getProperty(temp));
			}
		}
		return returnValue;
	}
	
	static {
		if(values == null) { 
			// load from file config
			try {
				values = getConfig();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
