/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
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

package com.liferay.portal.kernel.messaging.sender;

import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageBus;

/**
 * @author Michael C. Han
 */
public class DefaultMessageSender implements MessageSender {

	public void send(String destinationName, Message message) {
		_messageBus.sendMessage(destinationName, message);
	}

	public void setMessageBus(MessageBus messageBus) {
		_messageBus = messageBus;
	}

	private MessageBus _messageBus;

}