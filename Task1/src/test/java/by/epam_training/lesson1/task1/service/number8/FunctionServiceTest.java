package by.epam_training.lesson1.task1.service.number8;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FunctionServiceTest {
    private static FunctionService functionService;

    @Before
    public void setUp() throws Exception {
        functionService = new FunctionService();
    }

    @Test
    public void getFunctionConditionTestValid() {
        double x = 2;
        double expected = 0.5;
        double result = functionService.getFunctionCondition(x);
        assertEquals(result, expected, 0.1);
    }

    @Test
    public void getFunctionConditionTestInvalid() {
        double x = 2;
        double expected = 0.7;
        double result = functionService.getFunctionCondition(x);
        assertNotEquals(result, expected);
    }

    @After
    public void tearDown() throws Exception {
        functionService = null;

    }
}
