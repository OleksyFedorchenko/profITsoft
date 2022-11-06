package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

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
        List<Figure> figures = Arrays.asList(new Cube(3),
                new Circle(3),
                new Cylinder(2.3,5));
        List<Figure> expected=new ArrayList<>();
        Circle circle = new Circle();
        circle.setSquare(113.097);
        Cube cube = new Cube();
        cube.setSquare(54.000);
        Cylinder cylinder = new Cylinder();
        cylinder.setSquare(72.257);
        expected.add(cube);
        expected.add(cylinder);
        expected.add(circle);

        assertEquals(expected, new Application().sorting(figures));
    }
}
