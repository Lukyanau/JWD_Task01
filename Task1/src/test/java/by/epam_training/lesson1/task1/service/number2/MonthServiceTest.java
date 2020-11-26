package by.epam_training.lesson1.task1.service.number2;

import by.epam_training.lesson1.task1.entity.DateEmulator;
import by.epam_training.lesson1.task1.exception.ProjectException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.fail;

public class MonthServiceTest {
    private static MonthService monthService;

    @Before
    public void setUp() throws Exception {
        monthService = new MonthService();
    }

    @Test
    public void calculateNumberOfDaysInMonthTestValid() {
        int year = 2000;
        int month = 4;
        int expected = 30;
        DateEmulator dateEmulator = new DateEmulator(year, month);
        try {
            int result = monthService.calculateNumberOfDaysInMonth(dateEmulator);
            assertEquals(result, expected);
        } catch (ProjectException exp) {
            fail(exp.getMessage());
        }
    }

    @Test
    public void calculateNumberOfDaysInMonthTestInvalid() {
        int year = 2000;
        int month = 4;
        int expected = 29;
        DateEmulator dateEmulator = new DateEmulator(year, month);
        try {
            int result = monthService.calculateNumberOfDaysInMonth(dateEmulator);
            assertNotEquals(result, expected);
        } catch (ProjectException exp) {
            fail(exp.getMessage());
        }
    }

    @Test(expected = ProjectException.class)
    public void calculateNumberOfDaysInMonthTestException() throws ProjectException {
        monthService.calculateNumberOfDaysInMonth(new DateEmulator(-5, -6));
    }

    @After
    public void tearDown() throws Exception {
        monthService = null;
    }
}
