package com.apiumhub.kata.test;

import static com.apiumhub.kata.Icons.getIcon;
import static com.apiumhub.kata.port.Console.print;

public class Assertions {

    private static final String MSG_ASSERT_EQUALS = " Assert \"%s\".equals(\"%s\")";

    public static void assertEquals(String expected, String actual) {
        boolean res = expected.equals(actual);
        print(getIcon(res) + MSG_ASSERT_EQUALS, expected, actual);
    }

}
