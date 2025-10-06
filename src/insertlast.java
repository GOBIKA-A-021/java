import java.util.*;

public class insertlast {
    static void insertelement(int key,int[] arr){
        int[] newarr = new int[arr.length+ 1];
        for(int i=0;i<arr.length;i++){
            newarr[i]=arr[i];
        }
                newarr[arr.length] = key;


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
        System.out.println("Enter a value to insert");
        int key=sc.nextInt();
        insertelement( key,arr);
    }
}




