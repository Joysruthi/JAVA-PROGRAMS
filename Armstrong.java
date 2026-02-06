import java.util.*;
public class Armstrong{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int temp=num;
        int count=0;
        while(temp!=0){
            count++;
            temp=temp/10;
        }
        int digit=0;int sum=0;
        temp=num;
        while(temp!=0){
            digit=temp%10;
            sum=sum+((int)Math.pow(digit,count));
            temp=temp/10;
        }
        if(num==sum){
            System.out.println("Armstrong No");
        }else{
            System.out.println("Not Armstrong No");
        }
    }
}