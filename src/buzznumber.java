import java.util.Scanner;

public class buzznumber {
    public static void buzz(int n)
    {
        boolean f=false;
        while(n>0) {
                int d = n % 10;
                if(d==7 || n%7==0) {
                    f = true;
                    System.out.println("Buzz number");
                    break;
                }
                else {
                    System.out.println("Not a buzz number");
                    break;
                }

        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        buzz(num);
    }
}