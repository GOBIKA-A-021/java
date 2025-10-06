import java.util.*;

public class deletearrele {
        public static void delete(int pos, int[] arr) {
            if (pos < 1 || pos > arr.length) {
                System.out.println("Invalid position");
            }

            int[] newarr = new int[arr.length - 1];

            for (int i = 0, j = 0; i < arr.length; i++) {
                if (i == pos - 1) {
                    continue;
                }
                newarr[j] = arr[i];
                j++;
            }

            System.out.println("Array after deletion: " + Arrays.toString(newarr));
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

            System.out.println("Enter a position to delete:");
            int pos = sc.nextInt();

            delete(pos, arr);
        }
    }


