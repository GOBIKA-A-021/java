import java.util.Scanner;

public class bitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int n1=a&b;
        int n2=a|b;
        int n3=a^b;
        System.out.println("Bitwise AND:"+n1);
        System.out.println("Bitwise OR:"+n2);
        System.out.println("Bitwise XOR:"+n3);

    }
}
