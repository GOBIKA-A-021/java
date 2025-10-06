import java.util.*;
public class passfailcount {

        public static void mark(int[] arr){
        int passc=0,failc=0;
        for(int i=0;i<arr.length;i++) {
            if (arr[i] >= 35) {
                passc++;
            } else {
                failc++;
            }
        }


            System.out.println("Number of students passed: " + passc);
            System.out.println("Number of students failed: " + failc);

        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        System.out.println("Enter marks of 8 students:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        mark(arr);
    }
    }

