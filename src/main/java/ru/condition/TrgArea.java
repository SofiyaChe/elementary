package ru.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double hp = (a + b + c) / 2;
        return Math.sqrt(hp * (hp - a) * (hp - b) * (hp - c));
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }

}
