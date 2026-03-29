import java.util.*;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double usdToInr = 83.0;
        double eurToInr = 90.0;

        System.out.println("1. USD to INR");
        System.out.println("2. EUR to INR");

        System.out.print("Choose option: ");
        int choice = sc.nextInt();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        double result = 0;

        switch (choice) {
            case 1:
                result = amount * usdToInr;
                System.out.println("Converted: ₹" + result);
                break;

            case 2:
                result = amount * eurToInr;
                System.out.println("Converted: ₹" + result);
                break;

            default:
                System.out.println("Invalid option!");
        }

        sc.close();
    }
}
