package com.apiumhub.kata;

import java.util.regex.Pattern;

import static java.lang.Character.*;
import static java.util.regex.Pattern.CASE_INSENSITIVE;

public class Main {

    private static final String MSG = "DDD es basicamente estructurar carpetas";
    private static final Pattern PATTERN_VOCALS = Pattern.compile("[aeiouáàâãäåæçèéêëìíîïðñòóôõøùúûü]", CASE_INSENSITIVE);

    public static void main(String[] args) {
        System.out.println(MSG);
        System.out.println(changeVocals());
        System.out.println(invertCase());
    }

    static String changeVocals() {
        return PATTERN_VOCALS.matcher(MSG).replaceAll("i");
    }

    static String invertCase() {
        var arr = MSG.toCharArray();
        for (var i = 0; i < arr.length; i++) {
            arr[i] = i % 2 == 0 ? toLowerCase(arr[i]) : toUpperCase(arr[i]);
        }
        return new String(arr);
    }

}
