package ru.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = Integer.MAX_VALUE;
        for (int i = start; i <= finish; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
