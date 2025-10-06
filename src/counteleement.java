import java.util.*;
public class counteleement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans1 = count(num);

        System.out.println(ans1);
        int ans2 = reverse(num);
        System.out.println(ans2);
        int ans3 = sumrev(num);
        System.out.println(ans3);
    }
    static int count(int n) {
        int count = 0;
        while (n != 0) {
            n/= 10;
            count++;
        }
        return count;
    }
     static int reverse(int n)
    {
        int rev=0;
        int digit=0;
        while(n!=0)
        {
            digit=n%10;
            rev=rev*10+digit;
        }
        return rev;
    }
     static int sumrev(int n) {
        int sum =0;
        while (n!= 0) {
            int digit = n % 10;
            sum += reverse(digit);
            n/= 10;
        }
        return sum;
    }









}
