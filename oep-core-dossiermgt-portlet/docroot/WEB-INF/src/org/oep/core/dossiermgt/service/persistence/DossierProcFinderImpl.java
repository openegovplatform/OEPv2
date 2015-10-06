package org.oep.core.dossiermgt.service.persistence;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.oep.core.dossiermgt.model.DossierProc;
import org.oep.core.dossiermgt.model.impl.DossierProcImpl;
import org.oep.core.dossiermgt.util.CustomSQLUtil;
import org.oep.core.dossiermgt.util.StringUtil;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class DossierProcFinderImpl extends BasePersistenceImpl implements DossierProcFinder {
	private static final String COUNT_BY_LIKE_NAME = "countByLikeName";
	private static final String FIND_BY_LIKE_NAME = "findByLikeName";
	private static final String COUNT_BY_GROUP_LIKE_NAME = "countByGroupLikeName";
	private static final String FIND_BY_GROUP_LIKE_NAME = "findByGroupLikeName";
	private static final String COUNT_BY_CUSTOMCONDITION = "countByCustomCondition";
	private static final String FIND_BY_CUSTOMCONDITION = "findByCustomCondition";
	private static final String COUNT_BY_GROUP_CUSTOMCONDITION = "countByGroupCustomCondition";
	private static final String FIND_BY_GROUP_CUSTOMCONDITION = "findByGroupCustomCondition";	
	
	public List<DossierProc> findByLikeName(String name, int startIndex, int endIndex, ServiceContext serviceContext) {
		List<Object> params = new ArrayList<Object>();
		Session session = openSession();
		String sql = CustomSQLUtil.get(DossierProcFinder.class.getName(), FIND_BY_LIKE_NAME);
		sql = sql.replace("[$COMPANY_FILTER$]", " AND COMPANYID = ?");
		params.add(serviceContext.getCompanyId());
		if (!StringUtil.isNullOrEmpty(name)) {
			sql = sql.replace("[$NAME_FILTER$]", " AND LOWER(NAME) LIKE ?");
			params.add("%" + name.toLowerCase() + "%");			
		}
		else {
			sql = sql.replace("[$NAME_FILTER$]", "");
		}
		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity("DossierProc", DossierProcImpl.class);
		if (params != null && params.size() > 0) {
			for (int index = 0; index < params.size(); index++) {
				query.setString(index, String.valueOf(params.get(index)));
			}
		}
		
		return (List<DossierProc>) QueryUtil.list(query, getDialect(), startIndex, endIndex);
	}
	
	public int countByLikeName(String name, ServiceContext serviceContext) {
		List<Object> params = new ArrayList<Object>();
		Session session = openSession();
		String sql = CustomSQLUtil.get(DossierProc.class.getName(), COUNT_BY_LIKE_NAME);		
		sql = sql.replace("[$COMPANY_FILTER$]", " AND COMPANYID = ?");
		params.add(serviceContext.getCompanyId());
		
		if (!StringUtil.isNullOrEmpty(name)) {
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

	public List<DossierProc> findByGroupLikeName(String name, int startIndex, int endIndex, ServiceContext serviceContext) {
		List<Object> params = new ArrayList<Object>();
		Session session = openSession();
		String sql = CustomSQLUtil.get(DossierProcFinder.class.getName(), FIND_BY_GROUP_LIKE_NAME);
		sql = sql.replace("[$COMPANY_FILTER$]", " AND COMPANYID = ?");
		params.add(serviceContext.getCompanyId());
		sql = sql.replace("[$GROUP_FILTER$]", " AND GROUPID = ?");
		params.add(serviceContext.getScopeGroupId());
		if (!StringUtil.isNullOrEmpty(name)) {
			sql = sql.replace("[$NAME_FILTER$]", " AND LOWER(NAME) LIKE ?");
			params.add("%" + name.toLowerCase() + "%");			
		}
		else {
			sql = sql.replace("[$NAME_FILTER$]", "");
		}
		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity("DossierProc", DossierProcImpl.class);
		if (params != null && params.size() > 0) {
			for (int index = 0; index < params.size(); index++) {
				query.setString(index, String.valueOf(params.get(index)));
			}
		}
		
		return (List<DossierProc>) QueryUtil.list(query, getDialect(), startIndex, endIndex);
	}
	
	public int countByGroupLikeName(String name, ServiceContext serviceContext) {
		List<Object> params = new ArrayList<Object>();
		Session session = openSession();
		String sql = CustomSQLUtil.get(DossierProc.class.getName(), COUNT_BY_GROUP_LIKE_NAME);		
		sql = sql.replace("[$COMPANY_FILTER$]", " AND COMPANYID = ?");
		params.add(serviceContext.getCompanyId());
		sql = sql.replace("[$GROUP_FILTER$]", " AND GROUPID = ?");
		params.add(serviceContext.getScopeGroupId());
		
		if (!StringUtil.isNullOrEmpty(name)) {
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
	
	public List<DossierProc> findByCustomCondition(String name, Date effectDate, Date expireDate, int active, int startIndex, int endIndex, ServiceContext serviceContext) {
		List<Object> params = new ArrayList<Object>();
		Session session = openSession();
		String sql = CustomSQLUtil.get(DossierProcFinder.class.getName(), FIND_BY_CUSTOMCONDITION);
		sql = sql.replace("[$COMPANY_FILTER$]", " AND COMPANYID = ?");
		params.add(serviceContext.getCompanyId());
		if (!StringUtil.isNullOrEmpty(name)) {
			sql = sql.replace("[$NAME_FILTER$]", " AND LOWER(NAME) LIKE ?");
			params.add("%" + name.toLowerCase() + "%");			
		}
		else {
			sql = sql.replace("[$NAME_FILTER$]", "");
		}
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		if (effectDate != null) {
			sql = sql.replace("[$EFFECTDATE_FILTER$]", " AND EFFECTDATE >= ?");
			params.add(df.format(effectDate));			
		}
		else {
			sql = sql.replace("[$EFFECTDATE_FILTER$]", "");
		}		
		if (expireDate != null) {
			sql = sql.replace("[$EXPIREDATE_FILTER$]", " AND EXPIREDATE <= ?");
			params.add(df.format(expireDate));			
		}
		else {
			sql = sql.replace("[$EXPIREDATE_FILTER$]", "");
		}		
		if (active != -1) {
			sql = sql.replace("[$ACTIVE_FILTER$]", " AND ACTIVE = ?");
			params.add(active);						
		}
		else {
			sql = sql.replace("[$ACTIVE_FILTER$]", "");			
		}
		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity("DossierProc", DossierProcImpl.class);
		if (params != null && params.size() > 0) {
			for (int index = 0; index < params.size(); index++) {
				query.setString(index, String.valueOf(params.get(index)));
			}
		}
		
		return (List<DossierProc>) QueryUtil.list(query, getDialect(), startIndex, endIndex);
	}
	
	public int countByCustomCondition(String name, Date effectDate, Date expireDate, int active, ServiceContext serviceContext) {
		List<Object> params = new ArrayList<Object>();
		Session session = openSession();
		String sql = CustomSQLUtil.get(DossierProcFinder.class.getName(), COUNT_BY_CUSTOMCONDITION);		
		sql = sql.replace("[$COMPANY_FILTER$]", " AND COMPANYID = ?");
		params.add(serviceContext.getCompanyId());
		
		if (!StringUtil.isNullOrEmpty(name)) {
			sql = sql.replace("[$NAME_FILTER$]", " AND LOWER(NAME) LIKE ?");
			params.add("%" + name.toLowerCase() + "%");			
		}
		else {
			sql = sql.replace("[$NAME_FILTER$]", "");
		}
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		if (effectDate != null) {
			sql = sql.replace("[$EFFECTDATE_FILTER$]", " AND EFFECTDATE >= ?");
			params.add(df.format(effectDate));			
		}
		else {
			sql = sql.replace("[$EFFECTDATE_FILTER$]", "");
		}		
		if (expireDate != null) {
			sql = sql.replace("[$EXPIREDATE_FILTER$]", " AND EXPIREDATE <= ?");
			params.add(df.format(expireDate));			
		}
		else {
			sql = sql.replace("[$EXPIREDATE_FILTER$]", "");
		}		
		if (active != -1) {
			sql = sql.replace("[$ACTIVE_FILTER$]", " AND ACTIVE = ?");
			params.add(active);						
		}
		else {
			sql = sql.replace("[$ACTIVE_FILTER$]", "");			
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


	public List<DossierProc> findByGroupCustomCondition(String name, Date effectDate, Date expireDate, int active, int startIndex, int endIndex, ServiceContext serviceContext) {
		List<Object> params = new ArrayList<Object>();
		Session session = openSession();
		String sql = CustomSQLUtil.get(DossierProcFinder.class.getName(), FIND_BY_GROUP_CUSTOMCONDITION);
		sql = sql.replace("[$COMPANY_FILTER$]", " AND COMPANYID = ?");
		params.add(serviceContext.getCompanyId());
		sql = sql.replace("[$GROUP_FILTER$]", " AND GROUPID = ?");
		params.add(serviceContext.getScopeGroupId());
		
		if (!StringUtil.isNullOrEmpty(name)) {
			sql = sql.replace("[$NAME_FILTER$]", " AND LOWER(NAME) LIKE ?");
			params.add("%" + name.toLowerCase() + "%");			
		}
		else {
			sql = sql.replace("[$NAME_FILTER$]", "");
		}
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		if (effectDate != null) {
			sql = sql.replace("[$EFFECTDATE_FILTER$]", " AND EFFECTDATE >= ?");
			params.add(df.format(effectDate));			
		}
		else {
			sql = sql.replace("[$EFFECTDATE_FILTER$]", "");
		}		
		if (expireDate != null) {
			sql = sql.replace("[$EXPIREDATE_FILTER$]", " AND EXPIREDATE <= ?");
			params.add(df.format(expireDate));			
		}
		else {
			sql = sql.replace("[$EXPIREDATE_FILTER$]", "");
		}		
		if (active != -1) {
			sql = sql.replace("[$ACTIVE_FILTER$]", " AND ACTIVE = ?");
			params.add(active);						
		}
		else {
			sql = sql.replace("[$ACTIVE_FILTER$]", "");			
		}
		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity("DossierProc", DossierProcImpl.class);
		if (params != null && params.size() > 0) {
			for (int index = 0; index < params.size(); index++) {
				query.setString(index, String.valueOf(params.get(index)));
			}
		}
		
		return (List<DossierProc>) QueryUtil.list(query, getDialect(), startIndex, endIndex);
	}
	
	public int countByGroupCustomCondition(String name, Date effectDate, Date expireDate, int active, ServiceContext serviceContext) {
		List<Object> params = new ArrayList<Object>();
		Session session = openSession();
		String sql = CustomSQLUtil.get(DossierProcFinder.class.getName(), COUNT_BY_GROUP_CUSTOMCONDITION);		
		sql = sql.replace("[$COMPANY_FILTER$]", " AND COMPANYID = ?");
		params.add(serviceContext.getCompanyId());
		sql = sql.replace("[$GROUP_FILTER$]", " AND GROUPID = ?");
		params.add(serviceContext.getScopeGroupId());
		
		if (!StringUtil.isNullOrEmpty(name)) {
			sql = sql.replace("[$NAME_FILTER$]", " AND LOWER(NAME) LIKE ?");
			params.add("%" + name.toLowerCase() + "%");			
		}
		else {
			sql = sql.replace("[$NAME_FILTER$]", "");
		}
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		if (effectDate != null) {
			sql = sql.replace("[$EFFECTDATE_FILTER$]", " AND EFFECTDATE >= ?");
			params.add(df.format(effectDate));			
		}
		else {
			sql = sql.replace("[$EFFECTDATE_FILTER$]", "");
		}		
		if (expireDate != null) {
			sql = sql.replace("[$EXPIREDATE_FILTER$]", " AND EXPIREDATE <= ?");
			params.add(df.format(expireDate));			
		}
		else {
			sql = sql.replace("[$EXPIREDATE_FILTER$]", "");
		}		
		if (active != -1) {
			sql = sql.replace("[$ACTIVE_FILTER$]", " AND ACTIVE = ?");
			params.add(active);						
		}
		else {
			sql = sql.replace("[$ACTIVE_FILTER$]", "");			
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
