public class Main {
    public static void main(String[] args) {
        System.out.println("===== Ram's Brew - Commit 2: Factory Demo =====");
        System.out.println();

        Beverage coffee = BeverageFactory.createBeverage(
                "coffee", "Large", "Whole", "Sugar", 1, false);

        Beverage latte = BeverageFactory.createBeverage(
                "latte", "Medium", "Oat", "Honey", 2, true);

        Beverage cappuccino = BeverageFactory.createBeverage(
                "cappuccino", "Small", "Almond", "None", 2, false);

        Beverage tea = BeverageFactory.createBeverage(
                "tea", "Medium", null, "Honey", 0, true);

        Beverage[] menu = { coffee, latte, cappuccino, tea };
        for (Beverage b : menu) {
            System.out.println(b.getInfo());
            System.out.println("  Cost: $" + b.getCost());
            System.out.println();
        }
        }
}