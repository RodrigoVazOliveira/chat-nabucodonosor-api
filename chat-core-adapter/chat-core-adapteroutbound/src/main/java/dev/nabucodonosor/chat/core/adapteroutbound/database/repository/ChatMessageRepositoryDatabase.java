package dev.nabucodonosor.chat.core.adapteroutbound.database.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dev.nabucodonosor.chat.core.adapteroutbound.database.entity.MessageChatEntity;

@Repository
public interface ChatMessageRepositoryDatabase extends CrudRepository<MessageChatEntity, Long> {

}
