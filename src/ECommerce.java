import java.util.Scanner;

class Product {
    public static void laptop(Cart obj) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the product:");
        System.out.println("1. Apple   cost - 59000");
        System.out.println("2. lenovo    cost - 50000");
        System.out.println("3. dell    cost - 54000");
        System.out.println("4. hp    cost - 57000");
        System.out.println("5. ACER    cost - 45000");

        int opt = sc.nextInt();
        int cost = 0;

        if (opt == 1) cost = 59000;
        else if (opt == 2) cost = 50000;
        else if (opt == 3) cost = 54000;
        else if (opt == 4) cost = 57000;
        else if (opt == 5) cost = 45000;
        else {
            System.out.println("Invalid option");
            return;
        }

        System.out.println("Product Details: Do you want to buy (1) or Add to cart (2)?");
        int n = sc.nextInt();

        if (n == 1) {
            obj.checkout(cost);
        } else if (n == 2) {
            obj.addToCart(cost);
            System.out.println("Total items in your cart: " + obj.getCartCount());
            System.out.println("Your bill: " + cost);
        } else {
            System.out.println("Invalid input");
        }
    }
}

class Cart {
    private int itemCount = 0;
    private int totalCost = 0;

    public void addToCart(int cost) {
        itemCount++;
        totalCost += cost;
    }

    public int getCartCount() {
        return itemCount;
    }

    public void checkout(int cost) {
        System.out.println("Your bill: " + cost);
    }

    public int getTotalCost() {
        return totalCost;
    }
}

public class ECommerce {
    public static void main(String[] args) {
        Cart obj = new Cart();
        Product.laptop(obj);
    }
}