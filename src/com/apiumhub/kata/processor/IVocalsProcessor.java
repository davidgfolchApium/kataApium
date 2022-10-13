package com.apiumhub.kata.processor;

public interface IVocalsProcessor<T,R> {

    T replace(T msg, R replacement, boolean applyToCapitalLetters);
}
