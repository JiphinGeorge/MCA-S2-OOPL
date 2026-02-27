
interface ComparableShape {
    double volume();
    int compare(ComparableShape other);
}

class Cuboid implements ComparableShape {

    double length, width, height;

    Cuboid(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }

    public double volume() {
        return length * width * height;
    }

    public int compare(ComparableShape other) {
        return Double.compare(this.volume(), other.volume());
    }
}

class Cylinder implements ComparableShape {

    double radius, height;

    Cylinder(double r, double h) {
        radius = r;
        height = h;
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }

    public int compare(ComparableShape other) {
        return Double.compare(this.volume(), other.volume());
    }
}

public class prgm_15_ComparableShapes {

    public static void main(String[] args) {

        Cuboid c1 = new Cuboid(4,5,6);
        Cylinder c2 = new Cylinder(3,7);

        if(c1.compare(c2) > 0)
            System.out.println("Cuboid has larger volume");
        else
            System.out.println("Cylinder has larger volume");
    }
}
