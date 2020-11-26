package by.epam_training.lesson1.task1.service.number10;

public class SolutionFunctionService {
    public String calculateSolutionFunction(double a, double b, double h) {
        StringBuilder result = new StringBuilder();
        for (; a <= b; a += h) {
            result.append("x= ").append(a).append("\ttg(x)= ").append(Math.tan(a)).append("\n");
        }
        return result.toString();
    }

}
