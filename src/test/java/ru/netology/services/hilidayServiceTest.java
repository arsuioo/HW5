package ru.netology.services;

import ru.netology.services.holidayService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class hilidayServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = {
            "3, 100000, 3000, 20000",
            "2, 100000, 60000, 150000"
    })
    public void TestService (int expected, int income, int expenses, int thresold){
        holidayService = new holidayService();

        int actual = holidayService(income, expenses, thresold);

        Assertions.assertEquals(expected, actual);
    }


}
