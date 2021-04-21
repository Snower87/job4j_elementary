package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {
    @Test
    public void whenPoint0020Coordx1y1x2y2ThenDistance2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenPoint0022Coordx1y1x2y2ThenDistance2dot8284271247461903() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 2;
        double expected = 2.8284271247461903;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenPointMin2Min2Plus2Plus2Coordx1y1x2y2ThenDistance5dot656854249492381() {
        int x1 = -2;
        int y1 = -2;
        int x2 = 2;
        int y2 = 2;
        double expected = 5.656854249492381;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}