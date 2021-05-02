package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
        //Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort3number() {
        int[] input = new int[] {9, 22, 0};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {0, 9, 22};
        assertThat(result, is(expect));
        //Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort5number() {
        int[] input = new int[] {99, 5, 33, 19, 50};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {5, 19, 33, 50, 99};
        assertThat(result, is(expect));
        //Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort10number() {
        int[] input = new int[] {90, 80, 70, 30, 20, 10, 50, 0, 40, 60};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {0, 10, 20, 30, 40, 50, 60, 70, 80, 90};
        assertThat(result, is(expect));
        //Assert.assertArrayEquals(expected, result);
    }
}