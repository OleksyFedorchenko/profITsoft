package org.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

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
        List<Integer> expected= Arrays.asList(7,4,3,2);
        assertEquals(expected,new Application().positive(in));
    }
}
