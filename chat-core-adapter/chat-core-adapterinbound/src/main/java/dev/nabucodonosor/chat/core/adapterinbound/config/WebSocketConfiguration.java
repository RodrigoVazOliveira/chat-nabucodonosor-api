package dev.nabucodonosor.chat.core.adapterinbound.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfiguration implements WebSocketMessageBrokerConfigurer {
	private final static Logger LOGGER = LoggerFactory.getLogger(WebSocketConfiguration.class);

	@Override
	public void registerStompEndpoints(StompEndpointRegistry stompEndpointRegistry) {
		LOGGER.info("configurando endpoint");
		stompEndpointRegistry.addEndpoint("/chat").withSockJS();
	}

	@Override
	public void configureMessageBroker(MessageBrokerRegistry messageBrokerRegistry) {
		messageBrokerRegistry.enableSimpleBroker("/topic");
		messageBrokerRegistry.setApplicationDestinationPrefixes("/");

		LOGGER.info("configurando endpoint");
	}

}
