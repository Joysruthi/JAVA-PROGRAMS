import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int dividend = Math.max(n1, n2);
        int divisor = Math.min(n1, n2);

        while (divisor != 0) {
            int rem = dividend % divisor;
            dividend = divisor;
            divisor = rem;
        }

        System.out.println("GCD is: " + dividend);
    }
}