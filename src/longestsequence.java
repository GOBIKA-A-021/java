import java.util.Scanner;

public class longestsequence {
    public static void sequence(int[] arr)
    {

        int c=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i+1]==arr[i]+1)
                 c++;
        }
        System.out.println(c);


    }
    public static void main(String[] args)
    {
        int[] digits=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<digits.length;i++)
        {
            digits[i]=sc.nextInt();
        }
        sequence(digits);



    }
}
