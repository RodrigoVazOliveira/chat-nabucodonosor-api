# Chat Nabucodonosor

Chat feito com Socket usando padrões de projeto


## Etapas:

	1. Possuirá o envio e recebimento de mensagens (Ok)
	2. Será possível um login (Em andamento)
	3. Será armazenados as mensagens (Em andamento)
	
## Tecnologias utilizadas:

	- Java 21
	- Spring Boot
	- Spring Boot WebSocket
	- Spring Boot JPA
	- Spring Boot Validation
	- PostgreSQL Driver
	- Docker e Docker Compose
	- Maven
	
## Como testar:


1. Primeiro faça o build do projeto executando:
		
```sh
$ mvn clean install
```

2. Inicie o docker-compose:

```bash
$ docker-compose up --build
```
3. Entre na pasta teste e faça os seguintes passos para enviar uma mensagem:

```bash
$ npm install 
# npm start
```