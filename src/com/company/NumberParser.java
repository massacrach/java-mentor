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
            // CHECK IF INPUT IS A LATIN DIGIT
            Integer latinNumber = LatinNumber.parse(trimmedText);

            if (latinNumber != null) {
                type = NumberType.LATIN;
                value = latinNumber;
            } else {
                // INPUT IS NEITHER AN INTEGER NOR A VALID LATIN DIGIT
                throw new Exception("Unknown symbol");
            }
        }
    }
}
