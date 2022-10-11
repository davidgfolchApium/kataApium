package com.apiumhub.kata.port;

public class Console {

    public static void print(String msg) {
        printInternal(msg);
    }

    public static void print(String msg, Object... params) {
        printInternal(String.format(msg, params));
    }

    private static void printInternal(String msg) {
        System.out.println(msg);
    }

}
