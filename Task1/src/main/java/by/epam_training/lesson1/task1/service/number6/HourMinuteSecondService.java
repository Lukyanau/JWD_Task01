package by.epam_training.lesson1.task1.service.number6;

import by.epam_training.lesson1.task1.exception.ProjectException;

public class HourMinuteSecondService {
    private static final int HOUR_IN_SECONDS = 3600;
    private static final int MINUTE_IN_SECONDS = 60;

    public int getHours(int seconds) throws ProjectException {
        if (seconds < 0) {
            throw new ProjectException("Invalid input");
        }
        return seconds / HOUR_IN_SECONDS;
    }

    public int getMinutes(int seconds) throws ProjectException {
        if (seconds < 0) {
            throw new ProjectException("Invalid input");
        }

        return (seconds - getHours(seconds) * 3600) / MINUTE_IN_SECONDS;
    }

    public int getSeconds(int seconds) throws ProjectException {
        if (seconds < 0) {
            throw new ProjectException("Invalid input");
        }
        return seconds - getHours(seconds) * 3600 - getMinutes(seconds) * 60;
    }

}
