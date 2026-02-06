import java.util.Scanner;

public class facto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value:");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Error!");
        } else {
            long fact = 1;
            for (int i = 1; i <= n; i++) {
                fact =fact* i;
            }
            System.out.println(fact);
        }
    }
}

