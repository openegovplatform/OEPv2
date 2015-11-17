package org.oep.processmgt.service.persistence;

import java.util.ArrayList;
import java.util.List;

import org.oep.processmgt.util.CustomSQLUtil;
import org.oep.processmgt.model.ProcessOrder;
import org.oep.processmgt.model.impl.ProcessOrderImpl;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class ProcessOrderFinderImpl extends BasePersistenceImpl implements ProcessOrderFinder {
	private static final String FIND_ALL_CAN_AUTOCONDITION = "findAllCanAutoCondition";
	private static final String COUNT_ALL_CAN_AUTOCONDITION = "countAllCanAutoCondition";
	private static final String FIND_BY_WAITING_PROCESSED = "findByWaitingProcessed";
	private static final String COUNT_BY_WAITING_PROCESSED = "countByWaitingProcessed";
	
	public int countAllCanAutoCondition(ServiceContext serviceContext) {
		List<Object> params = new ArrayList<Object>();
		Session session = openSession();
		String sql = CustomSQLUtil.get(ProcessOrder.class.getName(), COUNT_ALL_CAN_AUTOCONDITION);		
		sql = sql.replace("[$COMPANY_FILTER$]", " AND COMPANYID = ?");
		params.add(serviceContext.getCompanyId());
				
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
	
	public List<ProcessOrder> findAllCanAutoCondition(int startIndex, int endIndex, ServiceContext serviceContext) {
		List<Object> params = new ArrayList<Object>();
		Session session = openSession();
		String sql = CustomSQLUtil.get(ProcessOrderFinder.class.getName(), FIND_ALL_CAN_AUTOCONDITION);
		sql = sql.replace("[$COMPANY_FILTER$]", " AND COMPANYID = ?");
		params.add(serviceContext.getCompanyId());
		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity("ProcessOrder", ProcessOrderImpl.class);
		
		if (params != null && params.size() > 0) {
			for (int index = 0; index < params.size(); index++) {
				query.setString(index, String.valueOf(params.get(index)));
			}
		}
		
		return (List<ProcessOrder>) QueryUtil.list(query, getDialect(), startIndex, endIndex);
	}

	public List<ProcessOrder> findAllCanAutoCondition(ServiceContext serviceContext) {
		List<Object> params = new ArrayList<Object>();
		Session session = openSession();
		String sql = CustomSQLUtil.get(ProcessOrderFinder.class.getName(), FIND_ALL_CAN_AUTOCONDITION);
		sql = sql.replace("[$COMPANY_FILTER$]", " AND COMPANYID = ?");
		params.add(serviceContext.getCompanyId());
		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity("ProcessOrder", ProcessOrderImpl.class);
		
		if (params != null && params.size() > 0) {
			for (int index = 0; index < params.size(); index++) {
				query.setString(index, String.valueOf(params.get(index)));
			}
		}
		
		return (List<ProcessOrder>) query.list();
	}

	public List<ProcessOrder> findAllCanAutoCondition(long companyId) {
		List<Object> params = new ArrayList<Object>();
		Session session = openSession();
		String sql = CustomSQLUtil.get(ProcessOrderFinder.class.getName(), FIND_ALL_CAN_AUTOCONDITION);
		sql = sql.replace("[$COMPANY_FILTER$]", " AND COMPANYID = ?");
		params.add(companyId);
		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity("ProcessOrder", ProcessOrderImpl.class);
		
		if (params != null && params.size() > 0) {
			for (int index = 0; index < params.size(); index++) {
				query.setString(index, String.valueOf(params.get(index)));
			}
		}
		
		return (List<ProcessOrder>) query.list();
	}

	public int countByWaitingProcessed(long userId, ServiceContext serviceContext) {
		List<Object> params = new ArrayList<Object>();
		Session session = openSession();
		String sql = CustomSQLUtil.get(ProcessOrder.class.getName(), COUNT_BY_WAITING_PROCESSED);		
		sql = sql.replace("[$COMPANY_FILTER$]", " AND COMPANYID = ?");
		params.add(serviceContext.getCompanyId());
		
		sql = sql.replace("[$ASSIGN_USER$]", " AND (ASSIGNTOUSERID = ? OR USERID = ?)");
		params.add(userId);
		params.add(userId);
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
	
	public List<ProcessOrder> findByWaitingProcessed(long userId, int startIndex, int endIndex, ServiceContext serviceContext) {
		List<Object> params = new ArrayList<Object>();
		Session session = openSession();
		String sql = CustomSQLUtil.get(ProcessOrderFinder.class.getName(), FIND_BY_WAITING_PROCESSED);
		sql = sql.replace("[$COMPANY_FILTER$]", " AND COMPANYID = ?");
		params.add(serviceContext.getCompanyId());

		sql = sql.replace("[$ASSIGN_USER$]", " AND (ASSIGNTOUSERID = ? OR USERID = ?)");
		params.add(userId);
		params.add(userId);

		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity("ProcessOrder", ProcessOrderImpl.class);
		
		if (params != null && params.size() > 0) {
			for (int index = 0; index < params.size(); index++) {
				query.setString(index, String.valueOf(params.get(index)));
			}
		}
		
		return (List<ProcessOrder>) QueryUtil.list(query, getDialect(), startIndex, endIndex);
	}
	
}
