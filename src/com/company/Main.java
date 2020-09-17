package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            try {
                // PARSE INPUT, GET NUMBERS AND SIGN
                Expression expression = new Expression(input);

                // THE INPUT IS A VALID STRING SO CALCULATE IT
                int output = Calculator.execute(
                    expression.leftNumber,
                    expression.rightNumber,
                    expression.sign
                );

                System.out.println(output);
            } catch (Exception e) {
                System.out.println(e.getMessage());

                break;
            }
        }
    }
}
