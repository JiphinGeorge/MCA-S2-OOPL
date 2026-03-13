
import java.util.*;

public class prgm_17_Listofnames {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n1 Add");
            System.out.println("2 Remove");
            System.out.println("3 Search");
            System.out.println("4 Sort");
            System.out.println("5 Display");
            System.out.println("6 Exit");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter name: ");
                    names.add(sc.nextLine());
                    break;

                case 2:
                    System.out.print("Enter name: ");
                    names.remove(sc.nextLine());
                    break;

                case 3:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.println(names.contains(name) ? "Found" : "Not Found");
                    break;

                case 4:
                    Collections.sort(names);
                    break;

                case 5:
                    System.out.println(names);
                    break;
            }

        } while (choice != 6);
        sc.close();
    }


}
