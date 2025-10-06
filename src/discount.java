import java.util.Scanner;
public class discount{
    public static double applyDiscount(double bill) {
        if (bill < 1000) {
            return bill;
        } else if (bill <= 5000) {
            return bill - (bill * 0.10);
        } else if (bill <= 10000) {
            return bill - (bill * 0.20);
        } else {
            return bill - (bill * 0.30);
        }
    }
    public static double applyCoupon(double amount, String coupon) {
        if (coupon.equalsIgnoreCase("Diwali")) {
            return amount - (amount * 0.10);
        }
        return amount;
    }

    public static double addGST(double amount) {
        return amount + (amount * 0.18);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total bill amount: ");
        double bill = sc.nextDouble();

        double discountedAmount = applyDiscount(bill);

        System.out.print("Do you have a coupon code? (yes/no): ");
        String choice = sc.next();
        if (choice.equalsIgnoreCase("yes")) {
            System.out.print("Enter coupon code: ");
            String coupon = sc.next();
            discountedAmount = applyCoupon(discountedAmount, coupon);
        }


        double finalAmount = addGST(discountedAmount);

        System.out.println("Original Bill Amount: " + bill);
        System.out.println("After Discounts: " + discountedAmount);
        System.out.println("Final Amount to Pay (with GST): " + finalAmount);

    }
}
