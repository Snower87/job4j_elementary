package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Assert;

public class EndsWithTest {
    @Test
    public void whenEndWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'o'};
        boolean result = EndsWith.endsWith(word, post);
        //assertThat(result, is(true));
        Assert.assertTrue(result);
    }

    @Test
    public void whenNotEndWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'a'};
        boolean result = EndsWith.endsWith(word, post);
        //assertThat(result, is(false));
        Assert.assertFalse(result);
    }
}