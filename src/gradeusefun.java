import java.util.Scanner;

public class gradeusefun {
    public static void sgrade(int m) {
        if (m >= 90)
            System.out.println("Grade:A");
        else if (m >= 80 && m <= 89)
            System.out.println("Grade:B");
        else if (m >= 70 && m <= 79)
            System.out.println("Grade:C");
        else if (m >= 60 && m <= 69)
            System.out.println("Grade:D");
        else
            System.out.println("Grade:F");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student average mark");
        int mark = sc.nextInt();
        sgrade(mark);

    }
}

