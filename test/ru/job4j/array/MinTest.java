package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MinTest {
    @Test
    public void whenFirstMin() {
        assertThat(
                Min.findMin(
                        new int[] {0, 5, 10}
                ),
                is(0)
        );
    }

    @Test
    public void whenLastMin() {
        assertThat(
                Min.findMin(
                        new int[] {10, 5, 3}
                ),
                is(3)
        );
    }

    @Test
    public void whenMiddleMin() {
        assertThat(
                Min.findMin(
                        new int[] {10, 2, 5}
                ),
                is(2)
        );
    }

    /*
    @Test
    public void whenFirstMin() {
        int[] array = new int[] {0, 5, 10};
        int result = Min.findMin(array);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenLastMin() {
        int[] array = new int[] {10, 5, 3};
        int result = Min.findMin(array);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMiddleMin() {
        int[] array = new int[] {10, 2, 5};
        int result = Min.findMin(array);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }
    */
}