package hu.feladat.dao;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface  NumberAnalysisRepository {
    List<Integer> findRepeatedNumbers(List<Integer> numbers);

    Map<Integer, Integer> countNumbers(List<Integer> numbers);
}
