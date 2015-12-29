package org.oep.usermgt.service.persistence;


import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;

import com.liferay.portal.model.Role;

import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;

public class JobPos2RoleFinderImpl extends BasePersistenceImpl implements JobPos2RoleFinder{
	private static final String FIND_BY_JOBPOSID = JobPos2RoleFinder.class.getName() + ".findRoleByJobPosId";
	private static final String FIND_BY_NOTINJOBPOSID = JobPos2RoleFinder.class.getName() + ".findRoleNotInJobPosId";
	public List<Role> findRoleByJobPosId(long jobPosId) {
		List<Object> params = new ArrayList<Object>();
		Session session = openSession();
		String sql = CustomSQLUtil.get(FIND_BY_JOBPOSID);
		params.add(jobPosId);		
		System.out.println(sql);
		System.out.println(FIND_BY_JOBPOSID);
		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity("Role_", Role.class);
		if (params != null && params.size() > 0) {
			for (int index = 0; index < params.size(); index++) {
				query.setString(index, String.valueOf(params.get(index)));
			}
		}
		if (query.list() != null){
			return (List<Role>) query.list();
		}
		return new ArrayList<Role>();
		//return (List<WorkingUnit>) query.list();
	}
	public List<Role> findRoleNotInJobPosId(long jobPosId) {
		List<Object> params = new ArrayList<Object>();
		Session session = openSession();
		String sql = CustomSQLUtil.get(FIND_BY_NOTINJOBPOSID);
		params.add(jobPosId);		
		
		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity("Role_", Role.class);
		if (params != null && params.size() > 0) {
			for (int index = 0; index < params.size(); index++) {
				query.setString(index, String.valueOf(params.get(index)));
			}
		}
		if (query.list() != null){
			return (List<Role>) query.list();
		}
		return new ArrayList<Role>();
		//return (List<WorkingUnit>) query.list();
	}
	
}
