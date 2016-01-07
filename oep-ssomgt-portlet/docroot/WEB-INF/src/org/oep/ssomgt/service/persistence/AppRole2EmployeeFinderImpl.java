package org.oep.ssomgt.service.persistence;

import java.util.ArrayList;
import java.util.List;

import org.oep.ssomgt.model.AppRole;
import org.oep.ssomgt.model.AppRole2Employee;
import org.oep.ssomgt.model.impl.AppRole2EmployeeImpl;
import org.oep.ssomgt.model.impl.AppRoleImpl;
import org.oep.ssomgt.util.CustomSQLUtil;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class AppRole2EmployeeFinderImpl extends BasePersistenceImpl implements AppRole2EmployeeFinder {
	private static final String COUNT_BY_WORKING_UNIT = "countByWorkingUnit";
	private static final String FIND_BY_WORKING_UNIT = "findByWorkingUnit";
	private static final String COUNT_BY_APPROLE_WORKING_UNIT = "countByAppRoleWorkingUnit";
	private static final String FIND_BY_APPROLE_WORKING_UNIT = "findByAppRoleWorkingUnit";
	private static final String FINDROLE_BY_EMPLOYEE = "findRoleByEmployee";
	
	private static Log _log = LogFactoryUtil.getLog(AppRole2EmployeeFinderImpl.class);	
	
	public int countByWorkingUnit(long workingUnitId, ServiceContext serviceContext) {
		List<Object> params = new ArrayList<Object>();
		Session session = openSession();
		String sql = CustomSQLUtil.get(AppRole2EmployeeFinder.class.getName(), COUNT_BY_WORKING_UNIT);		
		sql = sql.replace("[$COMPANY_FILTER$]", " AND companyId = ?");
		params.add(serviceContext.getCompanyId());
		
		sql = sql.replace("[$GROUP_FILTER$]", "");
		if (workingUnitId != 0) {
			sql = sql.replace("[$WORKINGUNIT_FILTER$]", " AND employeeId IN (SELECT oep_usermgt_employee.employeeId FROM oep_usermgt_employee INNER JOIN oep_usermgt_workingunit ON oep_usermgt_employee.workingUnitId = oep_usermgt_workingunit.workingUnitId WHERE oep_usermgt_workingunit.workingUnitId = ?)");
			params.add(workingUnitId);			
		}
		else {
			sql = sql.replace("[$WORKINGUNIT_FILTER$]", "");
		}
		_log.info("SQL:" + sql);
		
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

	public List<AppRole2Employee> findByWorkingUnit(long workingUnitId, int startIndex, int endIndex, ServiceContext serviceContext) {
		List<Object> params = new ArrayList<Object>();
		Session session = openSession();
		String sql = CustomSQLUtil.get(AppRole2EmployeeFinder.class.getName(), FIND_BY_WORKING_UNIT);		
		sql = sql.replace("[$COMPANY_FILTER$]", " AND companyId = ?");
		params.add(serviceContext.getCompanyId());
		
		sql = sql.replace("[$GROUP_FILTER$]", "");
		if (workingUnitId != 0) {
			sql = sql.replace("[$WORKINGUNIT_FILTER$]", " AND employeeId IN (SELECT oep_usermgt_employee.employeeId FROM oep_usermgt_employee INNER JOIN oep_usermgt_workingunit ON oep_usermgt_employee.workingUnitId = oep_usermgt_workingunit.workingUnitId WHERE oep_usermgt_workingunit.workingUnitId = ?)");
			params.add(workingUnitId);			
		}
		else {
			sql = sql.replace("[$WORKINGUNIT_FILTER$]", "");
		}
		
		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity("AppRole2Employee", AppRole2EmployeeImpl.class);
		if (params != null && params.size() > 0) {
			for (int index = 0; index < params.size(); index++) {
				query.setString(index, String.valueOf(params.get(index)));
			}
		}
		
		return (List<AppRole2Employee>) QueryUtil.list(query, getDialect(), startIndex, endIndex);
	}

	public List<AppRole> findRoleByEmployee(long employeeId, long companyId) {
		List<Object> params = new ArrayList<Object>();
		Session session = openSession();
		String sql = CustomSQLUtil.get(AppRole2EmployeeFinder.class.getName(), FIND_BY_WORKING_UNIT);		
		sql = sql.replace("[$COMPANY_FILTER$]", " AND companyId = ?");
		params.add(companyId);
		
		sql = sql.replace("[$GROUP_FILTER$]", "");
		if (employeeId != 0) {
			sql = sql.replace("[$EMPLOYEE_FILTER$]", " AND oep_usermgt_approle2employee.employeeId = ?");
			params.add(employeeId);			
		}
		else {
			sql = sql.replace("[$EMPLOYEE_FILTER$]", "");
		}
		
		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity("AppRole", AppRoleImpl.class);
		if (params != null && params.size() > 0) {
			for (int index = 0; index < params.size(); index++) {
				query.setString(index, String.valueOf(params.get(index)));
			}
		}
		
		return query.list();
	}
	
	public int countByAppRoleWorkingUnit(long appRoleId, long workingUnitId, ServiceContext serviceContext) {
		List<Object> params = new ArrayList<Object>();
		Session session = openSession();
		String sql = CustomSQLUtil.get(AppRole2EmployeeFinder.class.getName(), COUNT_BY_APPROLE_WORKING_UNIT);		
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
			sql = sql.replace("[$WORKINGUNIT_FILTER$]", " AND employeeId IN (SELECT oep_usermgt_employee.employeeId FROM oep_usermgt_employee INNER JOIN oep_usermgt_workingunit ON oep_usermgt_employee.workingUnitId = oep_usermgt_workingunit.workingUnitId WHERE oep_usermgt_workingunit.workingUnitId = ?)");
			params.add(workingUnitId);			
		}
		else {
			sql = sql.replace("[$WORKINGUNIT_FILTER$]", "");
		}
		_log.info("SQL:" + sql);
		
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

	public List<AppRole2Employee> findByAppRoleWorkingUnit(long appRoleId, long workingUnitId, int startIndex, int endIndex, ServiceContext serviceContext) {
		List<Object> params = new ArrayList<Object>();
		Session session = openSession();
		String sql = CustomSQLUtil.get(AppRole2EmployeeFinder.class.getName(), FIND_BY_APPROLE_WORKING_UNIT);		
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
			sql = sql.replace("[$WORKINGUNIT_FILTER$]", " AND employeeId IN (SELECT oep_usermgt_employee.employeeId FROM oep_usermgt_employee INNER JOIN oep_usermgt_workingunit ON oep_usermgt_employee.workingUnitId = oep_usermgt_workingunit.workingUnitId WHERE oep_usermgt_workingunit.workingUnitId = ?)");
			params.add(workingUnitId);			
		}
		else {
			sql = sql.replace("[$WORKINGUNIT_FILTER$]", "");
		}
		
		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity("AppRole2Employee", AppRole2EmployeeImpl.class);
		if (params != null && params.size() > 0) {
			for (int index = 0; index < params.size(); index++) {
				query.setString(index, String.valueOf(params.get(index)));
			}
		}
		
		return (List<AppRole2Employee>) QueryUtil.list(query, getDialect(), startIndex, endIndex);
	}

}
