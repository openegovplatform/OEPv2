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
import java.util.List;

import org.oep.core.logging.model.NewUserLog;
import org.oep.core.logging.model.impl.NewUserLogImpl;

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

public class NewUserLogFinderImpl extends BasePersistenceImpl<NewUserLog> implements NewUserLogFinder{
	
	public static final String GET_NEWUSERLOG_PARAM = NewUserLogFinderImpl.class.getName()+ ".getNewUserLog";
	public static final String COUNT_NEWUSERLOG_PARAM = NewUserLogFinderImpl.class.getName()+ ".countNewUserLog";
	 /** 
	 * This method get User's new log by parameter(search user activity)
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  20-September-2015  ThongDV    Create new
	 * @param keyWord
	 * @param isUsername
	 * @param isEmail
	 * @param fromDate
	 * @param toDate
	 * @param begin
	 * @param end
	 * @return List<NewUserLog>
	 */
	public List<NewUserLog>  getByParam(long companyId,long groupId,String keyWord,boolean isUsername, boolean isEmail,
				Date fromDate, Date toDate, int begin, int end) throws SystemException{
		Session session = null;
		try {
			session= openSession();
			String strQuery= getQuery(CustomSQLUtil.get(GET_NEWUSERLOG_PARAM),keyWord,isUsername, isEmail, fromDate, toDate);
			log.info("SQL query: "+strQuery);
			SQLQuery query = session.createSQLQuery(strQuery);
			query.addEntity("oep_logging_newuserlog", NewUserLogImpl.class);
			QueryPos queryPos= QueryPos.getInstance(query);
			setParam(companyId,groupId,queryPos, keyWord, isUsername, isEmail, fromDate, toDate);
			return (List<NewUserLog>)QueryUtil.list(query, getDialect(), begin, end);
		} catch (Exception e) {
			throw new SystemException(e);
		}finally{
			closeSession(session);
		}
		
	}
	
	/** 
	 * This method count User's new log with by list parameter (search user activity)
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  20-September-2015  ThongDV    Create new
	 * @param keyWord
	 * @param isUsername
	 * @param isEmail
	 * @param fromDate
	 * @param toDate
	 * @return Integer
	 */
	public int countByParam(long companyId,long groupId,String keyWord,boolean isUsername, boolean isEmail,
			Date fromDate, Date toDate)throws SystemException {
		Session session= null;
		try {
			session= openSession();
			String strQuery= getQuery(CustomSQLUtil.get(COUNT_NEWUSERLOG_PARAM), keyWord,  isUsername, isEmail, fromDate, toDate);
			log.info("SQL query: "+strQuery);
			SQLQuery query = session.createSQLQuery(strQuery);
			query.addScalar("total", Type.LONG);
			QueryPos queryPos= QueryPos.getInstance(query);
			setParam(companyId,groupId,queryPos, keyWord,isUsername, isEmail, fromDate, toDate);
			Long total = (Long)query.uniqueResult();
			log.info("result: total="+total);
			return total.intValue();
		} catch (Exception e) {
			throw new SystemException(e);
		}finally{
			closeSession(session);
		}
	}
	
	 /** 
	 * This is method get string query
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  20-September-2015  ThongDV    Create new
	 * @return String
	 * @param keyWord
	 * @param isUsername
	 * @param isEmail
	 * @param fromDate
	 * @param toDate
	 */
	private String getQuery(String strQuery,String keyWord, boolean isUsername, boolean isEmail, Date fromDate, Date toDate){
		String query = strQuery;
		if(fromDate != null){
			query = StringUtil.replace(query, "[$CREATEDATE_BEGIN$]", "AND createDate >=? ");
		}else{
			query = StringUtil.replace(query, "[$CREATEDATE_BEGIN$]", StringPool.BLANK);
		}
		if(toDate != null){
			query = StringUtil.replace(query, "[$CREATEDATE_END$]", "AND createDate<=?");
		}else{
			query = StringUtil.replace(query, "[$CREATEDATE_END$]", StringPool.BLANK);
		}
		String cond="AND";
		if(!"".equals(keyWord)) {
			if(isUsername){
				query = StringUtil.replace(query,"[$IS_USERNAME$]", "AND userName LIKE ?");
				cond = " OR ";
			}else{
				query = StringUtil.replace(query,"[$IS_USERNAME$]", StringPool.BLANK);
			}
			if(isEmail){
				query = StringUtil.replace(query,"[$IS_EMAIL$]", cond+" email LIKE ?");
			}else{
				query = StringUtil.replace(query,"[$IS_EMAIL$]", StringPool.BLANK);
			}
		} else {
			query = StringUtil.replace(query,"[$IS_USERNAME$]", StringPool.BLANK);
			query = StringUtil.replace(query,"[$IS_EMAIL$]", StringPool.BLANK);
		}		
		return query;
	}
	
	 /** 
	 * This is method set parameter for sql query
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  20-September-2015  ThongDV    Create new
	 * @param keyWord
	 * @param isUsername
	 * @param isEmail
	 * @param fromDate
	 * @param toDate
	 */
	private void setParam(long companyId, long groupId,QueryPos queryPos,String keyWord,boolean isUsername, boolean isEmail, Date fromDate, Date toDate ){
		queryPos.add(companyId);
		queryPos.add(groupId);
		if(fromDate != null) {
			Timestamp fromDateTS= CalendarUtil.getTimestamp(fromDate);
			queryPos.add(fromDateTS);
		}
		if(toDate != null) {
			Timestamp toDateTS= CalendarUtil.getTimestamp(toDate);
			queryPos.add(toDateTS);
		}
		if(!"".equals(keyWord)) {
			if(isUsername){
				queryPos.add("%" + keyWord + "%");
			}
			if(isEmail){
				queryPos.add("%" + keyWord + "%");
			}
		}
	}
	
	private Log log= LogFactoryUtil.getLog(NewUserLogFinderImpl.class);
		

}
