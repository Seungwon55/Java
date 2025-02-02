package point;

public class Point3D extends Point {
    int z;

    Point3D() {
        this(1 ,1, 1);
    }

    Point3D(int x, int y, int z) {
        super(x, y); // Point.Point(x, y)
        this.z = z;
    }

    @Override
    public String toString() {
        return "x : " + x + ", y : " + y + ", z : " + z;
    }
}
