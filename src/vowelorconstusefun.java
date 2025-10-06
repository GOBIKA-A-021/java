import java.util.Scanner;

public class vowelorconstusefun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = sc.next().charAt(0);
        result(ch);
    }
    public static void result(char c)
    {
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
        {
            System.out.println("Vowel");
        }
        else {
            System.out.println("Consonant");
        }

    }
}
