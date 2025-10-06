import java.util.Scanner;

public class maxminelearrusefunc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        maxminelement(arr);
    }
    static void maxminelement(int[] arr) {
        int max = arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for(int i=0;i<arr.length;i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
            System.out.println("large is"+" "+max);
            System.out.println("small is"+" "+min);

    }

}
