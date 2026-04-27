import java.util.ArrayList;
import java.util.List;

public class Order {

    public enum ServiceType {
        DINE_IN("Dine In"),
        TAKE_OUT("Take Out"),
        DELIVERY("Delivery");

        private final String label;
        ServiceType(String label) { this.label = label; }
        public String getLabel()  { return label; }
    }

    private static int orderCounter = 1000;
    private int orderId;
    private String customerName;
    private ServiceType serviceType;
    private List<Beverage> beverages;

    public Order(String customerName, ServiceType serviceType) {
        this.orderId      = ++orderCounter;
        this.customerName = customerName;
        this.serviceType  = serviceType;
        this.beverages    = new ArrayList<>();
    }

    public void addBeverage(Beverage b) {
        beverages.add(b);
    }

    public double getTotal() {
        double total = 0.0;
        for (Beverage b : beverages) {
            total += b.getCost();
        }
        if (serviceType == ServiceType.DELIVERY) {
            total += 2.50;
        }
        return total;
    }

    public void printReceipt() {
        System.out.println();
        System.out.println("========== RAM'S BREW RECEIPT ==========");
        System.out.println("Order #:       " + orderId);
        System.out.println("Customer:      " + customerName);
        System.out.println("Service Type:  " + serviceType.getLabel());
        System.out.println("----------------------------------------");
        System.out.println("Items:");
        for (Beverage b : beverages) {
            System.out.println("  - " + b.getInfo());
            System.out.println("    Cost: $" + b.getCost());
        }
        System.out.println("----------------------------------------");
        if (serviceType == ServiceType.DELIVERY) {
            System.out.println("Delivery Fee:  $2.50");
        }
        System.out.println("TOTAL:         $" + getTotal());
        System.out.println("========================================");
        System.out.println();
    }

    public int getOrderId() {
        return orderId;
    }
    public String getCustomerName() {
        return customerName;
    }
    public ServiceType getServiceType() {
        return serviceType;
    }
    public List<Beverage> getBeverages() {
        return beverages;
    }
}
