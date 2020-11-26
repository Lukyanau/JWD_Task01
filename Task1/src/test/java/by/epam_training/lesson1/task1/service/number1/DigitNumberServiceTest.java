package by.epam_training.lesson1.task1.service.number1;

import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DigitNumberServiceTest {

    private static DigitNumberService digitNumberService;

    @Before
    public void setUp() throws Exception {
        digitNumberService = new DigitNumberService();
    }

    @Test
    public void calculateDigitOfNumberTestValid() {
        int number = 12;
        int expected = 4;
        int result = digitNumberService.calculateDigitOfNumber(number);
        assertEquals(result, expected);
    }

    @Test
    public void calculateDigitOfNumberTestInvalid() {
        int number = 12;
        int expected = 5;
        int result = digitNumberService.calculateDigitOfNumber(number);
        assertNotEquals(result, expected);
    }

    @After
    public void tearDown() throws Exception {
        digitNumberService = null;
    }
}
