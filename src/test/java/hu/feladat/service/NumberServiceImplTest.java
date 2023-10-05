package hu.feladat.service;

import hu.feladat.dao.NumberAnalysisRepository;
import hu.feladat.model.NumbersToCheck;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class NumberServiceImplTest {

    @InjectMocks
    private NumberServiceImpl numberService;

    @Mock
    private NumberAnalysisRepository numberAnalysisRepository;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
    @Test
    void findRepeatedNumbers() {
        List<Integer> inputNumbers = Arrays.asList(1, 4, 3, 10, 6, 5, 4, 2, 3, 12);
        List<Integer> expectedRepeatedNumbers = Arrays.asList( 3, 4);

        List<Integer> result = numberService.findRepeatedNumbers(inputNumbers);

        assertEquals(expectedRepeatedNumbers, result);
    }

    @Test
    void countNumbers() {
        List<Integer> inputNumbers = Arrays.asList(1, 4, 3, 10, 6, 5, 4, 2, 3, 12);
        Map<Integer, Integer> expectedNumberCounts = Map.of(1, 1, 2, 1, 3, 2,4,2,5,1,6,1,10,1,12,1);

        Map<Integer, Integer> result = numberService.countNumbers(inputNumbers);

        assertEquals(expectedNumberCounts, result);
    }


}