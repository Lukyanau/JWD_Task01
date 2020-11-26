package by.epam_training.lesson1.task1.service.number4;

public class NumberEvenService {
    public boolean isTwoNumbersEven(int a, int b, int c, int d) {
        return (a % 2 == 0 && b % 2 == 0) || (a % 2 == 0 && c % 2 == 0)
                || (a % 2 == 0 && d % 2 == 0) || (b % 2 == 0 && c % 2 == 0)
                || (b % 2 == 0 && d % 2 == 0) || (c % 2 == 0 && d % 2 == 0);
    }

}
