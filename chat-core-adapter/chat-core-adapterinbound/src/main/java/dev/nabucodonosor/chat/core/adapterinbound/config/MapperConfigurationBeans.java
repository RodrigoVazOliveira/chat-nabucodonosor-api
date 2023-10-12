package dev.nabucodonosor.chat.core.adapterinbound.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import dev.nabucodonosor.chat.core.aplication.domain.ConvertChatMessageDataRequestToChatMessageData;

@Component
public class MapperConfigurationBeans {

	@Bean
	ConvertChatMessageDataRequestToChatMessageData createConvertRequestMessage() {
		return new ConvertChatMessageDataRequestToChatMessageData();
	}

}
