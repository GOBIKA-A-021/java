
import java.util.*;

public class arraymaxele {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = 5;
        int[] a= new int[size];
        int max=a[0];
        System.out.println("Enter array elements");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println("Max:"+max);
    }
}
