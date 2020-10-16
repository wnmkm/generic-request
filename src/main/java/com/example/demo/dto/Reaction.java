package com.example.demo.dto;

import com.example.demo.payload.BasePayload;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(using = ReactionDeserializer.class)

public class Reaction<T extends BasePayload<?>> {
    public String type;
    public T payload;
    public long reactedAt;
}