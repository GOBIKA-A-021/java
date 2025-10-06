import java.util.Scanner;

public class intersectionpfarr {
    public static void intersection(int[] a) {
        boolean f = false;
        for (int i = 0; i < a.length; i++) {

            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    f = true;
                    System.out.print(a[i]+" "+"are common element");
                    System.out.println();
                }

            }
        }



            if (f) {
                System.out.println(" Common element found");
            }
            else
                System.out.println("No Common element found");



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
        intersection(a);

    }
}
