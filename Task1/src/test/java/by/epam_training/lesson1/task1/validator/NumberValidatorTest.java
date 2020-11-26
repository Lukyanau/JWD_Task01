package by.epam_training.lesson1.task1.validator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NumberValidatorTest {
    private NumberValidator numberValidator;

    @Before
    public void setUp() throws Exception {
        numberValidator = new NumberValidator();
    }

    @Test
    public void checkNumberTestValid() {
        boolean condition = numberValidator.checkNumber(10);
        assertTrue(condition);
    }

    @Test
    public void checkNumberTestInvalid() {
        boolean condition = numberValidator.checkNumber(-10);
        assertFalse(condition);
    }

    @Test
    public void checkMonthTestValid() {
        boolean condition = numberValidator.checkMonth(10);
        assertTrue(condition);
    }

    @Test
    public void checkMonthTestInvalid() {
        boolean condition = numberValidator.checkMonth(13);
        assertFalse(condition);
    }

    @Test
    public void checkYearTestValid() {
        boolean condition = numberValidator.checkYear(10);
        assertTrue(condition);
    }

    @Test
    public void checkYearTestInvalid() {
        boolean condition = numberValidator.checkYear(5555);
        assertFalse(condition);
    }

    @Test
    public void checkAreaTestValid() {
        boolean condition = numberValidator.checkArea(10);
        assertTrue(condition);
    }

    @Test
    public void checkAreaTestInvalid() {
        boolean condition = numberValidator.checkArea(200000);
        assertFalse(condition);
    }

    @After
    public void tearDown() throws Exception {
        numberValidator = null;
    }
}
