import java.util.Scanner;

public class digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num:");
        int num = sc.nextInt();

        while (num > 0) {
            int digit=num % 10;
            num /= 10;
            System.out.print(digit+" ");
        }
    }
}



