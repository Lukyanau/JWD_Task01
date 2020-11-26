package by.epam_training.lesson1.task1.service.number8;

public class FunctionService {
    public double getFunctionCondition(double x) {
        if (x < 3) {
            return 1 / (Math.pow(x, 3) - 6);
        } else {
            return -1 * (Math.pow(x, 2)) + 3 * x + 9;
        }

    }

}
