package com.example.demo;

public abstract class BasePayload<T> {
    abstract T get();

    abstract void set(T value);
}
