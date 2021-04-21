package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {
    @Test
    public void whenSqAreaParamP4K1ThenArea1() {
        //входные параметры
        int p = 4;
        int k = 1;

        //ожидаемые значения
        double expected = 1;

        //на выходе метода square()
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenSqAreaParamP6K2ThenArea2() {
        //входные параметры
        int p = 6;
        int k = 2;

        //ожидаемые значения
        double expected = 2;

        //на выходе метода square()
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}