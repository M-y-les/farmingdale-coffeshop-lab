public class Main {
    public static void main(String[] args) {
        System.out.println("Rams Brew Factory Demo");

        Order order1 = new Order("Myles Freelin", Order.ServiceType.DINE_IN);

        Beverage hotCoffee = BeverageFactory.createBeverage(
                "coffee", "Large", "Whole", "Sugar", 1, false);

        Beverage icedTea = BeverageFactory.createBeverage(
                "tea", "Medium", null, "Honey", 0, true);

        order1.addBeverage(hotCoffee);
        order1.addBeverage(icedTea);
        order1.printReceipt();

        Order order2 = new Order("Aidan Smith", Order.ServiceType.TAKE_OUT);

        Beverage icedLatte = BeverageFactory.createBeverage(
                "latte", "Large", "Oat", "Stevia", 2, true);

        order2.addBeverage(icedLatte);
        order2.printReceipt();

        Order order3 = new Order("Jack Mullins", Order.ServiceType.DELIVERY);

        Beverage cappuccino = BeverageFactory.createBeverage(
                "cappuccino", "Medium", "Almond", "None", 3, false);

        Beverage smallCoffee = BeverageFactory.createBeverage(
                "coffee", "Small", "Whole", "None", 1, false);

        order3.addBeverage(cappuccino);
        order3.addBeverage(smallCoffee);
        order3.printReceipt();
        }
}