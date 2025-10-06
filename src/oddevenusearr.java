import java.util.Scanner;

public class oddevenusearr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int evenc=0;
        int oddc=0;

        int[] a = new int[51];
        for (int i = 1; i < a.length; i++) {
            a[i] = i;
        }
        System.out.println("Even Numbers");
        for (int i = 1; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
                evenc++;
            }
        }
        System.out.println();
        System.out.println("Odd Numbers");
        for (int i = 1; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                System.out.print(a[i] + " ");
                oddc++;
            }
        }
        System.out.println();
        System.out.println("Even count:"+evenc);
        System.out.println("Odd count:"+oddc);
    }



    }

