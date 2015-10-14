package org.oep.core.processmgt.util;

public class CustomSQLUtil {
	public static String get(String classPk, String func) {
		StringBuffer sql = new StringBuffer("");
		sql.append(ConfigUtil.getValue(ConfigUtil.DATABASE, "oracle"));
		sql.append(".");
		sql.append(classPk);
		sql.append(".");
		sql.append(func);
		return com.liferay.util.dao.orm.CustomSQLUtil.get(sql.toString());
	}
}
