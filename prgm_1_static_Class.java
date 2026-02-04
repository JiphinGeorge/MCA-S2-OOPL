import java.util.Scanner;

class StaticMethods {

    static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }

    static int fibonacci(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number for factorial: ");
        int num = sc.nextInt();
        System.out.println("Factorial = " + factorial(num));

        System.out.print("Enter n for Fibonacci: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci number = " + fibonacci(n));

        sc.close();
    }
}
