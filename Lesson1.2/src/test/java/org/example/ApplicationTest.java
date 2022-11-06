package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Unit test for simple App.
 */
public class ApplicationTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void result()
    {
        List<String> strings = Arrays.asList("Hello #price #spring #price", "Profit, Lego", "#Lent port #spring");
        Map<String,Integer> expected=new HashMap<>();
        expected.put("#Lent",1);
        expected.put("#price",1);
        expected.put("#spring",2);

        assertEquals(expected, new Application().result(strings));
    }
}
