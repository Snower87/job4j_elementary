package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.junit.Assert.assertArrayEquals;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3Ver1() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {4, 2, 3, 1};
        int[] rsl = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap1to2() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] expect = {1, 3, 2, 4, 5, 6};
        int[] rsl = SwitchArray.swap(input, 1, 2);
        assertThat(rsl, is(expect));
    }
}