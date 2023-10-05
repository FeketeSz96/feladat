package hu.feladat.dao.entity;

import java.util.List;
import java.util.Map;

public class NumberStatistics {
    private List<Integer> repeatedNumbers;
    private Map<Integer, Integer> numberCounts;

    public List<Integer> getRepeatedNumbers() {
        return repeatedNumbers;
    }

    public void setRepeatedNumbers(List<Integer> repeatedNumbers) {
        this.repeatedNumbers = repeatedNumbers;
    }

    public Map<Integer, Integer> getNumberCounts() {
        return numberCounts;
    }

    public void setNumberCounts(Map<Integer, Integer> numberCounts) {
        this.numberCounts = numberCounts;
    }
}
