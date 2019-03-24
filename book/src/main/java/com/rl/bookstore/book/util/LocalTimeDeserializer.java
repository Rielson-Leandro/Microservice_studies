package com.rl.bookstore.book.util;

import java.io.IOException;
import java.time.LocalDateTime;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

public final class LocalTimeDeserializer extends JsonDeserializer<LocalDateTime>{

	@Override
	public LocalDateTime deserialize(JsonParser parser, DeserializationContext ctx)
			throws IOException, JsonProcessingException {
		return LocalDateTime.parse(parser.getText());
	}

}
