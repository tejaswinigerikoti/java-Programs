import java.util.*;

public class Exception1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numerator:");
        int n = sc.nextInt();

        System.out.println("Enter the denominator:");
        int d = sc.nextInt();

        try {
            int q = n / d;
            System.out.println("The result is: " + q);
        } catch (ArithmeticException e) {
            System.out.println("We can't divide by zero");
        }

        sc.close();
    }
}
