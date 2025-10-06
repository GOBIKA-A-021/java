import java.util.*;
public class hotcoldtemperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        System.out.println("Enter temperatures for 7 days:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
            temp(arr);

    }
        public static void temp(int[] arr){
            int max = arr[0], min = arr[0];
            int sum = 0;
            for (int i=0;i<arr.length;i++) {
                sum += arr[i];
                if (arr[i] > max)
                    max = arr[i];
                if (arr[i] < min)
                    min = arr[i];
            }

        double average = sum / 7;
        System.out.println("Hottest day temperature: " + max);
        System.out.println("Coldest day temperature: " + min);
        System.out.printf("Average temperature of the week: %.2f\n", average);

    }
}
