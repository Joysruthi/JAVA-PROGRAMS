import java.util.Scanner;
public class product {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int product =1, digit;
		while(n>0) {
			digit = n % 10;
			product*= digit;
			n /= 10;					
		}
		System.out.println(product);
		
	}
}