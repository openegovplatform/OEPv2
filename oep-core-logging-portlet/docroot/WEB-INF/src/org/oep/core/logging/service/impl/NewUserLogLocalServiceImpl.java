/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package org.oep.core.logging.service.impl;

import java.util.Date;
import java.util.List;

import org.oep.core.logging.NoSuchNewUserLogException;
import org.oep.core.logging.model.NewUserLog;
import org.oep.core.logging.service.base.NewUserLogLocalServiceBaseImpl;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.ServiceContext;

/**
 * The implementation of the new user log local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.core.logging.userlog.dao.service.NewUserLogLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author ThongDV
 * @see org.oep.core.logging.service.base.NewUserLogLocalServiceBaseImpl
 * @see org.oep.core.logging.userlog.dao.service.NewUserLogLocalServiceUtil
 */
public class NewUserLogLocalServiceImpl extends NewUserLogLocalServiceBaseImpl {
	

	/** 
	 * This method add User's new log
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  20-September-2015  ThongDV    Create new
	 * @param userId
	 * @param groupId
	 * @param companyId
	 * @param createDate
	 * @param username
	 * @param email
	 * @param siter
	 * @param page
	 * @param action
	 * @param description
	 * @param userActivityId
	 * @throws PortalException 
	 * @throws SystemException
	 * @return NewUserLog 

	 */
	public NewUserLog addNewUserLog(long userId,long groupId,long companyId,Date createDate,String userName,String email,
			String site,String page,String action,String description,long userActivityId)
					throws SystemException, PortalException{
		NewUserLog newUserLog= newUserLogPersistence.create(CounterLocalServiceUtil.increment(NewUserLog.class.getName()));
		newUserLog.setUserId(userId);
		newUserLog.setGroupId(groupId);
		newUserLog.setCompanyId(companyId);
		newUserLog.setCreateDate(createDate);
		newUserLog.setUserName(userName);
		newUserLog.setEmail(email);
		newUserLog.setSite(site);
		newUserLog.setPage(page);
		newUserLog.setAction(action);
		newUserLog.setDescription(description);
		newUserLog.setUserActivityId(userActivityId);
		newUserLogPersistence.update(newUserLog);
		return newUserLog;
	}
	
	/** 
	 * This method update User's new log
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  20-September-2015  ThongDV    Create new
	 * @param userId
	 * @param groupId
	 * @param companyId
	 * @param createDate
	 * @param username
	 * @param email
	 * @param siter
	 * @param page
	 * @param action
	 * @param description
	 * @param userActivityId
	 * @throws PortalException 
	 * @throws SystemException
	 * @return NewUserLog 
	 */
	public NewUserLog updateNewUserLog(long userId,long groupId,long companyId,Date createDate,String userName,String email,
			String site,String page,String action,String description,long userActivityId)
					throws SystemException, PortalException{
		NewUserLog newUserLog= null;
		try {
			newUserLog= newUserLogPersistence.findByU(userId);
		} catch (NoSuchNewUserLogException e) {
			throw e;
		}
		newUserLog.setCompanyId(companyId);
		newUserLog.setGroupId(groupId);
		newUserLog.setCreateDate(createDate);
		newUserLog.setUserName(userName);
		newUserLog.setEmail(email);
		newUserLog.setSite(site);
		newUserLog.setPage(page);
		newUserLog.setAction(action);
		newUserLog.setDescription(description);
		newUserLog.setUserActivityId(userActivityId);
		newUserLogPersistence.update(newUserLog);
		return newUserLog;
	}
	/** 
	 * This method count User's new log by list parameter
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  20-September-2015  ThongDV    Create new
	 * @param keyWord
	 * @param isUserName
	 * @param isEmail
	 * @param fromDate
	 * @param toDate
	 * @throws SystemException, PortalException
	 * @return Integer
	 */
	public int countByParam(String keyWord, boolean isUserName, boolean isEmail, 
			Date fromDate, Date toDate,ServiceContext serviceContext) throws SystemException{
		return newUserLogFinder.countByParam(serviceContext.getCompanyId(), serviceContext.getScopeGroupId(),keyWord,isUserName, isEmail,fromDate, toDate);
	}
	
	/** 
	 * This method get list record User's new log by list parameter
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  20-September-2015  ThongDV    Create new
	 * @param keyWord
	 * @param isUserName
	 * @param isEmail
	 * @param fromDate
	 * @param toDate
	 * @throws SystemException, PortalException
	 * @return List<NewUserLog>
	 */
	public List<NewUserLog> getByParam(String keyWord, boolean isUserName, boolean isEmail,
			Date fromDate, Date toDate,ServiceContext serviceContext, int begin, int end) throws SystemException{
		return newUserLogFinder.getByParam(serviceContext.getCompanyId(), serviceContext.getScopeGroupId(),keyWord, isUserName, isEmail,fromDate, toDate,begin,end);
	}
	
	/** 
	 * This method get User's new log by userId
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  20-September-2015  ThongDV    Create new
	 * @param: userId
	 * @throws SystemException
	 * @return: NewUserLog
	 */
	public NewUserLog getByUserId(long userId) throws SystemException {
		return newUserLogPersistence.fetchByU(userId);
	}
}