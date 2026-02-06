import java.util.Scanner;

public class mileage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start:");
        double start = sc.nextDouble();
        System.out.println("Enter end:");
        double end = sc.nextDouble();

        double distance = end - start;
        double remuneration = distance * 25;

        System.out.printf("%.2f %.2f\n", distance, remuneration);
    }
}


