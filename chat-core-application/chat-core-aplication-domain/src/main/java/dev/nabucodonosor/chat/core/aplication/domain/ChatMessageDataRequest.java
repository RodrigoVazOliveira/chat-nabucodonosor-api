package dev.nabucodonosor.chat.core.aplication.domain;

import dev.nabucodonosor.chat.core.application.commons.JsonHelper;
import jakarta.validation.constraints.NotBlank;

public record ChatMessageDataRequest(@NotBlank(message = "Campo sender deve ser preenchido") String sender,
		@NotBlank(message = "Campo message deve ser peenchido") String message) {

	public String toJson() {
		return JsonHelper.toJson(this);
	}
}
