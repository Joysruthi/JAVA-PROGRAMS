import java.util.Scanner;
public class days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();

        int years = days / 365;
        days %= 365;
        System.out.println("Years: " + years);
        int months = days / 30;
        System.out.println("Months: " + months);
        days %= 30;
        System.out.println("Days: " + days);
  }
}

