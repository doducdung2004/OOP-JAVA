import static java.lang.Math.*;

import java.util.Scanner;

class Point {
    private double x;
    private double y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(Point p) {
        return Math.sqrt(pow(this.x - p.x, 2) + pow(this.y - p.y, 2));
    }

    public double distance(Point p1, Point p2) {
        return Math.sqrt(pow(p1.x - p2.x, 2) + pow(p1.x - p2.x, 2));
    }

    public String toString() {
        return x + " " + y;
    }
}

public class NewPoint {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while (t-- > 0) {
            double x = ip.nextDouble();
            double y = ip.nextDouble();
            Point a = new Point(x, y);
            x = ip.nextDouble();
            y = ip.nextDouble();
            Point b = new Point(x, y);
            System.out.printf("%.4f\n", a.distance(b));
        }
    }
}
