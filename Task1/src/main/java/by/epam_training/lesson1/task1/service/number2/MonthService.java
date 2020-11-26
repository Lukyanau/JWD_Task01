package by.epam_training.lesson1.task1.service.number2;

import by.epam_training.lesson1.task1.entity.DateEmulator;
import by.epam_training.lesson1.task1.exception.ProjectException;
import by.epam_training.lesson1.task1.validator.NumberValidator;

public class MonthService {
    public int calculateNumberOfDaysInMonth(DateEmulator dateEmulator) throws ProjectException {
        NumberValidator numberValidator = new NumberValidator();
        if (!numberValidator.checkMonth(dateEmulator.getMonth())
                || !numberValidator.checkYear(dateEmulator.getYear())) {
            throw new ProjectException("Invalid data");
        }
        int quantity;
        switch (dateEmulator.getMonth()) {
            case (1):
            case (3):
            case (5):
            case (7):
            case (8):
            case (10):
            case (12):
                quantity = 31;
                break;
            case (2):
                if (isLeapYear(dateEmulator.getYear())) {
                    quantity = 28;
                } else {
                    quantity = 29;
                }
                break;
            default:
                quantity = 30;
        }
        return quantity;
    }

    private boolean isLeapYear(int year) {
        return (year % 400 == 0 || year % 4 == 0) && (year % 100 != 0);
    }

}
