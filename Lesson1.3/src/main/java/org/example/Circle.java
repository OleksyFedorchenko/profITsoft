package org.example;

public class Circle extends Figure {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return String.format("Circle square = %.3f", getSquare());
    }


    @Override
    public double getSquare() {
        return scale(4 * Math.PI * (radius * radius));
    }
}
