package dev.nabucodonosor.core.domain;

import java.time.LocalDateTime;

/**
 * Domain model the message to chat
 * 
 * 
 * @author RodrigoVazOliveira <br />
 * @param sender  who it will be sending message
 * @param to      who it will be receive message sent
 * @param message content message to sent
 * @param date    time to sent message
 * 
 * 
 * @version 0.0.1
 *
 */
public record MessageChatData(String sender, String to, String message, LocalDateTime dateTimeSent) {

}
