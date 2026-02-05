import java.util.Scanner;

class NonStaticMethods {

    void multiplicationTable(int num) {
        System.out.println("Multiplication Table of " + num);
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
    void checkPrime(int num) {
        int count = 0;
        if (num <= 1) {
            System.out.println(num + " is NOT a prime number");
            return;
        }
        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                count++;
        }
        if (count == 2)
            System.out.println(num + " is a PRIME number");
        else
            System.out.println(num + " is NOT a prime number");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NonStaticMethods obj = new NonStaticMethods();
        System.out.print("Enter number for multiplication table: ");
        int table = sc.nextInt();
        obj.multiplicationTable(table);
        System.out.print("Enter number to check prime: ");
        int prime = sc.nextInt();
        obj.checkPrime(prime);
        sc.close();
    }
}
