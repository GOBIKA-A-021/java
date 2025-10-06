import java.util.Scanner;

public class highmark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 1;
        int studno=1;
        System.out.println("Enter a numbers of students");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter  the students " + i + " " + "marks");
            int m = sc.nextInt();
            if (m > max) {
                max = m;
                studno=i;

            }
        }

            System.out.println(" Student" + " " + studno+ " " + "scored high mark." + "Mark is:" + max);

        }


    }






