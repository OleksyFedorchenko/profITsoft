package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.*;

/**
 * Unit test for simple App.
 */
public class ApplicationTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void result() {
        //Також можна прочитати з файлу і наповнити ліст цими стрічками з файлу,
        // наприклад так само розпарсити кожну стрічку або комою або новою стрічкою і будуть окремі елементи ліста...
        List<String> strings = Arrays.asList("Hello #price #spring #price", "Profit, Lego", "#Lent port #spring", "#memory #film game", "#memory lesson #spring", "#price #overloaded", "#Lego #under file");
        Map<String, Integer> expected = new HashMap<>();
        expected.put("#spring", 3);
        expected.put("#price", 2);
        expected.put("#memory", 2);
        expected.put("#Lent", 1);
        expected.put("#overloaded", 1);
        assertEquals(expected, new Application().result(strings));
    }

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void resultThrowsException() {
        exceptionRule.expect(IndexOutOfBoundsException.class);
        exceptionRule.expectMessage("List are empty");
        List<String> strings = new ArrayList<>();
        new Application().result(strings);
    }
    @Test
    public void listIsNull() {
        exceptionRule.expect(NullPointerException.class);
        exceptionRule.expectMessage("List cannot be NULL");
        List<String> strings = null;
        new Application().result(strings);
    }
}
