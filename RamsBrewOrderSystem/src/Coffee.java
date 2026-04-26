public class Coffee implements beverage{
    private String size;
    private String milk;
    private String sweetener;

    public Coffee(String size, String milk, String sweetener){
        this.size = size;
        this.milk = milk;
        this.sweetener = sweetener;
        this.shots = shots;
    }

    @Override
    public String getInfo(){
        return "Your Coffee is a " + size + "with " + shots + " shot(s) and " + milk + " milk, and " + sweetener;
    }

    @Override
    public double getCost() {
        double base;

        if (size.equalsIgnoreCase("Small")) {
            base = 2.00;
        } else if (size.equalsIgnoreCase("Medium")) {
            base = 2.50;
        } else {
            base = 3.00;
        }
        base += shots * 0.50; // shot cost
        return base;
    }
}
