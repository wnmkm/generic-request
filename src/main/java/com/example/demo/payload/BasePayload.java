package com.example.demo.payload;

public abstract class BasePayload<T> {
    abstract public T get();

    abstract public void set(T value);
}
