package hu.feladat.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberServiceImpl implements NumberService {


    @Override
    public List<Integer> findRepeatedNumbers(List<Integer> numbers) {
        Map<Integer, Integer> countMap = new HashMap<>();
        List<Integer> repeatedNumbers = new ArrayList<>();

        // Melyik szám hányszor fordul elő
        for (Integer number : numbers) {
            countMap.put(number, countMap.getOrDefault(number, 0) + 1);
        }

        // Többször szereplő számokat
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                repeatedNumbers.add(entry.getKey());
            }
        }

        return repeatedNumbers;
    }

    @Override
    public Map<Integer, Integer> countNumbers(List<Integer> numbers) {
        Map<Integer, Integer> numberCounts = new HashMap<>();

        // Melyik szám hányszor fordul elő
        for (Integer number : numbers) {
            numberCounts.put(number, numberCounts.getOrDefault(number, 0) + 1);
        }

        return numberCounts;
    }

}
