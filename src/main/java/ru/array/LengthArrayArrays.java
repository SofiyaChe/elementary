package ru.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] myArray = {{2}, {3, 1}, {3, 4, 5}, {4, 6, 3, 7}};
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("arraySize is " + myArray[i].length);
        }
    }
}
