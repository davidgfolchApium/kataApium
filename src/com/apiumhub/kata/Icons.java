package com.apiumhub.kata;

public interface Icons {

    String PILE_OF_POO = "\uD83D\uDCA9";
    String OK_HAND_SIGN = "\uD83D\uDC4C";
    String FACE_WITH_ONE_LARGE_AND_ONE_SMALL_EYE = "\uD83E\uDD2A";

    static String getIcon(boolean res) {
        return res ? OK_HAND_SIGN : PILE_OF_POO;
    }
}
