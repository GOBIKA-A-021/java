import java.util.Scanner;

public class rollnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {

            System.out.print(i);
            if(i!=5)

                  System.out.print(",");
        }
    }
}
