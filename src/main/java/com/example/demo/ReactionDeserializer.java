package com.example.demo;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;

public class ReactionDeserializer extends JsonDeserializer<Reaction<?>> {
    @Override
    public Reaction<?> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        JsonNode node = p.getCodec().readTree(p);
        String type = node.get("type").asText();
        long reactedAt = node.get("reactedAt").asLong();


        JsonNode payloadNode = node.get("payload");


        if (payloadNode.isNumber()) {
            Reaction<IntegerPayload> reaction = new Reaction<>();
            reaction.payload = new IntegerPayload();
            reaction.payload.set(payloadNode.asInt());
            reaction.reactedAt = reactedAt;
            reaction.type = type;
            return reaction;
        }

        if (payloadNode.isTextual()) {
            Reaction<StringPayload> reaction = new Reaction<>();
            reaction.payload = new StringPayload();
            reaction.payload.set(payloadNode.textValue());
            reaction.reactedAt = reactedAt;
            reaction.type = type;
            return reaction;
        }

        return null;
    }
}
