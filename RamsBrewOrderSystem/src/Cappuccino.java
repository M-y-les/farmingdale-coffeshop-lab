public class Cappuccino implements Beverage {
    private String size;
    private String milk;
    private String sweetener;
    private int shots;

    public Cappuccino(String size, String milk, String sweetener, int shots) {
        this.size = size;
        this.milk = milk;
        this.sweetener = sweetener;
        this.shots = shots;
    }

    @Override
    public String getInfo() {
        return "Your Cappuccino is a " + size + " with " + shots + " shot(s) and "
                + milk + " milk, and " + sweetener;
    }

    @Override
    public double getCost() {
        double base;
        if (size.equalsIgnoreCase("Small")) {
            base = 3.25;
        } else if (size.equalsIgnoreCase("Medium")) {
            base = 3.75;
        } else {
            base = 4.25;
        }
        base += shots * 0.50; // shot cost
        return base;
    }
}