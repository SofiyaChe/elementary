package ru.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[]{3, 4, 1, 2, 8};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 8};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort2() {
        int[] data = new int[]{3, 11, 8};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{3, 8, 11};
        assertThat(result).containsExactly(expected);
    }
}