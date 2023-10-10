package dev.nabucodonosor.core.request;

/**
 * Request model to send message in chat to controller
 * 
 * @author RodrigoVazOliveira
 * 
 * @param sender  who it will be sending message
 * @param to      who it will be receive message sent
 * @param message message content that will be sending
 * 
 * @version 0.0.1
 */
public record MessageChatDataRequest(String sender, String to, String message) {

}
