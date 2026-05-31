// God Class CheckoutProcessor
public class HorrificGodClass {

    public void processOrder(String itemName, int quantity, double price, String userType, String paymentMethod) {
        
        // 1. Calculate Total Math
        double total = price * quantity;

        // 2. Discount Logic (Spaghetti code waiting to happen)
        if (userType.equals("VIP")) {
            total = total * 0.80; // 20% off
            System.out.println("VIP Discount applied.");
        } else if (userType.equals("EMPLOYEE")) {
            total = total * 0.50; // 50% off
            System.out.println("Employee Discount applied.");
        } else {
            System.out.println("No discount applied.");
        }

        // 3. Payment Processing (Hardcoded dependencies)
        if (paymentMethod.equals("CREDIT_CARD")) {
            System.out.println("Connecting to Stripe API...");
            System.out.println("Charging $" + total + " to Credit Card.");
        } else if (paymentMethod.equals("PAYPAL")) {
            System.out.println("Redirecting to PayPal API...");
            System.out.println("Charging $" + total + " to PayPal account.");
        } else {
            throw new IllegalArgumentException("Unknown payment method");
        }

        // 4. Inventory Management
        System.out.println("Connecting to SQL Database...");
        System.out.println("EXECUTE: UPDATE inventory SET stock = stock - " + quantity + " WHERE item_name = '" + itemName + "'");

        // 5. Notifications
        System.out.println("Sending confirmation email to user...");
    }
}