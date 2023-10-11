package dev.nabucodonosor.core.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dev.nabucodonosor.core.request.MessageChatDataRequest;
import dev.nabucodonosor.port.in.SendMessagePortInbound;

/**
 * Implementation default will be send message to chat in destiny
 * 
 * @author RodrigoVazOliveira
 * 
 */
public class SendMessageDefault implements SendMessagePortInbound {
	private final static Logger LOGGER = LoggerFactory.getLogger(SendMessageDefault.class);

	@Override
	public void execute(final MessageChatDataRequest messageChatDataRequest) {
		LOGGER.info("sending message");
		LOGGER.info("messageChatDataRequest:  {}", messageChatDataRequest.toJson());

	}

}
