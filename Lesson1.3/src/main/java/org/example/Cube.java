package org.example;

public class Cube extends Figure {
    private final double sideSize; //length of a one side of cube

    public Cube(double sideSize) {
        this.sideSize = sideSize;
    }

    @Override
    public String toString() {
        return String.format("Cube square = %.3f", getSquare());
    }

    @Override
    public double getSquare() {
        return scale( 6 * (sideSize * sideSize));
    }

}
