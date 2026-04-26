public class Latte implements Beverage {
    private String size;
    private String milk;
    private String sweetener;

    public Latte(String size, String milk, String sweetener) {
        this.size = size;
        this.milk = milk;
        this.sweetener = sweetener;
    }

    @Override
    public String getInfo() {
        return "Your Latte is a " + size + " with " + milk + " milk and " + sweetener;
    }

    @Override
    public double getCost() {
        if (size.equalsIgnoreCase("Small")) return 3.00;
        else if (size.equalsIgnoreCase("Medium")) return 3.50;
        else return 4.00;
    }
}