import java.util.*;
public class busticket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amt=0;
        System.out.println("Enter the number of pasengers");
        int n= sc.nextInt();
        System.out.println("Enter the pasengers age");
        for (int i = 1; i <= n; i++) {
            int age = sc.nextInt();
            if(age<12)
            {
                amt+=50;
            }
             else if (age>=12 && age<=59)
            {
                amt+=100;
            }
           else if (age>=60)
            {
                amt+=70;
            }
        }
        System.out.println("Total fare:"+amt);
    }
}
