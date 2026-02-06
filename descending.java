import java.util.*;

public class descending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr); // Ascending
        for (int i = 3; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}



