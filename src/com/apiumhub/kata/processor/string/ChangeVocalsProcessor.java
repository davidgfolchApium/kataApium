package com.apiumhub.kata.processor.string;

import java.util.Locale;
import java.util.regex.Pattern;

public class ChangeVocalsProcessor {

    private static final Pattern PATTERN_VOCALS = Pattern.compile("[aeiou]");
    private static final Pattern PATTERN_VOCALS_1 = Pattern.compile("[AEIOU]");

    public static String changeVocals(String msg, String replacement, boolean applyToCapitalLetters) {
        String res = PATTERN_VOCALS.matcher(msg).replaceAll(replacement);
        if (applyToCapitalLetters) {
            return PATTERN_VOCALS_1.matcher(res).replaceAll(replacement.toUpperCase(Locale.ROOT));
        }
        return res;
    }
}
