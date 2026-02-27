interface Comparable {

    double volume();                
    int compare(Comparable other);   
}


class Cuboid implements Comparable {

    double length, width, height;

    Cuboid(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }

    public double volume() {
        return length * width * height;
    }

    public int compare(Comparable other) {

        if (this.volume() > other.volume())
            return 1;
        else if (this.volume() < other.volume())
            return -1;
        else
            return 0;
    }
}

class Cylinder implements Comparable {
    double radius, height;
    Cylinder(double r, double h) {
        radius = r;
        height = h;
    }
    public double volume() {
        return Math.PI * radius * radius * height;
    }
    public int compare(Comparable other) {

        if (this.volume() > other.volume())
            return 1;
        else if (this.volume() < other.volume())
            return -1;
        else
            return 0;
    }
}

public class prgm_13_Comparable {
    public static void main(String[] args) {
        Cuboid c1 = new Cuboid(4, 5, 6);
        Cylinder c2 = new Cylinder(3, 7);
        int result = c1.compare(c2);
        if (result > 0)
            System.out.println("Cuboid has larger volume");
        else if (result < 0)
            System.out.println("Cylinder has larger volume");
        else
            System.out.println("Both have equal volume");
    }
}
