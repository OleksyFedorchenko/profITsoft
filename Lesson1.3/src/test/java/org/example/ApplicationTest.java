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
        List<Figure> figures = Arrays.asList(new Cylinder(2.3,5),
                new Circle(3),
                new Cube(3));
        List<Figure> expected=Arrays.asList(new Cube(3),new Cylinder(2.3,5),new Circle(3));

        assertEquals(expected, new Application().sorting(figures));
    }

    @Test
    public void squareCube(){
        double a=3;
        double expected =54;
        assertEquals(expected,new Cube(3).square(),0.0001);
    }
    @Test
    public void squareCircle(){
        double a=3;
        double expected =113.097;
        assertEquals(expected,new Circle(3).square(),0.0001);
    }
    @Test
    public void squareCylinder(){
        double r=2.3;
        double h=5;
        double expected =72.257;
        assertEquals(expected,new Cylinder(2.3,5).square(),0.0001);
    }
}
