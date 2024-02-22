package ru.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 100;
    }

    public static float rubleToDollar(float value) {
        return value / 90;
    }

//    public static void main(String[] args) {
//        float euro = Converter.rubleToEuro(12000);
//        float dollar = Converter.rubleToDollar(12000);
//        System.out.println("12 000 rubles are " + euro + " euro.");
//        System.out.println("12 000 rubles are " + dollar + " dollars.");
//    }

    public static void main(String[] args) { //to push into GitHub
        float inE = 140;
        float expectedE = 1.4f;
        float outE = Converter.rubleToEuro(inE);
        boolean passedE = expectedE == outE;
        System.out.println("140 rubles are 1.4. Test result : " + passedE);
        float inD = 900;
        float expectedD = 10;
        float outD = Converter.rubleToDollar(inD);
        boolean passedD = expectedD == outD;
        System.out.println("900 rubles are 10. Test result : " + passedD);

    }

}
