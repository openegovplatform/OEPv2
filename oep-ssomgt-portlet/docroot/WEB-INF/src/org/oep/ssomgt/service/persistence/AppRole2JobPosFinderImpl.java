package org.oep.ssomgt.service.persistence;

import java.util.ArrayList;
import java.util.List;

import org.oep.ssomgt.model.AppRole2JobPos;
import org.oep.ssomgt.model.impl.AppRole2JobPosImpl;
import org.oep.ssomgt.service.impl.ApplicationLocalServiceImpl;
import org.oep.ssomgt.util.CustomSQLUtil;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class AppRole2JobPosFinderImpl extends BasePersistenceImpl implements AppRole2JobPosFinder {
	private static final String COUNT_BY_WORKING_UNIT = "countByWorkingUnit";
	private static final String FIND_BY_WORKING_UNIT = "findByWorkingUnit";
	private static final String COUNT_BY_APPROLE_WORKING_UNIT = "countByAppRoleWorkingUnit";
	private static final String FIND_BY_APPROLE_WORKING_UNIT = "findByAppRoleWorkingUnit";
	
	private static Log _log = LogFactoryUtil.getLog(AppRole2JobPosFinderImpl.class);	
	
	public int countByWorkingUnit(long workingUnitId, ServiceContext serviceContext) {
		List<Object> params = new ArrayList<Object>();
		Session session = openSession();
		String sql = CustomSQLUtil.get(AppRole2JobPosFinder.class.getName(), COUNT_BY_WORKING_UNIT);		
		sql = sql.replace("[$COMPANY_FILTER$]", " AND companyId = ?");
		params.add(serviceContext.getCompanyId());
		
		sql = sql.replace("[$GROUP_FILTER$]", "");
		if (workingUnitId != 0) {
			sql = sql.replace("[$WORKINGUNIT_FILTER$]", " AND jobPosId IN (SELECT oep_usermgt_jobpos.jobPosId FROM oep_usermgt_jobpos INNER JOIN oep_usermgt_workingunit ON oep_usermgt_jobpos.workingUnitId = oep_usermgt_workingunit.workingUnitId WHERE oep_usermgt_workingunit.workingUnitId = ?)");
			params.add(workingUnitId);			
		}
		else {
			sql = sql.replace("[$WORKINGUNIT_FILTER$]", "");
		}
		_log.info("SQL:" + sql);
		
		SQLQuery query = session.createSQLQuery(sql);
		query.addScalar("TOTAL", Type.LONG);
		
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

	public List<AppRole2JobPos> findByWorkingUnit(long workingUnitId, int startIndex, int endIndex, ServiceContext serviceContext) {
		List<Object> params = new ArrayList<Object>();
		Session session = openSession();
		String sql = CustomSQLUtil.get(AppRole2JobPosFinder.class.getName(), FIND_BY_WORKING_UNIT);		
		sql = sql.replace("[$COMPANY_FILTER$]", " AND companyId = ?");
		params.add(serviceContext.getCompanyId());
		
		sql = sql.replace("[$GROUP_FILTER$]", "");
		if (workingUnitId != 0) {
			sql = sql.replace("[$WORKINGUNIT_FILTER$]", " AND jobPosId IN (SELECT oep_usermgt_jobpos.jobPosId FROM oep_usermgt_jobpos INNER JOIN oep_usermgt_workingunit ON oep_usermgt_jobpos.workingUnitId = oep_usermgt_workingunit.workingUnitId WHERE oep_usermgt_workingunit.workingUnitId = ?)");
			params.add(workingUnitId);			
		}
		else {
			sql = sql.replace("[$WORKINGUNIT_FILTER$]", "");
		}
		
		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity("AppRole2JobPos", AppRole2JobPosImpl.class);
		if (params != null && params.size() > 0) {
			for (int index = 0; index < params.size(); index++) {
				query.setString(index, String.valueOf(params.get(index)));
			}
		}
		
		return (List<AppRole2JobPos>) QueryUtil.list(query, getDialect(), startIndex, endIndex);
	}
	
	public int countByAppRoleWorkingUnit(long appRoleId, long workingUnitId, ServiceContext serviceContext) {
		List<Object> params = new ArrayList<Object>();
		Session session = openSession();
		String sql = CustomSQLUtil.get(AppRole2JobPosFinder.class.getName(), COUNT_BY_APPROLE_WORKING_UNIT);		
		sql = sql.replace("[$COMPANY_FILTER$]", " AND companyId = ?");
		params.add(serviceContext.getCompanyId());
		
		sql = sql.replace("[$GROUP_FILTER$]", "");
		if (appRoleId != 0) {
			sql = sql.replace("[$APPROLE_FILTER$]", " AND appRoleId = ?");
			params.add(appRoleId);						
		}
		else {
			sql = sql.replace("[$APPROLE_FILTER$]", "");			
		}
		if (workingUnitId != 0) {
			sql = sql.replace("[$WORKINGUNIT_FILTER$]", " AND jobPosId IN (SELECT oep_usermgt_jobpos.jobPosId FROM oep_usermgt_jobpos INNER JOIN oep_usermgt_workingunit ON oep_usermgt_jobpos.workingUnitId = oep_usermgt_workingunit.workingUnitId WHERE oep_usermgt_workingunit.workingUnitId = ?)");
			params.add(workingUnitId);			
		}
		else {
			sql = sql.replace("[$WORKINGUNIT_FILTER$]", "");
		}
		_log.info("SQL:" + sql);
		
		SQLQuery query = session.createSQLQuery(sql);
		query.addScalar("TOTAL", Type.LONG);
		
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

	public List<AppRole2JobPos> findByAppRoleWorkingUnit(long appRoleId, long workingUnitId, int startIndex, int endIndex, ServiceContext serviceContext) {
		List<Object> params = new ArrayList<Object>();
		Session session = openSession();
		String sql = CustomSQLUtil.get(AppRole2JobPosFinder.class.getName(), FIND_BY_APPROLE_WORKING_UNIT);		
		sql = sql.replace("[$COMPANY_FILTER$]", " AND companyId = ?");
		params.add(serviceContext.getCompanyId());
		
		sql = sql.replace("[$GROUP_FILTER$]", "");
		if (appRoleId != 0) {
			sql = sql.replace("[$APPROLE_FILTER$]", " AND appRoleId = ?");
			params.add(appRoleId);						
		}
		else {
			sql = sql.replace("[$APPROLE_FILTER$]", "");			
		}
		
		if (workingUnitId != 0) {
			sql = sql.replace("[$WORKINGUNIT_FILTER$]", " AND jobPosId IN (SELECT oep_usermgt_jobpos.jobPosId FROM oep_usermgt_jobpos INNER JOIN oep_usermgt_workingunit ON oep_usermgt_jobpos.workingUnitId = oep_usermgt_workingunit.workingUnitId WHERE oep_usermgt_workingunit.workingUnitId = ?)");
			params.add(workingUnitId);			
		}
		else {
			sql = sql.replace("[$WORKINGUNIT_FILTER$]", "");
		}
		
		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity("AppRole2JobPos", AppRole2JobPosImpl.class);
		if (params != null && params.size() > 0) {
			for (int index = 0; index < params.size(); index++) {
				query.setString(index, String.valueOf(params.get(index)));
			}
		}
		
		return (List<AppRole2JobPos>) QueryUtil.list(query, getDialect(), startIndex, endIndex);
	}

}
