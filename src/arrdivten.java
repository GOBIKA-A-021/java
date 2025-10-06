import java.util.Scanner;

public class arrdivten {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length;i++) {
            if (arr[i] % 10 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
        for (int i = 0; i < arr.length;i++) {
            if (arr[i] % 10 == 0) {
                System.out.print(arr[i] + " ");
            }
        }


    }
}
