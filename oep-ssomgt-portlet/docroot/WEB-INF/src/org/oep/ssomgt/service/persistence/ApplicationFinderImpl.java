package org.oep.ssomgt.service.persistence;

import java.util.ArrayList;
import java.util.List;

import org.oep.ssomgt.model.Application;
import org.oep.ssomgt.model.impl.ApplicationImpl;
import org.oep.ssomgt.util.CustomSQLUtil;

import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class ApplicationFinderImpl extends BasePersistenceImpl implements ApplicationFinder {
	private static final String GET_MAX_SEQUENCENO = "getMaxSequenceNo";
	private static final String GET_UP_APPLICATION = "getUpApplication";
	private static final String GET_DOWN_APPLICATION = "getDownApplication";
	
	public List<Application> getUpApplication(Application app, ServiceContext serviceContext) {
		List<Object> params = new ArrayList<Object>();
		Session session = openSession();

		try {
			String sql = CustomSQLUtil.get(ApplicationFinder.class.getName(), GET_UP_APPLICATION);		
			sql = sql.replace("[$COMPANY_FILTER$]", " AND COMPANYID = ?");
			params.add(serviceContext.getCompanyId());
			sql = sql.replace("[$GROUP_FILTER$]", "");
			
			if (app != null) {
				sql = sql.replace("[$SEQUENCENO_FILTER$]", " AND SEQUENCENO < ?");
				params.add(app.getSequenceNo());			
			}
			else {
				sql = sql.replace("[$SEQUENCENO_FILTER$]", "");
			}
	
			SQLQuery query = session.createSQLQuery(sql);
			query.addEntity("Application", ApplicationImpl.class);
			if (params != null && params.size() > 0) {
				for (int index = 0; index < params.size(); index++) {
					query.setString(index, String.valueOf(params.get(index)));
				}
			}
			return query.list();
		}
		finally {
			closeSession(session);
		}
	}

	public List<Application> getDownApplications(Application app, ServiceContext serviceContext) {
		List<Object> params = new ArrayList<Object>();
		Session session = openSession();
		try {
			String sql = CustomSQLUtil.get(ApplicationFinder.class.getName(), GET_DOWN_APPLICATION);		
			sql = sql.replace("[$COMPANY_FILTER$]", " AND COMPANYID = ?");
			params.add(serviceContext.getCompanyId());
			sql = sql.replace("[$GROUP_FILTER$]", "");
			
			if (app != null) {
				sql = sql.replace("[$SEQUENCENO_FILTER$]", " AND SEQUENCENO > ?");
				params.add(app.getSequenceNo());			
			}
			else {
				sql = sql.replace("[$SEQUENCENO_FILTER$]", "");
			}
	
			SQLQuery query = session.createSQLQuery(sql);
			query.addEntity("Application", ApplicationImpl.class);
			if (params != null && params.size() > 0) {
				for (int index = 0; index < params.size(); index++) {
					query.setString(index, String.valueOf(params.get(index)));
				}
			}
			
			List<Application> list = query.list();
			list = new UnmodifiableList<Application>(list);
			
			return list;
		}
		finally {
			closeSession(session);
		}
	}

	public Application getDownApplication(Application app, ServiceContext serviceContext) {
		List<Object> params = new ArrayList<Object>();
		Session session = openSession();
		try {
			String sql = CustomSQLUtil.get(ApplicationFinder.class.getName(), GET_DOWN_APPLICATION);		
			sql = sql.replace("[$COMPANY_FILTER$]", " AND COMPANYID = ?");
			params.add(serviceContext.getCompanyId());
			sql = sql.replace("[$GROUP_FILTER$]", "");
			
			if (app != null) {
				sql = sql.replace("[$SEQUENCENO_FILTER$]", " AND SEQUENCENO > ?");
				params.add(app.getSequenceNo());			
			}
			else {
				sql = sql.replace("[$SEQUENCENO_FILTER$]", "");
			}
	
			SQLQuery query = session.createSQLQuery(sql);
			query.addEntity("Application", ApplicationImpl.class);
			if (params != null && params.size() > 0) {
				for (int index = 0; index < params.size(); index++) {
					query.setString(index, String.valueOf(params.get(index)));
				}
			}
			
			List<Application> list = query.list();
			list = new UnmodifiableList<Application>(list);
			
			if (list.size() > 0) {
				return (Application)list.get(0);
			}
			else {
				return null;
			}
		}
		finally {
			closeSession(session);
		}
	}
	
	public int getMaxSequenceNo(ServiceContext serviceContext) {
		List<Object> params = new ArrayList<Object>();
		Session session = openSession();
		try {
			String sql = CustomSQLUtil.get(ApplicationFinder.class.getName(), GET_MAX_SEQUENCENO);		
			sql = sql.replace("[$COMPANY_FILTER$]", " AND COMPANYID = ?");
			params.add(serviceContext.getCompanyId());
			sql = sql.replace("[$GROUP_FILTER$]", "");
							
			SQLQuery query = session.createSQLQuery(sql);
			query.addScalar("maxsequenceno", Type.LONG);
			
			if (params != null && params.size() > 0) {
				for (int index = 0; index < params.size(); index++) {
					query.setString(index, String.valueOf(params.get(index)));
				}
			}
			
			System.out.println("SQL: " + sql);
			List temps = query.list();
			if (temps != null && temps.size() > 0) {
				Long total = (Long) temps.get(0);
				if (total == null)
					return 0;
				else
					return total.intValue();
			}
			return 0;
		}
		finally {
			closeSession(session);
		}
	}

}
