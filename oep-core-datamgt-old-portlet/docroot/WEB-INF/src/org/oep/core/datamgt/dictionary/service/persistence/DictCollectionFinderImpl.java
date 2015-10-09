package org.oep.core.datamgt.dictionary.service.persistence;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.oep.core.datamgt.dictionary.model.DictCollection;
import org.oep.core.datamgt.dictionary.model.impl.DictCollectionImpl;
import org.oep.core.util.CustomSQLUtil;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class DictCollectionFinderImpl extends BasePersistenceImpl implements DictCollectionFinder {
	private static final String COUNT_BY_LIKE_NAME = "countByLikeName";
	private static final String FIND_BY_LIKE_NAME = "findByLikeName";
	private static final String COUNT_BY_CUSTOMCONDITION = "countByCustomCondition";
	private static final String FIND_BY_CUSTOMCONDITION = "findByCustomCondition";
	
	public List<DictCollection> findByLikeName(String name, int startIndex, int endIndex, ServiceContext serviceContext) {
		List<Object> params = new ArrayList<Object>();
		Session session = openSession();
		String sql = CustomSQLUtil.get(DictCollectionFinder.class.getName(), FIND_BY_LIKE_NAME);
		sql = sql.replace("[$COMPANY_FILTER$]", " AND COMPANYID = ?");
		params.add(serviceContext.getCompanyId());
		if (!org.oep.core.util.StringUtil.isNullOrEmpty(name)) {
			sql = sql.replace("[$NAME_FILTER$]", " AND LOWER(NAME) LIKE ?");
			params.add("%" + name.toLowerCase() + "%");			
		}
		else {
			sql = sql.replace("[$NAME_FILTER$]", "");
		}
		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity("DictCollection", DictCollectionImpl.class);
		if (params != null && params.size() > 0) {
			for (int index = 0; index < params.size(); index++) {
				query.setString(index, String.valueOf(params.get(index)));
			}
		}
		
		return (List<DictCollection>) QueryUtil.list(query, getDialect(), startIndex, endIndex);
	}
	
	public int countByLikeName(String name, ServiceContext serviceContext) {
		List<Object> params = new ArrayList<Object>();
		Session session = openSession();
		String sql = CustomSQLUtil.get(DictCollectionFinder.class.getName(), COUNT_BY_LIKE_NAME);		
		sql = sql.replace("[$COMPANY_FILTER$]", " AND COMPANYID = ?");
		params.add(serviceContext.getCompanyId());
		
		if (!org.oep.core.util.StringUtil.isNullOrEmpty(name)) {
			sql = sql.replace("[$NAME_FILTER$]", " AND LOWER(NAME) LIKE ?");
			params.add("%" + name.toLowerCase() + "%");			
		}
		else {
			sql = sql.replace("[$NAME_FILTER$]", "");
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

	public List<DictCollection> findByCustomCondition(String name, String version, Date validatedFrom, Date validatedTo, int status, int startIndex, int endIndex, ServiceContext serviceContext) {
		List<Object> params = new ArrayList<Object>();
		Session session = openSession();
		String sql = CustomSQLUtil.get(DictCollectionFinder.class.getName(), FIND_BY_CUSTOMCONDITION);
		sql = sql.replace("[$COMPANY_FILTER$]", " AND COMPANYID = ?");
		params.add(serviceContext.getCompanyId());
		if (!org.oep.core.util.StringUtil.isNullOrEmpty(name)) {
			sql = sql.replace("[$NAME_FILTER$]", " AND LOWER(NAME) LIKE ?");
			params.add("%" + name.toLowerCase() + "%");			
		}
		else {
			sql = sql.replace("[$NAME_FILTER$]", "");
		}
		if (!org.oep.core.util.StringUtil.isNullOrEmpty(version)) {
			sql = sql.replace("[$VERSION_FILTER$]", " AND VERSION = ?");
			params.add(version);			
		}
		else {
			sql = sql.replace("[$VERSION_FILTER$]", "");
		}		
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		if (validatedFrom != null) {
			sql = sql.replace("[$VALIDATEDFROM_FILTER$]", " AND VALIDATEDFROM >= ?");
			params.add(df.format(validatedFrom));			
		}
		else {
			sql = sql.replace("[$VALIDATEDFROM_FILTER$]", "");
		}		
		if (validatedTo != null) {
			sql = sql.replace("[$VALIDATEDTO_FILTER$]", " AND VALIDATEDTO <= ?");
			params.add(df.format(validatedTo));			
		}
		else {
			sql = sql.replace("[$VALIDATEDTO_FILTER$]", "");
		}		
		if (status != -1 && status <= 3 && status >= 0) {
			sql = sql.replace("[$STATUS_FILTER$]", " AND STATUS = ?");
			params.add(status);						
		}
		else {
			sql = sql.replace("[$STATUS_FILTER$]", "");			
		}
		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity("DictCollection", DictCollectionImpl.class);
		if (params != null && params.size() > 0) {
			for (int index = 0; index < params.size(); index++) {
				query.setString(index, String.valueOf(params.get(index)));
			}
		}
		
		return (List<DictCollection>) QueryUtil.list(query, getDialect(), startIndex, endIndex);
	}
	
	public int countByCustomCondition(String name, String version, Date validatedFrom, Date validatedTo, int status, ServiceContext serviceContext) {
		List<Object> params = new ArrayList<Object>();
		Session session = openSession();
		String sql = CustomSQLUtil.get(DictCollectionFinder.class.getName(), COUNT_BY_CUSTOMCONDITION);		
		sql = sql.replace("[$COMPANY_FILTER$]", " AND COMPANYID = ?");
		params.add(serviceContext.getCompanyId());
		
		if (!org.oep.core.util.StringUtil.isNullOrEmpty(name)) {
			sql = sql.replace("[$NAME_FILTER$]", " AND LOWER(NAME) LIKE ?");
			params.add("%" + name.toLowerCase() + "%");			
		}
		else {
			sql = sql.replace("[$NAME_FILTER$]", "");
		}
		if (!org.oep.core.util.StringUtil.isNullOrEmpty(version)) {
			sql = sql.replace("[$VERSION_FILTER$]", " AND VERSION = ?");
			params.add(version);			
		}
		else {
			sql = sql.replace("[$VERSION_FILTER$]", "");
		}		
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		if (validatedFrom != null) {
			sql = sql.replace("[$VALIDATEDFROM_FILTER$]", " AND VALIDATEDFROM >= ?");
			params.add(df.format(validatedFrom));			
		}
		else {
			sql = sql.replace("[$VALIDATEDFROM_FILTER$]", "");
		}		
		if (validatedTo != null) {
			sql = sql.replace("[$VALIDATEDTO_FILTER$]", " AND VALIDATEDTO <= ?");
			params.add(df.format(validatedTo));			
		}
		else {
			sql = sql.replace("[$VALIDATEDTO_FILTER$]", "");
		}		
		if (status != -1 && status <= 3 && status >= 0) {
			sql = sql.replace("[$STATUS_FILTER$]", " AND STATUS = ?");
			params.add(status);						
		}
		else {
			sql = sql.replace("[$STATUS_FILTER$]", "");			
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
