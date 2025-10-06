import java.util.*;

public class arraysum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = 5;
        int sum=0;
        int[] a= new int[size];
        System.out.println("Enter array elements");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
            sum+=a[i];
        }
        System.out.println(Arrays.toString(a));
        System.out.println("Sum:"+sum);
    }
}
