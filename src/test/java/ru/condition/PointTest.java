package ru.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        Point point1 = new Point(x1,y1);
        Point point2 = new Point(x2,y2);
        double out = point1.distance(point2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when04to40then5Dot65() {
        double expected = 5.65;
        int x1 = 0;
        int y1 = 4;
        int x2 = 4;
        int y2 = 0;
        Point point1 = new Point(x1,y1);
        Point point2 = new Point(x2,y2);
        double out = point1.distance(point2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when29to92then9Dot89() {
        double expected = 9.89;
        int x1 = 2;
        int y1 = 9;
        int x2 = 9;
        int y2 = 2;
        Point point1 = new Point(x1,y1);
        Point point2 = new Point(x2,y2);
        double out = point1.distance(point2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

}