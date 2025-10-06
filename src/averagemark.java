import java.util.Scanner;

public class averagemark {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total=0;
        int avg=0;
        System.out.println("Enter a numbers of subjects");
        int n=sc.nextInt();
        System.out.println("Enter subjects marks");
        for(int i=0;i<n;i++) {

            int marks = sc.nextInt();
            total += marks;
        }
        avg=total/n;
        System.out.println(avg);



    }
}
