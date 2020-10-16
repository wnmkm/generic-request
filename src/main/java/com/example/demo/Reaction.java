package com.example.demo;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(using = ReactionDeserializer.class)

public class Reaction<T extends BasePayload<?>> {
    String type;
    T payload;
    long reactedAt;
}