import java.lang.Math;

public class Point{
    int xCoordinate;
    int yCoordinate;

    public Point(int x, int y) {
        this.xCoordinate = x;
        this.yCoordinate = y;
    }

    public String displayInfo() {
        return "Point:" +
                "\nx-coordinate: " + xCoordinate +
                "\ny-coordinate: " + yCoordinate;
    }

    public double calculateDistanceTo(int x2, int y2) {
        return Math.sqrt((xCoordinate-x2)*(xCoordinate-x2) + (yCoordinate-y2)*(yCoordinate-y2));
    }
}
