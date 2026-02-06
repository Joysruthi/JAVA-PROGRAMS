import java.util.*;
public class strongno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int Original=num;int sum=0;
        while(num>0){
            int digit=num%10;
            int fact=1;
            for(int i=1;i<=digit;i++){
                fact=fact*i;
            }
            sum=sum+fact;
            num/=10;
        }
        if(sum==Original){
            System.out.println("Strong number.");
        }else{
            System.out.println("Not strong number.");
        }
    }
}
