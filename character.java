import java.util.Scanner;
public class character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter:");
        char ch = sc.next().charAt(0);
        if (Character.isLetter(ch)) {
            System.out.println("alphabet");
        } else if (Character.isDigit(ch)) {
            System.out.println("digit");
        } else {
            System.out.println("special");
        }
    }
}


