package ru.condition;

public class DivideBySix {
    public static String checkNumber(int number) {
        String rsl;
        boolean divideBy3 = number % 3 == 0;
        boolean divideBy2 = number % 2 == 0;
        if (divideBy2 && divideBy3) {
            rsl = "The number divides by 6.";
        } else if (!divideBy2 && divideBy3) {
            rsl = "The number divides by 3, but it isn't the even number.";
        } else if (divideBy2 && !divideBy3) {
            rsl = "The number doesn't divide by 3, but it is the even number.";
        } else {
            rsl = "The number doesn't divide by 3 and it isn't the even number.";
        }
        return rsl;
    }

}
