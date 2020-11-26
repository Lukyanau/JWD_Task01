package by.epam_training.lesson1.task1.service.number1;

import by.epam_training.lesson1.task1.validator.NumberValidator;

public class DigitNumberService {
    public int calculateDigitOfNumber(int n) {
        NumberValidator numberValidator = new NumberValidator();
        if (!numberValidator.checkNumber(n)) {
            throw new RuntimeException();
        }
        int m = calculateLastDigitNumber(n);
        if (m > 10) {
            return m % 10;
        } else {
            return m;
        }

    }
    private int calculateLastDigitNumber(int m) {
        int n = m % 10;
        int result = (int) Math.pow(n, 2);
        return result;
    }
}
