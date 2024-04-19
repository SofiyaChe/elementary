package ru.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

class MaxTest {
    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenAllequals() {
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To1Then2() {
        int left = 4;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void check3nums() {
        int num1 = 5;
        int num2 = 3;
        int num3 = 6;
        int result = Max.max(num1, num2, num3);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void check4nums() {
        int num1 = 5;
        int num2 = 3;
        int num3 = 6;
        int num4 = 7;
        int result = Max.max(num1, num2, num3, num4);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }
}
