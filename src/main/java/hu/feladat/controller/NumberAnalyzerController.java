package hu.feladat.controller;

import hu.feladat.dao.entity.NumberStatistics;
import hu.feladat.model.NumbersToCheck;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import hu.feladat.service.NumberService;

import java.util.List;
import java.util.Map;

public class NumberAnalyzerController {

    private final NumberService numberService;

    public NumberAnalyzerController(NumberService numberService) {
        this.numberService = numberService;
    }

    @PostMapping("/analyzeNumbers")
    public ResponseEntity<NumberStatistics> analyzeNumbers(@RequestBody NumbersToCheck numbersToCheck) {
        List<Integer> repeatedNumbers = numberService.findRepeatedNumbers(numbersToCheck.getNumberList());
        Map<Integer, Integer> numberCounts = numberService.countNumbers(numbersToCheck.getNumberList());

        NumberStatistics statistics = new NumberStatistics();
        statistics.setRepeatedNumbers(repeatedNumbers);
        statistics.setNumberCounts(numberCounts);

        return ResponseEntity.ok(statistics);
    }


}