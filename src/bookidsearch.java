import java.util.*;
public class bookidsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[4];
        System.out.println("Enter 100 book IDs:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter book ID to search: ");
        int searchID = sc.nextInt();
        searchid(a, searchID);
    }
    public static void searchid(int[] a,int searchID){
        boolean found = false;

        for (int i=0;i<a.length;i++) {
            if (a[i] == searchID) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Book ID " + searchID + " is available.");
        } else {
            System.out.println("Book ID " + searchID + " is not available.");
        }

        Arrays.sort(a);
        System.out.println("Book IDs in ascending order:");
            System.out.print(Arrays.toString(a));

    }

    }
