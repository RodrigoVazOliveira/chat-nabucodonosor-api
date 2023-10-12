package dev.nabucodonosor.chat.core.application.commons;

public interface Mapper<T, V> {
	V execute(T object);
}
