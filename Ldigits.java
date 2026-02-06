import java.util.*;
public class Ldigits {
    public static void main(String[] args) {
       Scanner sc=new Scanner (System.in);
       System.out.println("Enter the number:"); 
       int num=sc.nextInt();
       int temp=num;int count=0;
       while(temp>0){
        count++;
        temp/=10;
       }
       int div=(int)Math.pow(10,count-1);
       while(div>0){
           int digit=num/div;
           System.out.print(digit+" ");
           num=num%div;
           div=div/10;
       }
    }
}
