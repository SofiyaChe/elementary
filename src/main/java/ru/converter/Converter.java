package ru.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 100;
    }

    public static float rubleToDollar(float value) {
        return value / 90;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(12000);
        float dollar = Converter.rubleToDollar(12000);
        System.out.println("12 000 rubles are " + euro + " euro.");
        System.out.println("12 000 rubles are " + dollar + " dollars.");
    }

}
