package com.example.demo.payload;

public class StringPayload extends BasePayload<String> {
    String value;

    @Override
    public String get() {
        return value;
    }

    @Override
    public void set(String value) {
        this.value = value;
    }
}
