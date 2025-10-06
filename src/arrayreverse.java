import java.util.Arrays;
import java.util.Scanner;

public class arrayreverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = 5;
        int[] a = new int[size];
        System.out.println("Enter array elements");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i]+" ");
        }
    }
}
