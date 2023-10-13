package dev.nabucodonosor.chat.core.adapterinbound.socket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import dev.nabucodonosor.chat.core.aplication.domain.ChatMessageData;
import dev.nabucodonosor.chat.core.aplication.domain.ChatMessageDataRequest;
import dev.nabucodonosor.chat.core.aplication.domain.ConvertChatMessageDataRequestToChatMessageData;
import dev.nabucodonosor.chat.core.portinbound.SendMessagePortInbound;
import jakarta.validation.Valid;

@Controller
public class ChatMessagePortInboundAdapter implements SendMessagePortInbound {
	private final static Logger LOGGER = LoggerFactory.getLogger(ChatMessagePortInboundAdapter.class);
	private final ConvertChatMessageDataRequestToChatMessageData chatMessageDataMapper;

	public ChatMessagePortInboundAdapter(ConvertChatMessageDataRequestToChatMessageData chatMessageDataMapper) {
		this.chatMessageDataMapper = chatMessageDataMapper;
	}

	@Override
	@MessageMapping("chat.message")
	@SendTo("/topic/chat.receive")
	public ChatMessageData sendMessage(@Payload @Valid final ChatMessageDataRequest chatMessageDataRequest) {
		LOGGER.info("Sending message");
		LOGGER.info("chatMessageDataRequest: {}", chatMessageDataRequest.toJson());

		return chatMessageDataMapper.execute(chatMessageDataRequest);
	}
}