package ru.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = FindLoop.indexInRange(data,
                    MinDiapason.findMin(data, i, data.length - 1),
                    i, data.length - 1);
            SwitchArray.swap(data, i, min);
        }
        return data;
    }
}
