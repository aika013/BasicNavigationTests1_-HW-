package com.cbt.utilities;

public class StringUtility {
    public static String verifyEquals(String expected, String actual) {
        String result = "";
        actual = actual.toLowerCase();
        expected = expected.toLowerCase();
        if (actual.equals(expected)) {
            result = "pass";
            System.out.println("result = " + result);
        } else {
            result = "fail";
            System.out.println("result = " + result);
        }
    return result;

    }
}
