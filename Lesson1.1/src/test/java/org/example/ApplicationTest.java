package org.example;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class ApplicationTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void positive() {
        Integer[] in = {2, -5, 7, 4, 3, -7, -4};
        List<Integer> expected = Arrays.asList(7, 4, 3, 2);
        assertEquals(expected, new Application().positive(in));
    }

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void positiveInputDataIsNull() {
        exceptionRule.expect(NullPointerException.class);
        exceptionRule.expectMessage("Input data cannot be NULL");
        Integer[] in = null;
        new Application().positive(in);
    }
}
