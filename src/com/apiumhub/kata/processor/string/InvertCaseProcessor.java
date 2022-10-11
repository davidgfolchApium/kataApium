package com.apiumhub.kata.processor.string;

import static java.lang.Character.toLowerCase;
import static java.lang.Character.toUpperCase;

public class InvertCaseProcessor {

    public static String invertCase(String msg) {
        var arr = msg.toCharArray();
        for (var i = 0; i < arr.length; i++) {
            arr[i] = i % 2 == 0 ? toLowerCase(arr[i]) : toUpperCase(arr[i]);
        }
        return new String(arr);
    }
}
