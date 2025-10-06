import java.util.Scanner;

public class reversearrfun {
    public static void array(int[] arr,int n)
    {
        for(int i=n-1;i>=0;i--)
            System.out.print(arr[i]+" ");
    }
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }
        array(arr,size);

    }
}


