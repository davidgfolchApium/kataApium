package com.apiumhub.kata.test;

import static com.apiumhub.kata.Constants.*;
import static com.apiumhub.kata.port.Console.print;
import static com.apiumhub.kata.processor.string.ChangeVocalsProcessor.changeVocals;
import static com.apiumhub.kata.processor.string.InvertCaseProcessor.invertCase;
import static com.apiumhub.kata.test.Assertions.assertEquals;

class MainTest {

    private static final String EXPECTED_CHANGE_VOCALS = "DDD is bisiciminti istrictirir cirpitis";
    private static final String EXPECTED_INVERT_CASE = "dDd eS BaSiCaMeNtE EsTrUcTuRaR CaRpEtAs";
    private static final String EXPECTED_INVERT_CHANGE_CASE = "dDd iS BiSiCiMiNtI IsTrIcTiRiR CiRpItIs";

    public static void main(String[] args) {
        print("\nTest main\n");
        print(TITLE);
        assertEquals(EXPECTED_CHANGE_VOCALS, changeVocals(MSG, "i", false));
        assertEquals(EXPECTED_INVERT_CASE, invertCase(MSG));
        assertEquals(EXPECTED_INVERT_CHANGE_CASE, changeVocals(invertCase(MSG), "i", true));
        assertEquals(EXPECTED_INVERT_CHANGE_CASE, invertCase(changeVocals(MSG, "i", false)));
        assertEquals("FAILING TEST TEST", "BUAH!!");
    }

}