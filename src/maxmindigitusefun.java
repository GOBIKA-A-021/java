import java.util.Scanner;

public class maxmindigitusefun {
    public static void maxmin(int n)
    {
        int max=0;int min=9;
        while(n!=0)
        {
            int digit=n%10;
            if(digit>max)
            {
                max=digit;
            }
            if(digit<min)
            {
                min=digit;
            }

            n/=10;
        }
        System.out.println("Largest;"+max);
        System.out.println("Smallest:"+min);

    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        maxmin(num);

}
}
