package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public abstract class Figure implements Comparable<Figure> {

    public Figure() {
    }

    abstract double getSquare();


    protected double scale(double in){
        return BigDecimal.valueOf(in).setScale(3, RoundingMode.HALF_UP).doubleValue();
    }

    @Override
    public int compareTo(Figure o) {
        return Double.compare(this.getSquare(), o.getSquare());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Figure figure = (Figure) o;
        return Double.compare(figure.getSquare(), getSquare()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSquare());
    }
}
