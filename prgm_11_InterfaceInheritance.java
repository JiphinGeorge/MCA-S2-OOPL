interface Measurable {
    public void Volume();
}

interface Printable {
    public void display();
}

class Rectangle {
    protected double length;
    protected double width;
    
        Rectangle(double l, double w) {
            length = l;
            width = w;
        }
    }
    
    class Cuboid extends Rectangle implements Measurable, Printable {
    
        private double height;
    
        Cuboid(double l, double w, double h) {
    
            super(l, w);
            height = h;
        }
    
        public void Volume() {
        System.out.println("Volume of Cuboid: " + (length * width * height));
    }
}

public class prgm_11_InterfaceInheritance {
    
}
