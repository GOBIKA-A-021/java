import java.util.Arrays;
import java.util.Scanner;

public class deletelast {
        public static void delete(int[] arr) {
            int[] newarr = new int[arr.length - 1];
            for (int i = 0; i < arr.length - 1; i++) {
                newarr[i] = arr[i];
            }


            System.out.print(Arrays.toString(newarr));
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter size of an array");
            int size = sc.nextInt();
            System.out.println("Enter elements");
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            delete(arr);
        }
    }

