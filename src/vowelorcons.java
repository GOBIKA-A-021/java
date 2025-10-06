import java.util.Scanner;

public class vowelorcons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.nextLine().charAt(0);
        if (Character.isAlphabetic(c)) {
            if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U')
                System.out.println("Vowel");
            else
                System.out.println("Consonant");
        }
        else
            System.out.println("Invalid character");
    }
}