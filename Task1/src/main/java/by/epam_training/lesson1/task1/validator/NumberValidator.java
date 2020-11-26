package by.epam_training.lesson1.task1.validator;

public class NumberValidator {
    private static final int MAX_VALUE = 100000;
    private static final int BORDER_MONTH = 12;
    private static final int BORDER_YEAR = 5000;

    public boolean checkNumber(int n) {
        return n >= 0 && n <= MAX_VALUE;

    }

    public boolean checkMonth(int n) {
        return n > 0 && n <= BORDER_MONTH;

    }

    public boolean checkYear(int n) {
        return n > 0 && n < BORDER_YEAR;
    }

    public boolean checkArea(double area) {
        return area > 0 && area < MAX_VALUE;
    }
}
