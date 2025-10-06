import java.util.*;

public class copyarrele {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        System.out.println("Enter array elements");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print(Arrays.toString(a));
        copy(a);
    }
    public static void copy(int[] a)
    {
        int[] newa=new int[a.length];
        for(int i=0,j=0;i<newa.length;i++){
            newa[i]=a[j];
            j++;
        }
        System.out.println();
        System.out.println("Copied Array");
        System.out.print(Arrays.toString(newa));


    }
}
