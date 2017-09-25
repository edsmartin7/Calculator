package com.example.emartin.calculator;


public class MathOperators {

    public int operate(String first, String operand, String second) {

        int num1 = Integer.parseInt(first);
        int num2 = Integer.parseInt(second);
        int solution=0;

        switch (operand) {
            case "+":
                solution = num1 + num2;
                break;
            case "-":
                solution = num1 - num2;
                break;
            case "*":
                solution = num1 * num2;
                break;
            case "/":
                solution = num1 / num2;
                break;
            default:
                solution = 0;
        }

        return solution;

    }

}
