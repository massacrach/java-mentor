package com.company;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumber {
    // IS USED FOR CONVERTING ROMAN TO ARABIC
    private final static HashMap<String, Integer> romanNumbers;

    // IS USED FOR CONVERTING ARABIC TO ROMAN
    private final static LinkedHashMap<String, Integer> conversionMap;

    static {
        romanNumbers = new HashMap<>();
        romanNumbers.put("I", 1);
        romanNumbers.put("II", 2);
        romanNumbers.put("III", 3);
        romanNumbers.put("IV", 4);
        romanNumbers.put("V", 5);
        romanNumbers.put("VI", 6);
        romanNumbers.put("VII", 7);
        romanNumbers.put("VIII", 8);
        romanNumbers.put("IX", 9);
        romanNumbers.put("X", 10);

        // "C" IS THE MAXIMUM SINCE THE MAX NUMBER WE CAN GET IS 10 * 10 = 100
        conversionMap = new LinkedHashMap<>();
        conversionMap.put("C", 100);
        conversionMap.put("XC", 90);
        conversionMap.put("L", 50);
        conversionMap.put("XL", 40);
        conversionMap.put("X", 10);
        conversionMap.put("IX", 9);
        conversionMap.put("V", 5);
        conversionMap.put("IV", 4);
        conversionMap.put("I", 1);
    }

    public static Integer toArabicDigit(String text) {
        return romanNumbers.get(text);
    }

    public static String toRomanDigit(Integer digit) {
        StringBuilder romanDigit = new StringBuilder();

        while (digit > 0) {
            for (Map.Entry<String, Integer> entry : conversionMap.entrySet()) {
                int value = entry.getValue();

                if (digit >= value) {
                    digit -= value;
                    romanDigit.append(entry.getKey());

                    break;
                }
            }
        }

        return romanDigit.toString();
    }
}
