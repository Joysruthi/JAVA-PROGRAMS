import java.util.Scanner;

public class div {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start:");
        int start = sc.nextInt();
        System.out.println("Enter end:");
        int end = sc.nextInt();

        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }

        System.out.println(sum);
        
    }
}



