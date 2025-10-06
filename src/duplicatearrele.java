import java.util.*;
public class duplicatearrele {
    public static void duplicate(int[] a){
        //int count=0;

        for(int i=0;i<a.length;i++) {
            boolean f=false;
            if (a[i] == -1)
                continue;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    f=true;
                    //count++;
                    a[j] = -1;
                }

            }

            if (f) {
                System.out.println("Duplicate element:" + a[i]);
            }
        }

        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=-1){
                System.out.print(a[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of elements in array");
        int size=sc.nextInt();
        int[] a=new int[size];
        System.out.println("Enter the elements of array");
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        duplicate(a);
    }
}


