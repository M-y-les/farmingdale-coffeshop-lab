public class Main {
    public static void main(String[] args) {
        Beverage coffee = new Coffee("Large", "Whole", "Sugar", 1);
        Beverage latte = new Latte("Medium", "Oat", "Honey", 2);
        Beverage cappuccino = new Cappuccino("Small", "Almond", "None", 2);
        Beverage tea = new Tea("Medium", "Honey", true);

        Beverage[] menu = {coffee, latte, cappuccino, tea};
        for (Beverage b : menu) {
            System.out.println(b.getInfo());
            System.out.println("  Cost: $" + b.getCost());
            System.out.println();
        }
    }
}