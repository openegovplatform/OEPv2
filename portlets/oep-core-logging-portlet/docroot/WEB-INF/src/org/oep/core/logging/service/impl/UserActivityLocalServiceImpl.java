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

import org.oep.core.logging.UserLogKeys;
import org.oep.core.logging.model.UserActivity;
import org.oep.core.logging.service.base.UserActivityLocalServiceBaseImpl;
import org.oep.core.logging.util.ContextUtil;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageBusUtil;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

/**
 * The implementation of the user activity local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.oep.core.logging.userlog.dao.service.UserActivityLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author ThongDV
 * @see org.oep.core.logging.service.base.UserActivityLocalServiceBaseImpl
 * @see org.oep.core.logging.userlog.dao.service.UserActivityLocalServiceUtil
 */
public class UserActivityLocalServiceImpl
	extends UserActivityLocalServiceBaseImpl {
	

	/** 
	 * This function use message bus for add user's activity
	 * 
	 * Version: OEP 1.1
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  20-April-2015  ThongDV    Create new
	 * @param action
	 * @param description
	 * @param serviceContext
	 * @throws SystemException 
	 */
	public void log(String action, String description,ServiceContext serviceContext){
		try {
			User user=PortalUtil.getUser(serviceContext.getRequest());
			Message message = new Message();
			message.put(UserLogKeys.UserActivityMessageKeys.ACTION, action);
			message.put(UserLogKeys.UserActivityMessageKeys.DESCRIPTION, description);
			message.put(UserLogKeys.UserActivityMessageKeys.USER_ID, serviceContext.getUserId());
			message.put(UserLogKeys.UserActivityMessageKeys.GROUP_ID, serviceContext.getScopeGroupId());
			message.put(UserLogKeys.UserActivityMessageKeys.COMPANY_ID, serviceContext.getCompanyId());
			message.put(UserLogKeys.UserActivityMessageKeys.EMAIL, user.getEmailAddress());
			message.put(UserLogKeys.UserActivityMessageKeys.USER_NAME, user.getScreenName());
			message.put(UserLogKeys.UserActivityMessageKeys.CREATE_DATE, new Date());
			message.put(UserLogKeys.UserActivityMessageKeys.SITE, serviceContext.getThemeDisplay().getSiteGroupName());
			message.put(UserLogKeys.UserActivityMessageKeys.PAGE, ContextUtil.getPage(serviceContext.getThemeDisplay()));
			message.put(UserLogKeys.UserActivityMessageKeys.IP, user.getLogin());
			message.put(UserLogKeys.UserActivityMessageKeys.SESSION_ID, serviceContext.getRequest().getSession().getId());
			message.put(UserLogKeys.UserActivityMessageKeys.URL, serviceContext.getCurrentURL());
			message.put(UserLogKeys.UserActivityMessageKeys.USER_AGENT, serviceContext.getUserAgent());
			MessageBusUtil.sendMessage(UserLogKeys.DESTINATION, message);
		} catch (Exception e) {
			log.error(e);
		}
	}
	/** 
	 * This function add User's log to database
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
	 * @param url
	 * @param sessionId
	 * @param ip
	 * @param userAgent
	 * @throws PortalException 
	 * @throws SystemException
	 * @return UserActivity

	 */
	public UserActivity addUserActivity(long userId,long groupId,long companyId,Date createDate,String userName,String email,
			String site,String page,String action,String description,String url, String sessionId,String ip,String userAgent) 
			throws PortalException, SystemException {
		UserActivity userActivity= userActivityPersistence.create(CounterLocalServiceUtil.increment(UserActivity.class.getName()));
		userActivity.setUserId(userId);
		userActivity.setGroupId(groupId);
		userActivity.setCompanyId(companyId);
		userActivity.setCreateDate(createDate);
		userActivity.setUserName(userName);
		userActivity.setEmail(email);
		userActivity.setSite(site);
		userActivity.setPage(page);
		userActivity.setAction(action);
		userActivity.setDescription(description);
		userActivity.setUrl(url);
		userActivity.setSessionId(sessionId);
		userActivity.setIp(ip);
		userActivity.setUserAgent(userAgent);
		userActivityPersistence.update(userActivity);
		return userActivity;
	}
	
	/** 
	 * This function get list UserActivity by list parameter
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
	 * @throws PortalException, SystemException
	 * @return: List<UserActivity>

	 */
	public List<UserActivity> getByParam(String action, Date fromDate, Date toDate,
			ServiceContext serviceContext,int begin, int end) throws SystemException,PortalException{
		return userActivityFinder.getByParam(serviceContext.getCompanyId(),serviceContext.getScopeGroupId(),action, fromDate, toDate,  begin, end);
	}
	
	/** 
	 * This function count UserActivity by list parameter
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  20-September-2015  ThongDV    Create new
	 * @param: action
	 * @param: fromDate
	 * @param toDate
	 * @throws SystemException, PortalException 
	 * @return Integer

	 */
	public int countByParam(String action, Date fromDate, Date toDate,
			ServiceContext serviceContext) throws SystemException,PortalException{
		return userActivityFinder.countByParam(serviceContext.getCompanyId(),serviceContext.getScopeGroupId(),action, fromDate, toDate);
	}
	
	/** 
	 * This function get list action inside UserActivity table
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  20-September-2015  ThongDV    Create new
	 * @param: action
	 * @param: fromDate
	 * @param toDate
	 * @throws SystemException, PortalException 
	 * @return Integer

	 */
	public List<String> getDistinctAction(ServiceContext serviceContext) throws SystemException,PortalException{
		return userActivityFinder.getDistinctAction(serviceContext.getCompanyId(),serviceContext.getScopeGroupId());
	}
	
	/** 
	 * This function count log by userId
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  20-September-2015  ThongDV    Create new
	 * @param: action
	 * @param: fromDate
	 * @param toDate
	 * @throws SystemException, PortalException 
	 * @return Integer

	 */
	public int countByUserId(long userId) throws SystemException{
		return userActivityPersistence.countByU(userId);
	}
	
	/** 
	 * This function get list log by userId
	 * 
	 * Version: OEP 2.0
	 *  
	 * History: 
	 *   DATE        AUTHOR      DESCRIPTION 
	 *  ------------------------------------------------- 
	 *  20-September-2015  ThongDV    Create new
	 * @param: action
	 * @param: fromDate
	 * @param toDate
	 * @throws SystemException, PortalException 
	 * @return Integer

	 */
	public List<UserActivity> getByUserId(long userId,int begin,int end) throws SystemException{
		return userActivityPersistence.findByU(userId, begin,end);
	}
	private Log log= LogFactoryUtil.getLog(UserActivityLocalServiceImpl.class);
}