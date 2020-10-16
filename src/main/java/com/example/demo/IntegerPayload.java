package com.example.demo;

public class IntegerPayload extends BasePayload<Integer> {

    private int value;

    @Override
    Integer get() {
        return value;
    }

    @Override
    void set(Integer value) {
        this.value = value;
    }
}
