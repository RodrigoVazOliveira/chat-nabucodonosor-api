package dev.nabucodonosor.chat.core.aplication.domain;

import java.time.LocalDateTime;

import dev.nabucodonosor.chat.core.application.commons.Mapper;

public class ConvertChatMessageDataRequestToChatMessageData implements Mapper<ChatMessageDataRequest, ChatMessageData> {

	@Override
	public ChatMessageData execute(ChatMessageDataRequest chatMessageDataRequest) {
		return new ChatMessageData(null, chatMessageDataRequest.sender(), chatMessageDataRequest.message(),
				LocalDateTime.now());
	}

}