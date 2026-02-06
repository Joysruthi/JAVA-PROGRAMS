import java.util.*;
public class neon {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number:");
       int num=sc.nextInt();
       int sum=0;int original=num;
       int temp=(int)Math.pow(num,2);
       while(temp!=0){
        int digit=temp%10;
        sum=sum+digit;
        temp=temp/10;
       } 
       if(original==sum){
        System.out.println("Neon no.");
       }else{
        System.out.println("Not neon no.");
       }
    }
}
