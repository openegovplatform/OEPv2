package org.oep.usermgt.service.persistence;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;








import org.oep.usermgt.model.WorkingUnit;
import org.oep.usermgt.model.impl.WorkingUnitImpl;
import org.oep.usermgt.service.persistence.WorkingUnitFinder;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;

public class WorkingUnitFinderImpl extends BasePersistenceImpl implements WorkingUnitFinder{
	private static final String COUNT_BY_CUSTOMCONDITION = WorkingUnitFinder.class.getName() + ".countByCustomCondition";
	private static final String FIND_BY_CUSTOMCONDITION = WorkingUnitFinder.class.getName() + ".findByCustomCondition";
	private static final String FIND_BY_LIKENAME = WorkingUnitFinder.class.getName() + ".findByLikeName";
	private static final String COUNT_BY_LIKENAME = WorkingUnitFinder.class.getName() + ".countByLikeName";
	
	public List<WorkingUnit> findByLikeName(String textSearch, long parentWorkingUnitId, ServiceContext serviceContext) {
		List<Object> params = new ArrayList<Object>();
		Session session = openSession();
		String sql = CustomSQLUtil.get(FIND_BY_LIKENAME);
		sql = sql.replace("[$COMPANY_FILTER$]", " AND COMPANYID = ?");
		params.add(serviceContext.getCompanyId());
		if (textSearch != null && !"".equals(textSearch)) {
			sql = sql.replace("[$NAME_FILTER$]", " AND (LOWER(NAME) LIKE ? OR LOWER(govAgencyId) LIKE ?)");
			params.add("%" + textSearch.toLowerCase() + "%");		
			params.add("%" + textSearch.toLowerCase() + "%");	
		}
		else {
			sql = sql.replace("[$NAME_FILTER$]", "");
		}
		
		if (parentWorkingUnitId > 0) {
			sql = sql.replace("[$PARENT_FILTER$]", " AND PARENTWORKINGUNITID = ?");
			params.add(parentWorkingUnitId);						
		}
		else {
			sql = sql.replace("[$PARENT_FILTER$]", "");			
		}
		//System.out.println(" kkkkkkkkkkkkkkkkkkkk " + sql);
		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity("WorkingUnit", WorkingUnitImpl.class);
		if (params != null && params.size() > 0) {
			for (int index = 0; index < params.size(); index++) {
				query.setString(index, String.valueOf(params.get(index)));
			}
		}
		if (query.list() != null){
			return (List<WorkingUnit>) query.list();
		}
		return new ArrayList<WorkingUnit>();
		//return (List<WorkingUnit>) query.list();
	}
	public List<WorkingUnit> findByLikeName(String textSearch, long parentWorkingUnitId, int startIndex, int endIndex, ServiceContext serviceContext) {
		List<Object> params = new ArrayList<Object>();
		Session session = openSession();
		String sql = CustomSQLUtil.get(FIND_BY_LIKENAME);
		sql = sql.replace("[$COMPANY_FILTER$]", " AND COMPANYID = ?");
		params.add(serviceContext.getCompanyId());
		if (textSearch != null && !"".equals(textSearch)) {
			sql = sql.replace("[$NAME_FILTER$]", " AND (LOWER(NAME) LIKE ? OR LOWER(govAgencyId) LIKE ?)");
			params.add("%" + textSearch.toLowerCase() + "%");		
			params.add("%" + textSearch.toLowerCase() + "%");	
		}
		else {
			sql = sql.replace("[$NAME_FILTER$]", "");
		}
		
		if (parentWorkingUnitId > 0) {
			sql = sql.replace("[$PARENT_FILTER$]", " AND PARENTWORKINGUNITID = ?");
			params.add(parentWorkingUnitId);						
		}
		else {
			sql = sql.replace("[$PARENT_FILTER$]", "");			
		}
		//System.out.println(" kkkkkkkkkkkkkkkkkkkk " + sql);
		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity("WorkingUnit", WorkingUnitImpl.class);
		if (params != null && params.size() > 0) {
			for (int index = 0; index < params.size(); index++) {
				query.setString(index, String.valueOf(params.get(index)));
			}
		}
		if (query.list() != null){
			return (List<WorkingUnit>) QueryUtil.list(query, getDialect(), startIndex, endIndex);
		}
		return new ArrayList<WorkingUnit>();
		//return (List<WorkingUnit>) query.list();
	}
	
	public int countByLikeName(String textSearch, long parentWorkingUnitId, ServiceContext serviceContext) {
		List<Object> params = new ArrayList<Object>();
		Session session = openSession();
		String sql = CustomSQLUtil.get(COUNT_BY_LIKENAME);
		sql = sql.replace("[$COMPANY_FILTER$]", " AND COMPANYID = ?");
		params.add(serviceContext.getCompanyId());
		if (textSearch != null && !"".equals(textSearch)) {
			sql = sql.replace("[$NAME_FILTER$]", " AND (LOWER(NAME) LIKE ? OR LOWER(govAgencyId) LIKE ?)");
			params.add("%" + textSearch.toLowerCase() + "%");		
			params.add("%" + textSearch.toLowerCase() + "%");	
		}
		else {
			sql = sql.replace("[$NAME_FILTER$]", "");
		}
		
		if (parentWorkingUnitId > 0) {
			sql = sql.replace("[$PARENT_FILTER$]", " AND PARENTWORKINGUNITID = ?");
			params.add(parentWorkingUnitId);						
		}
		else {
			sql = sql.replace("[$PARENT_FILTER$]", "");			
		}
		///System.out.println(" iiiiiiiiiiiiiiiiiiii " + sql);
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
