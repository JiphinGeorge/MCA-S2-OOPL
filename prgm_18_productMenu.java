

import java.util.*;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class prgm_18_productMenu  {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Product> list = new ArrayList<>();

        int choice;

        do {

            System.out.println("\n1 Add Product");
            System.out.println("2 Sort by Name");
            System.out.println("3 Display");
            System.out.println("4 Exit");

            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Price: ");
                    double price = sc.nextDouble();

                    list.add(new Product(name, price));
                    break;

                case 2:
                    list.sort((p1,p2)->p1.name.compareTo(p2.name));
                    break;

                case 3:
                    for(Product p:list)
                        System.out.println(p.name+" "+p.price);
                    break;
            }

        } while (choice != 4);
        sc.close();
    }
}