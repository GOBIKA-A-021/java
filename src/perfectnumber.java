import java.util.Scanner;

public class perfectnumber {
    public static void perfect(int n)
    {   int sum=0;
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
              sum+=i;
            }
        }
        if(n==sum)
        {
            System.out.println("Perfect number");
        }
        else {
           System.out.println("Not a perfect number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        perfect(num);

    }
}
