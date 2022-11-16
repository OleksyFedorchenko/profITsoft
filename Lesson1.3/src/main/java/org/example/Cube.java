package org.example;

public class Cube extends Figure {
    private double a; //length of a one side of cube

    public Cube(double a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return String.format("Cube square = %.3f", square());
    }

    @Override
    public double square() {
        return scale( 6 * (a * a));
    }

}
