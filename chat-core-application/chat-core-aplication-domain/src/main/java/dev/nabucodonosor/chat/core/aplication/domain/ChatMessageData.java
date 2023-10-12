package dev.nabucodonosor.chat.core.aplication.domain;

import java.time.LocalDateTime;

public record ChatMessageData(String sender, String message, LocalDateTime dateTimeSentMessage) {

}
