import java.util.Scanner;

public class leetvalidmountain {
        public static  boolean validMountainArray(int[] arr) {
            int n = arr.length;
            if(n<3){
                return false;
            }
            int i =0;

            while(i<n-1 && arr[i]<arr[i+1]){
                i++;
            }
            if(i==0 || i==n-1){
                return false;
            }
            while(i<n-1 && arr[i]>arr[i+1]){
                i++;
            }
            return i == n-1;
        }
    public static void main(String[] args)
    {
        int[] digits=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<digits.length;i++)
        {
            digits[i]=sc.nextInt();
        }
        boolean ans=validMountainArray(digits);
        System.out.println(ans);


    }
}

