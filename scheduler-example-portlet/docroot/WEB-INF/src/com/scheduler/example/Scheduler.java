package com.scheduler.example;

import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageListener;
import com.liferay.portal.kernel.messaging.MessageListenerException;

public class Scheduler implements MessageListener {

	@Override
	public void receive(Message arg0) throws MessageListenerException {
		// TODO Auto-generated method stub
		System.out.println("Execute one minute");
	}

}
