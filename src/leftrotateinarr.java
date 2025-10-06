import java.util.*;
public class leftrotateinarr {
    public static void left(int[] arr,int rotate)
    {
        for(int i=0;i<rotate;i++)
        {
            int temp=arr[0];
            for(int j=0;j<arr.length-1;j++)
            {
                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=temp;
        }
        System.out.print(Arrays.toString(arr));
    }
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5,6};
        int rotate=2;
        left(arr,rotate);

    }
}
