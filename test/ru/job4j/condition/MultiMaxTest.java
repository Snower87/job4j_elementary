package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenFirstMax() {
        MultiMax check = new MultiMax();
        int result = check.max(10, 2, 3);
        assertThat(result, is(10));
    }

    @Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenThirdMax() {
        MultiMax check = new MultiMax();
        int result = check.max(3, 5, 6);
        assertThat(result, is(6));
    }

    @Test
    public void whenAllNumbEquals2() {
        MultiMax check = new MultiMax();
        int result = check.max(2, 2, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenAllNumbEquals6() {
        MultiMax check = new MultiMax();
        int result = check.max(6, 6, 6);
        assertThat(result, is(6));
    }
}