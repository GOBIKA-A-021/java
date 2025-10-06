import java.util.*;
import java.io.*;

public class squarearray {
    public static void square(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=(int)Math.pow(arr[i],2);//arr[i]*arr[i];
        }
        System.out.print(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of an array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        square(arr);
    }
}
