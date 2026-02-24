class Order {
    int orderId;
    String orderDate;

    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    void displayOrder() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
    }
}

class OnlineOrder extends Order {
    String deliveryAddress;

    OnlineOrder(int orderId, String orderDate, String deliveryAddress) {
        super(orderId, orderDate);
        this.deliveryAddress = deliveryAddress;
    }

    void displayOnlineOrder() {
        displayOrder();
        System.out.println("Delivery Address: " + deliveryAddress);
    }
}

class InternationalOrder extends OnlineOrder {
    double customDuty;

    InternationalOrder(int orderId, String orderDate, String deliveryAddress, double customDuty) {
        super(orderId, orderDate, deliveryAddress);
        this.customDuty = customDuty;
    }

    double calculateTotalWithDuty(double amount) {
        return amount + customDuty;
    }

    void displayInternationalOrder(double amount) {
        displayOnlineOrder();
        System.out.println("Custom Duty: " + customDuty);
        System.out.println("Total Amount with Duty: " + calculateTotalWithDuty(amount));
    }
}

public class ECommerceSystem {
    public static void main(String[] args) {
        InternationalOrder order = new InternationalOrder(1001, "13-02-2026", "Mumbai, India", 500);
        order.displayInternationalOrder(5000);
    }
}
