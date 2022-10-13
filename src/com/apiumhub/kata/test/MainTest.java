package com.apiumhub.kata.test;

import com.apiumhub.kata.Factory;
import com.apiumhub.kata.processor.ICaseProcessor;
import com.apiumhub.kata.processor.IVocalsProcessor;

import static com.apiumhub.kata.IConstants.*;
import static com.apiumhub.kata.port.Console.print;
import static com.apiumhub.kata.test.Assertions.assertEquals;

class MainTest {

    private static final String EXPECTED_CHANGE_VOCALS = "DDD is bisiciminti istrictirir cirpitis";
    private static final String EXPECTED_INVERT_CASE = "dDd eS BaSiCaMeNtE EsTrUcTuRaR CaRpEtAs";
    private static final String EXPECTED_INVERT_CHANGE_CASE = "dDd iS BiSiCiMiNtI IsTrIcTiRiR CiRpItIs";

    private static final IVocalsProcessor<String,String> vocalsProcessor = Factory.instanceVocalsProcessor();
    private static final ICaseProcessor<String> caseProcessor = Factory.instanceCaseProcessor();

    public static void main(String[] args) {
        print("\nTest main\n");
        print(TITLE);
        assertEquals(EXPECTED_CHANGE_VOCALS, vocalsProcessor.replace(MSG, REPLACEMENT_LETTER, false));
        assertEquals(EXPECTED_INVERT_CASE, caseProcessor.invert(MSG));
        //OVER TESTING (testing not required implementation)
        assertEquals(EXPECTED_INVERT_CHANGE_CASE,
                vocalsProcessor.replace(caseProcessor.invert(MSG), REPLACEMENT_LETTER, true));
        assertEquals(EXPECTED_INVERT_CHANGE_CASE,
                caseProcessor.invert(vocalsProcessor.replace(MSG, REPLACEMENT_LETTER, false)));
        //TESTING Assertions.java PILE_OF_POO
        assertEquals("FAILING TEST TEST", "BUAH!!");
    }

}