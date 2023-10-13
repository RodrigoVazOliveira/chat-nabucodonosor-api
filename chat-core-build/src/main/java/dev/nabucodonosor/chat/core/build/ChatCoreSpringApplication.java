package dev.nabucodonosor.chat.core.build;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = { "dev.nabucodonosor.*" })
@EnableJpaRepositories(basePackages = { "dev.nabucodonosor.chat.core.adapteroutbound.database.repository" })
@EntityScan(basePackages = { "dev.nabucodonosor.chat.core.adapteroutbound.database.entity" })
public class ChatCoreSpringApplication {
	public static void main(String[] args) {
		SpringApplication.run(ChatCoreSpringApplication.class, args);
	}
}
