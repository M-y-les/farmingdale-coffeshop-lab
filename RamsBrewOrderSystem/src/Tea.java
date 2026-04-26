public class Tea implements Beverage {
    private String size;
    private String sweetener;
    private boolean iced;

    public Tea(String size, String sweetener, boolean iced) {
        this.size = size;
        this.sweetener = sweetener;
        this.iced = iced;
    }

    @Override
    public String getInfo() {
        return "Your " + (iced ? "Iced" : "Hot") + " Tea is a " + size
                + " with " + sweetener;
    }

    @Override
    public double getCost() {
        double base;
        if (size.equalsIgnoreCase("Small")) {
            base = 1.75;
        } else if (size.equalsIgnoreCase("Medium")) {
            base = 2.25;
        } else {
            base = 2.75;
        }
        return base;
    }
}

