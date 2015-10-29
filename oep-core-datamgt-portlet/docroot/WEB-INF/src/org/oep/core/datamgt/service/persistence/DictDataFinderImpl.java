package org.oep.core.datamgt.service.persistence;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;





import org.oep.core.datamgt.model.DictData;
import org.oep.core.datamgt.model.impl.DictDataImpl;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;

public class DictDataFinderImpl extends BasePersistenceImpl implements DictDataFinder{
	private static final String COUNT_BY_CUSTOMCONDITION = DictDataFinder.class.getName() + ".countByCustomCondition";
	private static final String FIND_BY_CUSTOMCONDITION = DictDataFinder.class.getName() + ".findByCustomCondition";
	public List<DictData> findByCustomCondition(String dataCode, String collectionName,String dataCodeParent, int datalevel, Date validatedFrom, Date validatedTo, int status, ServiceContext serviceContext) {
		List<Object> params = new ArrayList<Object>();
		Session session = openSession();
		String sql = CustomSQLUtil.get(FIND_BY_CUSTOMCONDITION);
		sql = sql.replace("[$COMPANY_FILTER$]", " AND COMPANYID = ?");
		params.add(serviceContext.getCompanyId());
		if (dataCode != null && !"".equals(dataCode)) {
			sql = sql.replace("[$DATACODE_FILTER$]", " AND (LOWER(DATACODE) LIKE ? OR LOWER(TITLE) LIKE ?)");
			params.add("%" + dataCode.toLowerCase() + "%");		
			params.add("%" + dataCode.toLowerCase() + "%");	
		}
		else {
			sql = sql.replace("[$DATACODE_FILTER$]", "");
		}
		if (collectionName != null && !"".equals(collectionName)) {
			sql = sql.replace("[$COLLECTIONNAME_FILTER$]", " AND COLLECTIONNAME = ?");
			params.add(collectionName);			
		}
		else {
			sql = sql.replace("[$COLLECTIONNAME_FILTER$]", "");
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
		if (datalevel != -1 && datalevel <= 5 && datalevel >= 1) {
			String node = "NODE_" + datalevel;
			sql = sql.replace("[$NODE_FILTER$]", " AND " + node + " = ?");
			params.add(dataCodeParent);						
		}
		else {
			sql = sql.replace("[$NODE_FILTER$]", "");			
		}
		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity("DictData", DictDataImpl.class);
		if (params != null && params.size() > 0) {
			for (int index = 0; index < params.size(); index++) {
				query.setString(index, String.valueOf(params.get(index)));
			}
		}
		//System.out.println("");
		//System.out.println(sql);
		//System.out.println("");
		if (query.list() != null){
			return (List<DictData>) query.list();
		}
		return new ArrayList<DictData>();
		//return (List<DictData>) query.list();
	}
	
	public List<DictData> findByCustomCondition(String dataCode, String collectionName,String dataCodeParent, int datalevel, Date validatedFrom, Date validatedTo, int status, int startIndex, int endIndex, ServiceContext serviceContext) {
		List<Object> params = new ArrayList<Object>();
		Session session = openSession();
		String sql = CustomSQLUtil.get(FIND_BY_CUSTOMCONDITION);
		sql = sql.replace("[$COMPANY_FILTER$]", " AND COMPANYID = ?");
		params.add(serviceContext.getCompanyId());
		if (dataCode != null && !"".equals(dataCode)) {
			sql = sql.replace("[$DATACODE_FILTER$]", " AND (LOWER(DATACODE) LIKE ? OR LOWER(TITLE) LIKE ?)");
			params.add("%" + dataCode.toLowerCase() + "%");		
			params.add("%" + dataCode.toLowerCase() + "%");	
		}
		else {
			sql = sql.replace("[$DATACODE_FILTER$]", "");
		}
		if (collectionName != null && !"".equals(collectionName)) {
			sql = sql.replace("[$COLLECTIONNAME_FILTER$]", " AND COLLECTIONNAME = ?");
			params.add(collectionName);			
		}
		else {
			sql = sql.replace("[$COLLECTIONNAME_FILTER$]", "");
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
		if (datalevel != -1 && datalevel <= 5 && datalevel >= 1) {
			String node = "NODE_" + datalevel;
			sql = sql.replace("[$NODE_FILTER$]", " AND " + node + " = ?");
			params.add(dataCodeParent);						
		}
		else {
			sql = sql.replace("[$NODE_FILTER$]", "");			
		}
		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity("DictData", DictDataImpl.class);
		if (params != null && params.size() > 0) {
			for (int index = 0; index < params.size(); index++) {
				query.setString(index, String.valueOf(params.get(index)));
			}
		}
		
		return (List<DictData>) QueryUtil.list(query, getDialect(), startIndex, endIndex);
	}
	
	public int countByCustomCondition(String dataCode, String collectionName,String dataCodeParent, int datalevel, Date validatedFrom, Date validatedTo, int status, ServiceContext serviceContext) {
		List<Object> params = new ArrayList<Object>();
		Session session = openSession();
		String sql = CustomSQLUtil.get(COUNT_BY_CUSTOMCONDITION);		
		sql = sql.replace("[$COMPANY_FILTER$]", " AND COMPANYID = ?");
		params.add(serviceContext.getCompanyId());
		
		if (dataCode != null && !"".equals(dataCode)) {
			sql = sql.replace("[$DATACODE_FILTER$]", " AND (LOWER(DATACODE) LIKE ? OR LOWER(TITLE) LIKE ?)");
			params.add("%" + dataCode.toLowerCase() + "%");		
			params.add("%" + dataCode.toLowerCase() + "%");	
		}
		else {
			sql = sql.replace("[$DATACODE_FILTER$]", "");
		}
		if (collectionName != null && !"".equals(collectionName)) {
			sql = sql.replace("[$COLLECTIONNAME_FILTER$]", " AND COLLECTIONNAME = ?");
			params.add(collectionName);			
		}
		else {
			sql = sql.replace("[$COLLECTIONNAME_FILTER$]", "");
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
		if (datalevel != -1 && datalevel <= 5 && datalevel >= 1) {
			String node = "NODE_" + datalevel;
			sql = sql.replace("[$NODE_FILTER$]", " AND " + node + " = ?");
			params.add(dataCodeParent);						
		}
		else {
			sql = sql.replace("[$NODE_FILTER$]", "");			
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
	public List<DictData> findByGroupCustomCondition(String dataCode, String collectionName,String dataCodeParent, int datalevel, Date validatedFrom, Date validatedTo, int status, ServiceContext serviceContext) {
		List<Object> params = new ArrayList<Object>();
		Session session = openSession();
		String sql = CustomSQLUtil.get(FIND_BY_CUSTOMCONDITION);
		sql = sql.replace("[$COMPANY_FILTER$]", " AND GROUPID = ?");
		params.add(serviceContext.getScopeGroupId());
		if (dataCode != null && !"".equals(dataCode)) {
			sql = sql.replace("[$DATACODE_FILTER$]", " AND (LOWER(DATACODE) LIKE ? OR LOWER(TITLE) LIKE ?)");
			params.add("%" + dataCode.toLowerCase() + "%");		
			params.add("%" + dataCode.toLowerCase() + "%");	
		}
		else {
			sql = sql.replace("[$DATACODE_FILTER$]", "");
		}
		if (collectionName != null && !"".equals(collectionName)) {
			sql = sql.replace("[$COLLECTIONNAME_FILTER$]", " AND COLLECTIONNAME = ?");
			params.add(collectionName);			
		}
		else {
			sql = sql.replace("[$COLLECTIONNAME_FILTER$]", "");
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
		if (datalevel != -1 && datalevel <= 5 && datalevel >= 1) {
			String node = "node_" + datalevel;
			sql = sql.replace("[$NODE_FILTER$]", " AND " + node + " = ?");
			params.add(dataCodeParent);						
		}
		else {
			sql = sql.replace("[$NODE_FILTER$]", "");			
		}
		//System.out.println("");
		//System.out.println(sql);
		//System.out.println("");
		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity("DictData", DictDataImpl.class);
		if (params != null && params.size() > 0) {
			for (int index = 0; index < params.size(); index++) {
				query.setString(index, String.valueOf(params.get(index)));
			}
		}
		if (query.list() != null){
			return (List<DictData>) query.list();
		}
		return new ArrayList<DictData>();
	}
	
	public List<DictData> findByGroupCustomCondition(String dataCode, String collectionName,String dataCodeParent, int datalevel, Date validatedFrom, Date validatedTo, int status, int startIndex, int endIndex, ServiceContext serviceContext) {
		List<Object> params = new ArrayList<Object>();
		Session session = openSession();
		String sql = CustomSQLUtil.get(FIND_BY_CUSTOMCONDITION);
		sql = sql.replace("[$COMPANY_FILTER$]", " AND GROUPID = ?");
		params.add(serviceContext.getScopeGroupId());
		if (dataCode != null && !"".equals(dataCode)) {
			sql = sql.replace("[$DATACODE_FILTER$]", " AND (LOWER(DATACODE) LIKE ? OR LOWER(TITLE) LIKE ?)");
			params.add("%" + dataCode.toLowerCase() + "%");		
			params.add("%" + dataCode.toLowerCase() + "%");	
		}
		else {
			sql = sql.replace("[$DATACODE_FILTER$]", "");
		}
		if (collectionName != null && !"".equals(collectionName)) {
			sql = sql.replace("[$COLLECTIONNAME_FILTER$]", " AND COLLECTIONNAME = ?");
			params.add(collectionName);			
		}
		else {
			sql = sql.replace("[$COLLECTIONNAME_FILTER$]", "");
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
		if (datalevel != -1 && datalevel <= 5 && datalevel >= 1) {
			String node = "NODE_" + datalevel;
			sql = sql.replace("[$NODE_FILTER$]", " AND " + node + " = ?");
			params.add(dataCodeParent);						
		}
		else {
			sql = sql.replace("[$NODE_FILTER$]", "");			
		}
		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity("DictData", DictDataImpl.class);
		if (params != null && params.size() > 0) {
			for (int index = 0; index < params.size(); index++) {
				query.setString(index, String.valueOf(params.get(index)));
			}
		}
		
		return (List<DictData>) QueryUtil.list(query, getDialect(), startIndex, endIndex);
	}
	
	public int countByGroupCustomCondition(String dataCode, String collectionName,String dataCodeParent, int datalevel, Date validatedFrom, Date validatedTo, int status, ServiceContext serviceContext) {
		List<Object> params = new ArrayList<Object>();
		Session session = openSession();
		String sql = CustomSQLUtil.get(COUNT_BY_CUSTOMCONDITION);		
		sql = sql.replace("[$COMPANY_FILTER$]", " AND GROUPID = ?");
		params.add(serviceContext.getScopeGroupId());
		
		if (dataCode != null && !"".equals(dataCode)) {
			sql = sql.replace("[$DATACODE_FILTER$]", " AND (LOWER(DATACODE) LIKE ? OR LOWER(TITLE) LIKE ?)");
			params.add("%" + dataCode.toLowerCase() + "%");		
			params.add("%" + dataCode.toLowerCase() + "%");	
		}
		else {
			sql = sql.replace("[$DATACODE_FILTER$]", "");
		}
		if (collectionName != null && !"".equals(collectionName)) {
			sql = sql.replace("[$COLLECTIONNAME_FILTER$]", " AND COLLECTIONNAME = ?");
			params.add(collectionName);			
		}
		else {
			sql = sql.replace("[$COLLECTIONNAME_FILTER$]", "");
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
		if (datalevel != -1 && datalevel <= 5 && datalevel >= 1) {
			String node = "NODE_" + datalevel;
			sql = sql.replace("[$NODE_FILTER$]", " AND " + node + " = ?");
			params.add(dataCodeParent);						
		}
		else {
			sql = sql.replace("[$NODE_FILTER$]", "");			
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
