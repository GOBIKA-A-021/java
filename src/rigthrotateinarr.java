import java.util.Arrays;

public class rigthrotateinarr {
    public static void right(int[] arr,int rotate)
    {
        for(int i=0;i<rotate;i++)
        {
            int temp=arr[arr.length-1];
            for(int j=arr.length-1;j>0;j--)
            {
                arr[j]=arr[j-1];
            }
            arr[0]=temp;
        }
        System.out.print(Arrays.toString(arr));
    }
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5,6};
        int rotate=2;
        right(arr,rotate);

    }
}

