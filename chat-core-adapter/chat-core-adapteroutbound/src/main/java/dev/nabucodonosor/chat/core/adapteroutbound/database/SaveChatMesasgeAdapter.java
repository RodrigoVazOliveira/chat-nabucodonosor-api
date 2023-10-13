package dev.nabucodonosor.chat.core.adapteroutbound.database;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import dev.nabucodonosor.chat.core.adapteroutbound.database.entity.MessageChatEntity;
import dev.nabucodonosor.chat.core.adapteroutbound.database.repository.ChatMessageRepositoryDatabase;
import dev.nabucodonosor.chat.core.adapteroutbound.mapper.ConvertChatMessageToMessageChatEntity;
import dev.nabucodonosor.chat.core.adapteroutbound.mapper.ConvertMessageChatEntityToChatMessageData;
import dev.nabucodonosor.chat.core.aplication.domain.ChatMessageData;
import dev.nabucodonosor.chat.core.portoutbound.persistence.ChatMessageDataPersistencePortOutbound;

@Service
public class SaveChatMesasgeAdapter implements ChatMessageDataPersistencePortOutbound {
	private final static Logger LOGGER = LoggerFactory.getLogger(SaveChatMesasgeAdapter.class);
	private final ChatMessageRepositoryDatabase chatMessageRepositoryDatabase;
	private final ConvertChatMessageToMessageChatEntity convertChatMessageToMessageChatEntity;
	private final ConvertMessageChatEntityToChatMessageData chatEntityToChatMessageData;

	public SaveChatMesasgeAdapter(ChatMessageRepositoryDatabase chatMessageRepositoryDatabase,
			ConvertChatMessageToMessageChatEntity convertChatMessageToMessageChatEntity,
			ConvertMessageChatEntityToChatMessageData chatEntityToChatMessageData) {
		this.chatMessageRepositoryDatabase = chatMessageRepositoryDatabase;
		this.convertChatMessageToMessageChatEntity = convertChatMessageToMessageChatEntity;
		this.chatEntityToChatMessageData = chatEntityToChatMessageData;
	}

	@Override
	public ChatMessageData save(ChatMessageData chatMessageData) {
		final MessageChatEntity messageChatEntity = convertChatMessageToMessageChatEntity.execute(chatMessageData);
		MessageChatEntity messageChatEntitySaved = chatMessageRepositoryDatabase.save(messageChatEntity);
		LOGGER.info("messageChatEntitySaved: {}", messageChatEntitySaved.toJson());

		return chatEntityToChatMessageData.execute(messageChatEntitySaved);
	}

}
