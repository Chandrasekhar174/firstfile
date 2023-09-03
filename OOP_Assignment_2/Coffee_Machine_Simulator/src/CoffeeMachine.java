public class CoffeeMachine {
    private int water;
    private int milk;
    private int beans;
    private int money;
    private int espressoPrice = 4;
    private int lattePrice = 7;
    private int cappuccinoPrice = 6;
    private int espressoWater = 250;
    private int espressoMilk = 0;
    private int espressoBeans = 16;
    private int latteWater = 350;
    private int latteMilk = 75;
    private int latteBeans = 20;
    private int cappuccinoWater = 200;
    private int cappuccinoMilk = 100;
    private int cappuccinoBeans = 12;
    private int espressoCount = 0;
    private int latteCount = 0;
    private int cappuccinoCount = 0;
    private int earnings = 0;

    public CoffeeMachine() {
        this.water = 0;
        this.milk = 0;
        this.beans = 0;
        this.money = 0;
    }
    public void buyCoffee(String coffeeType) {
        if ("espresso".equalsIgnoreCase(coffeeType)) {
            if (hasIngredients(espressoWater, espressoMilk, espressoBeans)) {
                dispenseCoffee(coffeeType, espressoPrice, espressoWater, espressoMilk, espressoBeans);
                espressoCount++;
            } else {
                System.out.println("Error: Not enough ingredients to make Espresso.");
            }
        } else if ("latte".equalsIgnoreCase(coffeeType)) {
            if (hasIngredients(latteWater, latteMilk, latteBeans)) {
                dispenseCoffee(coffeeType, lattePrice, latteWater, latteMilk, latteBeans);
                latteCount++;
            } else {
                System.out.println("Error: Not enough ingredients to make Latte.");
            }
        }else if ("cappuccino".equalsIgnoreCase(coffeeType)) {
            if (hasIngredients(cappuccinoWater, cappuccinoMilk, cappuccinoBeans)) {
                dispenseCoffee(coffeeType, cappuccinoPrice, cappuccinoWater, cappuccinoMilk, cappuccinoBeans);
                cappuccinoCount++;
            } else {
                System.out.println("Error: Not enough ingredients to make Cappuccino.");
            }
        } else {
            System.out.println("Invalid coffee type.");
        }
    }
    private void dispenseCoffee(String coffeeType, int price, int waterNeeded, int milkNeeded, int beansNeeded) {
        System.out.println("Dispensing " + coffeeType + "...");
        water -= waterNeeded;
        milk -= milkNeeded;
        beans -= beansNeeded;
        money += price;
        earnings += price;
        System.out.println("Enjoy your " + coffeeType + "!");
    }
    private boolean hasIngredients(int waterNeeded, int milkNeeded, int beansNeeded) {
        return water >= waterNeeded && milk >= milkNeeded && beans >= beansNeeded;
    }
    public void fillIngredients(int addedWater, int addedMilk, int addedBeans) {
        water += addedWater;
        milk += addedMilk;
        beans += addedBeans;
    }
    public void takeMoney() {
        System.out.println("Taking money: $" + money);
        money = 0;
    }
    public void showIngredients() {
        System.out.println("Ingredients Available:");
        System.out.println("Water: " + water + " ml");
        System.out.println("Milk: " + milk + " ml");
        System.out.println("Beans: " + beans + " g");
        System.out.println("Money in the Money Box: $" + money);
    }
    public void showAnalytics() {
        System.out.println("Coffee Machine Analytics:");
        System.out.println("Espresso sold: " + espressoCount);
        System.out.println("Latte sold: " + latteCount);
        System.out.println("Cappuccino sold: " + cappuccinoCount);
        System.out.println("Total earnings: $" + earnings);
        System.out.println("Ingredients consumed:");
        System.out.println("Water: " + (espressoCount * espressoWater + latteCount * latteWater + cappuccinoCount * cappuccinoWater) + " ml");
        System.out.println("Milk: " + (espressoCount * espressoMilk + latteCount * latteMilk + cappuccinoCount * cappuccinoMilk) + " ml");
        System.out.println("Beans: " + (espressoCount * espressoBeans + latteCount * latteBeans + cappuccinoCount * cappuccinoBeans) + " g");
    }
}
