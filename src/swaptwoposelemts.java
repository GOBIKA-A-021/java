import java.util.Scanner;

public class swaptwoposelemts {
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }
        int pos1=sc.nextInt();
        int pos2=sc.nextInt();
        swapelements(arr,pos1,pos2);
    }
    static void swapelements(int[] arr,int pos1,int pos2)
    {
        int temp=arr[pos1];
        arr[pos1]=arr[pos2];
        arr[pos2]=temp;
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");

    }
}
