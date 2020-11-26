package by.epam_training.lesson1.task1.service.number5;

import by.epam_training.lesson1.task1.exception.ProjectException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.fail;

public class PerfectNumberServiceTest {
    private static PerfectNumberService perfectNumberService;

    @Before
    public void setUp() throws Exception {
        perfectNumberService = new PerfectNumberService();
    }

    @Test
    public void isNumberPerfectTestValid() {
        int number = 6;
        try {
            boolean condition = perfectNumberService.isNumberPerfect(number);
            assertTrue(condition);
        } catch (ProjectException exp) {
            fail(exp.getMessage());
        }
    }

    @Test
    public void isNumberPerfectTestInvalid() {
        int number = 7;
        try {
            boolean condition = perfectNumberService.isNumberPerfect(number);
            assertFalse(condition);
        } catch (ProjectException exp) {
            fail(exp.getMessage());
        }

    }

    @Test(expected = ProjectException.class)
    public void isNumberPerfectTestException() throws ProjectException {
        perfectNumberService.isNumberPerfect(-100);
    }

    @After
    public void tearDown() throws Exception {
        perfectNumberService = null;
    }
}
