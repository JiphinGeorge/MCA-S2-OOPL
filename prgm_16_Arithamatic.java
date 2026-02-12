
import java.util.Scanner;

import prgm_16_ArithematicPackage.*;

public class prgm_16_Arithamatic{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the First Number :");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number :");
        int b = sc.nextInt();
        Add obj1 = new Add();
        Subtract obj2 = new Subtract();
        Multiply obj3 = new Multiply();
        Divide obj4 = new Divide();

        obj1.add(a, b);
        obj2.subtract(a, b);
        obj3.multiply(a, b);
        obj4.divide(a, b);
        sc.close();
    }
}
