public class BeverageFactory {

    public static Beverage createBeverage(String type, String size, String milk, String sweetener, int shots, boolean iced) {
        if (type == null) {
            throw new IllegalArgumentException("Beverage type cannot be null");
        }

        switch (type.toLowerCase()) {
            case "coffee":
                return new Coffee(size, milk, sweetener, shots);
            case "latte":
                return new Latte(size, milk, sweetener, shots);
            case "cappuccino":
                return new Cappuccino(size, milk, sweetener, shots);
            case "tea":
                return new Tea(size, sweetener, iced);
            default:
                throw new IllegalArgumentException("Unknown beverage: " + type);
        }
    }
}
