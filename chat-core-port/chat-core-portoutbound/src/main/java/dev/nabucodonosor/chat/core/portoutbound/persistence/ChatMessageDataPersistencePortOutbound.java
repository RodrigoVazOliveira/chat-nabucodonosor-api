package dev.nabucodonosor.chat.core.portoutbound.persistence;

import dev.nabucodonosor.chat.core.aplication.domain.ChatMessageData;

public interface ChatMessageDataPersistencePortOutbound {

	/**
	 * Persistence chat message data
	 *
	 * @param chatMessageData datas of the message
	 * @return chatMessageData with id
	 */
	ChatMessageData save(ChatMessageData chatMessageData);
}
