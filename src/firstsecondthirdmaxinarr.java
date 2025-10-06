import java.util.*;

public class firstsecondthirdmaxinarr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        maxelement(arr);
    }
    static void maxelement(int[] arr) {

        Arrays.sort(arr);
        int max = arr[0];
        int secondmax=arr[1];
        int thirdmax=arr[2];
        for(int i=0;i<arr.length;i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for(int i=0;i<arr.length;i++) {
                if (arr[i] > secondmax) {
                    secondmax = arr[i - 1];
                }
            }
        for(int i=0;i<arr.length;i++) {
            if (arr[i] > thirdmax) {
                thirdmax=arr[i-2];
            }
        }
        System.out.println("large is"+" "+max);
        System.out.println("Secondlarge is"+" "+secondmax);
        System.out.println("Thirdlarge is"+" "+thirdmax);


    }

}
