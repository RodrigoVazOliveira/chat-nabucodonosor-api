package dev.nabucodonosor.chat.core.adapteroutbound.mapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import dev.nabucodonosor.chat.core.adapteroutbound.database.entity.MessageChatEntity;
import dev.nabucodonosor.chat.core.aplication.domain.ChatMessageData;
import dev.nabucodonosor.chat.core.application.commons.Mapper;

@Component
public class ConvertChatMessageToMessageChatEntity implements Mapper<ChatMessageData, MessageChatEntity> {
	private final static Logger LOGGER = LoggerFactory.getLogger(ConvertChatMessageToMessageChatEntity.class);

	@Override
	public MessageChatEntity execute(ChatMessageData chatMessageData) {
		LOGGER.info("convert ChatMessageData to entity");
		return new MessageChatEntity(null, chatMessageData.sender(), chatMessageData.message(),
				chatMessageData.dateTimeSentMessage());
	}

}
