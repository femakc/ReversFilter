package com.example.converter;

public class StringConverter {
    public static String letterRevert(String inputString) {

        if (inputString == null || inputString.isEmpty()) {
            return "";
        }

        char[] outputString = inputString.toCharArray();

        int leftCursor = 0;
        int rightCursor = outputString.length - 1;
        while (leftCursor < rightCursor) {
            if (!Character.isLetter(outputString[leftCursor])) {
                leftCursor++;
                continue;
            }
            if (!Character.isLetter(outputString[rightCursor])) {
                rightCursor--;
                continue;
            }

            char tempChar = outputString[leftCursor];
            outputString[leftCursor] = outputString[rightCursor];
            outputString[rightCursor] = tempChar;

            leftCursor++;
            rightCursor--;
        }
        return new String(outputString);
    }
}