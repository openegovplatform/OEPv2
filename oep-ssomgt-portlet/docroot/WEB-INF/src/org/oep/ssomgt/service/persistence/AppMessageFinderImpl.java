package org.oep.ssomgt.service.persistence;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.oep.ssomgt.model.AppMessage;
import org.oep.ssomgt.model.impl.AppMessageImpl;
import org.oep.ssomgt.util.CustomSQLUtil;
import org.oep.ssomgt.util.StringUtil;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class AppMessageFinderImpl extends BasePersistenceImpl implements AppMessageFinder {
	private static final String COUNT_BY_CUSTOM_CONDITION = "countByCustomCondition";
	private static final String FIND_BY_CUSTOM_CONDITION = "findByCustomCondition";
	private static final String COUNT_BY_APPLICATION_USER = "countByApplicationUser";
	private static final String FIND_BY_APPLICATION_USER = "findByApplicationUser";	
	
	public List<AppMessage> findByCustomCondition(String fromApplication, String toUser, Date fromDate, Date toDate, String messageType, int startIndex, int endIndex, ServiceContext serviceContext) {
		List<Object> params = new ArrayList<Object>();
		Session session = openSession();
		String sql = CustomSQLUtil.get(AppMessageFinder.class.getName(), FIND_BY_CUSTOM_CONDITION);		
		sql = sql.replace("[$COMPANY_FILTER$]", "");
		sql = sql.replace("[$GROUP_FILTER$]", "");
		
		if (!StringUtil.isNullOrEmpty(fromApplication)) {
			sql = sql.replace("[$FROMAPPLICATION_FILTER$]", " AND FROMAPPLICATION = ?");
			params.add(fromApplication);			
		}
		else {
			sql = sql.replace("[$FROMAPPLICATION_FILTER$]", "");
		}
		if (!StringUtil.isNullOrEmpty(toUser)) {
			sql = sql.replace("[$TOUSER_FILTER$]", " AND TOUSER = ?");
			params.add(toUser);			
		}
		else {
			sql = sql.replace("[$TOUSER_FILTER$]", "");
		}
		if (!StringUtil.isNullOrEmpty(messageType)) {
			sql = sql.replace("[$MESSAGETYPE_FILTER$]", " AND MESSAGETYPE = ?");
			params.add(messageType);			
		}
		else {
			sql = sql.replace("[$MESSAGETYPE_FILTER$]", "");
		}

		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		if (fromDate != null) {
			sql = sql.replace("[$FROMDATE_FILTER$]", " AND CREATEDATE >= ?");
			params.add(df.format(fromDate));			
		}
		else {
			sql = sql.replace("[$FROMDATE_FILTER$]", "");
		}		
		if (toDate != null) {
			sql = sql.replace("[$TODATE_FILTER$]", " AND CREATEDATE <= ?");
			params.add(df.format(toDate));			
		}
		else {
			sql = sql.replace("[$TODATE_FILTER$]", "");
		}		
		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity("AppMessage", AppMessageImpl.class);
		if (params != null && params.size() > 0) {
			for (int index = 0; index < params.size(); index++) {
				query.setString(index, String.valueOf(params.get(index)));
			}
		}
		
		return (List<AppMessage>) QueryUtil.list(query, getDialect(), startIndex, endIndex);
	}
	
	public int countByCustomCondition(String fromApplication, String toUser, Date fromDate, Date toDate, String messageType, ServiceContext serviceContext) {
		List<Object> params = new ArrayList<Object>();
		Session session = openSession();
		String sql = CustomSQLUtil.get(AppMessageFinder.class.getName(), COUNT_BY_CUSTOM_CONDITION);		
		sql = sql.replace("[$COMPANY_FILTER$]", "");
		sql = sql.replace("[$GROUP_FILTER$]", "");
		
		if (!StringUtil.isNullOrEmpty(fromApplication)) {
			sql = sql.replace("[$FROMAPPLICATION_FILTER$]", " AND FROMAPPLICATION = ?");
			params.add(fromApplication);			
		}
		else {
			sql = sql.replace("[$FROMAPPLICATION_FILTER$]", "");
		}
		if (!StringUtil.isNullOrEmpty(toUser)) {
			sql = sql.replace("[$TOUSER_FILTER$]", " AND TOUSER = ?");
			params.add(toUser);			
		}
		else {
			sql = sql.replace("[$TOUSER_FILTER$]", "");
		}
		if (!StringUtil.isNullOrEmpty(messageType)) {
			sql = sql.replace("[$MESSAGETYPE_FILTER$]", " AND MESSAGETYPE = ?");
			params.add(messageType);			
		}
		else {
			sql = sql.replace("[$MESSAGETYPE_FILTER$]", "");
		}

		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		if (fromDate != null) {
			sql = sql.replace("[$FROMDATE_FILTER$]", " AND CREATEDATE >= ?");
			params.add(df.format(fromDate));			
		}
		else {
			sql = sql.replace("[$FROMDATE_FILTER$]", "");
		}		
		if (toDate != null) {
			sql = sql.replace("[$TODATE_FILTER$]", " AND CREATEDATE <= ?");
			params.add(df.format(toDate));			
		}
		else {
			sql = sql.replace("[$TODATE_FILTER$]", "");
		}		
				
		SQLQuery query = session.createSQLQuery(sql);
		query.addScalar("total", Type.LONG);
		
		if (params != null && params.size() > 0) {
			for (int index = 0; index < params.size(); index++) {
				query.setString(index, String.valueOf(params.get(index)));
			}
		}
		
		List temps = query.list();
		if (temps != null && temps.size() > 0) {
			Long total = (Long) temps.get(0);
			return total.intValue();
		}
		return 0;
	}

	public List<AppMessage> findByApplicationUser(String fromApplication, String toUser, ServiceContext serviceContext) {
		List<Object> params = new ArrayList<Object>();
		Session session = openSession();
		String sql = CustomSQLUtil.get(AppMessageFinder.class.getName(), FIND_BY_APPLICATION_USER);		
		sql = sql.replace("[$COMPANY_FILTER$]", " AND COMPANYID = ?");
		params.add(serviceContext.getCompanyId());
		sql = sql.replace("[$GROUP_FILTER$]", "");
		
		if (!StringUtil.isNullOrEmpty(fromApplication)) {
			sql = sql.replace("[$FROMAPPLICATION_FILTER$]", " AND FROMAPPLICATION = ?");
			params.add(fromApplication);			
		}
		else {
			sql = sql.replace("[$FROMAPPLICATION_FILTER$]", "");
		}
		if (!StringUtil.isNullOrEmpty(toUser)) {
			sql = sql.replace("[$TOUSER_FILTER$]", " AND TOUSER = ?");
			params.add(toUser);			
		}
		else {
			sql = sql.replace("[$TOUSER_FILTER$]", "");
		}

		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity("AppMessage", AppMessageImpl.class);
		if (params != null && params.size() > 0) {
			for (int index = 0; index < params.size(); index++) {
				query.setString(index, String.valueOf(params.get(index)));
			}
		}
		
		return query.list();
	}
	
	public int countByApplicationUser(String fromApplication, String toUser, ServiceContext serviceContext) {
		List<Object> params = new ArrayList<Object>();
		Session session = openSession();
		String sql = CustomSQLUtil.get(AppMessageFinder.class.getName(), COUNT_BY_APPLICATION_USER);		
		sql = sql.replace("[$COMPANY_FILTER$]", " AND COMPANYID = ?");
		params.add(serviceContext.getCompanyId());
		sql = sql.replace("[$GROUP_FILTER$]", "");
		
		if (!StringUtil.isNullOrEmpty(fromApplication)) {
			sql = sql.replace("[$FROMAPPLICATION_FILTER$]", " AND FROMAPPLICATION = ?");
			params.add(fromApplication);			
		}
		else {
			sql = sql.replace("[$FROMAPPLICATION_FILTER$]", "");
		}
		if (!StringUtil.isNullOrEmpty(toUser)) {
			sql = sql.replace("[$TOUSER_FILTER$]", " AND TOUSER = ?");
			params.add(toUser);			
		}
		else {
			sql = sql.replace("[$TOUSER_FILTER$]", "");
		}
				
		SQLQuery query = session.createSQLQuery(sql);
		query.addScalar("total", Type.LONG);
		
		if (params != null && params.size() > 0) {
			for (int index = 0; index < params.size(); index++) {
				query.setString(index, String.valueOf(params.get(index)));
			}
		}
		
		List temps = query.list();
		if (temps != null && temps.size() > 0) {
			Long total = (Long) temps.get(0);
			return total.intValue();
		}
		return 0;
	}
	
}
