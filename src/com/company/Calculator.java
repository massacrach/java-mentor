package com.company;

public class Calculator {
    public static int execute(int leftNumber, int rightNumber, Sign sign) {
        Integer result = null;

        switch (sign) {
            case ADD:
                result = leftNumber + rightNumber;

                break;

            case SUB:
                result = leftNumber - rightNumber;

                break;

            case MUL:
                result = leftNumber * rightNumber;

                break;

            case DIV:
                result = leftNumber / rightNumber;

                break;
        }

        return result;
    }
}
