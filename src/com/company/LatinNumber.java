package com.company;

import java.util.HashMap;

public class LatinNumber {
    private final static HashMap<String, Integer> latinNumbers;

    static {
        latinNumbers = new HashMap<>();

        latinNumbers.put("I", 1);
        latinNumbers.put("II", 2);
        latinNumbers.put("III", 3);
        latinNumbers.put("IV", 4);
        latinNumbers.put("V", 5);
        latinNumbers.put("VI", 6);
        latinNumbers.put("VII", 7);
        latinNumbers.put("VIII", 8);
        latinNumbers.put("IX", 9);
        latinNumbers.put("X", 10);
    }

    public static Integer parse(String text) {
        return latinNumbers.get(text);
    }
}
