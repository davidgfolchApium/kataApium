package com.apiumhub.kata;

import static com.apiumhub.kata.Constants.*;
import static com.apiumhub.kata.port.Console.print;
import static com.apiumhub.kata.processor.string.ChangeVocalsProcessor.changeVocals;
import static com.apiumhub.kata.processor.string.InvertCaseProcessor.invertCase;

/**
 * Over engineering:
 * <ul>
 *     <li>Extremely applying <b>S</b>OLID</li>
 *     <li>Over implementation (works with capital letters)</li>
 *     <li>Too much architecture for the implementation</li>
 *     <li>Over testing</li>
 *     <li>Framework/tools/libraries agnostic</li>
 * </ul>
 */
public class Main {

    public static void main(String[] args) {
        print(TITLE);
        print(changeVocals(MSG, "i", false));
        print(invertCase(MSG));
    }

}
