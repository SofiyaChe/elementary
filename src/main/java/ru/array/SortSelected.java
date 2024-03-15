package ru.array;

import static ru.array.MinDiapason.findMin;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int minIndex = FindLoop.indexInRange(data, findMin(data, i,
                            data.length - 1), i, data.length - 1);
            SwitchArray.swap(data, i, minIndex);
        }
        return data;
    }
}
