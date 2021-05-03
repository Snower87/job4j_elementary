package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class MatrixCheckTest {
    //проверка строк
    @Test
    public void whenHasMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        int row = 1;
        boolean result = MatrixCheck.monoHorizontal(input, row);
        Assert.assertTrue(result);
        //assertThat(result, is(true));
    }

    @Test
    public void whenHasMonoHorizontalAtRow0() {
        char[][] input = {
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
                {' ', ' ', ' '},
        };
        int row = 0;
        boolean result = MatrixCheck.monoHorizontal(input, row);
        Assert.assertTrue(result);
        //assertThat(result, is(true));
    }

    @Test
    public void whenFailMonoHorizontalAtRow2() {
        char[][] input = {
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
                {' ', ' ', ' '},
        };
        int row = 2;
        boolean result = MatrixCheck.monoHorizontal(input, row);
        Assert.assertFalse(result);
        //assertThat(result, is(false));
    }

    @Test
    public void whenFailMonoHorizontalAtRow0() {
        char[][] input = {
                {'X', 'X', '0'},
                {' ', ' ', ' '},
                {' ', ' ', ' '},
        };
        int row = 0;
        boolean result = MatrixCheck.monoHorizontal(input, row);
        Assert.assertFalse(result);
    }

    //проверка столбцов
    @Test
    public void whenHasMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        int row = 2;
        boolean result = MatrixCheck.monoVertical(input, row);
        Assert.assertTrue(result);
        //assertThat(result, is(true));
    }

    @Test
    public void whenHasMonoVerticalAtCol0() {
        char[][] input = {
                {'X', ' ', ' '},
                {'X', ' ', ' '},
                {'X', ' ', ' '},
        };
        int row = 0;
        boolean result = MatrixCheck.monoVertical(input, row);
        Assert.assertTrue(result);
        //assertThat(result, is(true));
    }

    @Test
    public void whenFailMonoVerticalAtCol0() {
        char[][] input = {
                {'X', ' ', ' '},
                {'X', ' ', ' '},
                {'9', ' ', ' '},
        };
        int row = 2;
        boolean result = MatrixCheck.monoVertical(input, row);
        Assert.assertFalse(result);
        //assertThat(result, is(false));
    }
}