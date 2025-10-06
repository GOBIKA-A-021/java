import java.util.Scanner;

public class charlowtoupper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        if(c>='A' && c<='Z') {
            System.out.println(c + ":" + Character.toLowerCase(c));
        }
        else {
            System.out.println(c + ":" + Character.toUpperCase(c));
        }
    }
}
