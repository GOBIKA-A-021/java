import java.util.Scanner;

public class studmarkcount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter the number of students");
        int n = sc.nextInt();
        System.out.println("Enter the number of students");
        for(int i=1;i<=n;i++)
        {
            int m=sc.nextInt();
            if(m>=40)
            {
                count++;
            }
        }
        System.out.println(count);



    }
}
