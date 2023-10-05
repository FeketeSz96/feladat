package hu.feladat.service;

import java.util.List;
import java.util.Map;

public interface NumberService {

    List<Integer> findRepeatedNumbers(List<Integer> numbers);
    Map<Integer, Integer> countNumbers(List<Integer> numbers);
}
