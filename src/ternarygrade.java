import java.util.Scanner;

public class ternarygrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char ans = (a > 80) ? 'A' : (a > 70) ? 'B' : (a > 60) ? 'C' : 'D';
        System.out.println(ans);
    }
}

