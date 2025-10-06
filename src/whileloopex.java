import java.util.Scanner;

public class whileloopex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=1;
        int sum=0;
       while(n>0) {
           n=sc.nextInt();
           if(n>0)
            sum+=n;
       }
       System.out.println(sum);
    }
}
