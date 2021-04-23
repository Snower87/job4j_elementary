package ru.job4j.condition;

import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax10To2Then10() {
        int result = Max.max(10, 2);
        assertThat(result, is(10));

    }

    @Test
    public void whenMax4To4Then4() {
        int result = Max.max(4, 4);
        assertThat(result, is(4));
    }
}