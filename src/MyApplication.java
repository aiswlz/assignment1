import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {
        Shape shape = new Shape();

        File file = new File("src/coordinates.txt");
        Scanner sc = new Scanner(file);


        Point point1 = new Point(sc.nextInt(), sc.nextInt());
        Point point2 = new Point(sc.nextInt(), sc.nextInt());
        Point point3 = new Point(sc.nextInt(), sc.nextInt());
        Point point4 = new Point(sc.nextInt(), sc.nextInt());
        Point point5 = new Point(sc.nextInt(), sc.nextInt());
        Point point6 = new Point(sc.nextInt(), sc.nextInt());
        Point point7 = new Point(sc.nextInt(), sc.nextInt());
        Point point8 = new Point(sc.nextInt(), sc.nextInt());
        Point point9 = new Point(sc.nextInt(), sc.nextInt());
        Point point10 = new Point(sc.nextInt(), sc.nextInt());

        shape.addPoint(point1);
        shape.addPoint(point2);
        shape.addPoint(point3);
        shape.addPoint(point4);
        shape.addPoint(point5);
        shape.addPoint(point6);
        shape.addPoint(point7);
        shape.addPoint(point8);
        shape.addPoint(point9);
        shape.addPoint(point10);


        System.out.println(point2.calculateDistanceTo(point1.xCoordinate, point1.yCoordinate));
        System.out.println(point1.displayInfo());
        System.out.println(shape.calculatePerimeter());
        System.out.println(shape.findLongestSide());
        System.out.println(shape.calculateAverageSide());
    }
}
