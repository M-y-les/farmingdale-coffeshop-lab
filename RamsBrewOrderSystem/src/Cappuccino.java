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