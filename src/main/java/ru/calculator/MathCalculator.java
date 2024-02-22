package ru.calculator;

import static ru.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double sumOfTwoMethods(double first, double second) {
        return subtract(first, second) + divide(first, second);
    }

    public static double sumOfFourMethods(double first, double second) {
        return subtract(first, second) + divide(first, second) + sum(first, second)
                + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
    }

}
