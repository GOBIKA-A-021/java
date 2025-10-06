import java.util.Scanner;

public class productofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int prod=1;
        while(num!=0)
        {
            int digit=num%10;
            prod*=digit;
            num/=10;
        }
        System.out.println(prod);
    }

}
