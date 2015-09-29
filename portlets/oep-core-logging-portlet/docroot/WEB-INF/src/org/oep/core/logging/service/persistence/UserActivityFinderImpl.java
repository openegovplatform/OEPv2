/**
 * Copyright (c) 2015 by Open eGovPlatform (http://http://openegovplatform.org/).
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.oep.core.logging.service.persistence;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.oep.core.logging.model.UserActivity;
import org.oep.core.logging.model.impl.UserActivityImpl;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.CalendarUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;

public class UserActivityFinderImpl extends BasePersistenceImpl<UserActivity> implements UserActivityFinder{
	
	public static final String GET_USERACTIVITY_BY_PARAM = UserActivityFinderImpl.class.getName()+ ".getUserActivity";
	public static final String COUNT_USERACTIVITY_BY_PARAM = UserActivityFinderImpl.class.getName()+ ".countUserActivity";
	public static final String GET_DISTINCT_ACTION=UserActivityFinderImpl.class.getName()+ ".getDistinctAction";
	/** 
	 * This method find UserActivity by action,createdate
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  20-September-2015  ThongDV    Create new
	 * @param action
	 * @param fromDate
	 * @param toDate
	 * @param begin
	 * @param end
	 * @return List<UserActivity>
	 * @throws SystemException 
	 */
	public List<UserActivity> getByParam(long companyId,long groupId,String action, Date fromDate, Date toDate,int begin, int end) throws SystemException{
		Session session = null;
		try {
			session=openSession();
			String sql= getQuery(CustomSQLUtil.get(GET_USERACTIVITY_BY_PARAM), action, fromDate, toDate);
			log.info("SQL query: "+sql);
			SQLQuery query = session.createSQLQuery(sql);
			query.addEntity("oep_logging_useractivity", UserActivityImpl.class);
			QueryPos queryPos = QueryPos.getInstance(query);
			setParam(companyId,groupId,queryPos,  action, fromDate, toDate); 
			return (List<UserActivity>) QueryUtil.list(query, getDialect(), begin, end);
		} catch (Exception e) {
			throw new SystemException(e);
		}finally{
			closeSession(session);
		}
	}
	
	/** 
	 * This method count UserActivity by parameter with custom sql
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  20-September-2015  ThongDV    Create new
	 * @param action
	 * @param fromDate
	 * @param toDate
	 * @param begin
	 * @param end
	 * @return Integer
	 */
	public int countByParam(long companyId,long groupId,String action, Date fromDate, Date toDate) throws SystemException{
		Session session = null;
		try {
			session= openSession();
			String strQuery = getQuery(CustomSQLUtil.get(COUNT_USERACTIVITY_BY_PARAM), action, fromDate, toDate);
			log.info("SQL query: "+strQuery);
			log.info("fromDate: "+fromDate+"--toDate: "+toDate);
			SQLQuery query = session.createSQLQuery(strQuery);
			query.addScalar("total", Type.LONG);
			QueryPos queryPos = QueryPos.getInstance(query);
			setParam(companyId,groupId,queryPos, action, fromDate, toDate);
			Long total= (Long) query.uniqueResult();
			log.info("result: total="+total);
			
			Iterator<Long> itr = query.iterate();
			if (itr.hasNext()){
				Long count = (Long)itr.next();
				if (count != null) {
					return count.intValue();
				}
			}
			return 0;
		} catch (Exception e) {
			  throw new SystemException(e);
		}finally{
			closeSession(session);
		}
		
	}
	
	 /** 
	 * This method get string query
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  20-September-2015  ThongDV    Create new
	 * @param action
	 * @param fromDate
	 * @param toDate
	 * @return String
	  */
	private String getQuery(String strQuery,String action, Date fromDate, Date toDate){
		String query= strQuery;
		if(action !=null && !"".equals(action)){
			query = StringUtil.replace(query, "[$ACTION$]", "AND action=?");
		} else {
			query = StringUtil.replace(query, "[$ACTION$]", StringPool.BLANK);
		}
		if(fromDate != null){
			query = StringUtil.replace(query, "[$CREATEDATE_BEGIN$]", " AND createDate>=?");
		} else {
			query = StringUtil.replace(query, "[$CREATEDATE_BEGIN$]", StringPool.BLANK);
		}
		if(toDate != null){
			query = StringUtil.replace(query, "[$CREATEDATE_END$]", " AND createDate<=?");
		} else{
			query = StringUtil.replace(query, "[$CREATEDATE_END$]", StringPool.BLANK);
		}
		return query;
	}
	
	/** 
	 * This method set parameter for sql query
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  20-September-2015  ThongDV    Create new
	 * @param action
	 * @param fromDate
	 * @param toDate
	 */
	private void setParam(long companyId,long groupId,QueryPos queryPos,String action, Date fromDate, Date toDate ){
		queryPos.add(companyId);
		queryPos.add(groupId);
		if(action!=null && !("").equals(action)){
			queryPos.add(action);
		}
		if(fromDate!=null){
			Timestamp fromDateTS= CalendarUtil.getTimestamp(fromDate);
			queryPos.add(fromDateTS);
		}
		if(toDate!=null){
			Timestamp toDateTS= CalendarUtil.getTimestamp(toDate);
			queryPos.add(toDateTS);
		}
	}
	
	public List<String> getDistinctAction(long companyId,long groupId) throws SystemException{
		Session session=null;
		try {
			session= openSession();
			SQLQuery query= session.createSQLQuery(CustomSQLUtil.get(GET_DISTINCT_ACTION));
			query.addScalar("action", Type.STRING);
			QueryPos queryPos = QueryPos.getInstance(query);
			queryPos.add(companyId);
			queryPos.add(groupId);
			return (List<String>)QueryUtil.list(query, getDialect(), -1, -1);
		} catch (Exception e) {
			throw new SystemException(e);
		}finally{
			closeSession(session);
		}
	}
	private Log  log= LogFactoryUtil.getLog(UserActivityFinderImpl.class);
}
