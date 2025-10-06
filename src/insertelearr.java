import java.util.Scanner;

public class insertelearr {

       static void insertelement(int key,int pos,int[] arr,int[] newarr){
        for(int i=0,j=0;i<newarr.length;i++)
        {
            if(i==pos-1) {
                newarr[i] = key;
            }
            else {
                newarr[i] = arr[j];
                j++;
            }
        }
        for(int i=0;i<newarr.length;i++)
            System.out.print(newarr[i]+" ");
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
        System.out.println("Enter a element to insert");
        int key = sc.nextInt();
        System.out.println("Enter a position");
        int pos = sc.nextInt();
        int[] newarr = new int[size + 1];
        insertelement(key, pos, arr,newarr);
    }
}
