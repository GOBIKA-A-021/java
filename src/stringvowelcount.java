import java.util.Scanner;

public class stringvowelcount {
    public static void count(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        System.out.println("Vowel count:" + count);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String word=sc.nextLine().toLowerCase();
        count(word);
    }
}
