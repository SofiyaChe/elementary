package ru.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int num1, int num2, int num3, int num4) {
        return max(max(num1, num2), max(num3, num4));
    }

    public static int max(int num1, int num2, int num3) {
        return max(max(num1, num2), num3);
    }
}
