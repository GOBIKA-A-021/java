import java.util.Scanner;

public class ticketfare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amt=0;
        System.out.println("Enter a numbers of passengers");
        int n = sc.nextInt();
        System.out.println("Enter  the passengers age");
        for (int i = 1; i <= n; i++)
        {
            int age=sc.nextInt();
            if(age<5)
            {
                amt+=0;
            }
            else if(age>=5 && age<=59)
            {
                amt+=100;
            }
            else if(age>=60)
            {
                amt+=50;
            }
        }
        int totalamt=amt;
        System.out.println("Total fare:"+totalamt);
    }
}
