package ru.job4j.calculator;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenFitmanWeight100kgThen0rslt() {
        short in = 100;
        double expected = 0;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenFitwomanWeight110kgThen0rslt() {
        short in = 110;
        double expected = 0;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenFitwomanWeight201kgThenIdealrezult116kg() {
        short in = 201;
        double expected = 104.65;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}