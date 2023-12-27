import java.util.ArrayList;

public class Shape {
    private final ArrayList<Point> pointsList;

    int i = 0;
    double resultperimeter = 0;
    int k = 0;
    double maxSideLength = 0;

    public Shape() {
        pointsList = new ArrayList<>();
    }

    public void addPoint(Point thispoint) {
        pointsList.add(thispoint);
    }

    public double calculateAverageSide() {
        return calculatePerimeter() / 10;
    }

    public double findLongestSide() {
        while (k < 9) {
            if (maxSideLength < pointsList.get(k).calculateDistanceTo(pointsList.get(k + 1).xCoordinate, pointsList.get(k + 1).yCoordinate)) {
                maxSideLength = pointsList.get(k).calculateDistanceTo(pointsList.get(k + 1).xCoordinate, pointsList.get(k + 1).yCoordinate);
            }
            k++;
        }
        return Math.max(pointsList.get(9).calculateDistanceTo(pointsList.get(0).xCoordinate, pointsList.get(0).yCoordinate), maxSideLength);
    }

    public double calculatePerimeter() {
        while (i < 9) {
            resultperimeter = resultperimeter + pointsList.get(i).calculateDistanceTo(pointsList.get(i + 1).xCoordinate, pointsList.get(i + 1).yCoordinate);
            i++;
        }
        return resultperimeter + pointsList.get(9).calculateDistanceTo(pointsList.get(0).xCoordinate, pointsList.get(0).yCoordinate);
    }
}
