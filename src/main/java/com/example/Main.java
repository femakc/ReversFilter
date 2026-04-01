package com.example;

import com.example.converter.StringConverter;

public class Main {
    public static void main(String[] args) {
        String inputString = "J@va the be$t!123";
        System.out.println(StringConverter.letterRevert(inputString));
    }
}