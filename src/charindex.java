import java.util.Scanner;

public class charindex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        int index=-1;
        if(c>='A' && c<='Z')
            index=c-'A';
        else if(c>='a' && c<='z')
            index=c-'a';
        if(index!=-1)
            System.out.println(c+":"+index);
        else
            System.out.println("Invalid character");

    }
}
