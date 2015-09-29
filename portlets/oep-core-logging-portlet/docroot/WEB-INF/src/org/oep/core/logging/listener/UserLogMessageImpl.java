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

package org.oep.core.logging.listener;

import java.util.Date;

import org.oep.core.logging.UserLogKeys;
import org.oep.core.logging.model.NewUserLog;
import org.oep.core.logging.model.UserActivity;
import org.oep.core.logging.service.NewUserLogLocalServiceUtil;
import org.oep.core.logging.service.UserActivityLocalServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageListener;
import com.liferay.portal.kernel.messaging.MessageListenerException;

public class UserLogMessageImpl implements MessageListener {

	@Override
	public void receive(Message message) throws MessageListenerException {
		String action = message.getString(UserLogKeys.UserActivityMessageKeys.ACTION);
		String description = message.getString(UserLogKeys.UserActivityMessageKeys.DESCRIPTION);
		
		long userId = message.getLong(UserLogKeys.UserActivityMessageKeys.USER_ID);
		long groupId = message.getLong(UserLogKeys.UserActivityMessageKeys.GROUP_ID);
		long companyId = message.getLong(UserLogKeys.UserActivityMessageKeys.COMPANY_ID);
		
		String email  = message.getString(UserLogKeys.UserActivityMessageKeys.EMAIL);
		String userName  = message.getString(UserLogKeys.UserActivityMessageKeys.USER_NAME);
		Date createDate = (Date) message.get(UserLogKeys.UserActivityMessageKeys.CREATE_DATE);
		String site = message.getString(UserLogKeys.UserActivityMessageKeys.SITE);
		String page  = message.getString(UserLogKeys.UserActivityMessageKeys.PAGE);
		String ip = message.getString(UserLogKeys.UserActivityMessageKeys.IP);
		String sessionId = message.getString(UserLogKeys.UserActivityMessageKeys.SESSION_ID);
		String url = message.getString(UserLogKeys.UserActivityMessageKeys.URL);
		String userAgent = message.getString(UserLogKeys.UserActivityMessageKeys.USER_AGENT);
		try {
			log.info(action+"-----userId: "+userId+"--groupId:"+groupId+"--companyId: "+companyId
					+"--username: "+userName+"--email: "+email+"--createdate: "+createDate+"---description: "+description
					+"--site: "+site+"--page: "+page+"--ip: "+ip+"--url: "+url+"--useragent: "+userAgent);
			UserActivity userActivity= UserActivityLocalServiceUtil
					.addUserActivity(userId, groupId, companyId, createDate, userName, email, site, page, action, description, url, sessionId, ip, userAgent);
			log.info("--add new UserActivity success !");
			NewUserLog newUserLog= NewUserLogLocalServiceUtil.getByUserId(userId);
			if(newUserLog!=null){
				newUserLog=  NewUserLogLocalServiceUtil
						.updateNewUserLog(userId, groupId, companyId, createDate, userName, email,
								site, page, action, description, userActivity.getId());
				log.info("update NewUserLog success !");
			}else{
				newUserLog=NewUserLogLocalServiceUtil
						.addNewUserLog(userId, groupId, companyId, createDate, userName, email, 
								site, page, action, description, userActivity.getId());
				log.info("insert NewUserLog success !");
			}
		} catch(Exception ex){
			log.error(ex);
		}
	}

	private Log log = LogFactoryUtil.getLog(UserLogMessageImpl.class);
}
