package dev.nabucodonosor.chat.core.portinbound;

import dev.nabucodonosor.chat.core.aplication.domain.ChatMessageData;
import dev.nabucodonosor.chat.core.aplication.domain.ChatMessageDataRequest;

public interface SendMessagePortInbound {
	ChatMessageData execute(final ChatMessageDataRequest chatMessageDataRequest);
}
