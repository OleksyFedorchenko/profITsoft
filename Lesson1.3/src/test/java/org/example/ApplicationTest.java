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
    public void result() {
        List<Figure> figures = Arrays.asList(new Cylinder(2.3, 5),
                new Circle(3),
                new Cube(3));
        List<Figure> expected = Arrays.asList(new Cube(3), new Cylinder(2.3, 5), new Circle(3));

        assertEquals(expected, new Application().sorting(figures));
    }

    @Test
    public void squareCube() {
        double sideSize = 3;
        double expected = 54;
        assertEquals(expected, new Cube(sideSize).getSquare(), 0.0001);
    }

    @Test
    public void squareCircle() {
        double r = 3;
        double expected = 113.097;
        assertEquals(expected, new Circle(r).getSquare(), 0.0001);
    }

    @Test
    public void squareCylinder() {
        double r = 2.3;
        double h = 5;
        double expected = 72.257;
        assertEquals(expected, new Cylinder(r, h).getSquare(), 0.0001);
    }

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void sortingIsEmpty() {
        exceptionRule.expect(IndexOutOfBoundsException.class);
        exceptionRule.expectMessage("List cannot be empty");
        List<Figure> figures = new ArrayList<>();
        new Application().sorting(figures);
    }

    @Test
    public void listIsNull() {
        exceptionRule.expect(NullPointerException.class);
        exceptionRule.expectMessage("Figures cannot be NULL");
        new Application().sorting(null);
    }
}
