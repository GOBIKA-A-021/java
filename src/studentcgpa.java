import java.util.Scanner;

public class studentcgpa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int average = 0;
        int cgpa = 0;
        System.out.println("Enter the students marks");
        for (int i = 1; i <= 5; i++) {
            int m = sc.nextInt();

            total += m;
        }

            average = total / 5;
            cgpa = average / 10;


        System.out.println(cgpa);
    }
}






