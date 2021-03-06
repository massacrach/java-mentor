package com.company;

public class Expression {
    Sign sign;
    int leftNumber;
    int rightNumber;
    NumberType type;

    Expression(String text) throws Exception {
        for (Sign sign : Sign.values()) {
            String[] pieces = text.split(sign.getPattern());

            if (pieces.length == 2) {
                this.sign = sign;

                NumberParser leftNumberParser = new NumberParser(pieces[0]);
                NumberParser rightNumberParser = new NumberParser(pieces[1]);

                // CHECK IF BOTH NUMBERS HAVE THE SAME TYPE
                if (!validateTypes(leftNumberParser.type, rightNumberParser.type))
                    throw new Exception("Different number types");

                /*
                    BOTH NUMBERS ARE OF THE SAME TYPE SO WE CAN ASSIGN
                    THE "TYPE" ATTRIBUTE TO ANY OF THEM
                 */
                type = leftNumberParser.type;

                leftNumber = leftNumberParser.value;
                rightNumber = rightNumberParser.value;

                return;
            }
        }

        // INPUT STRING IS NOT FOLLOWING PATTERN "NUMBER SIGN NUMBER"
        throw new Exception("Invalid format");
    }

    public boolean validateTypes(NumberType type1, NumberType type2) {
        return type1 == type2;
    }

    public String convertResult(Integer number) {
        if (type == NumberType.ARABIC)
            return number.toString();

        return RomanNumber.toRomanDigit(number);
    }
}
