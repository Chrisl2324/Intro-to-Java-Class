import java.util.Scanner;
public class Supermarket {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }
    public static double menu() {
        System.out.println("WELCOME TO THE SUPERMARKET!");
        System.out.println("-------------------------------------");
        System.out.println("MENU");
        System.out.println("-------------------------------------");
        System.out.println("1. DAIRY PRODUCTS");
        System.out.println("2. MEAT PRODUCTS");
        System.out.println("3. VEGETABLE PRODUCTS");
        System.out.println("4. BEVERAGE PRODUCTS");
        System.out.println("-------------------------------------");
        System.out.println("Enter your choice: ");
        System.out.println("-------------------------------------");
        int ch = scan.nextInt();
        return choices(ch);
    }
    public static double choices(double ch) {
        if (ch == 1) {
            System.out.println("DAIRY PRODUCTS");
        } else if (ch == 2) {
            System.out.println("MEAT PRODUCTS");
        } else if (ch == 3) {
            System.out.println("VEGETABLE PRODUCTS");
        } else if (ch == 4) {
            System.out.println("BEVERAGE PRODUCTS");
        } else {
            System.out.println("Error!");
        }
        System.out.println("----------------------------------------");
        System.out.print("Enter product: ");
        scan.nextLine();
        String product = scan.nextLine();
        System.out.print("Enter quantity: ");
        int quantity = scan.nextInt();
        System.out.print("Enter price: ");
        double price = scan.nextDouble();
        double amount = price * quantity;
        System.out.println("-------------------------------------------------------");
        System.out.printf("%s %15s %15s %15s", "ITEM", "QUANTITY", "PRICE", "AMOUNT");
        System.out.println("\n-------------------------------------------------------");
        System.out.printf("%s %15d %15.2f %15.2f", product, quantity, price, amount);
        return 0;

    }
}