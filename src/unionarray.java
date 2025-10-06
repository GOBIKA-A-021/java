import java.util.Arrays;
import java.util.Scanner;

public class unionarray {
    public static void union(int[] a1, int[] a2, int[] a3) {
        int index = a1.length;
        for (int i = 0; i < a1.length; i++) {
            a3[i] = a1[i];
        }
        for (int j = 0; j < a2.length; j++) {
            a3[index] = a2[j];
            index++;
        }
        for (int i = 0; i < a3.length; i++) {
            for (int j = i + 1; j < a3.length; j++) {
                if (a3[i] == a3[j]) {
                    a3[j] = -1;
                }

            }
        }
        for (int i = 0; i < a3.length; i++) {
            if (a3[i] != -1) {
                System.out.print(a3[i] + " ");
            }
        }
       // System.out.print(Arrays.toString(a3));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a1 = new int[4];
        System.out.println("Enter array 1 elements");
        for (int i = 0; i < a1.length; i++) {
            a1[i] = sc.nextInt();
        }
        int[] a2 = new int[4];
        System.out.println("Enter array 2 elements");
        for (int i = 0; i < a2.length; i++) {
            a2[i] = sc.nextInt();
        }
        int n = a1.length + a2.length;
        int[] a3 = new int[n];
        union(a1, a2, a3);
    }
}
