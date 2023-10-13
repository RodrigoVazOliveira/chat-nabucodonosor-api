package dev.nabucodonosor.chat.core.adapteroutbound.mapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import dev.nabucodonosor.chat.core.adapteroutbound.database.entity.MessageChatEntity;
import dev.nabucodonosor.chat.core.aplication.domain.ChatMessageData;
import dev.nabucodonosor.chat.core.application.commons.Mapper;

@Component
public class ConvertMessageChatEntityToChatMessageData implements Mapper<MessageChatEntity, ChatMessageData> {
	private final static Logger LOGGER = LoggerFactory.getLogger(ConvertMessageChatEntityToChatMessageData.class);

	@Override
	public ChatMessageData execute(MessageChatEntity messageChatEntity) {
		LOGGER.info("convert messageChatEntity to chatMessageData");
		return new ChatMessageData(messageChatEntity.getId(), messageChatEntity.getSender(),
				messageChatEntity.getMessage(), messageChatEntity.getDateTimeSent());
	}
}
