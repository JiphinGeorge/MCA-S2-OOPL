import java.util.Scanner;

class Geometry {

    int area(int side) {
        return side * side;
    }

    int area(int length, int breadth) {
        return length * breadth;
    }

    double area(double radius) {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Geometry g = new Geometry();

       
        System.out.print("Enter side of square: ");
        int side = sc.nextInt();
        System.out.println("Area of Square: " + g.area(side));

        System.out.print("Enter length of rectangle: ");
        int length = sc.nextInt();
        System.out.print("Enter breadth of rectangle: ");
        int breadth = sc.nextInt();
        System.out.println("Area of Rectangle: " + g.area(length, breadth));

        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();
        System.out.println("Area of Circle: " + g.area(radius));

        sc.close();
    }
}
