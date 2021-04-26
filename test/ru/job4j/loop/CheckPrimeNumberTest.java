package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CheckPrimeNumberTest {
    @Test
    public void when5() {
        boolean rsl = CheckPrimeNumber.check(5);
        //assertThat(rsl, is(true));
        Assert.assertTrue(rsl);
    }

    @Test
    public void when4() {
        boolean rsl = CheckPrimeNumber.check(4);
        //assertThat(rsl, is(false));
        Assert.assertFalse(rsl);
    }

    @Test
    public void when1() {
        boolean rsl = CheckPrimeNumber.check(1);
        assertThat(rsl, is(false));
    }

    @Test
    public void when8() {
        boolean rsl = CheckPrimeNumber.check(8);
        assertThat(rsl, is(false));
    }

    @Test
    public void when12() {
        boolean rsl = CheckPrimeNumber.check(12);
        assertThat(rsl, is(false));
    }

    @Test
    public void when11() {
        boolean rsl = CheckPrimeNumber.check(11);
        assertThat(rsl, is(true));
    }

    @Test
    public void when13() {
        boolean rsl = CheckPrimeNumber.check(13);
        assertThat(rsl, is(true));
    }
}