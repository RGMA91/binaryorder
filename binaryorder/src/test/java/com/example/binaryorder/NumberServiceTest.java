package com.example.binaryorder;

import com.example.binaryorder.service.NumberService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberServiceTest {

    @InjectMocks
    private NumberService numberService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this); // Initialize mocks
    }

    @Test
    void orderByBinaryOrdinalAscendingTest (){
        Integer[] testList = {1, 2, 8, 3, 5, 9, 7, 25, 42};
        List<Integer> expectedResult = List.of(1, 2, 8, 3, 5, 9, 7, 25, 42);
        assertEquals(expectedResult, numberService.orderByBinaryOrdinalAscending(testList));
    }

}
