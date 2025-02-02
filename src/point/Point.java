package point;

import static java.lang.Math.*;

public class Point {
    int x;
    int y;

    Point() {
        this(1, 1);
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    double getDistance(Point p) {
        return sqrt(pow(this.x - p.x, 2) + pow(this.y - p.y, 2));
    }

    @Override
    public String toString() {
        return "x : " + x + ", y : " + y;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            Point p = (Point) obj;

            return this.x == p.x && this.y == p.y;
        }

        return false;
    }
}
