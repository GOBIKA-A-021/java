import java.util.Scanner;

public class celsiustofarenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cel = sc.nextInt();
        int far=(9/5*cel)+32;
        System.out.println("Fahrenheit:"+far);
    }
}
