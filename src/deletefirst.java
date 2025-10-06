
import java.util.*;
public class deletefirst {
    public static void delete(int[] arr){
        int[] newarr=new int[arr.length-1];
        for(int i=1;i<arr.length;i++)
        {
            newarr[i-1]=arr[i];
        }


        System.out.print(Arrays.toString(newarr));
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int size = sc.nextInt();
        System.out.println("Enter elements");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        delete( arr);
    }
}
