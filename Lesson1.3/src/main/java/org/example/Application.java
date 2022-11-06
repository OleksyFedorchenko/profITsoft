package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Application {
    public void run() {
    }

    public List<Figure> sorting(List<Figure> figures) {
         return figures.stream().sorted().collect(Collectors.toList());

    }
}
