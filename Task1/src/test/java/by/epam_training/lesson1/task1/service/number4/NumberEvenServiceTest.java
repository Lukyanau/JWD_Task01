package by.epam_training.lesson1.task1.service.number4;

import org.junit.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NumberEvenServiceTest {
    private static NumberEvenService numberEvenService;

    @Before
    public void setUp() throws Exception {
        numberEvenService = new NumberEvenService();
    }

    @Test
    public void isTwoNumbersEvenTestValid() {
        int number_one = 2;
        int number_two = 4;
        int number_three = 5;
        int number_four = 7;
        boolean condition = numberEvenService.isTwoNumbersEven(number_one, number_two, number_three, number_four);
        assertTrue(condition);
    }

    @Test
    public void isTwoNumbersEvenTestInvalid() {
        int number_one = 2;
        int number_two = 3;
        int number_three = 5;
        int number_four = 7;
        boolean condition = numberEvenService.isTwoNumbersEven(number_one, number_two, number_three, number_four);
        assertFalse(condition);
    }

    @After
    public void tearDown() throws Exception {
        numberEvenService = null;
    }
}
