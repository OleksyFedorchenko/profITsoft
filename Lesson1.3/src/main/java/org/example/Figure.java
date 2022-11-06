package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public abstract class Figure implements Comparable<Figure> {
     protected double square;

    public Figure() {
    }

    abstract double square();


    protected double scale(double in){
        return BigDecimal.valueOf(in).setScale(3, RoundingMode.HALF_UP).doubleValue();
    };

    @Override
    public int compareTo(Figure o) {
        if (this.square == o.square) {
            return 0;
        } else if (this.square < o.square) {
            return -1;
        } else {
            return 1;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Figure figure = (Figure) o;
        return Double.compare(figure.square, square) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(square);
    }
}
