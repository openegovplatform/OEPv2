package org.oep.core.dossiermgt.service.persistence;

import java.util.ArrayList;
import java.util.List;

import org.oep.core.dossiermgt.model.EbPartnerShip;
import org.oep.core.dossiermgt.model.impl.EbPartnerShipImpl;
import org.oep.core.dossiermgt.util.CustomSQLUtil;
import org.oep.core.dossiermgt.util.StringUtil;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class EbPartnerShipFinderImpl extends BasePersistenceImpl implements EbPartnerShipFinder {
	private static final String COUNT_BY_LIKE_NAME = "countByLikeName";
	private static final String FIND_BY_LIKE_NAME = "findByLikeName";
	private static final String COUNT_BY_GROUP_LIKE_NAME = "countByGroupLikeName";
	private static final String FIND_BY_GROUP_LIKE_NAME = "findByGroupLikeName";
	
	public List<EbPartnerShip> findByLikeName(String name, int startIndex, int endIndex, ServiceContext serviceContext) {
		List<Object> params = new ArrayList<Object>();
		Session session = openSession();
		String sql = CustomSQLUtil.get(EbPartnerShipFinder.class.getName(), FIND_BY_LIKE_NAME);
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
		query.addEntity("EbPartnerShip", EbPartnerShipImpl.class);
		if (params != null && params.size() > 0) {
			for (int index = 0; index < params.size(); index++) {
				query.setString(index, String.valueOf(params.get(index)));
			}
		}
		
		return (List<EbPartnerShip>) QueryUtil.list(query, getDialect(), startIndex, endIndex);
	}
	
	public int countByLikeName(String name, ServiceContext serviceContext) {
		List<Object> params = new ArrayList<Object>();
		Session session = openSession();
		String sql = CustomSQLUtil.get(EbPartnerShipFinder.class.getName(), COUNT_BY_LIKE_NAME);		
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

	public List<EbPartnerShip> findByGroupLikeName(String name, int startIndex, int endIndex, ServiceContext serviceContext) {
		List<Object> params = new ArrayList<Object>();
		Session session = openSession();
		String sql = CustomSQLUtil.get(EbPartnerShipFinder.class.getName(), FIND_BY_GROUP_LIKE_NAME);
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
		query.addEntity("EbPartnerShip", EbPartnerShipImpl.class);
		if (params != null && params.size() > 0) {
			for (int index = 0; index < params.size(); index++) {
				query.setString(index, String.valueOf(params.get(index)));
			}
		}
		
		return (List<EbPartnerShip>) QueryUtil.list(query, getDialect(), startIndex, endIndex);
	}
	
	public int countByGroupLikeName(String name, ServiceContext serviceContext) {
		List<Object> params = new ArrayList<Object>();
		Session session = openSession();
		String sql = CustomSQLUtil.get(EbPartnerShipFinder.class.getName(), COUNT_BY_GROUP_LIKE_NAME);		
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

}
