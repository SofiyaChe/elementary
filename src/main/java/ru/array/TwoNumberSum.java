package ru.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int[] myArray = new int[2];
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j >= 0; j--) {
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
