package dev.nabucodonosor.commons.helper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Class to helper is convert class to json or Json to Class
 * 
 * @author RodrigoVazOliveira
 */
public class JsonHelper {
	private final static ObjectMapper objectMapper = new ObjectMapper();

	/**
	 * convert to object in json string
	 * 
	 * 
	 * @param object your object instance
	 * @return string object in json
	 */
	public static String toJson(Object object) {
		try {
			return objectMapper.writeValueAsString(object);
		} catch (JsonProcessingException e) {
			throw new RuntimeException(e);
		}
	}
}
