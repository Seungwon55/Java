package point;

public class PointTest {
    public static void main(String[] args) {
        Point p = new Point(3,5);
        System.out.println(p);
    }

    static double getDistance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
    }
}
