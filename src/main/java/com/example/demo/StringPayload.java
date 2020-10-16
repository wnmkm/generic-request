package com.example.demo;

public class StringPayload extends BasePayload<String> {
    String value;

    @Override
    String get() {
        return value;
    }

    @Override
    void set(String value) {
        this.value = value;
    }
}
