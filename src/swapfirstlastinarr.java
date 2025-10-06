import java.util.*;

public class swapfirstlastinarr {
    public static void swap(int[] arr)
    {
        int temp=arr[0];
        arr[0]=arr[arr.length-1];
        arr[arr.length-1]=temp;
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
        swap(arr);
    }
}
