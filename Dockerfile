FROM openjdk:21
WORKDIR /app
COPY ./chat-core-build/target/chat-core-build-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT [ "java", "-jar", "app.jar"]