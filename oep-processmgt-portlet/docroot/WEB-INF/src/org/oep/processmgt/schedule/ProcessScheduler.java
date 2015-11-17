package org.oep.processmgt.schedule;

import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageListener;
import com.liferay.portal.kernel.messaging.MessageListenerException;
import com.liferay.portal.util.PortalUtil;

public class ProcessScheduler implements MessageListener {

	@Override
	public void receive(Message message) throws MessageListenerException {
		// TODO Auto-generated method stub
		System.out.println("ProcessScheduler processing");
		long companyId = PortalUtil.getDefaultCompanyId();
		System.out.println("Company Id: " + companyId);
	}

}
