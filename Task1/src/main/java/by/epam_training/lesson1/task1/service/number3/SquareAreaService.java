package by.epam_training.lesson1.task1.service.number3;

import by.epam_training.lesson1.task1.exception.ProjectException;
import by.epam_training.lesson1.task1.validator.NumberValidator;

public class SquareAreaService {
    public double calculateSmallSquareArea(double area) throws ProjectException {
        NumberValidator numberValidator = new NumberValidator();
        if (!numberValidator.checkArea(area)) {
            throw new ProjectException("Invalid area");
        }
        double sideSmallSquare = Math.sqrt(area / 2);
        return Math.pow(sideSmallSquare, 2);

    }

    public double calculateDifferenceSquares(double smallArea, double bigArea) {
        return bigArea / smallArea;
    }

}
