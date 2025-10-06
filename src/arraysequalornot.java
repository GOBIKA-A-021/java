import java.util.Scanner;

public class arraysequalornot {
    public static void equal(int[] a1,int[] a2)
    {
        int n1=a1.length;
        int n2=a2.length;
        int c=0;
        if(n1==n2) {
            for (int i = 0; i < n1; i++) {

                if (a1[i] == a2[i]) {
                    c++;


                } else {
                    c--;

                }
            }
            if(c==n1)
            {
                System.out.println("Equal");
            }
            else {
                System.out.println("Not Equal");
            }
        }
        else
        {
            System.out.println("Arrays length not equal");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a1 = new int[4];
        System.out.println("Enter array 1 elements");
        for (int i = 0; i < a1.length; i++) {
            a1[i] = sc.nextInt();
        }
        int[] a2 = new int[4];
        System.out.println("Enter array 2 elements");
        for (int i = 0; i < a2.length; i++) {
            a2[i] = sc.nextInt();
        }
        equal(a1,a2);
    }
}