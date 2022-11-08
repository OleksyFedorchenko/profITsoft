package org.example;

public class Cylinder extends Figure {
    private double radius,height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
        this.square = square();
    }

    @Override
    public String toString() {
        return String.format("Cylinder square = %.3f", square);
    }

    @Override
    public double square() {
        return scale(2 * Math.PI * radius * height);
    }
}
