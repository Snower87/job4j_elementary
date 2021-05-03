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

    //проверка диагонали
    @Test
    public void whenDiagonalFullX() {
        char[][] input = {
                {'X', ' ', ' '},
                {' ', 'X', ' '},
                {' ', ' ', 'X'},
        };
        char[] result = MatrixCheck.extractDiagonal(input);
        char[] expected = {'X', 'X', 'X'};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenDiagonalFullOne() {
        char[][] input = {
                {'1', ' ', ' '},
                {' ', '1', ' '},
                {' ', ' ', '1'},
        };
        char[] result = MatrixCheck.extractDiagonal(input);
        char[] expected = {'1', '1', '1'};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenDiagonalMix() {
        char[][] input = {
                {'X', ' ', ' '},
                {' ', 'Y', ' '},
                {' ', ' ', 'Z'},
        };
        char[] result = MatrixCheck.extractDiagonal(input);
        char[] expected = {'X', 'Y', 'Z'};
        Assert.assertArrayEquals(expected, result);
    }
}