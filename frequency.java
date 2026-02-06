import java.util.*;
public class frequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int arr[]=new int[10];
        int digit;
        while(num>0){
            digit=num%10;
            switch(digit){
                case 0:
                arr[0]++;
                break;
                case 1:
                arr[1]++;
                break;
                case 2:
                arr[2]++;
                break;
                case 3:
                arr[3]++;
                break;
                case 4:
                arr[4]++;
                break;
                case 5:
                arr[5]++;
                break;
                case 6:
                arr[6]++;
                break;
                case 7:
                arr[7]++;
                break;
                case 8:
                arr[8]++;
                break;
                case 9:
                arr[9]++;
                break;
            }
            num=num/10;
        }
        for(int i=0;i<=9;i++){
            if(arr[i]!=0){
                System.out.println(i+"-"+arr[i]+" ");
            }
        }
    }
}
