import javax.swing.*;
import java.awt.*;

// Interfaces
interface Printable {
    void printDetails();
}

interface Computable {
    double compute();
}

interface Drawable {
    void drawShape(Graphics g);
}

// Rectangle class
class RectangleShape extends JFrame implements Printable, Computable, Drawable {

    double length, breadth;

    RectangleShape(double l, double b) {
        length = l;
        breadth = b;

        setTitle("Rectangle");
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public double compute() {
        return length * breadth;   // Area
    }

    public void printDetails() {
        System.out.println("Rectangle Area: " + compute());
    }

    public void drawShape(Graphics g) {
        g.drawRect(100, 100, (int) length * 10, (int) breadth * 10);
    }

    public void paint(Graphics g) {
        super.paint(g);
        drawShape(g);
    }
}

// Sphere class
class SphereShape extends JFrame implements Printable, Computable, Drawable {

    double radius;

    SphereShape(double r) {
        radius = r;

        setTitle("Sphere");
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public double compute() {
        return 4 * Math.PI * radius * radius;   // Surface Area
    }

    public void printDetails() {
        System.out.println("Sphere Surface Area: " + compute());
    }

    public void drawShape(Graphics g) {
        int diameter = (int) radius * 20;
        g.drawOval(100, 100, diameter, diameter);
    }

    public void paint(Graphics g) {
        super.paint(g);
        drawShape(g);
    }
}

// Main class
public class prgm_12_RectangleSphereGUI {

    public static void main(String[] args) {

        RectangleShape r = new RectangleShape(10, 6);
        r.printDetails();

        // Uncomment below to draw Sphere instead
        // SphereShape s = new SphereShape(5);
        // s.printDetails();
    }
}
