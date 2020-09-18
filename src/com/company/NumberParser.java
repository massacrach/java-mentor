package com.company;

public class NumberParser {
    NumberType type;
    int value;

    NumberParser(String text) throws Exception {
        String trimmedText = text.trim();

        // CHECK IF INPUT IS AN INTEGER
        try {
            value = Integer.parseInt(trimmedText);
            type = NumberType.ARABIC;

            if (value <= 0 || value > 10)
                throw new Exception("Invalid range");
        } catch (NumberFormatException numberFormatException) {
            // CHECK IF INPUT IS A ROMAN DIGIT
            Integer romanNumber = RomanNumber.toArabicDigit(trimmedText);

            if (romanNumber != null) {
                type = NumberType.ROMAN;
                value = romanNumber;
            } else {
                // INPUT IS NEITHER AN INTEGER NOR A VALID ROMAN DIGIT
                throw new Exception("Unknown symbol");
            }
        }
    }
}
