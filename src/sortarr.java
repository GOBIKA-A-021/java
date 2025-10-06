import java.util.*;

public class sortarr
{
    public static void sort(int[] a) {
        for (int i = 0; i < a.length-1; i++) {
            for (int j =0; j < a.length-1; j++) {
                if (a[j]>a[j+1])
                {

                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.print(Arrays.toString(a));
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
        sort(a);
    }
}
