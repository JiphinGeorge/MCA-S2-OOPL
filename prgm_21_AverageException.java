import java.util.*;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String msg) {
        super(msg);
    }
}public class prgm_21_AverageException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of integers: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number: ");
            int num = sc.nextInt();
            try {
                if (num < 0)
                    throw new NegativeNumberException("Negative numbers not allowed");
                sum += num;
            } catch (NegativeNumberException e) {
                System.out.println(e.getMessage());
                i--;
            }
        }
        System.out.println("Average = " + (sum / (double)n));
    }
}