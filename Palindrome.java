import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int Original=num;int rev=0;
        while(num!=0){
            int digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        if(Original==rev){
            System.out.println("The number is polindrome.");
        }else{
            System.out.println("The number is not polindrome");
        }
    }
}
