import java.util.Scanner;

public class vowelcount {
    public static void vowel(int n,Scanner sc) {
        int count=0;
        for(int i=1;i<=n;i++)
        {
            char c=sc.next().charAt(0);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
                count++;
        }
        System.out.println("Vowel count:"+count);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        vowel(num,sc);
    }
}
