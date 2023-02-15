import java.util.Scanner;
public class Restaurant {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
        double total = 0;
        double grand_total = 0;
        char again = 'y';
            while(again == 'y'){
                total = menu();
                grand_total += total;
                System.out.println("Enter more items: y/n");
                again = scan.next().charAt(0);
            }
        System.out.println("Your grand total is: " + grand_total);
    }

    public static double menu(){
        System.out.println("MENU");
        System.out.println("----------------------------------------");
        System.out.println("1.APPETIZER              2.MEAL");
        System.out.println("-----------------------------------------");
        System.out.println("1.Salad $2.50            1.Chicken $15.00");
        System.out.println("2.Wings $3.75            2.Steak $16.50");
        System.out.println("-----------------------------------------");
        System.out.println("Enter your choice: ");
        double ch = scan.nextDouble();
        return choice(ch);
    }

    public static double choice(double ch) {
        if(ch == 1) {
            double a = app();
            return a;
        }
        else if(ch == 2){
            double m = meal();
            return m;
        }
        else{
            System.out.println("Error!");
        }return 0;
    }
    public static double app(){
        double salad = 2.50;
        double wings = 3.75;
        System.out.println("Choose an appetizer: ");
        double ch = scan.nextInt();
        if(ch == 1){
            return salad;
        }
        else if(ch == 2){
            return wings;
        }
        else{
            System.out.println("Error!");
        }
        return 0;
    }
    public static double meal(){
        double chicken = 15.00;
        double steak = 16.50;
        System.out.println("Choose your meal: ");
        double ch = scan.nextDouble();
        if(ch == 1){
            return chicken;
        }
        else if(ch == 2){
            return steak;
        }
        else{
            System.out.println("Error!");
        }
        return 0;
    }
}
