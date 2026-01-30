class Zoo {
    String name;
    String[] regions;

    Zoo(String name, String[] regions) {
        this.name = name;
        this.regions = regions;
    }

    class Enclosure {
        String name;
        String type;
        String[] animals;

        Enclosure(String name, String type, String[] animals) {
            this.name = name;
            this.type = type;
            this.animals = animals;
        }

        void display() {
            System.out.println("  Enclosure Name: " + name);
            System.out.println("  Type: " + type);
            System.out.print("  Animals: ");
            for (String animal : animals) {
                System.out.print(animal + " ");
            }
            System.out.println("\n");
        }
    }

    static class Contact {
        String address;
        String phoneNo;

        Contact(String address, String phoneNo) {
            this.address = address;
            this.phoneNo = phoneNo;
        }

        void display() {
            System.out.println("Zoo Address: " + address);
            System.out.println("Phone No: " + phoneNo);
        }
    }

    void displayZooDetails() {
        System.out.println("Zoo Name: " + name);
        System.out.print("Regions: ");
        for (String region : regions) {
            System.out.print(region + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {

       
        String[] regions = {"Area-1", "Area-2", "Area-3"};
        Zoo zoo = new Zoo("National Wildlife Zoo", regions);
        Zoo.Contact contact = new Zoo.Contact(
                "Green Park Road, City Center",
                "9876543210"
        );
        zoo.displayZooDetails();
        contact.display();
        System.out.println();

        Zoo.Enclosure e1 = zoo.new Enclosure(
                "Grassland",
                "Outdoor",
                new String[]{"Lion", "Zebra", "Deer"}
        );

        Zoo.Enclosure e2 = zoo.new Enclosure(
                "Fly Zone",
                "Indoor",
                new String[]{"Parrot", "Eagle", "Owl"}
        );

        Zoo.Enclosure e3 = zoo.new Enclosure(
                "Aquatic",
                "Indoor",
                new String[]{"Fish", "Turtle", "Crocodile"}
        );

        System.out.println("Enclosure Details:\n");
        e1.display();
        e2.display();
        e3.display();
    }
}
