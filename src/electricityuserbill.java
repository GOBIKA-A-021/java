import java.util.Scanner;

public class electricityuserbill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Domestic");
        System.out.println("2.Commercial");
        System.out.println("3.Industrial");
        System.out.print("Enter consumer type : ");
        int choice = sc.nextInt();
        System.out.println("Enter units");
        int units = sc.nextInt();
        int bill=0;
        switch(choice)
        {
            case 1:{
                bill=units*3;
                break;
            }
            case 2:
            {
                bill=units*5;
                break;
            }
            case 3:
            {
                bill=units*8;
                break;
            }
            default:
                System.out.println("Enter correct choice");
        }
        System.out.println("Bill:"+bill);
    }
}
