package by.epam_training.lesson1.task1.service.number7;

import by.epam_training.lesson1.task1.entity.Point;

public class DistanceService {
    public Point getMinDistance(Point point1, Point point2) {
        return (getDistance(point1) > getDistance(point2) ? point2 : point1);
    }

    private double getDistance(Point point) {
        double distance = 0;
        distance = Math.sqrt(Math.pow(point.getX(), 2) + Math.pow(point.getY(), 2));
        return distance;
    }

}
