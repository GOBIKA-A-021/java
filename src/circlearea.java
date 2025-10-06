import java.util.Scanner;
public class circlearea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        float res1=(float) (Math.PI*a*a);
        double res2=(double)res1;
        float res3=(float)res1;
        System.out.println("Float result:"+res1);
        System.out.println("Double result:"+res2);
        System.out.println("Double result:"+res3);

    }
}
