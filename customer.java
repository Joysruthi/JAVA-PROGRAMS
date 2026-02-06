import java.util.Scanner;
public class customer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age:");
        int age = sc.nextInt();
        System.out.println("Enter the gender");
        int gender = sc.nextInt(); 

        if (gender == 1) {
            if (age < 25) {
                System.out.println("Group 1");
            } else if (age <= 45) {
                System.out.println("Group 3");
            } else {
                System.out.println("Group 5");
            }
        } else if (gender == 2) {
            if (age < 25) {
                System.out.println("Group 2");
            } else if (age <= 45) {
                System.out.println("Group 4");
            } else {
                System.out.println("Group 5");
            }
        } else {
            System.out.println("Invalid");
        }
    }
}
