import java.util.Scanner;

public class arrsumfun {
    public static void array(int[] arr,int n)
    {   int sum=0;
        for(int i=0;i<n;i++)
            sum+=arr[i];
        System.out.print(sum);
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




