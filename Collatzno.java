import java.util.*;
public class Collatzno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the positive number:");
        int num=sc.nextInt();
        System.out.println("Collatz secquence:");
        while(num>1){
            System.out.print(num+",");
            if(num%2==0){
                num=num/2;
            }else{
                num=num*3+1;
            }
        }
        System.out.println(num);
    }
}
