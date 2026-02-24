abstract class FoodOrder {
    int orderId;
    String customerName;
    double amount;

    FoodOrder(int orderId, String customerName, double amount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.amount = amount;
    }

    void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Base Amount: " + amount);
    }

    abstract double calculateBill();
}

class DineInOrder extends FoodOrder {
    int tableNumber;
    double serviceCharge = 50;

    DineInOrder(int orderId, String customerName, double amount, int tableNumber) {
        super(orderId, customerName, amount);
        this.tableNumber = tableNumber;
    }

    double calculateBill() {
        return amount + serviceCharge;
    }

    void displayDineInDetails() {
        displayOrderDetails();
        System.out.println("Table Number: " + tableNumber);
        System.out.println("Total Bill (with Service Charge): " + calculateBill());
    }
}

class TakeAwayOrder extends FoodOrder {
    double packingCharge;

    TakeAwayOrder(int orderId, String customerName, double amount, double packingCharge) {
        super(orderId, customerName, amount);
        this.packingCharge = packingCharge;
    }

    double calculateBill() {
        return amount + packingCharge;
    }

    void displayTakeAwayDetails() {
        displayOrderDetails();
        System.out.println("Packing Charge: " + packingCharge);
        System.out.println("Total Bill: " + calculateBill());
    }
}

class OnlineOrder extends FoodOrder {
    double deliveryCharge;

    OnlineOrder(int orderId, String customerName, double amount, double deliveryCharge) {
        super(orderId, customerName, amount);
        this.deliveryCharge = deliveryCharge;
    }

    double calculateBill() {
        return amount + deliveryCharge;
    }

    void displayOnlineDetails() {
        displayOrderDetails();
        System.out.println("Delivery Charge: " + deliveryCharge);
        System.out.println("Total Bill: " + calculateBill());
    }
}

public class Foodorderingsystem {
    public static void main(String[] args) {

        DineInOrder dineIn = new DineInOrder(1,"Rajesh", 500, 10);
        TakeAwayOrder takeAway = new TakeAwayOrder(2, "Amit",400, 30);
        OnlineOrder online = new OnlineOrder(3, "Priya",600, 50);

        dineIn.displayDineInDetails();
        System.out.println();

        takeAway.displayTakeAwayDetails();
        System.out.println();

        online.displayOnlineDetails();
    }
}
