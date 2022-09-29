package Java.J_le_les7;

public class task1 {
    // FIRST

    // static double distance(int x1, int y1, int x2, int y2) {
    // return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    // }

    // SECOND

    static double distance(Point a, Point b) { // overload
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }

    public static void main(String[] args) {
        // FIRST

        // int ax = 0;
        // int ay = 0;
        // int bx = 0;
        // int by = 1;
        // System.out.println(distance(ax, ay, bx, by));

        // SECOND

        // Point a = new Point();
        // a.x = 0;
        // a.y = 2;
        // Point b = new Point();
        // b.x = 0;
        // b.y = 10;
        // System.out.println(distance(a, b));

        // THIRD

        Point a = new Point(0, 2);
        a.setX(12);
        Point b = new Point(0, 10);
        Point c = new Point();
        Point d = new Point(10);
        System.out.println(a);
        System.out.println(b);
    }
}
////////////////////// in other file
// SECOND

// class Point{
// int x,y;
// }

// THIRD
/**
 * Точки в 2D
 */
class Point {
    private int x, y;
    /**
     * Конструктор
     * @param valueX Точка X
     * @param valueY Точка Y
     */
    public Point(int valueX, int valueY) {
        x = valueX;
        y = valueY;
    }

    public Point(int value) {
        this(value, value);
    }

    public Point() {
        this(0);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int value) {
        this.x = value;
    }

    public void setY(int value) {
        this.y = value;
    }

    private String getInfo() {
        return String.format("x: %d; y: %d", x, y);
    }

    @Override
    public String toString() {
        return getInfo();
    }
}
