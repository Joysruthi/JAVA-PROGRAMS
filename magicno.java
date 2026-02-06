import java.util.*;
public class magicno {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number:");
       int num=sc.nextInt();
       while(num>9){
        int sum=0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        num=sum;
       }
        
       if(num==1){
        System.out.println("Magic no.");
       }else{
        System.out.println("Not magic no.");
    }
   } 
}
