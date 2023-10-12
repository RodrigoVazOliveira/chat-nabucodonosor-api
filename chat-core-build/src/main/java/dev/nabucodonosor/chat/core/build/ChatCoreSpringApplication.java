package dev.nabucodonosor.chat.core.build;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "dev.nabucodonosor.*" })
public class ChatCoreSpringApplication {
	public static void main(String[] args) {
		SpringApplication.run(ChatCoreSpringApplication.class, args);
	}
}
