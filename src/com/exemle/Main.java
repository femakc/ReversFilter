package com.exemle;

import com.exemle.converter.StringConverter;

public class Main {
    public static void main() {
        String inputString = "J@va the be$t!123";
        System.out.println(StringConverter.letterRevert(inputString));
    }
}