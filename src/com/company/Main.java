package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            try {
                // PARSE INPUT, GET NUMBERS, SIGN AND DETECT DIGIT TYPE
                Expression expression = new Expression(input);

                // THE INPUT IS A VALID STRING SO CALCULATE IT
                int result = Calculator.execute(
                    expression.leftNumber,
                    expression.rightNumber,
                    expression.sign
                );

                // CONVERT RESULT TO THE PROPER DIGIT FORMAT
                String output = expression.convertResult(result);

                System.out.println(output);
            } catch (Exception e) {
                System.out.println(e.getMessage());

                break;
            }
        }
    }
}
