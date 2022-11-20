package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Application {
    public List<Integer> getPositiveReverseSortedNumbers(Integer[] in) {
        if (in == null) throw new NullPointerException("Input data cannot be NULL");
        else {
            return Arrays.stream(in)
                    .filter(i -> i >= 0)
                    .sorted(Comparator.reverseOrder())
                    .collect(Collectors.toList());
        }
    }
}

