package org.example;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return String.format("Circle square = %.3f", square());
    }


    @Override
    public double square() {
        return scale(4 * Math.PI * (radius * radius));
    }
}
