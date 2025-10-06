import java.util.Scanner;

public class loaninterest {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double p = sc.nextDouble();
           double x = sc.nextInt();
            int month = 0;
            while (p > 0) {
               p -= x;
                month++;
                if(p<=0)
                    break;
                p +=p*0.01;

            }
                System.out.println(month +"months");

        }
}






