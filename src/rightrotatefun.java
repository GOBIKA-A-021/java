import java.util.*;

public class rightrotatefun {
    public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};
            int rotateby = 2;
            rotateby = rotateby % arr.length;
            reverse(arr, 0, arr.length - 1);
            reverse(arr, 0, rotateby- 1);
            reverse(arr, rotateby, arr.length - 1);
            System.out.println(Arrays.toString(arr));
        }

        static void reverse(int arr[],int left,int right)
        {
            while(left<right)
            {
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }
    }


