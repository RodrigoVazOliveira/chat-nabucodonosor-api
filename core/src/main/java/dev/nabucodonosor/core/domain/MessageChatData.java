package dev.nabucodonosor.core.domain;

import java.time.LocalDateTime;

/**
 * Domain model the message to chat
 * 
 * 
 * @author RodrigoVazOliveira <br />
 * @param sender  who send message
 * @param message to is sending
 * @param date    time to sent message
 * 
 * @return Objects MessageChatData
 *
 */
public record MessageChatData(String sender, String message, LocalDateTime dateTimeSent) {

}
