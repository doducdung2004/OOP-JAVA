import java.util.Scanner;

class isRectan {
    private double width;
    private double height;
    private String color;

    public void rectange() {
        this.width = 1;
        this.height = 1;
    }

    public void rectange(double w, double h, String s) {
        this.width = w;
        this.height = h;
        this.color = s;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double findArea() {
        return width * height;
    }

    public double findPerimeter() {
        return (width + height) * 2;
    }

}

public class Rectange {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        double x = ip.nextDouble();
        double y = ip.nextDouble();
        String s = ip.next();
        isRectan a = new isRectan();
        System.out.printf(a.findArea(), a.findPerimeter(), a.getColor());
    }

}
