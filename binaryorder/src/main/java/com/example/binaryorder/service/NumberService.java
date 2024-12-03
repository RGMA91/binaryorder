package com.example.binaryorder.service;

import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class NumberService {

    public List<Integer> orderByBinaryOrdinalAscending(Integer[] values){
        return List.of(values).stream()
                .sorted(Comparator.comparing(Integer::bitCount)
                        .thenComparing(value -> value)).toList();
    }

}
