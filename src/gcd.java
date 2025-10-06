import java.util.*;
public class gcd {
        public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        gcdnum(a, b);
    }
        public static void gcdnum ( int n1, int n2) {
            int gcd = 1;
            int max=0;
            if(n1>n2)
                max=n1;
            else
                max=n2;
            for (int i = 1; i <max; i++) {
                if (n1 % i == 0 && n2 % i == 0) {
                    gcd = i;
                }
            }
            System.out.println("Gcd is:" + gcd);
        }



    }

