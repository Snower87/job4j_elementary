package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        //напишите здесь тест, проверяющий, что факториал для числа 5 равен 120.
        int num = 5;
        int expected = 120;
        int out = Factorial.calc(num);
        assertThat(out, is(expected));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        //напишите здесь тест, проверяющий, что факториал для числа 0 равен 1.
        int num = 0;
        int expected = 1;
        int out = Factorial.calc(num);
        assertThat(out, is(expected));
    }

    @Test
    public void whenCalculateFactorialForFourThenTwentyFour() {
        //тест, проверяющий, что факториал для числа 4 равен 24
        int num = 4;
        int expected = 24;
        int out = Factorial.calc(num);
        assertThat(out, is(expected));
    }
}