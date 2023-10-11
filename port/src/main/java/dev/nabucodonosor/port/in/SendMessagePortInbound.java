package dev.nabucodonosor.port.in;

import dev.nabucodonosor.core.request.MessageChatDataRequest;

/**
 * Port to send message to send message
 * 
 * @author RodrigoVazOliveira
 * 
 */
public interface SendMessagePortInbound {

	/**
	 * method will be send message to destination
	 * 
	 * @author RodrigoVazOliveira
	 * @param messageChatDataRequest data is will be send
	 */
	void execute(final MessageChatDataRequest messageChatDataRequest);
}