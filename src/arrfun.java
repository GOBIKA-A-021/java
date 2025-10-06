import java.io.*;
import java.util.*;
public class arrfun {
    public static void array(int[] arr,int n)
    {
      for(int i=0;i<n;i++)
          System.out.print(arr[i]+" ");
    }
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int j=0;j<size;j++) {
            arr[j]=sc.nextInt();
        }
        array(arr,size);

    }
}
