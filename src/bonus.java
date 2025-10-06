import java.util.Scanner;

public class bonus {
    public static void main(String[] args) {
        double salary=20000;
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year>=10)
        {
            double totalamt=(salary*0.10)+salary;
            System.out.println("Bonus is"+" "+salary*0.10);
            System.out.println("salary is"+" "+totalamt);
        }
        else if(year>=5)
        {
            double totalamt=(salary*0.05)+salary;
            System.out.println("Bonus is"+" "+salary*0.05);
            System.out.println("salary is"+" "+totalamt);
        }
        else
            System.out.println("No Bonus salary only"+" "+salary);
}
}
