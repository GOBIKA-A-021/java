import java.util.*;
public class arrayex {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = 5;
        int[] a= new int[size];
        System.out.println("Enter array elements");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(a));
    }
}
