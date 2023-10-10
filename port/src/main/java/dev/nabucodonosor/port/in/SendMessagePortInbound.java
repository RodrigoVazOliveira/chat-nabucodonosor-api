package dev.nabucodonosor.port.in;

import dev.nabucodonosor.core.request.MessageChatDataRequest;

public interface SendMessagePortInbound {
	void execute(MessageChatDataRequest messageChatDataRequest);
}