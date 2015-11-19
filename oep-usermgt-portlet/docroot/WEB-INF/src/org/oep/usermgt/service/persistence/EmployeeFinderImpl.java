package org.oep.usermgt.service.persistence;


import java.util.ArrayList;

import java.util.List;
import org.oep.usermgt.model.Employee;
import org.oep.usermgt.model.impl.EmployeeImpl;
import org.oep.usermgt.service.persistence.EmployeeFinder;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;

public class EmployeeFinderImpl extends BasePersistenceImpl implements EmployeeFinder{
	private static final String COUNT_BY_CUSTOMCONDITION = EmployeeFinder.class.getName() + ".countByCustomCondition";
	private static final String FIND_BY_CUSTOMCONDITION = EmployeeFinder.class.getName() + ".findByCustomCondition";
	private static final String FIND_BY_LIKENAME = EmployeeFinder.class.getName() + ".findByLikeName";
	private static final String COUNT_BY_LIKENAME = EmployeeFinder.class.getName() + ".countByLikeName";
	
	public List<Employee> findByLikeName(String textSearch, long workingUnitId) {
		List<Object> params = new ArrayList<Object>();
		Session session = openSession();
		String sql = CustomSQLUtil.get(FIND_BY_LIKENAME);
		
		if (textSearch != null && !"".equals(textSearch)) {
			sql = sql.replace("[$NAME_FILTER$]", " AND (LOWER(FULLNAME) LIKE ? OR LOWER(PERSONELDOCNO) LIKE ?)");
			params.add("%" + textSearch.toLowerCase() + "%");		
			params.add("%" + textSearch.toLowerCase() + "%");	
		}
		else {
			sql = sql.replace("[$NAME_FILTER$]", "");
		}
		
		if (workingUnitId > 0) {
			sql = sql.replace("[$WORKINGUNIT_FILTER$]", " AND WORKINGUNITID = ?");
			params.add(workingUnitId);						
		}
		else {
			sql = sql.replace("[$WORKINGUNIT_FILTER$]", "");			
		}
		//System.out.println(" kkkkkkkkkkkkkkkkkkkk " + sql);
		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity("WorkingUnit", EmployeeImpl.class);
		if (params != null && params.size() > 0) {
			for (int index = 0; index < params.size(); index++) {
				query.setString(index, String.valueOf(params.get(index)));
			}
		}
		if (query.list() != null){
			return (List<Employee>) query.list();
		}
		return new ArrayList<Employee>();
		//return (List<WorkingUnit>) query.list();
	}
	public List<Employee> findByLikeName(String textSearch, long workingUnitId, int startIndex, int endIndex) {
		List<Object> params = new ArrayList<Object>();
		Session session = openSession();
		String sql = CustomSQLUtil.get(FIND_BY_LIKENAME);
		if (textSearch != null && !"".equals(textSearch)) {
			sql = sql.replace("[$NAME_FILTER$]", " AND (LOWER(FULLNAME) LIKE ? OR LOWER(PERSONELDOCNO) LIKE ?)");
			params.add("%" + textSearch.toLowerCase() + "%");		
			params.add("%" + textSearch.toLowerCase() + "%");	
		}
		else {
			sql = sql.replace("[$NAME_FILTER$]", "");
		}
		
		if (workingUnitId > 0) {
			sql = sql.replace("[$WORKINGUNIT_FILTER$]", " AND WORKINGUNITID = ?");
			params.add(workingUnitId);						
		}
		else {
			sql = sql.replace("[$WORKINGUNIT_FILTER$]", "");			
		}
		//System.out.println(" kkkkkkkkkkkkkkkkkkkk " + sql);
		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity("WorkingUnit", EmployeeImpl.class);
		if (params != null && params.size() > 0) {
			for (int index = 0; index < params.size(); index++) {
				query.setString(index, String.valueOf(params.get(index)));
			}
		}
		if (query.list() != null){
			return (List<Employee>) QueryUtil.list(query, getDialect(), startIndex, endIndex);
		}
		return new ArrayList<Employee>();
		//return (List<WorkingUnit>) query.list();
	}
	
	public int countByLikeName(String textSearch, long workingUnitId) {
		List<Object> params = new ArrayList<Object>();
		Session session = openSession();
		String sql = CustomSQLUtil.get(COUNT_BY_LIKENAME);
		//System.out.println(" iiiiiiiiiiiiiiiiiiii " + sql);
		if (textSearch != null && !"".equals(textSearch)) {
			sql = sql.replace("[$NAME_FILTER$]", " AND (LOWER(FULLNAME) LIKE ? OR LOWER(PERSONELDOCNO) LIKE ?)");
			params.add("%" + textSearch.toLowerCase() + "%");		
			params.add("%" + textSearch.toLowerCase() + "%");	
		}
		else {
			sql = sql.replace("[$NAME_FILTER$]", "");
		}
		
		if (workingUnitId > 0) {
			sql = sql.replace("[$WORKINGUNIT_FILTER$]", " AND WORKINGUNITID = ?");
			params.add(workingUnitId);						
		}
		else {
			sql = sql.replace("[$WORKINGUNIT_FILTER$]", "");			
		}
		//System.out.println(" iiiiiiiiiiiiiiiiiiii " + sql);
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
