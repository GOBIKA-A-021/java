import java.util.Scanner;

public class itemsprice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
           System.out.println("Enter price");
            double price = sc.nextDouble();
            System.out.println("Enter number of items");
            int itemnum = sc.nextInt();
            double totalamt=itemnum * price;
            System.out.println(totalamt);
        }
    }










