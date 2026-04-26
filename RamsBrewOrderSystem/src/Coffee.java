public class Coffee implements beverage{
    private String size;
    private String milk;
    private String sweetener;

    public Coffee(String size, String milk, String sweetener){
        this.size = size;
        this.milk = milk;
        this.sweetener = sweetener;
    }

    @Override
    public String getInfo(){
        return size + "Your coffee contains: " + milk + " milk and " + sweetener;;
    }

    @Override
    public double getCost() {
        if (size.equalsIgnoreCase("Small")) {
            return 2.00;
        } else if (size.equalsIgnoreCase("Medium")) {
            return 2.50;
        } else {
            return 3.00; // large
        }
    }






}
