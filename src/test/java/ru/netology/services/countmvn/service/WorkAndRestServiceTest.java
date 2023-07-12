package ru.netology.services.countmvn.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class WorkAndRestServiceTest {
    @ParameterizedTest
    @CsvSource({
            "10000,3000,20000,3",
            "100000,60000,150000,2"
    })
    public void shouldCalculateForWork(int income, int expenses, int threshold, int expected) {
        WorkAndRestService service = new WorkAndRestService();

        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    public void shouldCalculateForRest() {
//        WorkAndRestService service = new WorkAndRestService();
//
//        int income = 100000;
//        int expenses = 60000;
//        int threshold = 150000;
//        int expected = 2;
//        int actual = service.calculate(income, expenses, threshold);
//        Assertions.assertEquals(expected, actual);
//    }
}