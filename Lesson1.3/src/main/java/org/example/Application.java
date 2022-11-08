package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Application {

    public List<Figure> sorting(List<Figure> figures) {
        if (figures == null) {
            throw new NullPointerException("Figures cannot be NULL");
        } else if (figures.isEmpty()) {
            throw new IndexOutOfBoundsException("List cannot be empty");
        } else {
            return figures.stream().sorted().collect(Collectors.toList());
        }
    }
}
