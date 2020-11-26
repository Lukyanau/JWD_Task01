package by.epam_training.lesson1.task1.service.number9;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CircleServiceTest {
    private  static CircleService circleService;
    @Before
    public void setUp() throws Exception {
        circleService = new CircleService();
    }
    @Test
    public void getCircleLengthTestValid() {
        double length = 2;
        double expected = Math.PI * 4;
        double result = circleService.getCircleLength(length);
        assertEquals(result, expected,0.1);
    }

    @Test
    public void getCircleLengthTestInvalid() {
        double length = 2;
        double expected = Math.PI * 6;
        double result = circleService.getCircleLength(length);
        assertNotEquals(result, expected);
    }

    @Test
    public void getCircleAreaTestValid() {
        double length = 2;
        double expected = Math.PI * 4;
        double result = circleService.getCircleArea(length);
        assertEquals(result, expected,0.1);
    }

    @Test
    public void getCircleAreaTestInvalid() {
        double length = 3;
        double expected = Math.PI * 4;
        double result = circleService.getCircleArea(length);
        assertNotEquals(result, expected);
    }
    @After
    public void tearDown() throws Exception {
        circleService = null;
    }
}
