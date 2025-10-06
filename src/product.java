import java.util.Scanner;

public class product {
    public static void product(int[] arr)
    {   int product=1;
        for(int i=0;i<arr.length;i++)
        {
            product *=arr[i];
        }
        for(int i=0;i<arr.length;i++)
        {       int n=product/arr[i];
                System.out.print(n+" ");
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
        product(a);
    }
}
