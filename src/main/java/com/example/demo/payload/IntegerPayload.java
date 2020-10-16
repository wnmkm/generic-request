package com.example.demo.payload;

public class IntegerPayload extends BasePayload<Integer> {

    private int value;

    @Override
    public Integer get() {
        return value;
    }

    @Override
    public void set(Integer value) {
        this.value = value;
    }
}
