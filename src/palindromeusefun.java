import java.util.Scanner;

public class palindromeusefun {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        palin(num);
    }
    public static void palin(int n)
    {
        int original=n;
        int revnum=0;
        while(n!=0)
        {
            int digit=n%10;
            revnum=revnum*10+digit;
            n/=10;
        }
        if(original==revnum)
        {
            System.out.println("palindrome");
        }
        else {
            System.out.println(" Not a palindrome");
        }

    }
}
