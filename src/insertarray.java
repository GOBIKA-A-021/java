import java.util.Scanner;

public class insertarray {
    static int[] insertelement(int key, int pos, int[] arr) {
            int[] newarr = new int[arr.length + 1];


            for (int i = 0; i < pos - 1; i++) {
                newarr[i] = arr[i];
            }


            newarr[pos - 1] = key;


            for (int i = pos; i < newarr.length; i++) {
                newarr[i] = arr[i - 1];
            }

            return newarr;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter size of an array");
            int size = sc.nextInt();
            int[] arr = new int[size];

            System.out.println("Enter elements");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println("Enter an element to insert");
            int key = sc.nextInt();
            System.out.println("Enter a position");
            int pos = sc.nextInt();

            int[] newarr = insertelement(key, pos, arr);

            System.out.println("Array after insertion:");
            for (int val : newarr) {
                System.out.print(val + " ");
            }
        }
    }
