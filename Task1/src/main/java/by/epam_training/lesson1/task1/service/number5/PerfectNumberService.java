package by.epam_training.lesson1.task1.service.number5;

import by.epam_training.lesson1.task1.exception.ProjectException;

public class PerfectNumberService {
    public boolean isNumberPerfect(int number) throws ProjectException {
        if (number < 0) {
            throw new ProjectException("Invalid number");
        }
        int half = number / 2;
        int counter = 0;
        for (int i = 1; i <= half; i++) {
            if (number % i == 0) {
                counter += i;
            }
        }
        return number == counter;
    }

}
