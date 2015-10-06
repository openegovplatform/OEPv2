package org.oep.core.dossiermgt.service.persistence;

import java.util.ArrayList;
import java.util.List;

import org.oep.core.dossiermgt.model.DocTemplate;
import org.oep.core.dossiermgt.model.impl.DocTemplateImpl;
import org.oep.core.dossiermgt.util.CustomSQLUtil;
import org.oep.core.dossiermgt.util.StringUtil;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class DocTemplateFinderImpl extends BasePersistenceImpl implements DocTemplateFinder {
	private static final String COUNT_BY_LIKE_TITLE = "countByLikeTitle";
	private static final String FIND_BY_LIKE_TITLE = "findByLikeTitle";
	private static final String COUNT_BY_GROUP_LIKE_TITLE = "countByGroupLikeTitle";
	private static final String FIND_BY_GROUP_LIKE_TITLE = "findByGroupLikeTitle";
	
	public List<DocTemplate> findByLikeTitle(String title, int startIndex, int endIndex, ServiceContext serviceContext) {
		List<Object> params = new ArrayList<Object>();
		Session session = openSession();
		String sql = CustomSQLUtil.get(DocTemplateFinder.class.getName(), FIND_BY_LIKE_TITLE);
		sql = sql.replace("[$COMPANY_FILTER$]", " AND COMPANYID = ?");
		params.add(serviceContext.getCompanyId());
		if (!StringUtil.isNullOrEmpty(title)) {
			sql = sql.replace("[$TITLE_FILTER$]", " AND LOWER(TITLE) LIKE ?");
			params.add("%" + title.toLowerCase() + "%");			
		}
		else {
			sql = sql.replace("[$TITLE_FILTER$]", "");
		}
		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity("DocTemplate", DocTemplateImpl.class);
		if (params != null && params.size() > 0) {
			for (int index = 0; index < params.size(); index++) {
				query.setString(index, String.valueOf(params.get(index)));
			}
		}
		
		return (List<DocTemplate>) QueryUtil.list(query, getDialect(), startIndex, endIndex);
	}
	
	public int countByLikeTitle(String title, ServiceContext serviceContext) {
		List<Object> params = new ArrayList<Object>();
		Session session = openSession();
		String sql = CustomSQLUtil.get(DocTemplateFinder.class.getName(), COUNT_BY_LIKE_TITLE);		
		sql = sql.replace("[$COMPANY_FILTER$]", " AND COMPANYID = ?");
		params.add(serviceContext.getCompanyId());
		
		if (!StringUtil.isNullOrEmpty(title)) {
			sql = sql.replace("[$TITLE_FILTER$]", " AND LOWER(TITLE) LIKE ?");
			params.add("%" + title.toLowerCase() + "%");			
		}
		else {
			sql = sql.replace("[$TITLE_FILTER$]", "");
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

	public List<DocTemplate> findByGroupLikeTitle(String title, int startIndex, int endIndex, ServiceContext serviceContext) {
		List<Object> params = new ArrayList<Object>();
		Session session = openSession();
		String sql = CustomSQLUtil.get(DocTemplateFinder.class.getName(), FIND_BY_GROUP_LIKE_TITLE);
		sql = sql.replace("[$COMPANY_FILTER$]", " AND COMPANYID = ?");
		params.add(serviceContext.getCompanyId());
		sql = sql.replace("[$GROUP_FILTER$]", " AND GROUPID = ?");
		params.add(serviceContext.getScopeGroupId());
		if (!StringUtil.isNullOrEmpty(title)) {
			sql = sql.replace("[$TITLE_FILTER$]", " AND LOWER(TITLE) LIKE ?");
			params.add("%" + title.toLowerCase() + "%");			
		}
		else {
			sql = sql.replace("[$TITLE_FILTER$]", "");
		}
		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity("DocTemplate", DocTemplateImpl.class);
		if (params != null && params.size() > 0) {
			for (int index = 0; index < params.size(); index++) {
				query.setString(index, String.valueOf(params.get(index)));
			}
		}
		
		return (List<DocTemplate>) QueryUtil.list(query, getDialect(), startIndex, endIndex);
	}
	
	public int countByGroupLikeTitle(String title, ServiceContext serviceContext) {
		List<Object> params = new ArrayList<Object>();
		Session session = openSession();
		String sql = CustomSQLUtil.get(DocTemplateFinder.class.getName(), COUNT_BY_GROUP_LIKE_TITLE);		
		sql = sql.replace("[$COMPANY_FILTER$]", " AND COMPANYID = ?");
		params.add(serviceContext.getCompanyId());
		sql = sql.replace("[$GROUP_FILTER$]", " AND GROUPID = ?");
		params.add(serviceContext.getScopeGroupId());
		
		if (!StringUtil.isNullOrEmpty(title)) {
			sql = sql.replace("[$TITLE_FILTER$]", " AND LOWER(TITLE) LIKE ?");
			params.add("%" + title.toLowerCase() + "%");			
		}
		else {
			sql = sql.replace("[$TITLE_FILTER$]", "");
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
