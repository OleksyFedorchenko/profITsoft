package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Application {


    public Map<String,Integer> result(List<String> strings) {
        //Фільтруєм кожен стрінг, щоб лишилися тільки хештеги,
        // і відповідно без дублікатів, бо це сет. Далі сет як елемент додаємо в наш ліст сетів стрінги.
        Set<String> setStrings;
        List<Set<String>> listSetStrings = new ArrayList<>();
        for (String s : strings) {
            setStrings = Arrays.stream(s.split(" "))
                    .filter(s2 -> s2.startsWith("#"))
                    .collect(Collectors.toSet());
            if (!setStrings.isEmpty()) listSetStrings.add(setStrings);
        }
        Map<String, Integer> result = new HashMap<>();
        //парсимо наш ліст сетів в мапу рахуючи кількість повторень.
        for (Set<String> s : listSetStrings
        ) {
            for (String st : s
            ) {
                if (result.containsKey(st)) {
                    result.put(st, result.get(st) + 1);
                } else result.put(st, 1);
            }

        }
        //сортуємо мапу і виводимо топ 5 хештегів.
        return result.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(5)
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
    }
}
