package ru.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int[] myArray = new int[2];
        for (int i = 0; i < array.length; i++) {
            for (int j = (i + 1); j < array.length; j++) {
                if ((array[i] + array[j]) == target) {
                    myArray[0] = i;
                    myArray[1] = j;
                    return myArray;
                }
            }
        }
        return new int[0];
    }
}
