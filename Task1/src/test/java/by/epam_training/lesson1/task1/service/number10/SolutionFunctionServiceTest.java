package by.epam_training.lesson1.task1.service.number10;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class SolutionFunctionServiceTest {
    private static SolutionFunctionService solutionFunctionService;

    @Before
    public void setUp() throws Exception {
        solutionFunctionService = new SolutionFunctionService();
    }

    @Test
    public void calculateSolutionFunctionTestValid() {
        String expected = "x= 1.0\ttg(x)= 1.5574077246549023\n";
        String actual = solutionFunctionService.calculateSolutionFunction(1, 1, 0.5);
        assertEquals(actual, expected);
    }

    @Test
    public void calculateSolutionFunctionTestInvalid() {
        String expected = "x= 1.0\ttg(x)= 1\n";
        String actual = solutionFunctionService.calculateSolutionFunction(1, 1, 0.5);
        assertNotEquals(actual, expected);
    }

    @After
    public void tearDown() throws Exception {
        solutionFunctionService = null;
    }
}
