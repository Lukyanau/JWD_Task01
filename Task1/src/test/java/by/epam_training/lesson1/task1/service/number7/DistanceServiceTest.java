package by.epam_training.lesson1.task1.service.number7;

import by.epam_training.lesson1.task1.entity.Point;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DistanceServiceTest {
    private static DistanceService distanceService;

    @Before
    public void setUp() throws Exception {
        distanceService = new DistanceService();
    }

    @Test
    public void changeMinDistanceTestValid() {
        Point point1 = new Point(4, 4);
        Point point2 = new Point(5, 4);
        Point result = distanceService.getMinDistance(point1, point2);
        assertEquals(result, point1);
    }

    @Test
    public void changeMinDistanceTestInvalid() {
        Point point1 = new Point(4, 4);
        Point point2 = new Point(5, 4);
        Point result = distanceService.getMinDistance(point1, point2);
        assertNotEquals(result, point2);
    }

    @After
    public void tearDown() throws Exception {
        distanceService = null;
    }
}
