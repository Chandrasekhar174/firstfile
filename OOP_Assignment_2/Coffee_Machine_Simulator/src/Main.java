import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        CoffeeMachine coffeeMachine = new CoffeeMachine();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Buy a coffee");
            System.out.println("2. Fill ingredients");
            System.out.println("3. Take money");
            System.out.println("4. Show ingredients");
            System.out.println("5. Show analytics");
            System.out.println("6. Exit");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the coffee type (Espresso/Latte/Cappuccino): ");
                    String coffeeType = scanner.next();
                    coffeeMachine.buyCoffee(coffeeType);
                    break;
                case 2:
                    System.out.print("Enter the amount of water to add (ml): ");
                    int addedWater = scanner.nextInt();
                    System.out.print("Enter the amount of milk to add (ml): ");
                    int addedMilk = scanner.nextInt();
                    System.out.print("Enter the amount of beans to add (g): ");
                    int addedBeans = scanner.nextInt();
                    coffeeMachine.fillIngredients(addedWater, addedMilk, addedBeans);
                    break;
                case 3:
                    coffeeMachine.takeMoney();
                    break;
                case 4:
                    coffeeMachine.showIngredients();
                    break;
                case 5:
                    coffeeMachine.showAnalytics();
                    break;
                case 6:
                    System.out.println("Exiting Coffee Machine Simulator.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }


    }
}