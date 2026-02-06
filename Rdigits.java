import java.util.*;
public class Rdigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int digit=0;
        while(num!=0){
            digit=num%10;
            num=num/10;
            System.out.print(digit+" ");
        }
        
    }
}
