import java.util.Scanner;

public class oddevenmaxmin {
    public static void evenmax(int[] arr)
    {   int emax=arr[0],emin=arr[0];
        int omax=arr[0],omin=arr[0];
        for(int i=0;i<arr.length;i++) {
            if (arr[i] % 2 == 0) {
                if (arr[i] > emax) {
                    emax = arr[i];
                }

                if (arr[i] < emin) {
                    emin = arr[0];
                }
            }
        }
        System.out.println("Even max:"+emax);
        System.out.println("Even min:"+emin);
        for(int i=0;i<arr.length;i++)

            {
                if(arr[i]%2!=0){
                if(arr[i]>omax) {

                    omax = arr[i];
                }

                 if(arr[i]<omin){
                        omin=arr[i];
                }
            }
            }


        System.out.println("Odd max:"+omax);
        System.out.println("Odd min:"+omin);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        evenmax(arr);
    }
}
