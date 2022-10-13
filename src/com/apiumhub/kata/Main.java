package com.apiumhub.kata;

import com.apiumhub.kata.processor.IVocalsProcessor;
import com.apiumhub.kata.processor.ICaseProcessor;

import static com.apiumhub.kata.IConstants.*;
import static com.apiumhub.kata.port.Console.print;

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

    private static final IVocalsProcessor<String,String> vocalsProcessor = Factory.instanceVocalsProcessor();
    private static final ICaseProcessor<String> caseProcessor = Factory.instanceCaseProcessor();

    public static void main(String[] args) {
        print(TITLE);
        print(vocalsProcessor.replace(MSG, REPLACEMENT_LETTER, false));
        print(caseProcessor.invert(MSG));
    }

}
