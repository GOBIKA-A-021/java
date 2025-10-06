import java.io.*;
public class rightrotate{
    public static void main(String[] args) {
            int[] arr={1,2,3,4,5};
            int rotateby=2;
            for(int i=0;i<rotateby;i++)
            {
                int temp=arr[arr.length-1];
                for(int j=arr.length-1;j>0;j--)
                {
                    arr[j]=arr[j-1];
                }
                arr[0]=temp;
            }
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }



