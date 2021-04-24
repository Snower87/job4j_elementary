package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

public class TriangleTest {
    @Test
    public void whenExist() {
        boolean result = Triangle.exist(2.0, 2.0, 2.0);
        assertThat(result, is(true));
    }

    @Test
    public void whenNotExist() {
        boolean result = Triangle.exist(1.0, 1.0, 4.0);
        assertThat(result, is(false));
    }

    @Test
    public void whenExist2() {
        boolean result = Triangle.exist(2.0, 2.0, 2.0);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNotExist2() {
        boolean result = Triangle.exist(1.0, 1.0, 4.0);
        Assert.assertFalse(result);
    }
}