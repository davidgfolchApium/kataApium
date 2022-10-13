package com.apiumhub.kata;

import static com.apiumhub.kata.IIcons.FACE_WITH_ONE_LARGE_AND_ONE_SMALL_EYE;

public interface IConstants {

    String MSG = "DDD es basicamente estructurar carpetas";
    String REPLACEMENT_LETTER = "i";

    String CRAZY_FACE_ICONS = FACE_WITH_ONE_LARGE_AND_ONE_SMALL_EYE.repeat(4);
    String TITLE = CRAZY_FACE_ICONS + ' ' + MSG + ' ' + CRAZY_FACE_ICONS;

}
