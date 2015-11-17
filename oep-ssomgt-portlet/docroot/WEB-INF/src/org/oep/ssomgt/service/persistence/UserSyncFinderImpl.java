package org.oep.ssomgt.service.persistence;

import java.util.ArrayList;
import java.util.List;

import org.oep.ssomgt.model.UserSync;
import org.oep.ssomgt.model.impl.UserSyncImpl;
import org.oep.ssomgt.util.CustomSQLUtil;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class UserSyncFinderImpl extends BasePersistenceImpl implements UserSyncFinder {
	private static final String COUNT_BY_APPLICATION_SYNC = "countByApplicationSync";
	private static final String FIND_BY_APPLICATION_SYNC = "findByApplicationSync";
	
	public List<UserSync> findByApplicationSync(long applicationId, boolean isSync, int startIndex, int endIndex, ServiceContext serviceContext) {
		List<Object> params = new ArrayList<Object>();
		Session session = openSession();
		String sql = CustomSQLUtil.get(UserSyncFinder.class.getName(), FIND_BY_APPLICATION_SYNC);		
		sql = sql.replace("[$COMPANY_FILTER$]", "");
		sql = sql.replace("[$GROUP_FILTER$]", "");
		
		if (applicationId != 0) {
			sql = sql.replace("[$APPLICATION_FILTER$]", " AND APPLICATIONID=?");
			params.add(applicationId);
		}
		else {
			sql = sql.replace("[$APPLICATION_FILTER$]", "");
		}
		
		if (isSync) {
			sql = sql.replace("[$SYNCTIME_FILTER$]", "AND UNIX_TIMESTAMP(SYNCTIME)!=0");
		}
		else {
			sql = sql.replace("[$SYNCTIME_FILTER$]", " AND UNIX_TIMESTAMP(SYNCTIME)=0");
		}
		
		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity("UserSync", UserSyncImpl.class);
		if (params != null && params.size() > 0) {
			for (int index = 0; index < params.size(); index++) {
				query.setString(index, String.valueOf(params.get(index)));
			}
		}
		
		return (List<UserSync>) QueryUtil.list(query, getDialect(), startIndex, endIndex);
	}
	
	public int countByApplicationSync(long applicationId, boolean isSync, ServiceContext serviceContext) {
		List<Object> params = new ArrayList<Object>();
		Session session = openSession();
		String sql = CustomSQLUtil.get(UserSyncFinder.class.getName(), COUNT_BY_APPLICATION_SYNC);		
		sql = sql.replace("[$COMPANY_FILTER$]", "");
		sql = sql.replace("[$GROUP_FILTER$]", "");
		
		if (applicationId != 0) {
			sql = sql.replace("[$APPLICATION_FILTER$]", " AND APPLICATIONID=?");
			params.add(applicationId);
		}
		else {
			sql = sql.replace("[$APPLICATION_FILTER$]", "");
		}
		
		if (isSync) {
			sql = sql.replace("[$SYNCTIME_FILTER$]", "AND UNIX_TIMESTAMP(SYNCTIME)!=0");
		}
		else {
			sql = sql.replace("[$SYNCTIME_FILTER$]", " AND UNIX_TIMESTAMP(SYNCTIME)=0");
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
