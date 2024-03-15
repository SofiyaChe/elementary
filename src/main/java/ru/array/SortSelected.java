package ru.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        int min = data[0];
        for (int i = 0; i < data.length; i++) {
            min = FindLoop.indexInRange(data,
                    MinDiapason.findMin(data, i, data.length - 1),
                    i, data.length - 1);
            SwitchArray.swap(data, i, min);
        }
        return data;
    }
}
