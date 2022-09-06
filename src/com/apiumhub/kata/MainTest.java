package com.apiumhub.kata;

import static com.apiumhub.kata.Main.changeVocals;
import static com.apiumhub.kata.Main.invertCase;

class MainTest {

    private static final String EXPECTED_CHANGE_VOCALS = "DDD is bisiciminti istrictirir cirpitis";
    private static final String EXPECTED_INVERT_CASE = "dDd eS BaSiCaMeNtE EsTrUcTuRaR CaRpEtAs";

    public static void main(String[] args) {
        System.out.println("\nTest main\n");
        System.out.println(EXPECTED_CHANGE_VOCALS.equals(changeVocals()) + " - Assert changeVocals()");
        System.out.println(EXPECTED_INVERT_CASE.equals(invertCase()) + " - Assert invertCase()");
    }

}