package org.example;

public class Cylinder extends Figure {
    private final double radius;
    private final double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public String toString() {
        return String.format("Cylinder square = %.3f", getSquare());
    }

    @Override
    public double getSquare() {
        return scale(2 * Math.PI * radius * height);
    }
}
