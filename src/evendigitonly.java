import java.util.Scanner;

public class evendigitonly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean even=true;
        while (num != 0) {
            int digit = num % 10;
            if (digit % 2 != 0)
            {
                even=false;
                System.out.println("No");
                break;
            }
             num /= 10;


        }if(even)
           System.out.println("Yes");

    }
}

