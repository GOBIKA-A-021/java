import java.util.*;

public class merge2arrays {
    public static void merge(int[] a1,int[] a2,int[] a3)
    {   int index=a1.length;
        for(int i=0;i<a1.length;i++)
        {
            a3[i]=a1[i];
        }
        for(int j=0;j<a2.length;j++)
        {
            a3[index]=a2[j];
            index++;
        }
        System.out.print(Arrays.toString(a3));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a1 = new int[4];
        System.out.println("Enter array 1 elements");
        for (int i = 0; i < a1.length; i++) {
            a1[i] = sc.nextInt();
        }
        int[] a2=new int[5];
        System.out.println("Enter array 2 elements");
        for (int i = 0; i < a2.length; i++) {
            a2[i] = sc.nextInt();
        }
        int n=a1.length+a2.length;
        int[] a3=new int[n];
        merge(a1,a2,a3);
    }
}
