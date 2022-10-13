package com.apiumhub.kata;

import com.apiumhub.kata.processor.IVocalsProcessor;
import com.apiumhub.kata.processor.ICaseProcessor;
import com.apiumhub.kata.processor.string.VocalsProcessor;
import com.apiumhub.kata.processor.string.CaseProcessor;

public class Factory {

    public static IVocalsProcessor<String,String> instanceVocalsProcessor() {
        return new VocalsProcessor();
    }

    public static ICaseProcessor<String> instanceCaseProcessor() {
        return new CaseProcessor();
    }
}
