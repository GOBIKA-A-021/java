import java.util.*;

public class linearsearcharr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] a = {5, 10, 15, 20, 15, 25};
        System.out.println("Enter a search element");
        int key = sc.nextInt();
        search(a, key);
    }

    public static void search(int[] a, int key) {
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                c++;
                System.out.println("Element is found at index: " + i);
            }
        }
        if (c > 0) System.out.println("Element found at " + c + " times");
        else System.out.println("Element not found");
    }
}

