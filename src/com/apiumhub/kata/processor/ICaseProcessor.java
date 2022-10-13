package com.apiumhub.kata.processor;

public interface ICaseProcessor<T> {

    T invert(T msg);
}
