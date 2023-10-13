package dev.nabucodonosor.chat.core.adapteroutbound.database.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.Immutable;

import dev.nabucodonosor.chat.core.application.commons.JsonHelper;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Immutable
@Table(name = "message_chat")
public class MessageChatEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private final Long id;

	@Column(nullable = false, length = 400)
	private final String sender;

	@Column(columnDefinition = "TEXT")
	private final String message;

	@Column(name = "date_time_sent")
	private final LocalDateTime dateTimeSent;

	public MessageChatEntity(Long id, String sender, String message, LocalDateTime dateTimeSent) {
		this.id = id;
		this.sender = sender;
		this.message = message;
		this.dateTimeSent = dateTimeSent;
	}

	public Long getId() {
		return id;
	}

	public String getSender() {
		return sender;
	}

	public String getMessage() {
		return message;
	}

	public LocalDateTime getDateTimeSent() {
		return dateTimeSent;
	}

	public String toJson() {
		return JsonHelper.toJson(this);
	}

}
