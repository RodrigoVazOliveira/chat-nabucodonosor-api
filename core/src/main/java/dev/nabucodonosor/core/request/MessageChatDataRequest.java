package dev.nabucodonosor.core.request;

import dev.nabucodonosor.commons.helper.JsonHelper;
import jakarta.validation.constraints.NotBlank;

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
public record MessageChatDataRequest(@NotBlank(message = "O campo sender deve ser preenchido!") String sender,
		@NotBlank(message = "O campo to deve ser preenchido!") String to,
		@NotBlank(message = "O campo message deve ser preenchido!") String message) {

	public String toJson() {
		return JsonHelper.toJson(this);
	}

}
