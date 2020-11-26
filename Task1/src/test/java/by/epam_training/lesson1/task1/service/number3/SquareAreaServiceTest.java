package by.epam_training.lesson1.task1.service.number3;

import by.epam_training.lesson1.task1.exception.ProjectException;
import org.junit.*;

import static org.junit.Assert.*;
import static org.junit.Assert.fail;

public class SquareAreaServiceTest {
    private static SquareAreaService squareAreaService;

    @Before
    public void setUp() throws Exception {
        squareAreaService = new SquareAreaService();
    }

    @Test
    public void calculateSmallSquareAreaTestValid() {
        double bigArea = 24;
        double expected = 11.999999999999998;
        try {
            double result = squareAreaService.calculateSmallSquareArea(bigArea);
            assertEquals(result, expected, 0.1);
        } catch (ProjectException exp) {
            fail(exp.getMessage());
        }
    }

    @Test
    public void calculateSmallSquareAreaTestInvalid() {
        double bigArea = 24;
        double expected = 15;
        try {
            double result = squareAreaService.calculateSmallSquareArea(bigArea);
            assertNotEquals(result, expected);
        } catch (ProjectException exp) {
            fail(exp.getMessage());
        }
    }

    @Test(expected = ProjectException.class)
    public void calculateSmallSquareAreaTestException() throws ProjectException {
        squareAreaService.calculateSmallSquareArea(-24);
    }


    @Test
    public void calculateDifferenceSquaresTestValid() {
        double smallArea = 24;
        double bigArea = 48;
        double expected = 2;
        double result = squareAreaService.calculateDifferenceSquares(smallArea, bigArea);
        assertEquals(result, expected, 0.1);
    }

    @Test
    public void calculateDifferenceSquaresTestInvalid() {
        double smallArea = 24;
        double bigArea = 48;
        double expected = 3;
        double result = squareAreaService.calculateDifferenceSquares(smallArea, bigArea);
        assertNotEquals(result, expected);
    }


    @After
    public void tearDown() throws Exception {
        squareAreaService = null;
    }
}
