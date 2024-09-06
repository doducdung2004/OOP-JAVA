import java.util.Scanner;

class Rectange {
    private double width;
    private double height;
    private String color;

    public Rectange(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double findArea() {
        return this.width * this.height;
    }

    public double findPerimeter() {
        return (this.width + this.height) * 2;
    }

    public void check(String color) {

        char a = color.charAt(0);
        char x = Character.toUpperCase(a);
        System.out.print(x);
        for (int i = 1; i < color.length(); i++) {
            char y = color.charAt(i);
            char z = Character.toLowerCase(y);
            System.out.print(z);
        }
        System.out.println();
    }

}

public class HinhChuNhat {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        double w = ip.nextDouble();
        double h = ip.nextDouble();
        String z = ip.next();
        if (w > 0 && h > 0) {
            Rectange rc1 = new Rectange(w, h, z);
            System.out.print((int) rc1.findPerimeter() + " " + (int) rc1.findArea() + " ");
            rc1.check(z);
        } else {
            System.out.println("INVALID");
        }
    }
}
