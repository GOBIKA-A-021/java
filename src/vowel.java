import java.util.Scanner;

public class vowel {
    public static void count(String str) {
        int count = 0;
        int num = 0;
        int ac = 0, ec = 0, ic = 0, oc = 0, uc = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a')
                ac++;
            count++;

            if (ac == 2 || ec == 2 || ic == 2 || oc == 2 || uc == 2) {
                count++;
            }
        }

            System.out.println("Vowel count:" + num);


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String word=sc.nextLine().toLowerCase();
        count(word);
    }
}


