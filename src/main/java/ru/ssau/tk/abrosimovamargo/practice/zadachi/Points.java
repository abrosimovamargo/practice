package ru.ssau.tk.abrosimovamargo.practice.zadachi;

public class Points {
    private Points() {
    }
    public static Point sum(Point t1, Point t2){

        return new Point(t1.x + t2.x, t1.y + t2.y, t1.z + t2.z);
    }
    public static Point subtract(Point t1, Point t2){

        return new Point(t1.x - t2.x, t1.y - t2.y, t1.z - t2.z);
    }
    public static Point multiply(Point t1, Point t2){

        return new Point(t1.x * t2.x, t1.y * t2.y, t1.z * t2.z);
    }
    public static Point divide(Point t1, Point t2){

        return new Point(t1.x / t2.x, t1.y / t2.y, t1.z / t2.z);
    }
    public static Point enlarge(Point t, double a) {
        return new Point(t.x * a, t.y * a, t.z * a);
    }
    public static double length(Point t) {
        return t.length(t);
    }
    public static Point opposite(Point t) {
        return new Point(-1 * t.x, -1 * t.y, -1 * t.z);
    }
    public static Point inverse(Point t) {
        return new Point(1 / t.x, 1 / t.y, 1 / t.z);
    }
    public static double scalarProduct(Point t1, Point t2) {
        return t1.x * t2.x + t1.y * t2.y + t1.z * t2.z;
    }
    public static Point vectorProduct(Point t1, Point t2) {
        double newX = t1.y * t2.z - t2.y * t1.z;
        double newY = t1.x * t2.z - t2.x * t1.z;
        double newZ = t1.x * t2.y - t2.x * t1.y;
        return new Point(1 * newX, -1 * newY, 1 * newZ);
    }

}
