package com.apiumhub.kata.processor.string;

import com.apiumhub.kata.processor.IVocalsProcessor;

import java.util.Locale;
import java.util.regex.Pattern;

public class VocalsProcessor implements IVocalsProcessor<String,String> {

    private static final Pattern PATTERN_VOCALS = Pattern.compile("[aeiou]");
    private static final Pattern PATTERN_VOCALS_1 = Pattern.compile("[AEIOU]");  //over impl

    @Override
    public String replace(String msg, String replacement, boolean applyToCapitalLetters) {
        String res = PATTERN_VOCALS.matcher(msg).replaceAll(replacement);
        if (applyToCapitalLetters) { //over impl
            return PATTERN_VOCALS_1.matcher(res).replaceAll(replacement.toUpperCase(Locale.ROOT));
        }
        return res;
    }
}
