package ru.netology.services;

import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.services.holidayService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class hilidayServiceTest {

    @ParameterizedTest
    @CsvSource({
            "3, 10000, 3000, 20000",
            "2, 100000, 60000, 150000"
    })
    public void TestService(int expected, int income, int expenses, int thresold) {
        holidayService holidayService = new holidayService();

        int actual = holidayService.calculate(income, expenses, thresold);

        Assertions.assertEquals(expected, actual);
    }
}