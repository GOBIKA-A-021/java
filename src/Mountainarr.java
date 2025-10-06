import java.util.Scanner;

public class Mountainarr {
    public static void mountain(int[] a)
    {  for(int i=0;i<a.length;i++)
    {

    }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements in array");
        int size = sc.nextInt();
        int[] a = new int[size];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        mountain(a);

    }
}
