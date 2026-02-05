import java.util.Scanner;

interface Shape {
    public void area();

    public void perimeter();
}

class Rectangle implements Shape {
    private double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    public void area() {
        System.out.println("Area of Rectangle: " + (length * width));
    }

    public void perimeter() {
        System.out.println("Perimeter of Rectangle: " + (2 * (length + width)));
    }
}

class Circle implements Shape {
    private double radius;

     Circle(double r) {
        radius = r;
    }

    public void area() {
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }

    public void perimeter() {
        System.out.println("Perimeter of Circle: " + (2 * Math.PI * radius));
    }
}
public class prgm_10_InterfaceReactangle {
    public static void main(String[] args) {
        Shape s;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Rectangle\n2. Circle\n3. Exit");
            System.out.println("Enter your choice: ");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter length and width: ");
                    double l = sc.nextDouble();
                    double w = sc.nextDouble();
                    s = new Rectangle(l, w);
                    s.area();
                    s.perimeter();
                    break;
                case 2:
                    System.out.println("Enter the Radius: ");
                    double r = sc.nextDouble();
                    s = new Circle(r);
                    s.area();
                    s.perimeter();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        }
    }
}
