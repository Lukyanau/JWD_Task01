package by.epam_training.lesson1.task1.service.number6;

import by.epam_training.lesson1.task1.exception.ProjectException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.fail;

public class HourMinuteSecondServiceTest {
    private static HourMinuteSecondService hourMinuteSecondService;

    @Before
    public void setUp() throws Exception {
        hourMinuteSecondService = new HourMinuteSecondService();
    }

    @Test
    public void getHoursTestValid() {
        int seconds = 7200;
        int expected = 2;
        try {
            int condition = hourMinuteSecondService.getHours(seconds);
            assertEquals(condition, expected);
        } catch (ProjectException exp) {
            fail(exp.getMessage());
        }
    }

    @Test
    public void getHoursTestInvalid() {
        int seconds = 7200;
        int expected = 3;
        try {
            int condition = hourMinuteSecondService.getHours(seconds);
            assertNotEquals(condition, expected);
        } catch (ProjectException exp) {
            fail(exp.getMessage());
        }
    }

    @Test(expected = ProjectException.class)
    public void getHoursTestException() throws ProjectException {
        hourMinuteSecondService.getHours(-5);
    }

    @Test
    public void getMinutesTestValid() {
        int seconds = 3780;
        int expected = 3;
        try {
            int condition = hourMinuteSecondService.getMinutes(seconds);

            assertEquals(condition, expected);
        } catch (ProjectException exp) {
            fail(exp.getMessage());
        }
    }

    @Test
    public void getMinutesTestInvalid() {
        int seconds = 180;
        int expected = 5;
        try {
            int condition = hourMinuteSecondService.getMinutes(seconds);
            assertNotEquals(condition, expected);
        } catch (ProjectException exp) {
            fail(exp.getMessage());
        }
    }

    @Test(expected = ProjectException.class)
    public void getMinutesTestException() throws ProjectException {
        hourMinuteSecondService.getMinutes(-1);
    }

    @Test
    public void getSecondsTestValid() {
        int seconds = 25;
        int expected = 25;
        try {
            int condition = hourMinuteSecondService.getSeconds(seconds);
            assertEquals(condition, expected);
        } catch (ProjectException exp) {
            fail(exp.getMessage());
        }
    }

    @Test
    public void getSecondsTestInvalid() {
        int seconds = 25;
        int expected = 24;
        try {
            int condition = hourMinuteSecondService.getSeconds(seconds);
            assertNotEquals(condition, expected);
        } catch (ProjectException exp) {
            fail(exp.getMessage());
        }
    }

    @Test(expected = ProjectException.class)
    public void getSecondsTestException() throws ProjectException {
        hourMinuteSecondService.getSeconds(-5);
    }

    @After
    public void tearDown() throws Exception {
        hourMinuteSecondService = null;
    }
}
